package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SeaPdpBottomBarBffData {

    @C09CT("button")
    public final Map<String, SeaPdpBottomBarBffButtonData> button;

    @C09CT("core_biz_info")
    public final Map<String, Object> coreBizInfo;

    @C09CT("dynamic_content")
    public final Map<String, SeaPdpBottomBarBffButtonDynamicContent> dynamicContent;

    public SeaPdpBottomBarBffData() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffData)) {
            return false;
        }
        SeaPdpBottomBarBffData seaPdpBottomBarBffData = (SeaPdpBottomBarBffData) obj;
        return Intrinsics.LJFF(this.button, seaPdpBottomBarBffData.button) && Intrinsics.LJFF(this.dynamicContent, seaPdpBottomBarBffData.dynamicContent) && Intrinsics.LJFF(this.coreBizInfo, seaPdpBottomBarBffData.coreBizInfo);
    }

    public final int hashCode() {
        Map<String, SeaPdpBottomBarBffButtonData> map = this.button;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, SeaPdpBottomBarBffButtonDynamicContent> map2 = this.dynamicContent;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.coreBizInfo;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffData(button=");
        sbLIZ.append(this.button);
        sbLIZ.append(", dynamicContent=");
        sbLIZ.append(this.dynamicContent);
        sbLIZ.append(", coreBizInfo=");
        sbLIZ.append(this.coreBizInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffData(Map<String, SeaPdpBottomBarBffButtonData> map, Map<String, SeaPdpBottomBarBffButtonDynamicContent> map2, Map<String, ? extends Object> map3) {
        this.button = map;
        this.dynamicContent = map2;
        this.coreBizInfo = map3;
    }
}
