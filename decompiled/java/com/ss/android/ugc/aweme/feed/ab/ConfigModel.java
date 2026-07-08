package com.ss.android.ugc.aweme.feed.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class ConfigModel {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("enable_enhanced_preload")
    public final Boolean enableEnhancedPreload;

    @C09CT("sub_thread")
    public final Boolean subThread;

    @C09CT("card_type_list")
    public final List<Integer> whiteList;

    public ConfigModel() {
        this(Boolean.FALSE, Boolean.FALSE, null, Boolean.TRUE);
    }

    public ConfigModel(Boolean bool, Boolean bool2, List<Integer> list, Boolean bool3) {
        this.enable = bool;
        this.enableEnhancedPreload = bool2;
        this.whiteList = list;
        this.subThread = bool3;
    }
}
