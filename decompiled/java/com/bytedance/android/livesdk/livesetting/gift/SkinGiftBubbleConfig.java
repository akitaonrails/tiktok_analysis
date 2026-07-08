package com.bytedance.android.livesdk.livesetting.gift;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class SkinGiftBubbleConfig {
    public static final TypeAdapter ADAPTER = new SkinGiftBubbleConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    @C09CT("gifts")
    public List<SkinGiftConfig> gifts;

    public SkinGiftBubbleConfig() {
        this(false, null);
    }

    public SkinGiftBubbleConfig(boolean z, List<SkinGiftConfig> list) {
        this.enable = z;
        this.gifts = list;
    }
}
