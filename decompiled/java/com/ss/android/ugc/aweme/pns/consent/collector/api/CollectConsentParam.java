package com.ss.android.ugc.aweme.pns.consent.collector.api;

import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class CollectConsentParam {
    public Map<String, String> LIZ;

    @C09CT("consent_action_on_display")
    public final Integer consentActionOnDisplay;

    @C09CT("consent_key")
    public final String consentKey;

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("flow")
    public final String flow;

    @C09CT("scenario")
    public final String scenario;

    @C09CT("skip_check_consent_status")
    public final boolean skipCheckConsentStatus;

    public CollectConsentParam() {
        this("", "", "", null, false);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectConsentParam(consentKey='");
        sbLIZ.append(this.consentKey);
        sbLIZ.append("', flow='");
        sbLIZ.append(this.flow);
        sbLIZ.append("', scenario='");
        sbLIZ.append(this.scenario);
        sbLIZ.append("', consentActionOnDisplay=");
        sbLIZ.append(this.consentActionOnDisplay);
        sbLIZ.append(", skipCheckConsentStatus=");
        sbLIZ.append(this.skipCheckConsentStatus);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", eventTrackingParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CollectConsentParam(String str, String str2, String str3, Integer num, boolean z) {
        this.consentKey = str;
        this.flow = str2;
        this.scenario = str3;
        this.consentActionOnDisplay = num;
        this.skipCheckConsentStatus = z;
        this.extra = C2097608Jq.LJ();
        this.LIZ = C2097608Jq.LJ();
    }
}
