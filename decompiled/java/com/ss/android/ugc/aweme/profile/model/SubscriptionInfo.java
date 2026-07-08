package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class SubscriptionInfo implements Serializable {

    @C09CT("audience_sub_info")
    public final AudienceSubInfo audienceSubInfo;

    @C09CT("creator_sub_info")
    public final CreatorSubInfo creatorSubInfo;

    @C09CT("url")
    public final String url;

    public final AudienceSubInfo getAudienceSubInfo() {
        return this.audienceSubInfo;
    }

    public final CreatorSubInfo getCreatorSubInfo() {
        return this.creatorSubInfo;
    }

    public final String getUrl() {
        return this.url;
    }

    public SubscriptionInfo(CreatorSubInfo creatorSubInfo, AudienceSubInfo audienceSubInfo, String str) {
        this.creatorSubInfo = creatorSubInfo;
        this.audienceSubInfo = audienceSubInfo;
        this.url = str;
    }
}
