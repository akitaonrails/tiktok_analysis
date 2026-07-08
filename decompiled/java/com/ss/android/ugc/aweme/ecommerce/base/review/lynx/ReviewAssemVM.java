package com.ss.android.ugc.aweme.ecommerce.base.review.lynx;

import X.C01GW;
import X.C034S;
import X.C0PEM;
import X.C1120604Zw;
import X.C1556050qax;
import X.C1556070qaz;
import X.C1623706Xj;
import X.C1766380w4C;
import X.C1766480w4M;
import X.C1766490w4N;
import X.C1AQS;
import X.C452501pT;
import X.C804420Vh2;
import X.C948503nH;
import X.EnumC1766410w4F;
import X.InterfaceC0148002o;
import android.os.SystemClock;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ReviewAssemVM extends AssemViewModel<ReviewState> {
    public String LL;
    public String LLILLJJLI;
    public Integer LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public String LLIZLLLIL;
    public boolean LLJ;
    public C1766480w4M LLJIJIL;
    public C1766490w4N LLJILJIL;
    public String LLILZLL = "";
    public String LLIZ = "";
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(142));
    public final String LLJILJILJ = "REVIEW_LYNX";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new ReviewState("", "", null, C1556070qaz.LIZ, new C1623706Xj(), EnumC1766410w4F.DEFAULT);
    }

    public final void vQ2() {
        IECommerceHostService iECommerceHostService;
        String str = this.LLIZLLLIL;
        if (str != null) {
            setState(new AwS605S0100000_26(new C1556050qax(new C1766490w4N("success", str)), 807));
            return;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (C804420Vh2.LJFF(((IApplicationDependencyService) iECommerceHostService).getApplication())) {
            C948503nH.LJI(this, C0PEM.LIZJ, new C1766380w4C(this, null));
        } else {
            setState(AFwS268S0000000_26.get$arr$(248));
        }
    }
}
