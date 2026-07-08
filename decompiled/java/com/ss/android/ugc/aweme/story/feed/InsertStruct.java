package com.ss.android.ugc.aweme.story.feed;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public final class InsertStruct implements Serializable {
    public static final int $stable = 0;

    @C09CT("card_type")
    public final int cardType;

    public InsertStruct() {
        this(0);
    }

    public InsertStruct(int i) {
        this.cardType = i;
    }
}
