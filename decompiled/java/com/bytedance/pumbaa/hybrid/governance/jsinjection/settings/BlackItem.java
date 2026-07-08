package com.bytedance.pumbaa.hybrid.governance.jsinjection.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class BlackItem {

    @C09CT("names")
    public final List<String> names;

    @C09CT("url")
    public final String url;

    public BlackItem() {
        this(null, null);
    }

    public BlackItem(String str, List<String> list) {
        this.url = str;
        this.names = list;
    }
}
