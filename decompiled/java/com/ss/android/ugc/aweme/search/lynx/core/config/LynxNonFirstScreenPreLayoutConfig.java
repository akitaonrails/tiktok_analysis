package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxNonFirstScreenPreLayoutConfig {

    @C09CT("enable_commonparams")
    public int enablePraLayoutWithCommonParams;

    @C09CT("disable_parallel_fetch_resource")
    public int enablePraLayoutWithoutParallelFetchResource;

    @C09CT("non_firstscreen_prelayout_blacklist")
    public List<String> nonFirstScreenPreLayoutBlackBundleList;

    @C09CT("non_firstscreen_prelayout_bundlelist")
    public List<String> nonFirstScreenPreLayoutBundleList;

    public LynxNonFirstScreenPreLayoutConfig() {
        C13BV c13bv = C13BV.INSTANCE;
        this.nonFirstScreenPreLayoutBundleList = c13bv;
        this.nonFirstScreenPreLayoutBlackBundleList = c13bv;
    }
}
