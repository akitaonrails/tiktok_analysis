package com.bytedance.forest.model;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class GeckoSource {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ GeckoSource[] $VALUES;
    public static final GeckoSource REMOTE_SETTING = new GeckoSource("REMOTE_SETTING", 0);
    public static final GeckoSource CLIENT_CONFIG = new GeckoSource("CLIENT_CONFIG", 1);
    public static final GeckoSource URL_QUERY = new GeckoSource("URL_QUERY", 2);
    public static final GeckoSource INJECTED_PREFIXES = new GeckoSource("INJECTED_PREFIXES", 3);
    public static final GeckoSource INJECTED_PREFIXES_PARSER = new GeckoSource("INJECTED_PREFIXES_PARSER", 4);
    public static final GeckoSource SPARK_MANIFEST = new GeckoSource("SPARK_MANIFEST", 5);

    public static final /* synthetic */ GeckoSource[] $values() {
        return new GeckoSource[]{REMOTE_SETTING, CLIENT_CONFIG, URL_QUERY, INJECTED_PREFIXES, INJECTED_PREFIXES_PARSER, SPARK_MANIFEST};
    }

    public static InterfaceC2044707zh<GeckoSource> getEntries() {
        return $ENTRIES;
    }

    static {
        GeckoSource[] geckoSourceArr$values = $values();
        $VALUES = geckoSourceArr$values;
        $ENTRIES = new C2254308sP(geckoSourceArr$values);
    }

    public static GeckoSource[] values() {
        return (GeckoSource[]) $VALUES.clone();
    }

    public static GeckoSource valueOf(String str) {
        return (GeckoSource) C08FF.LIZ(GeckoSource.class, str);
    }

    public GeckoSource(String str, int i) {
    }
}
