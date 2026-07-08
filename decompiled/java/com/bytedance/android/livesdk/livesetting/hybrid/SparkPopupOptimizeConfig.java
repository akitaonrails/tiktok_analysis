package com.bytedance.android.livesdk.livesetting.hybrid;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class SparkPopupOptimizeConfig {
    public static final TypeAdapter ADAPTER = new SparkPopupOptimizeConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_list")
    public String[] blockList;

    @C09CT("lynx_enable")
    public boolean lynxEnable;

    @C09CT("webview_enable")
    public boolean webviewEnable;

    public SparkPopupOptimizeConfig() {
        this(false, false, null);
    }

    public SparkPopupOptimizeConfig(boolean z, boolean z2, String[] strArr) {
        this.lynxEnable = z;
        this.webviewEnable = z2;
        this.blockList = strArr;
    }
}
