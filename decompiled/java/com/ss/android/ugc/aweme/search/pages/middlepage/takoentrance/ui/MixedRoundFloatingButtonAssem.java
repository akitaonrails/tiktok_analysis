package com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui;

import X.C01GW;
import X.C01LP;
import X.C0BYH;
import X.C0H97;
import X.C0PEM;
import X.C0PM7;
import X.C0PRC;
import X.C0Q7O;
import X.C0QOB;
import X.C0QS4;
import X.C0QS5;
import X.C0QSC;
import X.C0QSE;
import X.C1112004Wo;
import X.C1558520qew;
import X.C2082308Dt;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C301180BrI;
import X.C301340BrY;
import X.C301520Brq;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C467860IWi;
import X.C653710PkX;
import X.C657990PrR;
import X.C663990Q2r;
import X.C669990QPt;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1210900hcG;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.search.middle.SearchResultFragmentAbility;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.viewmodel.TakoButtonViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class MixedRoundFloatingButtonAssem extends BaseTakoFloatingButtonAssem {
    public TuxIconView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public LinearLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public C0QS5 LLL;
    public final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
    public final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final C01GW LLLF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(278));
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS550S0100000_6(this, 562));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 390));
    public final float LLLFZ = C418440Gaw.LIZIZ(1);

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void kp() {
        super.kp();
        C736680Sv4.LJIIIIZZ(this, Vo(), new C2217381BqS() { // from class: X.0QSA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0QS8) obj).LLILZIL);
            }
        }, null, new AwS624S0100000_10(this, 42), 6);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void ap() {
        NextLiveData<Integer> nextLiveDataXQ2;
        SearchStartViewModel searchStartViewModel = this.LLJI;
        if (searchStartViewModel != null && (nextLiveDataXQ2 = searchStartViewModel.xQ2()) != null) {
            nextLiveDataXQ2.observe(this, new AObserverS214S0100000_10(this, 37), true);
        }
        TakoButtonViewModel takoButtonViewModelVo = Vo();
        int i = this.LLJJL;
        int iIntValue = ((Number) this.LLJJIJI.getValue()).intValue();
        C0QSE.LIZ.getClass();
        C01GW c01gw = C0QSE.LIZIZ;
        int iIntValue2 = 0;
        int i2 = ((Boolean) c01gw.getValue()).booleanValue() ? this.LLJL : 0;
        if (((Boolean) c01gw.getValue()).booleanValue()) {
            Context context = getContext();
            if (context != null && C426750GoL.LIZLLL(context)) {
                iIntValue2 = (-((Number) this.LLLFF.getValue()).intValue()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            } else {
                Integer numValueOf = Integer.valueOf(((Number) this.LLLFF.getValue()).intValue() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)));
                if (numValueOf.intValue() > 0) {
                    iIntValue2 = numValueOf.intValue();
                }
            }
        }
        takoButtonViewModelVo.vQ2(i, iIntValue, i2, iIntValue2);
        if (C301180BrI.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), So().LIZJ, null, new C0H97(this, null), 2);
        } else {
            kp();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void bp() {
        View view;
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setClipToOutline(true);
        }
        if (!C301340BrY.LIZ() || (view = this.LLJIJIL) == null) {
            return;
        }
        view.setElevation(this.LLLFZ);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void ip() {
        if (C467860IWi.LIZ(getContext())) {
            View view = this.LLJIJIL;
            if (view != null) {
                view.setBackgroundResource(R.drawable.d3g);
                return;
            }
            return;
        }
        View view2 = this.LLJIJIL;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.d3h);
        }
    }

    public final void op() {
        String str = C1112004Wo.LIZ() ? Vo().LLIZLLLIL == 1 ? "search_blankpage_tikbot" : "search_sug_tikbot" : null;
        String str2 = C1112004Wo.LIZ() ? "click_voice_button" : null;
        SearchResultFragmentAbility searchResultFragmentAbility = (SearchResultFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), SearchResultFragmentAbility.class, null);
        if (searchResultFragmentAbility != null) {
            searchResultFragmentAbility.NI(str, str2);
        }
        if (C1112004Wo.LIZ()) {
            hp(((Boolean) this.LLLF.getValue()).booleanValue(), C0QS4.VOICE_BUTTON);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Ho() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Jo() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final int Lo() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final View Zo(ViewStub viewStub) {
        int i;
        C657990PrR.LIZJ(viewStub, AFwS241S0000000_10.get$arr$(197));
        if (viewStub != null) {
            C653710PkX.LIZ.getClass();
            if (C653710PkX.LIZ()) {
                i = R.layout.eyk;
            } else {
                i = R.layout.eyj;
            }
            viewStub.setLayoutResource(i);
            return C786410Ut5.LJLLLL(viewStub);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cp(android.view.View r7) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.MixedRoundFloatingButtonAssem.cp(android.view.View):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem
    public final void ep(boolean z) throws Throwable {
        String str;
        super.ep(z);
        C0QSC.LIZ.getClass();
        if (!C0QSC.LIZ() && !C1112004Wo.LIZ()) {
            AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 1350);
            if (!C301180BrI.LIZ() && !C0BYH.LIZ()) {
                awS554S0100000_10.invoke();
                return;
            } else {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01LP(awS554S0100000_10, null), 3);
                return;
            }
        }
        ISearchContextAbility iSearchContextAbilityNo = No();
        int i = Vo().LLIZLLLIL;
        boolean zBooleanValue = ((Boolean) this.LLLF.getValue()).booleanValue();
        if (iSearchContextAbilityNo == null) {
            return;
        }
        String str2 = ((C0PM7) iSearchContextAbilityNo.uF().LIZJ()).LLILZ;
        String str3 = ((C0PRC) iSearchContextAbilityNo.Ph1().LIZJ()).LLILLJJLI;
        if (str3.length() <= 0) {
            str3 = ((C663990Q2r) iSearchContextAbilityNo.Ww1().LIZJ()).LL;
        }
        if (i != 2) {
            if (i != 1) {
                return;
            } else {
                str = "search_blankpage_tikbot";
            }
        } else {
            str = "search_sug_tikbot";
        }
        C0Q7O c0q7o = new C0Q7O();
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c0q7o.LJFF("enter_from", str, c2082308Dt);
        c0q7o.LJFF("entrance_type", "voice_button", c2082308Dt);
        c0q7o.LJFF("group_id", str2, c2082308Dt);
        c0q7o.LJFF("last_feed_group_id", str2, c2082308Dt);
        c0q7o.LJFF("enter_from_last_page", str3, c2082308Dt);
        c0q7o.LIZLLL(zBooleanValue ? 1 : 0, "is_voice_bubble");
        c0q7o.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.BaseTakoFloatingButtonAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C0QOB c0qobOo;
        C669990QPt c669990QPtRf;
        super.onViewCreated(view);
        if (((Number) C301520Brq.LIZ.getValue()).intValue() > 0 && !Vo().LLJIJIL && (c0qobOo = Oo()) != null && (c669990QPtRf = c0qobOo.Rf()) != null && c669990QPtRf.LIZ && c669990QPtRf.LIZIZ > 0) {
            this.LLJJIJIIJIL.LIZ(c669990QPtRf);
        }
    }

    public static Rect mp(View view, View view2) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        int i = iArr2[0] - iArr[0];
        int i2 = iArr2[1] - iArr[1];
        return new Rect(i, i2, view2.getWidth() + i, view2.getHeight() + i2);
    }
}
