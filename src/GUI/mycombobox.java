package GUI;


/**
 *
 * @author ADMIN
 */
public class mycombobox {
    Object value;//lưu mã
    Object text;// lưu tên

    

   

    public mycombobox(Object value, Object text) {
        this.value = value;
        this.text = text;
    }
    
    
    @Override
    public String toString(){
    return text.toString();
        
    }
    

}