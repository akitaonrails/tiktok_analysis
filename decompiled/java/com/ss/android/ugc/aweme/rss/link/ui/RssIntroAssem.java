package com.ss.android.ugc.aweme.rss.link.ui;

import X.AnonymousClass0956;
import X.C019F;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.rss.link.viewmodel.RssLinkViewModel;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class RssIntroAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public int LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public AnimatedDrawable2 LLJI;
    public final C1559260qg8 LLJIJIL = new C1559260qg8(new C723590SZx(this, RssLinkParam.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJILJIL;
    public final Integer[] LLJILJILJ;
    public final Integer[] LLJILLL;
    public View LLJJ;
    public TuxSheet LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RssIntroAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/rss/link/viewmodel/RssLinkViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RssIntroAssem() {
        C019F c019f = C019F.LIZ;
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(this, 618);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RssLinkViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS556S0100000_12(c19719912DlLIZ, 569), AFwS269S0000000_27.get$arr$(142), awS571S0100000_27, true);
        this.LLJILJILJ = new Integer[]{2131826667, 2131826669, 2131826671};
        this.LLJILLL = new Integer[]{2131826666, 2131826668, 2131826670};
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Ho() {
        AnimatedDrawable2 animatedDrawable2 = this.LLJI;
        if (animatedDrawable2 != null) {
            animatedDrawable2.stop();
        }
        this.LLJI = null;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        RssLinkViewModel rssLinkViewModel = (RssLinkViewModel) assemVMLazy.getValue();
        rssLinkViewModel.withState(new AwS606S0100000_27(rssLinkViewModel, 331));
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        TuxSheet tuxSheet = this.LLJJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public final void Go(final int i) {
        TuxTextView tuxTextView = this.LLJJIII;
        if (tuxTextView == null || this.LLJJIJI == null || this.LLIZLLLIL == i) {
            return;
        }
        this.LLIZLLLIL = i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextView, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LLJJIJI, (Property<TuxTextView, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.LLJJIII, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(150L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.LLJJIJI, (Property<TuxTextView, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat4.setDuration(150L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0y7z
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                RssIntroAssem rssIntroAssem = this.LL;
                TuxTextView tuxTextView2 = rssIntroAssem.LLJJIII;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(C20642515q3.LJI(rssIntroAssem.LLJILJILJ[i].intValue()));
                }
                RssIntroAssem rssIntroAssem2 = this.LL;
                TuxTextView tuxTextView3 = rssIntroAssem2.LLJJIJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(C20642515q3.LJI(rssIntroAssem2.LLJILLL[i].intValue()));
                }
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.setInterpolator(new LinearInterpolator());
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0y81
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1845670y85) obj).LLILLL;
            }
        }, null, new AwS641S0100000_27(this, 83), 6);
    }
}
