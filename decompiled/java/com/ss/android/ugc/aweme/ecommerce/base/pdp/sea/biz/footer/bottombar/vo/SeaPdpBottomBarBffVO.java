package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.AbstractC1066304Ez;
import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBarBffVO extends AbstractC1066304Ez {

    @C09CT("data")
    public final Map<String, SeaPdpBottomBarBffData> data;

    @C09CT("facade")
    public final Map<String, List<String>> facade;

    @C09CT("template")
    public final SeaPdpBottomBarBffTemplate template;

    public SeaPdpBottomBarBffVO() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpBottomBarBffVO)) {
            return false;
        }
        SeaPdpBottomBarBffVO seaPdpBottomBarBffVO = (SeaPdpBottomBarBffVO) obj;
        return Intrinsics.LJFF(this.facade, seaPdpBottomBarBffVO.facade) && Intrinsics.LJFF(this.template, seaPdpBottomBarBffVO.template) && Intrinsics.LJFF(this.data, seaPdpBottomBarBffVO.data);
    }

    public final int hashCode() {
        Map<String, List<String>> map = this.facade;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        SeaPdpBottomBarBffTemplate seaPdpBottomBarBffTemplate = this.template;
        int iHashCode2 = (iHashCode + (seaPdpBottomBarBffTemplate == null ? 0 : seaPdpBottomBarBffTemplate.hashCode())) * 31;
        Map<String, SeaPdpBottomBarBffData> map2 = this.data;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffVO(facade=");
        sbLIZ.append(this.facade);
        sbLIZ.append(", template=");
        sbLIZ.append(this.template);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SeaPdpBottomBarBffVO(Map<String, ? extends List<String>> map, SeaPdpBottomBarBffTemplate seaPdpBottomBarBffTemplate, Map<String, SeaPdpBottomBarBffData> map2) {
        this.facade = map;
        this.template = seaPdpBottomBarBffTemplate;
        this.data = map2;
    }
}
