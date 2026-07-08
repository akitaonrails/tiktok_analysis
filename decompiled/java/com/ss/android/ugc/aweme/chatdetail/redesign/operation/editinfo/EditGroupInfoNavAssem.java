package com.ss.android.ugc.aweme.chatdetail.redesign.operation.editinfo;

import X.C019F;
import X.C01GW;
import X.C0ZBR;
import X.C1250250idj;
import X.C1250280idm;
import X.C1250300ido;
import X.C1308910kAL;
import X.C1383370m6R;
import X.C13LE;
import X.C1509305vX;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC638250P1r;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class EditGroupInfoNavAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditGroupInfoNavAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/chatdetail/redesign/operation/editinfo/EditGroupInfoViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public EditGroupInfoNavAssem() {
        checkSupervisorPrepared();
        new C723590SZx(this, C0ZBR.class, null);
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditGroupInfoViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 137), AFwS248S0000000_14.get$arr$(39), null, true);
        this.LLJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 136));
    }

    public final TuxNavBar Go() {
        return (TuxNavBar) this.LLJ.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Integer numLIZJ;
        super.onViewCreated(view);
        Go().LJIIZILJ(false);
        TuxNavBar tuxNavBarGo = Go();
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = C1383370m6R.LJIIJ(2131831438);
        c1250300ido.LJ = true;
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS558S0100000_14(this, 1801));
        tuxNavBarGo.LIZIZ(c1250300ido);
        TuxNavBar tuxNavBarGo2 = Go();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1383370m6R.LJIIJ(2131831352);
        tuxNavBarGo2.LJIJJ(c1250250idj);
        TuxTextView tuxTextView = new TuxTextView(LJJIJL().getContext(), null, 6, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        tuxTextView.setText(C1383370m6R.LJIIJ(2131831398));
        tuxTextView.setTextColorRes(R.attr.a1r);
        tuxTextView.setTuxFont(102);
        tuxTextView.setGravity(17);
        tuxTextView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, 0, 0);
        TuxNavBar tuxNavBarGo3 = Go();
        C1250280idm c1250280idm = new C1250280idm();
        c1250280idm.LIZJ = tuxTextView;
        c1250280idm.LIZLLL = true;
        c1250280idm.LIZIZ = "save";
        tuxNavBarGo3.LIZ(c1250280idm);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            Go().setNavBackground(numLIZJ.intValue());
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0ZBS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0ZBZ) obj).LLJIJIL);
            }
        }, null, new AwS628S0100000_14(this, 10), 6);
    }
}
