package com.bytedance.pumbaa.hybrid.governance.jsb;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class IframeItem {

    @C09CT("iframe")
    public final String iframe;

    @C09CT("mainframe")
    public final String mainframe;

    public IframeItem() {
        this("", "");
    }

    public IframeItem(String str, String str2) {
        this.iframe = str;
        this.mainframe = str2;
    }
}
