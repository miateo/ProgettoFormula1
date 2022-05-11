
import controller.ClassController;
import model.ClassModel;
import view.ClassView;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassModel model = new ClassModel();//instanziamento model
		ClassView view = new ClassView();//instanziamento view
		ClassController controller = new ClassController(model, view);//instanziamento controller -> gli passo il model e la view
	}
}
