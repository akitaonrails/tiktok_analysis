package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class UnifyTouchDelegateScope {

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("genres")
    public final List<String> genres;

    @C09CT("normal_component_strategy")
    public final String normalComponentStrategy;

    @C09CT("scenes")
    public final List<String> scenes;

    @C09CT("standard_component_strategy")
    public final String standardComponentStrategy;

    public UnifyTouchDelegateScope(List<String> list, List<String> list2, Boolean bool, String str, String str2) {
        this.scenes = list;
        this.genres = list2;
        this.enable = bool;
        this.standardComponentStrategy = str;
        this.normalComponentStrategy = str2;
    }
}
