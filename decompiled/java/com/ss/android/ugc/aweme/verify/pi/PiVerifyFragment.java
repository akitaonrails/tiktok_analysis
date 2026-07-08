package com.ss.android.ugc.aweme.verify.pi;

import X.C01GW;
import X.C0PEM;
import X.C13LE;
import X.C1713570uh1;
import X.C1714040uhm;
import X.C1714180ui0;
import X.C1714660uim;
import X.C1714910ujB;
import X.C1714920ujC;
import X.C1714950ujF;
import X.C19719912Dl;
import X.C19EG;
import X.C20277814Wa;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C863200Xte;
import X.EnumC1714450uiR;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PiVerifyFragment extends BaseVerifyFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjHELIOSMpOyY1MWs8IGEDIRMpOyY1MQM+KCg+LSs4";
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PiVerifyFragment.class, "verifyViewModel", "getVerifyViewModel()Lcom/ss/android/ugc/aweme/verify/pi/VerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final String UR() {
        return "bnpl_pi_verify";
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final int ZR() {
        return R.layout.i7i;
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final void WR() {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C863200Xte(this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC1724030uxt
    public final void bF() {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("close");
        }
        super.bF();
    }

    public final VerifyViewModel cS() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (VerifyViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("unmount");
        }
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC21503819Do
    public final void tv() {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("return");
        }
        VerifyViewModel verifyViewModelCS = cS();
        verifyViewModelCS.wQ2();
        verifyViewModelCS.setState(AFwS268S0000000_26.get$arr$(671));
        C20277814Wa.LIZIZ(this);
    }

    public PiVerifyFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VerifyViewModel.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS563S0100000_19(c19719912DlLIZ, 1967), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1968), AFwS268S0000000_26.get$arr$(488));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1172));
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("user_cancel");
        }
        VerifyViewModel verifyViewModelCS = cS();
        verifyViewModelCS.wQ2();
        verifyViewModelCS.setState(AFwS268S0000000_26.get$arr$(671));
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC1714450uiR enumC1714450uiR;
        Window window;
        C1714040uhm c1714040uhm;
        String str;
        VerifyViewModel verifyViewModelCS = cS();
        C1713570uh1 c1713570uh1SR = SR();
        C1714660uim c1714660uimVR = VR();
        if (c1713570uh1SR != null) {
            verifyViewModelCS.LL = c1713570uh1SR;
            VerifyDetail verifyDetailLJIIIIZZ = c1713570uh1SR.LJIIIIZZ();
            if (verifyDetailLJIIIIZZ != null) {
                str = verifyDetailLJIIIIZZ.inputFormat;
            } else {
                str = null;
            }
            verifyViewModelCS.LLILZ = str;
            C1714180ui0 c1714180ui0 = new C1714180ui0(c1713570uh1SR, "pi_page");
            verifyViewModelCS.LLILLL = c1714180ui0;
            verifyViewModelCS.LLILLJJLI = new C1714950ujF(c1713570uh1SR, c1714660uimVR, c1714180ui0, new C1714910ujB(verifyViewModelCS, null));
        }
        C23250099c.LIZLLL(verifyViewModelCS.getAssemVMScope(), verifyViewModelCS.LLILZIL, null, new C1714920ujC(verifyViewModelCS, null), 2);
        C1714180ui0 c1714180ui02 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui02 != null) {
            c1714180ui02.LIZLLL = System.currentTimeMillis();
        }
        super.onViewCreated(view, bundle);
        C1713570uh1 c1713570uh1SR2 = SR();
        if (c1713570uh1SR2 != null && (c1714040uhm = c1713570uh1SR2.LIZ.LIZIZ) != null) {
            enumC1714450uiR = c1714040uhm.LIZ;
        } else {
            enumC1714450uiR = null;
        }
        if (enumC1714450uiR == EnumC1714450uiR.FULL_PAGE) {
            NR(AFwS268S0000000_26.get$arr$(487));
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(16);
            }
        }
        C723850SaN.LIZ(this, false, null, new AwS593S0100000_14(this, 165), 3);
    }
}
