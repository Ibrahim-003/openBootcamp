
public class Main {
    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDLmpl();
        cocheCrud.save();
        cocheCrud.findAll();
        cocheCrud.delete();
    }
}