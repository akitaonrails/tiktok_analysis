package com.ss.android.ugc.aweme.ml.strategycenter.stream;

import X.C09CT;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class CaiSlardarEventBlackList {

    @C09CT("cai_slardar_event_black_list")
    public final Set<String> caiSlardarEventBlackList;

    public CaiSlardarEventBlackList() {
        this(new LinkedHashSet());
    }

    public CaiSlardarEventBlackList(Set<String> set) {
        this.caiSlardarEventBlackList = set;
    }
}
