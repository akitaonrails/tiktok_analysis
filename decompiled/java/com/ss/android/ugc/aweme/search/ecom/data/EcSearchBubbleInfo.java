package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchBubbleInfo implements Serializable {

    @C09CT("bubble_icon")
    public final UrlStruct bubbleIcon;

    @C09CT("bubble_text")
    public final String bubbleText;

    @C09CT("bubble_time")
    public final Integer bubbleTime;

    public EcSearchBubbleInfo() {
        this(null, null, null);
    }

    public EcSearchBubbleInfo(String str, UrlStruct urlStruct, Integer num) {
        this.bubbleText = str;
        this.bubbleIcon = urlStruct;
        this.bubbleTime = num;
    }
}
