package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public final class CommonLogParams implements Serializable {

    @C09CT("adLog")
    public final Map<String, Object> adLog;

    @C09CT("baseLog")
    public final Map<String, Object> baseLog;

    @C09CT("btmLog")
    public final Map<String, Object> btmLog;

    @C09CT("cardLog")
    public final Map<String, Object> cardLog;

    public CommonLogParams() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public CommonLogParams(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, Map<String, ? extends Object> map3, Map<String, ? extends Object> map4) {
        this.baseLog = map;
        this.cardLog = map2;
        this.adLog = map3;
        this.btmLog = map4;
    }
}
