package com.ss.android.ugc.aweme.verify.id;

import X.C01GW;
import X.C13LE;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1714180ui0;
import X.C1714230ui5;
import X.C1714660uim;
import X.C19719912Dl;
import X.C19EG;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class IDVerifyFragment extends BaseVerifyFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSMpOyY1MWslLWEaDBMpOyY1MQM+KCg+LSs4";
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IDVerifyFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/verify/id/IDVerifyVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final String UR() {
        return "bnpl_idc_verify";
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final int ZR() {
        return R.layout.i7e;
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC21503819Do
    public final void tv() {
        C1713680uhC c1713680uhC;
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("return");
        }
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_idc_verify", null, null, 48);
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC1724030uxt
    public final void bF() {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("close");
        }
        super.bF();
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("unmount");
        }
        super.onDestroyView();
    }

    public IDVerifyFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IDVerifyVM.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 1482), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1483), AFwS268S0000000_26.get$arr$(479));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1140));
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1713680uhC c1713680uhC;
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("user_cancel");
        }
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_idc_verify", null, null, 48);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(478));
        super.onCreate(bundle);
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        IDVerifyVM iDVerifyVM = (IDVerifyVM) assemVMLazy.getValue();
        C1713570uh1 c1713570uh1SR = SR();
        C1714660uim c1714660uimVR = VR();
        iDVerifyVM.LL = c1713570uh1SR;
        iDVerifyVM.LLILLJJLI = c1714660uimVR;
        iDVerifyVM.LLILLL = new C1714180ui0(c1713570uh1SR, "id_c_page");
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LIZLLL = System.currentTimeMillis();
        }
        super.onViewCreated(view, bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            KeyboardUtils.LJ(16, activity, 240);
        }
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 389), 3);
    }
}
