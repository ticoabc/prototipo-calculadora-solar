package projetov0;

import javax.swing.JOptionPane;
import cliente.Cliente;

public class Fr_ProjetoV0 extends javax.swing.JFrame {

    public String Nome;
    public String Cidade;
    public String Pessoa;
    public String Instalacao;
    public String Telhado;
    public String s1;
    public String s2;
    public char c1;
    public char c2;
    public double consmkw_int;
    public double valorkwh;
    public double GerCalc_kwp;
    public double media;
    public double calcular;
    public double Potencia;
    public double Modulo;
    public double ArredModulo;
    public double InvAjust;
    public double ArredInvAjust;
    public double GerAjust;
    public double ProfitMes;
    public double ValorEcon;

    //public double Div;
    public Cliente cliente;

    public Fr_ProjetoV0() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_Nome = new javax.swing.JLabel();
        tf_Nome = new javax.swing.JTextField();
        lb_Cidade = new javax.swing.JLabel();
        cb_Cidade = new javax.swing.JComboBox<>();
        lb_Pessoa = new javax.swing.JLabel();
        ckb_PessoaF = new javax.swing.JCheckBox();
        ckb_PessoaJ = new javax.swing.JCheckBox();
        bt_Orcamento = new javax.swing.JButton();
        bt_Limpar = new javax.swing.JButton();
        lb_ConsumoMes = new javax.swing.JLabel();
        tf_ConsumoMes = new javax.swing.JTextField();
        lb_GeraCalc = new javax.swing.JLabel();
        bt_Calcular = new javax.swing.JButton();
        tf_GeraCalc = new javax.swing.JTextField();
        lb_MediaIrrad = new javax.swing.JLabel();
        tf_MediaIrrad = new javax.swing.JTextField();
        lb_Inversor = new javax.swing.JLabel();
        tf_Inversor = new javax.swing.JTextField();
        lb_TipoIns = new javax.swing.JLabel();
        cb_TipoIns = new javax.swing.JComboBox<>();
        lb_TipoTelha = new javax.swing.JLabel();
        cb_TipoTelha = new javax.swing.JComboBox<>();
        lb_Modulo = new javax.swing.JLabel();
        tf_Modulo = new javax.swing.JTextField();
        cb_PotModu = new javax.swing.JComboBox<>();
        lb_PotModu = new javax.swing.JLabel();
        lb_GerAjust = new javax.swing.JLabel();
        tf_GerAjust = new javax.swing.JTextField();
        lb_ValorKwh = new javax.swing.JLabel();
        tf_ValorKwh = new javax.swing.JTextField();
        lb_ValorEcon = new javax.swing.JLabel();
        tf_ValorEcon = new javax.swing.JTextField();
        lb_ProfitMes = new javax.swing.JLabel();
        tf_ProfitMes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHO - Engenharia e Consultoria");
        setResizable(false);

        lb_Nome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Nome.setText("Nome");

        tf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NomeActionPerformed(evt);
            }
        });

        lb_Cidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Cidade.setText("Cidade");

        cb_Cidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "São Bernardo do Campo", "São Caetando do Sul", "Santo André", "Diadema", "Mauá", "Riberão Pires" }));
        cb_Cidade.setSelectedIndex(-1);
        cb_Cidade.setToolTipText("");
        cb_Cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CidadeActionPerformed(evt);
            }
        });

        lb_Pessoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Pessoa.setText("Pessoa");

        ckb_PessoaF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ckb_PessoaF.setText("Pessoa Física");
        ckb_PessoaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_PessoaFActionPerformed(evt);
            }
        });

        ckb_PessoaJ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ckb_PessoaJ.setText("Pessoa Jurídica");
        ckb_PessoaJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckb_PessoaJActionPerformed(evt);
            }
        });

        bt_Orcamento.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        bt_Orcamento.setForeground(new java.awt.Color(0, 51, 255));
        bt_Orcamento.setText("Orçamento");
        bt_Orcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_OrcamentoActionPerformed(evt);
            }
        });

        bt_Limpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Limpar.setForeground(new java.awt.Color(255, 0, 0));
        bt_Limpar.setText("Limpar");
        bt_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LimparActionPerformed(evt);
            }
        });

        lb_ConsumoMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ConsumoMes.setText("Consumo Mensal - kW");

        tf_ConsumoMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_ConsumoMes.setToolTipText("");
        tf_ConsumoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ConsumoMesActionPerformed(evt);
            }
        });

        lb_GeraCalc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_GeraCalc.setText("Geração Calculada - (kwp)");
        lb_GeraCalc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bt_Calcular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bt_Calcular.setForeground(new java.awt.Color(0, 153, 0));
        bt_Calcular.setText("Calcular");
        bt_Calcular.setToolTipText("");
        bt_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_CalcularActionPerformed(evt);
            }
        });

        tf_GeraCalc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_GeraCalc.setToolTipText("");
        tf_GeraCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_GeraCalcActionPerformed(evt);
            }
        });

        lb_MediaIrrad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_MediaIrrad.setText("Índice Médio de irradiação");

        tf_MediaIrrad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_MediaIrrad.setToolTipText("");
        tf_MediaIrrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_MediaIrradActionPerformed(evt);
            }
        });

        lb_Inversor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Inversor.setText("Inversor Mínimo - kW");

        tf_Inversor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Inversor.setToolTipText("");
        tf_Inversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_InversorActionPerformed(evt);
            }
        });

        lb_TipoIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_TipoIns.setText("Tipo de Instalação");

        cb_TipoIns.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Industrial", "Residencial" }));
        cb_TipoIns.setSelectedIndex(-1);
        cb_TipoIns.setToolTipText("");
        cb_TipoIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TipoInsActionPerformed(evt);
            }
        });

        lb_TipoTelha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_TipoTelha.setText("Tipo de Telhado");

        cb_TipoTelha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metalico", "Cerâmico", "Amianto", "Laje Concreto" }));
        cb_TipoTelha.setSelectedIndex(-1);
        cb_TipoTelha.setToolTipText("");
        cb_TipoTelha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_TipoTelhaActionPerformed(evt);
            }
        });

        lb_Modulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_Modulo.setText("Módulos Necessários");

        tf_Modulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_Modulo.setToolTipText("");
        tf_Modulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ModuloActionPerformed(evt);
            }
        });

        cb_PotModu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "300", "400", "700", "900", "1000" }));
        cb_PotModu.setSelectedIndex(-1);
        cb_PotModu.setToolTipText("");
        cb_PotModu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_PotModuActionPerformed(evt);
            }
        });

        lb_PotModu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_PotModu.setText("Potência dos Módulos - W");

        lb_GerAjust.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_GerAjust.setText("Geração Ajustada (kWp)");

        tf_GerAjust.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_GerAjust.setToolTipText("");
        tf_GerAjust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_GerAjustActionPerformed(evt);
            }
        });

        lb_ValorKwh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ValorKwh.setText("R$ - Valolr kW/h");

        tf_ValorKwh.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_ValorKwh.setToolTipText("");
        tf_ValorKwh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ValorKwhActionPerformed(evt);
            }
        });

        lb_ValorEcon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ValorEcon.setText("R$ - Valor Economizado");

        tf_ValorEcon.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_ValorEcon.setToolTipText("");
        tf_ValorEcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ValorEconActionPerformed(evt);
            }
        });

        lb_ProfitMes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_ProfitMes.setText("Profit Mensal - kWp");

        tf_ProfitMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_ProfitMes.setToolTipText("");
        tf_ProfitMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ProfitMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(tf_ValorKwh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Cidade)
                                    .addComponent(lb_Nome))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_Nome)
                                    .addComponent(cb_Cidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_Pessoa)
                                .addGap(18, 18, 18)
                                .addComponent(ckb_PessoaF)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(ckb_PessoaJ))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_TipoIns)
                                    .addComponent(lb_TipoTelha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_TipoTelha, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_TipoIns, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(bt_Limpar)
                                .addGap(27, 27, 27)
                                .addComponent(bt_Orcamento)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(tf_ConsumoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(lb_ConsumoMes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(lb_ValorKwh)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_PotModu)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_MediaIrrad, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(tf_MediaIrrad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(70, 70, 70)))))
                            .addComponent(bt_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(tf_Inversor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_GerAjust, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(tf_ProfitMes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_ValorEcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cb_PotModu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ProfitMes)
                            .addComponent(lb_Inversor)
                            .addComponent(lb_Modulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(tf_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tf_GeraCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_GerAjust)
                                    .addComponent(lb_GeraCalc)
                                    .addComponent(lb_ValorEcon))
                                .addGap(28, 28, 28))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Nome)
                    .addComponent(tf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cidade)
                    .addComponent(cb_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Pessoa)
                    .addComponent(ckb_PessoaF)
                    .addComponent(ckb_PessoaJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TipoIns)
                    .addComponent(cb_TipoIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_TipoTelha)
                    .addComponent(cb_TipoTelha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_ConsumoMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_MediaIrrad)
                            .addComponent(tf_ConsumoMes)))
                    .addComponent(lb_MediaIrrad))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lb_PotModu)
                        .addGap(3, 3, 3)
                        .addComponent(cb_PotModu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_ValorKwh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ValorKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(bt_Calcular)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_GeraCalc)
                    .addComponent(lb_Modulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_GeraCalc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Modulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_GerAjust)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_GerAjust, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_Inversor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_Inversor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_ValorEcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ValorEcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_ProfitMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_ProfitMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_Orcamento)
                    .addComponent(bt_Limpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NomeActionPerformed

    private void ckb_PessoaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_PessoaFActionPerformed
        ckb_PessoaJ.setSelected(false);
        ckb_PessoaF.setSelected(true);
    }//GEN-LAST:event_ckb_PessoaFActionPerformed

    private void ckb_PessoaJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckb_PessoaJActionPerformed
        ckb_PessoaJ.setSelected(true);
        ckb_PessoaF.setSelected(false);
    }//GEN-LAST:event_ckb_PessoaJActionPerformed

    private void cb_CidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_CidadeActionPerformed

    private void bt_OrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_OrcamentoActionPerformed

        if (ValidarTela()) {
            Fr_Orcamento relat = new Fr_Orcamento();

            relat.MontaRelat(cliente);

            relat.setVisible(true);
        }

        /*if (ValidarTela()){        
        
        String st;
        st = tf_Nome.getText();
        if (ckb_PessoaF.isSelected()) {
            st = st +  " - Pessoa Física";
        } else {
            st = st + " - Pessoa Jurídica";
        }
        st = st + "\nCidade - "        + cb_Cidade.getSelectedItem().toString();
        st = st + "\nConsumo Mensal - kW/h: " + tf_ConsumoMes.getText();
        st = st + "\nGeração Calculada - kwp: " + tf_GeraCalc.getText();
        st = st + "\nGeração Necessária - kwp: " + tf_GerAjust.getText();
        st = st + "\nInversor Mínimo - kW: " + tf_Inversor.getText();
        st = st + "\nMódulos Necessários: " + tf_Modulo.getText(); 
        st = st + "\nProfit Mensal: " + tf_ProfitMes.getText();
        st = st + "\nValor Economizado Mensal: " + tf_ValorEcon.getText();        
       } 
       //ta_Orc.setText(st);*/

    }//GEN-LAST:event_bt_OrcamentoActionPerformed

    private void bt_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LimparActionPerformed
        ckb_PessoaJ.setSelected(false);
        ckb_PessoaF.setSelected(false);
        cb_Cidade.setSelectedIndex(-1);
        cb_PotModu.setSelectedIndex(-1);
        cb_TipoIns.setSelectedIndex(-1);
        cb_TipoTelha.setSelectedIndex(-1);
        tf_Nome.setText("");
        tf_GerAjust.setText(null);
        tf_MediaIrrad.setText(null);
        tf_Inversor.setText(null);
        tf_GeraCalc.setText("");
        tf_ConsumoMes.setText("");
        tf_Modulo.setText("");
        tf_ValorKwh.setText(null);
        tf_ValorEcon.setText(null);
        //ta_Relatorio.setText(null);


    }//GEN-LAST:event_bt_LimparActionPerformed

    private void tf_ConsumoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ConsumoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ConsumoMesActionPerformed

    private void bt_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_CalcularActionPerformed

        if (ValidarTela()) {
            consmkw_int = Double.parseDouble(tf_ConsumoMes.getText().trim().replace(',', '.'));
            media = Double.parseDouble(tf_MediaIrrad.getText().trim().replace(',', '.'));
            valorkwh = Double.parseDouble(tf_ValorKwh.getText().trim().replace(',', '.'));

            GerCalc_kwp = consmkw_int / 30 / media / 0.8;

            Potencia = Double.parseDouble(cb_PotModu.getSelectedItem().toString());

            Modulo = (GerCalc_kwp * 1000) / Potencia;
            ArredModulo = Math.ceil(Modulo);

            InvAjust = ((Modulo * Potencia) / 1.32) / 1000;
            ArredInvAjust = Math.ceil(InvAjust);

            GerAjust = ArredModulo * Potencia;

            ProfitMes = (GerAjust * 30 * media * 0.8) / 1000;

            ValorEcon = ProfitMes * valorkwh;

            tf_GeraCalc.setText(String.valueOf(GerCalc_kwp));
            tf_GeraCalc.setText(String.format("%.2f", GerCalc_kwp));

            tf_Modulo.setText(String.valueOf(ArredModulo));
            tf_Modulo.setText(String.format("%.0f", ArredModulo));

            tf_Inversor.setText(String.valueOf(ArredInvAjust));
            tf_Inversor.setText(String.format("%.0f", ArredInvAjust));

            tf_GerAjust.setText(String.valueOf(GerAjust));
            tf_GerAjust.setText(String.format("%.0f", GerAjust));

            tf_ProfitMes.setText(String.valueOf(ProfitMes));
            tf_ProfitMes.setText(String.format("%.1f", ProfitMes));

            tf_ValorEcon.setText(String.valueOf(ValorEcon));
            tf_ValorEcon.setText(String.format("%.2f", ValorEcon));

        }
    }//GEN-LAST:event_bt_CalcularActionPerformed

    private void tf_GeraCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_GeraCalcActionPerformed
        //String tf_ConsumoDia = String.format("%.4d", calcular);
        //tf_ConsumoDia.setText(String.format("%.4f", Div));
    }//GEN-LAST:event_tf_GeraCalcActionPerformed

    private void tf_MediaIrradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_MediaIrradActionPerformed
        //tf_MediaCid.setText(String.format("%.4f", Div));
    }//GEN-LAST:event_tf_MediaIrradActionPerformed

    private void tf_InversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_InversorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_InversorActionPerformed

    private void cb_TipoInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TipoInsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_TipoInsActionPerformed

    private void cb_TipoTelhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_TipoTelhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_TipoTelhaActionPerformed

    private void tf_ModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ModuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ModuloActionPerformed

    private void cb_PotModuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_PotModuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_PotModuActionPerformed

    private void tf_GerAjustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_GerAjustActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_GerAjustActionPerformed

    private void tf_ValorKwhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ValorKwhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ValorKwhActionPerformed

    private void tf_ValorEconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ValorEconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ValorEconActionPerformed

    private void tf_ProfitMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ProfitMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ProfitMesActionPerformed

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
            java.util.logging.Logger.getLogger(Fr_ProjetoV0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fr_ProjetoV0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fr_ProjetoV0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fr_ProjetoV0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fr_ProjetoV0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Calcular;
    private javax.swing.JButton bt_Limpar;
    private javax.swing.JButton bt_Orcamento;
    private javax.swing.JComboBox<String> cb_Cidade;
    private javax.swing.JComboBox<String> cb_PotModu;
    private javax.swing.JComboBox<String> cb_TipoIns;
    private javax.swing.JComboBox<String> cb_TipoTelha;
    private javax.swing.JCheckBox ckb_PessoaF;
    private javax.swing.JCheckBox ckb_PessoaJ;
    private javax.swing.JLabel lb_Cidade;
    private javax.swing.JLabel lb_ConsumoMes;
    private javax.swing.JLabel lb_GerAjust;
    private javax.swing.JLabel lb_GeraCalc;
    private javax.swing.JLabel lb_Inversor;
    private javax.swing.JLabel lb_MediaIrrad;
    private javax.swing.JLabel lb_Modulo;
    private javax.swing.JLabel lb_Nome;
    private javax.swing.JLabel lb_Pessoa;
    private javax.swing.JLabel lb_PotModu;
    private javax.swing.JLabel lb_ProfitMes;
    private javax.swing.JLabel lb_TipoIns;
    private javax.swing.JLabel lb_TipoTelha;
    private javax.swing.JLabel lb_ValorEcon;
    private javax.swing.JLabel lb_ValorKwh;
    private javax.swing.JTextField tf_ConsumoMes;
    private javax.swing.JTextField tf_GerAjust;
    private javax.swing.JTextField tf_GeraCalc;
    private javax.swing.JTextField tf_Inversor;
    private javax.swing.JTextField tf_MediaIrrad;
    private javax.swing.JTextField tf_Modulo;
    private javax.swing.JTextField tf_Nome;
    private javax.swing.JTextField tf_ProfitMes;
    private javax.swing.JTextField tf_ValorEcon;
    private javax.swing.JTextField tf_ValorKwh;
    // End of variables declaration//GEN-END:variables

    public void captarString() {
        s1 = tf_ConsumoMes.getText().trim();
        s2 = tf_ValorKwh.getText().trim();
    }

    public void captaChar() {

        c1 = tf_ConsumoMes.getText().trim().charAt(0);
        c2 = tf_ValorKwh.getText().trim().charAt(0);
    }

    public boolean ValidarTela() {

        boolean saida = false;

        try {

            cliente = new Cliente();

            if ((tf_Nome.getText().trim().isEmpty())
                    || (cb_Cidade.getSelectedIndex() == -1)
                    || (cb_TipoIns.getSelectedIndex() == -1)
                    || (cb_TipoTelha.getSelectedIndex() == -1)
                    || (!ckb_PessoaF.isSelected()) && (!ckb_PessoaJ.isSelected())
                    || (tf_ConsumoMes.getText().trim().isEmpty())
                    || (tf_ValorKwh.getText().trim().isEmpty())
                    || (tf_MediaIrrad.getText().trim().isEmpty())
                    || (cb_PotModu.getSelectedIndex() == -1)) {
                throw new Exception("\nObrigatório Preenchimento de TODOS os dados.");
            }

            Nome = tf_Nome.getText().trim();
            Cidade = cb_Cidade.getSelectedItem().toString();
            if (ckb_PessoaF.isSelected()) {
                Pessoa = "Pessoa Física";
            } else {
                Pessoa = "Pessoa Jurídica";
            }
            Instalacao = cb_TipoIns.getSelectedItem().toString();
            Telhado = cb_TipoTelha.getSelectedItem().toString();

            cliente.setNome(Nome);
            cliente.setCidade(Cidade);
            cliente.setPessoa(Pessoa);
            cliente.setInstalacao(Instalacao);
            cliente.setTelhado(Telhado);
            cliente.setConsumo(consmkw_int);
            cliente.setIndice(media);
            cliente.setValorHora(valorkwh);
            cliente.setPotenciaMod(Potencia);
            cliente.setModulosNecss(ArredModulo);
            cliente.setInversorMin(valorkwh);
            cliente.setGeracaoAjust(GerAjust);
            cliente.setProfitMensal(ProfitMes);
            cliente.setValorEcono(ValorEcon);

            saida = true;

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro de Validação de Tela: " + erro.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        return saida;
    }
}
