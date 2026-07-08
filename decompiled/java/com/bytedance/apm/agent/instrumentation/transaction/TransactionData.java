package com.bytedance.apm.agent.instrumentation.transaction;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class TransactionData {
    public long bytesReceived;
    public long bytesSent;
    public String carrier;
    public int errorCode;
    public JSONObject extraData;
    public String httpMethod;
    public long requestEnd;
    public int statusCode;
    public long totalTime;
    public String url;
    public String wanType;
    public long requestStart = System.currentTimeMillis();
    public Object lock = new Object();

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransactionData{requestStart=");
        sbLIZ.append(this.requestStart);
        sbLIZ.append(", url='");
        sbLIZ.append(this.url);
        sbLIZ.append('\'');
        sbLIZ.append(", carrier='");
        sbLIZ.append(this.carrier);
        sbLIZ.append('\'');
        sbLIZ.append(", totalTime=");
        sbLIZ.append(this.totalTime);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.statusCode);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.errorCode);
        sbLIZ.append(", bytesSent=");
        sbLIZ.append(this.bytesSent);
        sbLIZ.append(", bytesReceived=");
        sbLIZ.append(this.bytesReceived);
        sbLIZ.append(", wanType='");
        sbLIZ.append(this.wanType);
        sbLIZ.append('\'');
        sbLIZ.append(", httpMethod='");
        sbLIZ.append(this.httpMethod);
        sbLIZ.append('\'');
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.extraData);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getBytesReceived() {
        return this.bytesReceived;
    }

    public long getBytesSent() {
        return this.bytesSent;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public JSONObject getExtraData() {
        return this.extraData;
    }

    public String getHttpMethod() {
        return this.httpMethod;
    }

    public long getRequestEnd() {
        return this.requestEnd;
    }

    public long getRequestStart() {
        return this.requestStart;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWanType() {
        return this.wanType;
    }

    public void setErrorCode(int i) {
        synchronized (this.lock) {
            try {
                this.errorCode = i;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setRequestEnd(long j) {
        this.requestEnd = j;
    }

    public TransactionData(String str, String str2, long j, int i, int i2, long j2, long j3, String str3, String str4, JSONObject jSONObject) {
        this.url = str;
        this.carrier = str2;
        this.totalTime = j;
        this.statusCode = i;
        this.errorCode = i2;
        this.bytesSent = j2;
        this.bytesReceived = j3;
        this.wanType = str3;
        this.httpMethod = str4;
        this.extraData = jSONObject;
    }
}
