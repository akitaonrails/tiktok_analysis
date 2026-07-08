package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpHeadCardFacade {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("pendants")
    public final List<String> pendants;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeaPdpHeadCardFacade)) {
            return false;
        }
        SeaPdpHeadCardFacade seaPdpHeadCardFacade = (SeaPdpHeadCardFacade) obj;
        return Intrinsics.LJFF(this.id, seaPdpHeadCardFacade.id) && Intrinsics.LJFF(this.pendants, seaPdpHeadCardFacade.pendants);
    }

    public SeaPdpHeadCardFacade(String str, List<String> list) {
        this.id = str;
        this.pendants = list;
    }
}
