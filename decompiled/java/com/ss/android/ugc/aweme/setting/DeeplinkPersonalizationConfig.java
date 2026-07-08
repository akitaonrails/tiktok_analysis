package com.ss.android.ugc.aweme.setting;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class DeeplinkPersonalizationConfig {

    @C09CT("url_config")
    public final List<PersonalizationModel> urlConfig;

    @C09CT("url_regex")
    public final String urlRegex;

    public DeeplinkPersonalizationConfig() {
        this("", new ArrayList());
    }

    public DeeplinkPersonalizationConfig(String str, List<PersonalizationModel> list) {
        this.urlRegex = str;
        this.urlConfig = list;
    }
}
