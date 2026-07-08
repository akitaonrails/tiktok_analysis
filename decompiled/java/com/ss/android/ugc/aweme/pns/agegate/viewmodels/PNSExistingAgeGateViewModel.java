package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.C0NRA;
import X.C10UK;
import X.C10WC;
import X.C10WT;
import X.C15O7;
import X.C19257210Vm;
import X.C19257310Vn;
import X.EnumC19256910Vj;
import X.InterfaceC2385309Wh;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.BaseResponse;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSExistingAgeGateViewModel extends PNSBaseAgeGateViewModel {
    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void DQ2() {
        C15O7<BaseResponse> c15o7LIZJ;
        C0NRA.LIZ("choose_birthday_next", new HashMap(), this.LLILZ);
        if (this.LLJILJIL == EnumC19256910Vj.NONE.getValue()) {
            FQ2();
            return;
        }
        this.LLJJIII.postValue(Boolean.TRUE);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C19257210Vm.LIZ.getClass();
        C10WC c10wc = (C10WC) C19257210Vm.LIZJ.getValue();
        if (c10wc == null || (c15o7LIZJ = c10wc.LIZJ(wQ2(), this.LLJJJJLIIL, this.LLJJL)) == null) {
            return;
        }
        c15o7LIZJ.LJ(new InterfaceC2385309Wh() { // from class: X.10WR
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                PNSFeedbackModel ageGateFeedback;
                C1C7U.LIZ("PNSBaseAgeGateViewModel@4804.confirmAge$1");
                BaseResponse baseResponse = (BaseResponse) c15o7.LJIIL();
                if (c15o7.LJIILJJIL() && baseResponse != null) {
                    this.LLJJIII.postValue(Boolean.FALSE);
                    PNSFeedbackModel ageGateFeedback2 = baseResponse.getAgeGateFeedback();
                    if ((ageGateFeedback2 != null && ageGateFeedback2.dialogModel != null) || ((ageGateFeedback = baseResponse.getAgeGateFeedback()) != null && ageGateFeedback.errorModel != null)) {
                        PNSFeedbackModel ageGateFeedback3 = baseResponse.getAgeGateFeedback();
                        if (ageGateFeedback3 != null && ageGateFeedback3.errorModel != null) {
                            this.yQ2(baseResponse.getAgeGateFeedback(), AFwS217S0000000_28.get$arr$(704));
                        }
                        PNSFeedbackModel ageGateFeedback4 = baseResponse.getAgeGateFeedback();
                        if (ageGateFeedback4 != null && ageGateFeedback4.dialogModel != null) {
                            this.yQ2(baseResponse.getAgeGateFeedback(), new AwS572S0100000_28(this, 1028));
                        }
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("PNSBaseAgeGateViewModel@4804.confirmAge$1");
                        return unit;
                    }
                    if (baseResponse.getStatus_code() != 0) {
                        this.xQ2(baseResponse.getStatus_code(), baseResponse.getStatus_msg());
                    }
                    if (this.LLJILJIL != EnumC19256910Vj.BLOCKING.getValue()) {
                        this.FQ2();
                    }
                } else {
                    PNSBaseAgeGateViewModel pNSBaseAgeGateViewModel = this;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    pNSBaseAgeGateViewModel.getClass();
                    PNSBaseAgeGateViewModel.AQ2(jCurrentTimeMillis2, "/tiktok/age/confirmation/get/v2/", -1, false, false);
                    this.xQ2(-1, "");
                }
                if (this.LLJILJIL != EnumC19256910Vj.BLOCKING.getValue()) {
                    this.FQ2();
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PNSBaseAgeGateViewModel@4804.confirmAge$1");
                return unit2;
            }
        }, C15O7.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void zQ2(C10UK c10uk, C10WT c10wt, long j, C19257310Vn c19257310Vn) {
        String str;
        String str2;
        super.zQ2(c10uk, c10wt, j, c19257310Vn);
        this.LLJJJJLIIL = 1;
        this.LLJJL = 2;
        if (this.LLILZIL) {
            str = "f_age_gate_show";
        } else {
            str = "age_gate_show";
        }
        C0NRA.LIZ(str, new LinkedHashMap(), this.LLILZ);
        if (this.LLILZIL) {
            str2 = "f_age_gate_response";
        } else {
            str2 = "age_gate_response";
        }
        this.LLJJLIIIJLLLLLLLZ = str2;
    }
}
