package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.bean.VEUndoRedoBean;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes36.dex */
public class TEImageUndoRedoInterface {
    public long mHandler;

    private native String nativeCacheCurrentFrame(long j, String str, boolean z);

    private native void nativeCheckHas();

    private native void nativeEnableUndoRedo(long j);

    private native void nativeExecuteConfirmParams(long j);

    private native void nativeExecuteRedoUndo(long j, boolean z, int i, boolean z2);

    private native void nativeGetUndoRedoList(long j, VEUndoRedoBean.JniHolder jniHolder, boolean z, int i);

    private native int nativeGetUndoRedoListSize(long j, boolean z);

    public synchronized void executeConfirmParams() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeExecuteConfirmParams(j);
    }

    public void enableUndoRedo() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEnableUndoRedo(j);
    }

    public TEImageUndoRedoInterface(long j) {
        this.mHandler = j;
        nativeCheckHas();
    }

    public synchronized ArrayList<VEUndoRedoBean> getUndoRedoList(boolean z) {
        return getUndoRedoList(z, -1);
    }

    public synchronized int getUndoRedoListSize(boolean z) {
        return nativeGetUndoRedoListSize(this.mHandler, z);
    }

    public synchronized String cacheCurrentFrame(String str, Boolean bool) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeCacheCurrentFrame(j, str, bool.booleanValue());
    }

    public synchronized ArrayList<VEUndoRedoBean> getUndoRedoList(boolean z, int i) {
        if (this.mHandler == 0) {
            return null;
        }
        VEUndoRedoBean.JniHolder jniHolder = new VEUndoRedoBean.JniHolder();
        nativeGetUndoRedoList(this.mHandler, jniHolder, z, i);
        return jniHolder.getJniResult();
    }

    public synchronized void executeRedoUndo(boolean z, int i, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeExecuteRedoUndo(j, z, i, z2);
    }
}
