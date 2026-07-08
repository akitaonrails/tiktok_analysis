package com.ss.android.ugc.aweme.components.purchasebutton;

import X.C09CT;
import com.ss.android.ugc.aweme.behavior.popup.OnclickParams;
import com.ss.android.ugc.aweme.components.purchaseoption.PricePacket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class PurchaseButtonParams {

    @C09CT("above_button_html_text_onclick")
    public final OnclickParams aboveButtonOnclick;

    @C09CT("above_button_html_text")
    public final String aboveButtonText;

    @C09CT("below_button_html_text")
    public final String belowButtonText;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("discounted_price")
    public final PricePacket discountedPrice;

    @C09CT("original_price")
    public final PricePacket originalPrice;

    public PurchaseButtonParams() {
        this("", null, "", null, null, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseButtonParams)) {
            return false;
        }
        PurchaseButtonParams purchaseButtonParams = (PurchaseButtonParams) obj;
        return Intrinsics.LJFF(this.aboveButtonText, purchaseButtonParams.aboveButtonText) && Intrinsics.LJFF(this.aboveButtonOnclick, purchaseButtonParams.aboveButtonOnclick) && Intrinsics.LJFF(this.buttonText, purchaseButtonParams.buttonText) && Intrinsics.LJFF(this.originalPrice, purchaseButtonParams.originalPrice) && Intrinsics.LJFF(this.discountedPrice, purchaseButtonParams.discountedPrice) && Intrinsics.LJFF(this.belowButtonText, purchaseButtonParams.belowButtonText);
    }

    public PurchaseButtonParams(String str, OnclickParams onclickParams, String str2, PricePacket pricePacket, PricePacket pricePacket2, String str3) {
        this.aboveButtonText = str;
        this.aboveButtonOnclick = onclickParams;
        this.buttonText = str2;
        this.originalPrice = pricePacket;
        this.discountedPrice = pricePacket2;
        this.belowButtonText = str3;
    }
}
