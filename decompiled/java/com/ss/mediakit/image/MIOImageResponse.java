package com.ss.mediakit.image;

import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class MIOImageResponse {
    public final int code;
    public final byte[] data;
    public final String desc;
    public final ResponseDetail detail;
    public final long length;
    public final InputStream stream;

    public static class Builder {
        public int code;
        public byte[] data;
        public String desc;
        public ResponseDetail detail;
        public long length;
        public InputStream stream;

        public MIOImageResponse build() {
            return new MIOImageResponse(this);
        }

        public Builder() {
            this.code = -1;
            this.detail = new ResponseDetail();
            this.stream = null;
            this.length = 0L;
        }

        public Builder setCode(int i) {
            this.code = i;
            return this;
        }

        public Builder setData(byte[] bArr) {
            this.data = bArr;
            return this;
        }

        public Builder setDesc(String str) {
            this.desc = str;
            return this;
        }

        public Builder setDetail(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.detail.parse(str);
            }
            return this;
        }

        public Builder setLength(long j) {
            this.length = j;
            return this;
        }

        public Builder setStream(InputStream inputStream) {
            this.stream = inputStream;
            return this;
        }
    }

    public static class ResponseDetail {
        public int retryCount;
        public String url;
        public int statusCode = -1;
        public Map<String, String> respHeaders = new HashMap();
        public long dnsTime = -1;
        public long connectTime = -1;
        public long tlsTime = -1;
        public long sendTime = -1;
        public long waitTime = -1;
        public long receiveTime = -1;
        public long totalTime = -1;
        public long totalSendBytes = -1;
        public long totalReceiveBytes = -1;
        public long requestStartTs = 0;
        public String remoteIp = null;
        public boolean socketReuse = false;
        public JSONObject extraInfo = null;

        public String dump() {
            return C786410Ut5.k4(Locale.US, "retryCount: %d, url: %s, statusCode: %d, dnsTime: %d, connectTime: %d, tlsTime: %d, sendTime: %d, waitTime: %d, receiveTime: %d, totalTime: %d, totalSendBytes: %d, totalReceiveBytes: %d, requestStartTs: %d, remoteIp: %s, socketReuse: %b", new Object[]{Integer.valueOf(this.retryCount), this.url, Integer.valueOf(this.statusCode), Long.valueOf(this.dnsTime), Long.valueOf(this.connectTime), Long.valueOf(this.tlsTime), Long.valueOf(this.sendTime), Long.valueOf(this.waitTime), Long.valueOf(this.receiveTime), Long.valueOf(this.totalTime), Long.valueOf(this.totalSendBytes), Long.valueOf(this.totalReceiveBytes), Long.valueOf(this.requestStartTs), this.remoteIp, Boolean.valueOf(this.socketReuse)});
        }

        private void parseHeader(String str) {
            if (TextUtils.isEmpty(str)) {
                AVMDLLog.d("MIO_IMG", "headerJsonStr is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    this.respHeaders.put(next, jSONObject.optString(next));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVMDLLog.d("MIO_IMG", e.toString());
            }
        }

        public void parse(String str) {
            if (TextUtils.isEmpty(str)) {
                AVMDLLog.d("MIO_IMG", "detailJsonStr is empty");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.retryCount = jSONObject.optInt("retry_cnt", -1);
                this.url = jSONObject.optString("url");
                this.statusCode = jSONObject.optInt("status_code", -1);
                parseHeader(jSONObject.optString("resp_headers"));
                this.dnsTime = jSONObject.optLong("dns_time", -1L);
                this.connectTime = jSONObject.optLong("conn_time", -1L);
                this.tlsTime = jSONObject.optLong("tls_time", -1L);
                this.sendTime = jSONObject.optLong("send_time", -1L);
                this.waitTime = jSONObject.optLong("wait_time", -1L);
                this.receiveTime = jSONObject.optLong("recv_time", -1L);
                this.totalTime = jSONObject.optLong("total_time", -1L);
                this.totalSendBytes = jSONObject.optLong("total_send_bytes", -1L);
                this.totalReceiveBytes = jSONObject.optLong("total_recv_bytes", -1L);
                this.requestStartTs = jSONObject.optLong("req_start_ts", 0L);
                this.remoteIp = jSONObject.optString("remote_ep");
                boolean z = true;
                if (jSONObject.optInt("sock_reuse") != 1) {
                    z = false;
                }
                this.socketReuse = z;
                try {
                    String strOptString = jSONObject.optString("req_log");
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.extraInfo = new JSONObject(strOptString);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVMDLLog.d("MIO_IMG", e.toString());
                    return;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                AVMDLLog.d("MIO_IMG", e2.toString());
            }
            TryCatchGuardChecker.doCheck(e2);
            AVMDLLog.d("MIO_IMG", e2.toString());
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean isSuccess() {
        return this.code == 0;
    }

    public int code() {
        return this.code;
    }

    public byte[] data() {
        return this.data;
    }

    public String desc() {
        return this.desc;
    }

    public ResponseDetail detail() {
        return this.detail;
    }

    public long length() {
        return this.length;
    }

    public InputStream stream() {
        return this.stream;
    }

    public MIOImageResponse(Builder builder) {
        this.code = builder.code;
        this.desc = builder.desc;
        this.data = builder.data;
        this.detail = builder.detail;
        this.stream = builder.stream;
        this.length = builder.length;
    }
}
