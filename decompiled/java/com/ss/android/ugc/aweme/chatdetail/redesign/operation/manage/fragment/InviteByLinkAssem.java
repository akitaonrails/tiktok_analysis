package com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment;

import X.C019F;
import X.C01GW;
import X.C1265910j2z;
import X.C127A;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C1695206kQ;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteByLinkAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InviteByLinkAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/manage/viewmodel/ManageGroupViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InviteByLinkAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageGroupViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 495), AFwS257S0000000_19.get$arr$(82), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 494));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C127K c127k = (C127K) this.LLJ.getValue();
        c127k.setTitle(C1383370m6R.LJIIJ(2131831424));
        c127k.setSubtitle(C1383370m6R.LJIIJ(2131831425));
        C127A c127a = new C127A(c127k.getContext());
        c127a.LJIILLIIL(new C1265910j2z(this, 1));
        c127k.setAccessory(c127a);
        C1695206kQ.LIZ(c127k);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hlo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLJ);
            }
        }, null, new AwS633S0100000_19(c127k, 29), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLIZLLLIL.getValue(), new C2217381BqS() { // from class: X.0hlk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1651206dK) obj).LLIZLLLIL);
            }
        }, null, new AwS633S0100000_19(c127k, 30), 6);
    }
}
