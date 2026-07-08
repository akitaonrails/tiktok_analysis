package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes4.dex */
public final class GamePartnershipPropsSalesCctConfig {
    public static final TypeAdapter ADAPTER = new GamePartnershipPropsSalesCctConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable")
    public boolean enable;

    public GamePartnershipPropsSalesCctConfig() {
        this(false);
    }

    public GamePartnershipPropsSalesCctConfig(boolean z) {
        this.enable = z;
    }
}
