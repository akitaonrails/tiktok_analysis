package com.ss.android.ugc.aweme.account.security;

import X.C01D1;
import X.C01GW;
import X.C0HTI;
import X.C0OM1;
import X.C0PEM;
import X.C0TN2;
import X.C0TUG;
import X.C1235420iFo;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19ME;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C340180DVg;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.EnumC638250P1r;
import X.InterfaceC2217461Bqa;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.account.security.SecurityCheckUpAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS315S0300000_12;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.AwS633S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class SecurityCheckUpAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SecurityCheckUpAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/account/security/SecurityCheckUpViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SecurityCheckUpAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SecurityCheckUpViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 378), AFwS257S0000000_19.get$arr$(67), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C0TUG.class, "security_check_up_hierarchy_data_key"), checkSupervisorPrepared());
        this.LLJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 374));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 379));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 355));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 375));
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 376));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 377));
        this.LLJJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 373));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final SecurityCheckUpViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (SecurityCheckUpViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            final C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LIZJ(new AwS563S0100000_19(c19egLIZ, 356));
            c0om1.LJ(c1251150ifB);
            C1250300ido c1250300ido = new C1250300ido();
            c1250300ido.LIZJ = c19egLIZ.getString(2131822091);
            c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
            c1250300ido.LIZ(new AwS563S0100000_19(c19egLIZ, 357));
            c0om1.LIZIZ(c1250300ido);
            ((TuxNavBar) this.LLJIJIL.getValue()).setNavActions(c0om1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, c19egLIZ);
            if (numLIZJ != null) {
                ((TuxNavBar) this.LLJIJIL.getValue()).setNavBackground(numLIZJ.intValue());
            }
            ((View) this.LLJILJIL.getValue()).setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0iFy
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    Rect rect = new Rect();
                    ((View) this.LIZ.LLJILJIL.getValue()).getHitRect(rect);
                    if (((View) this.LIZ.LLJILLL.getValue()).getLocalVisibleRect(rect)) {
                        if (this.LIZ.LLJJIII) {
                            c0om1.LIZJ = new C1250250idj();
                            SecurityCheckUpAssem securityCheckUpAssem = this.LIZ;
                            securityCheckUpAssem.LLJJIII = false;
                            ((TuxNavBar) securityCheckUpAssem.LLJIJIL.getValue()).setNavActions(c0om1);
                            return;
                        }
                        return;
                    }
                    if (this.LIZ.LLJJIII) {
                        return;
                    }
                    C0OM1 c0om12 = c0om1;
                    C1250250idj c1250250idj = new C1250250idj();
                    c1250250idj.LIZJ = c19egLIZ.getString(2131822090);
                    c0om12.LIZJ = c1250250idj;
                    ((TuxNavBar) this.LIZ.LLJIJIL.getValue()).setNavActions(c0om1);
                    this.LIZ.LLJJIII = true;
                }
            });
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(c19egLIZ, 1, false);
            C0TN2 c0tn2 = new C0TN2(c19egLIZ);
            ((RecyclerView) this.LLJJI.getValue()).setLayoutManager(linearLayoutManager);
            ((RecyclerView) this.LLJJI.getValue()).setAdapter(c0tn2);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iFx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1235470iFt) obj).LLILLL);
                }
            }, null, new AwS626S0100000_12(this, 24), 6);
            C736680Sv4.LJIIIZ(this, Go(), new C2217381BqS() { // from class: X.0iG1
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1235470iFt) obj).LL;
                }
            }, new C2217381BqS() { // from class: X.0iFz
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1235470iFt) obj).LLILLJJLI);
                }
            }, null, new AwS315S0300000_12(this, c19egLIZ, c0tn2, 0), 12);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iG0
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1235470iFt) obj).LLILZ);
                }
            }, null, new AwS633S0100000_19(this, 22), 6);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iFv
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1235470iFt) obj).LLILZIL);
                }
            }, null, new AwS633S0100000_19(this, 21), 6);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0iFw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1235470iFt) obj).LLILZLL);
                }
            }, null, new AwS626S0100000_12(c19egLIZ, 23), 6);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        SecurityCheckUpViewModel securityCheckUpViewModelGo = Go();
        securityCheckUpViewModelGo.setState(AFwS257S0000000_19.get$arr$(669));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1235420iFo(securityCheckUpViewModelGo, null), 3);
    }

    public final void Ho(String str, Function0<Unit> function0) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
            ConstraintLayout constraintLayout = new ConstraintLayout(c19egLIZ);
            ImageView imageView = new ImageView(c19egLIZ);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.vr;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
            C19ME c19me = new C19ME(-1, -2);
            c19me.topToTop = 0;
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            C786410Ut5.c6(imageView, c19me);
            constraintLayout.addView(imageView);
            C340180DVg.LIZ(c1397580mTM, constraintLayout, 0, 6);
            c1397580mTM.LIZIZ(str);
            c1397580mTM.LJIIIIZZ = false;
            C985403tE.LIZ(c1397580mTM, new AwS385S0200000_19(c19egLIZ, (C19EG) function0, (Function0<Unit>) 17));
            c1397580mTM.LIZLLL(new AwS598S0100000_19(function0, (Function0<Unit>) 98));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
