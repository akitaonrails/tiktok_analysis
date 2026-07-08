package com.bytedance.android.livesdk.gift.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class CampaignBanner {

    @C09CT("campaign_banner_type")
    public int campaignBannerType;

    @C09CT("banner_title")
    public String bannerTitle = "";

    @C09CT("banner_desc")
    public String bannerDesc = "";

    @C09CT("redirect_url")
    public String redirectUrl = "";

    @C09CT("user_info")
    public List<CampaignUser> userInfo = new ArrayList();

    public static final class CampaignUser {

        @C09CT("opt_out")
        public boolean optOut;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id = "";

        @C09CT("avatar_url")
        public String avatarUrl = "";
    }
}
