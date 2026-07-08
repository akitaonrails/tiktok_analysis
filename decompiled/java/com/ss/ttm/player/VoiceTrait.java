package com.ss.ttm.player;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes36.dex */
public abstract class VoiceTrait extends TraitObject {

    public static class AudioFrameInfo {
        public ByteBuffer[] mBuffers;
        public int mSamples;
        public long mTimestamp;
    }

    public abstract void audioClose();

    public abstract void audioFlush();

    public abstract int audioOpen(AudioMediaInfo audioMediaInfo);

    public abstract void audioPause();

    public abstract void audioResume();

    public abstract int audioWrite(AudioFrameInfo audioFrameInfo);

    public abstract int getLatency();

    public VoiceTrait(int i) {
    }

    public static class AudioMediaInfo {
        public final int LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final int LIZLLL;
        public final int LJ;
        public final int LJFF;
        public final int LJI;

        public AudioMediaInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.LIZ = i;
            this.LIZIZ = i2;
            this.LIZJ = i3;
            this.LIZLLL = i4;
            this.LJ = i5;
            this.LJFF = i6;
            this.LJI = i7;
        }
    }
}
