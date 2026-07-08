package com.ss.android.ugc.aweme.service;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PoiAnchorDebugInfo {
    public final String awemeId;
    public final JSONObject iconDisplayTraceInfo;
    public final JSONObject iconNetworkTraceInfo;
    public final List<String> loadLog;
    public final String poiId;
    public final String poiName;
    public final String requestId;
    public final long timeStamp;

    public PoiAnchorDebugInfo(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, List<String> list, long j) {
        this.poiId = str;
        this.awemeId = str2;
        this.poiName = str3;
        this.requestId = str4;
        this.iconNetworkTraceInfo = jSONObject;
        this.iconDisplayTraceInfo = jSONObject2;
        this.loadLog = list;
        this.timeStamp = j;
    }
}
