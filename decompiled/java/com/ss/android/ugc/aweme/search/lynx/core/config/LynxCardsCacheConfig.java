package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class LynxCardsCacheConfig {

    @C09CT("enable_cache")
    public boolean enable;

    @C09CT("enable_cache_data")
    public boolean enableCacheData;

    @C09CT("cache_expired_time")
    public int cacheExpiredTime = -1;

    @C09CT("cache_card_white_list")
    public List<String> cacheCardWhiteList = C13BV.INSTANCE;

    @C09CT("max_cache_size")
    public int maxCacheSize = LSPassThroughRecordSizeConfig.DEFAULT;
}
