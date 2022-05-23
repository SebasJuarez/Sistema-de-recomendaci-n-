import java.util.*;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        Brand_1 = new javax.swing.JComboBox<>();
        Text_1 = new javax.swing.JLabel();
        Brand_2 = new javax.swing.JComboBox<>();
        Brand_3 = new javax.swing.JComboBox<>();
        Text_2 = new javax.swing.JLabel();
        Text_3 = new javax.swing.JLabel();
        Text_4 = new javax.swing.JLabel();
        Min_Slider_K = new javax.swing.JSlider();
        Max_Slider_K = new javax.swing.JSlider();
        Min_Range = new javax.swing.JLabel();
        Max_Range = new javax.swing.JLabel();
        Max_Slider = new javax.swing.JSlider();
        Text_5 = new javax.swing.JLabel();
        Text_6 = new javax.swing.JLabel();
        Min_Slider = new javax.swing.JSlider();
        Min_Range1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("0"); // NOI18N

        Title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Autoganga");
        Title.setMaximumSize(new java.awt.Dimension(750, 750));
        Title.setMinimumSize(new java.awt.Dimension(0, 0));
        Title.setPreferredSize(new java.awt.Dimension(300, 65));

        Brand_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Brand_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_1.setName("0"); // NOI18N
        Brand_1.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_1.setText("Seleccione sus marcas de autos favoritas:");
        Text_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_1.setName("0"); // NOI18N
        Text_1.setPreferredSize(new java.awt.Dimension(300, 16));

        Brand_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Brand_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_2.setName("0"); // NOI18N
        Brand_2.setPreferredSize(new java.awt.Dimension(150, 20));

        Brand_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Brand_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_3.setName("0"); // NOI18N
        Brand_3.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_2.setText("Seleccione su presupuesto: ( 5,000$ - 1,000,000$ )");
        Text_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_2.setName("0"); // NOI18N
        Text_2.setPreferredSize(new java.awt.Dimension(300, 16));

        Text_3.setText("min (k)");
        Text_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_3.setName("0"); // NOI18N
        Text_3.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_3.setRequestFocusEnabled(false);

        Text_4.setText("max (k)");
        Text_4.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_4.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_4.setName("0"); // NOI18N
        Text_4.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_4.setRequestFocusEnabled(false);

        Min_Slider_K.setValue(0);
        Min_Slider_K.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Slider_K.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Slider_K.setPreferredSize(new java.awt.Dimension(200, 15));

        Max_Slider_K.setValue(100);
        Max_Slider_K.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Slider_K.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Slider_K.setPreferredSize(new java.awt.Dimension(200, 15));

        Min_Range.setText("5,000");
        Min_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range.setRequestFocusEnabled(false);

        Max_Range.setText("1,000,000");
        Max_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Max_Range.setRequestFocusEnabled(false);

        Max_Slider.setValue(100);
        Max_Slider.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Slider.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Slider.setPreferredSize(new java.awt.Dimension(200, 15));

        Text_5.setText("min");
        Text_5.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_5.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_5.setName("0"); // NOI18N
        Text_5.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_5.setRequestFocusEnabled(false);

        Text_6.setText("max");
        Text_6.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_6.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_6.setName("0"); // NOI18N
        Text_6.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_6.setRequestFocusEnabled(false);

        Min_Slider.setValue(0);
        Min_Slider.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Slider.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Slider.setPreferredSize(new java.awt.Dimension(200, 15));

        Min_Range1.setText("-");
        Min_Range1.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range1.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range1.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range1.setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Text_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Text_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Brand_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Brand_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Brand_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min_Slider_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Text_4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Max_Slider_K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Text_6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                .addComponent(Text_5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Max_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Min_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Text_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brand_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brand_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brand_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Slider_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Slider_K, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodos
    
    public float getMinSlider_K(){
        float Min;
        Min = Min_Slider_K.getValue();
        return Min;
    }
    
    public float getMaxSlider_K(){
        float Max;
        Max = Max_Slider_K.getValue();
        return Max;
    }
    
    public float getMinSlider(){
        float Min;
        Min = Min_Slider.getValue();
        return Min;
    }
    
    public float getMaxSlider(){
        float Max;
        Max = Max_Slider.getValue();
        return Max;
    }
    
    public void setMinValue(int Min){
        String Value;
        Value = String.format("%,d", Min);
        Min_Range.setText(Value);
    }
    
    public void setMaxValue(int Max){
        String Value;
        Value = String.format("%,d", Max);
        Max_Range.setText(Value);
    }
    //Settear las marcas
    public void setManufacturers(String[] Manufacturers){
        Brand_1.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
        Brand_2.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
        Brand_3.setModel(new javax.swing.DefaultComboBoxModel<>(Manufacturers));
    }
    //eliminar marca de otros selectores si ya fue elegida
    public void ManufacturerChange(String Selected1, String Selected2, String Selected3){ 
        //Brand_1.setModel(new javax.swing.DefaultComboBoxModel<>(Selected1));
        //Brand_2.setModel(new javax.swing.DefaultComboBoxModel<>(Selected2));
        //Brand_3.setModel(new javax.swing.DefaultComboBoxModel<>(Selected3));
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Brand_1;
    private javax.swing.JComboBox<String> Brand_2;
    private javax.swing.JComboBox<String> Brand_3;
    private javax.swing.JLabel Max_Range;
    private javax.swing.JSlider Max_Slider;
    private javax.swing.JSlider Max_Slider_K;
    private javax.swing.JLabel Min_Range;
    private javax.swing.JLabel Min_Range1;
    private javax.swing.JSlider Min_Slider;
    private javax.swing.JSlider Min_Slider_K;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Text_4;
    private javax.swing.JLabel Text_5;
    private javax.swing.JLabel Text_6;
    private javax.swing.JLabel Title;
    // End of variables declaration//GEN-END:variables
}
