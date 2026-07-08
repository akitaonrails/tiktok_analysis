package com.bytedance.apm.agent.instrumentation.okhttp3;

import X.C786410Ut5;
import X.C792400V6o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class OkHttpRecord {
    public JSONObject recordJson = new JSONObject();
    public List<DnsInfo> addressList = new ArrayList();
    public SocketInfo socketInfo = new SocketInfo();
    public RecordResponse recordResponse = new RecordResponse();
    public TimeRequest timeRequest = new TimeRequest();
    public DetailedDuration timeDetailedDuration = new DetailedDuration();
    public OtherInfo otherInfo = new OtherInfo();
    public HeaderRequest headerRequest = new HeaderRequest();

    public static class DetailedDuration {
        public int body_recv;
        public boolean cdn_hit_cache;
        public int dns;
        public int edge;
        public int header_recv;
        public int inner;
        public int origin;
        public int proxy = -3;
        public int rtt;
        public int send;
        public int ssl;
        public int tcp;
        public int ttfb;
    }

    public static class DnsInfo {
        public String address;
    }

    public static class HeaderRequest {
        public List<String> serverTimings = new ArrayList();
        public String x_tt_content_encoding;
        public String x_tt_trace_host;
        public String x_tt_trace_id;
        public String x_tt_trace_tag;
    }

    public static class OtherInfo {
        public String libcore = "okhttp";
        public String version = "okhttp/3.12.13.21";
        public boolean is_main_process = C792400V6o.LJIIIZ();
    }

    public static class SocketInfo {
        public String host;
        public String port;
        public String remote;
        public boolean socketReused;
    }

    public static class TimeRequest {
        public long duration;
        public long request_sent_time;
        public long response_recv_time;
        public long start_time;
    }

    private void dealHeader() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x-tt-content-encoding", this.headerRequest.x_tt_content_encoding);
            jSONObject.put("x-tt-trace-host", this.headerRequest.x_tt_trace_host);
            jSONObject.put("x-tt-trace-id", this.headerRequest.x_tt_trace_id);
            jSONObject.put("x-tt-trace-tag", this.headerRequest.x_tt_trace_tag);
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it2 = this.headerRequest.serverTimings.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next());
            }
            jSONObject.put("server-timing", jSONArray);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.recordJson.put("header", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private void dealOther() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("libcore", this.otherInfo.libcore);
            jSONObject.put("version", this.otherInfo.version);
            jSONObject.put("is_main_process", this.otherInfo.is_main_process);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.recordJson.put("other", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private void dealTime() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("duration", this.timeRequest.duration);
            jSONObject2.put("request_sent_time", this.timeRequest.request_sent_time);
            jSONObject2.put("response_recv_time", this.timeRequest.response_recv_time);
            jSONObject2.put("start_time", this.timeRequest.start_time);
            jSONObject.put("request", jSONObject2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("edge", this.timeDetailedDuration.edge);
            jSONObject3.put("ttfb", this.timeDetailedDuration.ttfb);
            jSONObject3.put("rtt", this.timeDetailedDuration.rtt);
            jSONObject3.put("inner", this.timeDetailedDuration.inner);
            jSONObject3.put("cdn_hit_cache", this.timeDetailedDuration.cdn_hit_cache);
            jSONObject3.put("origin", this.timeDetailedDuration.origin);
            jSONObject3.put("proxy", this.timeDetailedDuration.proxy);
            jSONObject3.put("dns", this.timeDetailedDuration.dns);
            jSONObject3.put("tcp", this.timeDetailedDuration.tcp);
            jSONObject3.put("ssl", this.timeDetailedDuration.ssl);
            jSONObject3.put("send", this.timeDetailedDuration.send);
            jSONObject3.put("header_recv", this.timeDetailedDuration.header_recv);
            jSONObject3.put("body_recv", this.timeDetailedDuration.body_recv);
            jSONObject.put("detailed_duration", jSONObject3);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            this.recordJson.put("timing", jSONObject);
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    private void fillDnsInfo() {
        JSONObject jSONObject = new JSONObject();
        if (!this.addressList.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<DnsInfo> it2 = this.addressList.iterator();
            while (it2.hasNext()) {
                jSONArray.put(it2.next().address);
            }
            try {
                jSONObject.put("address_list", jSONArray);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        try {
            this.recordJson.put("dns", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private void fillResponse() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", this.recordResponse.code);
            jSONObject.put("sent_bytes", this.recordResponse.sent_bytes);
            jSONObject.put("received_bytes", this.recordResponse.received_bytes);
            jSONObject.put("via_proxy", this.recordResponse.via_Proxy);
            jSONObject.put("network_accessed", this.recordResponse.network_accessed);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.recordJson.put("response", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    private void fillSocketInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("remote", this.socketInfo.remote);
            jSONObject.put("remote_host", this.socketInfo.host);
            jSONObject.put("remote_port", this.socketInfo.port);
            jSONObject.put("socket_reused", this.socketInfo.socketReused);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        try {
            this.recordJson.put("socket", jSONObject);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public String toString() {
        fillDnsInfo();
        fillSocketInfo();
        fillResponse();
        dealTime();
        dealOther();
        dealHeader();
        return C786410Ut5.J3(this.recordJson);
    }

    public class RecordResponse {
        public int code;
        public boolean network_accessed;
        public long received_bytes;
        public long sent_bytes;
        public boolean via_Proxy;

        public RecordResponse() {
        }
    }
}
