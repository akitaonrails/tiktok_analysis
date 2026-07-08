package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class UnifyComponentsMarginConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("components_margin_config")
    public final FeedComponentsMarginConfig componentsMarginConfig;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("last_component_config")
    public final ComponentMarginConfig lastComponentConfig;

    @C09CT("support_genres")
    public final List<String> supportGenres;

    @C09CT("support_scenes")
    public final List<String> supportScenes;

    @C09CT("unify_last_component")
    public final Boolean unifyLastComponent;

    public UnifyComponentsMarginConfig() {
        this(false, null, null, null, Boolean.TRUE, null);
    }

    public UnifyComponentsMarginConfig(boolean z, FeedComponentsMarginConfig feedComponentsMarginConfig, List<String> list, List<String> list2, Boolean bool, ComponentMarginConfig componentMarginConfig) {
        this.enable = z;
        this.componentsMarginConfig = feedComponentsMarginConfig;
        this.supportScenes = list;
        this.supportGenres = list2;
        this.unifyLastComponent = bool;
        this.lastComponentConfig = componentMarginConfig;
    }
}
