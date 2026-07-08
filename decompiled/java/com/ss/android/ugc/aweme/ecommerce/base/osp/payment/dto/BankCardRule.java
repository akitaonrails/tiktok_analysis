package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BankCardRule {

    @C09CT("card_brand")
    public String cardBrand;

    @C09CT("card_brand_display_name")
    public String cardBrandDisplayName;

    @C09CT("card_brand_length")
    public int[] cardBrandLength;

    @C09CT("card_brand_regex")
    public String cardBrandRegex;

    @C09CT("cvv_length")
    public int[] cvvLength;

    @C09CT("payment_method_id")
    public String paymentMethodId;

    public BankCardRule() {
    }

    public final int hashCode() {
        int[] iArr = this.cvvLength;
        int iHashCode = (iArr != null ? Arrays.hashCode(iArr) : 0) * 31;
        String str = this.cardBrandRegex;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        int[] iArr2 = this.cardBrandLength;
        int iHashCode3 = (iHashCode2 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        String str2 = this.cardBrandDisplayName;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cardBrand;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.paymentMethodId;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(BankCardRule.class, cls)) {
            return false;
        }
        BankCardRule bankCardRule = (BankCardRule) obj;
        int[] iArr = this.cvvLength;
        if (iArr != null) {
            int[] iArr2 = bankCardRule.cvvLength;
            if (iArr2 == null || !Arrays.equals(iArr, iArr2)) {
                return false;
            }
        } else if (bankCardRule.cvvLength != null) {
            return false;
        }
        if (!Intrinsics.LJFF(this.cardBrandRegex, bankCardRule.cardBrandRegex)) {
            return false;
        }
        int[] iArr3 = this.cardBrandLength;
        if (iArr3 != null) {
            int[] iArr4 = bankCardRule.cardBrandLength;
            if (iArr4 == null || !Arrays.equals(iArr3, iArr4)) {
                return false;
            }
        } else if (bankCardRule.cardBrandLength != null) {
            return false;
        }
        if (Intrinsics.LJFF(this.cardBrandDisplayName, bankCardRule.cardBrandDisplayName) && Intrinsics.LJFF(this.cardBrand, bankCardRule.cardBrand) && Intrinsics.LJFF(this.paymentMethodId, bankCardRule.paymentMethodId)) {
            return true;
        }
        return false;
    }

    public BankCardRule(int[] iArr, String str, int[] iArr2, String str2, String str3, String str4) {
        this.cvvLength = iArr;
        this.cardBrandRegex = str;
        this.cardBrandLength = iArr2;
        this.cardBrandDisplayName = str2;
        this.cardBrand = str3;
        this.paymentMethodId = str4;
    }
}
