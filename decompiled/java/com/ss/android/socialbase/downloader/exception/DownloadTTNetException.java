package com.ss.android.socialbase.downloader.exception;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class DownloadTTNetException extends BaseException {
    public String remoteIp;

    public void parseRemoteIp() {
        String str = this.remoteIp;
        if ((str == null || "0:".equals(str)) && !TextUtils.isEmpty(getRequestLog())) {
            try {
                String strOptString = JSONObjectProtectorUtils.getJSONObject(new JSONObject(getRequestLog()), "socket").optString("remote");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                this.remoteIp = strOptString;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public String getRequestLog() {
        return getExtraInfo();
    }

    public String getRemoteIp() {
        return this.remoteIp;
    }

    public void setRemoteIp(String str) {
        this.remoteIp = str;
    }

    public DownloadTTNetException setRequestLog(String str) {
        setExtraInfo(str);
        return this;
    }

    public DownloadTTNetException(int i, String str) {
        super(i, str);
    }

    public DownloadTTNetException(int i, Throwable th) {
        super(i, th);
    }
}
