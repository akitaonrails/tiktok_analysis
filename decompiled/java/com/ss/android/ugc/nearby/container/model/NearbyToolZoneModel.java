package com.ss.android.ugc.nearby.container.model;

import X.C09CT;
import X.C13LP;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1204490hRv;
import X.InterfaceC1891350zJl;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyToolZoneModel implements InterfaceC1204490hRv {
    public final boolean LL;

    @C09CT("tools")
    public final List<NearbyTool> tools;

    public NearbyToolZoneModel() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyToolZoneModel)) {
            return false;
        }
        NearbyToolZoneModel nearbyToolZoneModel = (NearbyToolZoneModel) obj;
        return Intrinsics.LJFF(this.tools, nearbyToolZoneModel.tools) && this.LL == nearbyToolZoneModel.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        List<NearbyTool> list = this.tools;
        return ((list == null ? 0 : list.hashCode()) * 31) + C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyToolZoneModel(tools=");
        sbLIZ.append(this.tools);
        sbLIZ.append(", isCacheData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        List<NearbyTool> list = this.tools;
        if (list != null) {
            return C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS256S0000000_18.get$arr$(793), 30);
        }
        return null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof NearbyToolZoneModel) && this.LL == ((NearbyToolZoneModel) interfaceC1891350zJl).LL) {
            return true;
        }
        return false;
    }

    public NearbyToolZoneModel(List<NearbyTool> list, boolean z) {
        this.tools = list;
        this.LL = z;
    }
}
