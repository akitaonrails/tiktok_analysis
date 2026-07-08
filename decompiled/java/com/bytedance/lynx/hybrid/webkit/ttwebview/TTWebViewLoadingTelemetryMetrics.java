package com.bytedance.lynx.hybrid.webkit.ttwebview;

import X.C1697810uHb;
import X.C2095008Iq;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class TTWebViewLoadingTelemetryMetrics {
    public static final TTWebViewLoadingTelemetryMetrics INSTANCE = new TTWebViewLoadingTelemetryMetrics();
    public static final List<String> defaultLoadingMetricKeys = C1697810uHb.LJIIJJI("top_level_timing", "ttwebview_info");

    public static final JSONObject buildFromLoadingMetrics(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("top_level_timing");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ttwebview_info");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObjectOptJSONObject2 != null) {
            TTWebViewLoadingTelemetryMetrics tTWebViewLoadingTelemetryMetrics = INSTANCE;
            String strOptLoadSoValue = tTWebViewLoadingTelemetryMetrics.optLoadSoValue(jSONObjectOptJSONObject2);
            if (strOptLoadSoValue != null) {
                jSONObject2.put("loadso", strOptLoadSoValue);
            }
            if (jSONObjectOptJSONObject2.has("flag_first_webview")) {
                jSONObject2.put("is_first_webview", jSONObjectOptJSONObject2.optBoolean("flag_first_webview"));
            }
            if (jSONObjectOptJSONObject2.has("flag_first_navigation")) {
                jSONObject2.put("is_first_navigation", jSONObjectOptJSONObject2.optBoolean("flag_first_navigation"));
            }
            String strOptStringOrNull = tTWebViewLoadingTelemetryMetrics.optStringOrNull(jSONObjectOptJSONObject2, "flag_java_render_process_status_on_load_url");
            if (strOptStringOrNull != null) {
                jSONObject2.put("render_status_on_load", strOptStringOrNull);
            }
            Long lOptLongNumber = tTWebViewLoadingTelemetryMetrics.optLongNumber(jSONObjectOptJSONObject2, "flag_java_render_process_launch_duration");
            if (lOptLongNumber != null) {
                jSONObject2.put("render_launch_duration", lOptLongNumber.longValue());
            }
        }
        if (jSONObjectOptJSONObject != null) {
            TTWebViewLoadingTelemetryMetrics tTWebViewLoadingTelemetryMetrics2 = INSTANCE;
            Long lDiffLong = tTWebViewLoadingTelemetryMetrics2.diffLong(jSONObjectOptJSONObject, "tick_create_webview_end", "tick_create_webview_start");
            if (lDiffLong != null) {
                jSONObject2.put("create_webview_duration", lDiffLong.longValue());
            }
            Long lDiffLong2 = tTWebViewLoadingTelemetryMetrics2.diffLong(jSONObjectOptJSONObject, "tick_render_response", "tick_response_start");
            if (lDiffLong2 != null) {
                long jLongValue = lDiffLong2.longValue();
                jSONObject2.put("wait_render_duration", jLongValue);
                jSONObject2.put("dur_response2renderer", jLongValue);
            }
            Long lDiffLong3 = tTWebViewLoadingTelemetryMetrics2.diffLong(jSONObjectOptJSONObject, "tick_response_start", "tick_load_url");
            if (lDiffLong3 != null) {
                jSONObject2.put("dur_load_url2response", lDiffLong3.longValue());
            }
            Long lDiffLong4 = tTWebViewLoadingTelemetryMetrics2.diffLong(jSONObjectOptJSONObject, "tick_lcp", "tick_render_response");
            if (lDiffLong4 != null) {
                jSONObject2.put("dur_renderer_response2lcp", lDiffLong4.longValue());
            }
            Long lOptLongNumber2 = tTWebViewLoadingTelemetryMetrics2.optLongNumber(jSONObjectOptJSONObject, "dur_blocking_request_before_lcp");
            if (lOptLongNumber2 != null) {
                jSONObject2.put("dur_blocking_request_before_lcp", lOptLongNumber2.longValue());
            }
            Long lOptLongNumber3 = tTWebViewLoadingTelemetryMetrics2.optLongNumber(jSONObjectOptJSONObject, "dur_script_before_lcp");
            if (lOptLongNumber3 != null) {
                jSONObject2.put("dur_script_before_lcp", lOptLongNumber3.longValue());
            }
            Long lOptLongNumber4 = tTWebViewLoadingTelemetryMetrics2.optLongNumber(jSONObjectOptJSONObject, "dur_layout_before_lcp");
            if (lOptLongNumber4 != null) {
                jSONObject2.put("dur_layout_before_lcp", lOptLongNumber4.longValue());
            }
            Long lOptLongNumber5 = tTWebViewLoadingTelemetryMetrics2.optLongNumber(jSONObjectOptJSONObject, "dur_paint_before_lcp");
            if (lOptLongNumber5 != null) {
                jSONObject2.put("dur_paint_before_lcp", lOptLongNumber5.longValue());
            }
            Long lDiffLong5 = tTWebViewLoadingTelemetryMetrics2.diffLong(jSONObjectOptJSONObject, "tick_page_finished", "tick_page_started");
            if (lDiffLong5 != null) {
                jSONObject2.put("dur_page_finished", lDiffLong5.longValue());
            }
        }
        if (jSONObject2.length() == 0) {
            return null;
        }
        return jSONObject2;
    }

    private final String optLoadSoValue(JSONObject jSONObject) throws JSONException {
        String string;
        Object obj = null;
        if (!jSONObject.has("loadso")) {
            return null;
        }
        Object obj2 = jSONObject.get("loadso");
        if (obj2 instanceof String) {
            if (((String) obj2).length() > 0) {
                obj = obj2;
            }
            return (String) obj;
        }
        if (obj2 instanceof Number) {
            return obj2.toString();
        }
        if (obj2 == null || (string = obj2.toString()) == null || string.length() <= 0) {
            return null;
        }
        return string;
    }

    private final Long optLongNumber(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return C2095008Iq.LJIILIIL((String) obj);
    }

    private final String optStringOrNull(JSONObject jSONObject, String str) {
        String strOptString;
        if (!jSONObject.has(str) || (strOptString = jSONObject.optString(str, null)) == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }

    private final Long diffLong(JSONObject jSONObject, String str, String str2) throws JSONException {
        Long lOptLongNumber = optLongNumber(jSONObject, str);
        if (lOptLongNumber != null) {
            long jLongValue = lOptLongNumber.longValue();
            Long lOptLongNumber2 = optLongNumber(jSONObject, str2);
            if (lOptLongNumber2 != null) {
                return Long.valueOf(jLongValue - lOptLongNumber2.longValue());
            }
        }
        return null;
    }
}
