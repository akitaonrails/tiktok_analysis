package com.ss.android.ugc.aweme.pns.consent.core.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class ConsentRecordRequestBody implements Serializable {

    @C09CT("flow")
    public final String businessFlow;

    @C09CT("coll_point_id")
    public final String collectionPointId;

    @C09CT("entity_key")
    public final String entityKey;

    @C09CT("extra")
    public final String extra;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    public ConsentRecordRequestBody() {
        this("", 0, null, "", null);
    }

    public ConsentRecordRequestBody(String str, int i, String str2, String str3, String str4) {
        this.businessFlow = str;
        this.status = i;
        this.entityKey = str2;
        this.collectionPointId = str3;
        this.extra = str4;
    }
}
