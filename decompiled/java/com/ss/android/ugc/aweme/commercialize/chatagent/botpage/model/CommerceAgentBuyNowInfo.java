package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentBuyNowInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("jump_model")
    public final String jumpModel;

    @C09CT("text")
    public final String text;

    public CommerceAgentBuyNowInfo() {
        this(null, null);
    }

    public CommerceAgentBuyNowInfo(String str, String str2) {
        this.text = str;
        this.jumpModel = str2;
    }
}
