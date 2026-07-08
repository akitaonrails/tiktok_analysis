package com.ss.android.ugc.aweme.account.login.twostep;

import X.C01D1;
import X.C01GW;
import X.C0HTI;
import X.C0OM1;
import X.C0XQ5;
import X.C1233650iCx;
import X.C1233670iCz;
import X.C1233680iD0;
import X.C1237450iJ5;
import X.C1247340iZ2;
import X.C1251150ifB;
import X.C1389890mGx;
import X.C13LE;
import X.C1559260qg8;
import X.C1623706Xj;
import X.C1637806bA;
import X.C19293810e0;
import X.C197039127h;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS154S0100000_19;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedDispatcher;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class TwoStepVerificationActivityAssem extends UIListContentAssem<TwoStepVerificationActivityViewModel> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 185));
    public final AssemVMLazy LLJ;
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
    public final C1559260qg8 LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final TwoStepVerificationService LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TwoStepVerificationActivityAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepVerificationActivityViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TwoStepVerificationActivityAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TwoStepVerificationActivityViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 186), AFwS257S0000000_19.get$arr$(51), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 190));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 188));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 183));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 178));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 184));
        this.LLJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 177));
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 193));
        this.LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 179));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 189));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 194));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 187));
        this.LLJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 192));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 191));
        this.LLJJJJ = new C1559260qg8(new C723590SZx(this, C1233680iD0.class, "two_step_verification_management_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 181));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 175));
        this.LLJJL = (TwoStepVerificationService) C0XQ5.LIZIZ.LJFF();
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 195));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        return new C20603715jn();
    }

    public final TuxTextView Lo() {
        return (TuxTextView) this.LLJJIII.getValue();
    }

    public final C1233680iD0 No() {
        return (C1233680iD0) this.LLJJJJ.getValue();
    }

    public final DialogC1389620mGW Oo() {
        return (DialogC1389620mGW) this.LLJJIJIL.getValue();
    }

    public final TuxNavBar So() {
        return (TuxNavBar) this.LLJI.getValue();
    }

    public final C197039127h Vo() {
        return (C197039127h) this.LLJJI.getValue();
    }

    public final C1233650iCx Zo() {
        return (C1233650iCx) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: ap, reason: merged with bridge method [inline-methods] */
    public final TwoStepVerificationActivityViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return (TwoStepVerificationActivityViewModel) assemVMLazy.getValue();
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJJJJLIIL.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLJJJJJIL.getValue();
    }

    public final void bp() {
        C786410Ut5.LJIIJ(Oo());
        Vo().setLoading(false);
        if (Zo() != null) {
            So().setEnabled(true);
            Lo().setEnabled(true);
        }
    }

    public final void cp() {
        C786410Ut5.J4(Oo());
        Vo().setLoading(true);
        if (Zo() != null) {
            So().setEnabled(false);
            Lo().setEnabled(false);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C786410Ut5.LJIIJ(Oo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (((C1233670iCz) Jo().getState()).LLILLL instanceof C1623706Xj) {
            cp();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        Jo().yQ2();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0124  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem.onViewCreated(android.view.View):void");
    }

    public final void dp(boolean z, boolean z2) {
        String string;
        String string2;
        Context context;
        String string3;
        OnBackPressedDispatcher onBackPressedDispatcher;
        String str;
        Integer num;
        C19EG activity;
        String string4;
        String string5;
        int i;
        String string6;
        int i2;
        OnBackPressedDispatcher onBackPressedDispatcher2;
        C1233650iCx c1233650iCxZo;
        C19EG activity2;
        C786410Ut5.LJIIJ(Oo());
        int i3 = 8;
        C786410Ut5.LJLLLLLL(8, (View) this.LLJJIJI.getValue());
        if (z) {
            TextView textView = (TextView) this.LLJIJIL.getValue();
            Context context2 = getContext();
            if (context2 == null || (string4 = context2.getString(2131857365)) == null) {
                string4 = "";
            }
            textView.setText(string4);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJILJILJ.getValue());
            TextView textView2 = (TextView) this.LLJILLL.getValue();
            Context context3 = getContext();
            if (context3 == null || (string5 = context3.getString(2131857386)) == null) {
                string5 = "";
            }
            textView2.setText(string5);
            if (z2 && Vo().getVisibility() == 0 && (activity2 = getActivity()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity2);
                c1389890mGx.LJIIJ(activity2.getString(2131857366));
                c1389890mGx.LJIIJJI();
            }
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJJ.getValue());
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJJIL.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJILJIL.getValue());
            C197039127h c197039127hVo = Vo();
            C1233650iCx c1233650iCxZo2 = Zo();
            if (c1233650iCxZo2 != null && c1233650iCxZo2.LJI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c197039127hVo);
            C197039127h c197039127hVo2 = Vo();
            Context context4 = getContext();
            if (context4 == null || (string6 = context4.getString(2131857408)) == null) {
                string6 = "";
            }
            c197039127hVo2.setText(string6);
            C786410Ut5.U8(Vo(), new ACListenerS154S0100000_19(this, 39));
            View view = (View) this.LLJJ.getValue();
            C1233650iCx c1233650iCxZo3 = Zo();
            if (c1233650iCxZo3 != null && c1233650iCxZo3.LJI) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            C786410Ut5.LJLLLLLL(8, Lo());
            C19EG activity3 = getActivity();
            if (activity3 != null && (c1233650iCxZo = Zo()) != null && c1233650iCxZo.LIZ != null) {
                C19293810e0.LIZJ(activity3, (TuxTextView) this.LLJILJILJ.getValue(), 4, new ACListenerS154S0100000_19(this, 40));
            }
            TuxNavBar tuxNavBarSo = So();
            C0OM1 c0om1 = new C0OM1();
            C1237450iJ5.LIZIZ(c0om1, "", new AwS563S0100000_19(this, 176));
            c0om1.LIZLLL = false;
            tuxNavBarSo.setNavActions(c0om1);
            C19EG activity4 = getActivity();
            if (activity4 != null && (onBackPressedDispatcher2 = activity4.getOnBackPressedDispatcher()) != null) {
                C1247340iZ2.LIZ(onBackPressedDispatcher2, null, new AwS598S0100000_19(this, 69), 3);
            }
        } else {
            TextView textView3 = (TextView) this.LLJIJIL.getValue();
            Context context5 = getContext();
            if (context5 == null || (string = context5.getString(2131857364)) == null) {
                string = "";
            }
            textView3.setText(string);
            TextView textView4 = (TextView) this.LLJILLL.getValue();
            Context context6 = getContext();
            if (context6 == null || (string2 = context6.getString(2131857387)) == null) {
                string2 = "";
            }
            textView4.setText(string2);
            C786410Ut5.LJLLLLLL(0, (View) this.LLJILJILJ.getValue());
            if (z2 && Vo().getVisibility() != 0 && (activity = getActivity()) != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                c1389890mGx2.LJIIJ(activity.getString(2131857383));
                c1389890mGx2.LJIIJJI();
            }
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJJ.getValue());
            C786410Ut5.LJLLLLLL(8, (View) this.LLJJJIL.getValue());
            C786410Ut5.LJLLLLLL(0, Vo());
            C197039127h c197039127hVo3 = Vo();
            C1233650iCx c1233650iCxZo4 = Zo();
            if ((c1233650iCxZo4 == null || (string3 = c1233650iCxZo4.LIZJ) == null) && ((context = getContext()) == null || (string3 = context.getString(2131857385)) == null)) {
                string3 = "";
            }
            c197039127hVo3.setText(string3);
            C786410Ut5.U8(Vo(), new ACListenerS154S0100000_19(this, 41));
            C786410Ut5.LJLLLLLL(0, (View) this.LLJJ.getValue());
            TuxTextView tuxTextViewLo = Lo();
            C1233650iCx c1233650iCxZo5 = Zo();
            if (c1233650iCxZo5 != null && c1233650iCxZo5.LJ) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, tuxTextViewLo);
            C1233650iCx c1233650iCxZo6 = Zo();
            if (c1233650iCxZo6 != null && c1233650iCxZo6.LIZLLL) {
                C1233650iCx c1233650iCxZo7 = Zo();
                if (c1233650iCxZo7 != null && c1233650iCxZo7.LJFF) {
                    TuxNavBar tuxNavBarSo2 = So();
                    C0OM1 c0om12 = new C0OM1();
                    C1251150ifB c1251150ifB = new C1251150ifB();
                    c1251150ifB.LIZLLL();
                    c1251150ifB.LIZJ = R.raw.icon_x_mark;
                    c1251150ifB.LJIIIIZZ = "";
                    c1251150ifB.LIZJ(new AwS563S0100000_19(this, 180));
                    c0om12.LIZIZ(c1251150ifB);
                    c0om12.LIZLLL = false;
                    tuxNavBarSo2.setNavActions(c0om12);
                }
            } else {
                TuxNavBar tuxNavBarSo3 = So();
                C0OM1 c0om13 = new C0OM1();
                C1237450iJ5.LIZIZ(c0om13, "", new AwS563S0100000_19(this, 182));
                c0om13.LIZLLL = false;
                tuxNavBarSo3.setNavActions(c0om13);
            }
            C19EG activity5 = getActivity();
            if (activity5 != null) {
                C1233650iCx c1233650iCxZo8 = Zo();
                if (c1233650iCxZo8 != null && (num = c1233650iCxZo8.LIZIZ) != null) {
                    int iIntValue = num.intValue();
                    C786410Ut5.LJLLLLLL(0, (View) this.LLJILJIL.getValue());
                    ImageView imageView = (ImageView) this.LLJILJIL.getValue();
                    C0HTI c0hti = new C0HTI();
                    c0hti.LIZ = iIntValue;
                    imageView.setImageDrawable(c0hti.LIZ(activity5));
                }
                C1233650iCx c1233650iCxZo9 = Zo();
                if (c1233650iCxZo9 != null && (str = c1233650iCxZo9.LIZ) != null) {
                    TuxTextView tuxTextView = (TuxTextView) this.LLJILJILJ.getValue();
                    ACListenerS154S0100000_19 aCListenerS154S0100000_19 = new ACListenerS154S0100000_19(this, 45);
                    try {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(" ");
                        sbLIZ.append(activity5.getString(2131839766));
                        C19293810e0.LIZIZ(activity5, tuxTextView, C19293810e0.LJI(activity5, new SpannableStringBuilder(str).append((CharSequence) C2188811AlT.LIZIZ(sbLIZ)), true, aCListenerS154S0100000_19));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            C19EG activity6 = getActivity();
            if (activity6 != null && (onBackPressedDispatcher = activity6.getOnBackPressedDispatcher()) != null) {
                C1247340iZ2.LIZ(onBackPressedDispatcher, null, new AwS598S0100000_19(this, 74), 3);
            }
        }
        C786410Ut5.LJLLLLLL(0, Go());
        C786410Ut5.LJLLLLLL(0, (View) this.LLJJIJIIJIL.getValue());
    }
}
