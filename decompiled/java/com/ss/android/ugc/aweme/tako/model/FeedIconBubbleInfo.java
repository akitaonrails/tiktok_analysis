package com.ss.android.ugc.aweme.tako.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class FeedIconBubbleInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("bubble_content")
    public final String bubbleContent;

    @C09CT("bubble_impr_id")
    public final String bubbleImprId;

    @C09CT("words_content")
    public final String wordsContent;

    public FeedIconBubbleInfo() {
        this(null, null, null);
    }

    public FeedIconBubbleInfo(String str, String str2, String str3) {
        this.bubbleContent = str;
        this.wordsContent = str2;
        this.bubbleImprId = str3;
    }
}
