package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class TtlsSparkPluginEnableSettings {
    public static final boolean DEFAULT_GROUP = false;
    public static final TtlsSparkPluginEnableSettings INSTANCE = new TtlsSparkPluginEnableSettings();
    public static final C01GW enable$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1755));

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
