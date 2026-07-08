package com.ss.android.ugc.aweme.search.lynx.core.config;

import X.C09CT;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public final class SearchSsrPassthroughConfig {

    @C09CT("global_props")
    public List<String> globalPropsEnableList = Collections.singletonList("statusBarHeight");

    @C09CT("runtime_info")
    public List<String> runtimeInfoEnableList = C1697810uHb.LJIIJJI("lynxSSRProtocolVersion", "sparkProtocolVersion");

    @C09CT("system_info")
    public List<String> systemInfoEnableList = C1697810uHb.LJIIJJI("pixelRatio", "pixelWidth", "pixelHeight", "platform");
}
