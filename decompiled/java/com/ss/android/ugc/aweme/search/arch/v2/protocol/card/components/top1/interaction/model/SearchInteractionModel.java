package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.interaction.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class SearchInteractionModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("like_status")
    public final int likeStatus;

    public SearchInteractionModel() {
        this(0);
    }

    public SearchInteractionModel(int i) {
        this.likeStatus = i;
    }
}
