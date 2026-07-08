package com.ss.bytertc.base.media;

import X.C786410Ut5;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class RTCSurfaceHelper {
    public ConcurrentHashMap<String, Object> mSurfaceCallbackMap = new ConcurrentHashMap<>();
    public final Object mSurfaceCallbackMapLock = new Object();
    public Long mSurfaceHelperHandle;

    public static native void nativeSetRenderTarget(long j, Surface surface, String str);

    public void destroy() {
        synchronized (this.mSurfaceCallbackMapLock) {
            try {
                Iterator<Object> it2 = this.mSurfaceCallbackMap.values().iterator();
                while (it2.hasNext()) {
                    unRegisterSurfaceCallback(it2.next());
                }
                this.mSurfaceCallbackMap.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static boolean checkIsOnMainThread() {
        return C786410Ut5.u3() == Looper.getMainLooper().getThread();
    }

    public RTCSurfaceHelper(long j) {
        this.mSurfaceHelperHandle = 0L;
        this.mSurfaceHelperHandle = Long.valueOf(j);
    }

    private void unRegisterSurfaceCallback(Object obj) {
        if (obj instanceof RTCSurfaceTextureListener) {
            ((RTCSurfaceTextureListener) obj).resetCallback();
        } else {
            if (!(obj instanceof RTCSurfaceViewListener)) {
                return;
            }
            ((RTCSurfaceViewListener) obj).resetCallback();
        }
    }

    public void unRegisterRenderTargetView(String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            try {
                if (this.mSurfaceCallbackMap.containsKey(str)) {
                    unRegisterSurfaceCallback(this.mSurfaceCallbackMap.get(str));
                    this.mSurfaceCallbackMap.remove(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    private Object registerSurfaceCallback(Object obj, String str) {
        if (obj instanceof SurfaceView) {
            SurfaceView surfaceView = (SurfaceView) obj;
            RTCSurfaceViewListener rTCSurfaceViewListener = new RTCSurfaceViewListener(surfaceView, this.mSurfaceHelperHandle.longValue(), str);
            surfaceView.getHolder().addCallback(rTCSurfaceViewListener);
            return rTCSurfaceViewListener;
        }
        if (obj instanceof TextureView) {
            TextureView textureView = (TextureView) obj;
            RTCSurfaceTextureListener rTCSurfaceTextureListener = new RTCSurfaceTextureListener(textureView, this.mSurfaceHelperHandle.longValue(), str);
            textureView.setSurfaceTextureListener(rTCSurfaceTextureListener);
            return rTCSurfaceTextureListener;
        }
        return null;
    }

    public void registerRenderTargetView(View view, String str) {
        synchronized (this.mSurfaceCallbackMapLock) {
            try {
                if (this.mSurfaceCallbackMap.containsKey(str)) {
                    unRegisterRenderTargetView(str);
                }
                Object objRegisterSurfaceCallback = registerSurfaceCallback(view, str);
                if (objRegisterSurfaceCallback != null) {
                    this.mSurfaceCallbackMap.put(str, objRegisterSurfaceCallback);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
