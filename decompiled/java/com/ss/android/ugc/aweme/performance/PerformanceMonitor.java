package com.ss.android.ugc.aweme.performance;

import android.os.Parcelable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public interface PerformanceMonitor extends Parcelable {
    boolean IN();

    JSONObject aA(String str, String[] strArr, long[] jArr, HashMap<String, Long> map);

    String getEnterFrom();

    Map<String, String> getExtraParams();

    String getType();

    List<String> iF();
}
