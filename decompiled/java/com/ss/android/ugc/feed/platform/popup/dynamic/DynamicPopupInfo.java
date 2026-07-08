package com.ss.android.ugc.feed.platform.popup.dynamic;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class DynamicPopupInfo {
    public String LIZ;

    @C09CT("biz_data")
    public final String bizData;

    @C09CT("block_page_list")
    public final List<String> blockPageList;

    @C09CT("container_key")
    public final String containerKey;

    @C09CT("gecko_channel")
    public final String geckoChannel;

    @C09CT("gecko_schema")
    public final String geckoSchema;

    @C09CT("interaction_config")
    public final InteractionConfig interactionConfig;

    @C09CT("popup_key")
    public final String popupKey;

    @C09CT("trace_info")
    public final Map<String, String> traceInfo;

    @C09CT("trigger_id")
    public final String triggerId;

    @C09CT("trigger_timeout")
    public final int triggerTimeout;

    @C09CT("trigger_timing")
    public final String triggerTiming;

    public DynamicPopupInfo() {
        this(null, null, null, null, null, null, null, null, null, -1, null);
    }

    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{key=");
        sbLIZ.append(this.popupKey);
        sbLIZ.append(", id=");
        sbLIZ.append(this.triggerId);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DynamicPopupInfo(String str, String str2, String str3, String str4, InteractionConfig interactionConfig, String str5, String str6, String str7, Map<String, String> map, int i, List<String> list) {
        this.popupKey = str;
        this.triggerId = str2;
        this.containerKey = str3;
        this.triggerTiming = str4;
        this.interactionConfig = interactionConfig;
        this.geckoChannel = str5;
        this.geckoSchema = str6;
        this.bizData = str7;
        this.traceInfo = map;
        this.triggerTimeout = i;
        this.blockPageList = list;
    }
}
