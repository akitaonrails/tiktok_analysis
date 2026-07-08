package com.ss.android.ugc.aweme.innerpush.refactor.assem;

import X.C01GW;
import X.C13LE;
import X.C1402370mb5;
import X.C1637806bA;
import X.C19231910Lt;
import X.C19290510dT;
import X.C197039127h;
import X.C19719912Dl;
import X.C20666015tq;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushRightVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS670S0100000_21;

/* JADX INFO: loaded from: classes32.dex */
public final class RightSlotAssem extends BaseInnerPushAreaSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public C19231910Lt LLJJIJIIJIL;
    public TuxTextView LLJJIJIL;
    public SmartImageView LLJJJ;
    public C197039127h LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final int LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RightSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushRightVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RightSlotAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushRightVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS575S0100000_31(c19719912DlLIZ, 755), AFwS276S0000000_31.get$arr$(149), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 753));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 756));
        this.LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 754));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 757));
        this.LLJL = 3;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cte;
    }

    public final C19231910Lt lp() {
        return (C19231910Lt) this.LLJJJJJIL.getValue();
    }

    public final SmartImageView mp() {
        return (SmartImageView) this.LLJJL.getValue();
    }

    public final TuxTextView op() {
        return (TuxTextView) this.LLJJJJLIIL.getValue();
    }

    public final C197039127h sp() {
        return (C197039127h) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InnerPushRightVM tp() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (InnerPushRightVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem
    public final void kp(View view) {
        C19290510dT.LIZLLL("RightSlotAssem", "[onClickOutPadding]");
        onClick(view);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem, com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Context context = getContext();
        if (context == null) {
            return;
        }
        C19290510dT.LIZLLL("RightSlotAssem", "[onViewCreated]");
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.15uF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LL);
            }
        }, null, new C20666015tq(view, this, (int) ((((double) (context.getResources().getDisplayMetrics().widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)))) * 0.4d) - ((double) C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)))), context), 6);
        C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.15uG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LL);
            }
        }, new C2217381BqS() { // from class: X.15u2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666915tz) obj).LLILLJJLI;
            }
        }, null, new AwS670S0100000_21(this, 13), 12);
        C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.15uE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.15uH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LLILZIL);
            }
        }, null, new AwS670S0100000_21(this, 18), 12);
        C736680Sv4.LJIIIZ(this, tp(), new C2217381BqS() { // from class: X.15uI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LLILZLL);
            }
        }, new C2217381BqS() { // from class: X.15u4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C20666915tz) obj).LLJI);
            }
        }, null, new AwS670S0100000_21(this, 19), 12);
        InnerPushRightVM innerPushRightVMTp = tp();
        selectSubscribe(innerPushRightVMTp, new C2217381BqS() { // from class: X.15uL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666915tz) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.15uJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666915tz) obj).LLIZ);
            }
        }, new C2217381BqS() { // from class: X.15uK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666915tz) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZIZ(innerPushRightVMTp.usedInReusedScene), null, new C1402370mb5(this, 3));
    }
}
