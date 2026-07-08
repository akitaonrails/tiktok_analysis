package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class CommitConfig {

    @C09CT("affect_scene")
    public final String affectScene;

    @C09CT("delay_time")
    public final long delayTime;

    @C09CT("open")
    public final boolean open;

    public CommitConfig() {
        this(false, "", Mp4ScreenVideoLoadTimeout.CONTROL);
    }

    public CommitConfig(boolean z, String str, long j) {
        this.open = z;
        this.affectScene = str;
        this.delayTime = j;
    }
}
