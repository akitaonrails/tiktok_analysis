package com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.additional;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0B1F;
import X.C0DSB;
import X.C1163410gNf;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1391600mJi;
import X.C13LE;
import X.C13MK;
import X.C1578630rBN;
import X.C1637806bA;
import X.C1637906bB;
import X.C1855860yOW;
import X.C1857750yRZ;
import X.C1860520yW2;
import X.C1860640yWE;
import X.C1862330yYx;
import X.C19659111vp;
import X.C19719912Dl;
import X.C19751612Pq;
import X.C2097608Jq;
import X.C2173301A3s;
import X.C2217381BqS;
import X.C23250099c;
import X.C320490ChL;
import X.C322790Cl3;
import X.C384050F3z;
import X.C418440Gaw;
import X.C450720Hlu;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1235690iGF;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS161S0100000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.vm.BottomInputViewModel;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.vm.TakoFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS618S0100000_4;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AdditionalAreaAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public FrameLayout LLJJI;
    public FrameLayout LLJJIII;
    public TuxIconView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public C19751612Pq LLJJIJIL;
    public Drawable LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public Boolean LLJLL;
    public boolean LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdditionalAreaAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/inputv2/additional/AdditionalAreaViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AdditionalAreaAssem.class, "bottomInputViewModel", "getBottomInputViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/bottombox/vm/BottomInputViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AdditionalAreaAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/tako/vm/TakoFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AdditionalAreaAssem.class, "sheetVM", "getSheetVM()Lcom/ss/android/ugc/aweme/tako/otherpage/sheet/TakoSheetVM;", 0);
        c09r3.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    public AdditionalAreaAssem() {
        C019F c019f = C019F.LIZ;
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(177));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AdditionalAreaViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bBLIZ, new AwS562S0100000_18(c19719912DlLIZ, 2289), AFwS269S0000000_27.get$arr$(173), null, true);
        C1637906bB c1637906bBLIZ2 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(171));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(BottomInputViewModel.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ2, new AwS562S0100000_18(c19719912DlLIZ2, 2290), AFwS269S0000000_27.get$arr$(174), null, true);
        C1637906bB c1637906bBLIZ3 = C1637806bA.LIZ(AFwS269S0000000_27.get$arr$(172));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(TakoFragmentViewModel.class);
        this.LLJJJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bBLIZ3, new AwS562S0100000_18(c19719912DlLIZ3, 2291), AFwS269S0000000_27.get$arr$(175), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(TakoSheetVM.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ4, 2292), AFwS269S0000000_27.get$arr$(176), null, true);
        this.LLJJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 665));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 667));
        this.LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 669));
        this.LLJLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 666));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fpa;
    }

    public final BottomInputViewModel ip() {
        AssemVMLazy assemVMLazy = this.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (BottomInputViewModel) assemVMLazy.getValue();
    }

    public final AdditionalAreaViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        return (AdditionalAreaViewModel) assemVMLazy.getValue();
    }

    public final void mp() {
        IMessageAbility iMessageAbility;
        FrameLayout frameLayout;
        Context context;
        Map<String, String> mapLJ;
        if (lp().getState().LL) {
            return;
        }
        TuxIconView tuxIconView = this.LLJJIJI;
        if (tuxIconView == null || tuxIconView.getVisibility() != 0) {
            return;
        }
        Boolean bool = this.LLJLL;
        Boolean bool2 = Boolean.FALSE;
        if (!Intrinsics.LJFF(bool, bool2) || !Intrinsics.LJFF(this.LLJLILLLLZIIL, bool2) || this.LLJLLIL || (iMessageAbility = (IMessageAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) == null || !iMessageAbility.oj() || ((Boolean) C320490ChL.LIZIZ.getValue()).booleanValue()) {
            return;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLJL.getValue();
        if (C13MK.LIZ(iTakoScreenTypeAbility != null ? Boolean.valueOf(iTakoScreenTypeAbility.r41()) : null)) {
            return;
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility2 = (ITakoScreenTypeAbility) this.LLJL.getValue();
        if (C13MK.LIZ(iTakoScreenTypeAbility2 != null ? Boolean.valueOf(iTakoScreenTypeAbility2.cA()) : null) || !C1578630rBN.LJIIJ(this)) {
            return;
        }
        int i = C1860640yWE.LIZ;
        if (C1860640yWE.LIZ(getContext()) || (frameLayout = this.LLJJI) == null || (context = getContext()) == null) {
            return;
        }
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(context, false);
        C450720Hlu c450720Hlu = new C450720Hlu(c1361400lX0LIZ);
        c450720Hlu.LJIIJ(2131822545);
        c450720Hlu.LLILLJJLI.LIZIZ = frameLayout;
        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0d, c1361400lX0LIZ);
        c450720Hlu.LJI(numLIZJ != null ? numLIZJ.intValue() : 0);
        EnumC1235690iGF enumC1235690iGF = EnumC1235690iGF.TOP;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZLLL = enumC1235690iGF;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        C2173301A3s.LIZ(c450720Hlu);
        C1163410gNf.LIZ.getClass();
        if (!C1163410gNf.LIZJ()) {
            TuxIconView tuxIconView2 = this.LLJJIJI;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxIconView2, "rotation", 0.0f, 100.0f);
            objectAnimatorOfFloat.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.0f, 1.2f);
            objectAnimatorOfFloat2.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.0f, 1.2f);
            objectAnimatorOfFloat3.setDuration(330L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(tuxIconView2, "rotation", 100.0f, 90.0f);
            objectAnimatorOfFloat4.setDuration(100L);
            objectAnimatorOfFloat4.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(tuxIconView2, "scaleX", 1.2f, 1.0f);
            objectAnimatorOfFloat5.setDuration(100L);
            objectAnimatorOfFloat5.setStartDelay(30L);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(tuxIconView2, "scaleY", 1.2f, 1.0f);
            objectAnimatorOfFloat6.setDuration(100L);
            objectAnimatorOfFloat6.setStartDelay(30L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
            animatorSet.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).after(objectAnimatorOfFloat);
            animatorSet.setStartDelay(200L);
            animatorSet.start();
        }
        AdditionalAreaViewModel additionalAreaViewModelLp = lp();
        C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
        c1860520yW2.getClass();
        if (!C1860520yW2.LJI()) {
            C1860520yW2.LJJII();
        }
        additionalAreaViewModelLp.setState(AFwS269S0000000_27.get$arr$(455));
        c1860520yW2.getClass();
        C1860520yW2.LJJII();
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLIL.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = mapLJ.get("enter_from");
        String str2 = mapLJ.get("enter_method");
        String str3 = mapLJ.get("process_id");
        String str4 = mapLJ.get("tako_session_id");
        if (str4 == null) {
            str4 = "";
        }
        C1862330yYx.LJLJI(c1862330yYx, str, str2, str3, "popup", null, C1857750yRZ.LJII(2131822545), null, null, null, null, null, null, null, str4, mapLJ.get("tako_chat_id"), 40912);
    }

    public final Drawable kp() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Drawable drawable = this.LLJJJ;
        if (drawable != null) {
            return drawable;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(999));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        Drawable drawableLIZ = c384050F3z.LIZ(context);
        this.LLJJJ = drawableLIZ;
        return drawableLIZ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        FrameLayout frameLayout;
        Map<String, String> mapLJ;
        C19751612Pq c19751612PqLIZ;
        super.onViewCreated(view);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof FrameLayout) {
            frameLayout = (FrameLayout) viewLJJIJL;
        } else {
            frameLayout = null;
        }
        this.LLJJI = frameLayout;
        this.LLJJIII = (FrameLayout) view.findViewById(R.id.afw);
        this.LLJJIJI = (TuxIconView) view.findViewById(R.id.afx);
        this.LLJJIJIIJIL = (TuxIconView) view.findViewById(R.id.ag0);
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZ()) {
            TuxIconView tuxIconView = this.LLJJIJI;
            if (tuxIconView != null) {
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    C786410Ut5.W5(tuxIconView, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            TuxIconView tuxIconView2 = this.LLJJIJIIJIL;
            if (tuxIconView2 != null) {
                ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
                    C786410Ut5.W5(tuxIconView2, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        if (!C1163410gNf.LIZJ()) {
            FrameLayout frameLayout2 = this.LLJJI;
            if (frameLayout2 != null) {
                Context context = getContext();
                if (context == null) {
                    c19751612PqLIZ = null;
                } else {
                    c19751612PqLIZ = this.LLJJIJIL;
                    if (c19751612PqLIZ == null) {
                        C19659111vp c19659111vp = new C19659111vp();
                        c19659111vp.LIZJ = C418440Gaw.LIZIZ(6);
                        c19659111vp.LIZLLL = C418440Gaw.LIZIZ(30);
                        c19659111vp.LJ = Integer.valueOf(R.attr.oz);
                        c19659111vp.LIZ = C418440Gaw.LIZIZ(999);
                        c19751612PqLIZ = c19659111vp.LIZ(context);
                        this.LLJJIJIL = c19751612PqLIZ;
                    }
                }
                frameLayout2.setBackground(c19751612PqLIZ);
            }
            FrameLayout frameLayout3 = this.LLJJIII;
            if (frameLayout3 != null) {
                frameLayout3.setBackground(kp());
            }
        }
        FrameLayout frameLayout4 = this.LLJJI;
        if (frameLayout4 != null) {
            C1855860yOW.LIZ(frameLayout4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            C786410Ut5.O7(frameLayout4, new ACListenerS161S0100000_27(this, 56));
        }
        hp(ip().getState().LLJJIJI, false);
        TuxIconView tuxIconView3 = this.LLJJIJI;
        if (tuxIconView3 != null) {
            C0DSB.LIZJ(tuxIconView3);
        }
        TuxIconView tuxIconView4 = this.LLJJIJIIJIL;
        if (tuxIconView4 != null) {
            C0DSB.LIZIZ(tuxIconView4);
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLIL.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1862330yYx.LJLJJI(c1862330yYx, mapLJ);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yOH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1855040yNC) obj).LLILZLL);
            }
        }, C736820SvI.LIZLLL(), new AwS641S0100000_27(this, 32), 4);
        if (C1163410gNf.LIZJ() && !C0B1F.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0yOJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1855040yNC) obj).LLJJIJI);
                }
            }, null, new AwS641S0100000_27(this, 33), 6);
        }
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((TakoSheetVM) assemVMLazy.getValue()).wQ2(new AwS571S0100000_27(this, 668));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C322790Cl3(this, null), 3);
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iMessageAbility != null) {
            iMessageAbility.tx1(new AwS583S0100000_4(this, 135));
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJJIL.getValue(), new C2217381BqS() { // from class: X.0yOK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1853920yLO) obj).LL;
            }
        }, null, new AwS618S0100000_4(this, 27), 6);
        ((TakoFragmentViewModel) this.LLJJJJJIL.getValue()).wQ2(new AwS583S0100000_4(this, 136));
        IMessageAbility iMessageAbility2 = (IMessageAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iMessageAbility2 != null) {
            iMessageAbility2.R40(new AwS606S0100000_27(this, 187));
        }
    }

    public final void hp(boolean z, boolean z2) {
        if (z2) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                C0DSB.LIZJ(viewLJJIJL);
                return;
            }
            return;
        }
        C1163410gNf.LIZ.getClass();
        if (C1163410gNf.LIZJ() && !C0B1F.LIZ()) {
            if (z) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    C786410Ut5.LJLLLLLL(4, viewLJJIJL2);
                    return;
                }
                return;
            }
            View viewLJJIJL3 = LJJIJL();
            if (viewLJJIJL3 == null) {
                return;
            }
            C0DSB.LIZIZ(viewLJJIJL3);
            return;
        }
        View viewLJJIJL4 = LJJIJL();
        if (viewLJJIJL4 == null) {
            return;
        }
        C0DSB.LIZJ(viewLJJIJL4);
    }
}
