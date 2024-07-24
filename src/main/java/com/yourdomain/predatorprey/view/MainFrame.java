package com.yourdomain.predatorprey.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    private ChartPanel chartPanel;

    public MainFrame() {
        setTitle("Predator-Prey Simulator");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chartPanel = new ChartPanel();
        add(chartPanel, BorderLayout.CENTER);
    }

    public void updateChart() {
        chartPanel.updateChart();
    }
}
