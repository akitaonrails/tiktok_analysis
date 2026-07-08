package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.lockup;

import X.C04DW;
import X.C2188811AlT;
import X.C703902ov;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class UsProductInfoTopSpanVO implements InterfaceC746802vq, C04DW {
    public static final int $stable = 8;
    public String godaGroupId;
    public String godaNodeId;
    public final boolean isCircleBorderRadius;

    public UsProductInfoTopSpanVO() {
        this(false);
    }

    public final UsProductInfoTopSpanVO copy(boolean z) {
        return new UsProductInfoTopSpanVO(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UsProductInfoTopSpanVO) && this.isCircleBorderRadius == ((UsProductInfoTopSpanVO) obj).isCircleBorderRadius;
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC746802vq
    public String getItemId() {
        return null;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.isCircleBorderRadius);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsProductInfoTopSpanVO(isCircleBorderRadius=");
        sbLIZ.append(this.isCircleBorderRadius);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getGodaGroupId() {
        return this.godaGroupId;
    }

    @Override // X.C04DW
    public String getGodaNodeId() {
        return this.godaNodeId;
    }

    public final boolean isCircleBorderRadius() {
        return this.isCircleBorderRadius;
    }

    public UsProductInfoTopSpanVO(boolean z) {
        this.isCircleBorderRadius = z;
        this.godaGroupId = "undefined";
        this.godaNodeId = "undefined";
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C703902ov.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.C04DW
    public void setGodaGroupId(String str) {
        this.godaGroupId = str;
    }

    @Override // X.C04DW
    public void setGodaNodeId(String str) {
        this.godaNodeId = str;
    }
}
