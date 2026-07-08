package com.ss.android.ugc.aweme.sidebar.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1580560rEU;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarComponentUiData implements InterfaceC1580560rEU {

    @C09CT("component_id")
    public final String componentId;

    @C09CT("component_type")
    public final String componentType;

    @C09CT("component_ui_data")
    public n componentUiData;

    @C09CT("event_params")
    public List<SideBarComponentEventParams> eventParams;

    public SideBarComponentUiData() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideBarComponentUiData)) {
            return false;
        }
        SideBarComponentUiData sideBarComponentUiData = (SideBarComponentUiData) obj;
        return Intrinsics.LJFF(this.eventParams, sideBarComponentUiData.eventParams) && Intrinsics.LJFF(this.componentType, sideBarComponentUiData.componentType) && Intrinsics.LJFF(this.componentId, sideBarComponentUiData.componentId) && Intrinsics.LJFF(this.componentUiData, sideBarComponentUiData.componentUiData);
    }

    public final int hashCode() {
        List<SideBarComponentEventParams> list = this.eventParams;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.componentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.componentId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        n nVar = this.componentUiData;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarComponentUiData(eventParams=");
        sbLIZ.append(this.eventParams);
        sbLIZ.append(", componentType=");
        sbLIZ.append(this.componentType);
        sbLIZ.append(", componentId=");
        sbLIZ.append(this.componentId);
        sbLIZ.append(", componentUiData=");
        sbLIZ.append(this.componentUiData);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1580560rEU
    public final List<? extends InterfaceC1580560rEU> LIZ() {
        return new ArrayList();
    }

    @Override // X.InterfaceC1580560rEU
    public final n LIZIZ() {
        return this.componentUiData;
    }

    @Override // X.InterfaceC1580560rEU
    public final String getId() {
        return this.componentId;
    }

    @Override // X.InterfaceC1580560rEU
    public final String getType() {
        return this.componentType;
    }

    @Override // X.InterfaceC1580560rEU
    public final void LIZJ(n nVar) {
        this.componentUiData = nVar;
    }

    public SideBarComponentUiData(List<SideBarComponentEventParams> list, String str, String str2, n nVar) {
        this.eventParams = list;
        this.componentType = str;
        this.componentId = str2;
        this.componentUiData = nVar;
    }
}
