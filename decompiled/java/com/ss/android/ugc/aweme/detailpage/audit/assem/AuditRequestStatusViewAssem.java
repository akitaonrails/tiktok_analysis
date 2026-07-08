package com.ss.android.ugc.aweme.detailpage.audit.assem;

import X.C019F;
import X.C01GW;
import X.C0HTI;
import X.C13LE;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.Drawable;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestStatusViewAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 995));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 997));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuditRequestStatusViewAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/audit/viewmodel/AuditRequestListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AuditRequestStatusViewAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuditRequestListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 996), AFwS257S0000000_19.get$arr$(139), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        C1749280vcc c1749280vcc = (C1749280vcc) this.LLJ.getValue();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.my;
        Drawable drawableLIZ = c0hti.LIZ(LJJIJL().getContext());
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJFF = 2131830149;
        c1722300uv6.LJII = 2131828480;
        c1749280vcc.setStatus(c1722300uv6);
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hnu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LL;
            }
        }, null, new AwS633S0100000_19(this, 38), 6);
    }
}
