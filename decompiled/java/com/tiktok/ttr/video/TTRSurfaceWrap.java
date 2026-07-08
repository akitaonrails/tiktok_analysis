package com.tiktok.ttr.video;

import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.tiktok.ttr.video.TTRSurfaceWrap;

/* JADX INFO: loaded from: classes21.dex */
public class TTRSurfaceWrap extends Surface {
    public int mEngineId;
    public Handler mHandler;
    public SurfaceTexture mSurfaceTexture;

    public native void nativeNotifyFrameAvailable(int i);

    @Override // android.view.Surface
    public void release() {
        if (this.mHandler != null && Looper.getMainLooper() != this.mHandler.getLooper()) {
            this.mHandler.removeCallbacksAndMessages(null);
            this.mHandler.getLooper().quit();
            this.mHandler = null;
        }
        super.release();
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.mSurfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }

    public void SetRenderCtx(int i) {
        this.mEngineId = i;
    }

    public void notifyFrameAvailable(int i) {
        nativeNotifyFrameAvailable(i);
    }

    public TTRSurfaceWrap(SurfaceTexture surfaceTexture, int i) {
        super(surfaceTexture);
        this.mSurfaceTexture = surfaceTexture;
        if (i == 1) {
            HandlerThread handlerThread = new HandlerThread("TTRSurfaceWrap", 0);
            handlerThread.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
            this.mHandler = bPEAHandler;
            surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jZL
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    TTRSurfaceWrap tTRSurfaceWrap = this.LL;
                    tTRSurfaceWrap.notifyFrameAvailable(tTRSurfaceWrap.mEngineId);
                }
            }, bPEAHandler);
            return;
        }
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: X.0jZM
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                TTRSurfaceWrap tTRSurfaceWrap = this.LL;
                tTRSurfaceWrap.notifyFrameAvailable(tTRSurfaceWrap.mEngineId);
            }
        });
    }
}
