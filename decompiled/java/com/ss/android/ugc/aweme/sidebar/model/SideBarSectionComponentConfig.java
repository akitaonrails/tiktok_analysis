package com.ss.android.ugc.aweme.sidebar.model;

import X.C01GW;
import X.C09CT;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1580560rEU;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarSectionComponentConfig implements InterfaceC1580560rEU {
    public transient List<? extends InterfaceC1580560rEU> LIZ;
    public final transient C01GW LIZIZ;

    @C09CT("common_event_params")
    public final String commonEventParamsRaw;

    @C09CT("section_id")
    public final String sectionId;

    @C09CT("section_type")
    public final String sectionType;

    @C09CT("section_ui_data")
    public n sectionUiData;

    public SideBarSectionComponentConfig() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SideBarSectionComponentConfig)) {
            return false;
        }
        SideBarSectionComponentConfig sideBarSectionComponentConfig = (SideBarSectionComponentConfig) obj;
        return Intrinsics.LJFF(this.sectionType, sideBarSectionComponentConfig.sectionType) && Intrinsics.LJFF(this.sectionId, sideBarSectionComponentConfig.sectionId) && Intrinsics.LJFF(this.sectionUiData, sideBarSectionComponentConfig.sectionUiData) && Intrinsics.LJFF(this.commonEventParamsRaw, sideBarSectionComponentConfig.commonEventParamsRaw);
    }

    public final int hashCode() {
        String str = this.sectionType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sectionId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n nVar = this.sectionUiData;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        String str3 = this.commonEventParamsRaw;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarSectionComponentConfig(sectionType=");
        sbLIZ.append(this.sectionType);
        sbLIZ.append(", sectionId=");
        sbLIZ.append(this.sectionId);
        sbLIZ.append(", sectionUiData=");
        sbLIZ.append(this.sectionUiData);
        sbLIZ.append(", commonEventParamsRaw=");
        sbLIZ.append(this.commonEventParamsRaw);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1580560rEU
    public final List<? extends InterfaceC1580560rEU> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1580560rEU
    public final n LIZIZ() {
        return this.sectionUiData;
    }

    @Override // X.InterfaceC1580560rEU
    public final String getId() {
        return this.sectionId;
    }

    @Override // X.InterfaceC1580560rEU
    public final String getType() {
        return this.sectionType;
    }

    @Override // X.InterfaceC1580560rEU
    public final void LIZJ(n nVar) {
        this.sectionUiData = nVar;
    }

    public SideBarSectionComponentConfig(String str, String str2, n nVar, String str3) {
        this.sectionType = str;
        this.sectionId = str2;
        this.sectionUiData = nVar;
        this.commonEventParamsRaw = str3;
        this.LIZ = new ArrayList();
        this.LIZIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1147));
    }
}
