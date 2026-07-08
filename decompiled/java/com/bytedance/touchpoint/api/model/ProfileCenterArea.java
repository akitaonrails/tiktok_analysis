package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class ProfileCenterArea extends C1893670zNV {

    @C09CT("icon_url")
    public String iconURL;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("title")
    public Title title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCenterArea)) {
            return false;
        }
        ProfileCenterArea profileCenterArea = (ProfileCenterArea) obj;
        return Intrinsics.LJFF(this.iconURL, profileCenterArea.iconURL) && Intrinsics.LJFF(this.jumpLink, profileCenterArea.jumpLink) && Intrinsics.LJFF(this.title, profileCenterArea.title);
    }

    public final int hashCode() {
        String str = this.iconURL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jumpLink;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Title title = this.title;
        return iHashCode2 + (title != null ? title.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileCenterArea(iconURL=");
        sbLIZ.append(this.iconURL);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", title=");
        sbLIZ.append(this.title);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileCenterArea(String str, String str2, Title title) {
        this.iconURL = str;
        this.jumpLink = str2;
        this.title = title;
    }
}
