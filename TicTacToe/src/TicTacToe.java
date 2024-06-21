/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 *
 * @author Home
 */
public class TicTacToe extends javax.swing.JFrame {
    
    public int scoreO;
    public int scoreX;
    public int ticTacToe = 0;
    int scoring;
    
    /**
     * Creates new form TicTacToe
     */
    
    private void resetGame() {
        // Your method implementation goes here
        btnTile1.setEnabled(true);
        btnTile2.setEnabled(true);
        btnTile3.setEnabled(true);
        btnTile4.setEnabled(true);
        btnTile5.setEnabled(true);
        btnTile6.setEnabled(true);
        btnTile7.setEnabled(true);
        btnTile8.setEnabled(true);
        btnTile9.setEnabled(true);
        btnTile1.setText(" ");
        btnTile2.setText(" ");
        btnTile3.setText(" ");
        btnTile4.setText(" ");
        btnTile5.setText(" ");
        btnTile6.setText(" ");
        btnTile7.setText(" ");
        btnTile8.setText(" ");
        btnTile9.setText(" ");
        btnRules.setEnabled(true);
        ticTacToe = 0;
        lblScore.setText("Score:");

    }
    
    private void winnerX() {
        lblPlayerX.setText("Player X: " + scoreX);
        if (btnTile1.getText().equals("X") && btnTile2.getText().equals("X") && btnTile3.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile4.getText().equals("X") && btnTile5.getText().equals("X") && btnTile6.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile7.getText().equals("X") && btnTile8.getText().equals("X") && btnTile9.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile1.getText().equals("X") && btnTile4.getText().equals("X") && btnTile7.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile2.getText().equals("X") && btnTile5.getText().equals("X") && btnTile8.getText().equals("X")) {
            ticTacToe = 0;
            scoreX++;
            lblScore.setText("Score : Player X wins!");
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile3.getText().equals("X") && btnTile6.getText().equals("X") && btnTile9.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile1.getText().equals("X") && btnTile5.getText().equals("X") && btnTile9.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile3.getText().equals("X") && btnTile5.getText().equals("X") && btnTile7.getText().equals("X")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player X wins!");
            scoreX++;
            lblPlayerX.setText("Player X: " + scoreX);
            JOptionPane.showMessageDialog(this, "Player X wins!", "Player X", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }

    }

    private void winnerO() {
        if (btnTile1.getText().equals("O") && btnTile2.getText().equals("O") && btnTile3.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile4.getText().equals("O") && btnTile5.getText().equals("O") && btnTile6.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile7.getText().equals("O") && btnTile8.getText().equals("O") && btnTile9.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile1.getText().equals("O") && btnTile4.getText().equals("O") && btnTile7.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile2.getText().equals("O") && btnTile5.getText().equals("O") && btnTile8.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile3.getText().equals("O") && btnTile6.getText().equals("O") && btnTile9.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile1.getText().equals("O") && btnTile5.getText().equals("O") && btnTile9.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        } else if (btnTile3.getText().equals("O") && btnTile5.getText().equals("O") && btnTile7.getText().equals("O")) {
            ticTacToe = 0;
            lblScore.setText("Score : Player O wins!");
            scoreO++;
            lblPlayerO.setText("Player O: " + scoreO);
            JOptionPane.showMessageDialog(this, "Player O wins!", "Player O", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }

    }
    
    public TicTacToe() {
        initComponents();
        Color col = new Color(204, 255 , 255);
        getContentPane().setBackground(col);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btnTile2 = new javax.swing.JButton();
        btnTile3 = new javax.swing.JButton();
        btnTile1 = new javax.swing.JButton();
        btnTile4 = new javax.swing.JButton();
        btnTile5 = new javax.swing.JButton();
        btnTile6 = new javax.swing.JButton();
        btnTile7 = new javax.swing.JButton();
        btnTile8 = new javax.swing.JButton();
        btnTile9 = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblPlayerX = new javax.swing.JLabel();
        lblPlayerO = new javax.swing.JLabel();
        btnRules = new javax.swing.JButton();

        jButton8.setText("jButton1");

        jButton9.setText("jButton1");

        jButton10.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        btnTile2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile2ActionPerformed(evt);
            }
        });

        btnTile3.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile3ActionPerformed(evt);
            }
        });

        btnTile1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile1ActionPerformed(evt);
            }
        });

        btnTile4.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile4ActionPerformed(evt);
            }
        });

        btnTile5.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile5ActionPerformed(evt);
            }
        });

        btnTile6.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile6ActionPerformed(evt);
            }
        });

        btnTile7.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile7ActionPerformed(evt);
            }
        });

        btnTile8.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile8ActionPerformed(evt);
            }
        });

        btnTile9.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        btnTile9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTile9ActionPerformed(evt);
            }
        });

        lblScore.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblScore.setText("SCORE");

        lblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayerX.setText("Player X");

        lblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPlayerO.setText("Player O");

        btnRules.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRules.setText("RULES");
        btnRules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRulesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTile4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnTile7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblScore)
                        .addComponent(lblPlayerX)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnTile1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnTile3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPlayerO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlayerX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlayerO)
                    .addComponent(btnRules))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTile1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTile4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTile7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTile9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile2ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile2.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile2.setText("X");
            btnTile2.setForeground(Color.BLUE);
            if (btnTile2.getText().equals("X")) {
                winnerX();

            }

        } else {
            btnTile2.setText("O");
            btnTile2.setForeground(Color.RED);
            if (btnTile2.getText().equals("O")) {
                winnerO();

            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile2ActionPerformed

    private void btnTile7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile7ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile7.setEnabled(false);
        ticTacToe++;
        if (ticTacToe % 2 == 1) {
            btnTile7.setText("X");
            btnTile7.setForeground(Color.BLUE);
            if (btnTile7.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile7.setText("O");
            btnTile7.setForeground(Color.RED);
            if (btnTile7.getText().equals("O")) {
                winnerO();
            }

        }

        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile7ActionPerformed

    private void btnTile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile1ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile1.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile1.setText("X");
            btnTile1.setForeground(Color.BLUE);
            if (btnTile1.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile1.setText("O");
            btnTile1.setForeground(Color.RED);
            if (btnTile1.getText().equals("O")) {
                winnerO();

            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile1ActionPerformed

    private void btnTile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile3ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile3.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile3.setText("X");
            btnTile3.setForeground(Color.BLUE);
            if (btnTile3.getText().equals("X")) {
                winnerX();

            }

        } else {
            btnTile3.setText("O");
            btnTile3.setForeground(Color.RED);
            if (btnTile3.getText().equals("O")) {
                winnerO();

            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile3ActionPerformed

    private void btnTile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile4ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile4.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile4.setText("X");
            btnTile4.setForeground(Color.BLUE);
            if (btnTile4.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile4.setText("O");
            btnTile4.setForeground(Color.RED);
            if (btnTile4.getText().equals("O")) {
                winnerO();
            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile4ActionPerformed

    private void btnTile5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile5ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile5.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile5.setText("X");
            btnTile5.setForeground(Color.BLUE);
            if (btnTile5.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile5.setText("O");
            btnTile5.setForeground(Color.RED);
            if (btnTile5.getText().equals("O")) {
                winnerO();
            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile5ActionPerformed

    private void btnTile6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile6ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile6.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile6.setText("X");
            btnTile6.setForeground(Color.BLUE);
            if (btnTile6.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile6.setText("O");
            btnTile6.setForeground(Color.RED);
            if (btnTile6.getText().equals("O")) {
                winnerO();
            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile6ActionPerformed

    private void btnTile8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile8ActionPerformed
        // TODO add your handling code here:
        btnRules.setEnabled(false);
        btnTile8.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile8.setText("X");
            btnTile8.setForeground(Color.BLUE);
            if (btnTile8.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile8.setText("O");
            btnTile8.setForeground(Color.RED);
            if (btnTile8.getText().equals("O")) {
                winnerO();

            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile8ActionPerformed

    private void btnTile9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTile9ActionPerformed
        // TODO add your handling code here:
                btnRules.setEnabled(false);
        btnTile9.setEnabled(false);
        ticTacToe++;

        if (ticTacToe % 2 == 1) {
            btnTile9.setText("X");
            btnTile9.setForeground(Color.BLUE);
            if (btnTile9.getText().equals("X")) {
                winnerX();
            }

        } else {
            btnTile9.setText("O");
            btnTile9.setForeground(Color.RED);
            if (btnTile9.getText().equals("O")) {
                winnerO();
            }

        }
        if (ticTacToe == 9) {
            lblScore.setText("Score: The match is a draw!");
            JOptionPane.showMessageDialog(this, "The match is a draw!", "Draw", JOptionPane.INFORMATION_MESSAGE);
            resetGame();
        }
    }//GEN-LAST:event_btnTile9ActionPerformed

    private void btnRulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRulesActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "First to match 3 X or O" + '\n' + "If no one matches 3 X or O," + '\n' + "The match is a draw.", "Rules", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnRulesActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnTile1;
    private javax.swing.JButton btnTile2;
    private javax.swing.JButton btnTile3;
    private javax.swing.JButton btnTile4;
    private javax.swing.JButton btnTile5;
    private javax.swing.JButton btnTile6;
    private javax.swing.JButton btnTile7;
    private javax.swing.JButton btnTile8;
    private javax.swing.JButton btnTile9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
