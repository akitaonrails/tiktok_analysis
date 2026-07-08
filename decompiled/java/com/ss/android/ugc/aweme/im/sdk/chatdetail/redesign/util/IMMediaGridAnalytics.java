package com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.util;

import X.EnumC1241050iOt;
import X.EnumC1242510iRF;
import X.EnumC1379720m0Y;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class IMMediaGridAnalytics implements IIMMediaGridAnalytics {
    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics
    public final Map LJ(EnumC1381770m3r enumC1381770m3r, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "chat_settings");
        linkedHashMap.put("chat_type", enumC1381770m3r.getEtString());
        if (str != null) {
            linkedHashMap.put("conversation_id", str);
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics
    public final void LIZ(String str, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent(str, map);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics
    public final Map<String, String> LIZIZ(String str, String str2, EnumC1379720m0Y enumC1379720m0Y, String str3, EnumC1381750m3p enumC1381750m3p) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("enter_from", str);
        }
        linkedHashMap.put("conversation_id", str2);
        linkedHashMap.put("panel_source", enumC1379720m0Y.getEtString());
        if (str3 != null) {
            linkedHashMap.put("chat_type", str3);
        }
        if (enumC1381750m3p != null) {
            linkedHashMap.put("tab_name", enumC1381750m3p.getEtString());
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics
    public final Map LIZJ(String str, String str2, EnumC1381770m3r enumC1381770m3r, EnumC1381750m3p enumC1381750m3p, EnumC1242510iRF enumC1242510iRF) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "chat_settings");
        if (str != null) {
            linkedHashMap.put("conversation_id", str);
        }
        if (str2 != null) {
            linkedHashMap.put("to_user_id", str2);
        }
        linkedHashMap.put("chat_type", enumC1381770m3r.getEtString());
        linkedHashMap.put("tab_name", enumC1381750m3p.getEtString());
        if (enumC1242510iRF != null) {
            linkedHashMap.put("is_empty", String.valueOf(enumC1242510iRF.getEtNumber()));
        }
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics
    public final Map<String, String> LIZLLL(String str, String str2, String str3, EnumC1241050iOt enumC1241050iOt, String str4) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("chat_type", str2);
        linkedHashMap.put("conversation_id", str3);
        if (str4 != null) {
            linkedHashMap.put("to_user_id", str4);
        }
        linkedHashMap.put("button_name", enumC1241050iOt.getEtString());
        return linkedHashMap;
    }
}
