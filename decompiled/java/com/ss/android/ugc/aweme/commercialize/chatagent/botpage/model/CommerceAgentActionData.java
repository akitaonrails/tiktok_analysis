package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class CommerceAgentActionData implements Serializable {
    public static final int $stable = 0;

    @C09CT("buy_now")
    public final CommerceAgentBuyNowInfo buyNowInfo;

    public CommerceAgentActionData() {
        this(null);
    }

    public CommerceAgentActionData(CommerceAgentBuyNowInfo commerceAgentBuyNowInfo) {
        this.buyNowInfo = commerceAgentBuyNowInfo;
    }
}
