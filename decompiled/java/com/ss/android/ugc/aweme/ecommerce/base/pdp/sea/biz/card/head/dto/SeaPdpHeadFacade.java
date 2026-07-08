package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class SeaPdpHeadFacade {

    @C09CT("config")
    public final PDPSeaFacadeConfig config;

    @C09CT("footer")
    public final String footer;

    @C09CT("list")
    public final List<SeaPdpHeadCardFacade> list;

    @C09CT("pendants")
    public final List<String> pendants;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpHeadFacade)) {
            return false;
        }
        SeaPdpHeadFacade seaPdpHeadFacade = (SeaPdpHeadFacade) obj;
        return Intrinsics.LJFF(this.list, seaPdpHeadFacade.list) && Intrinsics.LJFF(this.pendants, seaPdpHeadFacade.pendants) && Intrinsics.LJFF(this.footer, seaPdpHeadFacade.footer) && Intrinsics.LJFF(this.config, seaPdpHeadFacade.config);
    }

    public SeaPdpHeadFacade(List<SeaPdpHeadCardFacade> list, List<String> list2, String str, PDPSeaFacadeConfig pDPSeaFacadeConfig) {
        this.list = list;
        this.pendants = list2;
        this.footer = str;
        this.config = pDPSeaFacadeConfig;
    }
}
