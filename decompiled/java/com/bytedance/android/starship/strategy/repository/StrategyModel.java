package com.bytedance.android.starship.strategy.repository;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class StrategyModel implements Serializable {

    @C09CT("error_code")
    public final int errorCode;

    @C09CT("is_meta")
    public final boolean isMeta;

    @C09CT("log_id")
    public String logId;

    @C09CT("nodes")
    public final List<String> nodes;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("update_trace_id")
    public String updateTraceId;

    @C09CT("version")
    public final String version;

    public StrategyModel() {
        this(null, null, 0, 0, false);
    }

    public final boolean isMeta() {
        return this.isMeta;
    }

    public final void setLogId(String str) {
        this.logId = str;
    }

    public final void setUpdateTraceId(String str) {
        this.updateTraceId = str;
    }

    public StrategyModel(String str, List<String> list, int i, int i2, boolean z) {
        this.version = str;
        this.nodes = list;
        this.status = i;
        this.errorCode = i2;
        this.isMeta = z;
    }
}
