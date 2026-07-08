package com.ss.android.ugc.aweme.invitation.newdesign.assem;

import X.AbstractC1230540i7w;
import X.C019F;
import X.C01GW;
import X.C1266280j3a;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.invitation.newdesign.vm.GroupInvitationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS331S0300000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupInvitationConfirmBtnAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, AbstractC1230540i7w.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupInvitationConfirmBtnAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/invitation/newdesign/vm/GroupInvitationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupInvitationConfirmBtnAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GroupInvitationVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1576), AFwS257S0000000_19.get$arr$(217), null, true);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1575));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cip;
    }

    public final GroupInvitationVM ip() {
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (GroupInvitationVM) assemVMLazy.getValue();
    }

    public final void hp(boolean z) {
        int i;
        View viewLJJIJL = LJJIJL();
        int paddingStart = LJJIJL().getPaddingStart();
        int paddingTop = LJJIJL().getPaddingTop();
        int paddingEnd = LJJIJL().getPaddingEnd();
        if (z) {
            i = 12;
        } else {
            i = 0;
        }
        viewLJJIJL.setPadding(paddingStart, paddingTop, paddingEnd, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        GroupInvitationVM groupInvitationVMIp = ip();
        selectSubscribe(groupInvitationVMIp, new C2217381BqS() { // from class: X.0i8G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1230460i7o) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0i8K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0i75
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1230460i7o) obj).LL;
            }
        }, C736820SvI.LIZIZ(groupInvitationVMIp.usedInReusedScene), null, new C1266280j3a(this, 5));
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0i8H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1230460i7o) obj).LLILZLL);
            }
        }, null, new AwS633S0100000_19(this, 228), 6);
        AbstractC1230540i7w abstractC1230540i7w = (AbstractC1230540i7w) this.LLJJI.getValue();
        if (abstractC1230540i7w != null) {
            C197039127h c197039127h = (C197039127h) this.LLJJIJI.getValue();
            C786410Ut5.I7(new AbS331S0300000_19(this, abstractC1230540i7w, c197039127h, 1), c197039127h);
        }
        if (!ip().wQ2()) {
            hp(true);
        } else {
            hp(false);
        }
    }
}
