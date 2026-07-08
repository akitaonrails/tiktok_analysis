package com.ss.android.ugc.aweme.im.ui.assem;

import X.C019F;
import X.C01GW;
import X.C0Q4Y;
import X.C13LE;
import X.C1637806bA;
import X.C1720106oR;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1893080zMY;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.ui.cell.IMNewSearchCommonCell;
import com.ss.android.ugc.aweme.im.viewmodel.HistorySearchResultVM;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class HistorySearchListAssem extends UIListContentAssem<HistorySearchResultVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1518));
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HistorySearchListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/viewmodel/HistorySearchResultVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HistorySearchListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HistorySearchResultVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1519), AFwS257S0000000_19.get$arr$(177), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1517));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 2;
        return c20603715jn;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (AssemListViewModel) assemVMLazy.getValue();
    }

    public final C1749280vcc Lo() {
        return (C1749280vcc) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Go().LJIILJJIL(IMNewSearchCommonCell.class);
        Go().getState().LIZLLL = C0Q4Y.BUFFER;
        Go().setItemAnimator(null);
        C1749280vcc c1749280vccLo = Lo();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJ(c1722300uv6);
        c1722300uv6.LJFF = 2131832152;
        c1722300uv6.LJII = 2131832153;
        c1749280vccLo.setStatus(c1722300uv6);
        try {
            c1749280vccLo.setTopMargin(c1749280vccLo.getResources().getDimensionPixelSize(R.dimen.a27));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("HistorySearchListAssem", "setTopMargin error", e);
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0iOk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1240980iOm) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 51), 6);
    }
}
