package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class InboxMissionTabInfo {

    @C09CT("tab_id")
    public final int tabId;

    @C09CT("tab_text")
    public final String tabText;

    public InboxMissionTabInfo() {
        this(0, "");
    }

    public InboxMissionTabInfo(int i, String str) {
        this.tabId = i;
        this.tabText = str;
    }
}
