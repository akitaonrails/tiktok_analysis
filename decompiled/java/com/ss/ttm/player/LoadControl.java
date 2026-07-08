package com.ss.ttm.player;

/* JADX INFO: loaded from: classes24.dex */
public abstract class LoadControl extends NativeObject {
    public abstract int onCodecStackSelected(int i);

    public abstract int onFilterStackSelected(int i);

    public abstract int onTrackSelected(int i);

    public abstract boolean shouldStartPlayback(long j, float f, boolean z);
}
