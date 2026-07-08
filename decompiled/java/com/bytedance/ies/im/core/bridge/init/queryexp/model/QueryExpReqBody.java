package com.bytedance.ies.im.core.bridge.init.queryexp.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class QueryExpReqBody {

    @C09CT("feature_keys")
    public final List<String> featureKeyList;

    @C09CT("source")
    public final Integer source;

    @C09CT("query_type")
    public final Integer type;

    @C09CT("user_ids")
    public final List<Long> uidList;

    public QueryExpReqBody() {
        this(null, null, null, null);
    }

    public QueryExpReqBody(Integer num, List<Long> list, List<String> list2, Integer num2) {
        this.type = num;
        this.uidList = list;
        this.featureKeyList = list2;
        this.source = num2;
    }
}
