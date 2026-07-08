package com.ss.android.ugc.aweme.im.utils;

import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class IMHistorySearchAnalyticsImpl implements IIMChatHistorySearchAnalytics {
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics
    public final void LIZ(String str, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent(str, map);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics
    public final Map LIZIZ(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("chat_type", str2);
        linkedHashMap.put("conversation_id", str3);
        if (str4 != null) {
            linkedHashMap.put("to_user_id", str4);
        }
        linkedHashMap.put("position", "default");
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics
    public final Map<String, String> LIZJ(String str, String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("chat_type", str2);
        linkedHashMap.put("conversation_id", str3);
        linkedHashMap.put("to_user_id", str4);
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatHistorySearchAnalytics
    public final Map<String, String> LIZLLL(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("chat_type", str5);
        linkedHashMap.put("conversation_id", str6);
        if (str7 != null) {
            linkedHashMap.put("to_user_id", str7);
        }
        linkedHashMap.put("search_keyword", str2);
        linkedHashMap.put("search_id", str3);
        linkedHashMap.put("result", str4);
        return linkedHashMap;
    }
}
