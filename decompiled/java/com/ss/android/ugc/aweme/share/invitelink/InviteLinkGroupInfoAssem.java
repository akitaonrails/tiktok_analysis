package com.ss.android.ugc.aweme.share.invitelink;

import X.C019F;
import X.C01GW;
import X.C0ZBQ;
import X.C13LE;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS700S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteLinkGroupInfoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C0ZBQ.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 1849));
    public final C01GW LLJI = C1509305vX.LIZ(new AwS563S0100000_19(this, 1847));
    public final C01GW LLJIJIL = C1509305vX.LIZ(new AwS563S0100000_19(this, 1851));
    public final C01GW LLJILJIL = C1509305vX.LIZ(new AwS563S0100000_19(this, 1850));
    public final C01GW LLJILJILJ = C1509305vX.LIZ(new AwS563S0100000_19(this, 1848));
    public final AssemVMLazy LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InviteLinkGroupInfoAssem.class, "inviteLinkVM", "getInviteLinkVM()Lcom/ss/android/ugc/aweme/share/invitelink/InviteLinkVM;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InviteLinkGroupInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InviteLinkVM.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1852), AFwS257S0000000_19.get$arr$(313), null, true);
    }

    public final InviteLinkVM Go() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        return (InviteLinkVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View view2 = (View) this.LLJ.getValue();
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zz);
        c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        view2.setBackground(c384050F3z.LIZ(((View) this.LLJ.getValue()).getContext()));
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 98), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LLILLJJLI;
            }
        }, null, new AwS628S0100000_14(this, 99), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LLILLL;
            }
        }, null, new AwS633S0100000_19(this, 304), 6);
        C786410Ut5.I7(new AbS700S0100000_19(this, 4), (View) this.LLJ.getValue());
    }
}
