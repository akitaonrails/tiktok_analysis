package com.ss.android.vesdk.audio;

import X.C2484209oO;
import android.media.AudioTrack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes35.dex */
public class TEAudioTrack {
    public AudioTrack mAudioTrack;
    public int mMinBufferSize;

    public int getBufferSizeInFrames() {
        return this.mAudioTrack.getBufferSizeInFrames();
    }

    public int pause() {
        C2484209oO.LJI("TEAudioTrack", "pause()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        this.mAudioTrack.pause();
        return 0;
    }

    public void release() {
        C2484209oO.LJI("TEAudioTrack", "release()");
        this.mAudioTrack.release();
    }

    public int start() {
        C2484209oO.LJI("TEAudioTrack", "start()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        this.mAudioTrack.play();
        return 0;
    }

    public int stop() {
        C2484209oO.LJI("TEAudioTrack", "stop()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        try {
            this.mAudioTrack.stop();
            this.mAudioTrack.flush();
            return 0;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LIZLLL("TEAudioTrack", "stop()", e);
            return -1;
        }
    }

    public int getMinBufferSize() {
        return this.mMinBufferSize;
    }

    public TEAudioTrack(int i) {
        C2484209oO.LJI("TEAudioTrack", "new()");
        this.mMinBufferSize = AudioTrack.getMinBufferSize(i, 12, 2);
        this.mAudioTrack = new AudioTrack(3, i, 12, 2, this.mMinBufferSize, 1);
    }

    public int setVolume(float f) {
        return this.mAudioTrack.setVolume(f);
    }

    public int write(byte[] bArr, int i) {
        return this.mAudioTrack.write(bArr, 0, i);
    }
}
