package com.bytedance.codecx;

import android.view.Surface;

/* JADX INFO: loaded from: classes21.dex */
public class CodecXVideoSurfaceController {
    public static CodecXVideoSurfaceController instance = new CodecXVideoSurfaceController();
    public CodecXSurfaceListener mSurfaceLisener;
    public boolean usePassSurfaceMode;

    public interface CodecXSurfaceListener {
        void onSurfaceAvailable(Surface surface);
    }

    public static CodecXVideoSurfaceController getInstance() {
        return instance;
    }

    public boolean usePassSurfaceMode() {
        return this.usePassSurfaceMode;
    }

    public void setSurface(Surface surface) {
        CodecXSurfaceListener codecXSurfaceListener = this.mSurfaceLisener;
        if (codecXSurfaceListener != null) {
            codecXSurfaceListener.onSurfaceAvailable(surface);
        }
    }
}
