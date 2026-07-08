package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.highlights.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class HighlightNewUserGuideText implements Serializable {
    public static final int $stable = 0;

    @C09CT("common_text")
    public final String commonText;

    @C09CT("mark_text")
    public final String markText;

    public HighlightNewUserGuideText(String str, String str2) {
        this.markText = str;
        this.commonText = str2;
    }
}
