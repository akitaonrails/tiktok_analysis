package com.ss.lyrax.video;

import X.C2188811AlT;
import android.view.View;
import com.ss.lyrax.ILyraxVideo;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.video.bridge.AbsBmfBridgeCallback;
import com.ss.lyrax.video.bridge.AbsEffectBridgeCallback;
import com.ss.lyrax.video.bridge.IVideoPublishCallback;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoImpl implements ILyraxVideo {
    public AbsBmfBridgeCallback bmfBridgeCallback;
    public AbsEffectBridgeCallback effectBridgeCallback;
    public final long handle;
    public LyraxVideoRendererManager rendererManager;

    public static native int nativeBindVideoPlatformWrapper(long j, AbsLyraxVideoPlatformWrapper absLyraxVideoPlatformWrapper, AbsBmfBridgeCallback absBmfBridgeCallback, AbsEffectBridgeCallback absEffectBridgeCallback, IVideoPublishCallback iVideoPublishCallback);

    public static native int nativeClearCapturePreviewTargetWindow(long j);

    public static native int nativeDebugAddCaptureVideoFrameSink(long j, String str, ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat, int i);

    public static native int nativeDebugClearCaptureVideoFrameSinks(long j);

    public static native int nativeDebugRemoveCaptureVideoFrameSink(long j, String str);

    public static native int nativeDebugSetCapturePreprocessTarget(long j, int i, int i2, LyraxVideoPixelFormat lyraxVideoPixelFormat);

    public static native long nativeGetVideoRendererManager(long j);

    public static native int nativeSetCapturePreviewRenderType(long j, int i);

    public static native int nativeSetCapturePreviewTargetWindow(long j, View view);

    public static native int nativeUnbindVideoPlatformWrapper(long j);

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized LyraxErrorCode clearDisplayView() {
        return LyraxErrorCode.fromId(nativeClearCapturePreviewTargetWindow(this.handle));
    }

    public synchronized LyraxErrorCode debugClearCaptureVideoFrameSinks() {
        return LyraxErrorCode.fromId(nativeDebugClearCaptureVideoFrameSinks(this.handle));
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized LyraxVideoRendererManager getVideoRendererManager() {
        if (this.rendererManager == null) {
            long jNativeGetVideoRendererManager = nativeGetVideoRendererManager(this.handle);
            if (jNativeGetVideoRendererManager == 0) {
                return null;
            }
            this.rendererManager = new LyraxVideoRendererManager(jNativeGetVideoRendererManager);
        }
        return this.rendererManager;
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized int unbindVideoPlatformWrapper() {
        return nativeUnbindVideoPlatformWrapper(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxVideoImpl(long j) {
        if (j != 0) {
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handle is nullptr");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized int bindVideoPlatformWrapper(AbsLyraxVideoPlatformWrapper absLyraxVideoPlatformWrapper) {
        boolean z;
        IVideoPublishCallback iVideoPublishCallback;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindVideoPlatformWrapper providerOwner=LyraxVideoImpl bmf=true effect=true customBmf=");
        boolean z2 = true;
        if (this.bmfBridgeCallback != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(" customEffect=");
        if (this.effectBridgeCallback == null) {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" wrapperGetterFallback=false");
        C2188811AlT.LIZIZ(sbLIZ);
        if (absLyraxVideoPlatformWrapper instanceof IVideoPublishCallback) {
            iVideoPublishCallback = (IVideoPublishCallback) absLyraxVideoPlatformWrapper;
        } else {
            iVideoPublishCallback = null;
        }
        return nativeBindVideoPlatformWrapper(this.handle, absLyraxVideoPlatformWrapper, this.bmfBridgeCallback, this.effectBridgeCallback, iVideoPublishCallback);
    }

    public synchronized LyraxErrorCode debugRemoveCaptureVideoFrameSink(String str) {
        return LyraxErrorCode.fromId(nativeDebugRemoveCaptureVideoFrameSink(this.handle, str));
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized LyraxErrorCode resetPreviewView(View view) {
        return LyraxErrorCode.fromId(nativeSetCapturePreviewTargetWindow(this.handle, view));
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized void setBmfBridgeCallback(AbsBmfBridgeCallback absBmfBridgeCallback) {
        this.bmfBridgeCallback = absBmfBridgeCallback;
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized LyraxErrorCode setCapturePreviewRenderType(LyraxVideoRendererType lyraxVideoRendererType) {
        if (lyraxVideoRendererType == null) {
            return LyraxErrorCode.INVALID_PARAMS;
        }
        return LyraxErrorCode.fromId(nativeSetCapturePreviewRenderType(this.handle, lyraxVideoRendererType.value()));
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized LyraxErrorCode setDisplayView(View view) {
        return LyraxErrorCode.fromId(nativeSetCapturePreviewTargetWindow(this.handle, view));
    }

    @Override // com.ss.lyrax.ILyraxVideo
    public synchronized void setEffectBridgeCallback(AbsEffectBridgeCallback absEffectBridgeCallback) {
        this.effectBridgeCallback = absEffectBridgeCallback;
    }

    public synchronized LyraxErrorCode debugSetCapturePreprocessTarget(int i, int i2, LyraxVideoPixelFormat lyraxVideoPixelFormat) {
        return LyraxErrorCode.fromId(nativeDebugSetCapturePreprocessTarget(this.handle, i, i2, lyraxVideoPixelFormat));
    }

    public synchronized LyraxErrorCode debugAddCaptureVideoFrameSink(String str, ILyraxVideoFrameSink iLyraxVideoFrameSink, LyraxVideoPixelFormat lyraxVideoPixelFormat, int i) {
        return LyraxErrorCode.fromId(nativeDebugAddCaptureVideoFrameSink(this.handle, str, iLyraxVideoFrameSink, lyraxVideoPixelFormat, i));
    }
}
