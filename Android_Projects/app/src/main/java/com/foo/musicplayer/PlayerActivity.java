package com.foo.musicplayer;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    Button playBtn;
    SeekBar positionBar;
    SeekBar volumeBar;
    TextView elapsedTimeLabel;
    TextView remainingTimeLabel;
    MediaPlayer mp;
    int totalTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        playBtn = (Button) findViewById(R.id.playBtn);
        elapsedTimeLabel = (TextView) findViewById(R.id.elapsedTimeLabel);
        remainingTimeLabel = (TextView) findViewById(R.id.remainingTimeLabel);

        Intent intent=getIntent();
        String alinanPozisyon = intent.getStringExtra("pozisyonumuz");

        int alinanPozisyonum = Integer.parseInt(alinanPozisyon);

        // Media Player
      if(alinanPozisyonum==0) {

            mp = MediaPlayer.create(this, R.raw.emanetin_bende_sakli);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==1) {

            mp = MediaPlayer.create(this, R.raw.yasak_ask);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
         if(alinanPozisyonum==2) {


            mp = MediaPlayer.create(this, R.raw.jenerik_muzigi);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==3) {

            mp = MediaPlayer.create(this, R.raw.ucurumdun_sen);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==4) {

            mp = MediaPlayer.create(this, R.raw.tum_izleri_sildim);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==5) {

            mp = MediaPlayer.create(this, R.raw.aska_teslim);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==6) {


            mp = MediaPlayer.create(this, R.raw.konaktaki_yalnizlik);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==7) {

            mp = MediaPlayer.create(this, R.raw.aska_agit);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==8) {

            mp = MediaPlayer.create(this, R.raw.bir_gunah_gibi);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==9) {

            mp = MediaPlayer.create(this, R.raw.bihter_intihar);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==10) {


            mp = MediaPlayer.create(this, R.raw.imkansizdik);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==11) {

            mp = MediaPlayer.create(this, R.raw.caresizlik_olum_gibi);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==12) {

            mp = MediaPlayer.create(this, R.raw.kalbimi_benden_aldin);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==13) {

            mp = MediaPlayer.create(this, R.raw.sikayetim_kendimden);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==14) {


            mp = MediaPlayer.create(this, R.raw.bu_sir_elbet_cozulur);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==15) {

            mp = MediaPlayer.create(this, R.raw.seni_beklemek);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==16) {

            mp = MediaPlayer.create(this, R.raw.besir);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==17) {

            mp = MediaPlayer.create(this, R.raw.sir);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==18) {


            mp = MediaPlayer.create(this, R.raw.beni_aglatmayin);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==19) {

            mp = MediaPlayer.create(this, R.raw.sonu_belli_hikaye);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==20) {

            mp = MediaPlayer.create(this, R.raw.hatiran_bende_sakli);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==21) {

            mp = MediaPlayer.create(this, R.raw.nihal);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==22) {


            mp = MediaPlayer.create(this, R.raw.kum_saati_doluyor);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==23) {

            mp = MediaPlayer.create(this, R.raw.bahar_yine_gelir_mi);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==24) {

            mp = MediaPlayer.create(this, R.raw.yikik_hayaller);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==25) {

            mp = MediaPlayer.create(this, R.raw.yasak_ask_remix);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==26) {


            mp = MediaPlayer.create(this, R.raw.eskiden);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }
        if(alinanPozisyonum==27) {

            mp = MediaPlayer.create(this, R.raw.hayalperest);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==28) {

            mp = MediaPlayer.create(this, R.raw.soyleyemediklerim);
            mp.setLooping(false);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();


        }
        if(alinanPozisyonum==29) {

            mp = MediaPlayer.create(this, R.raw.kucuk_umutlar);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();
        }
        if(alinanPozisyonum==30) {


            mp = MediaPlayer.create(this, R.raw.yeni_gune_uyanis);
            mp.setLooping(true);
            mp.seekTo(0);
            mp.setVolume(0.5f, 0.5f);
            totalTime = mp.getDuration();

        }




        // Position Bar
        positionBar = (SeekBar) findViewById(R.id.positionBar);
        positionBar.setMax(totalTime);
        positionBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            positionBar.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

// Volume Bar
        volumeBar = (SeekBar) findViewById(R.id.volumeBar);
        volumeBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        float volumeNum = progress / 100f;
                        mp.setVolume(volumeNum, volumeNum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        // Thread (Update positionBar & timeLabel)
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null) {
                    try {
                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        }).start();

    }
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            int currentPosition = msg.what;
            // Update positionBar.
            positionBar.setProgress(currentPosition);

            // Update Labels.
            String elapsedTime = createTimeLabel(currentPosition);
            elapsedTimeLabel.setText(elapsedTime);

            String remainingTime = createTimeLabel(totalTime-currentPosition);
            remainingTimeLabel.setText("- " + remainingTime);
        }
    };

    public String createTimeLabel(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playBtnClick(View view) {
        if (!mp.isPlaying()) {
            // Stopping

            mp.start();
            playBtn.setBackgroundResource(R.drawable.pause);

        } else {
            // Playing
            mp.pause();
            playBtn.setBackgroundResource(R.drawable.play);
        }


    }
    public void stop(View view)
    {
        stopPlayer();
    }
    private void stopPlayer()
    {
        if(mp != null)
        {
            mp.release();
            mp=null;
        }
    }

    public void onBackPressed() {
        // Çalışmasını istediğiniz kodu buraya yazacağız
        super.onBackPressed();
       stopPlayer();
    }

}