package com.ss.android.ugc.aweme.dynamic.card.data;

import X.C09CT;
import X.C18SX;
import X.C2097608Jq;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class DynamicClientData {

    @C09CT("card_info")
    public final CardInfo cardInfo;

    @C09CT("container_info")
    public final Map<String, Object> containerInfo;

    @C09CT("conversation_info")
    public final Map<String, Object> conversationInfo;

    @C09CT("experiment_info")
    public final Map<String, Object> experimentInfo;

    @C09CT("message_info")
    public final MessageInfo messageInfo;

    @C09CT("prerender_mode")
    public final boolean prerenderMode;

    @C09CT("router_params")
    public final Map<String, String> routerParams;

    @C09CT("ui_location_type")
    public final int uiLocationType;

    public DynamicClientData() {
        this(null, null, C18SX.MessageNormal.getValue(), null, C2097608Jq.LJ(), false, C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public DynamicClientData(Map<String, ? extends Object> map, MessageInfo messageInfo, int i, CardInfo cardInfo, Map<String, String> map2, boolean z, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        this.conversationInfo = map;
        this.messageInfo = messageInfo;
        this.uiLocationType = i;
        this.cardInfo = cardInfo;
        this.routerParams = map2;
        this.prerenderMode = z;
        this.containerInfo = map3;
        this.experimentInfo = map4;
    }
}
