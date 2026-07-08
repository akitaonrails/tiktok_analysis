package com.ss.android.ugc.aweme.relation.fp;

import X.AbstractC1074460e4C;
import X.C03DU;
import X.C0OM1;
import X.C1071540dzU;
import X.C1074450e4B;
import X.C1074520e4I;
import X.C1074530e4J;
import X.C1074540e4K;
import X.C1074580e4O;
import X.C1220000hqw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C12ES;
import X.C13LE;
import X.C1749280vcc;
import X.C19EG;
import X.C2217381BqS;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1074240e3q;
import X.InterfaceC836760Ws6;
import Y.ACListenerS119S0200000_16;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
@InterfaceC836760Ws6(attachActivity = FacebookFriendsHostActivity.class)
public final class FacebookFriendsPage extends BaseFriendsPage {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJSHELIOS4nISoiZykjZgMtKioxJyonDz06LSsoOh8yLyA=";
    public final C736950SvV LLIZ;
    public AbstractC1074460e4C LLIZLLLIL;
    public final int LLJ;

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void UR() {
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLIZ.getValue(), new C2217381BqS() { // from class: X.0dwU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1069810dwh) obj).LLILLL;
            }
        }, null, new AwS630S0100000_16(this, 34), 6);
        C736680Sv4.LJIJJ((AssemViewModel) this.LLIZ.getValue(), new AwS595S0100000_16(this, 136));
    }

    public FacebookFriendsPage() {
        AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(250);
        this.LLIZ = new C736950SvV(C13LE.LIZ(FindFriendsPageVM.class), aFwS204S0000000_16, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS252S0000000_16.get$arr$(329), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJ = R.layout.c_2;
    }

    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final int getLayoutId() {
        return this.LLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.relation.fp.BaseFriendsPage
    public final void SR(View view) {
        ViewGroup viewGroup;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        C0OM1 c0om1 = new C0OM1();
        boolean z = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS560S0100000_16(this, 545));
        int i = 0;
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getText(2131834350);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        tuxNavBar.LJIIZILJ(true);
        AbstractC1074460e4C abstractC1074460e4CLIZJ = C1071540dzU.LIZIZ.LIZJ();
        this.LLIZLLLIL = abstractC1074460e4CLIZJ;
        AbstractC1074460e4C abstractC1074460e4C = null;
        if (abstractC1074460e4CLIZJ == null) {
            abstractC1074460e4CLIZJ = null;
        }
        C19EG c19egRequireActivity = requireActivity();
        EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.FIND_FRIENDS;
        C1074520e4I c1074520e4I = new C1074520e4I("facebook", null, 30);
        if (C12ES.LJIIIIZZ(view.getContext()) > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(640))) {
            z = false;
        }
        C1074450e4B c1074450e4B = new C1074450e4B(c19egRequireActivity, enumC1074240e3q, c1074520e4I, z);
        C1074580e4O c1074580e4O = (C1074580e4O) abstractC1074460e4CLIZJ;
        c1074580e4O.getClass();
        c1074580e4O.LLJIJIL = c1074450e4B;
        C19EG c19eg = c1074450e4B.LIZ;
        FacebookMaFWidgetVM facebookMaFWidgetVM = (FacebookMaFWidgetVM) new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, C13LE.LIZ(FacebookMaFWidgetVM.class)), new AwS560S0100000_16(c1074450e4B, 488), new C452070Ho5(), C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS560S0100000_16(c1074450e4B, 489), AFwS252S0000000_16.get$arr$(2)).getValue();
        c1074580e4O.LLJILJILJ = facebookMaFWidgetVM;
        C736680Sv4.LJIIIIZZ(c1074580e4O, facebookMaFWidgetVM, new C2217381BqS() { // from class: X.0e46
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1074430e49) obj).LLILLJJLI;
            }
        }, null, new AwS630S0100000_16(c1074580e4O, 0), 6);
        FacebookMaFWidgetVM facebookMaFWidgetVM2 = c1074580e4O.LLJILJILJ;
        if (facebookMaFWidgetVM2 == null) {
            facebookMaFWidgetVM2 = null;
        }
        AssemViewModel.asyncSubscribe$default(facebookMaFWidgetVM2, new C2217381BqS() { // from class: X.0e47
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1074430e49) obj).LLILLJJLI;
            }
        }, null, new C1074530e4J(c1074580e4O), new C1074540e4K(c1074580e4O), null, 18, null);
        FacebookMaFWidgetVM facebookMaFWidgetVM3 = c1074580e4O.LLJILJILJ;
        if (facebookMaFWidgetVM3 == null) {
            facebookMaFWidgetVM3 = null;
        }
        AssemViewModel.asyncSubscribe$default(facebookMaFWidgetVM3, new C2217381BqS() { // from class: X.0e48
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1074430e49) obj).LL;
            }
        }, null, null, null, new AwS382S0200000_16(c1074580e4O, c1074450e4B, 0), 14, null);
        if (c1074450e4B.LJFF) {
            C03DU c03du = new C03DU(c1074450e4B.LIZ, null == true ? 1 : 0, 6, i);
            c1074580e4O.LL = c03du;
            c03du.setTitleText(2131834677);
        }
        if (c1074450e4B.LJ && c1074580e4O.LLILLJJLI == null) {
            View viewLJLLJ = C786410Ut5.LJLLJ(c1074450e4B.LIZ, R.layout.rx, null);
            LinearLayout linearLayout = (LinearLayout) viewLJLLJ.findViewById(R.id.kzf);
            c1074580e4O.LLILZIL = (C1749280vcc) viewLJLLJ.findViewById(R.id.w2m);
            C786410Ut5.R7(linearLayout, new ACListenerS119S0200000_16(c1074580e4O, c1074450e4B, 0));
            c1074580e4O.LLILLJJLI = viewLJLLJ;
        }
        AbstractC1074460e4C abstractC1074460e4C2 = this.LLIZLLLIL;
        if (abstractC1074460e4C2 == null) {
            abstractC1074460e4C2 = null;
        }
        ((C1074580e4O) abstractC1074460e4C2).LLJILLL = new AwS560S0100000_16(this, 546);
        if ((view instanceof LinearLayout) && (viewGroup = (ViewGroup) view) != null) {
            AbstractC1074460e4C abstractC1074460e4C3 = this.LLIZLLLIL;
            if (abstractC1074460e4C3 != null) {
                abstractC1074460e4C = abstractC1074460e4C3;
            }
            viewGroup.addView((View) ((C1074580e4O) abstractC1074460e4C).LLIZLLLIL.getValue(), -1, -1);
        }
    }
}
