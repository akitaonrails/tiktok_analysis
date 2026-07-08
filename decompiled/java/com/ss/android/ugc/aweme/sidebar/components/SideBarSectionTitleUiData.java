package com.ss.android.ugc.aweme.sidebar.components;

import X.C09CT;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarSectionTitleUiData {

    @C09CT("action")
    public final SideBarComponentAction action;

    @C09CT("title_tail_icon")
    public final SideBarComponentCommonUiStruct tailIcon;

    @C09CT("title_text")
    public final SideBarComponentCommonUiStruct text;

    public SideBarSectionTitleUiData() {
        this(null, null, null);
    }

    public SideBarSectionTitleUiData(SideBarComponentCommonUiStruct sideBarComponentCommonUiStruct, SideBarComponentCommonUiStruct sideBarComponentCommonUiStruct2, SideBarComponentAction sideBarComponentAction) {
        this.text = sideBarComponentCommonUiStruct;
        this.tailIcon = sideBarComponentCommonUiStruct2;
        this.action = sideBarComponentAction;
    }
}
