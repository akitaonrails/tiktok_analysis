package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C1580790rEr;
import X.C1580820rEu;
import X.InterfaceC1580740rEm;
import com.google.gson.n;
import com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarListItemIcon;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarListBoxDataConverter implements ISideBarListDataConverterProtocol {
    public final String LL = "box";

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol
    public final String getComponentType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol
    public final InterfaceC1580740rEm FL0(n nVar) {
        SideBarListItemIcon sideBarListItemIcon;
        String str;
        SideBarComponentAction sideBarComponentAction;
        Map map;
        SideBarBoxListUiData sideBarBoxListUiData;
        List<SideBarComponentEventParams> list = null;
        if (nVar != null && (sideBarBoxListUiData = (SideBarBoxListUiData) C1580820rEu.LIZ(nVar.toString(), SideBarBoxListUiData.class)) != null) {
            sideBarListItemIcon = sideBarBoxListUiData.icon;
            str = sideBarBoxListUiData.title;
            sideBarComponentAction = sideBarBoxListUiData.action;
            map = (Map) sideBarBoxListUiData.LIZ.getValue();
            list = sideBarBoxListUiData.eventParams;
        } else {
            sideBarListItemIcon = null;
            str = null;
            sideBarComponentAction = null;
            map = null;
        }
        return new C1580790rEr(sideBarListItemIcon, str, sideBarComponentAction, list, map);
    }
}
