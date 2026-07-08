package com.bytedance.vcloud.strategy.drm;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public final class ProvisionMetrics {
    public String maxHdcpLevelString;
    public String maxSessionCountString;
    public int provisionRequestResult = -1;
    public long provisionRequestCost = -1;
    public int maxSessionCountInt = -1;
    public int maxHdcpLevelInt = -1;
    public long getMetricsCost = -1;
    public int preProvisionEnabled = -1;
    public int preProvisionTriggered = -1;
    public int preProvisionResult = -1;
    public int preProvisionRequested = -1;
    public long preProvisionCost = -1;

    public Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("provision_request_result", Integer.valueOf(this.provisionRequestResult));
        linkedHashMap.put("provision_request_cost", Long.valueOf(this.provisionRequestCost));
        linkedHashMap.put("drm_max_session_count_int", Integer.valueOf(this.maxSessionCountInt));
        linkedHashMap.put("drm_max_session_count_string", this.maxSessionCountString);
        linkedHashMap.put("drm_max_hdcp_level_int", Integer.valueOf(this.maxHdcpLevelInt));
        linkedHashMap.put("drm_max_hdcp_level_string", this.maxHdcpLevelString);
        linkedHashMap.put("drm_get_provision_metrics_cost", Long.valueOf(this.getMetricsCost));
        linkedHashMap.put("pre_provision_enabled", Integer.valueOf(this.preProvisionEnabled));
        linkedHashMap.put("pre_provision_triggered", Integer.valueOf(this.preProvisionTriggered));
        linkedHashMap.put("pre_provision_result", Integer.valueOf(this.preProvisionResult));
        linkedHashMap.put("pre_provision_requested", Integer.valueOf(this.preProvisionRequested));
        linkedHashMap.put("pre_provision_cost", Long.valueOf(this.preProvisionCost));
        return linkedHashMap;
    }
}
