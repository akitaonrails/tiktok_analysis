package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MiniDramaFeedCardRequest implements Serializable {

    @C09CT("attribute_info")
    public final String attributeInfo;

    @C09CT("card_type")
    public final String cardType;

    @C09CT("request_num")
    public final Integer requestNum;

    public MiniDramaFeedCardRequest() {
        this(null, null, null);
    }

    public MiniDramaFeedCardRequest(String str, String str2, Integer num) {
        this.cardType = str;
        this.attributeInfo = str2;
        this.requestNum = num;
    }
}
