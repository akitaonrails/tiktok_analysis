package com.ss.lyrax.audio;

import com.ss.lyrax.LyraxErrorCode;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ILyraxAudioPlayer {
    public abstract void dispose();

    public abstract int getAudioTrackCount();

    public abstract int getPlaybackDuration();

    public abstract int getPosition();

    public abstract int getTotalDuration();

    public abstract int getVolume(LyraxAudioMixingType lyraxAudioMixingType);

    public abstract LyraxErrorCode open(String str, LyraxAudioPlayerConfig lyraxAudioPlayerConfig);

    public abstract LyraxErrorCode openWithCustomSource(LyraxAudioPlayerCustomSource lyraxAudioPlayerCustomSource, LyraxAudioPlayerConfig lyraxAudioPlayerConfig);

    public abstract LyraxErrorCode pause();

    public abstract LyraxErrorCode pushExternalAudioFrame(LyraxAudioFrame lyraxAudioFrame);

    public abstract LyraxErrorCode registerAudioFrameObserver(ILyraxAudioPlayerAudioFrameObserver iLyraxAudioPlayerAudioFrameObserver);

    public abstract LyraxErrorCode resume();

    public abstract LyraxErrorCode selectAudioTrack(int i);

    public abstract LyraxErrorCode setAudioDualMonoMode(LyraxAudioMixingDualMonoMode lyraxAudioMixingDualMonoMode);

    public abstract LyraxErrorCode setAudioPitch(int i);

    public abstract LyraxErrorCode setListener(ILyraxAudioPlayerListener iLyraxAudioPlayerListener);

    public abstract LyraxErrorCode setLoudness(float f);

    public abstract LyraxErrorCode setPlaybackSpeed(int i);

    public abstract LyraxErrorCode setPosition(int i);

    public abstract LyraxErrorCode setProgressInterval(long j);

    public abstract LyraxErrorCode setVolume(int i, LyraxAudioMixingType lyraxAudioMixingType);

    public abstract LyraxErrorCode start();

    public abstract LyraxErrorCode stop();
}
