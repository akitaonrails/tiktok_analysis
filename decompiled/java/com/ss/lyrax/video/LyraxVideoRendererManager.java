package com.ss.lyrax.video;

import android.view.View;
import com.ss.lyrax.ILyraxObject;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoRendererManager implements ILyraxObject {
    public final long handle;

    public static native ILyraxVideoRenderer[] nativeDetachAllVideoRenderers(long j);

    public static native ILyraxVideoRenderer nativeDetachVideoRenderer(long j, String str);

    public static native ILyraxVideoRenderer nativeFindVideoRenderer(long j, String str);

    public static native boolean nativeGetGlobalSingleViewMode(long j);

    public static native LyraxVideoRenderConfig nativeGetVideoRenderConfig(long j, String str);

    public static native ILyraxVideoRenderer nativeGetVideoRenderer(long j, String str);

    public static native void nativeRemoveVideoRenderer(long j, String str);

    public static native void nativeSetGlobalSingleViewMode(long j, boolean z);

    public static native void nativeSetRenderTargetWindow(long j, String str, View view);

    public static native void nativeSetVideoRenderConfig(long j, LyraxVideoRenderConfig lyraxVideoRenderConfig);

    public static native void nativeSetVideoRenderer(long j, String str, ILyraxVideoRenderer iLyraxVideoRenderer);

    public static native void nativeSetVideoRendererFactory(long j, ILyraxVideoRendererFactory iLyraxVideoRendererFactory);

    public ILyraxVideoRenderer[] detachAllVideoRenderers() {
        ILyraxVideoRenderer[] iLyraxVideoRendererArrNativeDetachAllVideoRenderers = nativeDetachAllVideoRenderers(this.handle);
        return iLyraxVideoRendererArrNativeDetachAllVideoRenderers == null ? new ILyraxVideoRenderer[0] : iLyraxVideoRendererArrNativeDetachAllVideoRenderers;
    }

    public boolean getGlobalSingleViewMode() {
        return nativeGetGlobalSingleViewMode(this.handle);
    }

    @Override // com.ss.lyrax.ILyraxObject
    public long getNativePtr() {
        return this.handle;
    }

    public LyraxVideoRendererManager(long j) {
        if (j != 0) {
            this.handle = j;
            return;
        }
        throw new IllegalStateException("handle is nullptr");
    }

    public ILyraxVideoRenderer detachVideoRenderer(String str) {
        if (str != null && !str.isEmpty()) {
            return nativeDetachVideoRenderer(this.handle, str);
        }
        return null;
    }

    public ILyraxVideoRenderer findVideoRenderer(String str) {
        if (str != null && !str.isEmpty()) {
            return nativeFindVideoRenderer(this.handle, str);
        }
        return null;
    }

    public LyraxVideoRenderConfig getVideoRenderConfig(String str) {
        if (str != null && !str.isEmpty()) {
            return nativeGetVideoRenderConfig(this.handle, str);
        }
        return null;
    }

    public ILyraxVideoRenderer getVideoRenderer(String str) {
        if (str != null && !str.isEmpty()) {
            return nativeGetVideoRenderer(this.handle, str);
        }
        return null;
    }

    public void removeVideoRenderer(String str) {
        if (str != null && !str.isEmpty()) {
            nativeRemoveVideoRenderer(this.handle, str);
        }
    }

    public void setGlobalSingleViewMode(boolean z) {
        nativeSetGlobalSingleViewMode(this.handle, z);
    }

    public void setVideoRenderConfig(LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        String str;
        if (lyraxVideoRenderConfig != null && (str = lyraxVideoRenderConfig.renderId) != null && !str.isEmpty()) {
            nativeSetVideoRenderConfig(this.handle, lyraxVideoRenderConfig);
        }
    }

    public void setVideoRendererFactory(ILyraxVideoRendererFactory iLyraxVideoRendererFactory) {
        if (iLyraxVideoRendererFactory == null) {
            return;
        }
        nativeSetVideoRendererFactory(this.handle, iLyraxVideoRendererFactory);
    }

    public void setRenderTargetView(String str, View view) {
        if (str != null && !str.isEmpty()) {
            nativeSetRenderTargetWindow(this.handle, str, view);
        }
    }

    public void setVideoRenderer(String str, ILyraxVideoRenderer iLyraxVideoRenderer) {
        if (str != null && !str.isEmpty() && iLyraxVideoRenderer != null) {
            nativeSetVideoRenderer(this.handle, str, iLyraxVideoRenderer);
        }
    }
}
