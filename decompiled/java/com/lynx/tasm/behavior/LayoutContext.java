package com.lynx.tasm.behavior;

import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.mapbuffer.ReadableMapBuffer;
import com.lynx.tasm.behavior.ui.PropBundle;

/* JADX INFO: loaded from: classes21.dex */
public abstract class LayoutContext {
    public long LIZ;
    public boolean LIZIZ;
    public long LIZJ;

    private native long nativeCreateLayoutContext(Object obj);

    private native void nativeTriggerLayout(long j);

    public abstract void attachLayoutNodeManager(long j);

    public abstract int createNode(int i, String str, PropBundle propBundle, ReadableMapBuffer readableMapBuffer, boolean z);

    public abstract void destroyNodes(int[] iArr);

    public abstract void dispatchOnLayout(int i, int i2, int i3, int i4, int i5);

    public abstract void dispatchOnLayoutBefore(int i);

    public abstract Object getExtraBundle(int i);

    public abstract void insertNode(int i, int i2, int i3);

    public abstract void removeNode(int i, int i2, int i3);

    public abstract void scheduleLayout();

    public abstract void setFontFaces(ReadableMap readableMap);

    public abstract void updateProps(int i, PropBundle propBundle, ReadableMapBuffer readableMapBuffer);

    public final void LIZIZ() {
        long j = this.LIZ;
        if (j != 0) {
            nativeTriggerLayout(j);
        }
    }

    public void detachNativePtr() {
        this.LIZ = 0L;
    }

    public final void LIZ(Object obj) {
        this.LIZJ = nativeCreateLayoutContext(obj);
    }

    public void attachNativePtr(long j) {
        this.LIZ = j;
    }
}
