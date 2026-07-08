package com.ss.android.ugc.tiktok.tuc.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class TUCButtonData implements Serializable {

    @C09CT("action")
    public final TUCProcessData action;

    @C09CT("enable_debouncing")
    public final boolean enableDebouncing;

    @C09CT("style")
    public final String style;

    @C09CT("title")
    public final String title;

    @C09CT("button_id")
    public final String viewID;

    public TUCButtonData() {
        this(null, null, null, null, false);
    }

    public TUCButtonData(String str, String str2, String str3, TUCProcessData tUCProcessData, boolean z) {
        this.title = str;
        this.viewID = str2;
        this.style = str3;
        this.action = tUCProcessData;
        this.enableDebouncing = z;
    }
}
