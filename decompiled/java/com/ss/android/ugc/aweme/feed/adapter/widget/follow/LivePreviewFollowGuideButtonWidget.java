package com.ss.android.ugc.aweme.feed.adapter.widget.follow;

import X.C01GW;
import X.C0CAU;
import X.C0TKT;
import X.C0TL9;
import X.C13LE;
import X.C197039127h;
import X.C19719912Dl;
import X.C1A5L;
import X.C1ACA;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C418440Gaw;
import X.C452501pT;
import X.C497740JfY;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import Y.ACListenerS147S0100000_12;
import Y.ALAdapterS9S0100000_12;
import Y.AObserverS216S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class LivePreviewFollowGuideButtonWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public ARunnableS112S0100000_12 LLJJI;
    public Runnable LLJJIII;
    public Animator LLJJIJI;
    public Animator LLJJIJIIJIL;
    public Integer LLJJIJIL;
    public Animator LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public Boolean LLJJJJLIIL;
    public boolean LLJJL;

    public LivePreviewFollowGuideButtonWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewBottomCardVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 457);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PreviewSurveyViewModel.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 458), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ3, 459), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 455));
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LivePreviewFollowVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ4, 460), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ5, 461), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 456));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dg9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        if (this.LL) {
            R1(C0TL9.LJ(z1()));
        }
    }

    public final void M1() {
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = this.LLJJI;
        if (aRunnableS112S0100000_12 != null) {
            C0CAU.LIZ.removeCallbacks(aRunnableS112S0100000_12);
        }
        this.LLJJI = null;
        Runnable runnable = this.LLJJIII;
        if (runnable != null) {
            C0CAU.LIZ.removeCallbacks(runnable);
        }
        this.LLJJIII = null;
    }

    public final C197039127h N1() {
        return (C197039127h) this.LLJILJIL.getValue();
    }

    public final C197039127h O1() {
        return (C197039127h) this.LLJJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        P1(false);
        if (!this.LLJJJJJIL && this.LLJJJJ) {
            z1();
            C0TL9.LJIIJ();
        }
        this.LLJJJJJIL = false;
        this.LLJJJJ = false;
        this.LLJJJJLIIL = null;
    }

    public final void Q1() {
        C786410Ut5.U8(N1(), null);
        C786410Ut5.U8(O1(), null);
        this.LLJJL = false;
        C339190DRl.LIZIZ(getView());
        View view = getView();
        if (view != null) {
            C786410Ut5.ed(view, 0.0f);
        }
        C786410Ut5.w5(O1(), 1.0f);
        C339190DRl.LIZLLL(O1());
        N1().setButtonVariant(0);
        Integer num = this.LLJJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            N1().getLayoutParams().width = iIntValue;
            O1().getLayoutParams().width = iIntValue;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        R1(C0TL9.LJ(z1()));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        P1(false);
    }

    public final void P1(boolean z) {
        if (!this.LLJJJIL) {
            return;
        }
        this.LLJJJIL = false;
        M1();
        Animator animator = this.LLJJIJI;
        if (animator != null) {
            animator.cancel();
        }
        this.LLJJIJI = null;
        Animator animator2 = this.LLJJIJIIJIL;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LLJJIJIIJIL = null;
        if (!z) {
            Q1();
            return;
        }
        View view = getView();
        if (view != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36)), 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(view, 28));
            valueAnimatorOfInt.addListener(new ALAdapterS9S0100000_12(this, 15));
            valueAnimatorOfInt.start();
            this.LLJJIJIIJIL = valueAnimatorOfInt;
        }
    }

    public final void R1(long j) {
        if (this.LLJJJIL || this.LLJJJJ || !this.LL || !C0TL9.LIZ(z1())) {
            return;
        }
        Boolean bool = this.LLJJJJLIIL;
        Boolean bool2 = Boolean.TRUE;
        if (!Intrinsics.LJFF(bool, bool2) && !C0TL9.LIZJ()) {
            this.LLJJJJLIIL = Boolean.FALSE;
            this.LLJJJIL = true;
            M1();
            C2271391DvN.LIZ(N1(), (C1A5L) C2271381DvM.LJLILLLLZI.getValue());
            C786410Ut5.U8(N1(), new ACListenerS147S0100000_12(this, 382));
            C2271391DvN.LIZ(O1(), (C1A5L) C2271381DvM.LJLJI.getValue());
            C786410Ut5.U8(O1(), new ACListenerS147S0100000_12(this, 383));
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                c1acaZ1.LJLIIIL = C0TKT.WATCH_DURATION_NOT.getReason();
            }
            N1().setText(C497740JfY.LJIJI(2131855407));
            ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 179);
            this.LLJJI = aRunnableS112S0100000_12;
            C786410Ut5.LJLIIL(j, C0CAU.LIZ, aRunnableS112S0100000_12);
            return;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            c1acaZ12.LJLIIIL = C0TKT.FREQUENCY_CONTROL.getReason();
        }
        this.LLJJJJLIIL = bool2;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        NextLiveData<Boolean> nextLiveData;
        super.onLoad(objArr);
        LivePreviewBottomCardVM livePreviewBottomCardVM = (LivePreviewBottomCardVM) this.LLJ.getValue();
        if (livePreviewBottomCardVM != null && (nextLiveData = livePreviewBottomCardVM.LLILZLL) != null) {
            nextLiveData.observe(this, new AObserverS216S0100000_12(this, 40));
        }
        this.LLJJIJIL = Integer.valueOf(O1().getWidth());
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJIJIL.getValue();
        if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS216S0100000_12(this, 41));
        }
    }
}
