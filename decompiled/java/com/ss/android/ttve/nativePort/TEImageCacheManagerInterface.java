package com.ss.android.ttve.nativePort;

import X.C2315351Fk5;

/* JADX INFO: loaded from: classes4.dex */
public class TEImageCacheManagerInterface {
    public long mHandle;

    private native void nativeAsynDecodeImage(long j, String str);

    private native long nativeCreateImageCacheManagerHandle(String str, boolean z, boolean z2, int i, int i2, int i3, int i4);

    private native void nativeDestroy(long j);

    private native void nativeReplacePathList(long j, String[] strArr, int[] iArr, int[] iArr2);

    private native void nativeclearPathList(long j);

    public synchronized void clearPathList() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        nativeclearPathList(j);
    }

    public synchronized void destroy() {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        nativeDestroy(j);
        this.mHandle = 0L;
    }

    static {
        TENativeLibsLoader.loadImage();
    }

    public long getNativeHandle() {
        return this.mHandle;
    }

    public synchronized void asynDecodeImage(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        nativeAsynDecodeImage(j, str);
    }

    public synchronized void replacePathList(C2315351Fk5[] c2315351Fk5Arr) {
        long j = this.mHandle;
        if (j != 0 && c2315351Fk5Arr.length != 0) {
            String[] strArr = new String[c2315351Fk5Arr.length];
            int[] iArr = new int[c2315351Fk5Arr.length];
            int[] iArr2 = new int[c2315351Fk5Arr.length];
            if (c2315351Fk5Arr.length == 0) {
                nativeReplacePathList(j, strArr, iArr, iArr2);
                return;
            }
            throw null;
        }
    }

    public static synchronized TEImageCacheManagerInterface createImageCacheManager(String str, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        TEImageCacheManagerInterface tEImageCacheManagerInterface;
        tEImageCacheManagerInterface = new TEImageCacheManagerInterface();
        tEImageCacheManagerInterface.mHandle = tEImageCacheManagerInterface.createImageCacheManagerHandle(str, z, z2, i, i2, i3, i4);
        return tEImageCacheManagerInterface;
    }

    private synchronized long createImageCacheManagerHandle(String str, boolean z, boolean z2, int i, int i2, int i3, int i4) {
        return nativeCreateImageCacheManagerHandle(str, z, z2, i, i2, i3, i4);
    }
}
