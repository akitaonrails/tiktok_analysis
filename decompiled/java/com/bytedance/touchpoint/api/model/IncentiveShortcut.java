package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class IncentiveShortcut extends C1893670zNV {

    @C09CT("content")
    public final Title content;

    @C09CT("url")
    public final String jumpLink;

    @C09CT("type")
    public final String type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncentiveShortcut)) {
            return false;
        }
        IncentiveShortcut incentiveShortcut = (IncentiveShortcut) obj;
        return Intrinsics.LJFF(this.type, incentiveShortcut.type) && Intrinsics.LJFF(this.content, incentiveShortcut.content) && Intrinsics.LJFF(this.jumpLink, incentiveShortcut.jumpLink);
    }

    public final int hashCode() {
        return (((this.type.hashCode() * 31) + this.content.hashCode()) * 31) + this.jumpLink.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IncentiveShortcut(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public IncentiveShortcut(String str, Title title, String str2) {
        this.type = str;
        this.content = title;
        this.jumpLink = str2;
    }
}
