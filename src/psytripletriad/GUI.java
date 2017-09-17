/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psytripletriad;

import audio.AudioPlayer;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author PsY
 */
public class GUI extends javax.swing.JFrame {

    GameEngine engine;

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
        setupVisuals();
        audio.AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.start();
        engine = new GameEngine();
    }

    // Setup the visual of the buttons and other elements.
    private void setupVisuals() {
        lblTurnCursor.setHorizontalTextPosition(JLabel.CENTER);
        lblTurnCursor.setVerticalTextPosition(JLabel.BOTTOM);
        
        btnTL.setHorizontalTextPosition(JLabel.CENTER);
        btnTL.setVerticalTextPosition(JLabel.BOTTOM);
        btnUP.setHorizontalTextPosition(JLabel.CENTER);
        btnUP.setVerticalTextPosition(JLabel.BOTTOM);
        btnTR.setHorizontalTextPosition(JLabel.CENTER);
        btnTR.setVerticalTextPosition(JLabel.BOTTOM);
        btnLE.setHorizontalTextPosition(JLabel.CENTER);
        btnLE.setVerticalTextPosition(JLabel.BOTTOM);
        btnCE.setHorizontalTextPosition(JLabel.CENTER);
        btnCE.setVerticalTextPosition(JLabel.BOTTOM);
        btnRI.setHorizontalTextPosition(JLabel.CENTER);
        btnRI.setVerticalTextPosition(JLabel.BOTTOM);
        btnBL.setHorizontalTextPosition(JLabel.CENTER);
        btnBL.setVerticalTextPosition(JLabel.BOTTOM);
        btnDO.setHorizontalTextPosition(JLabel.CENTER);
        btnDO.setVerticalTextPosition(JLabel.BOTTOM);
        btnBR.setHorizontalTextPosition(JLabel.CENTER);
        btnBR.setVerticalTextPosition(JLabel.BOTTOM);
        handSetup();
    }

    // Setup hand of blank cards.
    private void handSetup() {
        URL imgURL = getClass().getResource("/otherimages/Back.jpg");
        ImageIcon image = new ImageIcon(imgURL);
        btnP1C1.setIcon(image);
        btnP1C1.setText("");
        btnP1C2.setIcon(image);
        btnP1C2.setText("");
        btnP1C3.setIcon(image);
        btnP1C3.setText("");
        btnP1C4.setIcon(image);
        btnP1C4.setText("");
        btnP1C5.setIcon(image);
        btnP1C5.setText("");
        btnP2C1.setIcon(image);
        btnP2C1.setText("");
        btnP2C2.setIcon(image);
        btnP2C2.setText("");
        btnP2C3.setIcon(image);
        btnP2C3.setText("");
        btnP2C4.setIcon(image);
        btnP2C4.setText("");
        btnP2C5.setIcon(image);
        btnP2C5.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        boardPanel = new javax.swing.JPanel();
        btnTL = new javax.swing.JButton();
        btnUP = new javax.swing.JButton();
        btnTR = new javax.swing.JButton();
        btnLE = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnRI = new javax.swing.JButton();
        btnBL = new javax.swing.JButton();
        btnDO = new javax.swing.JButton();
        btnBR = new javax.swing.JButton();
        panelPlayer1 = new javax.swing.JPanel();
        btnP1C1 = new javax.swing.JButton();
        btnP1C2 = new javax.swing.JButton();
        btnP1C3 = new javax.swing.JButton();
        btnP1C4 = new javax.swing.JButton();
        btnP1C5 = new javax.swing.JButton();
        panelPlayer2 = new javax.swing.JPanel();
        btnP2C1 = new javax.swing.JButton();
        btnP2C2 = new javax.swing.JButton();
        btnP2C3 = new javax.swing.JButton();
        btnP2C4 = new javax.swing.JButton();
        btnP2C5 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnNewGame = new javax.swing.JButton();
        lblP1Name = new javax.swing.JLabel();
        lblP2Name = new javax.swing.JLabel();
        lblTurnCursor = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        boardPanel.setBackground(new java.awt.Color(204, 204, 204));
        boardPanel.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        btnTL.setText("Button TL");
        btnTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTLActionPerformed(evt);
            }
        });
        boardPanel.add(btnTL);

        btnUP.setText("Button UP");
        btnUP.setPreferredSize(new java.awt.Dimension(150, 150));
        btnUP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPActionPerformed(evt);
            }
        });
        boardPanel.add(btnUP);

        btnTR.setText("Button TR");
        btnTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTRActionPerformed(evt);
            }
        });
        boardPanel.add(btnTR);

        btnLE.setText("Button LE");
        btnLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLEActionPerformed(evt);
            }
        });
        boardPanel.add(btnLE);

        btnCE.setText("Button CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        boardPanel.add(btnCE);

        btnRI.setText("Button RI");
        btnRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRIActionPerformed(evt);
            }
        });
        boardPanel.add(btnRI);

        btnBL.setText("Button BL");
        btnBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLActionPerformed(evt);
            }
        });
        boardPanel.add(btnBL);

        btnDO.setText("Button DO");
        btnDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOActionPerformed(evt);
            }
        });
        boardPanel.add(btnDO);

        btnBR.setText("Button BR");
        btnBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBRActionPerformed(evt);
            }
        });
        boardPanel.add(btnBR);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(boardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panelPlayer1.setBackground(new java.awt.Color(204, 204, 204));

        btnP1C1.setText("P1 C1");
        btnP1C1.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1C1ActionPerformed(evt);
            }
        });

        btnP1C2.setText("P1 C2");
        btnP1C2.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1C2ActionPerformed(evt);
            }
        });

        btnP1C3.setText("P1 C3");
        btnP1C3.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1C3ActionPerformed(evt);
            }
        });

        btnP1C4.setText("P1 C4");
        btnP1C4.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1C4ActionPerformed(evt);
            }
        });

        btnP1C5.setText("P1 C5");
        btnP1C5.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP1C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPlayer1Layout = new javax.swing.GroupLayout(panelPlayer1);
        panelPlayer1.setLayout(panelPlayer1Layout);
        panelPlayer1Layout.setHorizontalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP1C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPlayer1Layout.setVerticalGroup(
            panelPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnP1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP1C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPlayer2.setBackground(new java.awt.Color(204, 204, 204));

        btnP2C1.setText("P2 C1");
        btnP2C1.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2C1ActionPerformed(evt);
            }
        });

        btnP2C2.setText("P2 C2");
        btnP2C2.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2C2ActionPerformed(evt);
            }
        });

        btnP2C3.setText("P2 C3");
        btnP2C3.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2C3ActionPerformed(evt);
            }
        });

        btnP2C4.setText("P2 C4");
        btnP2C4.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2C4ActionPerformed(evt);
            }
        });

        btnP2C5.setText("P2 C5");
        btnP2C5.setPreferredSize(new java.awt.Dimension(150, 150));
        btnP2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnP2C5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPlayer2Layout = new javax.swing.GroupLayout(panelPlayer2);
        panelPlayer2.setLayout(panelPlayer2Layout);
        panelPlayer2Layout.setHorizontalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnP2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP2C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnP2C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelPlayer2Layout.setVerticalGroup(
            panelPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPlayer2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnP2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP2C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnP2C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lblWelcome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblWelcome.setText("Triple Triad");
        lblWelcome.setPreferredSize(new java.awt.Dimension(53, 14));

        btnNewGame.setText("New Game");
        btnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewGameActionPerformed(evt);
            }
        });

        lblP1Name.setText("P1");

        lblP2Name.setText("P2");

        lblTurnCursor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/otherimages/CursorLeft.png"))); // NOI18N

        lblScore.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblScore.setText("Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblP1Name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblWelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(45, 45, 45)))
                                .addGap(189, 189, 189)
                                .addComponent(lblP2Name))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 66, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(lblTurnCursor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(panelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblP1Name)
                            .addComponent(lblP2Name)
                            .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNewGame)
                        .addGap(4, 4, 4)
                        .addComponent(lblScore)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTurnCursor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panelPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewGameActionPerformed
        engine.newGame();
        turnUpdate();
        setupHandImages();
        usedCardUIUpdate();
        BoardUpdate();
    }//GEN-LAST:event_btnNewGameActionPerformed

    private void btnP1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1C1ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(0);
            // Disable all others while selected.
            btnP1C2.setEnabled(false);
            btnP1C3.setEnabled(false);
            btnP1C4.setEnabled(false);
            btnP1C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP1C1ActionPerformed

    private void btnP1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1C2ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(1);
            // Disable all others while selected.
            btnP1C1.setEnabled(false);
            btnP1C3.setEnabled(false);
            btnP1C4.setEnabled(false);
            btnP1C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP1C2ActionPerformed

    private void btnP1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1C3ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(2);
            // Disable all others while selected.
            btnP1C1.setEnabled(false);
            btnP1C2.setEnabled(false);
            btnP1C4.setEnabled(false);
            btnP1C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP1C3ActionPerformed

    private void btnP1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1C4ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(3);
            // Disable all others while selected.
            btnP1C1.setEnabled(false);
            btnP1C2.setEnabled(false);
            btnP1C3.setEnabled(false);
            btnP1C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP1C4ActionPerformed

    private void btnP1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP1C5ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(4);
            // Disable all others while selected.
            btnP1C1.setEnabled(false);
            btnP1C2.setEnabled(false);
            btnP1C3.setEnabled(false);
            btnP1C4.setEnabled(false);
        }
    }//GEN-LAST:event_btnP1C5ActionPerformed

    private void btnP2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2C1ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(0);
            // Disable all others while selected.
            btnP2C2.setEnabled(false);
            btnP2C3.setEnabled(false);
            btnP2C4.setEnabled(false);
            btnP2C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP2C1ActionPerformed

    private void btnP2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2C2ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(1);
            // Disable all others while selected.
            btnP2C1.setEnabled(false);
            btnP2C3.setEnabled(false);
            btnP2C4.setEnabled(false);
            btnP2C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP2C2ActionPerformed

    private void btnP2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2C3ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(2);
            // Disable all others while selected.
            btnP2C1.setEnabled(false);
            btnP2C2.setEnabled(false);
            btnP2C4.setEnabled(false);
            btnP2C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP2C3ActionPerformed

    private void btnP2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2C4ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(3);
            // Disable all others while selected.
            btnP2C1.setEnabled(false);
            btnP2C2.setEnabled(false);
            btnP2C3.setEnabled(false);
            btnP2C5.setEnabled(false);
        }
    }//GEN-LAST:event_btnP2C4ActionPerformed

    private void btnP2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnP2C5ActionPerformed
        if (engine.playerHasSelected()) {
            // Player has selected a card.
            engine.playerDeselectCard();
            usedCardUIUpdate();
        } else {
            //Player has not selected a card.
            // Select chosen card.
            engine.playerSelectCard(4);
            // Disable all others while selected.
            btnP2C1.setEnabled(false);
            btnP2C2.setEnabled(false);
            btnP2C3.setEnabled(false);
            btnP2C4.setEnabled(false);
        }
    }//GEN-LAST:event_btnP2C5ActionPerformed

    private void btnTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTLActionPerformed
        engine.playSelectedCard(0, 0);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnTLActionPerformed

    private void btnUPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPActionPerformed
        // TODO add your handling code here:
        engine.playSelectedCard(0, 1);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnUPActionPerformed

    private void btnTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTRActionPerformed
        // TODO add your handling code here:
        engine.playSelectedCard(0, 2);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnTRActionPerformed

    private void btnLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLEActionPerformed
        engine.playSelectedCard(1, 0);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnLEActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        engine.playSelectedCard(1, 1);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRIActionPerformed
        engine.playSelectedCard(1, 2);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnRIActionPerformed

    private void btnBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLActionPerformed
        engine.playSelectedCard(2, 0);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnBLActionPerformed

    private void btnDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOActionPerformed
        engine.playSelectedCard(2, 1);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnDOActionPerformed

    private void btnBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBRActionPerformed
        engine.playSelectedCard(2, 2);
        BoardUpdate();
        turnUpdate();
        usedCardUIUpdate();
    }//GEN-LAST:event_btnBRActionPerformed

    private void usedCardUIUpdate() {
        if (engine.getPlayerTurn() == 1) {
            // If Player 1 turn.
            // Player 1 hand used status change.
            // P1C1
            if (engine.getCardFromHand(1, 0).isUsed()) {
                btnP1C1.setEnabled(false);
            } else {
                btnP1C1.setEnabled(true);
            }

            // P1C2
            if (engine.getCardFromHand(1, 1).isUsed()) {
                btnP1C2.setEnabled(false);
            } else {
                btnP1C2.setEnabled(true);
            }

            // P1C3
            if (engine.getCardFromHand(1, 2).isUsed()) {
                btnP1C3.setEnabled(false);
            } else {
                btnP1C3.setEnabled(true);
            }

            // P1C4
            if (engine.getCardFromHand(1, 3).isUsed()) {
                btnP1C4.setEnabled(false);
            } else {
                btnP1C4.setEnabled(true);
            }

            // P1C5
            if (engine.getCardFromHand(1, 4).isUsed()) {
                btnP1C5.setEnabled(false);
            } else {
                btnP1C5.setEnabled(true);
            }
        } else {
            // If Player 2 turn.
            // Player 2 used status change.
            //
            // P2C1
            if (engine.getCardFromHand(2, 0).isUsed()) {
                btnP2C1.setEnabled(false);
            } else {
                btnP2C1.setEnabled(true);
            }

            // P2C2
            if (engine.getCardFromHand(2, 1).isUsed()) {
                btnP2C2.setEnabled(false);
            } else {
                btnP2C2.setEnabled(true);
            }

            // P2C3
            if (engine.getCardFromHand(2, 2).isUsed()) {
                btnP2C3.setEnabled(false);
            } else {
                btnP2C3.setEnabled(true);
            }

            // P2C4
            if (engine.getCardFromHand(2, 3).isUsed()) {
                btnP2C4.setEnabled(false);
            } else {
                btnP2C4.setEnabled(true);
            }

            // P2C5
            if (engine.getCardFromHand(2, 4).isUsed()) {
                btnP2C5.setEnabled(false);
            } else {
                btnP2C5.setEnabled(true);
            }
        }
    }

    private void setupHandImages() {
        ImageIcon[] player1Hand = engine.getHandImages(1);
        ImageIcon[] player2Hand = engine.getHandImages(2);

        btnP1C1.setIcon(player1Hand[0]);
        btnP1C2.setIcon(player1Hand[1]);
        btnP1C3.setIcon(player1Hand[2]);
        btnP1C4.setIcon(player1Hand[3]);
        btnP1C5.setIcon(player1Hand[4]);
        btnP2C1.setIcon(player2Hand[0]);
        btnP2C2.setIcon(player2Hand[1]);
        btnP2C3.setIcon(player2Hand[2]);
        btnP2C4.setIcon(player2Hand[3]);
        btnP2C5.setIcon(player2Hand[4]);
    }

    private void turnUpdate() {
        if (engine.getPlayerTurn() == 1) {
            URL imgURL = getClass().getResource("/otherimages/CursorLeft.png");
            ImageIcon p1Image = new ImageIcon(imgURL);
            lblTurnCursor.setIcon(p1Image);
            lblTurnCursor.setText("Player 1 Turn!");
            scoreUpdate();
            // Player 1 turn.
            btnP1C1.setEnabled(true);
            btnP1C2.setEnabled(true);
            btnP1C3.setEnabled(true);
            btnP1C4.setEnabled(true);
            btnP1C5.setEnabled(true);
            btnP2C1.setEnabled(false);
            btnP2C2.setEnabled(false);
            btnP2C3.setEnabled(false);
            btnP2C4.setEnabled(false);
            btnP2C5.setEnabled(false);
        } else {
            // Player 2 turn.
            URL imgURL = getClass().getResource("/otherimages/CursorRight.png");
            ImageIcon p2Image = new ImageIcon(imgURL);
            lblTurnCursor.setIcon(p2Image);
            lblTurnCursor.setText("Player 2 Turn!");
            scoreUpdate();
            btnP2C1.setEnabled(true);
            btnP2C2.setEnabled(true);
            btnP2C3.setEnabled(true);
            btnP2C4.setEnabled(true);
            btnP2C5.setEnabled(true);
            btnP1C1.setEnabled(false);
            btnP1C2.setEnabled(false);
            btnP1C3.setEnabled(false);
            btnP1C4.setEnabled(false);
            btnP1C5.setEnabled(false);
        }
    }
    
    private void scoreUpdate() {
        lblScore.setText(engine.getPlayerScore(1) + " - " +
                engine.getPlayerScore(2));
    }

    private void BoardUpdate() {
        // Top left
        if (engine.getBoard().queryBoard(0, 0).equals("Empty")) {
            btnTL.setIcon(null);
            btnTL.setText("Empty");
        } else {
            btnTL.setIcon(engine.getCardFromBoard(0, 0).getImage());
            btnTL.setText("P" + engine.getOwnershipAt(0, 0));
        }
        // Up
        if (engine.getBoard().queryBoard(0, 1).equals("Empty")) {
            btnUP.setIcon(null);
            btnUP.setText("Empty");
        } else {
            btnUP.setIcon(engine.getCardFromBoard(0, 1).getImage());
            btnUP.setText("P" + engine.getOwnershipAt(0, 1));
        }
        // Top right
        if (engine.getBoard().queryBoard(0, 2).equals("Empty")) {
            btnTR.setIcon(null);
            btnTR.setText("Empty");
        } else {
            btnTR.setIcon(engine.getCardFromBoard(0, 2).getImage());
            btnTR.setText("P" + engine.getOwnershipAt(0, 2));
        }
        //Left
        if (engine.getBoard().queryBoard(1, 0).equals("Empty")) {
            btnLE.setIcon(null);
            btnLE.setText("Empty");
        } else {
            btnLE.setIcon(engine.getCardFromBoard(1, 0).getImage());
            btnLE.setText("P" + engine.getOwnershipAt(1, 0));
        }
        // Center
        if (engine.getBoard().queryBoard(1, 1).equals("Empty")) {
            btnCE.setIcon(null);
            btnCE.setText("Empty");
        } else {
            btnCE.setIcon(engine.getCardFromBoard(1, 1).getImage());
            btnCE.setText("P" + engine.getOwnershipAt(1, 1));
        }
        // Right
        if (engine.getBoard().queryBoard(1, 2).equals("Empty")) {
            btnRI.setIcon(null);
            btnRI.setText("Empty");
        } else {
            btnRI.setIcon(engine.getCardFromBoard(1, 2).getImage());
            btnRI.setText("P" + engine.getOwnershipAt(1, 2));
        }
        // Bottom Left.
        if (engine.getBoard().queryBoard(2, 0).equals("Empty")) {
            btnBL.setIcon(null);
            btnBL.setText("Empty");
        } else {
            btnBL.setIcon(engine.getCardFromBoard(2, 0).getImage());
            btnBL.setText("P" + engine.getOwnershipAt(2, 0));
        }
        // Down.
        if (engine.getBoard().queryBoard(2, 1).equals("Empty")) {
            btnDO.setIcon(null);
            btnDO.setText("Empty");
        } else {
            btnDO.setIcon(engine.getCardFromBoard(2, 1).getImage());
            btnDO.setText("P" + engine.getOwnershipAt(2, 1));
        }
        // Bottom Right.
        if (engine.getBoard().queryBoard(2, 2).equals("Empty")) {
            btnBR.setIcon(null);
            btnBR.setText("Empty");
        } else {
            btnBR.setIcon(engine.getCardFromBoard(2, 2).getImage());
            btnBR.setText("P" + engine.getOwnershipAt(2, 2));
        }
    }

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boardPanel;
    private javax.swing.JButton btnBL;
    private javax.swing.JButton btnBR;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDO;
    private javax.swing.JButton btnLE;
    private javax.swing.JButton btnNewGame;
    private javax.swing.JButton btnP1C1;
    private javax.swing.JButton btnP1C2;
    private javax.swing.JButton btnP1C3;
    private javax.swing.JButton btnP1C4;
    private javax.swing.JButton btnP1C5;
    private javax.swing.JButton btnP2C1;
    private javax.swing.JButton btnP2C2;
    private javax.swing.JButton btnP2C3;
    private javax.swing.JButton btnP2C4;
    private javax.swing.JButton btnP2C5;
    private javax.swing.JButton btnRI;
    private javax.swing.JButton btnTL;
    private javax.swing.JButton btnTR;
    private javax.swing.JButton btnUP;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblP1Name;
    private javax.swing.JLabel lblP2Name;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblTurnCursor;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel panelPlayer1;
    private javax.swing.JPanel panelPlayer2;
    // End of variables declaration//GEN-END:variables
}
