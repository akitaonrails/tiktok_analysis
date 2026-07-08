package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.VEImage;

/* JADX INFO: loaded from: classes36.dex */
public class TEImageBrushInterface {
    public long mHandler;

    private native int nativeAddBrushSticker(long j, String str);

    private native void nativeBeginStickerBrush(long j, int i);

    private native void nativeCheckHas();

    private native void nativeClearBursh(long j, String str);

    private native void nativeClearStickerBrush(long j, int i);

    private native int nativeEnableEraseMatting(long j, String str, boolean z);

    private native int nativeEnableImageMatting(long j, String str, boolean z);

    private native void nativeEndStickerBrush(long j);

    private native String nativeGetStickerBrushState(long j, int i);

    private native boolean nativeIsBrushOverlapped(long j, String str, float f, float f2, float f3, float f4);

    private native String nativeQueryPaintParams(long j, String str);

    private native int nativeRemoveBrushSticker(long j, int i);

    private native int nativeRemoveMagnifier(long j, boolean z);

    private native int nativeSaveStickerBrushPng(long j, int i, String str, VEImage.VEStickerBrushSavePngCallback vEStickerBrushSavePngCallback);

    private native void nativeSetEffectTextureCachePathAndSize(long j, String str, int i, int i2);

    private native int nativeSetEraseMattingMask(long j, String str);

    private native void nativeSetPaintBrushEnable(long j, String str, String str2, boolean z);

    private native void nativeSetPaintParams(long j, String str, String str2);

    private native int nativeSetSmartMattingMask(long j, String str, int i);

    private native int nativeSetStickerBrushFlip(long j, int i, boolean z, boolean z2);

    private native int nativeSetStickerBrushIndex(long j, int i, int i2);

    private native void nativeSetStickerBrushParams(long j, String str);

    private native void nativeSetStickerBrushResource(long j, String str);

    private native void nativeSetStrokeRgba(long j, String str, float f, float f2, float f3, float f4, long j2);

    private native void nativeUndoRedoBursh(long j, String str, boolean z);

    private native void nativeUndoRedoStickerBrush(long j, boolean z, int i);

    private native int nativeUpdateMagnifier(long j, float f, float f2, float f3, boolean z);

    public synchronized void endStickerBrush() {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeEndStickerBrush(j);
    }

    public TEImageBrushInterface(long j) {
        this.mHandler = j;
        nativeCheckHas();
    }

    public synchronized int addBrushSticker(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeAddBrushSticker(j, str);
    }

    public synchronized void beginStickerBrush(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeBeginStickerBrush(j, i);
    }

    public synchronized void clearBursh(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeClearBursh(j, str);
    }

    public synchronized void clearStickerBrush(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeClearStickerBrush(j, i);
    }

    public synchronized String getStickerBrushState(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeGetStickerBrushState(j, i);
    }

    public synchronized String queryPaintParams(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return "";
        }
        return nativeQueryPaintParams(j, str);
    }

    public synchronized int removeBrushSticker(int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeRemoveBrushSticker(j, i);
    }

    public synchronized int removeMagnifier(boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeRemoveMagnifier(j, z);
    }

    public synchronized int setEraseMattingMask(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetEraseMattingMask(j, str);
    }

    public synchronized void setStickerBrushParams(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetStickerBrushParams(j, str);
    }

    public synchronized void setStickerBrushResource(String str) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetStickerBrushResource(j, str);
    }

    public synchronized int enableEraseMatting(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeEnableEraseMatting(j, str, z);
    }

    public synchronized int enableImageMatting(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeEnableImageMatting(j, str, z);
    }

    public void setPaintParams(String str, String str2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetPaintParams(j, str, str2);
    }

    public synchronized int setSmartMattingMask(String str, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetSmartMattingMask(j, str, i);
    }

    public synchronized int setStickerBrushIndex(int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetStickerBrushIndex(j, i, i2);
    }

    public synchronized void undoRedoBursh(String str, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUndoRedoBursh(j, str, z);
    }

    public synchronized void undoRedoStickerBrush(boolean z, int i) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeUndoRedoStickerBrush(j, z, i);
    }

    public synchronized int saveStickerBrushPng(int i, String str, VEImage.VEStickerBrushSavePngCallback vEStickerBrushSavePngCallback) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSaveStickerBrushPng(j, i, str, vEStickerBrushSavePngCallback);
    }

    public synchronized void setEffectTextureCachePathAndSize(String str, int i, int i2) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetEffectTextureCachePathAndSize(j, str, i, i2);
    }

    public synchronized void setPaintBrushEnable(String str, String str2, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return;
        }
        nativeSetPaintBrushEnable(j, str, str2, z);
    }

    public synchronized int setStickerBrushFlip(int i, boolean z, boolean z2) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeSetStickerBrushFlip(j, i, z, z2);
    }

    public synchronized int updateMagnifier(float f, float f2, float f3, boolean z) {
        long j = this.mHandler;
        if (j == 0) {
            return -1;
        }
        return nativeUpdateMagnifier(j, f, f2, f3, z);
    }

    public synchronized boolean isBrushOverlapped(String str, float f, float f2, float f3, float f4) {
        long j = this.mHandler;
        if (j == 0) {
            return false;
        }
        return nativeIsBrushOverlapped(j, str, f, f2, f3, f4);
    }

    public synchronized void setStrokeRgba(String str, float f, float f2, float f3, float f4, long j) {
        long j2 = this.mHandler;
        if (j2 == 0) {
            return;
        }
        nativeSetStrokeRgba(j2, str, f, f2, f3, f4, j);
    }
}
