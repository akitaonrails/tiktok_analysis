package com.ss.android.vesdk;

import android.graphics.Bitmap;
import com.ss.android.ttve.nativePort.TEVideoUtils;

/* JADX INFO: loaded from: classes9.dex */
public class VEMediaParser {
    public volatile long mHandler;

    public synchronized void release() {
        TEVideoUtils.nativeReleaseGetFrameHandler(this.mHandler);
        this.mHandler = 0L;
    }

    public synchronized void init(String str) {
        this.mHandler = TEVideoUtils.nativeCreateGetFrameHandler(str);
    }

    public synchronized Bitmap getVideoFrame(int i, int i2, int i3, boolean z) {
        if (this.mHandler == 0) {
            return null;
        }
        return TEVideoUtils.getFrameWithHandler(this.mHandler, i, i2, i3, z);
    }
}
