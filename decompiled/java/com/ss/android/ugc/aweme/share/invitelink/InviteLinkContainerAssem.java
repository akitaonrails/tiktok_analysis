package com.ss.android.ugc.aweme.share.invitelink;

import X.C019F;
import X.C01GW;
import X.C0ZBQ;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS296S0000000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class InviteLinkContainerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(InviteLinkContainerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/share/invitelink/InviteLinkVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public InviteLinkContainerAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C0ZBQ.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InviteLinkVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1845), AFwS257S0000000_19.get$arr$(312), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1844));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1846));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1843));
    }

    public final InviteLinkVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (InviteLinkVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LLILLL;
            }
        }, null, new AwS633S0100000_19(this, 91), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LLILZIL;
            }
        }, null, new AwS633S0100000_19(this, 92), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hoG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218370hoJ) obj).LLILZ;
            }
        }, null, AFwS296S0000000_12.get$arr$(7), 6);
    }
}
