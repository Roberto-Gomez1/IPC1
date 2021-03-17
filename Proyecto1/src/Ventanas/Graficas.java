package Ventanas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Graficas extends JFrame {
    JPanel panel;
    
    public Graficas(int mujeres, int hombres) {
        setTitle("Como Hacer Graficos con Java");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }

    private void init() {
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Mujeres", 50);
        data.setValue("Hombres", 10);

        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
                "Genero de profesores",
                data,
                true,
                true,
                false);

        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
    }

    public static void main(String args[]) {
        new Ventana().setVisible(true);
    }
}
