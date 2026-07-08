package com.ss.lyrax.video.bridge;

import com.ss.lyrax.video.LyraxVideoFrame;

/* JADX INFO: loaded from: classes21.dex */
public interface IEffectBridgeCallback {
    void appendComposerForChain(int i, String[] strArr, String[] strArr2);

    void clearAuxFrame(int i);

    boolean isEnabled();

    LyraxVideoFrame processWithChain(int i, LyraxVideoFrame lyraxVideoFrame);

    void setAuxFrame(int i, LyraxVideoFrame lyraxVideoFrame);
}
