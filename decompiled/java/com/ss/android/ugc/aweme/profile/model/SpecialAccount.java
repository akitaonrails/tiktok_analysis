package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class SpecialAccount implements Serializable {

    @C09CT("tt_seller")
    public final TTSeller seller;

    public final TTSeller getSeller() {
        return this.seller;
    }

    public SpecialAccount(TTSeller tTSeller) {
        this.seller = tTSeller;
    }
}
