package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes34.dex */
public final class PlayerData {
    public final int exceptedH;
    public final int exceptedW;
    public final int exceptedX;
    public final int exceptedY;
    public final int realH;
    public final int realW;
    public final int realX;
    public final int realY;
    public final int streamH;
    public final int streamW;

    public PlayerData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.streamW = i;
        this.streamH = i2;
        this.exceptedX = i3;
        this.exceptedY = i4;
        this.exceptedW = i5;
        this.exceptedH = i6;
        this.realX = i7;
        this.realY = i8;
        this.realW = i9;
        this.realH = i10;
    }
}
