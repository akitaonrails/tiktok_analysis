package com.ss.android.ugc.aweme.ecommerce.publish.aidubbing;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class GetProductTranslationAbilityResponseData {

    @C09CT("enable_ec_video_ai_translate_type")
    public final Integer enableEcVideoAiTranslateType;

    @C09CT("layout_type")
    public final Integer layoutType;

    @C09CT("should_enable_ai_video_translate_option")
    public final Boolean shouldEnableAiVideoTranslateOption;

    @C09CT("should_popup_agreement")
    public final Boolean shouldPopupAgreement;

    public GetProductTranslationAbilityResponseData() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetProductTranslationAbilityResponseData)) {
            return false;
        }
        GetProductTranslationAbilityResponseData getProductTranslationAbilityResponseData = (GetProductTranslationAbilityResponseData) obj;
        return Intrinsics.LJFF(this.shouldEnableAiVideoTranslateOption, getProductTranslationAbilityResponseData.shouldEnableAiVideoTranslateOption) && Intrinsics.LJFF(this.shouldPopupAgreement, getProductTranslationAbilityResponseData.shouldPopupAgreement) && Intrinsics.LJFF(this.enableEcVideoAiTranslateType, getProductTranslationAbilityResponseData.enableEcVideoAiTranslateType) && Intrinsics.LJFF(this.layoutType, getProductTranslationAbilityResponseData.layoutType);
    }

    public final int hashCode() {
        Boolean bool = this.shouldEnableAiVideoTranslateOption;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.shouldPopupAgreement;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.enableEcVideoAiTranslateType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.layoutType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetProductTranslationAbilityResponseData(shouldEnableAiVideoTranslateOption=");
        sbLIZ.append(this.shouldEnableAiVideoTranslateOption);
        sbLIZ.append(", shouldPopupAgreement=");
        sbLIZ.append(this.shouldPopupAgreement);
        sbLIZ.append(", enableEcVideoAiTranslateType=");
        sbLIZ.append(this.enableEcVideoAiTranslateType);
        sbLIZ.append(", layoutType=");
        sbLIZ.append(this.layoutType);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public GetProductTranslationAbilityResponseData(Boolean bool, Boolean bool2, Integer num, Integer num2) {
        this.shouldEnableAiVideoTranslateOption = bool;
        this.shouldPopupAgreement = bool2;
        this.enableEcVideoAiTranslateType = num;
        this.layoutType = num2;
    }
}
