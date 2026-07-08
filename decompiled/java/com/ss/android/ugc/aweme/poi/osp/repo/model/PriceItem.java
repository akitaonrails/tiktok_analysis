package com.ss.android.ugc.aweme.poi.osp.repo.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PriceItem implements Serializable {

    @C09CT("currency_symbol")
    public final String currencySymbol;

    @C09CT("dialog_info")
    public final DialogContent dialogInfo;

    @C09CT("estimated_taxes_modal")
    public final DialogContent estimatedTaxesModal;

    @C09CT("is_discount")
    public final Boolean isDiscount;

    @C09CT("key")
    public final String key;

    @C09CT("name")
    public final String name;

    @C09CT("original_price")
    public final String originalPrice;

    @C09CT("original_price_amount")
    public final String originalPriceAmount;

    @C09CT("price")
    public final String price;

    @C09CT("price_amount")
    public final String priceAmount;

    @C09CT("tax_amount_desc")
    public final String taxAmountDesc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceItem)) {
            return false;
        }
        PriceItem priceItem = (PriceItem) obj;
        return Intrinsics.LJFF(this.key, priceItem.key) && Intrinsics.LJFF(this.name, priceItem.name) && Intrinsics.LJFF(this.price, priceItem.price) && Intrinsics.LJFF(this.currencySymbol, priceItem.currencySymbol) && Intrinsics.LJFF(this.priceAmount, priceItem.priceAmount) && Intrinsics.LJFF(this.dialogInfo, priceItem.dialogInfo) && Intrinsics.LJFF(this.originalPrice, priceItem.originalPrice) && Intrinsics.LJFF(this.originalPriceAmount, priceItem.originalPriceAmount) && Intrinsics.LJFF(this.isDiscount, priceItem.isDiscount) && Intrinsics.LJFF(this.taxAmountDesc, priceItem.taxAmountDesc) && Intrinsics.LJFF(this.estimatedTaxesModal, priceItem.estimatedTaxesModal);
    }

    public final Boolean isDiscount() {
        return this.isDiscount;
    }

    public PriceItem(String str, String str2, String str3, String str4, String str5, DialogContent dialogContent, String str6, String str7, Boolean bool, String str8, DialogContent dialogContent2) {
        this.key = str;
        this.name = str2;
        this.price = str3;
        this.currencySymbol = str4;
        this.priceAmount = str5;
        this.dialogInfo = dialogContent;
        this.originalPrice = str6;
        this.originalPriceAmount = str7;
        this.isDiscount = bool;
        this.taxAmountDesc = str8;
        this.estimatedTaxesModal = dialogContent2;
    }
}
