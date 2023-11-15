package Controller;

public class cls_workers {

    private String str_name, str_code, str_sex, str_contact, str_address, str_mail;

    public cls_workers(String str_name, String str_code, String str_sex, String str_contact, String str_address, String str_mail) {
        this.str_name = str_name;
        this.str_code = str_code;
        this.str_sex = str_sex;
        this.str_contact = str_contact;
        this.str_address = str_address;
        this.str_mail = str_mail;
    }

    public String getStr_name() {return str_name;}

    public void setStr_name(String str_name) {this.str_name = str_name;}

    public String getStr_code() {return str_code;}

    public String getStr_sex() {return str_sex;}

    public void setStr_sex(String str_sex) {this.str_sex = str_sex;}

    public String getStr_contact() {return str_contact;}

    public void setStr_contact(String str_contact) {this.str_contact = str_contact;}

    public String getStr_address() {return str_address;}

    public void setStr_address(String str_address) {this.str_address = str_address;}

    public String getStr_mail() {return str_mail;}

    public void setStr_mail(String str_mail) {this.str_mail = str_mail;}
    
    
}
