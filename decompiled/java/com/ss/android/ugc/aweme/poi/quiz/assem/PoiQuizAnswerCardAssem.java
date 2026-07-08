package com.ss.android.ugc.aweme.poi.quiz.assem;

import X.C01D1;
import X.C01GW;
import X.C1175020ggO;
import X.C1178310glh;
import X.C1178440glu;
import X.C1180060goW;
import X.C1182670gsj;
import X.C1182710gsn;
import X.C1187810h11;
import X.C1189060h32;
import X.C1208920hZ4;
import X.C1209070hZJ;
import X.C13LE;
import X.C1548820qPI;
import X.C1637806bA;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1182690gsl;
import X.InterfaceC1541990qEH;
import X.InterfaceC2217461Bqa;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import Y.ALAdapterS8S0300000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.poi.quiz.vm.PoiQuizPageVM;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiQuizAnswerCardAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final List<String> LLJJJJ;
    public final AssemVMLazy LLIZLLLIL;
    public ViewGroup LLJ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJI;
    public InterfaceC1541990qEH LLJIJIL;
    public boolean LLJILJIL;
    public final C1187810h11 LLJILJILJ;
    public C1175020ggO LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final C01GW LLJJIII;
    public final C1182670gsj LLJJIJI;
    public final C1182670gsj LLJJIJIIJIL;
    public final C1208920hZ4 LLJJIJIL;
    public String LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiQuizAnswerCardAssem.class, "pageVM", "getPageVM()Lcom/ss/android/ugc/aweme/poi/quiz/vm/PoiQuizPageVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = C1697810uHb.LJIILJJIL("poiQuizCloseCard", "poiQuizShowGPSReqToast", "poiQuizFinishBtnClick");
    }

    public PoiQuizAnswerCardAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiQuizPageVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1674), AFwS256S0000000_18.get$arr$(547), null, true);
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        this.LLJILJILJ = new C1187810h11();
        this.LLJJ = (displayMetrics.widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        this.LLJJI = (displayMetrics.widthPixels - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        this.LLJJIII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1673));
        int i = this.LLJJI;
        int i2 = C1178310glh.LIZIZ;
        int i3 = this.LLJJ;
        int i4 = C1178310glh.LIZ;
        this.LLJJIJI = new C1182670gsj(0.0f, 1.0f, i, i2, i3, i4);
        this.LLJJIJIIJIL = new C1182670gsj(1.0f, 0.0f, i3, i4, i, i2);
        this.LLJJIJIL = new C1208920hZ4(this, 3);
    }

    public final PoiQuizPageVM Jo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (PoiQuizPageVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        Lo(false);
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    public final void Lo(boolean z) {
        for (String str : LLJJJJ) {
            if (z) {
                C1548820qPI.LIZLLL(str, this.LLJJIJIL);
            } else {
                C1548820qPI.LJIIIIZZ(str, this.LLJJIJIL);
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int marginStart;
        int i;
        int marginEnd;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.r8p);
        this.LLJ = viewGroup;
        if (viewGroup != null) {
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            int i2 = 0;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            Integer numValueOf = Integer.valueOf(marginStart);
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            Integer numValueOf3 = Integer.valueOf(marginEnd);
            ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i2 = marginLayoutParams.bottomMargin;
            }
            C1189060h32.LJJII(viewGroup, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i2 + ((Number) this.LLJJIII.getValue()).intValue()));
        }
        PoiQuizPageVM poiQuizPageVMJo = Jo();
        selectSubscribe(poiQuizPageVMJo, new C2217381BqS() { // from class: X.0gmS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0gmW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0glo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1178340glk) obj).LLILZIL;
            }
        }, C736820SvI.LIZIZ(poiQuizPageVMJo.usedInReusedScene), null, new C1209070hZJ(this, 8));
        Lo(true);
        C1180060goW.LJIILL(this.LLJ, new AwS597S0100000_18(this, 782));
    }

    public final void Ho(boolean z, boolean z2) {
        LocationData locationData;
        if (z2) {
            PoiQuizPageVM poiQuizPageVMJo = Jo();
            C1178440glu c1178440glu = poiQuizPageVMJo.LLJI;
            if (c1178440glu != null && (locationData = c1178440glu.LIZJ) != null) {
                poiQuizPageVMJo.yQ2(locationData);
            } else {
                poiQuizPageVMJo.xQ2();
            }
        }
        C1182710gsn c1182710gsn = Jo().LLILZLL;
        EnumC1182690gsl enumC1182690gsl = c1182710gsn.LIZIZ;
        if (enumC1182690gsl != null) {
            enumC1182690gsl.closePoiQuizCard(c1182710gsn, z);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJI;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z3 = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    public static void Go(View view, C1182670gsj c1182670gsj, Function0 function0) {
        if (view == null) {
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1182670gsj.LIZ, c1182670gsj.LIZLLL);
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(c1182670gsj.LIZIZ, c1182670gsj.LJ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", c1182670gsj.LIZJ, c1182670gsj.LJFF);
        valueAnimatorOfInt2.addListener(new ALAdapterS8S0300000_18(view, c1182670gsj, function0, 0));
        valueAnimatorOfInt.addUpdateListener(new AUListenerS267S0100000_18(view, 6));
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS267S0100000_18(view, 7));
        objectAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt2.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
        valueAnimatorOfInt.start();
        valueAnimatorOfInt2.start();
    }
}
