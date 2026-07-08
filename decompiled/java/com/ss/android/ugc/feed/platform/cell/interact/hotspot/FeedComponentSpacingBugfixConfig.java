package com.ss.android.ugc.feed.platform.cell.interact.hotspot;

import X.C09CT;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedComponentSpacingBugfixConfig {

    @C09CT("enable_bottom_label")
    public final Boolean enableBottomLabel;

    @C09CT("enable_container_view_show")
    public final Boolean enableContainerViewShow;

    @C09CT("enable_hide_translation")
    public final Boolean enableHideTranslation;

    @C09CT("enable_quick_comment")
    public final Boolean enableQuickComment;

    @C09CT("enable_tv_cast")
    public final Boolean enableTvCast;

    public FeedComponentSpacingBugfixConfig(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        this.enableTvCast = bool;
        this.enableQuickComment = bool2;
        this.enableContainerViewShow = bool3;
        this.enableHideTranslation = bool4;
        this.enableBottomLabel = bool5;
    }
}
