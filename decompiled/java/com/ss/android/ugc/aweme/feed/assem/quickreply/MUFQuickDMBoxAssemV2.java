package com.ss.android.ugc.aweme.feed.assem.quickreply;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0H9H;
import X.C0HHT;
import X.C1220000hqw;
import X.C127G;
import X.C13LE;
import X.C1619980sG4;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C1A1K;
import X.C1A1U;
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
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import Y.AAListenerS279S0200000_33;
import Y.AObjectS80S0000000_33;
import Y.AUListenerS280S0100000_33;
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
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.service.reply.MessageDraftViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS321S0000000_33;
import kotlin.jvm.internal.AwS130S1000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class MUFQuickDMBoxAssemV2 extends BaseCellSlotComponent<MUFQuickDMBoxAssemV2> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public static final int LLLII;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(MUFQuickReplyViewModel.class), AFwS279S0000000_33.get$arr$(113));
    public final InterfaceC1731706qJ LLJLLL;
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public final C736950SvV LLL;
    public final C01GW LLLF;
    public AnimatorSet LLLFF;
    public final InterfaceC1731706qJ LLLFFI;
    public C127G LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MUFQuickDMBoxAssemV2.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MUFQuickDMBoxAssemV2.class, "quickDMViewModel", "getQuickDMViewModel()Lcom/ss/android/ugc/aweme/feed/assem/quickreply/QuickDMViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MUFQuickDMBoxAssemV2.class, "exposedCommentAvoidVM", "getExposedCommentAvoidVM()Lcom/ss/android/ugc/aweme/feed/adapter/FypExposedCommentAvoidViewModel;", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLLII = C0H9H.LIZIZ(44);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b71;
    }

    public MUFQuickDMBoxAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StatePassingVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ, 2165), null, AFwS279S0000000_33.get$arr$(110));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(QuickDMViewModel.class);
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), null, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ2, 2166), null, AFwS279S0000000_33.get$arr$(111));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS279S0000000_33.get$arr$(114));
        this.LLL = new C736950SvV(C13LE.LIZ(MessageDraftViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS279S0000000_33.get$arr$(115), new AwS577S0100000_33((AbstractC738140SxQ) this, 2168), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLLF = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2164));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(FypExposedCommentAvoidViewModel.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c0hht, c1637906bB, new AwS577S0100000_33(c19719912DlLIZ3, 2167), null, AFwS279S0000000_33.get$arr$(112));
    }

    public final QuickDMViewModel Fp() {
        return (QuickDMViewModel) this.LLJZ.getValue(this, LLLI[1]);
    }

    public final MUFQuickReplyViewModel Gp() {
        return (MUFQuickReplyViewModel) this.LLJLLIL.getValue();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLFZ;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLFZ;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MessageDraftViewModel.class, new AObjectS80S0000000_33(this, 12)}, defaultViewModelProviderFactory);
                    this.LLLFZ = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final void Bp(C1A1K c1a1k) {
        if (LJJIJL().getVisibility() != 0) {
            AnimatorSet animatorSet = this.LLLFF;
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
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, LLLII);
                valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZJ());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS280S0100000_33(this, 23));
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat, valueAnimatorOfInt);
                animatorSet2.addListener(new AAListenerS279S0200000_33(this, c1a1k, 1));
                animatorSet2.addListener(new AAListenerS279S0200000_33(this, c1a1k, 2));
                this.LLLFF = animatorSet2;
                animatorSet2.start();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final String Ep(User user) {
        if (C300660BqS.LIZ()) {
            return ((MessageDraftViewModel) this.LLL.getValue()).vQ2(user.getUid());
        }
        return null;
    }

    public final void Ip(String str) {
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1W
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C714560S1e) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS130S1000000_33(str, 1), 4);
    }

    public final void Jp(String str) {
        Object obj;
        if (C294380BgK.LIZ()) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(((VideoItemParams) obj).mEventType, "homepage_hot") && Gp().LL) {
                ((FypExposedCommentAvoidViewModel) this.LLLFFI.getValue(this, LLLI[2])).vQ2(str);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean zLJI = MethodIDManager.LJI(202356);
        C723830SaL.LIZ(this, null, new AwS590S0100000_11(this, 96));
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJZIJLIL.getValue(), new C2217381BqS() { // from class: X.0Nl3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS289S0000000_6.get$arr$(50), 4);
        C736680Sv4.LJIIIIZZ(this, Gp(), new C2217381BqS() { // from class: X.1A17
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1A1J) obj).LLILZIL;
            }
        }, null, AFwS289S0000000_6.get$arr$(51), 6);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C714560S1e) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(36), 4);
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0S1S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C714560S1e) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), AFwS321S0000000_33.get$arr$(38), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLL.getValue(this, LLLI[0]), new C2217381BqS() { // from class: X.0MXn
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C570070MXl) obj).LL;
            }
        }, null, AFwS321S0000000_33.get$arr$(34), 6);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1A1K c1a1kGU0;
        boolean z;
        VideoItemParams videoItemParams2 = videoItemParams;
        IMUFQuickDMBoxSourceAbility iMUFQuickDMBoxSourceAbility = (IMUFQuickDMBoxSourceAbility) this.LLLF.getValue();
        if (iMUFQuickDMBoxSourceAbility != null && (c1a1kGU0 = iMUFQuickDMBoxSourceAbility.gU0()) != null) {
            if (c1a1kGU0 == C1A1K.FRIENDS_STABLE_SHOW) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !Gp().LL) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1A1U(z, this, videoItemParams2, c1a1kGU0, null), 3);
        }
    }
}
