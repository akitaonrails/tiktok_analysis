package com.ss.android.ugc.aweme.purchasepanel.service;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PurchasePanelResponse extends BaseResponse {

    @C09CT("purchase_panel")
    public final PurchasePanelParams purchasePanel;

    public PurchasePanelResponse() {
        this(new PurchasePanelParams(null, null, 3, null));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchasePanelResponse) && Intrinsics.LJFF(this.purchasePanel, ((PurchasePanelResponse) obj).purchasePanel);
    }

    public final int hashCode() {
        return this.purchasePanel.hashCode();
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchasePanelResponse(purchasePanel=");
        sbLIZ.append(this.purchasePanel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PurchasePanelResponse(PurchasePanelParams purchasePanelParams) {
        this.purchasePanel = purchasePanelParams;
    }
}
