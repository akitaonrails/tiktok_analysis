package com.ss.android.ugc.aweme.localservice.passthrough.settings;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class LSPassThroughStoreUUidConfig {
    public static final boolean DEFAULT = true;
    public static final LSPassThroughStoreUUidConfig INSTANCE = new LSPassThroughStoreUUidConfig();
    public static final C01GW storeConfig$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1735));

    private final boolean getStoreConfig() {
        return ((Boolean) storeConfig$delegate.getValue()).booleanValue();
    }

    public final boolean shouldStoreMap() {
        return getStoreConfig();
    }
}
