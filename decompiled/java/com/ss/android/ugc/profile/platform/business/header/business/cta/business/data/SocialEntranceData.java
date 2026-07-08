package com.ss.android.ugc.profile.platform.business.header.business.cta.business.data;

import X.C09CT;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class SocialEntranceData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("social_connect")
    public SocialConnect socialConnect;

    public final SocialConnect getSocialConnect() {
        return this.socialConnect;
    }

    public final void setSocialConnect(SocialConnect socialConnect) {
        this.socialConnect = socialConnect;
    }
}
