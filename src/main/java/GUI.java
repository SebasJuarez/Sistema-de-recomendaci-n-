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
        Min_Slider = new javax.swing.JSlider();
        Max_Slider = new javax.swing.JSlider();
        Min_Range = new javax.swing.JLabel();
        Max_Range = new javax.swing.JLabel();
        Min_Range1 = new javax.swing.JLabel();
        Min = new javax.swing.JTextField();
        Toggle = new javax.swing.JButton();
        Max = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("0"); // NOI18N

        Title.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Autoganga");
        Title.setMaximumSize(new java.awt.Dimension(750, 750));
        Title.setMinimumSize(new java.awt.Dimension(0, 0));
        Title.setPreferredSize(new java.awt.Dimension(300, 65));

        Brand_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_1.setName("0"); // NOI18N
        Brand_1.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_1.setText("Seleccione sus marcas de autos favoritas:");
        Text_1.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_1.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_1.setName("0"); // NOI18N
        Text_1.setPreferredSize(new java.awt.Dimension(300, 16));

        Brand_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_2.setName("0"); // NOI18N
        Brand_2.setPreferredSize(new java.awt.Dimension(150, 20));

        Brand_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Brand_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Brand_3.setName("0"); // NOI18N
        Brand_3.setPreferredSize(new java.awt.Dimension(150, 20));

        Text_2.setText("Seleccione su presupuesto: ( 5,000$ - 5,000,000$ )");
        Text_2.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_2.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_2.setName("0"); // NOI18N
        Text_2.setPreferredSize(new java.awt.Dimension(300, 16));

        Text_3.setText("min");
        Text_3.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_3.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_3.setName("0"); // NOI18N
        Text_3.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_3.setRequestFocusEnabled(false);

        Text_4.setText("max");
        Text_4.setMaximumSize(new java.awt.Dimension(750, 750));
        Text_4.setMinimumSize(new java.awt.Dimension(0, 0));
        Text_4.setName("0"); // NOI18N
        Text_4.setPreferredSize(new java.awt.Dimension(25, 15));
        Text_4.setRequestFocusEnabled(false);

        Min_Slider.setValue(0);
        Min_Slider.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Slider.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Slider.setPreferredSize(new java.awt.Dimension(200, 15));

        Max_Slider.setValue(100);
        Max_Slider.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Slider.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Slider.setPreferredSize(new java.awt.Dimension(200, 15));

        Min_Range.setText("5,000");
        Min_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range.setRequestFocusEnabled(false);

        Max_Range.setText("5,000,000");
        Max_Range.setMaximumSize(new java.awt.Dimension(750, 750));
        Max_Range.setMinimumSize(new java.awt.Dimension(0, 0));
        Max_Range.setPreferredSize(new java.awt.Dimension(55, 15));
        Max_Range.setRequestFocusEnabled(false);

        Min_Range1.setText("-");
        Min_Range1.setMaximumSize(new java.awt.Dimension(750, 750));
        Min_Range1.setMinimumSize(new java.awt.Dimension(0, 0));
        Min_Range1.setPreferredSize(new java.awt.Dimension(55, 15));
        Min_Range1.setRequestFocusEnabled(false);

        Min.setMaximumSize(new java.awt.Dimension(750, 750));
        Min.setMinimumSize(new java.awt.Dimension(0, 0));
        Min.setPreferredSize(new java.awt.Dimension(75, 20));

        Toggle.setText("Manual Toggle");
        Toggle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        Toggle.setMaximumSize(new java.awt.Dimension(750, 750));
        Toggle.setMinimumSize(new java.awt.Dimension(0, 0));
        Toggle.setPreferredSize(new java.awt.Dimension(75, 20));
        Toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleActionPerformed(evt);
            }
        });

        Max.setMaximumSize(new java.awt.Dimension(750, 750));
        Max.setMinimumSize(new java.awt.Dimension(0, 0));
        Max.setPreferredSize(new java.awt.Dimension(75, 20));
        Max.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaxActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Text_4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Text_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Min_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Max_Slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(Min_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Text_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max_Range, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Min_Range1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Max, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Toggle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean State = true;
    private void ToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleActionPerformed
        if(State == true){
            State = false;
        }else{
            State = true;
        }
    }//GEN-LAST:event_ToggleActionPerformed

    private void MaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MaxActionPerformed

    //Metodos
    
    public boolean getButtonState(){
        return State;
    }
    
    public int getMinValueText(){
        return Integer.parseInt(Min.getText());
    }
    
    public int getMaxValueText(){
        return Integer.parseInt(Max.getText());
    }
    
    public float getMinSlider(){
        return Min_Slider.getValue();
    }
    
    public float getMaxSlider(){
        return Max_Slider.getValue();
    }
        
    public void setMinValue(int Min){
        Min_Range.setText(String.format("%,d", Min));
    }
    
    public void setMaxValue(int Max){
        Max_Range.setText(String.format("%,d", Max));
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
    private javax.swing.JTextField Max;
    private javax.swing.JLabel Max_Range;
    private javax.swing.JSlider Max_Slider;
    private javax.swing.JTextField Min;
    private javax.swing.JLabel Min_Range;
    private javax.swing.JLabel Min_Range1;
    private javax.swing.JSlider Min_Slider;
    private javax.swing.JLabel Text_1;
    private javax.swing.JLabel Text_2;
    private javax.swing.JLabel Text_3;
    private javax.swing.JLabel Text_4;
    private javax.swing.JLabel Title;
    private javax.swing.JButton Toggle;
    // End of variables declaration//GEN-END:variables
}
