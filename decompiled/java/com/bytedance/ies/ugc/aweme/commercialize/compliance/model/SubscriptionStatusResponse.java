package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionStatusResponse extends BaseResponse implements Serializable {

    @C09CT("subscription_expire_timestamp")
    public final Integer expireTimestamp;

    @C09CT("should_show_survey")
    public final Boolean shouldShowSurvey;

    @C09CT("should_show_survey_banner")
    public final Boolean shouldShowSurveyBanner;

    @C09CT("subscription_start_timestamp")
    public final Integer startTimestamp;

    @C09CT("subscription_phase")
    public final Integer subscriptionPhase;

    public SubscriptionStatusResponse() {
        this(0, 0, null, null, null);
    }

    public final SubscriptionStatusResponse copy(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2) {
        return new SubscriptionStatusResponse(num, num2, num3, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionStatusResponse)) {
            return false;
        }
        SubscriptionStatusResponse subscriptionStatusResponse = (SubscriptionStatusResponse) obj;
        return Intrinsics.LJFF(this.startTimestamp, subscriptionStatusResponse.startTimestamp) && Intrinsics.LJFF(this.expireTimestamp, subscriptionStatusResponse.expireTimestamp) && Intrinsics.LJFF(this.subscriptionPhase, subscriptionStatusResponse.subscriptionPhase) && Intrinsics.LJFF(this.shouldShowSurvey, subscriptionStatusResponse.shouldShowSurvey) && Intrinsics.LJFF(this.shouldShowSurveyBanner, subscriptionStatusResponse.shouldShowSurveyBanner);
    }

    public int hashCode() {
        Integer num = this.startTimestamp;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.expireTimestamp;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.subscriptionPhase;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.shouldShowSurvey;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowSurveyBanner;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionStatusResponse(startTimestamp=");
        sbLIZ.append(this.startTimestamp);
        sbLIZ.append(", expireTimestamp=");
        sbLIZ.append(this.expireTimestamp);
        sbLIZ.append(", subscriptionPhase=");
        sbLIZ.append(this.subscriptionPhase);
        sbLIZ.append(", shouldShowSurvey=");
        sbLIZ.append(this.shouldShowSurvey);
        sbLIZ.append(", shouldShowSurveyBanner=");
        sbLIZ.append(this.shouldShowSurveyBanner);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Integer getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public final Boolean getShouldShowSurvey() {
        return this.shouldShowSurvey;
    }

    public final Boolean getShouldShowSurveyBanner() {
        return this.shouldShowSurveyBanner;
    }

    public final Integer getStartTimestamp() {
        return this.startTimestamp;
    }

    public final Integer getSubscriptionPhase() {
        return this.subscriptionPhase;
    }

    public SubscriptionStatusResponse(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2) {
        this.startTimestamp = num;
        this.expireTimestamp = num2;
        this.subscriptionPhase = num3;
        this.shouldShowSurvey = bool;
        this.shouldShowSurveyBanner = bool2;
    }
}
