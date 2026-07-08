package com.bytedance.pns.engine;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public interface Params {
    JSONObject getCategory();

    JSONObject getExtras();

    JSONObject getMetrics();
}
