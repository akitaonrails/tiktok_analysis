package com.ss.android.ugc.aweme.groupcreation.assem;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C1228650i4t;
import X.C13LE;
import X.C1527305yR;
import X.C1528205ya;
import X.C1559260qg8;
import X.C1588006Jq;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1228990i5R;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.groupcreation.vm.UnifiedGroupCreationVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class GroupCategorySelectorAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723590SZx(this, C1527305yR.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1478));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1479));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1481));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1480));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1482));
    public final AssemVMLazy LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupCategorySelectorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/groupcreation/vm/UnifiedGroupCreationVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GroupCategorySelectorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(UnifiedGroupCreationVM.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1483), AFwS257S0000000_19.get$arr$(170), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.chw;
    }

    public final void hp(EnumC1228990i5R enumC1228990i5R) {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        if (enumC1228990i5R != ((C1588006Jq) assemVMLazy.getValue().getState()).LL) {
            this.LLJJJIL.getValue().setState(new AwS581S0100000_2(enumC1228990i5R, 439));
            C1528205ya.LIZIZ(((C1228650i4t) this.LLJJIII.getValue()).LIZ, enumC1228990i5R.getMobValue(), C0I0B.LJFF.LIZIZ());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C786410Ut5.Y7((ConstraintLayout) this.LLJJIJI.getValue(), new ACListenerS154S0100000_19(this, 106));
        C786410Ut5.Y7((ConstraintLayout) this.LLJJIJIIJIL.getValue(), new ACListenerS154S0100000_19(this, 107));
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06Ig
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1588006Jq) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 44), 6);
    }

    public static void ip(ConstraintLayout constraintLayout, boolean z) {
        if (z) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a0c);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a0_);
            constraintLayout.setBackground(c384050F3z.LIZ(constraintLayout.getContext()));
            return;
        }
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        constraintLayout.setBackground(c384050F3z2.LIZ(constraintLayout.getContext()));
    }
}
