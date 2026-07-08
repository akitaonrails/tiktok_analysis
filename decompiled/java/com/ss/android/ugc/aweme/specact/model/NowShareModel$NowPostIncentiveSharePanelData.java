package com.ss.android.ugc.aweme.specact.model;

import X.C09CT;

/* JADX INFO: loaded from: classes22.dex */
public final class NowShareModel$NowPostIncentiveSharePanelData {

    @C09CT("description")
    public final String description;

    @C09CT("inapp_share_info")
    public final NowShareModel$NowPostIncentiveInAppShareInfo inAppShareInfo;

    @C09CT("share_link")
    public final String shareLink;

    @C09CT("title")
    public final String title;

    @C09CT("top_image")
    public final String topImage;

    public NowShareModel$NowPostIncentiveSharePanelData(NowShareModel$NowPostIncentiveInAppShareInfo nowShareModel$NowPostIncentiveInAppShareInfo, String str, String str2, String str3, String str4) {
        this.inAppShareInfo = nowShareModel$NowPostIncentiveInAppShareInfo;
        this.shareLink = str;
        this.topImage = str2;
        this.title = str3;
        this.description = str4;
    }
}
