package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class WindowPageConfig implements Serializable {
    public static final TypeAdapter ADAPTER;

    @C09CT("appearService")
    public String appearService;

    @C09CT("disAppearService")
    public String disAppearService;

    static {
        NormalGson.singleton();
        ADAPTER = new WindowPageConfig_OptTypeAdapter();
    }

    public WindowPageConfig() {
        this(null, null);
    }

    public final String getAppearService() {
        return this.appearService;
    }

    public final String getDisAppearService() {
        return this.disAppearService;
    }

    public final void setAppearService(String str) {
        this.appearService = str;
    }

    public final void setDisAppearService(String str) {
        this.disAppearService = str;
    }

    public WindowPageConfig(String str, String str2) {
        this.appearService = str;
        this.disAppearService = str2;
    }
}
