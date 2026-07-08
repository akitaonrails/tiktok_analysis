package com.bytedance.android.livesdk.comp.api.linkcore.model;

/* JADX INFO: loaded from: classes13.dex */
public final class BroadcastResumeInfo {
    public final int continueScene;
    public final long linkMicUserNum;

    public BroadcastResumeInfo() {
        this(0, 0L);
    }

    public final int getRealScene() {
        int i = this.continueScene;
        if (i != 1) {
            return i != 2 ? 0 : 2;
        }
        return 4;
    }

    public BroadcastResumeInfo(int i, long j) {
        this.continueScene = i;
        this.linkMicUserNum = j;
    }
}
