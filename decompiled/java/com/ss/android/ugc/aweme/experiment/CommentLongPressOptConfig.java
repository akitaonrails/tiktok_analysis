package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentLongPressOptConfig {

    @C09CT("action_height_optimise")
    public final boolean actionHeightOptimise;

    @C09CT("action_sort_optimise")
    public final boolean actionSortOptimise;

    @C09CT("avatar_optimise")
    public final boolean avatarOptimise;

    @C09CT("max_height_radio")
    public final Double maxHeightRadio;

    public CommentLongPressOptConfig() {
        this(false, null, false, false);
    }

    public CommentLongPressOptConfig(boolean z, Double d, boolean z2, boolean z3) {
        this.avatarOptimise = z;
        this.maxHeightRadio = d;
        this.actionHeightOptimise = z2;
        this.actionSortOptimise = z3;
    }
}
