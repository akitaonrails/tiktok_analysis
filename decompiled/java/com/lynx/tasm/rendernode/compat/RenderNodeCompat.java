package com.lynx.tasm.rendernode.compat;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes21.dex */
public abstract class RenderNodeCompat {
    public static boolean sEnable;

    public abstract Canvas beginRecording(int i, int i2);

    public abstract void drawRenderNode(Canvas canvas);

    public abstract void drawRenderNode(Canvas canvas, Object obj);

    public abstract void endRecording(Canvas canvas);

    public abstract Object getRenderNode();

    public abstract boolean hasDisplayList();

    public abstract void init();

    public abstract void setPosition(int i, int i2, int i3, int i4);

    public static boolean supportRenderNode() {
        return sEnable;
    }

    public static void enable(boolean z) {
        sEnable = z;
    }
}
