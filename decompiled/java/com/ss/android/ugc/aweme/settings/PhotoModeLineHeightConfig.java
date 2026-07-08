package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes29.dex */
public final class PhotoModeLineHeightConfig {

    @C09CT("default_line_height")
    public final float defaultLineHeight;

    @C09CT("photo_mode_line_height_config")
    public final Map<String, Float> photoModeLineHeightConfig;

    public PhotoModeLineHeightConfig() {
        this(C2097608Jq.LJ(), 1.4f);
    }

    public PhotoModeLineHeightConfig(Map<String, Float> map, float f) {
        this.photoModeLineHeightConfig = map;
        this.defaultLineHeight = f;
    }
}
