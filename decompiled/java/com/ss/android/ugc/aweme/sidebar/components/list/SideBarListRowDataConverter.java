package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C1580780rEq;
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
public final class SideBarListRowDataConverter implements ISideBarListDataConverterProtocol {
    public final String LL = "row";

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol
    public final String getComponentType() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.sidebar.components.protocol.ISideBarListDataConverterProtocol
    public final InterfaceC1580740rEm FL0(n nVar) {
        SideBarListItemIcon sideBarListItemIcon;
        String str;
        String str2;
        SideBarComponentAction sideBarComponentAction;
        List<SideBarComponentEventParams> list;
        SideBarRowListUiData sideBarRowListUiData;
        Map map = null;
        if (nVar != null && (sideBarRowListUiData = (SideBarRowListUiData) C1580820rEu.LIZ(nVar.toString(), SideBarRowListUiData.class)) != null) {
            sideBarListItemIcon = sideBarRowListUiData.icon;
            str = sideBarRowListUiData.title;
            str2 = sideBarRowListUiData.subTitle;
            sideBarComponentAction = sideBarRowListUiData.action;
            list = sideBarRowListUiData.eventParams;
            map = (Map) sideBarRowListUiData.LIZ.getValue();
        } else {
            sideBarListItemIcon = null;
            str = null;
            str2 = null;
            sideBarComponentAction = null;
            list = null;
        }
        return new C1580780rEq(sideBarListItemIcon, str, str2, sideBarComponentAction, list, map, 3);
    }
}
