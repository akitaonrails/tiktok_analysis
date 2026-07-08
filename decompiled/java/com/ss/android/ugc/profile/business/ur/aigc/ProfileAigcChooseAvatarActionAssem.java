package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01GW;
import X.C1221150hsn;
import X.C1221180hsq;
import X.C1221190hsr;
import X.C1221530htP;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1221200hss;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS154S0100000_19;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcChooseAvatarActionAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public View LLJI;
    public TuxSpinner LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public TuxTextView LLJILLL;
    public View LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseAvatarActionAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseAvatarActionAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2198), AFwS257S0000000_19.get$arr$(363), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C1221530htP.class, "hierarchy_data_choose_avatar"), checkSupervisorPrepared());
        this.LLJJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(404));
        this.LLJJIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(405));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2197));
    }

    public final ProfileAigcAvatarViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Jo() {
        View view = this.LLJJ;
        if (view != null) {
            int i = C1221190hsr.LIZ[((EnumC1221200hss) this.LLJJIJI.getValue()).ordinal()];
            if (i == 1) {
                Ho(view, (TuxTextView) view.findViewById(R.id.dnd), ((C1221150hsn) Go().getState()).LLILLL.LIZ != null);
            } else if (i == 2) {
                Ho(view, (TuxTextView) view.findViewById(R.id.dne), ((C1221150hsn) Go().getState()).LLILLL.LIZ != null);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = LJJIJL().findViewById(R.id.a24);
        this.LLJIJIL = (TuxSpinner) LJJIJL().findViewById(R.id.a28);
        this.LLJILJIL = (TuxTextView) LJJIJL().findViewById(R.id.a2_);
        View view2 = null;
        if (this.LLJJIJI.getValue() == EnumC1221200hss.MULTIPLE_HORIZONTAL) {
            View view3 = this.LLJI;
            if (view3 == null) {
                view3 = null;
            }
            C786410Ut5.LJLLLLLL(4, view3);
            this.LLJILJILJ = C786410Ut5.LJLLLL((ViewStub) LJJIJL().findViewById(R.id.jr3));
            this.LLJILLL = (TuxTextView) LJJIJL().findViewById(R.id.f72);
            this.LLJJ = LJJIJL().findViewById(R.id.dnc);
            Jo();
        } else if (this.LLJJIJI.getValue() == EnumC1221200hss.MULTIPLE_VERTICAL) {
            View view4 = this.LLJI;
            if (view4 == null) {
                view4 = null;
            }
            C786410Ut5.LJLLLLLL(4, view4);
            this.LLJILJILJ = C786410Ut5.LJLLLL((ViewStub) LJJIJL().findViewById(R.id.vertical_buttons));
            this.LLJILLL = (TuxTextView) LJJIJL().findViewById(R.id.f73);
            this.LLJJ = LJJIJL().findViewById(R.id.dnf);
            Jo();
        }
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
        ProfileAigcAvatarViewModel profileAigcAvatarViewModelGo = Go();
        selectSubscribe(profileAigcAvatarViewModelGo, new C2217381BqS() { // from class: X.0hsf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZ;
            }
        }, new C2217381BqS() { // from class: X.0hsd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.0hse
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0hsp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLIZLLLIL;
            }
        }, new C2217381BqS() { // from class: X.0hso
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLIZ;
            }
        }, C736820SvI.LIZIZ(profileAigcAvatarViewModelGo.usedInReusedScene), null, new C1221180hsq(this, view));
        View view5 = this.LLJI;
        if (view5 != null) {
            view2 = view5;
        }
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 154), view2);
        View view6 = this.LLJJ;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS154S0100000_19(this, 155), view6);
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS154S0100000_19(this, 153));
        }
    }

    public final void Ho(View view, TuxTextView tuxTextView, boolean z) {
        view.setEnabled(z);
        if (z) {
            view.setBackground(((C384050F3z) this.LLJJIII.getValue()).LIZ(view.getContext()));
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.ee);
                return;
            }
            return;
        }
        view.setBackground(((C384050F3z) this.LLJJI.getValue()).LIZ(view.getContext()));
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setTextColorRes(R.attr.a1p);
    }
}
