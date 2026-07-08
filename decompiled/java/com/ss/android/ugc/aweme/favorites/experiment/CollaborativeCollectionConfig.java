package com.ss.android.ugc.aweme.favorites.experiment;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes19.dex */
public final class CollaborativeCollectionConfig {

    @C09CT("fetch_muf_ab_group_size")
    public final int abSize;

    @C09CT("guide_type")
    public final int guideType;

    @C09CT("is_enable")
    public final int isEnabled;

    @C09CT("is_fully_launch")
    public final int isFullyLaunch;

    @C09CT("is_offline")
    public final boolean isOffline;

    @C09CT("writing_type")
    public final int writingType;

    public CollaborativeCollectionConfig() {
        this(0, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, 0, false);
    }

    public CollaborativeCollectionConfig(int i, int i2, int i3, int i4, int i5, boolean z) {
        this.isEnabled = i;
        this.isFullyLaunch = i2;
        this.abSize = i3;
        this.writingType = i4;
        this.guideType = i5;
        this.isOffline = z;
    }
}
