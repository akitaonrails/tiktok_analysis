package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class ExtraData implements Serializable {

    @C09CT("cardId")
    public final String cardId;

    public ExtraData() {
        this(null);
    }

    public ExtraData(String str) {
        this.cardId = str;
    }
}
