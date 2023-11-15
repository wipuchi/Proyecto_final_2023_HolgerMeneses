package Controller;


public class cls_allotment {
    
    private String str_name, str_code, str_extension, str_address, str_crop, str_worker_code;
    
    
     public cls_allotment(String str_name, String str_code, String str_extension, String str_address, String str_crop, String str_worker_code, String text6) {
        this.str_name = str_name;
        this.str_code = str_code;
        this.str_extension = str_extension;
        this.str_address = str_address;
        this.str_crop = str_crop;
        this.str_worker_code = str_worker_code;
    }

    public String getStr_name() {return str_name;}

    public void setStr_name(String str_name) {this.str_name = str_name;}

    public String getStr_code() {return str_code;}

    public String getStr_extension() {return str_extension;}

    public void setStr_extension(String str_extension) {this.str_extension = str_extension;}

    public String getStr_address() {return str_address;}

    public void setStr_address(String str_address) {this.str_address = str_address;}

    public String getStr_crop() {return str_crop;}

    public void setStr_crop(String str_crop) {this.str_crop = str_crop;}

    public String getStr_worker_code() {return str_worker_code;}

    public void setStr_worker_code(String str_worker_code) {this.str_worker_code = str_worker_code;}

    
}
