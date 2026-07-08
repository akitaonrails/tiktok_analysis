package com.ss.android.ugc.aweme.im.b2c.landing;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdFirstInteractReqBodyV2 {

    @C09CT("biz_id")
    public final String businessId;

    @C09CT("landing_messages")
    public final List<BusinessAutoMessage> landingMsgList;

    @C09CT("source")
    public final int source;

    @C09CT("biz_uid")
    public final long uid;

    public AdFirstInteractReqBodyV2(long j, int i, String str, List<BusinessAutoMessage> list) {
        this.uid = j;
        this.source = i;
        this.businessId = str;
        this.landingMsgList = list;
    }
}
