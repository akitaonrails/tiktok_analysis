package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedComponentsMarginConfig implements Serializable {
    public static final int $stable = 8;

    @C09CT("component_custom_space")
    public final Map<String, ComponentMarginConfig> componentCustomConfig;

    @C09CT("container_custom_space")
    public final Map<String, ComponentMarginConfig> containerCustomConfig;

    @C09CT("left_container_common_space")
    public final ComponentMarginConfig leftContainerCommonSpace;

    public FeedComponentsMarginConfig() {
        this(null, null, null);
    }

    public FeedComponentsMarginConfig(ComponentMarginConfig componentMarginConfig, Map<String, ComponentMarginConfig> map, Map<String, ComponentMarginConfig> map2) {
        this.leftContainerCommonSpace = componentMarginConfig;
        this.containerCustomConfig = map;
        this.componentCustomConfig = map2;
    }
}
