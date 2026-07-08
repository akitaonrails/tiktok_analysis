package com.ss.android.common.applog;

import X.C1AF1;
import X.C786410Ut5;
import android.content.Context;
import com.service.middleware.applog.ApplogService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ApplogServiceImpl implements ApplogService {
    public static final String TAG = "ApplogServiceImpl";
    public static volatile boolean isServicePrepared = false;
    public static volatile C1AF1 cachedHeaderCustomTimelyCallback = null;

    public static void handleCachedData() {
        if (isServicePrepared && cachedHeaderCustomTimelyCallback != null) {
            AppLog.registerHeaderCustomCallback(cachedHeaderCustomTimelyCallback);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void registerHeaderCustomCallback(C1AF1 c1af1) {
        if (isServicePrepared) {
            AppLog.registerHeaderCustomCallback(c1af1);
        } else {
            cachedHeaderCustomTimelyCallback = c1af1;
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, "event_v1", str, null, 0L, 0L, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, "event_v1", str, str2, 0L, 0L, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, str, str2, str3, j, j2, false, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, str, str2, str3, j, j2, false, jSONObject);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, str, str2, str3, j, j2, z, null);
        }
    }

    @Override // com.service.middleware.applog.ApplogService
    public void onEvent(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
        if (isServicePrepared) {
            C786410Ut5.LIZ(context, str, str2, str3, j, j2, z, jSONObject);
        }
    }
}
