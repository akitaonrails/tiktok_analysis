package com.ss.lyrax.video;

import X.C2188811AlT;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.video.bridge.AbsBmfBridgeCallback;
import com.ss.lyrax.video.bridge.AbsEffectBridgeCallback;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class AbsLyraxVideoPlatformWrapper extends NativeObject implements ILyraxVideoPlatformWrapper {
    public AbsBmfBridgeCallback bmfBridgeCallback;
    public AbsEffectBridgeCallback effectBridgeCallback;
    public boolean released;

    private synchronized void destroyNativePeerIfNeeded() {
        long nativeObj = getNativeObj();
        if (nativeObj != 0) {
            super.setNativeObj(0L);
            nativeDestroyVideoSourcePeer(nativeObj);
        }
    }

    public static native void nativeApplyErrorStrategy(long j);

    public static native void nativeApplyPauseStrategy(long j, boolean z);

    public static native int nativeBeginCaptureMask(long j);

    public static native void nativeClearAuxStream(long j, int i);

    private native long nativeCreateVideoSourcePeer();

    public static native void nativeDestroyVideoSourcePeer(long j);

    public static native int nativeEndCaptureMask(long j);

    public static native LyraxPreProcessVideoNodeStats nativeGetStats(long j);

    public static native LyraxErrorCode nativePushAuxFrame(long j, int i, LyraxVideoFrame lyraxVideoFrame, long j2);

    public static native LyraxErrorCode nativePushExternalJavaFrameToDevice(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native LyraxErrorCode nativePushJavaFrameToSink(long j, LyraxVideoFrame lyraxVideoFrame);

    public static native LyraxErrorCode nativePushStaticImage(long j, LyraxVideoFrame lyraxVideoFrame, int i);

    public static native void nativeSetErrorStrategy(long j, int i);

    public static native void nativeSetPauseStrategy(long j, int i);

    public static native int nativeSwitchCameraBack(long j);

    public static native int nativeSwitchCameraFront(long j);

    public static native int nativeSwitchCameraTo(long j, String str);

    public static native int nativeSwitchSubSource(long j, int i);

    public static native LyraxErrorCode nativeUpdateJavaStatsToSink(long j, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized void applyErrorStrategy() {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return;
        }
        nativeApplyErrorStrategy(nativePeer);
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

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized AbsBmfBridgeCallback getBmfBridgeCallback() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBmfBridgeCallback fallback_owner_used=true callback=");
        sbLIZ.append(this.bmfBridgeCallback != null);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.bmfBridgeCallback;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized AbsEffectBridgeCallback getEffectBridgeCallback() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getEffectBridgeCallback fallback_owner_used=true callback=");
        sbLIZ.append(this.effectBridgeCallback != null);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.effectBridgeCallback;
    }

    public synchronized long getOrCreateNativePeer() {
        if (this.released) {
            return 0L;
        }
        long nativeObj = getNativeObj();
        if (nativeObj != 0) {
            return nativeObj;
        }
        long jNativeCreateVideoSourcePeer = nativeCreateVideoSourcePeer();
        if (jNativeCreateVideoSourcePeer != 0) {
            super.setNativeObj(jNativeCreateVideoSourcePeer);
        }
        return jNativeCreateVideoSourcePeer;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxPreProcessVideoNodeStats getStats() {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return null;
        }
        return nativeGetStats(nativePeer);
    }

    public void onVideoCaptureFirstFrameRendered(int i, int i2, long j) {
    }

    public void onVideoCaptureFrameResolutionChanged(int i, int i2, long j) {
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.released) {
            return;
        }
        this.released = true;
        destroyNativePeerIfNeeded();
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode switchCameraBack() {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        return LyraxErrorCode.fromId(nativeSwitchCameraBack(nativePeer));
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode switchCameraFront() {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        return LyraxErrorCode.fromId(nativeSwitchCameraFront(nativePeer));
    }

    public final LyraxErrorCode beginCaptureMaskToNative() {
        long nativePeer = getNativePeer();
        return nativePeer == 0 ? LyraxErrorCode.INVALID_STATE : LyraxErrorCode.fromId(nativeBeginCaptureMask(nativePeer));
    }

    public final LyraxErrorCode endCaptureMaskToNative() {
        long nativePeer = getNativePeer();
        return nativePeer == 0 ? LyraxErrorCode.INVALID_STATE : LyraxErrorCode.fromId(nativeEndCaptureMask(nativePeer));
    }

    public final long getNativePeer() {
        return getNativeObj();
    }

    public final boolean hasNativePeer() {
        return getNativeObj() != 0;
    }

    public static LyraxVideoFrame buildFrameFromBitmap(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled() || (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE && (bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null)) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > 0 && height > 0) {
            int rowBytes = bitmap.getRowBytes();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(rowBytes * height);
            try {
                bitmap.copyPixelsToBuffer(byteBufferAllocateDirect);
                byteBufferAllocateDirect.rewind();
                LyraxVideoCPUBufferFrameBuilder lyraxVideoCPUBufferFrameBuilder = new LyraxVideoCPUBufferFrameBuilder(LyraxVideoPixelFormat.RGBA);
                lyraxVideoCPUBufferFrameBuilder.setWidth(width);
                lyraxVideoCPUBufferFrameBuilder.setHeight(height);
                lyraxVideoCPUBufferFrameBuilder.setPlaneStride(0, rowBytes);
                lyraxVideoCPUBufferFrameBuilder.setPlaneData(0, byteBufferAllocateDirect);
                lyraxVideoCPUBufferFrameBuilder.setTimeStampUs(0L);
                return lyraxVideoCPUBufferFrameBuilder.build();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized void applyPauseStrategy(boolean z) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return;
        }
        nativeApplyPauseStrategy(nativePeer, z);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized void clearAuxStream(int i) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return;
        }
        nativeClearAuxStream(nativePeer, i);
    }

    public final LyraxErrorCode pushExternalFrameToNative(LyraxVideoFrame lyraxVideoFrame) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        return nativePushExternalJavaFrameToDevice(nativePeer, lyraxVideoFrame);
    }

    public final LyraxErrorCode pushFrameToNative(LyraxVideoFrame lyraxVideoFrame) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        return nativePushJavaFrameToSink(nativePeer, lyraxVideoFrame);
    }

    public synchronized void setBmfBridgeCallback(AbsBmfBridgeCallback absBmfBridgeCallback) {
        this.bmfBridgeCallback = absBmfBridgeCallback;
    }

    public synchronized void setEffectBridgeCallback(AbsEffectBridgeCallback absEffectBridgeCallback) {
        this.effectBridgeCallback = absEffectBridgeCallback;
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized void setErrorStrategy(ErrorStrategy errorStrategy) {
        long nativePeer = getNativePeer();
        if (nativePeer != 0 && errorStrategy != null) {
            nativeSetErrorStrategy(nativePeer, errorStrategy.value());
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void setNativeObj(long j) {
        super.setNativeObj(j);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized void setPauseStrategy(PauseStrategy pauseStrategy) {
        long nativePeer = getNativePeer();
        if (nativePeer != 0 && pauseStrategy != null) {
            nativeSetPauseStrategy(nativePeer, pauseStrategy.value());
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode switchCameraTo(String str) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        if (str == null) {
            str = "";
        }
        return LyraxErrorCode.fromId(nativeSwitchCameraTo(nativePeer, str));
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode switchSubSource(LyraxVideoSubSource lyraxVideoSubSource) {
        long nativePeer = getNativePeer();
        if (nativePeer != 0 && lyraxVideoSubSource != null) {
            return LyraxErrorCode.fromId(nativeSwitchSubSource(nativePeer, lyraxVideoSubSource.value()));
        }
        return LyraxErrorCode.INVALID_STATE;
    }

    public final LyraxErrorCode updateStatsToNative(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        return nativeUpdateJavaStatsToSink(nativePeer, lyraxPreProcessVideoNodeStats);
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode pushStaticImageBitmap(Bitmap bitmap, int i) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        if (bitmap == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        LyraxVideoFrame lyraxVideoFrameBuildFrameFromBitmap = buildFrameFromBitmap(bitmap);
        if (lyraxVideoFrameBuildFrameFromBitmap == null) {
            return LyraxErrorCode.FAILURE;
        }
        try {
            LyraxErrorCode lyraxErrorCodeNativePushStaticImage = nativePushStaticImage(nativePeer, lyraxVideoFrameBuildFrameFromBitmap, i);
            lyraxVideoFrameBuildFrameFromBitmap.release();
            return lyraxErrorCodeNativePushStaticImage;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lyraxVideoFrameBuildFrameFromBitmap.release();
            throw th;
        }
    }

    @Override // com.ss.lyrax.video.ILyraxVideoPlatformWrapper
    public synchronized LyraxErrorCode pushAuxFrame(int i, LyraxVideoFrame lyraxVideoFrame, long j) {
        long nativePeer = getNativePeer();
        if (nativePeer == 0) {
            return LyraxErrorCode.INVALID_STATE;
        }
        if (lyraxVideoFrame == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return nativePushAuxFrame(nativePeer, i, lyraxVideoFrame, j);
    }
}
