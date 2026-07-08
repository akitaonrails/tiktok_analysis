package com.ss.android.ugc.aweme.theater.common;

import X.C09CT;
import X.C2188811AlT;
import X.EnumC549390Lgf;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterCameoSetting implements Serializable {

    @C09CT("preference_prompt")
    public final String preferencePrompt;

    @C09CT("visibility_scope")
    public final Integer visibilityScope;

    public AITheaterCameoSetting() {
        this(null, null);
    }

    public final AITheaterCameoSetting copy(Integer num, String str) {
        return new AITheaterCameoSetting(num, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AITheaterCameoSetting)) {
            return false;
        }
        AITheaterCameoSetting aITheaterCameoSetting = (AITheaterCameoSetting) obj;
        return Intrinsics.LJFF(this.visibilityScope, aITheaterCameoSetting.visibilityScope) && Intrinsics.LJFF(this.preferencePrompt, aITheaterCameoSetting.preferencePrompt);
    }

    public int hashCode() {
        Integer num = this.visibilityScope;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.preferencePrompt;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterCameoSetting(visibilityScope=");
        sbLIZ.append(this.visibilityScope);
        sbLIZ.append(", preferencePrompt=");
        sbLIZ.append(this.preferencePrompt);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getEffectiveVisibilityScope() {
        Integer num = this.visibilityScope;
        if (num != null) {
            return num.intValue();
        }
        EnumC549390Lgf.Companion.getClass();
        return EnumC549390Lgf.DEFAULT.getCode();
    }

    public AITheaterCameoSetting(Integer num, String str) {
        this.visibilityScope = num;
        this.preferencePrompt = str;
    }
}
