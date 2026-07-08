package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class PanelButtons implements Serializable {

    @C09CT("negative_btn_text")
    public String negativeBtnText;

    @C09CT("positive_btn_text")
    public String positiveBtnText;

    @C09CT("is_single_btn")
    public boolean singleButton;

    public PanelButtons() {
        this(null, null, false);
    }

    public int hashCode() {
        String str = this.positiveBtnText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.negativeBtnText;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.singleButton);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelButtons(positiveBtnText=");
        sbLIZ.append(this.positiveBtnText);
        sbLIZ.append(", negativeBtnText=");
        sbLIZ.append(this.negativeBtnText);
        sbLIZ.append(", singleButton=");
        sbLIZ.append(this.singleButton);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setNegativeBtnText(String str) {
        this.negativeBtnText = str;
    }

    public final void setPositiveBtnText(String str) {
        this.positiveBtnText = str;
    }

    public final void setSingleButton(boolean z) {
        this.singleButton = z;
    }

    public PanelButtons(String str, String str2, boolean z) {
        this.positiveBtnText = str;
        this.negativeBtnText = str2;
        this.singleButton = z;
    }
}
