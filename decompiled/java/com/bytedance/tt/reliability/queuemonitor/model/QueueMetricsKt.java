package com.bytedance.tt.reliability.queuemonitor.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class QueueMetricsKt {
    public static final JSONObject toJsonObject(QueueEvent queueEvent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("queue_id", queueEvent.queueId);
        jSONObject.put("name", queueEvent.name);
        jSONObject.put("queue_type", queueEvent.queueType.name());
        jSONObject.put("group_type", queueEvent.groupType);
        jSONObject.put("caller_thread_name", queueEvent.callerThreadName);
        jSONObject.put("caller_key_point", queueEvent.callerKeyPoint);
        jSONObject.put("blocked_flag", queueEvent.blockedFlag);
        jSONObject.put("blocked_reason", queueEvent.blockedReason);
        jSONObject.put("queue_length", queueEvent.queueLength);
        jSONObject.put("traffic_intensity", queueEvent.trafficIntensity);
        jSONObject.put("enqueue_rate", queueEvent.enqueueRate);
        jSONObject.put("dequeue_rate", queueEvent.dequeueRate);
        jSONObject.put("producer_stack_hash", queueEvent.producerStackHash);
        jSONObject.put("producer_stack_trace", queueEvent.producerStackTrace);
        jSONObject.put("producer_sample_rate", queueEvent.producerSampleRate);
        jSONObject.put("producer_contribution_rate", queueEvent.producerContributionRate);
        jSONObject.put("config_id", queueEvent.configId);
        return jSONObject;
    }

    public static final JSONObject toJsonObject(QueueMetrics queueMetrics) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("queue_id", queueMetrics.queueId);
        jSONObject.put("name", queueMetrics.name);
        jSONObject.put("queue_type", queueMetrics.queueType.name());
        jSONObject.put("group_type", queueMetrics.groupType);
        jSONObject.put("caller_thread_name", queueMetrics.callerThreadName);
        jSONObject.put("caller_key_point", queueMetrics.callerKeyPoint);
        jSONObject.put("enqueue_rate", queueMetrics.enqueueRate);
        jSONObject.put("dequeue_rate", queueMetrics.dequeueRate);
        jSONObject.put("queue_length", queueMetrics.queueLength);
        jSONObject.put("window", queueMetrics.window);
        jSONObject.put("config_id", queueMetrics.configId);
        return jSONObject;
    }
}
