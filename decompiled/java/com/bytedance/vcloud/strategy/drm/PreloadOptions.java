package com.bytedance.vcloud.strategy.drm;

import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PreloadOptions {
    public boolean enablePreLicense;
    public int maxConcurrentRequests;
    public int maxPreloadCount;
    public int maxRetryCount;
    public int requestTimeoutMS;
    public int retryIntervalMS;

    public int hashCode() {
        return ((((((((((this.enablePreLicense ? 1 : 0) * 31) + this.maxPreloadCount) * 31) + this.requestTimeoutMS) * 31) + this.maxConcurrentRequests) * 31) + this.maxRetryCount) * 31) + this.retryIntervalMS;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadOptions{enablePreLicense=");
        sbLIZ.append(this.enablePreLicense);
        sbLIZ.append(", maxPreloadCount=");
        sbLIZ.append(this.maxPreloadCount);
        sbLIZ.append(", requestTimeoutMS=");
        sbLIZ.append(this.requestTimeoutMS);
        sbLIZ.append(", maxConcurrentRequests=");
        sbLIZ.append(this.maxConcurrentRequests);
        sbLIZ.append(", maxRetryCount=");
        sbLIZ.append(this.maxRetryCount);
        sbLIZ.append(", retryIntervalMS=");
        sbLIZ.append(this.retryIntervalMS);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PreloadOptions(boolean z) {
        this.enablePreLicense = z;
        this.maxPreloadCount = 16;
        this.requestTimeoutMS = 5000;
        this.maxConcurrentRequests = 3;
        this.maxRetryCount = 2;
        this.retryIntervalMS = 50;
    }

    public static PreloadOptions parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new PreloadOptions(jSONObject.optBoolean("enable_pre_license", false), jSONObject.optInt("max_preload_count", 16), jSONObject.optInt("request_timeout_ms", 5000), jSONObject.optInt("max_concurrent_requests", 3), jSONObject.optInt("max_retry_count", 2), jSONObject.optInt("retry_interval_ms", 50));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public boolean contentEquals(PreloadOptions preloadOptions) {
        if (preloadOptions == null) {
            return false;
        }
        if (preloadOptions == this) {
            return true;
        }
        if (this.enablePreLicense != preloadOptions.enablePreLicense || this.maxPreloadCount != preloadOptions.maxPreloadCount || this.requestTimeoutMS != preloadOptions.requestTimeoutMS || this.maxConcurrentRequests != preloadOptions.maxConcurrentRequests || this.maxRetryCount != preloadOptions.maxRetryCount || this.retryIntervalMS != preloadOptions.retryIntervalMS) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadOptions)) {
            return false;
        }
        return contentEquals((PreloadOptions) obj);
    }

    public PreloadOptions(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.enablePreLicense = z;
        this.maxPreloadCount = i <= 0 ? 16 : i;
        this.requestTimeoutMS = i2 <= 0 ? 5000 : i2;
        this.maxConcurrentRequests = i3 <= 0 ? 3 : i3;
        this.maxRetryCount = i4 < 0 ? 2 : i4;
        this.retryIntervalMS = i5 < 0 ? 50 : i5;
    }
}
