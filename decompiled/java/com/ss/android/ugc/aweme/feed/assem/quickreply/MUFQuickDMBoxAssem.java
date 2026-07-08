package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0H9H;
import X.C0HHT;
import X.C0I0B;
import X.C0S1H;
import X.C0S2R;
import X.C0S2S;
import X.C0S2U;
import X.C0ZH1;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1A1F;
import X.C1A1K;
import X.C1A1T;
import X.C2217381BqS;
import X.C23250099c;
import X.C294380BgK;
import X.C300660BqS;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C723700Sa8;
import X.C723830SaL;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC2172611A1b;
import X.EnumC714710S1t;
import X.EnumC913010Zrn;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS343S0100000_33;
import Y.AObjectS80S0000000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.adapter.FypExposedCommentAvoidViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.quickchat.mob.IUnifyQuickReplyAnalytics;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS130S1000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MUFQuickDMBoxAssem extends BaseCellSlotComponent<MUFQuickDMBoxAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public static final int LLLIILIL;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS279S0000000_33.get$arr$(106));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), AFwS279S0000000_33.get$arr$(107));
    public final C01GW LLJZ = C737910Sx3.LIZJ(this, C13LE.LIZ(MUFQuickReplyViewModel.class), AFwS279S0000000_33.get$arr$(108));
    public final InterfaceC1731706qJ LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C736950SvV LLLF;
    public final C01GW LLLFF;
    public AnimatorSet LLLFFI;
    public final InterfaceC1731706qJ LLLFZ;
    public C1A1K LLLI;
    public String LLLII;
    public C0S2U LLLIIII;
    public C0ZH1 LLLIIIIL;
    public C127G LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MUFQuickDMBoxAssem.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MUFQuickDMBoxAssem.class, "quickDMViewModel", "getQuickDMViewModel()Lcom/ss/android/ugc/aweme/feed/assem/quickreply/QuickDMViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MUFQuickDMBoxAssem.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLLIILIL = C0H9H.LIZIZ(44);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b71;
    }

    public MUFQuickDMBoxAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StatePassingVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZIJLIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ, 2159), null, AFwS279S0000000_33.get$arr$(103));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(QuickDMViewModel.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ2, 2160), null, AFwS279S0000000_33.get$arr$(104));
        this.LLLF = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS279S0000000_33.get$arr$(109), new AwS577S0100000_33((AbstractC738140SxQ) this, 2162), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLFF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2163));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        this.LLLFZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ3, 2161), null, AFwS279S0000000_33.get$arr$(105));
        this.LLLIIII = C0S2U.UNKNOWN;
        this.LLLIIIIL = C0ZH1.UNKNOWN;
    }

    public final QuickDMViewModel Fp() {
        return (QuickDMViewModel) this.LLL.getValue(this, LLLIIL[1]);
    }

    public final MUFQuickReplyViewModel Gp() {
        return (MUFQuickReplyViewModel) this.LLJZ.getValue();
    }

    public final UpdateContentionAbility Ip() {
        return (UpdateContentionAbility) this.LLLFF.getValue();
    }

    public final void Tp() {
        String str = this.LLLII;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (Intrinsics.LJFF(str, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid())) {
            return;
        }
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C724270Sb3 c724270Sb32 = this.LLJI;
            String str2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str2);
            C0S2U c0s2u = this.LLLIIII;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.LIKE_VIDEO;
            C724270Sb3 c724270Sb33 = this.LLJI;
            String aid = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, this.LLLIIIIL, C0S2R.PRIVATE, "", C0I0B.LJFF.LIZIZ());
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        this.LLLII = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).getAweme().getAid();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS80S0000000_33(this, 11)}, defaultViewModelProviderFactory);
                    this.LLLIIIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Bp(C1A1K c1a1k) {
        if (LJJIJL().getVisibility() != 0) {
            AnimatorSet animatorSet = this.LLLFFI;
            if (animatorSet != null && animatorSet.isRunning()) {
                return;
            }
            View viewLJJIJL = LJJIJL();
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                C786410Ut5.W5(viewLJJIJL, layoutParams);
                C786410Ut5.T4(viewLJJIJL, 0.0f);
                C786410Ut5.LJLLLLLL(0, viewLJJIJL);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), (Property<View, Float>) View.ALPHA, 1.0f);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                objectAnimatorOfFloat.setDuration(100L);
                objectAnimatorOfFloat.setStartDelay(200L);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, LLLIILIL);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZJ());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS280S0100000_33(this, 22));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                animatorSet2.addListener(new AAListenerS343S0100000_33(this, 4));
                animatorSet2.addListener(new Animator.AnimatorListener() { // from class: X.19vg
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                    }
                });
                this.LLLFFI = animatorSet2;
                animatorSet2.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final String Ep(User user) {
        if (C300660BqS.LIZ()) {
            return ((MessageDraftViewModel) this.LLLF.getValue()).vQ2(user.getUid());
        }
        return null;
    }

    public final void Jp(String str) {
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C714560S1e) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS130S1000000_33(str, 0), 4);
    }

    public final void Qp(EnumC714710S1t enumC714710S1t) {
        Object obj;
        IUnifyQuickReplyAnalytics.LIZ.getClass();
        IUnifyQuickReplyAnalytics iUnifyQuickReplyAnalyticsLIZ = C0S1H.LIZ();
        if (iUnifyQuickReplyAnalyticsLIZ != null) {
            C0S2S c0s2s = EnumC2172611A1b.Companion;
            C724270Sb3 c724270Sb3 = this.LLJI;
            Object obj2 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            String str = ((VideoItemParams) obj).mEventType;
            c0s2s.getClass();
            EnumC2172611A1b enumC2172611A1bLIZ = C0S2S.LIZ(str);
            C0S2U c0s2u = this.LLLIIII;
            EnumC913010Zrn enumC913010Zrn = EnumC913010Zrn.LIKE_VIDEO;
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            String aid = ((VideoItemParams) obj2).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            iUnifyQuickReplyAnalyticsLIZ.LIZIZ(enumC2172611A1bLIZ, c0s2u, enumC913010Zrn, aid, this.LLLIIIIL, C0S2R.PRIVATE, enumC714710S1t, C0I0B.LJFF.LIZIZ());
        }
    }

    public final void Up(String str) {
        Object obj;
        if (C294380BgK.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot") && Gp().LL) {
                ((FypExposedCommentAvoidViewModel) this.LLLFZ.getValue(this, LLLIIL[2])).vQ2(str);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean zLJI = MethodIDManager.LJI(202356);
        Object obj = null;
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 95));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0NzU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILLL;
            }
        }, null, AFwS321S0000000_33.get$arr$(41), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0Nl5
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C709790Rsn) obj2).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(53), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1A18
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1A1J) obj2).LLILZIL;
            }
        }, null, AFwS289S0000000_6.get$arr$(54), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C714560S1e) obj2).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS294S0000000_11.get$arr$(264), 4);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C714560S1e) obj2).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(35), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(this, LLLIIL[0]), new C2217381BqS() { // from class: X.0MXm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C570070MXl) obj2).LL;
            }
        }, null, AFwS321S0000000_33.get$arr$(37), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0cFk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj2) {
                return ((C1ELP) obj2).LLILZIL;
            }
        }, null, AFwS321S0000000_33.get$arr$(39), 6);
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        }
        if (C1A1F.LIZIZ(((VideoItemParams) obj).mEventType)) {
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0SCb
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1ELP) obj2).LLJJI;
                }
            }, null, AFwS321S0000000_33.get$arr$(4), 6);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
    }

    public final void Vp(VideoItemParams videoItemParams, C1A1K c1a1k) {
        boolean z;
        if (c1a1k == C1A1K.FRIENDS_STABLE_SHOW) {
            z = true;
        } else {
            z = false;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1A1T(z, this, videoItemParams, c1a1k, null), 3);
    }
}
