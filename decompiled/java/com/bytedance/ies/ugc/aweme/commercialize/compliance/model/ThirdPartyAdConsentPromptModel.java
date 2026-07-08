package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ThirdPartyAdConsentPromptModel implements Serializable {

    @C09CT("prompt_style")
    public final Integer promptStyle;

    @C09CT("need_prompt")
    public final Boolean shouldShowPrompt;

    @C09CT("prompt_video_count")
    public final Integer triggerVideoCount;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyAdConsentPromptModel)) {
            return false;
        }
        ThirdPartyAdConsentPromptModel thirdPartyAdConsentPromptModel = (ThirdPartyAdConsentPromptModel) obj;
        return Intrinsics.LJFF(this.shouldShowPrompt, thirdPartyAdConsentPromptModel.shouldShowPrompt) && Intrinsics.LJFF(this.promptStyle, thirdPartyAdConsentPromptModel.promptStyle) && Intrinsics.LJFF(this.triggerVideoCount, thirdPartyAdConsentPromptModel.triggerVideoCount);
    }

    public int hashCode() {
        Boolean bool = this.shouldShowPrompt;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.promptStyle;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.triggerVideoCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartyAdConsentPromptModel(shouldShowPrompt=");
        sbLIZ.append(this.shouldShowPrompt);
        sbLIZ.append(", promptStyle=");
        sbLIZ.append(this.promptStyle);
        sbLIZ.append(", triggerVideoCount=");
        sbLIZ.append(this.triggerVideoCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ThirdPartyAdConsentPromptModel() {
        this(Boolean.FALSE, 0, 0);
    }

    public ThirdPartyAdConsentPromptModel(Boolean bool, Integer num, Integer num2) {
        this.shouldShowPrompt = bool;
        this.promptStyle = num;
        this.triggerVideoCount = num2;
    }
}
