package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes13.dex */
public final class GameLiveClientInferConfig {
    public static final TypeAdapter ADAPTER = new GameLiveClientInferConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("is_open_debug")
    public boolean isOpenDebug;

    @C09CT("module")
    public String module = "keytime";

    @C09CT("fusion_id")
    public String fusionId = "118";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameLiveClientInferConfig(isOpenDebug=");
        sbLIZ.append(this.isOpenDebug);
        sbLIZ.append(", module=");
        sbLIZ.append(this.module);
        sbLIZ.append(", fusionId=");
        sbLIZ.append(this.fusionId);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
