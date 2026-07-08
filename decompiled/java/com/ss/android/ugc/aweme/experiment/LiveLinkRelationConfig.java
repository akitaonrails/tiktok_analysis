package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class LiveLinkRelationConfig {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("new_system_prompt")
    public final boolean newSystemPrompt;

    @C09CT("sharer_banner_after_live")
    public final boolean sharerBannerAfterLive;

    @C09CT("sharer_sheet_countdown")
    public final int sharerBottomSheetCountDown;

    @C09CT("sharer_sheet")
    public final boolean sharerBottomSheetInLive;

    public LiveLinkRelationConfig() {
        this(false, true, 5, true, true);
    }

    public LiveLinkRelationConfig(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.enabled = z;
        this.sharerBottomSheetInLive = z2;
        this.sharerBottomSheetCountDown = i;
        this.newSystemPrompt = z3;
        this.sharerBannerAfterLive = z4;
    }
}
