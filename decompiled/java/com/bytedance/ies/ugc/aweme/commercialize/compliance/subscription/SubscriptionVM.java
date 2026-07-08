package com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription;

import X.C0TGR;
import X.C0TPL;
import X.C1022620cia;
import X.C118300cf;
import X.C2188811AlT;
import X.C638980P4m;
import X.C786260Usq;
import X.InterfaceC594300NSq;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.api.ICommercializeComplianceApi;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AckPaymentCallbackResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.BenefitsResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.SubscriptionStatusResponse;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class SubscriptionVM extends ViewModel {
    public static final /* synthetic */ int LLILZIL = 0;
    public final ICommercializeComplianceApi LL;
    public final MutableLiveData<SubscriptionStatusResponse> LLILLJJLI;
    public final MutableLiveData<BenefitsResponse> LLILLL;
    public final MutableLiveData<Boolean> LLILZ;

    public final void AQ2() {
        try {
            this.LL.getSubscriptionStatus().enqueue(new C786260Usq(this, 3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void zQ2() {
        try {
            this.LL.getBenefits().enqueue(new C786260Usq(this, 2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1022620cia.LIZIZ("SubscriptionVM", e.toString());
        }
    }

    public SubscriptionVM() {
        ICommercializeComplianceApi.LIZ.getClass();
        this.LL = C0TPL.LIZ();
        this.LLILLJJLI = new MutableLiveData<>();
        this.LLILLL = new MutableLiveData<>();
        this.LLILZ = new MutableLiveData<>();
    }

    public final void CQ2(C0TGR c0tgr) {
        try {
            this.LL.unsubscribe().enqueue(new C786260Usq(c0tgr, 4));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0tgr.onFail();
        }
    }

    public final void BQ2(Integer num, String str) {
        try {
            this.LL.setSubscriptionUserChoice(str, num).enqueue(new C638980P4m(this, 3));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void yQ2(int i, int i2) {
        try {
            this.LL.ackSurvey(i, i2).enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.0TGP
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ackSurvey Exception: ");
            sbLIZ.append(e.getMessage());
            C1022620cia.LIZIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void vQ2(int i, Integer num, String str) {
        C118300cf c118300cf = new C118300cf();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ackPaymentCallback: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        C1022620cia.LIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
        wQ2(i, 3, this, num, str, c118300cf);
    }

    public final void xQ2(Integer num, String str, String str2) {
        try {
            this.LL.ackPrompt(num, str, str2).enqueue(new InterfaceC594300NSq<BaseResponse>() { // from class: X.0TGQ
                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<BaseResponse> c0x9s, C0X52<BaseResponse> c0x52) {
                }

                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<BaseResponse> c0x9s, Throwable th) {
                    C1022620cia.LIZ("SubscriptionVM", th.toString());
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1022620cia.LIZ("SubscriptionVM", e.toString());
        }
    }

    public static final void wQ2(final int i, final int i2, final SubscriptionVM subscriptionVM, final Integer num, final String str, final C118300cf c118300cf) {
        c118300cf.element++;
        try {
            subscriptionVM.LL.ackPaymentCallback(i, str, num).enqueue(new InterfaceC594300NSq<AckPaymentCallbackResponse>() { // from class: X.0TNW
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<AckPaymentCallbackResponse> c0x9s, Throwable th) {
                    Integer num2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ackPaymentCallback Failed retry times ");
                    sbLIZ.append(c118300cf.element);
                    sbLIZ.append(" attempts: ");
                    sbLIZ.append(th.getMessage());
                    C1022620cia.LIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(1, "payment_status");
                    C0TOM.LIZ.getClass();
                    AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
                    if (adFreeSubscriptionLJ != null) {
                        num2 = adFreeSubscriptionLJ.productLine;
                    } else {
                        num2 = null;
                    }
                    c2344009Gk.LJ(num2, "product_line");
                    C20684815ws.LJIILLIIL("ttplus_payment_status", c2344009Gk.LIZ);
                    C118300cf c118300cf2 = c118300cf;
                    int i3 = c118300cf2.element;
                    int i4 = i2;
                    if (i3 < i4) {
                        SubscriptionVM subscriptionVM2 = subscriptionVM;
                        SubscriptionVM.wQ2(i, i4, subscriptionVM2, num, str, c118300cf2);
                    }
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<AckPaymentCallbackResponse> c0x9s, C0X52<AckPaymentCallbackResponse> c0x52) {
                    Integer ackStatus;
                    SubscriptionStatusResponse subscriptionStatusResponseCopy;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ackPaymentCallback response: ");
                    sbLIZ.append(c0x52.LIZIZ);
                    sbLIZ.append(" ackStatus: ");
                    sbLIZ.append(c0x52.LIZIZ.getAckStatus());
                    C1022620cia.LIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
                    if (c0x52.LIZJ() && (ackStatus = c0x52.LIZIZ.getAckStatus()) != null && ackStatus.intValue() == 1) {
                        MutableLiveData<SubscriptionStatusResponse> mutableLiveData = subscriptionVM.LLILLJJLI;
                        SubscriptionStatusResponse value = mutableLiveData.getValue();
                        Integer num2 = null;
                        if (value != null) {
                            subscriptionStatusResponseCopy = value.copy(value.startTimestamp, value.expireTimestamp, c0x52.LIZIZ.getSubscriptionPhase(), value.shouldShowSurvey, value.shouldShowSurveyBanner);
                        } else {
                            subscriptionStatusResponseCopy = null;
                        }
                        mutableLiveData.setValue(subscriptionStatusResponseCopy);
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(0, "payment_status");
                        C0TOM.LIZ.getClass();
                        AdFreeSubscription adFreeSubscriptionLJ = C0TOM.LJ();
                        if (adFreeSubscriptionLJ != null) {
                            num2 = adFreeSubscriptionLJ.productLine;
                        }
                        c2344009Gk.LJ(num2, "product_line");
                        C20684815ws.LJIILLIIL("ttplus_payment_status", c2344009Gk.LIZ);
                        return;
                    }
                    C118300cf c118300cf2 = c118300cf;
                    int i3 = c118300cf2.element;
                    int i4 = i2;
                    if (i3 >= i4) {
                        return;
                    }
                    SubscriptionVM.wQ2(i, i4, subscriptionVM, num, str, c118300cf2);
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ackPaymentCallback Exception: ");
            sbLIZ.append(e.getMessage());
            C1022620cia.LIZIZ("SubscriptionVM", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
