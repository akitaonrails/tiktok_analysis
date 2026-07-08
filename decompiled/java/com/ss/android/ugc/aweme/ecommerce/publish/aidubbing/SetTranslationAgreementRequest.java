package com.ss.android.ugc.aweme.ecommerce.publish.aidubbing;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SetTranslationAgreementRequest {

    @C09CT("enable_ec_video_ai_translate_type")
    public final Integer enableEcVideoAiTranslateType;

    @C09CT("version")
    public final int version;

    public SetTranslationAgreementRequest() {
        this(null, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetTranslationAgreementRequest)) {
            return false;
        }
        SetTranslationAgreementRequest setTranslationAgreementRequest = (SetTranslationAgreementRequest) obj;
        return Intrinsics.LJFF(this.enableEcVideoAiTranslateType, setTranslationAgreementRequest.enableEcVideoAiTranslateType) && this.version == setTranslationAgreementRequest.version;
    }

    public final int hashCode() {
        Integer num = this.enableEcVideoAiTranslateType;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.version;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SetTranslationAgreementRequest(enableEcVideoAiTranslateType=");
        sbLIZ.append(this.enableEcVideoAiTranslateType);
        sbLIZ.append(", version=");
        sbLIZ.append(this.version);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SetTranslationAgreementRequest(Integer num, int i) {
        this.enableEcVideoAiTranslateType = num;
        this.version = i;
    }
}
