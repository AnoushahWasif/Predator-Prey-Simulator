package com.yourdomain.predatorprey.controller;

import com.yourdomain.predatorprey.model.Ecosystem;
import com.yourdomain.predatorprey.view.MainFrame;

public class SimulationController {
    private Ecosystem ecosystem;
    private MainFrame mainFrame;

    public SimulationController() {
        ecosystem = new Ecosystem();
        mainFrame = new MainFrame();
        // Initialize and add animals to the ecosystem
    }

    public void startSimulation() {
        while (true) {
            ecosystem.simulate();
            mainFrame.updateChart();
            // Add a delay or manage simulation time
        }
    }
}
