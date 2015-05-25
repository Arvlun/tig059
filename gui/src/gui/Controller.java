package gui;




import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import server.function.ActivityDB;
import server.model.*;


public class Controller {

	private MainFrame mainF = null;
	private StartFrame st = null;
        private GroupActivityPanel gPanel = null;
        private VisitActivityPanel vPanel = null;
        private PrivateActivityPanel pPanel = null;
        private ListActivityPanel lPanel = null;
        private GroupRegisterWindow regWindow = null;
    
	public Controller(MainFrame main, StartFrame sP, GroupActivityPanel gP, VisitActivityPanel vP, PrivateActivityPanel pP, ListActivityPanel lP) {
		mainF = main;
                st = sP;
                gPanel = gP;
                vPanel = vP;
                pPanel = pP;
                lPanel = lP;
                regWindow = new GroupRegisterWindow(mainF, false);
                setListeners();
	}
        
        private class GrpButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                mainF.setContentPane(gPanel);
                mainF.pack();
            
            }    
        }
        
        private class VisButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                mainF.setContentPane(vPanel);
                mainF.pack();
            
            }    
        }
        
        private class PrivButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                mainF.setContentPane(pPanel);
                mainF.pack();
            
            }    
        }
        
        private class ListButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                mainF.setContentPane(lPanel);
                mainF.pack();
            }    
        }
        
        private class BackButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                mainF.setContentPane(st);
                mainF.pack();
            }    
        }
        // type = 0 or 1 for create or update panel
        private GroupActivity createGroupActivityField(int type) {
            boolean contin = true;
            GroupActivity ga = null;
            if (!checkAllFields(0, type)) {
                contin = false;
            }
            int cost = 0, spots = 0, id = 0;
            if (type == 0) {
                try {
                    cost = Integer.parseInt(gPanel.getCreateCostField().getText());
                    spots = Integer.parseInt(gPanel.getCreateSpotsField().getText());
                } catch (NumberFormatException ne) {
                    System.out.println(ne.getMessage());
                    ne.printStackTrace();
                    contin = false;
                }
            } else if (type == 1) {
                try {
                    id = Integer.parseInt(gPanel.getChangeIdField().getText());
                    cost = Integer.parseInt(gPanel.getChangeCostField().getText());
                    spots = Integer.parseInt(gPanel.getChangeSpotsField().getText());
                } catch (NumberFormatException ne) {
                    System.out.println(ne.getMessage());
                    ne.printStackTrace();
                    contin = false;
                }
            }
            if (contin && type == 0 ) {
                String act = gPanel.getCreateActivityField().getText();
                String date = gPanel.getCreateDateField().getText();
                String time = gPanel.getCreateTimeField().getText();
                String location = gPanel.getCreateLocationField().getText();
                String adress = gPanel.getCreateAdressField().getText();
                String staff = gPanel.getCreateStaffField().getText();
                String phone = gPanel.getCreatePhoneField().getText();
                ga = new GroupActivity(act, date, time, staff, phone, location, adress, cost, spots);
                //System.out.println(ga);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
            } else if (contin && type == 1)  {
                String act = gPanel.getChangeActivityField().getText();
                String date = gPanel.getChangeDateField().getText();
                String time = gPanel.getChangeTimeField().getText();
                String location = gPanel.getChangeLocationField().getText();
                String adress = gPanel.getChangeAdressField().getText();
                String staff = gPanel.getChangeStaffField().getText();
                String phone = gPanel.getChangePhoneField().getText();
                ga = new GroupActivity(id, act, date, time, staff, phone, location, adress, cost, spots);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println(ga);
            } else {
                //System.out.println("klara inte checkcheck"); 
                JOptionPane.showMessageDialog(null, "Se till att alla fält är ifyllda och ifylla rätt", "Formulär fel", JOptionPane.ERROR_MESSAGE);
            }
            return ga;
        }
        
        // type = 0 or 1 for create or update panel
        private VisitActivity createVisitActivityField(int type) {
            boolean contin = true;
            VisitActivity va = null;
            int id = 0;
            if (!checkAllFields(1, type)) {
                contin = false;
            }
            if (type == 1) {
                try {
                   id = Integer.parseInt(vPanel.getChangeIdField().getText()); 
                } catch (NumberFormatException ne) {
                    System.out.println("Fel med activity id");
                    System.out.println(ne.getMessage());
                    contin = false;
		}  
            }
            
            if (contin && type == 0) {
                String act = vPanel.getCreateActivityField().getText();
                String date = vPanel.getCreateDateField().getText();
                String time = vPanel.getCreateTimeField().getText();
                String location = vPanel.getCreateLocationField().getText();
                String staff = vPanel.getCreateStaffField().getText();
                String phone = vPanel.getCreatePhoneField().getText();
                String duration = vPanel.getCreateDurationField().getText();
                va = new VisitActivity(act, date, time, staff, phone, location, duration);
                //System.out.println(va);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
            } else if (contin && type == 1) {
                String act = vPanel.getChangeActivityField().getText();
                String date = vPanel.getChangeDateField().getText();
                String time = vPanel.getChangeTimeField().getText();
                String location = vPanel.getChangeLocationField().getText();
                String staff = vPanel.getChangeStaffField().getText();
                String phone = vPanel.getChangePhoneField().getText();
                String duration = vPanel.getChangeDurationField().getText();
                System.out.println(String.format("%d %s %s %s %s %s %s %s",id, act, date, time, staff, phone, location, duration));
                va = new VisitActivity(id, act, date, time, staff, phone, location, duration);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
                //System.out.println(va);
            } else {
                //System.out.println("klara inte checkcheck");
                JOptionPane.showMessageDialog(null, "Se till att alla fält är ifyllda och ifylla rätt", "Formulär fel", JOptionPane.ERROR_MESSAGE);
            }
            return va;
        }
        
        // type = 0 or 1 for create or update panel
        private PrivateActivity createPrivateActivityField(int type) {
            PrivateActivity pa = null; 
            boolean contin = true;
            int id = 0;
            if (!checkAllFields(2, type)) {
                contin = false;
            }
            
            if (type == 1) {
                try {
                   id = Integer.parseInt(pPanel.getChangeIdField().getText()); 
                } catch (NumberFormatException ne) {
                    System.out.println("Fel med activity id");
                    contin = false;
		}  
            }
            
            if (contin && type == 0 ) {
                String act = pPanel.getCreateActivityField().getText();
                String date = pPanel.getCreateDateField().getText();
                String time = pPanel.getCreateTimeField().getText();
                String location = pPanel.getCreateLocationField().getText();
                String adress = pPanel.getCreateAdressField().getText();
                String staff = pPanel.getCreateStaffField().getText();
                String phone = pPanel.getCreatePhoneField().getText();
                String name = pPanel.getCreateNameField().getText();
                String ass = pPanel.getCreateAssistanceField().getText();
                
                pa = new PrivateActivity(act, date, time, staff, phone, location, adress, name, ass);
                //System.out.println(pa);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
            } else if (contin && type == 1)  {
                String act = pPanel.getChangeActivityField().getText();
                String date = pPanel.getChangeDateField().getText();
                String time = pPanel.getChangeTimeField().getText();
                String location = pPanel.getChangeLocationField().getText();
                String adress = pPanel.getChangeAdressField().getText();
                String staff = pPanel.getChangeStaffField().getText();
                String phone = pPanel.getChangePhoneField().getText();
                String name = pPanel.getChangeNameField().getText();
                String ass = pPanel.getChangeAssistanceField().getText();
                pa = new PrivateActivity(id, act, date, time, staff, phone, location, adress, name, ass);
                //System.out.println(pa);
                JOptionPane.showMessageDialog(null, "Aktivitenten har blivit sparad i systemet.", "Aktivitet sparad!", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //System.out.println("klara inte checkcheck"); 
                JOptionPane.showMessageDialog(null, "Se till att alla fält är ifyllda och ifylla rätt", "Formulär fel", JOptionPane.ERROR_MESSAGE);
            }
            return pa;
        }
        
        //type should be 0
        private class CreateSaveButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == gPanel.getCreateSaveButton()) {
                    GroupActivity ga = createGroupActivityField(0);
                    ActivityDB.saveActivity(ga);
                } else if (ae.getSource() == vPanel.getCreateSaveButton()) {
                    VisitActivity va = createVisitActivityField(0);
                    ActivityDB.saveActivity(va);
                } else if (ae.getSource() == pPanel.getCreateSaveButton()) {
                    PrivateActivity pa = createPrivateActivityField(0);
                    ActivityDB.saveActivity(pa);
                }
            }    
        }
        
        // type should be 1
        private class ChangeSaveButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == gPanel.getChangeSaveButton()) {
                    GroupActivity ga = createGroupActivityField(1);
                    ActivityDB.updateActivity(ga);
                } else if (ae.getSource() == vPanel.getChangeSaveButton()) {
                    VisitActivity va = createVisitActivityField(1);
                    ActivityDB.updateActivity(va);
                } else if (ae.getSource() == pPanel.getChangeSaveButton()) {
                    PrivateActivity pa = createPrivateActivityField(1);
                    ActivityDB.updateActivity(pa);
                }
            }    
        }
        
        private boolean isEmpty(JTextField field){
            return field.getText().length()==0;
        }
        
        // frame 0,1,2 grp, vis, priv - type 0,1 create, change
        private boolean checkAllFields(int frame, int type) {
            if (frame == 0) {// GRP PANEL
                if (type == 0) { // SAVE
                    if (isEmpty(gPanel.getCreateActivityField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateDateField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateTimeField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateLocationField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateAdressField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateStaffField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreatePhoneField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateCostField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getCreateSpotsField())) {
                       return false;
                    }
                } else if (type == 1) { // UPDATE
                    if (isEmpty(gPanel.getChangeActivityField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeDateField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeTimeField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeLocationField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeAdressField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeStaffField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangePhoneField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeCostField())) {
                       return false;
                    }
                    if (isEmpty(gPanel.getChangeSpotsField())) {
                       return false;
                    }
                }
            } else if (frame == 1) { // VIS PANEL
                if (type == 0) { //CrEATE
                    if (isEmpty(vPanel.getCreateActivityField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getCreateDateField())) {
                       return false;
                   }
                    if (isEmpty(vPanel.getCreateTimeField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getCreateLocationField())) {
                       return false;
                    }

                    if (isEmpty(vPanel.getCreateStaffField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getCreatePhoneField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getCreateDurationField())) {
                       return false;
                    }
                } else if (type == 1) { //UPDATE
                    if (isEmpty(vPanel.getChangeActivityField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getChangeDateField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getChangeTimeField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getChangeLocationField())) { // AVDELNING hamnar i adress i object
                       return false;
                    }
                    if (isEmpty(vPanel.getChangeStaffField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getChangePhoneField())) {
                       return false;
                    }
                    if (isEmpty(vPanel.getChangeDurationField())) {
                       return false;
                    }
                }
            } else if (frame == 2) { // priv panel
                if (type == 0) { //CrEATE
                    if (isEmpty(pPanel.getCreateActivityField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateDateField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateTimeField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateLocationField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateAdressField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateStaffField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreatePhoneField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateNameField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getCreateAssistanceField())) {
                       return false;
                    }
                } else if (type == 1) { //UPDATE
                    if (isEmpty(pPanel.getChangeActivityField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeDateField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeTimeField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeLocationField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeAdressField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeStaffField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangePhoneField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeNameField())) {
                       return false;
                    }
                    if (isEmpty(pPanel.getChangeAssistanceField())) {
                        return false;
                    }
            }
        }
        return true;
        }
        
        // frame 0 = groupframe, frame 1 = listframe
        public void populateGroupList(ArrayList<GroupActivity> arrList, int frame) {
            GroupActivity[] items = new GroupActivity[arrList.size()];
            arrList.toArray(items);
            JList result = new JList(items);
            if (frame == 0) {
                gPanel.setSearchResultList(result);
                gPanel.updateResultPane();
            } else if (frame == 1) {
                lPanel.setActivitiesResultList(result);
                lPanel.updateResultPane();
            }
        }
        
        public void populateVisitList(ArrayList<VisitActivity> arrList, int frame) {
            VisitActivity[] items = new VisitActivity[arrList.size()];
            arrList.toArray(items);
            JList result = new JList(items);
            if (frame == 0) {
                vPanel.setSearchResultList(result);
                vPanel.updateResultPane();
            } else if (frame == 1) {
                lPanel.setActivitiesResultList(result);
                lPanel.updateResultPane();
            }
        }
        
        public void populatePrivateList(ArrayList<PrivateActivity> arrList, int frame) {
            PrivateActivity[] items = new PrivateActivity[arrList.size()];
            arrList.toArray(items);
            JList result = new JList(items);
            if (frame == 0) {
                pPanel.setSearchResultList(result);
                pPanel.updateResultPane();
            } else if (frame == 1) {
                lPanel.setActivitiesResultList(result);
                lPanel.updateResultPane();
            }
        }
        
        public void populateFullList(ArrayList<Activity> arrList) {
            Activity[] items = new Activity[arrList.size()];
            arrList.toArray(items);
            JList result = new JList(items);
            lPanel.setActivitiesResultList(result);
            lPanel.updateResultPane();
        }
        
        public void populateRegisterList(ArrayList<Registration> arrList) {
            Registration[] items = new Registration[arrList.size()];
            arrList.toArray(items);
            JList result = new JList(items);
            regWindow.setPersonsList(result);
            regWindow.updatePersonsPane();
        }
        
        private class SearchButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == gPanel.getSearchButton()) {
                    if(gPanel.getDateRadio().isSelected()) {
                        populateGroupList(ActivityDB.getGroupActivitySearchResult(1, gPanel.getSearchField().getText()), 0);
                    } else if (gPanel.getNameRadio().isSelected()) {
                        populateGroupList(ActivityDB.getGroupActivitySearchResult(0, gPanel.getSearchField().getText()), 0);
                    } else {
                        //söker alla om ingen är kryssad
                        populateGroupList(ActivityDB.getGroupActivitySearchResult(2, null), 0);
                    }                    
                } else if (ae.getSource() == vPanel.getSearchButton()) {
                    if(vPanel.getDateRadio().isSelected()) {
                        populateVisitList(ActivityDB.getVisitActivitySearchResult(1, vPanel.getSearchField().getText()), 0);
                    } else if (vPanel.getNameRadio().isSelected()) {
                        populateVisitList(ActivityDB.getVisitActivitySearchResult(0, vPanel.getSearchField().getText()), 0);
                    } else {
                        //söker alla om ingen är kryssad
                        populateVisitList(ActivityDB.getVisitActivitySearchResult(2, null), 0);
                    }
                } else if (ae.getSource() == pPanel.getSearchButton()) {
                    if(pPanel.getDateRadio().isSelected()) {
                        populatePrivateList(ActivityDB.getPrivateActivitySearchResult(1, pPanel.getSearchField().getText()), 0);
                    } else if (pPanel.getNameRadio().isSelected()) {
                        populatePrivateList(ActivityDB.getPrivateActivitySearchResult(0, pPanel.getSearchField().getText()), 0);
                    } else {
                        //söker alla om ingen är kryssad
                        populatePrivateList(ActivityDB.getPrivateActivitySearchResult(2, null), 0);
                    }
                }
            }    
        }
        
        private class ListActivitiesButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if(lPanel.getGroupRadio().isSelected()) {
                    populateGroupList(ActivityDB.getGroupActivitySearchResult(2, null), 1);
                } else if (lPanel.getVisitRadio().isSelected()) {
                    populateVisitList(ActivityDB.getVisitActivitySearchResult(2, null), 1);
                } else if (lPanel.getPrivateRadio().isSelected()) {
                    populatePrivateList(ActivityDB.getPrivateActivitySearchResult(2, null), 1);
                } else if (lPanel.getAllRadio().isSelected()) {
                    populateFullList(ActivityDB.getAllActivity());
                } else {
                    System.out.println("shouldnt happen");
                }                 
            }    
        }
        
        
        private class RemoveButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == gPanel.getRemoveButton()) {
                    GroupActivity sel = (GroupActivity) gPanel.getSearchResultList().getSelectedValue();
                    ActivityDB.removeActivity(sel);
                } else if (ae.getSource() == vPanel.getRemoveButton()) {
                    VisitActivity sel = (VisitActivity) vPanel.getSearchResultList().getSelectedValue();
                    ActivityDB.removeActivity(sel);
                } else if (ae.getSource() == pPanel.getRemoveButton()) {
                    PrivateActivity sel = (PrivateActivity) pPanel.getSearchResultList().getSelectedValue();
                    ActivityDB.removeActivity(sel);
                }
            }    
        }
        
        private class ChangeButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == gPanel.getChangeButton()) {
                    GroupActivity sel = (GroupActivity) gPanel.getSearchResultList().getSelectedValue();
                    gPanel.getChangeIdField().setText("" + sel.getId());
                    gPanel.getChangeActivityField().setText(sel.getActivity());
                    gPanel.getChangeDateField().setText(sel.getDate());
                    gPanel.getChangeTimeField().setText(sel.getTime());
                    gPanel.getChangeLocationField().setText(sel.getLocation());
                    gPanel.getChangeAdressField().setText(sel.getAdress());
                    gPanel.getChangeStaffField().setText(sel.getStaff());
                    gPanel.getChangePhoneField().setText(sel.getPhone());
                    
                    gPanel.getChangeCostField().setText("" + sel.getCost());
                    gPanel.getChangeSpotsField().setText("" + sel.getSpots());
                    
                    
                    
                } else if (ae.getSource() == vPanel.getChangeButton()) {
                    VisitActivity sel = (VisitActivity) vPanel.getSearchResultList().getSelectedValue();
                    vPanel.getChangeIdField().setText("" + sel.getId());
                    vPanel.getChangeActivityField().setText(sel.getActivity());
                    vPanel.getChangeDateField().setText(sel.getDate());
                    vPanel.getChangeTimeField().setText(sel.getTime());
                    vPanel.getChangeLocationField().setText(sel.getAdress());
                    vPanel.getChangeStaffField().setText(sel.getStaff());
                    vPanel.getChangePhoneField().setText(sel.getPhone());
                    
                    vPanel.getChangeDurationField().setText(sel.getDuration());
                } else if (ae.getSource() == pPanel.getChangeButton()) {
                    PrivateActivity sel = (PrivateActivity) pPanel.getSearchResultList().getSelectedValue();
                    pPanel.getChangeIdField().setText("" + sel.getId());
                    pPanel.getChangeActivityField().setText(sel.getActivity());
                    pPanel.getChangeDateField().setText(sel.getDate());
                    pPanel.getChangeTimeField().setText(sel.getTime());
                    pPanel.getChangeLocationField().setText(sel.getLocation());
                    pPanel.getChangeAdressField().setText(sel.getAdress());
                    pPanel.getChangeStaffField().setText(sel.getStaff());
                    pPanel.getChangePhoneField().setText(sel.getPhone());
                    
                    pPanel.getChangeNameField().setText(sel.getName());
                    pPanel.getChangeAssistanceField().setText(sel.getAssistance());
                }
            }    
        }
        
        private class RegisterButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (!regWindow.isVisible()) {
                    GroupActivity sel = (GroupActivity) gPanel.getSearchResultList().getSelectedValue();
                    populateRegisterList(ActivityDB.getRegisterList(sel.getId()));
                    regWindow.getActivityIdLabel().setText(""+sel.getId());
                    regWindow.setLocationRelativeTo(mainF);
                    regWindow.setVisible(true);
                }
            }    
        }

        private class RegisterFrameButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if (ae.getSource() == regWindow.getRegisterButton()) {
                    int id = Integer.parseInt(regWindow.getActivityIdLabel().getText());
                    
                    if (!isEmpty(regWindow.getPersonNameField())) {
                        //System.out.println("" + id + regWindow.getPersonNameField().getText());
                        Registration reg = new Registration(regWindow.getPersonNameField().getText(), regWindow.getAssistanceField().getText());
                        ActivityDB.registerResident(id, reg);
                        populateRegisterList(ActivityDB.getRegisterList(1));
                    } else {
                        JOptionPane.showMessageDialog(null, "Fyll i namn.", "Formulär fel", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    
                } else if (ae.getSource() == regWindow.getDeregisterButton()) {
                    int id = Integer.parseInt(regWindow.getActivityIdLabel().getText());
                    Registration reg = (Registration) regWindow.getPersonsList().getSelectedValue();
                    ActivityDB.deregisterResident(id, reg);
                    populateRegisterList(ActivityDB.getRegisterList(id));
                }
            }    
        }
        
        

    
        private void setListeners() {
            
            GrpButtonListener gListen = new GrpButtonListener();
            VisButtonListener vListen = new VisButtonListener();
            PrivButtonListener pListen = new PrivButtonListener();
            ListButtonListener lListen = new ListButtonListener();
            st.getGrpButton().addActionListener(gListen);
            st.getVisButton().addActionListener(vListen);
            st.getPrivButton().addActionListener(pListen);
            st.getListButton().addActionListener(lListen);
            
            BackButtonListener backListen = new BackButtonListener();
            gPanel.getBackButton().addActionListener(backListen);
            vPanel.getBackButton().addActionListener(backListen);
            pPanel.getBackButton().addActionListener(backListen);
            lPanel.getBackButton().addActionListener(backListen);
            
            CreateSaveButtonListener createSaveListen = new CreateSaveButtonListener();
            gPanel.getCreateSaveButton().addActionListener(createSaveListen);
            vPanel.getCreateSaveButton().addActionListener(createSaveListen);
            pPanel.getCreateSaveButton().addActionListener(createSaveListen);
            
            ChangeSaveButtonListener changeSaveListen = new ChangeSaveButtonListener();
            gPanel.getChangeSaveButton().addActionListener(changeSaveListen);
            vPanel.getChangeSaveButton().addActionListener(changeSaveListen);
            pPanel.getChangeSaveButton().addActionListener(changeSaveListen);
            
            SearchButtonListener searchListen = new SearchButtonListener();
            gPanel.getSearchButton().addActionListener(searchListen);
            vPanel.getSearchButton().addActionListener(searchListen);
            pPanel.getSearchButton().addActionListener(searchListen);
            
            ChangeButtonListener changeListen = new ChangeButtonListener();
            gPanel.getChangeButton().addActionListener(changeListen);
            vPanel.getChangeButton().addActionListener(changeListen);
            pPanel.getChangeButton().addActionListener(changeListen);
            
            RemoveButtonListener removeListen = new RemoveButtonListener();
            gPanel.getRemoveButton().addActionListener(removeListen);
            vPanel.getRemoveButton().addActionListener(removeListen);
            pPanel.getRemoveButton().addActionListener(removeListen);
            
            RegisterButtonListener regListen = new RegisterButtonListener();
            gPanel.getRegisterButton().addActionListener(regListen);
            
            RegisterFrameButtonListener dregListen = new RegisterFrameButtonListener();
            regWindow.getRegisterButton().addActionListener(dregListen);
            regWindow.getDeregisterButton().addActionListener(dregListen);
            
            ListActivitiesButtonListener listListener = new ListActivitiesButtonListener();
            lPanel.getListActivitiesButton().addActionListener(listListener);
            
            
                                                           
        }

}