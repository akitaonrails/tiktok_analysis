package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentElement implements Serializable {
    public static final int $stable = 8;

    @C09CT("element")
    public final String element;

    @C09CT("is_encrypted")
    public final Boolean isEncrypted;

    @C09CT("need_encryption")
    public final Boolean needEncryption;

    @C09CT("param_name")
    public final String paramName;

    @C09CT("param_value")
    public String paramValue;

    public PaymentElement() {
        this(null, null, null, null, Boolean.FALSE);
    }

    public final PaymentElement copy(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        return new PaymentElement(str, str2, str3, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentElement)) {
            return false;
        }
        PaymentElement paymentElement = (PaymentElement) obj;
        return Intrinsics.LJFF(this.element, paymentElement.element) && Intrinsics.LJFF(this.paramName, paymentElement.paramName) && Intrinsics.LJFF(this.paramValue, paymentElement.paramValue) && Intrinsics.LJFF(this.needEncryption, paymentElement.needEncryption) && Intrinsics.LJFF(this.isEncrypted, paymentElement.isEncrypted);
    }

    public int hashCode() {
        String str = this.element;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paramName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramValue;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.needEncryption;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEncrypted;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean isEncrypted() {
        return this.isEncrypted;
    }

    public final void setParamValue(String str) {
        this.paramValue = str;
    }

    public PaymentElement(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
        this.needEncryption = bool;
        this.isEncrypted = bool2;
    }
}
