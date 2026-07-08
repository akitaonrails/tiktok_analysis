package com.ss.android.ugc.aweme.component.searchcomponent.aiproductcard;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AIProductButton implements Serializable {
    public static final int $stable = 0;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("button_type")
    public final Integer buttonType;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIProductButton)) {
            return false;
        }
        AIProductButton aIProductButton = (AIProductButton) obj;
        return Intrinsics.LJFF(this.buttonType, aIProductButton.buttonType) && Intrinsics.LJFF(this.buttonText, aIProductButton.buttonText);
    }

    public int hashCode() {
        Integer num = this.buttonType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.buttonText;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIProductButton(buttonType=");
        sbLIZ.append(this.buttonType);
        sbLIZ.append(", buttonText=");
        sbLIZ.append(this.buttonText);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIProductButton(Integer num, String str) {
        this.buttonType = num;
        this.buttonText = str;
    }
}
