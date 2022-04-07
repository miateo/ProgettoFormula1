
import controller.ClassController;
import model.ClassModel;
import view.ClassView;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassModel model = new ClassModel();
		ClassView view = new ClassView();
		ClassController controller = new ClassController(model, view);
		
	}
}
