package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpBottomBarBffButtonData {

    @C09CT("action")
    public final String action;

    @C09CT("content")
    public final String content;

    @C09CT("style")
    public final String style;

    @C09CT("type")
    public final Integer type;

    public SeaPdpBottomBarBffButtonData() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffButtonData)) {
            return false;
        }
        SeaPdpBottomBarBffButtonData seaPdpBottomBarBffButtonData = (SeaPdpBottomBarBffButtonData) obj;
        return Intrinsics.LJFF(this.type, seaPdpBottomBarBffButtonData.type) && Intrinsics.LJFF(this.style, seaPdpBottomBarBffButtonData.style) && Intrinsics.LJFF(this.content, seaPdpBottomBarBffButtonData.content) && Intrinsics.LJFF(this.action, seaPdpBottomBarBffButtonData.action);
    }

    public final int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.action;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffButtonData(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", style=");
        sbLIZ.append(this.style);
        sbLIZ.append(", content=");
        sbLIZ.append(this.content);
        sbLIZ.append(", action=");
        sbLIZ.append(this.action);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffButtonData(Integer num, String str, String str2, String str3) {
        this.type = num;
        this.style = str;
        this.content = str2;
        this.action = str3;
    }
}
