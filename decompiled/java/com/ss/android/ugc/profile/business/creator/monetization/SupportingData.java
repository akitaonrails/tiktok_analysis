package com.ss.android.ugc.profile.business.creator.monetization;

import X.C09CT;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;

/* JADX INFO: loaded from: classes20.dex */
public final class SupportingData extends AdvancedFeatureBaseData {
    public static final int $stable = 8;

    @C09CT("supporting_ngo")
    public ProfileNgoStruct supportedNonprofit;

    public final ProfileNgoStruct getSupportedNonprofit() {
        return this.supportedNonprofit;
    }

    public final void setSupportedNonprofit(ProfileNgoStruct profileNgoStruct) {
        this.supportedNonprofit = profileNgoStruct;
    }
}
