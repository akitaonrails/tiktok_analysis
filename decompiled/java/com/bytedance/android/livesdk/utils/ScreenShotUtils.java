package com.bytedance.android.livesdk.utils;

import X.C1322890kWt;
import X.C1APZ;
import X.PixelCopyOnPixelCopyFinishedListenerC2178841APa;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public final class ScreenShotUtils {
    public static final Bitmap LIZ(SurfaceView surfaceView) {
        SurfaceHolder holder;
        if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && (holder = surfaceView.getHolder()) != null && holder.getSurface() != null && holder.getSurface().isValid()) {
            int width = surfaceView.getWidth();
            int height = surfaceView.getHeight();
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                try {
                    Surface surface = holder.getSurface();
                    PixelCopyOnPixelCopyFinishedListenerC2178841APa pixelCopyOnPixelCopyFinishedListenerC2178841APa = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.1APa
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i) {
                        }
                    };
                    final Looper mainLooper = Looper.getMainLooper();
                    C1322890kWt.LIZIZ(surface, bitmapCreateBitmap, pixelCopyOnPixelCopyFinishedListenerC2178841APa, new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.utils.ScreenShotUtils$getSurfaceViewCurRenderBitmapSync$2
                        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                        public final boolean sendMessageAtTime(Message message, long j) {
                            Runnable callback = message.getCallback();
                            if (callback != null) {
                                callback.run();
                                return true;
                            }
                            return true;
                        }
                    }, CertProviderManagerKt.findCert("bpea-live_preview_surface_view", 1476435973));
                    return bitmapCreateBitmap;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return bitmapCreateBitmap;
                }
            }
            return null;
        }
        return null;
    }

    public static final Bitmap LIZIZ(SurfaceView surfaceView, Surface surface) {
        if (Build.VERSION.SDK_INT >= 24 && surfaceView != null && surfaceView.getHolder() != null && surface != null && surface.isValid()) {
            int width = surfaceView.getWidth();
            int height = surfaceView.getHeight();
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                try {
                    C1APZ c1apz = new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.1APZ
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i) {
                        }
                    };
                    final Looper mainLooper = Looper.getMainLooper();
                    C1322890kWt.LIZIZ(surface, bitmapCreateBitmap, c1apz, new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.utils.ScreenShotUtils$getSurfaceViewCurRenderBitmapSyncV2$2
                        @Override // com.bytedance.bpea.transmit.delegate.BPEAHandler, android.os.Handler
                        public final boolean sendMessageAtTime(Message message, long j) {
                            Runnable callback = message.getCallback();
                            if (callback != null) {
                                callback.run();
                                return true;
                            }
                            return true;
                        }
                    }, CertProviderManagerKt.findCert("bpea-live_preview_surface_view", 1476435973));
                    return bitmapCreateBitmap;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return bitmapCreateBitmap;
                }
            }
            return null;
        }
        return null;
    }
}
