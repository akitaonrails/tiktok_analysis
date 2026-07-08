package com.orbu.core.adapter;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKOrbuContext {
    public final Context applicationContext;
    public final String deviceId;
    public final JSONObject extraInfo;
    public final int nativeReportStrategy;
    public final String region;
    public final String userAction;
    public final String userId;
    public final JSONObject wrapperExtraInfo;

    public TTKOrbuContext(String str, String str2, String str3, String str4, Context context, JSONObject jSONObject, JSONObject jSONObject2, int i) {
        this.region = str;
        this.userId = str2;
        this.deviceId = str3;
        this.userAction = str4;
        this.applicationContext = context;
        this.extraInfo = jSONObject;
        this.wrapperExtraInfo = jSONObject2;
        this.nativeReportStrategy = i;
    }
}
