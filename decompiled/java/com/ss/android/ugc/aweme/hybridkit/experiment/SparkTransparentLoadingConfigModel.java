package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkTransparentLoadingConfigModel {

    @C09CT("enable_transparent_loading")
    public final boolean enableTransparentLoading;

    @C09CT("exemptList")
    public final List<String> exemptList;

    public SparkTransparentLoadingConfigModel() {
        this(false, new ArrayList());
    }

    public SparkTransparentLoadingConfigModel(boolean z, List<String> list) {
        this.enableTransparentLoading = z;
        this.exemptList = list;
    }
}
