package com.heytap.mcssdk.liquid;

import com.heytap.mcs.liquid.model.ActionInfo;
import com.heytap.msp.push.callback.ILiquidDownloadCallback;

/* JADX INFO: loaded from: classes14.dex */
public class DownloadRequest {
    public ActionInfo action;
    public ILiquidDownloadCallback callback;
    public String desc;
    public int loadingType;
    public ActionInfo managerAction;
    public int percent;
    public String pkgName;
    public int status;
    public String token;
    public String traceId;

    public static final class Builder {
        public ActionInfo action;
        public ILiquidDownloadCallback callback;
        public String desc;
        public int loadingType;
        public ActionInfo managerAction;
        public int percent;
        public String pkgName;
        public int status;
        public String token;
        public String traceId;

        public Builder() {
        }

        public Builder action(ActionInfo actionInfo) {
            this.action = actionInfo;
            return this;
        }

        public DownloadRequest build() {
            return new DownloadRequest(this.loadingType, this.pkgName, this.traceId, this.token, this.status, this.desc, this.action, this.managerAction, this.percent, this.callback);
        }

        public Builder callback(ILiquidDownloadCallback iLiquidDownloadCallback) {
            this.callback = iLiquidDownloadCallback;
            return this;
        }

        public Builder desc(String str) {
            this.desc = str;
            return this;
        }

        public Builder loadingType(int i) {
            this.loadingType = i;
            return this;
        }

        public Builder managerAction(ActionInfo actionInfo) {
            this.managerAction = actionInfo;
            return this;
        }

        public Builder percent(int i) {
            this.percent = i;
            return this;
        }

        public Builder pkgName(String str) {
            this.pkgName = str;
            return this;
        }

        public Builder status(int i) {
            this.status = i;
            return this;
        }

        public Builder token(String str) {
            this.token = str;
            return this;
        }

        public Builder traceId(String str) {
            this.traceId = str;
            return this;
        }
    }

    public interface ErrorCode {
    }

    public DownloadRequest(int i, String str, String str2, String str3, int i2, String str4, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, ILiquidDownloadCallback iLiquidDownloadCallback) {
        this.loadingType = i;
        this.pkgName = str;
        this.traceId = str2;
        this.token = str3;
        this.status = i2;
        this.desc = str4;
        this.action = actionInfo;
        this.managerAction = actionInfo2;
        this.percent = i3;
        this.callback = iLiquidDownloadCallback;
    }

    public ActionInfo getAction() {
        return this.action;
    }

    public ILiquidDownloadCallback getCallback() {
        return this.callback;
    }

    public String getDesc() {
        return this.desc;
    }

    public int getLoadingType() {
        return this.loadingType;
    }

    public ActionInfo getManagerAction() {
        return this.managerAction;
    }

    public int getPercent() {
        return this.percent;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public int getStatus() {
        return this.status;
    }

    public String getToken() {
        return this.token;
    }

    public String getTraceId() {
        return this.traceId;
    }

    public void setAction(ActionInfo actionInfo) {
        this.action = actionInfo;
    }

    public void setCallback(ILiquidDownloadCallback iLiquidDownloadCallback) {
        this.callback = iLiquidDownloadCallback;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setLoadingType(int i) {
        this.loadingType = i;
    }

    public void setManagerAction(ActionInfo actionInfo) {
        this.managerAction = actionInfo;
    }

    public void setPercent(int i) {
        this.percent = i;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTraceId(String str) {
        this.traceId = str;
    }

    public String toString() {
        return "DownloadRequest{loadingType=" + this.loadingType + ", pkgName='" + this.pkgName + "', traceId='" + this.traceId + "', token='" + this.token + "', status=" + this.status + ", desc='" + this.desc + "', action=" + this.action + ", managerAction=" + this.managerAction + ", percent=" + this.percent + ", callback=" + this.callback + '}';
    }

    public static Builder builder() {
        return new Builder();
    }
}
