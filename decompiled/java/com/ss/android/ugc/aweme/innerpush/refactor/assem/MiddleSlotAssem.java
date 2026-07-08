package com.ss.android.ugc.aweme.innerpush.refactor.assem;

import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19290510dT;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushMiddleVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS456S0200000_21;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes32.dex */
public final class MiddleSlotAssem extends BaseInnerPushAreaSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLL;
    public TuxTextView LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public TuxTextView LLJJJ;
    public ConstraintLayout LLJJJIL;
    public FrameLayout LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final int LLJLILLLLZIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MiddleSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushMiddleVM;", 0);
        C13LE.LIZ.getClass();
        LLJLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MiddleSlotAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushMiddleVM.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ, 749), AFwS276S0000000_31.get$arr$(148), null, true);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 752));
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 748));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 750));
        this.LLJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 751));
        this.LLJLIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 747));
        this.LLJLILLLLZIIL = 2;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ctd;
    }

    public final InnerPushMiddleVM lp() {
        AssemVMLazy assemVMLazy = this.LLJJJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLL;
        return (InnerPushMiddleVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem
    public final void kp(View view) {
        C19290510dT.LIZLLL("MiddleSlotAssem", "[onClickOutPadding]");
        onClick(view);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem, com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, lp(), new C2217381BqS() { // from class: X.15uu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666615tw) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.15ur
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666615tw) obj).LLILZIL);
            }
        }, null, new AwS670S0100000_21(this, 11), 12);
        C736680Sv4.LJIIIZ(this, lp(), new C2217381BqS() { // from class: X.15uv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666615tw) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.15ut
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666615tw) obj).LLILZ;
            }
        }, null, new AwS670S0100000_21(this, 12), 12);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.15uw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666615tw) obj).LLILLL;
            }
        }, null, new AwS635S0100000_21(this, 75), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.15us
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666615tw) obj).LLILZLL);
            }
        }, null, new AwS456S0200000_21(this, view, 6), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.15uq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666615tw) obj).LLIZLLLIL;
            }
        }, null, new AwS635S0100000_21(this, 74), 6);
    }
}
