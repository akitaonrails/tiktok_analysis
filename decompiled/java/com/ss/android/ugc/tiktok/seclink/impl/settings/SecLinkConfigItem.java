package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes35.dex */
public final class SecLinkConfigItem {

    @C09CT("pattern")
    public String pattern;

    @C09CT("type")
    public int type;

    public SecLinkConfigItem() {
        this("", -1);
    }

    public SecLinkConfigItem(String str, int i) {
        this.pattern = str;
        this.type = i;
    }
}
