package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PaymentNodeStatusModel implements Serializable {

    @C09CT("first_party_payment_input_click")
    public int firstPartyPaymentInputClick;

    @C09CT("first_party_payment_input_click_tab")
    public int firstPartyPaymentInputClickTab;

    @C09CT("first_party_payment_start")
    public int firstPartyPaymentStart;

    @C09CT("first_party_payment_start_tab")
    public int firstPartyPaymentStartTab;

    @C09CT("has_payment_intention")
    public int hasPaymentIntention;

    @C09CT("has_payment_intention_tab")
    public int hasPaymentIntentionTab;

    @C09CT("in_checkout_process")
    public int inCheckoutProcess;

    @C09CT("in_checkout_process_tab")
    public int inCheckoutProcessTab;

    @C09CT("payment_finish")
    public int paymentFinish;

    @C09CT("payment_finish_tab")
    public int paymentFinishTab;

    @C09CT("payment_submit")
    public int paymentSubmit;

    @C09CT("payment_submit_tab")
    public int paymentSubmitTab;

    @C09CT("third_party_payment_start")
    public int thirdPartyPaymentStart;

    @C09CT("third_party_payment_start_tab")
    public int thirdPartyPaymentStartTab;

    public PaymentNodeStatusModel() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.inCheckoutProcess * 31) + this.firstPartyPaymentInputClick) * 31) + this.firstPartyPaymentStart) * 31) + this.thirdPartyPaymentStart) * 31) + this.paymentSubmit) * 31) + this.hasPaymentIntention) * 31) + this.paymentFinish) * 31) + this.inCheckoutProcessTab) * 31) + this.firstPartyPaymentInputClickTab) * 31) + this.firstPartyPaymentStartTab) * 31) + this.thirdPartyPaymentStartTab) * 31) + this.paymentSubmitTab) * 31) + this.hasPaymentIntentionTab) * 31) + this.paymentFinishTab;
    }

    public String toString() {
        return "PaymentNodeStatusModel(inCheckoutProcess=" + this.inCheckoutProcess + ", firstPartyPaymentInputClick=" + this.firstPartyPaymentInputClick + ", firstPartyPaymentStart=" + this.firstPartyPaymentStart + ", thirdPartyPaymentStart=" + this.thirdPartyPaymentStart + ", paymentSubmit=" + this.paymentSubmit + ", hasPaymentIntention=" + this.hasPaymentIntention + ", paymentFinish=" + this.paymentFinish + ", inCheckoutProcessTab=" + this.inCheckoutProcessTab + ", firstPartyPaymentInputClickTab=" + this.firstPartyPaymentInputClickTab + ", firstPartyPaymentStartTab=" + this.firstPartyPaymentStartTab + ", thirdPartyPaymentStartTab=" + this.thirdPartyPaymentStartTab + ", paymentSubmitTab=" + this.paymentSubmitTab + ", hasPaymentIntentionTab=" + this.hasPaymentIntentionTab + ", paymentFinishTab=" + this.paymentFinishTab + ')';
    }

    public final void setFirstPartyPaymentInputClick(int i) {
        this.firstPartyPaymentInputClick = i;
    }

    public final void setFirstPartyPaymentInputClickTab(int i) {
        this.firstPartyPaymentInputClickTab = i;
    }

    public final void setFirstPartyPaymentStart(int i) {
        this.firstPartyPaymentStart = i;
    }

    public final void setFirstPartyPaymentStartTab(int i) {
        this.firstPartyPaymentStartTab = i;
    }

    public final void setHasPaymentIntention(int i) {
        this.hasPaymentIntention = i;
    }

    public final void setHasPaymentIntentionTab(int i) {
        this.hasPaymentIntentionTab = i;
    }

    public final void setInCheckoutProcess(int i) {
        this.inCheckoutProcess = i;
    }

    public final void setInCheckoutProcessTab(int i) {
        this.inCheckoutProcessTab = i;
    }

    public final void setPaymentFinish(int i) {
        this.paymentFinish = i;
    }

    public final void setPaymentFinishTab(int i) {
        this.paymentFinishTab = i;
    }

    public final void setPaymentSubmit(int i) {
        this.paymentSubmit = i;
    }

    public final void setPaymentSubmitTab(int i) {
        this.paymentSubmitTab = i;
    }

    public final void setThirdPartyPaymentStart(int i) {
        this.thirdPartyPaymentStart = i;
    }

    public final void setThirdPartyPaymentStartTab(int i) {
        this.thirdPartyPaymentStartTab = i;
    }

    public PaymentNodeStatusModel(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.inCheckoutProcess = i;
        this.firstPartyPaymentInputClick = i2;
        this.firstPartyPaymentStart = i3;
        this.thirdPartyPaymentStart = i4;
        this.paymentSubmit = i5;
        this.hasPaymentIntention = i6;
        this.paymentFinish = i7;
        this.inCheckoutProcessTab = i8;
        this.firstPartyPaymentInputClickTab = i9;
        this.firstPartyPaymentStartTab = i10;
        this.thirdPartyPaymentStartTab = i11;
        this.paymentSubmitTab = i12;
        this.hasPaymentIntentionTab = i13;
        this.paymentFinishTab = i14;
    }
}
