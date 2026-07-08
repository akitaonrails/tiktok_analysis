package com.bytedance.android.livesdkapi.depend.model.live.debug;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class DebugRoomItem implements Serializable {

    @C09CT("tab_content")
    public String tabContent;

    @C09CT("tab_detail")
    public String tabDetail;

    @C09CT("tab_title")
    public String tabTitle;

    public DebugRoomItem() {
        this("", "", "");
    }

    public final void setTabContent(String str) {
        this.tabContent = str;
    }

    public final void setTabDetail(String str) {
        this.tabDetail = str;
    }

    public final void setTabTitle(String str) {
        this.tabTitle = str;
    }

    public DebugRoomItem(String str, String str2, String str3) {
        this.tabTitle = str;
        this.tabContent = str2;
        this.tabDetail = str3;
    }
}
