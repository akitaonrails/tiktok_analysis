package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightLocalRerankExpData {

    @C09CT("enable_exit_from_story_rerank")
    public final boolean enableExitFromStoryRerank;

    @C09CT("enable")
    public final boolean enableReorder;

    @C09CT("enable_tab_change_rerank")
    public final boolean enableTabChangeRerank;

    @C09CT("following")
    public final boolean followingEnableReorder;

    @C09CT("friends")
    public final boolean friendsEnableReorder;

    @C09CT("fyp")
    public final boolean fypEnableReorder;

    @C09CT("inbox")
    public final boolean inboxEnableReorder;

    @C09CT("skylight_rerank_gap_in_s")
    public final long skylightRerankGapInS;

    public SkylightLocalRerankExpData() {
        this(false, 50L, false, false, false, false, false, false);
    }

    public SkylightLocalRerankExpData(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.enableReorder = z;
        this.skylightRerankGapInS = j;
        this.inboxEnableReorder = z2;
        this.fypEnableReorder = z3;
        this.friendsEnableReorder = z4;
        this.followingEnableReorder = z5;
        this.enableTabChangeRerank = z6;
        this.enableExitFromStoryRerank = z7;
    }
}
