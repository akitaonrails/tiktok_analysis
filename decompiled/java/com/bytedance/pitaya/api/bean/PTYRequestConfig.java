package com.bytedance.pitaya.api.bean;

import X.C786410Ut5;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class PTYRequestConfig implements ReflectionCall {
    public final boolean download;
    public final String filterStr;

    public PTYRequestConfig() {
        this(false, null);
    }

    public final boolean getDownload() {
        return this.download;
    }

    public PTYRequestConfig(boolean z, JSONObject jSONObject) {
        String strJ3;
        this.download = z;
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = null;
        }
        this.filterStr = strJ3;
    }
}
