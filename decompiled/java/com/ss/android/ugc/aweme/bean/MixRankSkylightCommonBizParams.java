package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.EnumC1582650rHr;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightCommonBizParams implements Serializable {

    @C09CT("fetch_type")
    public final int fetchType;

    @C09CT("is_non_personalized")
    public final boolean isNonPersonalized;

    @C09CT("is_preload")
    public final int isPreload;

    @C09CT("pull_type")
    public final int pullType;

    public MixRankSkylightCommonBizParams() {
        this(false, 1, EnumC1582650rHr.DEFAULT.getType(), 0);
    }

    public final boolean isNonPersonalized() {
        return this.isNonPersonalized;
    }

    public final int isPreload() {
        return this.isPreload;
    }

    public MixRankSkylightCommonBizParams(boolean z, int i, int i2, int i3) {
        this.isNonPersonalized = z;
        this.fetchType = i;
        this.pullType = i2;
        this.isPreload = i3;
    }
}
