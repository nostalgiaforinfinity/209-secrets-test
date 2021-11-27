package net.larsan.quarkus;

public class Dummy {
    
    private String _id;
    private String email;
    
    public Dummy() { }

    public Dummy(String _id) {
        this._id = _id;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
