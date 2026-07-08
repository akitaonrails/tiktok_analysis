package com.ss.android.ugc.aweme.pipo.cashier.refund.api.model;

import X.C09CT;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes27.dex */
public final class RefundOption {

    @C09CT("action_link")
    public final String actionLink;

    @C09CT("credit_token")
    public final String creditToken;

    @C09CT("desc")
    public final String desc;

    @C09CT("is_default")
    public final Boolean isDefault;

    @C09CT("is_valid")
    public final Boolean isValid;

    @C09CT("link_block")
    public final LinkBlock linkBlock;

    @C09CT("refund_arriving_time")
    public final RefundArrivingTime refundArrivingTime;

    @C09CT("refund_arriving_time_desc")
    public final String refundArrivingTimeDesc;

    @C09CT("refund_methods")
    public final ArrayList<RefundMethod> refundMethods;

    @C09CT("refund_option_tags")
    public final ArrayList<RefundOptionTag> refundOptionTags;

    @C09CT("title")
    public final String title;

    public RefundOption() {
        this(null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        StringBuilder sb = new StringBuilder();
        ArrayList<RefundMethod> arrayList = this.refundMethods;
        if (arrayList != null) {
            for (RefundMethod refundMethod : arrayList) {
                String str = refundMethod.refundDecisionType;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                sb.append(str);
                String str3 = refundMethod.originalPaymentMethodId;
                if (str3 == null) {
                    str3 = "";
                }
                sb.append(str3);
                String str4 = refundMethod.targetPaymentMethodId;
                if (str4 != null) {
                    str2 = str4;
                }
                sb.append(str2);
            }
        }
        return sb.toString().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RefundOption) && hashCode() == ((RefundOption) obj).hashCode()) {
            return true;
        }
        return false;
    }

    public RefundOption(String str, String str2, Boolean bool, Boolean bool2, String str3, ArrayList<RefundOptionTag> arrayList, ArrayList<RefundMethod> arrayList2, String str4, LinkBlock linkBlock, RefundArrivingTime refundArrivingTime, String str5) {
        this.title = str;
        this.desc = str2;
        this.isValid = bool;
        this.isDefault = bool2;
        this.actionLink = str3;
        this.refundOptionTags = arrayList;
        this.refundMethods = arrayList2;
        this.creditToken = str4;
        this.linkBlock = linkBlock;
        this.refundArrivingTime = refundArrivingTime;
        this.refundArrivingTimeDesc = str5;
    }
}
