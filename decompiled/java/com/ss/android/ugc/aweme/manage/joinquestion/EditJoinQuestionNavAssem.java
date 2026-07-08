package com.ss.android.ugc.aweme.manage.joinquestion;

import X.C019F;
import X.C01GW;
import X.C0OM1;
import X.C0R96;
import X.C1250250idj;
import X.C1250280idm;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class EditJoinQuestionNavAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditJoinQuestionNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/manage/joinquestion/EditJoinQuestionViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditJoinQuestionNavAssem() {
        checkSupervisorPrepared();
        new C723580SZw(this, C0R96.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditJoinQuestionViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 360), AFwS256S0000000_18.get$arr$(124), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS562S0100000_18(this, 359));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBar = (TuxNavBar) this.LLJ.getValue();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 2558));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131831359);
        c0om1.LIZJ = c1250250idj;
        TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setText(C1383370m6R.LJIIJ(2131831356));
        tuxTextView.setTextColorRes(R.attr.a1r);
        tuxTextView.setTuxFont(102);
        tuxTextView.setGravity(17);
        tuxTextView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0, 0);
        C1250280idm c1250280idm = new C1250280idm();
        c1250280idm.LIZJ = tuxTextView;
        c1250280idm.LIZLLL = true;
        c1250280idm.LIZIZ = "nav_action_done";
        c0om1.LIZIZ(c1250280idm);
        tuxNavBar.setNavActions(c0om1);
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0gPX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1159280gH0) obj).LL);
            }
        }, null, new AwS632S0100000_18(this, 41), 6);
    }
}
