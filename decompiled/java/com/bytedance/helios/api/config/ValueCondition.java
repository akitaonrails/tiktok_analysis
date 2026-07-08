package com.bytedance.helios.api.config;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class ValueCondition {

    @C09CT("match")
    public final String match;

    @C09CT("sample_rate")
    public final double sampleRate;

    @C09CT("targets")
    public final Set<String> targets;

    public ValueCondition() {
        this(null, null, 0.0d, 7, null);
    }

    static {
        new ConcurrentHashMap();
    }

    public ValueCondition(String str, Set<String> set, double d) {
        this.match = str;
        this.targets = set;
        this.sampleRate = d;
    }

    public ValueCondition(String str, Set set, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C08CX.INSTANCE : set, (i & 4) != 0 ? 1.0d : d);
    }
}
