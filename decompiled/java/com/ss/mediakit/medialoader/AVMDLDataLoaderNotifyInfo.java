package com.ss.mediakit.medialoader;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class AVMDLDataLoaderNotifyInfo {
    public long code;
    public byte[] data;
    public JSONObject jsonLog;
    public String logExtraJsonStr;
    public String logInfo;
    public String logType;
    public long parameter;
    public String strParam;
    public int what;

    public void logToJson() {
        if (this.logInfo == null) {
            return;
        }
        this.jsonLog = null;
        try {
            this.jsonLog = new JSONObject(this.logInfo);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.jsonLog = null;
        }
    }

    public AVMDLDataLoaderNotifyInfo() {
        this.what = -1;
        this.code = -1L;
        this.parameter = -1L;
    }

    public void logToJson(int i) {
        if (this.logInfo == null) {
            return;
        }
        this.jsonLog = null;
        if (i == 1006 || i == 1007) {
            try {
                JSONObject jSONObject = new JSONObject();
                this.jsonLog = jSONObject;
                jSONObject.put("native_log", this.logInfo);
                this.jsonLog.put("log_type", this.logType);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.jsonLog = null;
            }
        }
    }

    public AVMDLDataLoaderNotifyInfo(int i, int i2, String str) {
        this.what = i;
        this.code = i2;
        this.parameter = -1L;
        this.logInfo = str;
    }
}
