package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileAigcChooseAvatarStickyFooterAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public View LLJ;
    public TuxIconView LLJI;
    public TuxSpinner LLJIJIL;
    public TuxTextView LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseAvatarStickyFooterAssem.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseAvatarStickyFooterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 2230), AFwS257S0000000_19.get$arr$(368), null, true);
    }

    public final ProfileAigcAvatarViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    public final void Ho(boolean z) {
        TuxTextView tuxTextView = null;
        if (z) {
            TuxIconView tuxIconView = this.LLJI;
            if (tuxIconView == null) {
                tuxIconView = null;
            }
            C786410Ut5.x5(tuxIconView, 1.0f);
            TuxTextView tuxTextView2 = this.LLJILJIL;
            if (tuxTextView2 != null) {
                tuxTextView = tuxTextView2;
            }
            C786410Ut5.B5(tuxTextView, 1.0f);
            return;
        }
        TuxIconView tuxIconView2 = this.LLJI;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        C786410Ut5.x5(tuxIconView2, 0.5f);
        TuxTextView tuxTextView3 = this.LLJILJIL;
        if (tuxTextView3 != null) {
            tuxTextView = tuxTextView3;
        }
        C786410Ut5.B5(tuxTextView, 0.5f);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = LJJIJL().findViewById(R.id.bjf);
        this.LLJ = viewFindViewById;
        View view2 = null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        this.LLJI = (TuxIconView) viewFindViewById.findViewById(R.id.nkt);
        View view3 = this.LLJ;
        if (view3 == null) {
            view3 = null;
        }
        this.LLJIJIL = (TuxSpinner) view3.findViewById(R.id.vuf);
        View view4 = this.LLJ;
        if (view4 != null) {
            view2 = view4;
        }
        this.LLJILJIL = (TuxTextView) view2.findViewById(R.id.text);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hsl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLILZLL;
            }
        }, null, new AwS633S0100000_19(this, 127), 6);
    }
}
