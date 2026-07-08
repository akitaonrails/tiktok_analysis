package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class AIGCStyleConfig {

    @C09CT("background_dark_url")
    public final String backgroundDarkUrl;

    @C09CT("background_light_url")
    public final String backgroundLightUrl;

    @C09CT("customized_colors")
    public final AIGCCustomizedColors customizedColors;

    public AIGCStyleConfig() {
        this("", "", null);
    }

    public AIGCStyleConfig(String str, String str2, AIGCCustomizedColors aIGCCustomizedColors) {
        this.backgroundLightUrl = str;
        this.backgroundDarkUrl = str2;
        this.customizedColors = aIGCCustomizedColors;
    }
}
