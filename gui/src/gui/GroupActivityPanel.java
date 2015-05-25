/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;

/**
 *
 * @author Arvid
 */
public class GroupActivityPanel extends javax.swing.JPanel {

    /**
     * Creates new form GroupActivityPanel
     */
    public GroupActivityPanel() {
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

        searchRadioGroup = new javax.swing.ButtonGroup();
        createPanel = new javax.swing.JPanel();
        createActivityLabel = new javax.swing.JLabel();
        createDateLabel = new javax.swing.JLabel();
        createStaffLabel = new javax.swing.JLabel();
        createLocationLabel = new javax.swing.JLabel();
        createCostLabel = new javax.swing.JLabel();
        createSpotsLabel = new javax.swing.JLabel();
        createActivityField = new javax.swing.JTextField();
        createDateField = new javax.swing.JTextField();
        createStaffField = new javax.swing.JTextField();
        createLocationField = new javax.swing.JTextField();
        createCostField = new javax.swing.JTextField();
        createSpotsField = new javax.swing.JTextField();
        createTimeLabel = new javax.swing.JLabel();
        createPhoneLabel = new javax.swing.JLabel();
        createAdressLabel = new javax.swing.JLabel();
        createTimeField = new javax.swing.JTextField();
        createPhoneField = new javax.swing.JTextField();
        createAdressField = new javax.swing.JTextField();
        createSaveButton = new javax.swing.JButton();
        updatePanel = new javax.swing.JPanel();
        changeActivityLabel = new javax.swing.JLabel();
        changeDateLabel = new javax.swing.JLabel();
        changeStaffLabel = new javax.swing.JLabel();
        changeLocationLabel = new javax.swing.JLabel();
        changeCostLabel = new javax.swing.JLabel();
        changeSpotsLabel = new javax.swing.JLabel();
        changeActivityField = new javax.swing.JTextField();
        changeDateField = new javax.swing.JTextField();
        changeStaffField = new javax.swing.JTextField();
        changeLocationField = new javax.swing.JTextField();
        changeCostField = new javax.swing.JTextField();
        changeSpotsField = new javax.swing.JTextField();
        changeSaveButton = new javax.swing.JButton();
        changeIdLabel = new javax.swing.JLabel();
        changeIdField = new javax.swing.JTextField();
        changeTimeLabel = new javax.swing.JLabel();
        changePhoneLabel = new javax.swing.JLabel();
        changeAdressLabel = new javax.swing.JLabel();
        changeTimeField = new javax.swing.JTextField();
        changePhoneField = new javax.swing.JTextField();
        changeAdressField = new javax.swing.JTextField();
        GrpActivityLabel = new javax.swing.JLabel();
        searchPanel = new javax.swing.JPanel();
        searchLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchNameRadioButton = new javax.swing.JRadioButton();
        searchDateRadioButton = new javax.swing.JRadioButton();
        searchButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        changeButton = new javax.swing.JButton();
        handleLabel = new javax.swing.JLabel();
        resultScrollPane = new javax.swing.JScrollPane();
        searchResultList = new javax.swing.JList();
        registerButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));

        createPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Skapa"));

        createActivityLabel.setText("Aktivitet");

        createDateLabel.setText("Datum");

        createStaffLabel.setText("Ansvarig");

        createLocationLabel.setText("Plats");

        createCostLabel.setText("Kostnad");

        createSpotsLabel.setText("Antal platser");

        createTimeLabel.setText("Tid");

        createPhoneLabel.setText("Telefon nr");

        createAdressLabel.setText("Adress");

        createSaveButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        createSaveButton.setText("Spara");
        createSaveButton.setPreferredSize(new java.awt.Dimension(70, 23));

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createActivityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createActivityField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createDateField))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createStaffField))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createLocationField))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createCostField))
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addComponent(createSpotsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createSpotsField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(createPanelLayout.createSequentialGroup()
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(createTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createPhoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(createAdressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createTimeField)
                            .addComponent(createPhoneField)
                            .addComponent(createAdressField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(createSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createActivityLabel)
                    .addComponent(createActivityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createDateLabel)
                    .addComponent(createDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createTimeLabel)
                    .addComponent(createTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createStaffLabel)
                    .addComponent(createStaffField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createPhoneLabel)
                    .addComponent(createPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createLocationLabel)
                    .addComponent(createLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAdressLabel)
                    .addComponent(createAdressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCostLabel)
                    .addComponent(createCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createSpotsLabel)
                    .addComponent(createSpotsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ändra"));

        changeActivityLabel.setText("Aktivitet");

        changeDateLabel.setText("Datum");

        changeStaffLabel.setText("Ansvarig");

        changeLocationLabel.setText("Plats");

        changeCostLabel.setText("Kostnad");

        changeSpotsLabel.setText("Antal platser");

        changeSaveButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        changeSaveButton.setText("Spara");
        changeSaveButton.setPreferredSize(new java.awt.Dimension(70, 23));

        changeIdLabel.setText("ID nummer");

        changeIdField.setEditable(false);

        changeTimeLabel.setText("Tid");

        changePhoneLabel.setText("Telefon nr");

        changeAdressLabel.setText("Adress");

        javax.swing.GroupLayout updatePanelLayout = new javax.swing.GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePanelLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(changeDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeDateField))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(changeStaffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeStaffField))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(changeLocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeLocationField))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(changeCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeCostField))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addComponent(changeSpotsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeSpotsField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeIdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changeActivityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeActivityField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(changeIdField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(updatePanelLayout.createSequentialGroup()
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeTimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePhoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(changeAdressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(changeTimeField)
                            .addComponent(changePhoneField)
                            .addComponent(changeAdressField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addComponent(changeSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePanelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeIdLabel)
                    .addComponent(changeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeActivityLabel)
                    .addComponent(changeActivityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeDateLabel)
                    .addComponent(changeDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeTimeLabel)
                    .addComponent(changeTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeStaffLabel)
                    .addComponent(changeStaffField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePhoneLabel)
                    .addComponent(changePhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeLocationLabel)
                    .addComponent(changeLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeAdressLabel)
                    .addComponent(changeAdressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeCostLabel)
                    .addComponent(changeCostField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(updatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeSpotsLabel)
                    .addComponent(changeSpotsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        GrpActivityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        GrpActivityLabel.setText("Gruppaktivitet");

        searchPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sök"));

        searchLabel.setText("Sök:");

        searchField.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        searchField.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        searchField.setText("Sökfält");

        searchRadioGroup.add(searchNameRadioButton);
        searchNameRadioButton.setText("Namn");

        searchRadioGroup.add(searchDateRadioButton);
        searchDateRadioButton.setText("Datum");

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        searchButton.setText("Sök");
        searchButton.setPreferredSize(new java.awt.Dimension(70, 23));

        removeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        removeButton.setText("Ta bort");
        removeButton.setPreferredSize(new java.awt.Dimension(80, 23));

        changeButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        changeButton.setText("Ändra");
        changeButton.setPreferredSize(new java.awt.Dimension(80, 23));

        handleLabel.setText("Hantera markerad aktivitet:");

        resultScrollPane.setViewportView(searchResultList);

        registerButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        registerButton.setText("Anmälan");
        registerButton.setPreferredSize(new java.awt.Dimension(80, 23));

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultScrollPane)
                    .addGroup(searchPanelLayout.createSequentialGroup()
                        .addComponent(searchLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchNameRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchDateRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(handleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchNameRadioButton)
                    .addComponent(searchDateRadioButton)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(handleLabel)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addContainerGap())
        );

        backButton.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        backButton.setText("Tillbaka");
        backButton.setPreferredSize(new java.awt.Dimension(80, 23));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GrpActivityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GrpActivityLabel)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        GrpActivityLabel.getAccessibleContext().setAccessibleName("grpActivityLabel");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GrpActivityLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField changeActivityField;
    private javax.swing.JLabel changeActivityLabel;
    private javax.swing.JTextField changeAdressField;
    private javax.swing.JLabel changeAdressLabel;
    private javax.swing.JButton changeButton;
    private javax.swing.JTextField changeCostField;
    private javax.swing.JLabel changeCostLabel;
    private javax.swing.JTextField changeDateField;
    private javax.swing.JLabel changeDateLabel;
    private javax.swing.JTextField changeIdField;
    private javax.swing.JLabel changeIdLabel;
    private javax.swing.JTextField changeLocationField;
    private javax.swing.JLabel changeLocationLabel;
    private javax.swing.JTextField changePhoneField;
    private javax.swing.JLabel changePhoneLabel;
    private javax.swing.JButton changeSaveButton;
    private javax.swing.JTextField changeSpotsField;
    private javax.swing.JLabel changeSpotsLabel;
    private javax.swing.JTextField changeStaffField;
    private javax.swing.JLabel changeStaffLabel;
    private javax.swing.JTextField changeTimeField;
    private javax.swing.JLabel changeTimeLabel;
    private javax.swing.JTextField createActivityField;
    private javax.swing.JLabel createActivityLabel;
    private javax.swing.JTextField createAdressField;
    private javax.swing.JLabel createAdressLabel;
    private javax.swing.JTextField createCostField;
    private javax.swing.JLabel createCostLabel;
    private javax.swing.JTextField createDateField;
    private javax.swing.JLabel createDateLabel;
    private javax.swing.JTextField createLocationField;
    private javax.swing.JLabel createLocationLabel;
    private javax.swing.JPanel createPanel;
    private javax.swing.JTextField createPhoneField;
    private javax.swing.JLabel createPhoneLabel;
    private javax.swing.JButton createSaveButton;
    private javax.swing.JTextField createSpotsField;
    private javax.swing.JLabel createSpotsLabel;
    private javax.swing.JTextField createStaffField;
    private javax.swing.JLabel createStaffLabel;
    private javax.swing.JTextField createTimeField;
    private javax.swing.JLabel createTimeLabel;
    private javax.swing.JLabel handleLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JScrollPane resultScrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton searchDateRadioButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JRadioButton searchNameRadioButton;
    private javax.swing.JPanel searchPanel;
    private javax.swing.ButtonGroup searchRadioGroup;
    private javax.swing.JList searchResultList;
    private javax.swing.JPanel updatePanel;
    // End of variables declaration//GEN-END:variables
    //JButtons
    public JButton getBackButton() { return backButton; }
    public JButton getChangeButton() { return changeButton; }
    public JButton getChangeSaveButton() { return changeSaveButton; }
    public JButton getCreateSaveButton() { return createSaveButton; }
    public JButton getRegisterButton() { return registerButton; }
    public JButton getRemoveButton() { return removeButton; }
    public JButton getSearchButton() { return searchButton; }
    
    // Ändra aktivtet textfields
    public JTextField getChangeActivityField() { return changeActivityField; }
    public JTextField getChangeAdressField() { return changeAdressField; }
    public JTextField getChangeCostField() { return changeCostField; }
    public JTextField getChangeDateField() { return changeDateField; }
    public JTextField getChangeIdField() { return changeIdField; }
    public JTextField getChangeLocationField() { return changeLocationField; }
    public JTextField getChangePhoneField() { return changePhoneField; }
    public JTextField getChangeSpotsField() { return changeSpotsField; }
    public JTextField getChangeStaffField() { return changeStaffField; }
    public JTextField getChangeTimeField() { return changeTimeField; }
    
    // Spara ny aktivtet textfields 
    public JTextField getCreateActivityField() { return createActivityField; }
    public JTextField getCreateAdressField() { return createAdressField; }
    public JTextField getCreateCostField() { return createCostField; }
    public JTextField getCreateDateField() { return createDateField; }
    public JTextField getCreateLocationField() { return createLocationField; }
    public JTextField getCreatePhoneField() { return createPhoneField; }
    public JTextField getCreateSpotsField() { return createSpotsField; }
    public JTextField getCreateStaffField() { return createStaffField; }
    public JTextField getCreateTimeField() { return createTimeField; }
    
    // Search panelstuff
    public JRadioButton getDateRadio() { return searchDateRadioButton; }
    public JRadioButton getNameRadio() { return searchNameRadioButton; }
    public JTextField getSearchField() { return searchField; }
    public JList getSearchResultList() { return searchResultList; }
    //public JScrollPane getResultScrollPane() { return resultScrollPane; }
    public void setSearchResultList(JList result) { searchResultList = result; }
    public void updateResultPane() { resultScrollPane.setViewportView(searchResultList); }
       
}
