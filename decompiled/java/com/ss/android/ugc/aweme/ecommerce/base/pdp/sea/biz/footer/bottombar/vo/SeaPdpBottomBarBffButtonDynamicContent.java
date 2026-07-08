package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBarBffButtonDynamicContent {

    @C09CT("action_params")
    public final Map<String, Object> actionParams;

    @C09CT("data_info")
    public final Map<String, Object> dataInfo;

    @C09CT("placeholder")
    public final Map<String, String> placeholder;

    public SeaPdpBottomBarBffButtonDynamicContent() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffButtonDynamicContent)) {
            return false;
        }
        SeaPdpBottomBarBffButtonDynamicContent seaPdpBottomBarBffButtonDynamicContent = (SeaPdpBottomBarBffButtonDynamicContent) obj;
        return Intrinsics.LJFF(this.placeholder, seaPdpBottomBarBffButtonDynamicContent.placeholder) && Intrinsics.LJFF(this.dataInfo, seaPdpBottomBarBffButtonDynamicContent.dataInfo) && Intrinsics.LJFF(this.actionParams, seaPdpBottomBarBffButtonDynamicContent.actionParams);
    }

    public final int hashCode() {
        Map<String, String> map = this.placeholder;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, Object> map2 = this.dataInfo;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Object> map3 = this.actionParams;
        return iHashCode2 + (map3 != null ? map3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffButtonDynamicContent(placeholder=");
        sbLIZ.append(this.placeholder);
        sbLIZ.append(", dataInfo=");
        sbLIZ.append(this.dataInfo);
        sbLIZ.append(", actionParams=");
        sbLIZ.append(this.actionParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffButtonDynamicContent(Map<String, String> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3) {
        this.placeholder = map;
        this.dataInfo = map2;
        this.actionParams = map3;
    }
}
