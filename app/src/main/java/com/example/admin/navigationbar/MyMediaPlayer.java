package com.example.admin.navigationbar;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.media.MediaPlayer;

import static com.example.admin.navigationbar.R.*;

/**
 * Created by Admin on 9/5/2017.
 */

public class MyMediaPlayer extends android.support.v4.app.Fragment {

    MediaPlayer sound;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        sound = MediaPlayer.create(getActivity(), R.raw.mientes);
        return inflater.inflate(layout.media_player, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle("Edel's Media Player");

    }
    public void mngSound(View view) {

        switch (view.getId()) {
            case R.id.btnPlay:
                sound.start();
                break;

            case R.id.btnPause:
                sound.pause();
                break;

            case R.id.btnStop:
                sound.stop();
                sound = MediaPlayer.create(getActivity(), R.raw.mientes);

                break;


        }
    }
}
