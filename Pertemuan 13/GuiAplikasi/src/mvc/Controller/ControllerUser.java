/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.Koneksi.*;
import mvc.Dao.DaoInterface;
import mvc.Model.*;
import mvc.View.*;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author rizqullahramadhan
 */
public final class ControllerUser {
    FormUser form;
    DaoInterface iuser;
    List<ModelUser> listUser;
    
    public ControllerUser(FormUser form) {
        this.form = form;
        iuser =  new KoneksiQuery();
        listUser = iuser.getAll();
        
    }

    
    public void isiTable(){
        listUser = iuser.getAll();
        TabelModel tmb = new TabelModel(listUser);
    }

    public void reset() {
        form.getTxtNik().setText("");
        form.getTxtNama().setText("");
        form.getTxtAlasan().setText("");
        form.getTxtUsia().setText("");
        form.getTxtAlamat().setText("");
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
