package com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage;

import X.AnonymousClass0956;
import X.C019F;
import X.C01GW;
import X.C0HGY;
import X.C0HR3;
import X.C0ZP4;
import X.C1295960jpS;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C420500GeG;
import X.C435650H6l;
import X.C439501nN;
import X.C440370HOp;
import X.C440500HPc;
import X.C441660HTo;
import X.C452501pT;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.EnumC440360HOo;
import X.EnumC440380HOq;
import X.EnumC440890HQp;
import X.EnumC441640HTm;
import X.InterfaceC2217461Bqa;
import X.InterfaceC440090HNn;
import Y.ACListenerS141S0100000_6;
import Y.ALAdapterS3S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioSettings;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioGeneratingPageAssem extends MixStudioPageAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLIIIILLL;
    public final AssemVMLazy LLJJJ;
    public C1295960jpS LLJJJIL;
    public C420500GeG LLJJJJ;
    public C420500GeG LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public final AnimatorSet LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public C0ZP4 LLLL;
    public final EnumC440890HQp LLLLII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MixStudioGeneratingPageAssem.class, "generatingVM", "getGeneratingVM()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/generatingpage/MixStudioGeneratingPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLLIIIILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MixStudioGeneratingPageAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MixStudioGeneratingPageViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 621), AFwS236S0000000_6.get$arr$(315), null, true);
        checkSupervisorPrepared();
        new C723590SZx(this, C440500HPc.class, null);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        this.LLJJLIIIJLLLLLLLZ = animatorSet;
        this.LLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(184));
        this.LLJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(176));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(171));
        this.LLJLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(172));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(168));
        this.LLJLLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(169));
        this.LLJZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(170));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(174));
        this.LLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(175));
        this.LLLF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(173));
        this.LLLFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(191));
        this.LLLFFI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(192));
        this.LLLFZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(193));
        this.LLLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(189));
        this.LLLII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(190));
        this.LLLIIII = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(182));
        this.LLLIIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(181));
        this.LLLIIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(183));
        this.LLLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(167));
        this.LLLIILIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(194));
        this.LLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(185));
        this.LLLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(177));
        this.LLLILZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(186));
        this.LLLILZLLLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(187));
        this.LLLIZZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(188));
        this.LLLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(178));
        this.LLLJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(179));
        this.LLLJL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(180));
        this.LLLLII = EnumC440890HQp.GENERATING;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void LLFF() {
        C1295960jpS c1295960jpS = this.LLJJJIL;
        if (c1295960jpS != null) {
            c1295960jpS.resumeAnimation();
        }
        this.LLLL = C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0HR6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HR5) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 70), 6);
    }

    public final int kp() {
        return ((Number) this.LLJZIJLIL.getValue()).intValue();
    }

    public final MixStudioGeneratingPageViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLIIIILLL;
        return (MixStudioGeneratingPageViewModel) assemVMLazy.getValue();
    }

    public final int mp() {
        return ((Number) this.LLLFF.getValue()).intValue();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final void onPagePause() {
        C1295960jpS c1295960jpS = this.LLJJJIL;
        if (c1295960jpS != null) {
            c1295960jpS.pauseAnimation();
        }
        C0ZP4 c0zp4 = this.LLLL;
        if (c0zp4 != null) {
            c0zp4.dispose();
        }
        MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModelLp = lp();
        AnonymousClass0956 anonymousClass0956 = mixStudioGeneratingPageViewModelLp.LL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        mixStudioGeneratingPageViewModelLp.setState(AFwS236S0000000_6.get$arr$(443));
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        Context context = getSupervisor().LLJIJIL;
        if (context == null) {
            super.xo();
            return;
        }
        if (C724240Sb0.LIZ(this) == null) {
            super.xo();
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, ((Number) this.LLJLIL.getValue()).intValue()));
        frameLayout.setClipToPadding(false);
        frameLayout.setClipChildren(false);
        Zo(frameLayout);
        C1295960jpS c1295960jpS = new C1295960jpS(context);
        String strGenerationBackground = MixStudioSettings.INSTANCE.generationBackground();
        if (strGenerationBackground != null) {
            c1295960jpS.setAnimationFromUrl(strGenerationBackground);
        }
        c1295960jpS.setRepeatCount(-1);
        frameLayout.addView(c1295960jpS, C435650H6l.LIZ(-1, ((Number) this.LLJLILLLLZIIL.getValue()).intValue(), 0, 0, ((Number) this.LLJLL.getValue()).intValue(), 220));
        this.LLJJJIL = c1295960jpS;
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_left_ltr);
        tuxIconView.setIconWidth(((Number) this.LLJLLIL.getValue()).intValue());
        tuxIconView.setIconHeight(((Number) this.LLJLLIL.getValue()).intValue());
        tuxIconView.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView, new ACListenerS141S0100000_6(this, 62));
        frameLayout.addView(tuxIconView, C435650H6l.LIZ(-2, -2, 0, ((Number) this.LLJLLL.getValue()).intValue(), ((Number) this.LLJZ.getValue()).intValue(), 204));
        TuxIconView tuxIconView2 = new TuxIconView(context, null, 0, 6, null);
        tuxIconView2.setIconRes(R.raw.icon_x_mark_small);
        tuxIconView2.setIconWidth(kp());
        tuxIconView2.setIconHeight(kp());
        tuxIconView2.setTintColorRes(R.attr.a1h);
        C786410Ut5.a9(tuxIconView2, new ACListenerS141S0100000_6(this, 63));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kp(), kp(), 8388661);
        layoutParams.setMarginEnd(((Number) this.LLLF.getValue()).intValue());
        layoutParams.topMargin = ((Number) this.LLL.getValue()).intValue();
        frameLayout.addView(tuxIconView2, layoutParams);
        C420500GeG c420500GeG = new C420500GeG(context);
        c420500GeG.setPivotX(mp() / 2.0f);
        c420500GeG.setPivotY(mp() / 2.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(mp(), mp(), 49);
        layoutParams2.topMargin = ((Number) this.LLLFFI.getValue()).intValue();
        frameLayout.addView(c420500GeG, layoutParams2);
        this.LLJJJJ = c420500GeG;
        C420500GeG c420500GeG2 = new C420500GeG(context);
        c420500GeG2.setPivotX(mp() / 2.0f);
        c420500GeG2.setPivotY(mp() / 2.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(mp(), mp(), 49);
        layoutParams3.topMargin = ((Number) this.LLLI.getValue()).intValue();
        frameLayout.addView(c420500GeG2, layoutParams3);
        this.LLJJJJJIL = c420500GeG2;
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        while (i < 4) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(((Number) ListProtector.get((List) this.LLLILZ.getValue(), i)).longValue());
            int i2 = i + 1;
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.LLJJJJ, (Property<C420500GeG, Float>) View.ROTATION, ((Number) ListProtector.get((List) this.LLLILZJ.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLILZJ.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJ, (Property<C420500GeG, Float>) View.SCALE_X, ((Number) ListProtector.get((List) this.LLLILZLLLI.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLILZLLLI.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJ, (Property<C420500GeG, Float>) View.SCALE_Y, ((Number) ListProtector.get((List) this.LLLILZLLLI.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLILZLLLI.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJ, (Property<C420500GeG, Float>) View.TRANSLATION_X, ((Number) ListProtector.get((List) this.LLLIZZ.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLIZZ.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJJIL, (Property<C420500GeG, Float>) View.ROTATION, ((Number) ListProtector.get((List) this.LLLJ.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLJ.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJJIL, (Property<C420500GeG, Float>) View.SCALE_X, ((Number) ListProtector.get((List) this.LLLJIL.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLJIL.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJJIL, (Property<C420500GeG, Float>) View.SCALE_Y, ((Number) ListProtector.get((List) this.LLLJIL.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLJIL.getValue(), i2)).floatValue()), ObjectAnimator.ofFloat(this.LLJJJJJIL, (Property<C420500GeG, Float>) View.TRANSLATION_X, ((Number) ListProtector.get((List) this.LLLJL.getValue(), i)).floatValue(), ((Number) ListProtector.get((List) this.LLLJL.getValue(), i2)).floatValue()));
            arrayList.add(animatorSet);
            i = i2;
        }
        AnimatorSet animatorSet2 = this.LLJJLIIIJLLLLLLLZ;
        animatorSet2.playSequentially(arrayList);
        animatorSet2.addListener(new ALAdapterS3S0100000_6(animatorSet2, 10));
        animatorSet2.start();
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(23);
        tuxTextView.setTextColorRes(R.attr.a1i);
        tuxTextView.setGravity(17);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams4.topMargin = ((Number) this.LLLIIII.getValue()).intValue();
        layoutParams4.leftMargin = ((Number) this.LLLIIIIL.getValue()).intValue();
        layoutParams4.rightMargin = ((Number) this.LLLIIIIL.getValue()).intValue();
        frameLayout.addView(tuxTextView, layoutParams4);
        this.LLJJJJLIIL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(101);
        tuxTextView2.setTextColorRes(R.attr.a1j);
        C786410Ut5.LJLLLLLL(8, tuxTextView2);
        tuxTextView2.setGravity(17);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView2.setMaxLines(3);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams5.topMargin = ((Number) this.LLLIIL.getValue()).intValue();
        int iIntValue = ((Number) this.LLLIILIL.getValue()).intValue();
        layoutParams5.setMarginStart(iIntValue);
        layoutParams5.setMarginEnd(iIntValue);
        frameLayout.addView(tuxTextView2, layoutParams5);
        this.LLJJL = tuxTextView2;
        TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
        tuxTextView3.setText(2131835859);
        tuxTextView3.setTuxFont(102);
        tuxTextView3.setTextColorRes(R.attr.a1j);
        C786410Ut5.h9(tuxTextView3, new ACListenerS141S0100000_6(this, 61));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 49);
        layoutParams6.topMargin = ((Number) this.LLLIL.getValue()).intValue();
        frameLayout.addView(tuxTextView3, layoutParams6);
        super.xo();
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem
    public final EnumC440890HQp ip() {
        return this.LLLLII;
    }

    @Override // com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioPageAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0HR7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HR5) obj).LLILLJJLI;
            }
        }, null, new AwS620S0100000_6(this, 71), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0HR8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0HR5) obj).LL;
            }
        }, null, new AwS620S0100000_6(this, 72), 6);
        C736680Sv4.LJIIIIZZ(this, lp(), new C2217381BqS() { // from class: X.0HR4
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C0HR5) obj).LLILLL);
            }
        }, null, new AwS620S0100000_6(this, 73), 6);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C439501nN(view, this, null), 3);
        hp().setState(new AwS585S0100000_6(EnumC440380HOq.STUDIO_GENERATING_PAGE, 272));
    }

    public final void op(C0HR3 c0hr3) {
        String str;
        InterfaceC440090HNn interfaceC440090HNn = lp().getState().LLILLJJLI;
        C440370HOp c440370HOp = C440370HOp.LIZ;
        EnumC441640HTm enumC441640HTmVQ2 = hp().vQ2();
        EnumC440360HOo enumC440360HOo = hp().getState().LLILLJJLI;
        boolean zIsNewUser = hp().isNewUser();
        c440370HOp.getClass();
        C0HGY c0hgyLJIILIIL = C440370HOp.LJIILIIL(interfaceC440090HNn);
        String strLJIIL = C440370HOp.LJIIL(interfaceC440090HNn);
        FriendsIDInfo friendsIDInfo = hp().wQ2().LLJ;
        if (friendsIDInfo != null) {
            str = friendsIDInfo.chatType;
        } else {
            str = null;
        }
        String strLIZLLL = lp().getState().LL.LIZLLL();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C441660HTo.LIZ(c2344009Gk, enumC441640HTmVQ2);
        c2344009Gk.LJIIIIZZ("enter_method", enumC440360HOo.getParam());
        c2344009Gk.LIZJ(zIsNewUser ? 1 : 0, "is_new_user");
        c2344009Gk.LJIIIIZZ("element", c0hgyLJIILIIL.getParam());
        c2344009Gk.LJIIIIZZ("action_type", c0hr3.getParam());
        if (strLJIIL != null) {
            c2344009Gk.LJFF("element_id", strLJIIL);
        }
        if (str != null) {
            c2344009Gk.LJFF("chat_type", str);
        }
        if (strLIZLLL != null) {
            c2344009Gk.LJFF("selected_id", strLIZLLL);
        }
        C20684815ws.LJIILLIIL("imagine_studio_click_generation_panel", c2344009Gk.LIZ);
    }
}
