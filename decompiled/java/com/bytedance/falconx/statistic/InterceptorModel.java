package com.bytedance.falconx.statistic;

import X.C09CT;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes31.dex */
public class InterceptorModel {

    @C09CT("ac")
    public String ac;

    @C09CT("access_key")
    public String accessKey;

    @C09CT("channel")
    public String channel;

    @C09CT("err_code")
    public String errCode;

    @C09CT("err_msg")
    public String errMsg;
    public boolean isCombo;

    @C09CT("log_id")
    public String logId;

    @C09CT("mime_type")
    public String mimeType;

    @C09CT("offline_duration")
    public Long offlineDuration;

    @C09CT("offline_rule")
    public String offlineRule;

    @C09CT("offline_status")
    public Integer offlineStatus;

    @C09CT("online_duration")
    public Long onlineDuration;

    @C09CT("page_url")
    public String pageUrl;

    @C09CT("pkg_version")
    public Long pkgVersion;

    @C09CT("res_root_dir")
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());

    @C09CT("resource_url")
    public String url;

    public long getVersion() {
        Long l = this.pkgVersion;
        if (l == null) {
            return -1L;
        }
        return l.longValue();
    }

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = Long.valueOf(SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = 1;
        } else {
            this.offlineStatus = 0;
        }
    }

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }
}
