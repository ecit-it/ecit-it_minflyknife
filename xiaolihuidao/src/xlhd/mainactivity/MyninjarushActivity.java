package xlhd.mainactivity;

import xlhd.mainsurfaceview.NinjaRushSurfaceView;
import xlhd.music.GameMusic;
import ninjarush.mainactivity.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MyninjarushActivity extends Activity {
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //��ʼ������������ 
        GameMusic.inIt(this);
        //��ʼ�����ֲ�����
        GameMusic.inItMusic(R.raw.bg);
        //��ʼ����Ч������
        GameMusic.inItSound();
        //��ʼ������������
        GameMusic.windMediaplayer();
        //��ʼ�� run ������
        GameMusic.runMediaplayer();
        
    }
  
}