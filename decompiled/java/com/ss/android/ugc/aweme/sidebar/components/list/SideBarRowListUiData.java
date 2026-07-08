package com.ss.android.ugc.aweme.sidebar.components.list;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentEventParams;
import com.ss.android.ugc.aweme.sidebar.model.SideBarListItemIcon;
import java.util.List;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarRowListUiData {
    public final C01GW LIZ;

    @C09CT("action")
    public final SideBarComponentAction action;

    @C09CT("custom_info")
    public final String customInfoRaw;

    @C09CT("event_params")
    public final List<SideBarComponentEventParams> eventParams;

    @C09CT("icon")
    public final SideBarListItemIcon icon;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    public SideBarRowListUiData() {
        this(null, null, null, null, null, null);
    }

    public SideBarRowListUiData(SideBarListItemIcon sideBarListItemIcon, String str, String str2, SideBarComponentAction sideBarComponentAction, List<SideBarComponentEventParams> list, String str3) {
        this.icon = sideBarListItemIcon;
        this.title = str;
        this.subTitle = str2;
        this.action = sideBarComponentAction;
        this.eventParams = list;
        this.customInfoRaw = str3;
        this.LIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1142));
    }
}
