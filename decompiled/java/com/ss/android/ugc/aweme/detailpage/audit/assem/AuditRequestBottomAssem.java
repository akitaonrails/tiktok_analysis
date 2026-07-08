package com.ss.android.ugc.aweme.detailpage.audit.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS341S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestBottomAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 986));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 985));
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuditRequestBottomAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/audit/viewmodel/AuditRequestListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AuditRequestBottomAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuditRequestListViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 987), AFwS257S0000000_19.get$arr$(136), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cj2;
    }

    public final AuditRequestListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (AuditRequestListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIZ(this, hp(), new C2217381BqS() { // from class: X.0hnS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0hnP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AFwS341S0000000_19.get$arr$(2), 8);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0hnN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILZIL;
            }
        }, null, new AwS633S0100000_19(this, 37), 6);
        C786410Ut5.I7(new AbS509S0200000_19(this, view, 2), (View) this.LLJJI.getValue());
        C786410Ut5.I7(new AbS509S0200000_19(this, view, 3), (View) this.LLJJIII.getValue());
    }
}
