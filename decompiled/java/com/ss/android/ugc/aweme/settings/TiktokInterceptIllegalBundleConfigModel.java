package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class TiktokInterceptIllegalBundleConfigModel {

    @C09CT("enable_intercept")
    public final boolean enableIntercept;

    @C09CT("enable_report")
    public final boolean enableReport;

    @C09CT("illegalBundleWords")
    public final List<String> illegalBundleWords;

    public TiktokInterceptIllegalBundleConfigModel(boolean z, boolean z2, List<String> list) {
        this.enableIntercept = z;
        this.enableReport = z2;
        this.illegalBundleWords = list;
    }
}
