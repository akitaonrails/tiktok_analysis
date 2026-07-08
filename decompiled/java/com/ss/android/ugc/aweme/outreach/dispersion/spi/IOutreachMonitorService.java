package com.ss.android.ugc.aweme.outreach.dispersion.spi;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public interface IOutreachMonitorService {
    void init();

    void onEventV3(String str, Map<String, String> map);

    void onEventV3(String str, JSONObject jSONObject);
}
