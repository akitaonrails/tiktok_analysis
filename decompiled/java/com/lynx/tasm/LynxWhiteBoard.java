package com.lynx.tasm;

import com.lynx.base.log.LynxLog;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxWhiteBoard {
    public final long LIZ;

    private native long nativeCreate();

    private native void nativeDestroy(long j);

    public LynxWhiteBoard() {
        if (LynxEnv.inst().isNativeLibraryLoaded()) {
            this.LIZ = nativeCreate();
        } else {
            LynxLog.e("LynxWhiteBoard", "LynxWhiteBoard create failed, since LynxEnv init failed.");
        }
    }
}
