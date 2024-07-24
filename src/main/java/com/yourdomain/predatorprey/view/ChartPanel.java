package com.yourdomain.predatorprey.view;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.JPanel;

public class ChartPanel extends JPanel {
    private JFreeChart chart;
    private XYSeries series;

    public ChartPanel() {
        series = new XYSeries("Population");
        XYSeriesCollection dataset = new XYSeriesCollection(series);
        chart = ChartFactory.createXYLineChart(
                "Population Over Time",
                "Time",
                "Population",
                dataset
        );

        this.add(new org.jfree.chart.ChartPanel(chart));
    }

    public void updateChart() {
        // Update chart data here
    }
}
