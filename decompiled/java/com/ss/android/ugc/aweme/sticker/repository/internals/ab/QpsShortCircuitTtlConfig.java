package com.ss.android.ugc.aweme.sticker.repository.internals.ab;

import X.C01GW;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class QpsShortCircuitTtlConfig {
    public static final int DEFAULT = 0;
    public static final QpsShortCircuitTtlConfig INSTANCE = new QpsShortCircuitTtlConfig();
    public static final C01GW isEnabled$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(555));
    public static final int $stable = 8;

    public final int isEnabled() {
        return ((Number) isEnabled$delegate.getValue()).intValue();
    }
}
