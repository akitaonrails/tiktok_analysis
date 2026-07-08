package com.ss.android.ugc.aweme.ecommerce.base.osp.header;

import X.C01D1;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.ViewFlipper;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class TopBannerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public volatile boolean LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopBannerAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopBannerAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 139), AFwS228S0000000_1.get$arr$(67), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 127));
        this.LLJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 121));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 135));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 128));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 122));
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 123));
        this.LLJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 124));
        this.LLJJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 125));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(this, 126));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(this, 129));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 130));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 131));
        this.LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 132));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 133));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 134));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 136));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 137));
        this.LLJJL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 138));
    }

    public final View Go() {
        return (View) this.LLJILJILJ.getValue();
    }

    public final View Ho() {
        return (View) this.LLJILLL.getValue();
    }

    public final TuxTextView Jo() {
        return (TuxTextView) this.LLJ.getValue();
    }

    public final View Lo() {
        return (View) this.LLJILJIL.getValue();
    }

    public final TuxTextView No() {
        return (TuxTextView) this.LLJJIJIIJIL.getValue();
    }

    public final ViewFlipper Oo() {
        return (ViewFlipper) this.LLJIJIL.getValue();
    }

    public final OrderSubmitAssemViewModel So() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.03IL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLLLZL;
            }
        }, null, new AwS615S0100000_1(this, 19), 6);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.03IK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).LLLJIL;
            }
        }, null, new AwS615S0100000_1(this, 20), 6);
    }
}
