package com.ss.android.ugc.aweme.ecommerce.base.osp.module.seaonestep.sellingpoint;

import X.C01D1;
import X.C049X;
import X.C09R3;
import X.C1308910kAL;
import X.C1391190mJ3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1748720vbi;
import X.C1764030w0P;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C343970De7;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaOneStepTopOutSideAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public C1764030w0P LLJI;
    public TuxIconView LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SeaOneStepTopOutSideAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/vm/OrderSubmitAssemViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SeaOneStepTopOutSideAssem.class, "skuSpecViewModel", "getSkuSpecViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/sku/seanew/SeaSkuSpecViewModel;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public SeaOneStepTopOutSideAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(OrderSubmitAssemViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ, 471), AFwS228S0000000_1.get$arr$(100), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SeaSkuSpecViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c01d1, c1637906bB, new AwS545S0100000_1(c19719912DlLIZ2, 472), AFwS228S0000000_1.get$arr$(101), null, true);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void B6() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        if (((SeaSkuSpecViewModel) assemVMLazy.getValue()).LLJILJIL) {
            ((SeaSkuSpecViewModel) this.LLJ.getValue()).EQ2(false);
            return;
        }
        if (Go().getState().LLILZLL) {
            Go().jT2();
            return;
        }
        Go().LLJZ = "return";
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragmentLJI, C343970De7.LIZ);
        }
    }

    public final OrderSubmitAssemViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (OrderSubmitAssemViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1764030w0P c1764030w0P = this.LLJI;
        if (c1764030w0P != null) {
            c1764030w0P.LIZJ();
        }
        this.LLJI = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C1764030w0P c1764030w0P = this.LLJI;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C1764030w0P c1764030w0P = this.LLJI;
        if (c1764030w0P != null) {
            c1764030w0P.LIZLLL();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.e1v);
        Integer numLIZJ = null;
        if (tuxIconView != null) {
            Context context = tuxIconView.getContext();
            if (context != null) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZ = R.raw.icon_x_mark_small;
            c419910GdJ.LIZLLL = numLIZJ;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zl);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxIconView.getContext());
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zc);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(tuxIconView.getContext())));
            C786410Ut5.I7(new AjS40S0200000_1(view, this, 15), tuxIconView);
            C1748720vbi.LIZLLL(view, new C049X(), AFwS228S0000000_1.get$arr$(99));
        } else {
            tuxIconView = null;
        }
        this.LLJIJIL = tuxIconView;
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.042J
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C03JV) obj).a;
            }
        }, null, new AwS615S0100000_1(this, 31), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.042H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C03JV) obj).LLILZLL);
            }
        }, null, new AwS615S0100000_1(this, 32), 6);
        C786410Ut5.I7(new AjS60S0100000_1(this, 19), LJJIJL());
    }
}
