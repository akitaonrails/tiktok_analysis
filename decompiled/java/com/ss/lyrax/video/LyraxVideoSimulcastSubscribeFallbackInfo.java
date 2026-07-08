package com.ss.lyrax.video;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxVideoSimulcastSubscribeFallbackInfo {
    public boolean afterEnable;
    public int afterSimulcastLayerIndex;
    public boolean beforeEnable;
    public int beforeSimulcastLayerIndex;
    public boolean isScreen;
    public LyraxVideoFallbackOrRecoverReason reason = LyraxVideoFallbackOrRecoverReason.UNKNOWN;

    public LyraxVideoSimulcastSubscribeFallbackInfo(boolean z, int i, int i2, boolean z2, boolean z3, LyraxVideoFallbackOrRecoverReason lyraxVideoFallbackOrRecoverReason) {
        this.isScreen = z;
    }
}
