package com.ss.android.ugc.aweme.ecommerce.mix.ab;

import X.C09CT;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: loaded from: classes19.dex */
public final class ECStoreMixConfig {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_flatten")
    public final boolean flattenEnable;

    @C09CT("preload_spark_expire_time")
    public final int preloadExpireTime = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;

    @C09CT("preload_spark_enable")
    public final boolean preloadSparkEnable;

    @C09CT("enable_na_tab")
    public final boolean ravenEnable;
}
