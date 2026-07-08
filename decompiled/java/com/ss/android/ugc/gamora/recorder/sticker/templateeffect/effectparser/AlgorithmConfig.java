package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;
import X.C13BV;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class AlgorithmConfig {

    @C09CT("mode")
    public final Integer mode;

    @C09CT("model_names")
    public final Map<String, List<String>> modelNames;

    @C09CT("name")
    public final String name;

    @C09CT("nodes")
    public final List<Node> nodes;

    @C09CT("version")
    public final String version;

    public AlgorithmConfig() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlgorithmConfig(String str, Integer num, String str2, Map<String, ? extends List<String>> map, List<Node> list) {
        this.version = str;
        this.mode = num;
        this.name = str2;
        this.modelNames = map;
        this.nodes = list;
    }

    public AlgorithmConfig(String str, Integer num, String str2, Map map, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? map : null, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}
