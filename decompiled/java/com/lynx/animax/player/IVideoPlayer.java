package com.lynx.animax.player;

/* JADX INFO: loaded from: classes21.dex */
public interface IVideoPlayer {
    void attachAsset(VideoAsset videoAsset);

    void destroy();

    float[] getTransformMatrix();

    void setSurface(int i);

    boolean updateSurface(int i);
}
