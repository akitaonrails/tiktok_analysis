package com.ss.ttlivestreamer.core.capture.audio;

import com.ss.ttlivestreamer.core.engine.AudioSource;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AudioCapturer extends AudioSource {
    public int mMode = 1;
    public boolean mMute;

    public void pause() {
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSource, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
    }

    public void resume() {
    }

    public abstract void start();

    public abstract void stop();

    public abstract int updateChannel();

    public int getMode() {
        return this.mMode;
    }

    public boolean isMute() {
        return this.mMute;
    }

    public void mute(boolean z) {
        this.mMute = z;
        nativeSetMute(z);
    }

    public void setAudioQuantizeGapPeriod(long j) {
        nativeSetAudioQuantizeGapPeriod(j);
    }

    public void setMode(int i) {
        this.mMode = i;
    }

    public void setVolume(double d) {
        nativeSetVolume(d);
    }

    public void setOutputFormat(int i, int i2, int i3) {
        nativeAdaptedOutputFormat(i, i2, i3);
    }
}
