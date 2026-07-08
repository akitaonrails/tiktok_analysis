package com.ss.android.ugc.aweme.legoImp.task.pumbaa.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class BPEAScreenshotSwitch {

    @C09CT("enableBlock")
    public final boolean enableBlock;

    @C09CT("enableCheck")
    public final boolean enableCheck;

    public BPEAScreenshotSwitch() {
        this(true, false);
    }

    public BPEAScreenshotSwitch(boolean z, boolean z2) {
        this.enableCheck = z;
        this.enableBlock = z2;
    }
}
