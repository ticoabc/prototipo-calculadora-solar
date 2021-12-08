package projetov0;

import cliente.Cliente;

public class Fr_Orcamento extends javax.swing.JFrame {

    public Fr_Orcamento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_Orc = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHO - Engenharia e Consultoria");

        ta_Orc.setBackground(new java.awt.Color(204, 255, 102));
        ta_Orc.setColumns(20);
        ta_Orc.setFont(new java.awt.Font("Monospaced", 2, 13)); // NOI18N
        ta_Orc.setRows(5);
        ta_Orc.setToolTipText("");
        jScrollPane2.setViewportView(ta_Orc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fr_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_Orcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_Orcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea ta_Orc;
    // End of variables declaration//GEN-END:variables

    public void MontaRelat(Cliente cliente) {

        String st;

        st = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>PHO<<<<<<<<<<<<<<<<<<<<<<<<<< \n\n";
        st = st + cliente.getNome() + "\n\n";
        st = st + "Cidade: " + cliente.getCidade() + "\n\n";
        st = st + cliente.getPessoa() + "\n\n";
        st = st + "Tipo de Instalação: " + cliente.getInstalacao() + "\n\n";
        st = st + "Tipo de Telhado: " + cliente.getTelhado() + "\n\n";
        st = st + "Consumo Mensal kW: " + cliente.getConsumo() + "\n\n";
        st = st + "Indice de Insolação: " + cliente.getIndice() + "\n\n";
        st = st + "Valor kW/h: " + cliente.getValorHora() + "\n\n";
        st = st + "Potência dos Módulos: " + cliente.getPotenciaMod() + "\n\n";

        st = st + "-------------------Orçamento Energia Solar------------------\n\n";
        st = st + "Geração Ajustada - kwp: " + cliente.getGeracaoAjust() + "\n\n";
        st = st + "Inversor Mínimo - kW: " + cliente.getInversorMin() + "\n\n";
        st = st + "Módulos Necessários: " + cliente.getModulosNecss() + "\n\n";
        st = st + "Profit Mensal: " + cliente.getProfitMensal() + "\n\n";
        st = st + "Valor Economizado Mensal: " + cliente.getValorEcono() + "\n\n";

        ta_Orc.setText(st);
        
    }
}
