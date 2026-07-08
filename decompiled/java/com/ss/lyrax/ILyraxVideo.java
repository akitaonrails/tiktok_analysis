package com.ss.lyrax;

import android.view.View;
import com.ss.lyrax.video.AbsLyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxVideoRendererManager;
import com.ss.lyrax.video.LyraxVideoRendererType;
import com.ss.lyrax.video.bridge.AbsBmfBridgeCallback;
import com.ss.lyrax.video.bridge.AbsEffectBridgeCallback;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxVideo extends ILyraxObject {
    int bindVideoPlatformWrapper(AbsLyraxVideoPlatformWrapper absLyraxVideoPlatformWrapper);

    LyraxErrorCode clearDisplayView();

    LyraxVideoRendererManager getVideoRendererManager();

    LyraxErrorCode resetPreviewView(View view);

    void setBmfBridgeCallback(AbsBmfBridgeCallback absBmfBridgeCallback);

    LyraxErrorCode setCapturePreviewRenderType(LyraxVideoRendererType lyraxVideoRendererType);

    LyraxErrorCode setDisplayView(View view);

    void setEffectBridgeCallback(AbsEffectBridgeCallback absEffectBridgeCallback);

    int unbindVideoPlatformWrapper();
}
