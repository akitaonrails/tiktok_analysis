package com.ss.android.ugc.aweme.im.streak.impl.pet.exp;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class QueryExpReqBody {

    @C09CT("conversation_ids")
    public final List<String> conversationList;

    @C09CT("feature_keys")
    public final List<String> featureKeyList;

    @C09CT("source")
    public final Integer source;

    @C09CT("query_type")
    public final int type;

    @C09CT("user_ids")
    public final List<Long> uidList;

    public QueryExpReqBody() {
        this(0, null, null, null, null, 31, null);
    }

    public QueryExpReqBody(int i, List<Long> list, List<String> list2, Integer num, List<String> list3) {
        this.type = i;
        this.uidList = list;
        this.featureKeyList = list2;
        this.source = num;
        this.conversationList = list3;
    }

    public QueryExpReqBody(int i, List list, List list2, Integer num, List list3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? C13BV.INSTANCE : list3);
    }
}
