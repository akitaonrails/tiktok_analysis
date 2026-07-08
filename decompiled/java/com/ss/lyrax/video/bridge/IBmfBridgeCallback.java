package com.ss.lyrax.video.bridge;

import com.ss.lyrax.video.LyraxVideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IBmfBridgeCallback {
    boolean isEnabled();

    LyraxVideoFrame processFrame(LyraxVideoFrame lyraxVideoFrame);
}
