package com.bytedance.tiktok.homepage.mainfragment;

import X.C0C64;
import X.C1383310m6L;
import X.C1566970qsZ;
import X.C1567040qsg;
import X.C19EG;
import X.C2214201BlK;
import X.C343710Ddh;
import X.InterfaceC0148002o;
import android.app.Activity;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS264S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class NonPersonalizedVM extends AssemViewModel<C1383310m6L> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public int LL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1383310m6L(6, Boolean.valueOf(C1567040qsg.LIZIZ()));
    }

    public final void vQ2() {
        setStateImmediate(AFwS264S0000000_24.get$arr$(18));
    }

    public static boolean wQ2() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "npe_toast_permanent", true, false) && ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).P9();
    }

    public final void xQ2(int i, Activity activity) {
        C19EG c19eg;
        if (activity == null) {
            activity = C2214201BlK.LJFF();
        }
        if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null) {
            withState(new C1566970qsZ(i, C343710Ddh.LIZ(c19eg).CQ2(), this));
        }
    }
}
