package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public final class HighlightTag implements Serializable {
    public static final int $stable = 0;

    @C09CT("text")
    public final String text;

    @C09CT("type")
    public final Integer type;

    public HighlightTag(String str, Integer num) {
        this.text = str;
        this.type = num;
    }
}
