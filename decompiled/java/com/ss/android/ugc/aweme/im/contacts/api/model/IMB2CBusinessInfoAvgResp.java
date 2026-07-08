package com.ss.android.ugc.aweme.im.contacts.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class IMB2CBusinessInfoAvgResp {

    @C09CT("avg_resp_string")
    public final String avgRespStr;

    @C09CT("avg_resp_time")
    public final Long avgRespTime;

    @C09CT("update_time")
    public final Long updateTime;

    public IMB2CBusinessInfoAvgResp() {
        this(null, null, null);
    }

    public IMB2CBusinessInfoAvgResp(Long l, String str, Long l2) {
        this.avgRespTime = l;
        this.avgRespStr = str;
        this.updateTime = l2;
    }
}
