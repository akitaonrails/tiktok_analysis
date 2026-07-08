package com.ss.android.ugc.aweme.lemon8;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class Lemon8CampaignDeeplink {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("type")
    public final String type;

    public Lemon8CampaignDeeplink() {
        this("campaign", "");
    }

    public Lemon8CampaignDeeplink(String str, String str2) {
        this.type = str;
        this.id = str2;
    }
}
