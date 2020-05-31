import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
	LinkedList<ObjektHry> object = new LinkedList<ObjektHry>();

	public void tick() {
		for (int i = 0; i < object.size(); i++) {
			ObjektHry tempObject = object.get(i);
			tempObject.tick();
		}
	}

	public void render(Graphics g) {
		for (int i = 0; i < object.size(); i++) {
			ObjektHry tempObject = object.get(i);

			tempObject.render(g);
		}
	}
public void ClearEnemys(){
	for (int i = 0; i < object.size(); i++) {
		ObjektHry tempObject = object.get(i);

		if(tempObject.getId() == ID.Player) {
			object.clear();
			addObject(new Player (tempObject.getX(), tempObject.getY(), ID.Player, this));
			}
	}
}
	public void addObject(ObjektHry object) {
		this.object.add(object);

	}

	public void removeObject(ObjektHry object) {
		this.object.remove(object);
	}

}
