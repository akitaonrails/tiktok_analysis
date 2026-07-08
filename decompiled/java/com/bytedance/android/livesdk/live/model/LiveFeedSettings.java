package com.bytedance.android.livesdk.live.model;

import X.C09CT;
import X.C2188811AlT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveFeedSettings {
    public static final TypeAdapter ADAPTER = new LiveFeedSettings_OptTypeAdapter(NormalGson.singleton());

    @C09CT("channel_id")
    public int channel_id;

    @C09CT("is_follow")
    public boolean isFollow;

    @C09CT("enable")
    public String enable = CardStruct.IStatusCode.DEFAULT;

    @C09CT("param")
    public String param = "";

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveFeedSettings(enable='");
        sbLIZ.append(this.enable);
        sbLIZ.append("', isFollow=");
        sbLIZ.append(this.isFollow);
        sbLIZ.append(", param='");
        sbLIZ.append(this.param);
        sbLIZ.append("', channel_id=");
        sbLIZ.append(this.channel_id);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
