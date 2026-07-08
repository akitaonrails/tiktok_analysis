package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.setting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
public final class SecondaryBoardInputConfig {
    public static final TypeAdapter ADAPTER;

    @C09CT("desc_line_limit")
    public int descLineLimit;

    @C09CT("word_limit")
    public int wordLimit;

    static {
        NormalGson.singleton();
        ADAPTER = new SecondaryBoardInputConfig_OptTypeAdapter();
    }

    public SecondaryBoardInputConfig() {
        this(120, 12);
    }

    public SecondaryBoardInputConfig(int i, int i2) {
        this.wordLimit = i;
        this.descLineLimit = i2;
    }
}
