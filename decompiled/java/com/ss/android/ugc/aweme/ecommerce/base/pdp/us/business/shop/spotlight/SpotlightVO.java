package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.spotlight;

import X.C04DW;
import X.C09CT;
import X.C2188811AlT;
import X.C703902ov;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SpotlightVO implements InterfaceC746802vq, C04DW {
    public String LL = "undefined";

    @C09CT("self_operated_slogan")
    public final SelfOperatedSloganInfo selfOperatedSloganInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpotlightVO) && Intrinsics.LJFF(this.selfOperatedSloganInfo, ((SpotlightVO) obj).selfOperatedSloganInfo);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public final String getItemId() {
        return null;
    }

    public final int hashCode() {
        SelfOperatedSloganInfo selfOperatedSloganInfo = this.selfOperatedSloganInfo;
        if (selfOperatedSloganInfo == null) {
            return 0;
        }
        return selfOperatedSloganInfo.hashCode();
    }

    @Override // X.C04DW
    public final void setGodaGroupId(String str) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SpotlightVO(selfOperatedSloganInfo=");
        sbLIZ.append(this.selfOperatedSloganInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C04DW
    public final String getGodaNodeId() {
        return this.LL;
    }

    public SpotlightVO(SelfOperatedSloganInfo selfOperatedSloganInfo) {
        this.selfOperatedSloganInfo = selfOperatedSloganInfo;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public final void setGodaNodeId(String str) {
        this.LL = str;
    }
}
