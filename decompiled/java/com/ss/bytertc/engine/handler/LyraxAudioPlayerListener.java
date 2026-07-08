package com.ss.bytertc.engine.handler;

import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.audio.ILyraxAudioPlayerListener;
import com.ss.lyrax.audio.LyraxPlayerError;
import com.ss.lyrax.audio.LyraxPlayerState;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerListener {
    public ILyraxAudioPlayer audioPlayer;
    public ILyraxAudioPlayerListener mLyraxAudioPlayerHandler;

    public LyraxAudioPlayerListener(ILyraxAudioPlayer iLyraxAudioPlayer) {
        this.audioPlayer = iLyraxAudioPlayer;
    }

    public void setLyraxAudioPlayerListener(ILyraxAudioPlayerListener iLyraxAudioPlayerListener) {
        this.mLyraxAudioPlayerHandler = iLyraxAudioPlayerListener;
    }

    public void onLyraxAudioPlayerPlayingProgress(long j, long j2) {
        ILyraxAudioPlayerListener iLyraxAudioPlayerListener = this.mLyraxAudioPlayerHandler;
        if (iLyraxAudioPlayerListener != null) {
            iLyraxAudioPlayerListener.onLyraxAudioPlayerPlayingProgress(this.audioPlayer, j2);
        }
    }

    public void onLyraxAudioPlayerStateChanged(long j, LyraxPlayerState lyraxPlayerState, LyraxPlayerError lyraxPlayerError) {
        ILyraxAudioPlayerListener iLyraxAudioPlayerListener = this.mLyraxAudioPlayerHandler;
        if (iLyraxAudioPlayerListener != null) {
            iLyraxAudioPlayerListener.onLyraxAudioPlayerStateChanged(this.audioPlayer, lyraxPlayerState, lyraxPlayerError);
        }
    }
}
