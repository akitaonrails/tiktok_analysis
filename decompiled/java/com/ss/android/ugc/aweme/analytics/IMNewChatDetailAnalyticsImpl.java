package com.ss.android.ugc.aweme.analytics;

import X.InterfaceC1493105sv;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMNewChatDetailAnalyticsImpl implements IIMNewChatDetailAnalytics {
    @Override // com.ss.android.ugc.aweme.analytics.IIMNewChatDetailAnalytics
    public final void LIZ(String str, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent(str, map);
    }

    @Override // com.ss.android.ugc.aweme.analytics.IIMNewChatDetailAnalytics
    public final Map LIZIZ(String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "chat_settings");
        linkedHashMap.put("chat_type", str);
        linkedHashMap.put("conversation_id", str2);
        if (str3 != null) {
            linkedHashMap.put("to_user_id", str3);
        }
        return linkedHashMap;
    }
}
