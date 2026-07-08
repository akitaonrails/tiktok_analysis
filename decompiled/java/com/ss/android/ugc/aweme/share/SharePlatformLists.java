package com.ss.android.ugc.aweme.share;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class SharePlatformLists {

    @C09CT("after_post_popup_platforms")
    public final SharePlatformConfig afterPostPopupPlatforms;

    @C09CT("quick_share_button_platforms")
    public final SharePlatformConfig quickShareButtonPlatforms;

    @C09CT("self_post_list_popup_platforms")
    public final SharePlatformConfig selfPostListPopupPlatforms;

    @C09CT("self_share_panel_platforms")
    public final SharePlatformConfig selfSharePanelPlatforms;

    @C09CT("share_panel_platforms")
    public final SharePlatformConfig sharePanelPlatforms;

    public SharePlatformLists(SharePlatformConfig sharePlatformConfig, SharePlatformConfig sharePlatformConfig2, SharePlatformConfig sharePlatformConfig3, SharePlatformConfig sharePlatformConfig4, SharePlatformConfig sharePlatformConfig5) {
        this.sharePanelPlatforms = sharePlatformConfig;
        this.selfSharePanelPlatforms = sharePlatformConfig2;
        this.quickShareButtonPlatforms = sharePlatformConfig3;
        this.afterPostPopupPlatforms = sharePlatformConfig4;
        this.selfPostListPopupPlatforms = sharePlatformConfig5;
    }
}
