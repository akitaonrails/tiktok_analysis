package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class FullyCustomizedInputConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("desc_line_limit")
    public int descLineLimit;

    @C09CT("headline_line_limit")
    public int headlineLineLimit;

    @C09CT("word_limit")
    public int wordLimit;

    static {
        NormalGson.singleton();
        ADAPTER = new FullyCustomizedInputConfig_OptTypeAdapter();
    }

    public FullyCustomizedInputConfig() {
        this(120, 6, 12);
    }

    public FullyCustomizedInputConfig(int i, int i2, int i3) {
        this.wordLimit = i;
        this.headlineLineLimit = i2;
        this.descLineLimit = i3;
    }
}
