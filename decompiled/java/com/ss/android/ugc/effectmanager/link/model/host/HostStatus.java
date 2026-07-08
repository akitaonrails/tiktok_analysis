package com.ss.android.ugc.effectmanager.link.model.host;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes.dex */
public class HostStatus {
    public long duration;
    public Exception exception;
    public Host host;
    public boolean isSuccess;
    public long sendTime;
    public int status;
    public String traceCode;
    public String url;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HostStatus{url='");
        sbLIZ.append(this.url);
        sbLIZ.append('\'');
        sbLIZ.append(", host=");
        sbLIZ.append(this.host.toString());
        sbLIZ.append(", status=");
        sbLIZ.append(this.status);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", sendTime=");
        sbLIZ.append(this.sendTime);
        sbLIZ.append(", traceCode='");
        sbLIZ.append(this.traceCode);
        sbLIZ.append('\'');
        sbLIZ.append(", exception=");
        sbLIZ.append(this.exception);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.isSuccess);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public long getDuration() {
        return this.duration;
    }

    public Exception getException() {
        return this.exception;
    }

    public Host getHost() {
        return this.host;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTraceCode() {
        return this.traceCode;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isSuccess() {
        return this.isSuccess;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setException(Exception exc) {
        this.exception = exc;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void setSendTime(long j) {
        this.sendTime = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSuccess(boolean z) {
        this.isSuccess = z;
    }

    public void setTraceCode(String str) {
        this.traceCode = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public HostStatus(String str, Host host, int i, long j, long j2, String str2, Exception exc, boolean z) {
        this.url = str;
        this.host = host;
        this.status = i;
        this.duration = j;
        this.sendTime = j2;
        this.traceCode = str2;
        this.exception = exc;
        this.isSuccess = z;
    }
}
