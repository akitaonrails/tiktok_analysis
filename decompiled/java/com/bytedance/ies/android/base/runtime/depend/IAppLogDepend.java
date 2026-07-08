package com.bytedance.ies.android.base.runtime.depend;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface IAppLogDepend {
    void appendCommonParams(StringBuilder sb, boolean z);

    String getCategory(boolean z);

    ExecutorService getLogThreadPool();

    void onEventV1(Context context, String str, String str2, String str3, String str4, long j, JSONObject jSONObject);

    void onEventV3Bundle(String str, Bundle bundle);

    void onEventV3Json(String str, JSONObject jSONObject);

    void onEventV3Map(String str, Map<String, String> map);

    void putCommonParams(Map<String, String> map, boolean z);
}
