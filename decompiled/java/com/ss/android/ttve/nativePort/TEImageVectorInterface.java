package com.ss.android.ttve.nativePort;

/* JADX INFO: loaded from: classes36.dex */
public class TEImageVectorInterface {
    public long mHandler;

    private native void nativeAddVectorGraphicsWithParams(long j, int i, String str, String str2);

    private native int nativeAddVectorSticker(long j, String str);

    private native void nativeCheckHas();

    private native String nativeGetVectorCurrentGraphics(long j, int i);

    private native String nativeGetVectorGraphicsParamsWithId(long j, int i, String str);

    private native void nativeRemoveVectorGraphicsWithId(long j, int i, String str);

    private native void nativeSetVectorGraphicsBrushEnable(long j, int i, boolean z);

    private native void nativeUndoRedoVectorGraphics(long j, int i, boolean z);

    private native void nativeUpdateVectorGraphicsParamsWithId(long j, int i, String str, String str2, boolean z);

    public TEImageVectorInterface(long j) {
        this.mHandler = j;
        nativeCheckHas();
    }

    public synchronized int addVectorSticker(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddVectorSticker(j, str);
    }

    public synchronized String getVectorCurrentGraphics(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetVectorCurrentGraphics(j, i);
    }

    public synchronized String getVectorGraphicsParamsWithId(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetVectorGraphicsParamsWithId(j, i, str);
    }

    public synchronized void removeVectorGraphicsWithId(int i, String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeRemoveVectorGraphicsWithId(j, i, str);
    }

    public synchronized void setVectorGraphicsBrushEnable(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetVectorGraphicsBrushEnable(j, i, z);
    }

    public synchronized void undoRedoVectorGraphics(int i, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUndoRedoVectorGraphics(j, i, z);
    }

    public synchronized void addVectorGraphicsWithParams(int i, String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeAddVectorGraphicsWithParams(j, i, str, str2);
    }

    public synchronized void updateVectorGraphicsParamsWithId(int i, String str, String str2, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUpdateVectorGraphicsParamsWithId(j, i, str, str2, z);
    }
}
