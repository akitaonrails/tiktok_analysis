package com.ss.android.ugc.aweme.fangroup.assem;

import X.C019F;
import X.C01GW;
import X.C0DQT;
import X.C1229980i72;
import X.C1230910i8X;
import X.C1232370iAt;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupListLogicAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1403));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1404));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1401));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1402));
    public final C1559260qg8 LLJILJIL = new C1559260qg8(new C723590SZx(this, C1229980i72.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FanGroupListLogicAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/fangroup/viewmodel/FanGroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FanGroupListLogicAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FanGroupListViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1405), AFwS257S0000000_19.get$arr$(154), null, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1230910i8X c1230910i8X;
        Context context;
        FrameLayout.LayoutParams layoutParams;
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0i8i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1230950i8b) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 39), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0i8d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230950i8b) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 40), 4);
        C1229980i72 c1229980i72 = (C1229980i72) this.LLJILJIL.getValue();
        if (c1229980i72 != null && (c1230910i8X = c1229980i72.LLILZIL) != null && c1230910i8X.useSelectStyle() && (context = getContext()) != null) {
            float fLIZLLL = C1232370iAt.LIZLLL(context);
            if (fLIZLLL > 0.0f && C724240Sb0.LJI(this) != null) {
                View viewLJJIJL = LJJIJL();
                ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
                FrameLayout.LayoutParams layoutParams3 = null;
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.height = (int) (0.5f * fLIZLLL);
                    layoutParams3 = layoutParams;
                }
                C786410Ut5.W5(viewLJJIJL, layoutParams3);
                C736680Sv4.LJIIIIZZ(this, this.LLJILJILJ.getValue(), new C2217381BqS() { // from class: X.0i8h
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1230950i8b) obj).LLILZIL;
                    }
                }, C736820SvI.LIZLLL(), new C0DQT(this, fLIZLLL), 4);
            }
        }
    }
}
