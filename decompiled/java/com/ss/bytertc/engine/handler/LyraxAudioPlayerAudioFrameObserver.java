package com.ss.bytertc.engine.handler;

import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.audio.ILyraxAudioPlayerAudioFrameObserver;
import com.ss.lyrax.audio.LyraxAudioChannel;
import com.ss.lyrax.audio.LyraxAudioFrame;
import com.ss.lyrax.audio.LyraxAudioSampleRate;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxAudioPlayerAudioFrameObserver {
    public ILyraxAudioPlayer audioPlayer;
    public ILyraxAudioPlayerAudioFrameObserver mAudioFrameObserver;

    public LyraxAudioPlayerAudioFrameObserver(ILyraxAudioPlayer iLyraxAudioPlayer) {
        this.audioPlayer = iLyraxAudioPlayer;
    }

    public void setAudioFrameObserver(ILyraxAudioPlayerAudioFrameObserver iLyraxAudioPlayerAudioFrameObserver) {
        this.mAudioFrameObserver = iLyraxAudioPlayerAudioFrameObserver;
    }

    public void onFrame(long j, LyraxAudioFrame lyraxAudioFrame) {
        ILyraxAudioPlayerAudioFrameObserver iLyraxAudioPlayerAudioFrameObserver = this.mAudioFrameObserver;
        if (iLyraxAudioPlayerAudioFrameObserver != null) {
            iLyraxAudioPlayerAudioFrameObserver.onFrame(this.audioPlayer, lyraxAudioFrame);
        }
    }

    public static LyraxAudioFrame createAudioFrameImpl(byte[] bArr, int i, int i2, int i3, long j) {
        return LyraxAudioFrame.create(bArr, i, LyraxAudioSampleRate.fromId(i2), LyraxAudioChannel.fromId(i3), j);
    }
}
