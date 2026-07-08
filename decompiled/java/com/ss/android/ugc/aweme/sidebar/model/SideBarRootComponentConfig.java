package com.ss.android.ugc.aweme.sidebar.model;

import X.C09CT;
import X.C2188811AlT;
import X.InterfaceC1580560rEU;
import com.google.gson.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarRootComponentConfig implements InterfaceC1580560rEU {
    public n LIZ;

    @C09CT("sidebar_sections")
    public List<SideBarSectionComponentConfig> sections;

    public SideBarRootComponentConfig() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SideBarRootComponentConfig) && Intrinsics.LJFF(this.sections, ((SideBarRootComponentConfig) obj).sections);
    }

    @Override // X.InterfaceC1580560rEU
    public final String getId() {
        return "";
    }

    @Override // X.InterfaceC1580560rEU
    public final String getType() {
        return "";
    }

    public final int hashCode() {
        List<SideBarSectionComponentConfig> list = this.sections;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SideBarRootComponentConfig(sections=");
        sbLIZ.append(this.sections);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1580560rEU
    public final List<? extends InterfaceC1580560rEU> LIZ() {
        return this.sections;
    }

    @Override // X.InterfaceC1580560rEU
    public final n LIZIZ() {
        return this.LIZ;
    }

    public SideBarRootComponentConfig(List<SideBarSectionComponentConfig> list) {
        this.sections = list;
    }

    @Override // X.InterfaceC1580560rEU
    public final void LIZJ(n nVar) {
        this.LIZ = nVar;
    }
}
