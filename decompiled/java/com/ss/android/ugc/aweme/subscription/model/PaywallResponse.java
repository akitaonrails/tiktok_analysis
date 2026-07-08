package com.ss.android.ugc.aweme.subscription.model;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class PaywallResponse extends BaseResponse {

    @C09CT("cta_info")
    public final CtaInfo ctaInfo;

    @C09CT("paywall_text")
    public final String paywallText;

    @C09CT("paywall_title")
    public final String paywallTitle;

    @C09CT("perk_list")
    public final List<PerkData> perkList;

    @C09CT("preview_experiment_group")
    public final Integer previewExperimentGroup;

    @C09CT("purchase_schema")
    public final String purchaseSchema;

    @C09CT("subscribe_state")
    public final String subscribeState;

    public PaywallResponse() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallResponse)) {
            return false;
        }
        PaywallResponse paywallResponse = (PaywallResponse) obj;
        return Intrinsics.LJFF(this.ctaInfo, paywallResponse.ctaInfo) && Intrinsics.LJFF(this.paywallTitle, paywallResponse.paywallTitle) && Intrinsics.LJFF(this.paywallText, paywallResponse.paywallText) && Intrinsics.LJFF(this.perkList, paywallResponse.perkList) && Intrinsics.LJFF(this.subscribeState, paywallResponse.subscribeState) && Intrinsics.LJFF(this.purchaseSchema, paywallResponse.purchaseSchema) && Intrinsics.LJFF(this.previewExperimentGroup, paywallResponse.previewExperimentGroup);
    }

    public final int hashCode() {
        CtaInfo ctaInfo = this.ctaInfo;
        int iHashCode = (ctaInfo == null ? 0 : ctaInfo.hashCode()) * 31;
        String str = this.paywallTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.paywallText;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PerkData> list = this.perkList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.subscribeState;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.purchaseSchema;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.previewExperimentGroup;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaywallResponse(ctaInfo=");
        sbLIZ.append(this.ctaInfo);
        sbLIZ.append(", paywallTitle=");
        sbLIZ.append(this.paywallTitle);
        sbLIZ.append(", paywallText=");
        sbLIZ.append(this.paywallText);
        sbLIZ.append(", perkList=");
        sbLIZ.append(this.perkList);
        sbLIZ.append(", subscribeState=");
        sbLIZ.append(this.subscribeState);
        sbLIZ.append(", purchaseSchema=");
        sbLIZ.append(this.purchaseSchema);
        sbLIZ.append(", previewExperimentGroup=");
        sbLIZ.append(this.previewExperimentGroup);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PaywallResponse(CtaInfo ctaInfo, String str, String str2, List<PerkData> list, String str3, String str4, Integer num) {
        this.ctaInfo = ctaInfo;
        this.paywallTitle = str;
        this.paywallText = str2;
        this.perkList = list;
        this.subscribeState = str3;
        this.purchaseSchema = str4;
        this.previewExperimentGroup = num;
    }
}
