package com.ss.android.ugc.aweme.tako.router.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoBehaviorCollectData implements Serializable {
    public static final int $stable = 8;

    @C09CT("chat_mob_params")
    public Map<String, String> chatMobParams;

    @C09CT("enter_aweme_id")
    public String enterAwemeId;

    @C09CT("enter_search_id")
    public String enterSearchId;

    @C09CT("send_message_mob_params")
    public Map<String, String> sendMessageMobParams;

    @C09CT("stream_request_ext_params")
    public TakoStreamRequestExtParams streamRequestExtParams;

    public TakoBehaviorCollectData() {
        this(null, null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoBehaviorCollectData(enterAwemeId=");
        sbLIZ.append(this.enterAwemeId);
        sbLIZ.append(", enterSearchId=");
        sbLIZ.append(this.enterSearchId);
        sbLIZ.append(", streamRequestExtParams=");
        sbLIZ.append(this.streamRequestExtParams);
        sbLIZ.append(", chatMobParams=");
        sbLIZ.append(this.chatMobParams);
        sbLIZ.append(", sendMessageMobParams=");
        sbLIZ.append(this.sendMessageMobParams);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setChatMobParams(Map<String, String> map) {
        this.chatMobParams = map;
    }

    public final void setEnterAwemeId(String str) {
        this.enterAwemeId = str;
    }

    public final void setEnterSearchId(String str) {
        this.enterSearchId = str;
    }

    public final void setSendMessageMobParams(Map<String, String> map) {
        this.sendMessageMobParams = map;
    }

    public final void setStreamRequestExtParams(TakoStreamRequestExtParams takoStreamRequestExtParams) {
        this.streamRequestExtParams = takoStreamRequestExtParams;
    }

    public TakoBehaviorCollectData(String str, String str2, TakoStreamRequestExtParams takoStreamRequestExtParams, Map<String, String> map, Map<String, String> map2) {
        this.enterAwemeId = str;
        this.enterSearchId = str2;
        this.streamRequestExtParams = takoStreamRequestExtParams;
        this.chatMobParams = map;
        this.sendMessageMobParams = map2;
    }
}
