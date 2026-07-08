package com.lynx.animax.audio;

import X.C1285570jYh;
import X.C2217841BrC;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes35.dex */
public class AudioPlayer {
    public final C2217841BrC LIZ;
    public final C1285570jYh LIZIZ;
    public final ByteBuffer LIZJ;
    public final int LIZLLL;
    public int LJ;

    public double getAudioTime() {
        long j = this.LJ;
        C2217841BrC c2217841BrC = this.LIZ;
        long playbackHeadPosition = j + ((((long) c2217841BrC.LJFF.getPlaybackHeadPosition()) & 4294967295L) * ((long) c2217841BrC.LIZIZ));
        return (((playbackHeadPosition % ((long) r2)) / ((double) this.LIZLLL)) * this.LIZIZ.LIZLLL) / 1000.0d;
    }

    public double getDuration() {
        return this.LIZIZ.LIZLLL / 1000.0d;
    }

    public void pause() {
        this.LIZ.LJFF.pause();
    }

    public void play() {
        C2217841BrC c2217841BrC = this.LIZ;
        c2217841BrC.onPeriodicNotification(c2217841BrC.LJFF);
        c2217841BrC.LJFF.play();
    }

    public void seekToProgress(double d) {
        C2217841BrC c2217841BrC = this.LIZ;
        c2217841BrC.LJFF.pause();
        c2217841BrC.LJFF.flush();
        c2217841BrC.LJ = 0;
        C2217841BrC c2217841BrC2 = this.LIZ;
        int i = (int) (d * ((double) this.LIZLLL));
        int i2 = c2217841BrC2.LIZIZ;
        this.LJ = (i / i2) * i2;
    }

    public AudioPlayer(C1285570jYh c1285570jYh, ByteBuffer byteBuffer) {
        this.LIZIZ = c1285570jYh;
        this.LIZJ = byteBuffer;
        this.LIZLLL = byteBuffer.capacity();
        C2217841BrC c2217841BrC = new C2217841BrC(c1285570jYh);
        this.LIZ = c2217841BrC;
        c2217841BrC.LIZLLL = this;
    }
}
