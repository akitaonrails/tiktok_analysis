package com.ss.lyrax.video;

import android.view.View;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;

/* JADX INFO: loaded from: classes21.dex */
public interface ILyraxVideoRenderer {
    LyraxVideoRenderConfig getConfig();

    int getRenderElapse();

    View getRenderTargetView();

    void initConfig(LyraxVideoRenderConfig lyraxVideoRenderConfig);

    void release();

    void renderFrame(LyraxVideoFrame lyraxVideoFrame);

    void setEnableSingleView(boolean z);

    void setRenderEventCallback(long j);

    void setRenderTargetView(View view);

    void setRenderTargetWindow(View view);
}
