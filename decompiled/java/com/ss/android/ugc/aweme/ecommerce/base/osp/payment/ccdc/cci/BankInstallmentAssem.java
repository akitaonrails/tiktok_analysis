package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci;

import X.C019F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C872703b3;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class BankInstallmentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C197039127h LLJ;
    public DirectCheckoutBottomWidget LLJI;
    public FrameLayout LLJIJIL;
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723590SZx(this, C872703b3.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJILJILJ;
    public final Set<String> LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BankInstallmentAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/cci/BankInstallmentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BankInstallmentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(BankInstallmentViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 1054), AFwS228S0000000_1.get$arr$(199), null, true);
        this.LLJILLL = new LinkedHashSet();
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.clz) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final DirectCheckoutBottomWidget Ho() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fui) : null;
            this.LLJI = (DirectCheckoutBottomWidget) viewFindViewById;
        }
        return (DirectCheckoutBottomWidget) viewFindViewById;
    }

    public final C872703b3 Jo() {
        return (C872703b3) this.LLJILJIL.getValue();
    }

    public final BankInstallmentViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (BankInstallmentViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentAssem.onViewCreated(android.view.View):void");
    }
}
