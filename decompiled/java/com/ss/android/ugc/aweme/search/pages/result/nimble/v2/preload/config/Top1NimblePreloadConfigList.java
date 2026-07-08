package com.ss.android.ugc.aweme.search.pages.result.nimble.v2.preload.config;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class Top1NimblePreloadConfigList {

    @C09CT("data_map_opt")
    public final Boolean fusionBlockToMap;

    @C09CT("markdown_opt")
    public final Boolean markdownOpt;

    @C09CT("template_context_opt")
    public final Boolean templateContextOpt;

    public Top1NimblePreloadConfigList() {
        this(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE);
    }

    public Top1NimblePreloadConfigList(Boolean bool, Boolean bool2, Boolean bool3) {
        this.templateContextOpt = bool;
        this.fusionBlockToMap = bool2;
        this.markdownOpt = bool3;
    }
}
