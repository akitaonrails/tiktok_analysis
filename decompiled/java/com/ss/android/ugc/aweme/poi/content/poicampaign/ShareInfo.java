package com.ss.android.ugc.aweme.poi.content.poicampaign;

import X.C09CT;

/* JADX INFO: loaded from: classes19.dex */
public final class ShareInfo {

    @C09CT("description")
    public final String description;

    @C09CT("share_card")
    public final ShareCard shareCard;

    public ShareInfo(ShareCard shareCard, String str) {
        this.shareCard = shareCard;
        this.description = str;
    }
}
