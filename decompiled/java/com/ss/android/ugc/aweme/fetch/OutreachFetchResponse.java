package com.ss.android.ugc.aweme.fetch;

import X.C09CT;
import com.google.gson.n;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class OutreachFetchResponse implements Serializable {

    @C09CT("outreach_biz_resp")
    public Map<String, n> bizResp;

    @C09CT("extra")
    public OutreachExtra extra;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_msg")
    public String statusMsg;

    @C09CT("outreach_switch_map")
    public Map<String, String> switchMap;

    public OutreachFetchResponse() {
        this(null, null, null, null, null);
    }

    public final boolean available() {
        return true;
    }

    public final void setBizResp(Map<String, n> map) {
        this.bizResp = map;
    }

    public final void setExtra(OutreachExtra outreachExtra) {
        this.extra = outreachExtra;
    }

    public final void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public final void setSwitchMap(Map<String, String> map) {
        this.switchMap = map;
    }

    public OutreachFetchResponse(OutreachExtra outreachExtra, Integer num, String str, Map<String, String> map, Map<String, n> map2) {
        this.extra = outreachExtra;
        this.statusCode = num;
        this.statusMsg = str;
        this.switchMap = map;
        this.bizResp = map2;
    }
}
