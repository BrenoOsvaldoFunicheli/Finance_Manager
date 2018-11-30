package VIEW;

import Manager.TableManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

@SuppressWarnings("serial")
public class FrameFinancas extends javax.swing.JInternalFrame {

    private final Session session;

    private static boolean up = false;

    public FrameFinancas(Session session) {
        initComponents();
        this.session = session;
    }

    public Session getSession() {
        return session;
    }

    public JLabel getjLabelDataFinal1() {
        return jLabelDataFinal1;
    }

    public void setjLabelDataFinal1(JLabel jLabelDataFinal1) {
        this.jLabelDataFinal1 = jLabelDataFinal1;
    }

    public JLabel getjLabelDataFinal2() {
        return total;
    }

    public void setjLabelDataFinal2(JLabel jLabelDataFinal2) {
        this.total = jLabelDataFinal2;
    }

    public JLabel getTotal() {
        return total;
    }

    public void setTotal(JLabel total) {
        this.total = total;
    }
    
    
    public JButton getJbtnBuscar() {

        return JbtnBuscar;
    }

    public void setJbtnBuscar(JButton JbtnBuscar) {
        this.JbtnBuscar = JbtnBuscar;
    }

    public JButton getjBtnAlterar() {
        return jBtnAlterar;
    }

    public void setjBtnAlterar(JButton jBtnAlterar) {
        this.jBtnAlterar = jBtnAlterar;
    }

    public JButton getjBtnRemover() {
        return jBtnRemover;
    }

    public void setjBtnRemover(JButton jBtnRemover) {
        this.jBtnRemover = jBtnRemover;
    }

    public JButton getjBtnSalvar() {
        return jBtnSalvar;
    }

    public void setjBtnSalvar(JButton jBtnSalvar) {
        this.jBtnSalvar = jBtnSalvar;
    }

    public JComboBox<String> getjComboConta() {
        return jComboConta;
    }

    public void setjComboConta(JComboBox<String> jComboConta) {
        this.jComboConta = jComboConta;
    }

    public String getjDataFinal() {
        return jDataFinal.getSelectedItem().toString();
    }
    
    public JComboBox<String> getjDataFinalWithCombo() {
        return jDataFinal;
    }
    
    public JComboBox<String> getjDataInicialWithCombo() {
        return jDataInicial;
    }

    public String getjDataInicial() {
        return jDataInicial.getSelectedItem().toString();
    }

    public JLabel getjLabelCOnta() {
        return jLabelCOnta;
    }

    public void setjLabelCOnta(JLabel jLabelCOnta) {
        this.jLabelCOnta = jLabelCOnta;
    }

    public JLabel getjLabelDataFinal() {
        return jLabelDataFinal;
    }

    public void setjLabelDataFinal(JLabel jLabelDataFinal) {
        this.jLabelDataFinal = jLabelDataFinal;
    }

    public JLabel getjLabelDataInicial() {
        return jLabelDataInicial;
    }

    public void setjLabelDataInicial(JLabel jLabelDataInicial) {
        this.jLabelDataInicial = jLabelDataInicial;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTableDados() {
        return tableDados;
    }

    /**
     *
     * Creates new form FrameHome
     *
     * @param usm
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnSalvar = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDados = new javax.swing.JTable();
        jLabelDataInicial = new javax.swing.JLabel();
        jLabelDataFinal = new javax.swing.JLabel();
        JbtnBuscar = new javax.swing.JButton();
        jComboConta = new javax.swing.JComboBox<>();
        jLabelCOnta = new javax.swing.JLabel();
        jLabelDataFinal1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jDataInicial = new javax.swing.JComboBox<>();
        jDataFinal = new javax.swing.JComboBox<>();

        setBorder(null);
        setTitle("DESPESA");
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jBtnSalvar.setText("Add");
        jBtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalvarActionPerformed(evt);
            }
        });

        jBtnAlterar.setText("Alter");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnRemover.setText("Rem");
        jBtnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRemoverActionPerformed(evt);
            }
        });

        tableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Valor", "Data", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDados);

        jLabelDataInicial.setText("Data inicial");

        jLabelDataFinal.setText("Data Final");

        JbtnBuscar.setText("Buscar");

        jComboConta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboConta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboContaItemStateChanged(evt);
            }
        });

        jLabelCOnta.setText("Conta");

        jLabelDataFinal1.setText("Total :");

        total.setText("0");

        jDataInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jDataFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDataInicial)
                    .addComponent(jDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(JbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelDataFinal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDataFinal1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboConta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRemover))
                    .addComponent(jLabelCOnta))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataFinal)
                    .addComponent(jLabelDataInicial)
                    .addComponent(jLabelCOnta)
                    .addComponent(jLabelDataFinal1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRemover)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnSalvar)
                    .addComponent(JbtnBuscar)
                    .addComponent(jComboConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total)
                    .addComponent(jDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalvarActionPerformed
        // TODO add your handling code here:
        //rc.calAlterarDepesa(this.getUsm());
    }//GEN-LAST:event_jBtnSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
//        jComboConta.setModel(ComboManagerController.getAllAccount(getUsm()));
//        TableManagerController.atualizarTabela(tableDados, jComboConta);
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboContaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboContaItemStateChanged
        switch (getTitle()) {
            case "DESPESA":
                new TableManager().updateTableExpense(tableDados, jComboConta);
                break;
            case "RECEITA":
                new TableManager().updateTableRecipe(tableDados, jComboConta);
                break;
            default:
                new TableManager().updateTableHome(tableDados);
                break;
        }
    }//GEN-LAST:event_jComboContaItemStateChanged

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRemoverActionPerformed
    }//GEN-LAST:event_jBtnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbtnBuscar;
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnRemover;
    private javax.swing.JButton jBtnSalvar;
    private javax.swing.JComboBox<String> jComboConta;
    private javax.swing.JComboBox<String> jDataFinal;
    private javax.swing.JComboBox<String> jDataInicial;
    private javax.swing.JLabel jLabelCOnta;
    private javax.swing.JLabel jLabelDataFinal;
    private javax.swing.JLabel jLabelDataFinal1;
    private javax.swing.JLabel jLabelDataInicial;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDados;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the up
     */
    public static boolean isUp() {
        return up;
    }

    /**
     * @param aUp the up to set
     */
    public static void setUp(boolean aUp) {
        up = aUp;
    }

}
