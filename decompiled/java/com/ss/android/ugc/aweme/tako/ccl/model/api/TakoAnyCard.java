package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoAnyCard {

    @C09CT("category")
    public final Integer category;

    @C09CT("height")
    public Integer height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("msg_trace_params")
    public final String msgTraceParams;

    @C09CT("raw_data")
    public final String rawData;

    @C09CT("schema")
    public final String schema;

    @C09CT("type")
    public final Integer sourceType;

    public TakoAnyCard() {
        this("", null, null, null, null, null, null);
    }

    public TakoAnyCard(String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3) {
        this.id = str;
        this.sourceType = num;
        this.schema = str2;
        this.rawData = str3;
        this.category = num2;
        this.msgTraceParams = str4;
        this.height = num3;
    }
}
