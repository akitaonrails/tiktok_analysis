package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class SceneConfig {

    @C09CT("allow_list")
    public final Set<String> allowList;

    @C09CT("block_list")
    public final Set<String> blockList;

    @C09CT("is_collect_stack")
    public final boolean isCollectStack;

    @C09CT("name")
    public final String name;

    @C09CT("sample_rate")
    public final double sampleRate;

    @C09CT("targets")
    public final Set<Integer> targets;

    public SceneConfig() {
        this(null, 0.0d, null, null, null, false, 63, null);
    }

    public SceneConfig(String str, double d, Set<Integer> set, Set<String> set2, Set<String> set3, boolean z) {
        this.name = str;
        this.sampleRate = d;
        this.targets = set;
        this.blockList = set2;
        this.allowList = set3;
        this.isCollectStack = z;
    }

    public SceneConfig(String str, double d, Set set, Set set2, Set set3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.001d : d, (i & 4) != 0 ? C08CX.INSTANCE : set, (i & 8) != 0 ? C08CX.INSTANCE : set2, (i & 16) != 0 ? C08CX.INSTANCE : set3, (i & 32) != 0 ? false : z);
    }
}
