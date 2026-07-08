package com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem;

import X.C01GW;
import X.C03IJ;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A24;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC893080Z1u;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.IconActionViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS647S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ChatCircularIconAssem extends ChatActionAssem<C1A24> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final AssemVMLazy LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatCircularIconAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/sdk/chatdetail/refactor/viewmodel/IconActionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ChatCircularIconAssem() {
        C03IJ c03ij = C03IJ.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IconActionViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c03ij, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 633), AFwS279S0000000_33.get$arr$(170), null, true);
        this.LLJJIJIL = C1509305vX.LIZ(new AwS568S0100000_24(this, 631));
        this.LLJJJ = C1509305vX.LIZ(new AwS568S0100000_24(this, 632));
        this.LLJJJIL = C1509305vX.LIZ(new AwS568S0100000_24(this, 634));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cft;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void op() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.1A1o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C2172731A1n) obj).LL);
            }
        }, C736820SvI.LIZLLL(), new AwS647S0100000_33(this, 14), 4);
        hp().LLJI.invoke((BaseActionViewModel<?>) this.LLJJIJIIJIL.getValue(), (InterfaceC893080Z1u) this.LLJJIII.getValue());
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final View ip() {
        return (View) this.LLJJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final BaseActionViewModel kp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (BaseActionViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatActionAssem
    public final void mp() {
        ((TuxIconView) this.LLJJJ.getValue()).setIconRes(Integer.valueOf(hp().LLIZ.LIZJ).intValue());
        ((TextView) this.LLJJJIL.getValue()).setText(C1383370m6R.LJIIJJI(hp().LLIZ.LIZIZ().intValue()));
    }
}
