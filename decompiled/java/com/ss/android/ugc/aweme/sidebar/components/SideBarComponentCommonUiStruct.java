package com.ss.android.ugc.aweme.sidebar.components;

import X.C09CT;
import com.ss.android.ugc.aweme.sidebar.model.SideBarComponentAction;

/* JADX INFO: loaded from: classes25.dex */
public final class SideBarComponentCommonUiStruct {

    @C09CT("action")
    public final SideBarComponentAction action;

    @C09CT("content")
    public final String content;

    public SideBarComponentCommonUiStruct() {
        this(null, null);
    }

    public SideBarComponentCommonUiStruct(String str, SideBarComponentAction sideBarComponentAction) {
        this.content = str;
        this.action = sideBarComponentAction;
    }
}
