package com.ss.android.ugc.aweme.detailpage.audit.assem;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C1219490hq7;
import X.C1221540htQ;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736820SvI;
import X.EnumC638250P1r;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.detailpage.audit.viewmodel.AuditRequestListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class AuditRequestNavAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1219490hq7.class, null), checkSupervisorPrepared());
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 993));
    public final AssemVMLazy LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AuditRequestNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/audit/viewmodel/AuditRequestListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AuditRequestNavAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AuditRequestListViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 994), AFwS257S0000000_19.get$arr$(138), null, true);
    }

    public final TuxNavBar Go() {
        return (TuxNavBar) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        boolean z;
        Integer numLIZJ;
        super.onViewCreated(view);
        TuxNavBar tuxNavBarGo = Go();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZIZ = "tag_left_arrow";
        c1251150ifB.LJI = true;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 3153));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = Go().getContext().getString(2131830179);
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[2];
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_lines_horizontal_decrease_alt;
        c1251150ifB2.LIZIZ = "tag_right_option";
        if (((C1219490hq7) this.LLIZLLLIL.getValue()).LLILLL > 0) {
            z = true;
        } else {
            z = false;
        }
        c1251150ifB2.LJI = z;
        c1251150ifB2.LIZJ(new AwS563S0100000_19(this, 3154));
        abstractC1250290idnArr[0] = c1251150ifB2;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = Go().getContext().getString(2131830190);
        c1250300ido.LIZIZ = "tag_right_cancel";
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LJFF = false;
        c1250300ido.LIZ(new AwS563S0100000_19(this, 3155));
        abstractC1250290idnArr[1] = c1250300ido;
        c0om1.LIZIZ(abstractC1250290idnArr);
        tuxNavBarGo.setNavActions(c0om1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bk, context)) != null) {
            Go().setNavBackground(numLIZJ.intValue());
        }
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        selectSubscribe(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0hnQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0hnp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1218060hno) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0hnY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1218060hno) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0hnO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LLILZIL;
            }
        }, new C2217381BqS() { // from class: X.0hnT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218060hno) obj).LL;
            }
        }, C736820SvI.LIZLLL(), null, new C1221540htQ(this));
    }
}
