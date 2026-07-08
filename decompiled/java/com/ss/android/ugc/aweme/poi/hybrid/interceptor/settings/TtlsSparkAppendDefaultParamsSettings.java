package com.ss.android.ugc.aweme.poi.hybrid.interceptor.settings;

import X.C01GW;
import X.C2097608Jq;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class TtlsSparkAppendDefaultParamsSettings {
    public static final TtlsSparkAppendDefaultParamsSettings INSTANCE = new TtlsSparkAppendDefaultParamsSettings();
    public static final AppendDefaultParams DEFAULT = new AppendDefaultParams(C2097608Jq.LJ(), C2097608Jq.LJ());
    public static final C01GW defaultParams$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(520));

    public final AppendDefaultParams getDefaultParams() {
        return (AppendDefaultParams) defaultParams$delegate.getValue();
    }

    public final AppendDefaultParams getDEFAULT() {
        return DEFAULT;
    }
}
