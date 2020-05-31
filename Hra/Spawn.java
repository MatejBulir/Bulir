import java.util.Random;

public class Spawn {
	private Handler handler;
	private HUD hud;
	private int scoreKeep = 0;
private Random r = new Random();
	public Spawn(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	public void tick() {
		scoreKeep++;
		if(scoreKeep >=100) {
			scoreKeep = 0;
			hud.setLevel(hud.getLevel()+1);			
			handler.addObject(new BasicEnemy(r.nextInt(Main.WIDTH), r.nextInt(Main.HEIGHT), ID.BasicEnemy, handler));
			if(hud.getLevel() == 3) {
			handler.addObject(new FastEnemy(r.nextInt(Main.WIDTH), r.nextInt(Main.HEIGHT), ID.FastEnemy, handler));
			}
			if(hud.getLevel() == 2) {
			handler.addObject(new SmartEnemy(r.nextInt(Main.WIDTH), r.nextInt(Main.HEIGHT), ID.SmartEnemy, handler));
			}
			if(hud.getLevel() == 5) {
				handler.ClearEnemys();
				handler.addObject(new Boss(Main.WIDTH/2-48, -96 , ID.Boss,handler));
				}
		}
	}
}
