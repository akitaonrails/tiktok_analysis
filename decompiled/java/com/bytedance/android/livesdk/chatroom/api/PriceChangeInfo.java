package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class PriceChangeInfo {

    @C09CT("billing_type")
    public int billingType;

    @C09CT("days_left_to_agree_change")
    public long daysLeftToAgreeChange;

    @C09CT("is_consent_required")
    public boolean isConsentRequired;

    @C09CT("is_first_entrance")
    public boolean isFirstEntrance;

    @C09CT("is_price_changed")
    public boolean isPriceChanged;

    @C09CT("next_billing_date")
    public long nextBillingDate;

    @C09CT("no_confirm_cancel_contract_date")
    public long noConfirmCancelContractDate;

    @C09CT("new_price")
    public String newPrice = "";

    @C09CT("old_price")
    public String oldPrice = "";

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("order_id")
    public String orderId = "";

    @C09CT("changed_price")
    public String changedPrice = "";
}
