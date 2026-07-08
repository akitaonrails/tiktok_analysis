package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C01GW;
import X.C2097608Jq;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class TtlsSparkAppendSpecifiedParamsSettings {
    public static final TtlsSparkAppendSpecifiedParamsSettings INSTANCE = new TtlsSparkAppendSpecifiedParamsSettings();
    public static final AppendSpecifiedParamsKey DEFAULT = new AppendSpecifiedParamsKey(C2097608Jq.LJ(), C2097608Jq.LJ());
    public static final C01GW keys$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(521));

    public final AppendSpecifiedParamsKey getKeys() {
        return (AppendSpecifiedParamsKey) keys$delegate.getValue();
    }

    public final AppendSpecifiedParamsKey getDEFAULT() {
        return DEFAULT;
    }
}
