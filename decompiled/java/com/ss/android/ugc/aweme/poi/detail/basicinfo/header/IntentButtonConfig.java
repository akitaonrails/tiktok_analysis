package com.ss.android.ugc.aweme.poi.detail.basicinfo.header;

import X.C09CT;
import X.C1155360gAg;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class IntentButtonConfig implements Serializable {
    public static final C1155360gAg Companion = new Object() { // from class: X.0gAg
    };

    @C09CT("associated_service_button_type")
    public final Integer associatedType;

    @C09CT("intent_button_style")
    public final String intentButtonStyle;

    public IntentButtonConfig() {
        this(null, null);
    }

    public int hashCode() {
        Integer num = this.associatedType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.intentButtonStyle;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IntentButtonConfig(associatedType=");
        sbLIZ.append(this.associatedType);
        sbLIZ.append(", intentButtonStyle=");
        sbLIZ.append(this.intentButtonStyle);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IntentButtonConfig(Integer num, String str) {
        this.associatedType = num;
        this.intentButtonStyle = str;
    }
}
