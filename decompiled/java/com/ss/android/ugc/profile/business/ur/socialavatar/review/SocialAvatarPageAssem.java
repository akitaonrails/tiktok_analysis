package com.ss.android.ugc.profile.business.ur.socialavatar.review;

import X.C019F;
import X.C01GW;
import X.C0HBO;
import X.C0HFR;
import X.C0HFS;
import X.C0HFV;
import X.C0PEM;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2277121EBa;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarPageAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SocialAvatarPageAssem.class, "avatarViewModel", "getAvatarViewModel()Lcom/ss/android/ugc/profile/business/ur/socialavatar/review/SocialAvatarEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SocialAvatarPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SocialAvatarEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 945), AFwS236S0000000_6.get$arr$(385), null, true);
        this.LLJ = new C1559260qg8(new C723580SZw(this, C0HFR.class, null), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 938));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 942));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 943));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 936));
        this.LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 934));
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 944));
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 935));
        this.LLJJIII = C452501pT.LIZIZ(new AwS550S0100000_6(this, 941));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 940));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 932));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 930));
        this.LLJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 931));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 933));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 937));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 939));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(378));
    }

    public final SocialAvatarEditViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (SocialAvatarEditViewModel) assemVMLazy.getValue();
    }

    public final void Ho(C0HFS c0hfs) {
        View viewLJJIJL = LJJIJL();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(C13LP.LLII(c0hfs.LIZJ.LIZIZ));
        viewLJJIJL.setBackground(gradientDrawable);
        ((View) this.LLJJIJIIJIL.getValue()).animate().alpha(0.0f).setDuration(50L).start();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19egLIZ);
            TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19egLIZ, immersionBarLJIILJJIL);
            tuxImmersionBar.LIZ(false);
            immersionBarLJIILJJIL.LJIIJ(true);
            immersionBarLJIILJJIL.LJII(true);
            tuxImmersionBar.LJIIJJI();
            tuxImmersionBar.LIZLLL();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C0HBO(this, c0hfs, null), 2);
    }

    public final void Jo(Integer num) {
        String string;
        C0HFR c0hfr = (C0HFR) this.LLJ.getValue();
        if (c0hfr != null && c0hfr.LL) {
            Context context = getContext();
            if (context != null && (string = context.getString(2131848579)) != null) {
                TuxTextView tuxTextView = (TuxTextView) this.LLJJJJ.getValue();
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                tuxTextView.setText(string);
                tuxTextView.setMaxLines(3);
                tuxTextView.setTextAlignment(4);
                tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)));
                tuxTextView.setMaxWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220)));
                tuxTextView.LJJJJI(28.0f);
                if (num != null) {
                    tuxTextView.setTextColor(num.intValue());
                }
            }
            C786410Ut5.LLLLZLL((TuxTextView) this.LLJJI.getValue(), 8);
            if (C2277121EBa.LIZ()) {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJILLL.getValue(), 0);
                return;
            } else {
                C786410Ut5.LLLLLLZZ((TuxIconView) this.LLJILLL.getValue(), 8);
                return;
            }
        }
        ((TuxIconView) this.LLJILJILJ.getValue()).setIconRes(R.raw.icon_chevron_left_offset_ltr);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C19EG c19egLIZ;
        Window window;
        C0HFV c0hfv;
        List<Integer> list;
        Integer num;
        super.onViewCreated(view);
        ((C197039127h) this.LLJJ.getValue()).LJJJJL(new AwS580S0100000_1(this, 1));
        ((TuxTextView) this.LLJJIII.getValue()).setTuxFont(102);
        ((TuxTextView) this.LLJILJIL.getValue()).setTuxFont(102);
        C0HFS c0hfs = (C0HFS) C13LP.LJJLIIIJL(Go().wQ2());
        if (c0hfs != null && (c0hfv = c0hfs.LIZJ) != null && (list = c0hfv.LIZIZ) != null && (num = (Integer) C13LP.LJJJLL(list)) != null) {
            LJJIJL().setBackgroundColor(num.intValue());
        }
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJIIJIL.getValue());
        if (Build.VERSION.SDK_INT >= 29 && (c19egLIZ = C724240Sb0.LIZ(this)) != null && (window = c19egLIZ.getWindow()) != null) {
            window.setNavigationBarContrastEnforced(false);
        }
        Jo(null);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0HFo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLILZ;
            }
        }, null, new AwS620S0100000_6(this, 0), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0HGa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HNI) obj).LLJILJILJ;
            }
        }, C736820SvI.LIZLLL(), new AwS620S0100000_6(this, 1), 4);
    }
}
