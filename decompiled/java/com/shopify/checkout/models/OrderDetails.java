package com.shopify.checkout.models;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class OrderDetails {

    @C09CT("billingAddress")
    public final Address billingAddress;

    @C09CT("cart")
    public final CartInfo cart;

    @C09CT("deliveries")
    public final List<Object> deliveries;

    @C09CT("email")
    public final String email;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("paymentMethods")
    public final List<PaymentMethod> paymentMethods;

    @C09CT("phone")
    public final String phone;

    @C09CT("shippingAddress")
    public final Address shippingAddress;

    public static final class PaymentMethod {

        @C09CT("details")
        public final Map<String, String> paymentDetails;

        @C09CT("type")
        public final String paymentType;

        public PaymentMethod(String str, Map<String, String> map) {
            this.paymentType = str;
            this.paymentDetails = map;
        }
    }

    public OrderDetails(String str, String str2, String str3, CartInfo cartInfo, Address address, List<PaymentMethod> list, List<Object> list2, Address address2) {
        this.id = str;
        this.email = str2;
        this.phone = str3;
        this.cart = cartInfo;
        this.billingAddress = address;
        this.paymentMethods = list;
        this.deliveries = list2;
        this.shippingAddress = address2;
    }
}
