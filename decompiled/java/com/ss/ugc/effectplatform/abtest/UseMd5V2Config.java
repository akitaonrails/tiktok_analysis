package com.ss.ugc.effectplatform.abtest;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class UseMd5V2Config {
    public static final boolean DISABLED = false;
    public static final boolean ENABLED = true;
    public static final UseMd5V2Config INSTANCE = new UseMd5V2Config();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(759));

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
