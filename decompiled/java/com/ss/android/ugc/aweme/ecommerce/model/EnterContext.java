package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class EnterContext implements Serializable {

    @C09CT("enter_source_id")
    public final String enterSourceId;

    @C09CT("req_type")
    public final Integer reqType;

    public EnterContext(Integer num, String str) {
        this.reqType = num;
        this.enterSourceId = str;
    }
}
