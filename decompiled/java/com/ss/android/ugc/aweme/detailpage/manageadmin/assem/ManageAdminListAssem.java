package com.ss.android.ugc.aweme.detailpage.manageadmin.assem;

import X.AnonymousClass0208;
import X.C019F;
import X.C01GW;
import X.C0ZFW;
import X.C13LE;
import X.C1618006Ve;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC497601wk;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detailpage.manageadmin.view.ManageAdminCell;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import wh6.AbS509S0200000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ManageAdminListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1035));
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ManageAdminListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/detailpage/manageadmin/viewmodel/ManageAdminViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ManageAdminListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ManageAdminViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1036), AFwS257S0000000_19.get$arr$(145), null, true);
        this.LLJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(100));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ManageAdminViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (ManageAdminViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        C23250099c.LIZLLL((InterfaceC497601wk) this.LLJI.getValue(), null, null, new C1618006Ve(this, null), 3);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ManageAdminCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hnn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218020hnk) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 298), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hnl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218020hnk) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(58), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hnj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218020hnk) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(59), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hnm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1218020hnk) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AnonymousClass0208.get$arr$(60), 4);
        if (C0ZFW.LJIJ(Go().vQ2().LL)) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.cir, (ViewGroup) this.LLIZLLLIL.getValue(), false);
            View viewFindViewById = viewTd.findViewById(R.id.act);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
            C427690Gpr.LJ(viewTd, 0.0f);
            ((ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue()).LJ(0, viewTd);
            C786410Ut5.I7(new AbS509S0200000_19(this, viewTd, 11), viewTd);
        }
        View viewLJJIJL = LJJIJL();
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.zo);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        viewLJJIJL.setBackground(c384050F3z2.LIZ(viewLJJIJL.getContext()));
    }
}
