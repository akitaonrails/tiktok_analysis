package com.ss.ttm.player;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes21.dex */
public class StreamInfo {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamInfo{mStreamType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mStreamIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mCodecName='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mFrameRate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mBitrate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mWidth=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mHeight=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mSampleRate=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mChannels=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mDuration=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mRotation=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public StreamInfo(int i, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9) {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = -1;
        this.LJII = -1;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = j;
        this.LJIIJ = i9;
    }
}
