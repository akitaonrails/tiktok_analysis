package com.ss.android.ugc.aweme.feed.adapter.widget.follow;

import X.C01GW;
import X.C0CAU;
import X.C0TKT;
import X.C0TL9;
import X.C1243240iSQ;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ACA;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C438710HIf;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import Y.ACListenerS147S0100000_12;
import Y.ALAdapterS9S0100000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AUListenerS1S0100002_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewFollowGuideCardWidget extends AbsLivePreviewBottomCardWidget {
    public final ViewGroup LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public Animator LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public Animator LLJJJ;
    public ARunnableS112S0100000_12 LLJJJIL;
    public ARunnableS112S0100000_12 LLJJJJ;
    public boolean LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dg_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.widget.bottom.AbsLivePreviewBottomCardWidget, com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        if (this.LL) {
            R1();
        }
    }

    public final ViewGroup N1() {
        return (ViewGroup) this.LLJJIII.getValue();
    }

    public final C197039127h O1() {
        return (C197039127h) this.LLJILJILJ.getValue();
    }

    public final void R1() {
        NextLiveData<Boolean> nextLiveData;
        if (this.LLJJJJJIL && !this.LLJJL && this.LL) {
            LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
            if ((livePreviewBottomCardVMM1 == null || (nextLiveData = livePreviewBottomCardVMM1.LLILLL) == null || !Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) && C0TL9.LIZ(z1())) {
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJIL;
                if (aRunnableS112S0100000_12 != null) {
                    C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_12);
                }
                this.LLJJJIL = null;
                ARunnableS112S0100000_12 aRunnableS112S0100000_122 = this.LLJJJJ;
                if (aRunnableS112S0100000_122 != null) {
                    C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_122);
                }
                this.LLJJJJ = null;
                C1ACA c1acaZ1 = z1();
                if (c1acaZ1 != null) {
                    c1acaZ1.LJLIIIL = C0TKT.WATCH_DURATION_NOT.getReason();
                }
                ARunnableS112S0100000_12 aRunnableS112S0100000_123 = new ARunnableS112S0100000_12(this, 180);
                this.LLJJJIL = aRunnableS112S0100000_123;
                C786410Ut5.LJLIIL(C0TL9.LJ(z1()), C0CAU.LIZ, aRunnableS112S0100000_123);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        String strLIZ;
        LiveRoomStruct liveRoomStruct;
        User user;
        LiveRoomStruct liveRoomStruct2;
        User user2;
        UrlModel avatarThumb;
        if (C0TL9.LIZ(z1())) {
            Boolean bool = this.LLJJJJLIIL;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2) || C0TL9.LIZJ()) {
                C1ACA c1acaZ1 = z1();
                if (c1acaZ1 != null) {
                    c1acaZ1.LJLIIIL = C0TKT.FREQUENCY_CONTROL.getReason();
                }
                this.LLJJJJLIIL = bool2;
                return;
            }
            this.LLJJJJLIIL = Boolean.FALSE;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct2 = c1acaZ12.LIZJ) != null && (user2 = liveRoomStruct2.owner) != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                C427660Gpo.LJIIJJI((C427660Gpo) this.LLJJ.getValue(), C438710HIf.LIZ(avatarThumb), false, null, null, false, false, null, null, false, null, 1022);
            }
            O1().setText(C497740JfY.LJIJI(2131855407));
            TextView textView = (TextView) this.LLJILLL.getValue();
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null || (user = liveRoomStruct.owner) == null) {
                strLIZ = null;
            } else {
                C1243240iSQ.LIZ.getClass();
                strLIZ = C1243240iSQ.LIZ(user, true);
            }
            textView.setText(strLIZ);
            C2271391DvN.LIZ(O1(), (C1A5L) C2271381DvM.LJLJJI.getValue());
            C786410Ut5.U8(O1(), new ACListenerS147S0100000_12(this, 384));
            C2271391DvN.LIZ(O1(), (C1A5L) C2271381DvM.LJLJJL.getValue());
            C786410Ut5.a9((TuxIconView) this.LLJJI.getValue(), new ACListenerS147S0100000_12(this, 385));
            this.LLJJJJJIL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        P1(false);
        if (!this.LLJJLIIIJLLLLLLLZ && this.LLJJL) {
            z1();
            C0TL9.LJIIJ();
        }
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJJL = false;
        this.LLJJJJLIIL = null;
    }

    public final void Q1() {
        View view = getView();
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        C786410Ut5.U8(O1(), null);
        C786410Ut5.a9((TuxIconView) this.LLJJI.getValue(), null);
        O1().setButtonVariant(0);
    }

    public LivePreviewFollowGuideCardWidget(ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewFollowVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 467);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 466));
        this.LLJILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 463));
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 462));
        this.LLJJI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 465));
        this.LLJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 464));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PreviewSurveyViewModel.class);
        this.LLJJIJIIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 468), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ3, 469), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        R1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        P1(false);
    }

    public final void P1(boolean z) {
        NextLiveData<Boolean> nextLiveData;
        int height;
        NextLiveData<Boolean> nextLiveData2;
        LivePreviewBottomCardVM livePreviewBottomCardVMM1 = M1();
        if (livePreviewBottomCardVMM1 != null && (nextLiveData = livePreviewBottomCardVMM1.LLILLL) != null && Intrinsics.LJFF(nextLiveData.getValue(), Boolean.TRUE)) {
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJJIL;
            if (aRunnableS112S0100000_12 != null) {
                C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_12);
            }
            this.LLJJJIL = null;
            ARunnableS112S0100000_12 aRunnableS112S0100000_122 = this.LLJJJJ;
            if (aRunnableS112S0100000_122 != null) {
                C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_122);
            }
            this.LLJJJJ = null;
            Animator animator = this.LLJJIJI;
            if (animator != null) {
                animator.cancel();
            }
            this.LLJJIJI = null;
            Animator animator2 = this.LLJJJ;
            if (animator2 != null) {
                animator2.cancel();
            }
            this.LLJJJ = null;
            LivePreviewBottomCardVM livePreviewBottomCardVMM12 = M1();
            if (livePreviewBottomCardVMM12 != null && (nextLiveData2 = livePreviewBottomCardVMM12.LLILLL) != null) {
                nextLiveData2.setValue(Boolean.FALSE);
            }
            LivePreviewBottomCardVM livePreviewBottomCardVMM13 = M1();
            if (livePreviewBottomCardVMM13 != null) {
                livePreviewBottomCardVMM13.LLILZ = true;
            }
            float translationY = N1().getTranslationY();
            View view = getView();
            if (view != null) {
                height = view.getHeight();
            } else {
                height = 0;
            }
            float fLIZIZ = height + C418440Gaw.LIZIZ(12);
            Animator animator3 = this.LLJJIJI;
            if (animator3 != null) {
                animator3.cancel();
            }
            this.LLJJIJI = null;
            if (!z) {
                Animator animator4 = this.LLJJJ;
                if (animator4 != null) {
                    animator4.cancel();
                }
                this.LLJJJ = null;
                View view2 = getView();
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                int childCount = N1().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = N1().getChildAt(i);
                    if (childAt.getId() != R.id.chm) {
                        C786410Ut5.T4(childAt, 1.0f);
                    }
                }
                C786410Ut5.bd(0.0f, N1());
                Q1();
                return;
            }
            Animator animator5 = this.LLJJJ;
            if (animator5 != null && animator5.isRunning()) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS1S0100002_12(this, translationY, fLIZIZ, 2));
            valueAnimatorOfFloat.addListener(new ALAdapterS9S0100000_12(this, 16));
            valueAnimatorOfFloat.start();
            this.LLJJJ = valueAnimatorOfFloat;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        super.onLoad(objArr);
        O1().setBackgroundRadius(6);
        final String strLJIJI = C497740JfY.LJIJI(2131855407);
        final String strLJIJI2 = C497740JfY.LJIJI(2131855408);
        HandlerHook.viewPost(O1(), new Runnable() { // from class: X.0Gek
            public final void LIZ() {
                if (strLJIJI == null || strLJIJI2 == null) {
                    return;
                }
                TextPaint paint = this.O1().getPaint();
                this.O1().setWidth(Math.min((int) (Math.max(paint.measureText(strLJIJI), paint.measureText(strLJIJI2)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LivePreviewFollowGuideCardWidget@11c9.onLoad$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LivePreviewFollowGuideCardWidget@11c9.onLoad$1");
            }
        });
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJJIJIL.getValue();
        if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS216S0100000_12(this, 42));
        }
    }
}
