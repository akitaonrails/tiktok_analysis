package com.shopify.checkout.models.errors;

import X.AnonymousClass0520;
import X.C08FF;
import X.C2097908Jt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public enum CheckoutErrorType {
    INVENTORY("inventory"),
    PAYMENT("payment"),
    OTHER("other"),
    DISCOUNT("discount"),
    ORDER("order"),
    CUSTOMERPERSISTENCE("customer_persistence"),
    CHECKOUTBLOCKING("checkout_blocking");

    public static final AnonymousClass0520 Companion = new Object() { // from class: X.0520
    };
    public static final Map<String, CheckoutErrorType> map;
    public final String LL;

    public static CheckoutErrorType valueOf(String str) {
        return (CheckoutErrorType) C08FF.LIZ(CheckoutErrorType.class, str);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0520] */
    static {
        CheckoutErrorType[] checkoutErrorTypeArrValues = values();
        int iLIZIZ = C2097908Jt.LIZIZ(checkoutErrorTypeArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ < 16 ? 16 : iLIZIZ);
        for (CheckoutErrorType checkoutErrorType : checkoutErrorTypeArrValues) {
            linkedHashMap.put(checkoutErrorType.LL, checkoutErrorType);
        }
        map = linkedHashMap;
    }

    public final String getValue() {
        return this.LL;
    }

    CheckoutErrorType(String str) {
        this.LL = str;
    }
}
