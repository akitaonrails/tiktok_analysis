package com.ss.lyrax.video.bridge;

import X.C1280100jPs;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.LyraxVideoFrame;
import com.ss.ttlivestreamer.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsEffectBridgeCallback extends NativeObject implements IEffectBridgeCallback {
    public boolean released;

    private native long nativeCreatePeer();

    public static native void nativeDestroyPeer(long j);

    @Override // com.ss.lyrax.video.bridge.IEffectBridgeCallback
    public final /* synthetic */ void appendComposerForChain(int i, String[] strArr, String[] strArr2) {
        C1280100jPs.LIZ(this, i, strArr, strArr2);
    }

    @Override // com.ss.lyrax.video.bridge.IEffectBridgeCallback
    public final /* synthetic */ void clearAuxFrame(int i) {
        C1280100jPs.LIZIZ(this, i);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void finalize() {
        try {
            release();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public synchronized long getOrCreateNativePeer() {
        if (this.released) {
            return 0L;
        }
        long nativeObj = getNativeObj();
        if (nativeObj != 0) {
            return nativeObj;
        }
        long jNativeCreatePeer = nativeCreatePeer();
        if (jNativeCreatePeer != 0) {
            super.setNativeObj(jNativeCreatePeer);
        }
        return jNativeCreatePeer;
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        long nativeObj = getNativeObj();
        if (nativeObj != 0) {
            super.setNativeObj(0L);
            nativeDestroyPeer(nativeObj);
        }
    }

    @Override // com.ss.lyrax.video.bridge.IEffectBridgeCallback
    public final /* synthetic */ void setAuxFrame(int i, LyraxVideoFrame lyraxVideoFrame) {
        C1280100jPs.LIZJ(this, i, lyraxVideoFrame);
    }

    private boolean onIsEnabled() {
        try {
            return isEnabled();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    private LyraxVideoFrame onProcessChain(int i, LyraxVideoFrame lyraxVideoFrame) {
        try {
            return processWithChain(i, lyraxVideoFrame);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
