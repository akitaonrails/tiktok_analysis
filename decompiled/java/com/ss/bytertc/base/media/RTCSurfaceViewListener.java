package com.ss.bytertc.base.media;

import X.C1C7U;
import X.C786410Ut5;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes9.dex */
public class RTCSurfaceViewListener implements SurfaceHolder.Callback {
    public final String key;
    public long nativeSurfaceHelperHandle;
    public SurfaceView surfaceView;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void resetCallback() {
        this.nativeSurfaceHelperHandle = 0L;
        SurfaceView surfaceView = this.surfaceView;
        if (surfaceView != null) {
            surfaceView.getHolder().removeCallback(this);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.nativeSurfaceHelperHandle != 0 && surfaceHolder != null && surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid()) {
            RTCSurfaceHelper.nativeSetRenderTarget(this.nativeSurfaceHelperHandle, surfaceHolder.getSurface(), this.key);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        long j = this.nativeSurfaceHelperHandle;
        if (j != 0) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, null, this.key);
        }
    }

    public RTCSurfaceViewListener(SurfaceView surfaceView, final long j, final String str) {
        SurfaceHolder holder;
        Surface surface;
        final Surface surface2;
        this.nativeSurfaceHelperHandle = j;
        this.surfaceView = surfaceView;
        this.key = str;
        if (surfaceView != null && surfaceView.getHolder() != null && (holder = this.surfaceView.getHolder()) != null && holder.getSurface() != null && (surface = holder.getSurface()) != null && surface.isValid() && (surface2 = holder.getSurface()) != null && this.nativeSurfaceHelperHandle != 0) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0LGU
                @Override // java.lang.Runnable
                public final void run() {
                    this.LL.lambda$new$0(surface2, j, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Surface surface, long j, String str) {
        C1C7U.LIZ("RTCSurfaceViewListener@a975.<init>$1L");
        Surface surface2 = this.surfaceView.getHolder().getSurface();
        if (surface2 != null && surface2.isValid() && surface2 == surface) {
            RTCSurfaceHelper.nativeSetRenderTarget(j, surface2, str);
        }
        C1C7U.LIZIZ("RTCSurfaceViewListener@a975.<init>$1L");
    }
}
