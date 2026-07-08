package com.ss.android.ugc.aweme.pns.agegate.viewmodels;

import X.C0NRA;
import X.C10UK;
import X.C10WT;
import X.C10WV;
import X.C19257310Vn;
import X.C19299010eq;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class PNSRegistrationAgeGateViewModel extends PNSBaseAgeGateViewModel {
    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void DQ2() {
        C0NRA.LIZ("choose_birthday_next", new HashMap(), this.LLILZ);
        if (this.LLJJJIL != null) {
            FQ2();
        } else if (!this.LLJL || this.LLILZIL) {
            FQ2();
        } else {
            vQ2();
        }
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final boolean onBackPressed() {
        C19299010eq c19299010eqLJI;
        C10WV c10wv;
        C10WT c10wt = this.LLILLL;
        if (c10wt != null && (c19299010eqLJI = c10wt.LJI()) != null && Intrinsics.LJFF(c19299010eqLJI.canQuit, Boolean.TRUE)) {
            C10WT c10wt2 = this.LLILLL;
            PNSFeedbackModel pNSFeedbackModelLJFF = null;
            if ((c10wt2 instanceof C10WV) && (c10wv = (C10WV) c10wt2) != null) {
                pNSFeedbackModelLJFF = c10wv.LJFF();
            }
            yQ2(pNSFeedbackModelLJFF, AFwS217S0000000_28.get$arr$(325));
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel
    public final void zQ2(C10UK c10uk, C10WT c10wt, long j, C19257310Vn c19257310Vn) {
        String str;
        String str2;
        super.zQ2(c10uk, c10wt, j, c19257310Vn);
        this.LLJJJJLIIL = 1;
        this.LLJJL = 1;
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
        this.LLJL = c19257310Vn.getYearOnly();
    }
}
