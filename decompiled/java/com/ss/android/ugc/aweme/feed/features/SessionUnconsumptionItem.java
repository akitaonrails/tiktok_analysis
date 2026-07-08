package com.ss.android.ugc.aweme.feed.features;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.live.HotReloadFeedParams;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes34.dex */
public final class SessionUnconsumptionItem {

    @C09CT("ad_id")
    public String adId;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String aid;

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("creative_id")
    public String creativeId;

    @C09CT("file_key_hash")
    public int fileKeyHash;

    @C09CT("live_hot_refresh_info")
    public HotReloadFeedParams hotReloadFeedParams;

    @C09CT("is_ad")
    public final boolean isAd;

    @C09CT("is_cache")
    public boolean isCache;

    @C09CT("is_ecom")
    public final boolean isEcom;

    @C09CT("is_live")
    public boolean isLive;

    @C09CT("timestamp")
    public final long ts;

    public SessionUnconsumptionItem(String str, int i, boolean z, boolean z2, long j, int i2, boolean z3, boolean z4, HotReloadFeedParams hotReloadFeedParams, String str2, String str3) {
        this.aid = str;
        this.awemeType = i;
        this.isAd = z;
        this.isEcom = z2;
        this.ts = j;
        this.fileKeyHash = i2;
        this.isCache = z3;
        this.isLive = z4;
        this.hotReloadFeedParams = hotReloadFeedParams;
        this.adId = str2;
        this.creativeId = str3;
    }
}
