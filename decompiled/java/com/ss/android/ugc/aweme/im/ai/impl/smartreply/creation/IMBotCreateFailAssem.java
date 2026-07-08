package com.ss.android.ugc.aweme.im.ai.impl.smartreply.creation;

import X.C019F;
import X.C061Z;
import X.C0HTI;
import X.C13LE;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C337180DJs;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS137S0100000_2;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class IMBotCreateFailAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMBotCreateFailAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/ai/impl/smartreply/creation/IMAIBotCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public IMBotCreateFailAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IMAIBotCreationVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 256), AFwS229S0000000_2.get$arr$(211), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ceh;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        View viewFindViewById = LJJIJL().findViewById(R.id.hjo);
        if (viewFindViewById != null) {
            AssemVMLazy assemVMLazy = this.LLJJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
            if (((C061Z) assemVMLazy.getValue().getState()).LL == 3) {
                C337180DJs.LIZJ(viewFindViewById);
            } else {
                C337180DJs.LIZ(viewFindViewById);
            }
        }
        TuxIconView tuxIconView = (TuxIconView) LJJIJL().findViewById(R.id.hjn);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 16));
        }
        C197039127h c197039127h = (C197039127h) LJJIJL().findViewById(R.id.yl9);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 17));
        }
        TuxIconView tuxIconView2 = (TuxIconView) LJJIJL().findViewById(R.id.hjq);
        if (tuxIconView2 != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            tuxIconView2.setImageDrawable(c0hti.LIZ(tuxIconView2.getContext()));
        }
        AssemVMLazy assemVMLazy2 = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy2.getValue(), new C2217381BqS() { // from class: X.06IV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C061Z) obj).LL);
            }
        }, null, AFwS285S0000000_2.get$arr$(11), 6);
    }
}
