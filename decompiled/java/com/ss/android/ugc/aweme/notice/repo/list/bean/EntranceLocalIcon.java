package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class EntranceLocalIcon {

    @C09CT("color")
    public final String iconColor;

    @C09CT("name")
    public final String iconName;

    public EntranceLocalIcon() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntranceLocalIcon)) {
            return false;
        }
        EntranceLocalIcon entranceLocalIcon = (EntranceLocalIcon) obj;
        return Intrinsics.LJFF(this.iconColor, entranceLocalIcon.iconColor) && Intrinsics.LJFF(this.iconName, entranceLocalIcon.iconName);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EntranceLocalIcon(iconColor=");
        sbLIZ.append(this.iconColor);
        sbLIZ.append(", iconName=");
        sbLIZ.append(this.iconName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public EntranceLocalIcon(String str, String str2) {
        this.iconColor = str;
        this.iconName = str2;
    }
}
