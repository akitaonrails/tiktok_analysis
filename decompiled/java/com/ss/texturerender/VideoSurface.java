package com.ss.texturerender;

import android.os.Handler;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: loaded from: classes9.dex */
public class VideoSurface extends Surface implements Handler.Callback {
    public static final int SUPER_RES_STAT_BMF_V1 = 5;
    public static final int SUPER_RES_STAT_BMF_V1_OPT = 7;
    public static final int SUPER_RES_STAT_BMF_V2 = 6;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return true;
    }

    @Override // android.view.Surface
    public final void finalize() throws Throwable {
        super.finalize();
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
    }
}
