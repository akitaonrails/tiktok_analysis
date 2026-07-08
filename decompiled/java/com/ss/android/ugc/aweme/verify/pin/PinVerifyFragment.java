package com.ss.android.ugc.aweme.verify.pin;

import X.C01GW;
import X.C13LE;
import X.C1713570uh1;
import X.C1713680uhC;
import X.C1714180ui0;
import X.C1714230ui5;
import X.C19719912Dl;
import X.C20277814Wa;
import X.C21244318Bt;
import X.C2217381BqS;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC836760Ws6;
import Y.ARunnableS126S0100000_26;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes27.dex */
@InterfaceC836760Ws6
public final class PinVerifyFragment extends BaseVerifyFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjMpHELIOSOyY1MWs8ICF9GCwiHyohISM1Dz0yLygpJzs=";
    public final AssemVMLazy LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PinVerifyFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/verify/pin/PinVerifyViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final String UR() {
        return "bnpl_pin_use";
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final int ZR() {
        return R.layout.i7k;
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, X.InterfaceC21503819Do
    public final void tv() {
        C1713680uhC c1713680uhC;
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("return");
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = "a2270.b87466";
        c21244318Bt.LIZIZ = PageFinder.via(getView());
        String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_pin_use", null, strCreateJumpSourceBtmToken, 16);
        }
        C20277814Wa.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment
    public final void WR() {
        C786410Ut5.LJLIIL(100L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 59));
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

    public PinVerifyFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PinVerifyViewModel.class);
        this.LLJILJILJ = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS568S0100000_24(c19719912DlLIZ, 1485), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS570S0100000_26((HasDefaultViewModelProviderFactory) this, 1174), AFwS268S0000000_26.get$arr$(491));
        this.LLJILLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1173));
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C1713680uhC c1713680uhC;
        C1714180ui0 c1714180ui0 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui0 != null) {
            c1714180ui0.LJFF("user_cancel");
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        C21244318Bt c21244318Bt = new C21244318Bt();
        c21244318Bt.LIZ = "a2270.b87466";
        c21244318Bt.LIZIZ = PageFinder.via(getView());
        String strCreateJumpSourceBtmToken = btmSDK.createJumpSourceBtmToken(c21244318Bt);
        C1713570uh1 c1713570uh1SR = SR();
        if (c1713570uh1SR != null && (c1713680uhC = c1713570uh1SR.LJIILIIL) != null) {
            C1714230ui5.LIZJ(c1713680uhC, this, "CANCEL", "bnpl_pin_use", null, strCreateJumpSourceBtmToken, 16);
        }
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        NR(AFwS268S0000000_26.get$arr$(490));
        super.onCreate(bundle);
        BtmSDK.INSTANCE.registerBtmPageOnCreate(this, "a2270.b87466", (String) this.LLIZ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.verify.BaseVerifyFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1714180ui0 c1714180ui0;
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        PinVerifyViewModel pinVerifyViewModel = (PinVerifyViewModel) assemVMLazy.getValue();
        C1713570uh1 c1713570uh1SR = SR();
        pinVerifyViewModel.LLILLJJLI = c1713570uh1SR;
        if (c1713570uh1SR != null) {
            c1714180ui0 = new C1714180ui0(c1713570uh1SR, "pin_page");
        } else {
            c1714180ui0 = null;
        }
        pinVerifyViewModel.LLILLL = c1714180ui0;
        C1714180ui0 c1714180ui02 = (C1714180ui0) this.LLJILLL.getValue();
        if (c1714180ui02 != null) {
            c1714180ui02.LIZLLL = System.currentTimeMillis();
        }
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 391), 3);
    }
}
