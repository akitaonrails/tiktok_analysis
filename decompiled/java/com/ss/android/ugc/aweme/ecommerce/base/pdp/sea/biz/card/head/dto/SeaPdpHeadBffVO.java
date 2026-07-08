package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.AbstractC1066304Ez;
import X.C09CT;
import X.C2188811AlT;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpHeadBffVO extends AbstractC1066304Ez {

    @C09CT("config")
    public final PDPSeaHeaderConfig config;

    @C09CT("container")
    public final Map<String, PDPSeaHeaderContainer> container;

    @C09CT("data")
    public final Map<String, SeaPdpHeadData> data;

    @C09CT("facade")
    public final Map<String, SeaPdpHeadFacade> facade;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpHeadBffVO)) {
            return false;
        }
        SeaPdpHeadBffVO seaPdpHeadBffVO = (SeaPdpHeadBffVO) obj;
        return Intrinsics.LJFF(this.facade, seaPdpHeadBffVO.facade) && Intrinsics.LJFF(this.data, seaPdpHeadBffVO.data) && Intrinsics.LJFF(this.container, seaPdpHeadBffVO.container) && Intrinsics.LJFF(this.config, seaPdpHeadBffVO.config);
    }

    public final int hashCode() {
        Map<String, SeaPdpHeadFacade> map = this.facade;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, SeaPdpHeadData> map2 = this.data;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, PDPSeaHeaderContainer> map3 = this.container;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        PDPSeaHeaderConfig pDPSeaHeaderConfig = this.config;
        return iHashCode3 + (pDPSeaHeaderConfig != null ? pDPSeaHeaderConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpHeadBffVO(facade=");
        sbLIZ.append(this.facade);
        sbLIZ.append(", data=");
        sbLIZ.append(this.data);
        sbLIZ.append(", container=");
        sbLIZ.append(this.container);
        sbLIZ.append(", config=");
        sbLIZ.append(this.config);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpHeadBffVO(Map<String, SeaPdpHeadFacade> map, Map<String, SeaPdpHeadData> map2, Map<String, PDPSeaHeaderContainer> map3, PDPSeaHeaderConfig pDPSeaHeaderConfig) {
        this.facade = map;
        this.data = map2;
        this.container = map3;
        this.config = pDPSeaHeaderConfig;
    }
}
