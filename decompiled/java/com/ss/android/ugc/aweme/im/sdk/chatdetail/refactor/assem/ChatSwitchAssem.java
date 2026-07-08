package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.C01GW;
import X.C03IJ;
import X.C0Z28;
import X.C127A;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C1695206kQ;
import X.C19719912Dl;
import X.C2172711A1l;
import X.C2189581Ami;
import X.C2217381BqS;
import X.C419910GdJ;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC893080Z1u;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.SwitchActionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ChatSwitchAssem extends ChatActionAssem<C0Z28> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C127A LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatSwitchAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/refactor/viewmodel/SwitchActionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatSwitchAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SwitchActionViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 643), AFwS279S0000000_33.get$arr$(176), null, true);
        this.LLJJIJIL = C1509305vX.LIZ(new AwS577S0100000_33(this, 2420));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cfv;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void op() {
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2172721A1m) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 16), 4);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.1A1k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2172721A1m) obj).LLILLJJLI);
            }
        }, null, new AwS647S0100000_33(this, 17), 6);
        hp().LLJI.invoke(kp(), (InterfaceC893080Z1u) this.LLJJIII.getValue());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    /* JADX INFO: renamed from: sp, reason: merged with bridge method [inline-methods] */
    public final C127K ip() {
        return (C127K) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    /* JADX INFO: renamed from: up, reason: merged with bridge method [inline-methods] */
    public final SwitchActionViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (SwitchActionViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void mp() {
        C127K c127kIp = ip();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = Integer.valueOf(tp().LIZJ).intValue();
        c419910GdJ.LJ = tp().LIZLLL != 0 ? Integer.valueOf(tp().LIZLLL) : tp().LJFF ? Integer.valueOf(R.attr.zs) : Integer.valueOf(R.attr.a1h);
        c127kIp.setIcon(c419910GdJ);
        String strLJIIJJI = C1383370m6R.LJIIJJI(tp().LIZIZ().intValue());
        if (strLJIIJJI.length() > 0) {
            ip().setTitle(strLJIIJJI);
        }
        if (this.LLJJJ == null) {
            C127A c127a = new C127A(ip().getContext());
            c127a.LJIILJJIL(tp().LJ);
            c127a.LJIILLIIL(new C2189581Ami(this, 0));
            this.LLJJJ = c127a;
            ip().setAccessory(this.LLJJJ);
            ip().setClickable(false);
            C1695206kQ.LIZ(ip());
        }
    }

    public final C2172711A1l tp() {
        return hp().LLIZ;
    }
}
