package com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation;

import X.C019F;
import X.C06I1;
import X.C1295960jpS;
import X.C13LE;
import X.C15384060o;
import X.C15386060q;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C337180DJs;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C960203pA;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBotCreateProgressAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMBotCreateProgressAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/creation/IMAIBotCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMBotCreateProgressAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMAIBotCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 258), AFwS229S0000000_2.get$arr$(213), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cej;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        View viewFindViewById = LJJIJL().findViewById(R.id.s92);
        if (viewFindViewById != null) {
            if (hp().getState().LL == 2) {
                C337180DJs.LIZJ(viewFindViewById);
            } else {
                C337180DJs.LIZ(viewFindViewById);
            }
        }
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.bnb);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 18));
        }
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.e1v);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 19));
        }
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06JC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C061Z) obj).LL);
            }
        }, null, AFwS285S0000000_2.get$arr$(12), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06JF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C061Z) obj).LLILZIL;
            }
        }, null, AFwS285S0000000_2.get$arr$(13), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06JE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C061Z) obj).LLILZ;
            }
        }, null, new AwS628S0100000_14(this, 12), 6);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.06JD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C061Z) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 27), 6);
        C1295960jpS c1295960jpS = (C1295960jpS) LJJIJL().findViewById(R.id.bwm);
        if (c1295960jpS != null) {
            C15386060q c15386060q = C960203pA.LIZIZ(c1295960jpS.getContext()) ? new C15386060q("im_aireply_bg_dark_lottie.json") : new C15386060q("im_aireply_bg_light_lottie.json");
            C06I1 c06i1 = C06I1.LIZIZ;
            AwS368S0200000_2 awS368S0200000_2 = new AwS368S0200000_2(c15386060q, c1295960jpS, 36);
            c06i1.getClass();
            String str = C06I1.LJII.get(c15386060q);
            if (str != null) {
                awS368S0200000_2.invoke(str);
            } else {
                C23250099c.LIZLLL(C06I1.LJI, null, null, new C15384060o(c15386060q, awS368S0200000_2, null), 3);
            }
        }
    }

    public final IMAIBotCreationVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (IMAIBotCreationVM) assemVMLazy.getValue();
    }
}
