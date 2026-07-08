package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class TextMoreAnchor implements Serializable {

    @C09CT("icon_name")
    public final String iconName;

    @C09CT("prefix")
    public final String prefix;

    @C09CT("suffix")
    public final String suffix;

    @C09CT("title")
    public final String title;

    public TextMoreAnchor() {
        this(null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMoreAnchor)) {
            return false;
        }
        TextMoreAnchor textMoreAnchor = (TextMoreAnchor) obj;
        return Intrinsics.LJFF(this.prefix, textMoreAnchor.prefix) && Intrinsics.LJFF(this.suffix, textMoreAnchor.suffix) && Intrinsics.LJFF(this.iconName, textMoreAnchor.iconName) && Intrinsics.LJFF(this.title, textMoreAnchor.title);
    }

    public int hashCode() {
        String str = this.prefix;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.suffix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextMoreAnchor(prefix=");
        sbLIZ.append(this.prefix);
        sbLIZ.append(", suffix=");
        sbLIZ.append(this.suffix);
        sbLIZ.append(", iconName=");
        sbLIZ.append(this.iconName);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TextMoreAnchor(String str, String str2, String str3, String str4) {
        this.prefix = str;
        this.suffix = str2;
        this.iconName = str3;
        this.title = str4;
    }
}
