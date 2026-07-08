package com.ss.android.ugc.aweme.verify;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public final class PropPinConfig {

    @C09CT("count")
    public final int count;

    @C09CT("allow_list")
    public final List<String> enterFromAllowList;

    public PropPinConfig() {
        this(C1697810uHb.LJIIJJI("homepage_hot", "homepage_friends", "homepage_follow", "homepage_topic_stem"), 1);
    }

    public PropPinConfig(List<String> list, int i) {
        this.enterFromAllowList = list;
        this.count = i;
    }
}
