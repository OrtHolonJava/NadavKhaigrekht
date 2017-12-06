import javax.swing.JFrame;

public class MapFrame extends JFrame{
private MapPanel mp;

public MapFrame()
{
	mp = new MapPanel();
	add(mp);
	setSize(1000, 1000);
	setVisible(true);
}
}
