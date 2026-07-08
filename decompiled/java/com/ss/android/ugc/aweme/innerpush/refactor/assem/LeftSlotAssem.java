package com.ss.android.ugc.aweme.innerpush.refactor.assem;

import X.C01GW;
import X.C13LE;
import X.C1402370mb5;
import X.C1637806bA;
import X.C19290510dT;
import X.C19719912Dl;
import X.C20750516Hv;
import X.C2217381BqS;
import X.C427870Gq9;
import X.C452501pT;
import X.C683100Qqq;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem;
import com.ss.android.ugc.aweme.innerpush.refactor.vm.InnerPushLeftVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes32.dex */
public final class LeftSlotAssem extends BaseInnerPushAreaSlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public C427870Gq9 LLJJIJIIJIL;
    public FrameLayout LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final int LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LeftSlotAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/innerpush/refactor/vm/InnerPushLeftVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LeftSlotAssem() {
        C683100Qqq c683100Qqq = C683100Qqq.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InnerPushLeftVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c683100Qqq, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 709), AFwS276S0000000_31.get$arr$(147), null, true);
        this.LLJJJIL = 1;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 746));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 708));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ct8;
    }

    public final C427870Gq9 lp() {
        return (C427870Gq9) this.LLJJJJ.getValue();
    }

    public final InnerPushLeftVM mp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (InnerPushLeftVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem
    public final int hp() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem
    public final void kp(View view) {
        C19290510dT.LIZLLL("LeftSlotAssem", "[onClickOutPadding]");
        onClick(view);
    }

    @Override // com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushAreaSlotAssem, com.ss.android.ugc.aweme.innerpush.api.refactor.base.BaseInnerPushSlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.15uB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLJL;
            }
        }, null, new AwS635S0100000_21(this, 72), 6);
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.15uA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LL);
            }
        }, null, new AwS635S0100000_21(view, 73), 6);
        InnerPushLeftVM innerPushLeftVMMp = mp();
        selectSubscribe(innerPushLeftVMMp, new C2217381BqS() { // from class: X.15uD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLJILJILJ;
            }
        }, new C2217381BqS() { // from class: X.15uC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20666415tu) obj).LLJJI;
            }
        }, new C2217381BqS() { // from class: X.15u5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20666415tu) obj).LLJJIII);
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMMp.usedInReusedScene), null, new C20750516Hv(this, 2));
        C736680Sv4.LJIIIIZZ(this, mp(), new C2217381BqS() { // from class: X.15u6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJIJIIJIL);
            }
        }, null, new AwS635S0100000_21(this, 125), 6);
        InnerPushLeftVM innerPushLeftVMMp2 = mp();
        selectSubscribe(innerPushLeftVMMp2, new C2217381BqS() { // from class: X.15u7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJILLL);
            }
        }, new C2217381BqS() { // from class: X.15u8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJ);
            }
        }, new C2217381BqS() { // from class: X.15u9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C20666415tu) obj).LLJJIJI);
            }
        }, C736820SvI.LIZIZ(innerPushLeftVMMp2.usedInReusedScene), null, new C1402370mb5(this, 2));
    }
}
