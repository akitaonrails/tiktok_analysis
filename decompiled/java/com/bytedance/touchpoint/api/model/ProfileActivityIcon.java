package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileActivityIcon extends C1893670zNV {

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("profile_activity_button_list")
    public List<ProfileActivityButton> profileActivityButtons;

    @C09CT("tab_bubble_text")
    public String tabBubbleText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileActivityIcon)) {
            return false;
        }
        ProfileActivityIcon profileActivityIcon = (ProfileActivityIcon) obj;
        return Intrinsics.LJFF(this.iconUrl, profileActivityIcon.iconUrl) && Intrinsics.LJFF(this.tabBubbleText, profileActivityIcon.tabBubbleText) && Intrinsics.LJFF(this.profileActivityButtons, profileActivityIcon.profileActivityButtons);
    }

    public final int hashCode() {
        int iHashCode = ((this.iconUrl.hashCode() * 31) + this.tabBubbleText.hashCode()) * 31;
        List<ProfileActivityButton> list = this.profileActivityButtons;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileActivityIcon(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", tabBubbleText=");
        sbLIZ.append(this.tabBubbleText);
        sbLIZ.append(", profileActivityButtons=");
        sbLIZ.append(this.profileActivityButtons);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public ProfileActivityIcon(String str, String str2, List<ProfileActivityButton> list) {
        this.iconUrl = str;
        this.tabBubbleText = str2;
        this.profileActivityButtons = list;
    }
}
