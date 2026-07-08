package com.ss.android.ugc.profile.business.ur.editprofileassem;

import X.C019F;
import X.C01GW;
import X.C1120904Zz;
import X.C1155230gAT;
import X.C11G4;
import X.C1215420hjY;
import X.C1215970hkR;
import X.C127K;
import X.C1383370m6R;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1EDI;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1121004a0;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.profile.business.ur.editprofileviewmodel.EditProfileAiMeViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class EditProfileAiMeCellAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public C127K LLJ;
    public final C1559260qg8 LLJI;
    public final C01GW LLJIJIL;
    public final C1215420hjY LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditProfileAiMeCellAssem.class, "editProfileAiMeViewModel", "getEditProfileAiMeViewModel()Lcom/ss/android/ugc/profile/business/ur/editprofileviewmodel/EditProfileAiMeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0hjY] */
    public EditProfileAiMeCellAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EditProfileAiMeViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), C019F.LIZ, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2250), AFwS257S0000000_19.get$arr$(393), null, true);
        this.LLJI = new C1559260qg8(new C723590SZx(this, C1155230gAT.class, null), checkSupervisorPrepared());
        this.LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(425));
        this.LLJILJIL = new InterfaceC1121004a0() { // from class: X.0hjY
            @Override // X.InterfaceC1121004a0
            public final void LJFF() {
                if (((Boolean) this.LIZ.LLJIJIL.getValue()).booleanValue()) {
                    this.LIZ.Go().wQ2();
                }
            }
        };
    }

    public final EditProfileAiMeViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (EditProfileAiMeViewModel) assemVMLazy.getValue();
    }

    public final void Ho() {
        String string;
        Context context = getContext();
        if (context == null) {
            return;
        }
        if (C1EDI.LJ()) {
            string = C1383370m6R.LJIIJ(2131838881);
        } else {
            Resources resources = context.getResources();
            string = resources.getString(2131825912, resources.getString(2131825841));
        }
        if (C1EDI.LJ()) {
            C127K c127k = this.LLJ;
            if (c127k != null) {
                C1215970hkR.LIZJ(c127k, string, false);
                return;
            }
            return;
        }
        C127K c127k2 = this.LLJ;
        if (c127k2 != null) {
            C1215970hkR.LJ(c127k2, string, false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((ArrayList) C1120904Zz.LIZ).remove(this.LLJILJIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C127K c127k;
        C11G4 c11g4LIZ;
        View view2;
        LinearLayout linearLayout;
        super.onViewCreated(view);
        Object parent = null;
        if ((view instanceof C127K) && (c127k = (C127K) view) != null) {
            this.LLJ = c127k;
            Ho();
            ((ArrayList) C1120904Zz.LIZ).add(this.LLJILJIL);
            if (!((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
                C127K c127k2 = this.LLJ;
                if (c127k2 != null) {
                    C786410Ut5.LLZLL(c127k2, 8);
                    return;
                }
                return;
            }
            if (C1EDI.LJ()) {
                C127K c127k3 = this.LLJ;
                if (c127k3 != null) {
                    parent = c127k3.getParent();
                }
                if ((parent instanceof LinearLayout) && (view2 = (View) parent) != null && (linearLayout = (LinearLayout) view2.findViewById(R.id.jk4)) != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
            }
            C127K c127k4 = this.LLJ;
            if (c127k4 != null && (c11g4LIZ = C1215970hkR.LIZ(c127k4)) != null) {
                c11g4LIZ.LJIILL(new ACListenerS154S0100000_19(this, 244));
            }
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hjZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C566280MIw) obj).LL;
                }
            }, null, new AwS633S0100000_19(this, 132), 6);
            Go().wQ2();
        }
    }
}
