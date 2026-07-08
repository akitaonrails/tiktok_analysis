package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtraLastState implements Serializable {

    @C09CT("async_req_time")
    public final Long async_req_time;

    @C09CT("state")
    public final Integer state;

    public ExtraLastState() {
        this(null, null);
    }

    public final Long getAsync_req_time() {
        return this.async_req_time;
    }

    public final Integer getState() {
        return this.state;
    }

    public ExtraLastState(Long l, Integer num) {
        this.async_req_time = l;
        this.state = num;
    }
}
