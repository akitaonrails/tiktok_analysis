package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.data;

import X.C09CT;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;

/* JADX INFO: loaded from: classes12.dex */
public final class AccountInfoData extends BizBaseData {
    public static final int $stable = 8;

    @C09CT("learn_more_url")
    public String learnMoreUrl;

    public final String getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    public final void setLearnMoreUrl(String str) {
        this.learnMoreUrl = str;
    }
}
