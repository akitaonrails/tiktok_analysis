package com.ss.ugc.effectplatform.abtest;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class UseDispatcherIOExecutorOverrideConfig {
    public static final boolean DISABLED = false;
    public static final boolean ENABLED = true;
    public static final UseDispatcherIOExecutorOverrideConfig INSTANCE = new UseDispatcherIOExecutorOverrideConfig();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2318));

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
