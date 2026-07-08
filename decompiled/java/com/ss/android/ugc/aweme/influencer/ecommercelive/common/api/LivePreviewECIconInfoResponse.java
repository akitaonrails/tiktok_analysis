package com.ss.android.ugc.aweme.influencer.ecommercelive.common.api;

import X.C09CT;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model.ECGuidanceCard;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class LivePreviewECIconInfoResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("guidance")
    public final ECGuidanceCard guidance;

    @C09CT("has_ec_live_permission")
    public final Boolean hasECLivePermission;

    @C09CT("onboarding_schema")
    public final String onboardingSchema;

    public LivePreviewECIconInfoResponse() {
        this(Boolean.FALSE, "", null);
    }

    public LivePreviewECIconInfoResponse(Boolean bool, String str, ECGuidanceCard eCGuidanceCard) {
        this.hasECLivePermission = bool;
        this.onboardingSchema = str;
        this.guidance = eCGuidanceCard;
    }
}
