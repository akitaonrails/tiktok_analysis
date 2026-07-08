package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class TagPanelConfig {

    @C09CT("tag_panel_btn")
    public final String btn;

    @C09CT("tag_panel_desc1")
    public final String desc1;

    @C09CT("tag_panel_desc2")
    public final String desc2;

    @C09CT("tag_panel_main_title")
    public final String mainTitle;

    public TagPanelConfig() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagPanelConfig)) {
            return false;
        }
        TagPanelConfig tagPanelConfig = (TagPanelConfig) obj;
        return Intrinsics.LJFF(this.mainTitle, tagPanelConfig.mainTitle) && Intrinsics.LJFF(this.desc1, tagPanelConfig.desc1) && Intrinsics.LJFF(this.desc2, tagPanelConfig.desc2) && Intrinsics.LJFF(this.btn, tagPanelConfig.btn);
    }

    public final int hashCode() {
        String str = this.mainTitle;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc1;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc2;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btn;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagPanelConfig(mainTitle=");
        sbLIZ.append(this.mainTitle);
        sbLIZ.append(", desc1=");
        sbLIZ.append(this.desc1);
        sbLIZ.append(", desc2=");
        sbLIZ.append(this.desc2);
        sbLIZ.append(", btn=");
        sbLIZ.append(this.btn);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TagPanelConfig(String str, String str2, String str3, String str4) {
        this.mainTitle = str;
        this.desc1 = str2;
        this.desc2 = str3;
        this.btn = str4;
    }
}
