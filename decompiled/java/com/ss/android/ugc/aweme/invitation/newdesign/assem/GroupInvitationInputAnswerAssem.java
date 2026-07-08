package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.C019F;
import X.C01GW;
import X.C0H25;
import X.C1231630i9h;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import X.ViewOnLayoutChangeListenerC1265870j2v;
import Y.ARunnableS106S0100000_6;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationInputAnswerAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public TuxTextView LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final ViewOnLayoutChangeListenerC1265870j2v LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationInputAnswerAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationInputAnswerAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 454), AFwS257S0000000_19.get$arr$(219), null, true);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1586));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1590));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1588));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1585));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1589));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 453));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1587));
        this.LLJJIJIL = new ViewOnLayoutChangeListenerC1265870j2v(this, 0);
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final GroupInvitationVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (GroupInvitationVM) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C0H25 c0h25 = (C0H25) this.LLJJIJI.getValue();
        if (c0h25 != null) {
            c0h25.onPause();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C0H25 c0h25 = (C0H25) this.LLJJIJI.getValue();
        if (c0h25 != null) {
            c0h25.onResume();
        }
        HandlerHook.viewPostDelay(LJJIJL(), new ARunnableS106S0100000_6(this, 81), 500L);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0i76
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0i8I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1230460i7o) obj).LLILLJJLI);
            }
        }, null, new AwS668S0100000_19(this, 39), 12);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hxK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LLJI;
            }
        }, null, new AwS633S0100000_19(this, 230), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0i8M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LLJIJIL;
            }
        }, null, new AwS633S0100000_19(this, 231), 6);
        C0H25 c0h25 = (C0H25) this.LLJJIJI.getValue();
        if (c0h25 != null) {
            c0h25.LJJIIJ((C1231630i9h) this.LLJJIJIIJIL.getValue());
        }
    }
}
