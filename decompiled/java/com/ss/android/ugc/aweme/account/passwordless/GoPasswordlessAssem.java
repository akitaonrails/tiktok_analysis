package com.ss.android.ugc.aweme.account.passwordless;

import X.C01D1;
import X.C01GW;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1637806bA;
import X.C1678420tmK;
import X.C19331610k6;
import X.C19331910k9;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C985403tE;
import X.DialogC1389620mGW;
import X.EnumC1888140zEa;
import X.InterfaceC2217461Bqa;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS642S0100000_28;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
public final class GoPasswordlessAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C1397510mTF LLJJ;
    public C1397510mTF LLJJI;
    public DialogC1389620mGW LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GoPasswordlessAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/passwordless/GoPasswordlessViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GoPasswordlessAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GoPasswordlessViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS572S0100000_28(c19719912DlLIZ, 119), AFwS271S0000000_28.get$arr$(26), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 120));
        this.LLJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 117));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 121));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 116));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 115));
        this.LLJILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 114));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C1678420tmK.LIZ.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        C20684815ws.LJIILLIIL("remove_password_show", c2344009Gk.LIZ);
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_fill_ltr;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 118));
            c0om1.LJ(c1251150ifB);
            ((TuxNavBar) this.LLJ.getValue()).setNavActions(c0om1);
            Ho(R.raw.icon_navi, 2131821317);
            Ho(R.raw.icon_shield_plus, 2131821318);
            String string = c19egLIZ.getString(2131821311);
            String string2 = c19egLIZ.getString(2131821312);
            int iLJJJ = a0.LJJJ(string, string2, 0, false, 6);
            int length = string2.length() + iLJJJ;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            C786410Ut5.q2(spannableStringBuilder, new C19331610k6(c19egLIZ, this, 2), iLJJJ, length, 33);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, c19egLIZ);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), iLJJJ, length, 33);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            c1397580mTM.LJI(c19egLIZ.getString(2131821293));
            c1397580mTM.LIZIZ(c19egLIZ.getString(2131821292));
            C985403tE.LIZ(c1397580mTM, new AwS394S0200000_28(c19egLIZ, this, 12));
            c1397580mTM.LIZLLL(new AwS607S0100000_28(this, 50));
            this.LLJJ = new C1397510mTF(c1397580mTM);
            C1397580mTM c1397580mTM2 = new C1397580mTM(c19egLIZ);
            c1397580mTM2.LIZIZ(c19egLIZ.getString(2131821300));
            C985403tE.LIZ(c1397580mTM2, new AwS607S0100000_28(c19egLIZ, 51));
            c1397580mTM2.LIZLLL(new AwS607S0100000_28(this, 52));
            this.LLJJI = new C1397510mTF(c1397580mTM2);
            ((TextView) this.LLJILJILJ.getValue()).setText(spannableStringBuilder);
            ((TextView) this.LLJILJILJ.getValue()).setMovementMethod(C431260Gvc.LIZ);
            this.LLJJIII = new DialogC1389620mGW(c19egLIZ);
            C736680Sv4.LJIIIIZZ(this, Lo(), new C2217381BqS() { // from class: X.0zEd
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1678380tmG) obj).LL;
                }
            }, null, new AwS642S0100000_28(this, 10), 6);
            c19egLIZ.getOnBackPressedDispatcher().LIZIZ(new C19331910k9(this, 0));
        }
    }

    public final ImageView Jo() {
        return (ImageView) this.LLJI.getValue();
    }

    public final GoPasswordlessViewModel Lo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (GoPasswordlessViewModel) assemVMLazy.getValue();
    }

    public final void Go() {
        if (Lo().getState().LL == EnumC1888140zEa.CONFIRM_PAGE) {
            C1678420tmK.LIZ.getClass();
            C1678420tmK.LIZIZ("back");
        } else {
            C1678420tmK.LIZ.getClass();
            C1678420tmK.LIZ("back");
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            c19egLIZ.finish();
        }
    }

    public final void Ho(int i, int i2) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            View viewTd = C786410Ut5.Td(c19egLIZ.getLayoutInflater(), R.layout.y_, (ViewGroup) this.LLJILJIL.getValue(), false);
            TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.k55);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setImageDrawable(c419910GdJ.LIZ(c19egLIZ));
            ((TextView) viewTd.findViewById(R.id.xrk)).setText(c19egLIZ.getString(i2));
            ((ViewGroup) this.LLJILJIL.getValue()).addView(viewTd);
        }
    }
}
