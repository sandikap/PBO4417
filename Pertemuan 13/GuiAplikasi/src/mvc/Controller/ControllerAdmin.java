/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import mvc.Koneksi.*;
import mvc.Model.*;
import mvc.View.*;
import mvc.Dao.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rizqullahramadhan
 */
public final class ControllerAdmin {
    FormAdmin form;
    DaoInterface iuser;
    List<ModelUser> listUser;
    
    public ControllerAdmin(FormAdmin form) {
        this.form = form;
        iuser = new KoneksiQuery();
        listUser = iuser.getAll();
    }
    public void showData() {
        listUser = iuser.getAll();
        TabelModel tmUser = new TabelModel(listUser);
        form.getTabelData().setModel(tmUser);
    }
    public void delete() {
        if (!form.getTxtId().getText().trim().isEmpty()) {
            int id = Integer.parseInt(form.getTxtId().getText());
            iuser.delete(id);
            JOptionPane.showMessageDialog(null, "Delete Data  Success");
            reset();
        }
    
    }
    
    public void reset() {
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtUsia().setText("");
        form.getTxtAlamat().setText("");
        form.getTxtNik().setText("");
        form.getTxtId().setText("");
    }
    public void editData(int row) {
        form.getTxtId().setText(listUser.get(row).getId().toString());
        form.getTxtNik().setText(listUser.get(row).getNik());
        form.getTxtNama().setText(listUser.get(row).getNama());
        form.getCmbJK().setSelectedItem(listUser.get(row).getJk());
        form.getTxtAlamat().setText(listUser.get(row).getAlamat());
        form.getTxtUsia().setText(listUser.get(row).getUsia().toString());
        form.getTxtAlasan().setText(listUser.get(row).getAlasan());   
    }

    public void update() {

        if (!form.getTxtId().getText().trim().isEmpty()) {
            ModelUser user = new ModelUser();
            user.setNik(form.getTxtNik().getText());
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getCmbJK().getSelectedItem().toString());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setUsia(Integer.parseInt(form.getTxtUsia().getText()));
            user.setAlasan(form.getTxtAlasan().getText());

            user.setId(Integer.parseInt(form.getTxtId().getText()));
            iuser.update(user);
            JOptionPane.showMessageDialog(null, "Update Success");
            reset();
        } else {
            JOptionPane.showMessageDialog(form, "Please select data first");
        }
    }
    
        public void insert() {
        if (!form.getTxtNik().getText().trim().isEmpty() || !form.getTxtNama().getText().trim().isEmpty() || !form.getTxtAlamat().getText().trim().isEmpty() || !form.getTxtUsia().getText().trim().isEmpty() || !form.getTxtAlasan().getText().trim().isEmpty()) {
            ModelUser user = new ModelUser();
            user.setNik(form.getTxtNik().getText());
            user.setNama(form.getTxtNama().getText());
            user.setJk(form.getCmbJK().getSelectedItem().toString());
            user.setAlamat(form.getTxtAlamat().getText());
            user.setUsia(Integer.parseInt(form.getTxtUsia().getText()));
            user.setAlasan(form.getTxtAlasan().getText());
            iuser.insert(user);
            JOptionPane.showMessageDialog(null, "Register Success");
            reset();
        }else{
            JOptionPane.showMessageDialog(form, "Data Can not empty");
        }
    }

}



