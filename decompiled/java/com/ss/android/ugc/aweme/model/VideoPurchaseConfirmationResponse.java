package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class VideoPurchaseConfirmationResponse {

    @C09CT("first_unpurchased_seq_id")
    public final Integer firstUnpurchasedSeqId;

    @C09CT("has_confirmed_purchase")
    public final boolean hasConfirmedPurchase;

    @C09CT("preselect_index")
    public final Integer preselectIndex;

    @C09CT("purchase_options")
    public final List<PurchaseOption> purchaseOptions;

    @C09CT("item_ids")
    public final List<Long> videoIds;

    public VideoPurchaseConfirmationResponse() {
        this(false, null, null, null, null);
    }

    public VideoPurchaseConfirmationResponse(boolean z, List<Long> list, List<PurchaseOption> list2, Integer num, Integer num2) {
        this.hasConfirmedPurchase = z;
        this.videoIds = list;
        this.purchaseOptions = list2;
        this.firstUnpurchasedSeqId = num;
        this.preselectIndex = num2;
    }
}
