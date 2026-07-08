package com.ss.android.ugc.aweme.slash.cell.list.horizontal;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ViewMoreConfig {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("text")
    public final String text;

    public ViewMoreConfig() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewMoreConfig)) {
            return false;
        }
        ViewMoreConfig viewMoreConfig = (ViewMoreConfig) obj;
        return Intrinsics.LJFF(this.eventName, viewMoreConfig.eventName) && Intrinsics.LJFF(this.text, viewMoreConfig.text);
    }

    public final int hashCode() {
        String str = this.eventName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewMoreConfig(eventName=");
        sbLIZ.append(this.eventName);
        sbLIZ.append(", text=");
        sbLIZ.append(this.text);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ViewMoreConfig(String str, String str2) {
        this.eventName = str;
        this.text = str2;
    }
}
