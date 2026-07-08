package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryAdInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("author")
    public final User author;

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("is_ads")
    public final Boolean isAds;

    @C09CT("raw_ad_data")
    public final String rawAdData;

    @C09CT("_AME_Header_RequestID")
    public final String requestId;

    public AdWebHistoryAdInfo() {
        this(null, null, null, null, null);
    }

    public final Boolean isAds() {
        return this.isAds;
    }

    public AdWebHistoryAdInfo(String str, String str2, User user, Boolean bool, String str3) {
        this.requestId = str;
        this.awemeId = str2;
        this.author = user;
        this.isAds = bool;
        this.rawAdData = str3;
    }
}
