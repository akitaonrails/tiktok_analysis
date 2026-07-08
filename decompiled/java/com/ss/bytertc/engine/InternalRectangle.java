package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes36.dex */
public class InternalRectangle {
    public int height;
    public int width;
    public int x;
    public int y;

    public InternalRectangle(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public static InternalRectangle create(int i, int i2, int i3, int i4) {
        return new InternalRectangle(i, i2, i3, i4);
    }
}
