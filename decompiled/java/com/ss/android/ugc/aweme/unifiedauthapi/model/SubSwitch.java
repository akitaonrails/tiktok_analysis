package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class SubSwitch implements Serializable {

    @C09CT("field")
    public String switchField;

    @C09CT("text")
    public String switchText;

    public int hashCode() {
        return (this.switchText.hashCode() * 31) + this.switchField.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubSwitch(switchText=");
        sbLIZ.append(this.switchText);
        sbLIZ.append(", switchField=");
        sbLIZ.append(this.switchField);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SubSwitch() {
        this("", "");
    }

    public final void setSwitchField(String str) {
        this.switchField = str;
    }

    public final void setSwitchText(String str) {
        this.switchText = str;
    }

    public SubSwitch(String str, String str2) {
        this.switchText = str;
        this.switchField = str2;
    }
}
