package com.bytedance.globalpayment.iap.model;

import X.C1794240wn8;
import X.C1795210woh;
import X.InterfaceC1795200wog;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class TokenInfo {

    @JsonName("amount_value")
    public String amountValue;

    @JsonName("channel_order_id")
    public String channelOrderId;

    @JsonName("channel_user_id")
    public String channelUserId;

    @JsonName("currency")
    public String currency;
    public boolean isSubscription;

    @JsonName("order_id")
    public String orderId;

    @JsonName("payment_method")
    public String paymentMethod;

    @JsonName("product_id")
    public String productId;

    @JsonName("token")
    public String token;

    @JsonName("merchant_user_id")
    public String userId;

    public JSONObject toPayJson() throws JSONException {
        InterfaceC1795200wog interfaceC1795200wog;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("order_id", this.orderId);
        jSONObject.put("product_id", this.productId);
        if (TextUtils.isEmpty(this.userId) && (interfaceC1795200wog = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LIZLLL) != null) {
            this.userId = interfaceC1795200wog.getCurUserId();
        }
        jSONObject.put("merchant_user_id", this.userId);
        jSONObject.put("payment_method", this.paymentMethod);
        jSONObject.put("token", this.token);
        jSONObject.put("amount_value", this.amountValue);
        jSONObject.put("currency", this.currency);
        jSONObject.put("channel_order_id", this.channelOrderId);
        jSONObject.put("channel_user_id", this.channelUserId);
        return jSONObject;
    }

    public JSONObject toJson() {
        return toPayJson();
    }

    public String getAmountValue() {
        return this.amountValue;
    }

    public String getChannelOrderId() {
        return this.channelOrderId;
    }

    public String getChannelUserId() {
        return this.channelUserId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getToken() {
        return this.token;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isSubscription() {
        return this.isSubscription;
    }

    public TokenInfo setAmountValue(String str) {
        this.amountValue = str;
        return this;
    }

    public TokenInfo setChannelOrderId(String str) {
        this.channelOrderId = str;
        return this;
    }

    public TokenInfo setChannelUserId(String str) {
        this.channelUserId = str;
        return this;
    }

    public TokenInfo setCurrency(String str) {
        this.currency = str;
        return this;
    }

    public TokenInfo setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public TokenInfo setPaymentMethod(String str) {
        this.paymentMethod = str;
        return this;
    }

    public TokenInfo setProductId(String str) {
        this.productId = str;
        return this;
    }

    public TokenInfo setSubscription(boolean z) {
        this.isSubscription = z;
        return this;
    }

    public TokenInfo setToken(String str) {
        this.token = str;
        return this;
    }

    public TokenInfo setUserId(String str) {
        this.userId = str;
        return this;
    }
}
