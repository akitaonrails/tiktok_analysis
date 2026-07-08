package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.C01GW;
import X.C0I0B;
import X.C0OO0;
import X.C0ZBR;
import X.C0ZBZ;
import X.C0ZFW;
import X.C1559260qg8;
import X.C19EG;
import X.C291001Au;
import X.C452501pT;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupInfoViewModel extends AssemViewModel<C0ZBZ> {
    public long LLILLJJLI;
    public final C0ZFW LL = C0ZFW.LIZ;
    public final C1559260qg8 LLILLL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C0ZBR.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 138));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 140));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 139));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0ZBZ((String) this.LLILZ.getValue(), null, null, false, new C291001Au(Boolean.FALSE), null, (String) this.LLILZIL.getValue(), false, (String) this.LLILZLL.getValue(), false, false, null);
    }

    public final C0ZBR xQ2() {
        return (C0ZBR) this.LLILLL.getValue();
    }

    public final String yQ2() {
        return (!C0ZFW.LIZ.LJII(xQ2().LL) || ((String) this.LLILZIL.getValue()).length() > 30) ? "" : (String) this.LLILZIL.getValue();
    }

    public final C0ZBZ wQ2(C0ZBZ c0zbz) {
        boolean z;
        boolean z2;
        boolean z3;
        if (c0zbz.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = !Intrinsics.LJFF(c0zbz.LLIZ, yQ2());
        boolean z5 = !Intrinsics.LJFF(c0zbz.LLJ, this.LLILZLL.getValue());
        if (!z && !z4 && !z5) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && !c0zbz.LLILZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        return C0ZBZ.LIZ(c0zbz, null, null, false, null, null, null, false, null, false, z3, null, 3071);
    }

    public final void vQ2(C0OO0 c0oo0, C19EG c19eg) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLILLJJLI < 500) {
            return;
        }
        this.LLILLJJLI = jCurrentTimeMillis;
        IMGroupChatDetailAnalytics.LIZ.LJFF("click_change_group_photo", new Pair[]{new Pair("enter_from", xQ2().LLILLJJLI)}, C0I0B.LJFF.LIZIZ());
        c0oo0.LJ(11, c19eg, null);
    }
}
