package com.ss.android.ugc.aweme.longpress;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LongPressStructure {

    @C09CT("children_list")
    public List<String> children;

    @C09CT("container_key")
    public String containerKey;

    public LongPressStructure() {
        this(null, null);
    }

    public LongPressStructure(String str, List<String> list) {
        this.containerKey = str;
        this.children = list;
    }
}
