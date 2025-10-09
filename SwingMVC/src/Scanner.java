import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class ScannerDevice {
    private JButton scanButton;
    private Controller controller;
    private List<String> upcList = new ArrayList<>();
    private Random rand = new Random();

    public ScannerDevice(Controller controller, String productFile) {
        this.controller = controller;
        loadUPCs(productFile);

        JFrame frame = new JFrame("Scanner");
        scanButton = new JButton("Scan");

        scanButton.addActionListener(e -> {
            if (upcList.isEmpty()) {
                System.out.println("No UPCs found!");
                return;
            }
            String randomUPC = upcList.get(rand.nextInt(upcList.size()));
            System.out.println("Scanned: " + randomUPC);
            controller.handleScan(randomUPC);
        });

        frame.add(scanButton);
        frame.setSize(150, 100);
        frame.setLocation(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private void loadUPCs(String fileName) {
        try (Scanner fileScan = new Scanner(new File(fileName))) {
            while (fileScan.hasNext()) {
                String upc = fileScan.next();
                fileScan.next();
                fileScan.nextDouble();
                upcList.add(upc);
            }
        } catch (Exception e) {
            System.out.println("Error reading UPCs: " + e.getMessage());
        }
    }
}
