package com.bytedance.ies.ugc.aweme.commercialize.compliance.adchoice;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public final class AdChoiceDeviceUserAge extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("age_eligible")
    public Integer ageEligible;

    public final Integer getAgeEligible() {
        return this.ageEligible;
    }

    public AdChoiceDeviceUserAge(Integer num) {
        this.ageEligible = num;
    }

    public final void setAgeEligible(Integer num) {
        this.ageEligible = num;
    }
}
