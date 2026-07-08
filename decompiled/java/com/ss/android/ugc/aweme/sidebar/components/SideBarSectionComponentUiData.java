package com.ss.android.ugc.aweme.sidebar.components;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.google.gson.h;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentUiData;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarSectionComponentUiData {
    public final transient C01GW LIZ;

    @C09CT("action")
    public final SideBarComponentAction action;

    @C09CT("component_list")
    public final h componentList;

    @C09CT("custom_data")
    public final String customDataRaw;

    @C09CT("title")
    public final SideBarComponentUiData titleData;

    public SideBarSectionComponentUiData() {
        this(null, null, null, null);
    }

    public SideBarSectionComponentUiData(SideBarComponentUiData sideBarComponentUiData, h hVar, SideBarComponentAction sideBarComponentAction, String str) {
        this.titleData = sideBarComponentUiData;
        this.componentList = hVar;
        this.action = sideBarComponentAction;
        this.customDataRaw = str;
        this.LIZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1130));
    }
}
