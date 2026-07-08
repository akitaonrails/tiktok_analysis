package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class PreloadWidgetsData {

    @C09CT("disable_recycle_image")
    public final boolean disableRecycleImage;

    @C09CT("enable_recycle_widget")
    public final boolean enableRecycleWidget;

    @C09CT("live_hot_level")
    public final int liveHotLevel;

    public PreloadWidgetsData() {
        this(false, true, 999);
    }

    public PreloadWidgetsData(boolean z, boolean z2, int i) {
        this.disableRecycleImage = z;
        this.enableRecycleWidget = z2;
        this.liveHotLevel = i;
    }
}
