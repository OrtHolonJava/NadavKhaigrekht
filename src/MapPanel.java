import java.awt.Graphics;

import javax.swing.JPanel;

import images.Img;
import map.Map;

public class MapPanel extends JPanel{
private int _cols;
private int _rows;
private int _BlockSize;
private Img _imgBackground;
private Img _BlockImg;
private Map _map;
private Img _SmallHouse;

public MapPanel()
{
	_cols = 20;
	_rows = 20;
	_BlockSize = 50;
	_map = new Map(_cols,_rows,"AllMaps/file1.xml");
	_BlockImg = new Img("images/Tree2.png",0,0,_BlockSize,_BlockSize);
	_SmallHouse = new Img("images/SmallHouse.png",0,0,_BlockSize*4,_BlockSize*4);
	_imgBackground = new Img("images/Background.jpg", 0,0,1000,1000);
}
public void paintComponent(Graphics g)
{
	_imgBackground.drawImg(g);
	for (int i=0; i< _cols; i++)
	{
		for(int j=0; j<_rows; j++)
		{
			if (_map.get_map()[i][j] == 1) 
			{
				_BlockImg.setImgCords((j * _BlockSize), (i) * _BlockSize);
				_BlockImg.drawImg(g);
		    }
			if (_map.get_map()[i][j] == 2) 
			{
				_SmallHouse.setImgCords((j * _BlockSize*4), (i) * _BlockSize*4);
				_SmallHouse.drawImg(g);
		    }
		}
	}
	

}

}
