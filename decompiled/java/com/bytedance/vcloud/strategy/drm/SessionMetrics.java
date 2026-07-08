package com.bytedance.vcloud.strategy.drm;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class SessionMetrics {
    public int licenseRequestRetryCount;
    public int drmOpenResult = -1;
    public long drmOpenCost = -1;
    public long drmOpenTotalCost = -1;
    public int licenseRequestResult = -1;
    public long licenseRequestCost = -1;
    public long licenseRequestTotalCost = -1;
    public int usePreload = -1;
    public long getMetricsCost = -1;

    public Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("drm_open_result", Integer.valueOf(this.drmOpenResult));
        linkedHashMap.put("drm_open_cost", Long.valueOf(this.drmOpenCost));
        linkedHashMap.put("drm_open_total_cost", Long.valueOf(this.drmOpenTotalCost));
        linkedHashMap.put("license_request_result", Integer.valueOf(this.licenseRequestResult));
        linkedHashMap.put("license_request_cost", Long.valueOf(this.licenseRequestCost));
        linkedHashMap.put("license_request_total_cost", Long.valueOf(this.licenseRequestTotalCost));
        linkedHashMap.put("license_request_retry_count", Integer.valueOf(this.licenseRequestRetryCount));
        linkedHashMap.put("drm_use_preload", Integer.valueOf(this.usePreload));
        linkedHashMap.put("drm_get_session_metrics_cost", Long.valueOf(this.getMetricsCost));
        return linkedHashMap;
    }
}
