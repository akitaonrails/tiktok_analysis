package com.ss.android.ugc.aweme.ecommerce.marketing.widget.api;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ActionNotice {

    @C09CT("action_color")
    public final String actionColor;

    @C09CT("action_txt")
    public final String actionTxt;

    public ActionNotice() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionNotice)) {
            return false;
        }
        ActionNotice actionNotice = (ActionNotice) obj;
        return Intrinsics.LJFF(this.actionTxt, actionNotice.actionTxt) && Intrinsics.LJFF(this.actionColor, actionNotice.actionColor);
    }

    public int hashCode() {
        String str = this.actionTxt;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionColor;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionNotice(actionTxt=");
        sbLIZ.append(this.actionTxt);
        sbLIZ.append(", actionColor=");
        sbLIZ.append(this.actionColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ActionNotice(String str, String str2) {
        this.actionTxt = str;
        this.actionColor = str2;
    }
}
