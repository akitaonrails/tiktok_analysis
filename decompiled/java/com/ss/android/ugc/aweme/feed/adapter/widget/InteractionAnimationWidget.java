package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0C3D;
import X.C0T3R;
import X.C12ES;
import X.C13LE;
import X.C14EU;
import X.C19719912Dl;
import X.C1ABT;
import X.C1ACA;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C786410Ut5;
import X.C998890c6J;
import X.C998900c6K;
import X.C998910c6L;
import X.C998920c6M;
import X.C998930c6N;
import X.C998940c6O;
import X.C998950c6P;
import X.C998960c6Q;
import X.EnumC494740Jai;
import Y.ALAdapterS12S0100000_16;
import Y.AObserverS220S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.animation.ObjectAnimator;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionAnimationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes17.dex */
public final class InteractionAnimationWidget extends LiveWatchPreviewWidget {
    public ObjectAnimator LLJILJIL;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final BPEAHandler LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new C998950c6P(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C998920c6M(this));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 268));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new C998930c6N(this));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C998940c6O(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 269));

    public InteractionAnimationWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        C998900c6K c998900c6K = new C998900c6K(c19719912DlLIZ);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, c998900c6K, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new C998910c6L(c19719912DlLIZ2), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJIJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIJIIJIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        new Object() { // from class: X.0c6R
        };
    }

    public final View N1() {
        return (View) this.LLJI.getValue();
    }

    public final ViewGroup O1() {
        return (ViewGroup) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLJJIJI.removeCallbacksAndMessages(null);
        M1(true);
        if (this.LLJJIJIL) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public final void M1(boolean z) {
        this.LLJJIJI.removeCallbacksAndMessages(null);
        if (this.LLJJIJIIJIL && !z) {
            return;
        }
        this.LLJJIJIIJIL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeWhenEcCardHideV1 ");
        sbLIZ.append(hashCode());
        sbLIZ.append(' ');
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        if (z) {
            O1().animate().cancel();
            C786410Ut5.bd(0.0f, O1());
            C0C3D.LIZ.getClass();
            if (C0C3D.LIZ()) {
                View viewN1 = N1();
                if ((viewN1 instanceof View) && viewN1 != null) {
                    C786410Ut5.ed(viewN1, 0.0f);
                }
            }
            int childCount = O1().getChildCount();
            while (i < childCount) {
                View childAt = O1().getChildAt(i);
                childAt.animate().cancel();
                C786410Ut5.T4(childAt, 1.0f);
                i++;
            }
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = O1().animate();
        viewPropertyAnimatorAnimate.cancel();
        viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
        C0C3D.LIZ.getClass();
        if (C0C3D.LIZ()) {
            View viewN12 = N1();
            if ((viewN12 instanceof View) && viewN12 != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewN12.animate();
                viewPropertyAnimatorAnimate2.cancel();
                viewPropertyAnimatorAnimate2.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
            }
        }
        int childCount2 = O1().getChildCount();
        while (i < childCount2) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate3 = O1().getChildAt(i).animate();
            viewPropertyAnimatorAnimate3.cancel();
            viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
            i++;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLiveSkyShowEvent(C0T3R c0t3r) {
        C998960c6Q.LIZ.getClass();
        int i = C998960c6Q.LIZIZ;
        if (i == 2 && c0t3r.LIZ && c0t3r.LIZIZ) {
            return;
        }
        boolean z = c0t3r.LIZ;
        if (i != 0 && this.LL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("changeWhenSkylightShow ");
            sbLIZ.append(hashCode());
            sbLIZ.append(' ');
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                ViewGroup viewGroupO1 = O1();
                if ((viewGroupO1 instanceof View) && viewGroupO1 != null) {
                    C786410Ut5.ed(viewGroupO1, 0.0f);
                    viewGroupO1.animate().cancel();
                    viewGroupO1.animate().translationY((-1) * C12ES.LIZJ(230.0f, viewGroupO1.getContext())).setDuration(360L).setStartDelay(0L).start();
                    return;
                }
                return;
            }
            ViewGroup viewGroupO12 = O1();
            if (!(viewGroupO12 instanceof View) || viewGroupO12 == null) {
                return;
            }
            C786410Ut5.ed(viewGroupO12, 0.0f);
            viewGroupO12.animate().cancel();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        NextLiveData<C998890c6J> nextLiveData;
        String strLIZLLL;
        C1ACA c1acaDQ2;
        super.onLoad(objArr);
        C998960c6Q.LIZ.getClass();
        if (C998960c6Q.LIZIZ != 0) {
            FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
            if (feedLiveViewHolderVM != null && (c1acaDQ2 = feedLiveViewHolderVM.DQ2()) != null) {
                strLIZLLL = C1ABT.LIZLLL(c1acaDQ2);
            } else {
                strLIZLLL = null;
            }
            if (TextUtils.equals(strLIZLLL, "homepage_follow")) {
                EventBus.LIZLLL().LJIJJ(this);
                this.LLJJIJIL = true;
            }
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM2 != null && (nextLiveData = feedLiveViewHolderVM2.LLJJJJ) != null) {
            nextLiveData.observe(this, new Observer() { // from class: X.0c6I
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    float f;
                    C998890c6J c998890c6J = (C998890c6J) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("showSmoothEnterAnimation ");
                    sbLIZ.append(this.LL.hashCode());
                    sbLIZ.append(' ');
                    sbLIZ.append(c998890c6J.LIZ);
                    C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
                    boolean z = c998890c6J.LIZ;
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = 1.0f;
                    }
                    if (z) {
                        InteractionAnimationWidget interactionAnimationWidget = this.LL;
                        interactionAnimationWidget.LLJILJIL = ObjectAnimator.ofFloat(interactionAnimationWidget.O1(), "alpha", this.LL.O1().getAlpha(), f);
                        InteractionAnimationWidget interactionAnimationWidget2 = this.LL;
                        ObjectAnimator objectAnimator = interactionAnimationWidget2.LLJILJIL;
                        if (objectAnimator != null) {
                            objectAnimator.setDuration(300L);
                            objectAnimator.setInterpolator(new LinearInterpolator());
                            objectAnimator.addListener(new ALAdapterS12S0100000_16(interactionAnimationWidget2, 5));
                        }
                        ObjectAnimator objectAnimator2 = this.LL.LLJILJIL;
                        if (objectAnimator2 != null) {
                            C786410Ut5.Pd(objectAnimator2);
                            return;
                        }
                        return;
                    }
                    ObjectAnimator objectAnimator3 = this.LL.LLJILJIL;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    InteractionAnimationWidget interactionAnimationWidget3 = this.LL;
                    interactionAnimationWidget3.LLJILJIL = null;
                    if (c998890c6J.LIZIZ > 0) {
                        interactionAnimationWidget3.LLJILJIL = ObjectAnimator.ofFloat(interactionAnimationWidget3.O1(), "alpha", this.LL.O1().getAlpha(), f);
                        ObjectAnimator objectAnimator4 = this.LL.LLJILJIL;
                        if (objectAnimator4 != null) {
                            objectAnimator4.setDuration(c998890c6J.LIZIZ);
                            objectAnimator4.setInterpolator(new LinearInterpolator());
                        }
                        ObjectAnimator objectAnimator5 = this.LL.LLJILJIL;
                        if (objectAnimator5 == null) {
                            return;
                        }
                        C786410Ut5.Pd(objectAnimator5);
                        return;
                    }
                    C786410Ut5.R4(f, interactionAnimationWidget3.O1());
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM3 = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM3 != null && (mutableLiveData4 = feedLiveViewHolderVM3.LLJLLIL) != null) {
            mutableLiveData4.observe(this, new Observer() { // from class: X.0c6H
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveRoomStruct liveRoomStruct;
                    FypRecommendInfo ecommerceFypRecommendInfo;
                    Integer num = (Integer) obj;
                    C1ACA c1acaZ1 = this.LL.z1();
                    boolean z = true;
                    if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (ecommerceFypRecommendInfo = liveRoomStruct.getEcommerceFypRecommendInfo()) != null && 1 == ecommerceFypRecommendInfo.getDisplayStyle()) {
                        if (num.intValue() > 0) {
                            InteractionAnimationWidget interactionAnimationWidget = this.LL;
                            if (interactionAnimationWidget.LLJJIJIIJIL) {
                                interactionAnimationWidget.LLJJIJIIJIL = false;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("changeWhenEcCardShowV1 ");
                                sbLIZ.append(interactionAnimationWidget.hashCode());
                                C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
                                interactionAnimationWidget.O1().animate().cancel();
                                C786410Ut5.bd(0.0f, interactionAnimationWidget.O1());
                                C786410Ut5.LJJZZIII(interactionAnimationWidget.LLJJIJI, new ARunnableS116S0100000_16(interactionAnimationWidget, 119));
                                return;
                            }
                            return;
                        }
                        InteractionAnimationWidget interactionAnimationWidget2 = this.LL;
                        if (num.intValue() != -1) {
                            z = false;
                        }
                        interactionAnimationWidget2.M1(z);
                    }
                }
            });
        }
        C0C3D.LIZ.getClass();
        if (C0C3D.LIZ() && (livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJJI.getValue()) != null && (mutableLiveData3 = livePreviewGuideEnterVM.LLILLL) != null) {
            mutableLiveData3.observe(this, new AObserverS220S0100000_16(this, 5));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM4 = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM4 != null && (mutableLiveData2 = feedLiveViewHolderVM4.LLLIIL) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.0c6G
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean z;
                    Integer num = (Integer) obj;
                    int i = 0;
                    if (num.intValue() > 0) {
                        InteractionAnimationWidget interactionAnimationWidget = this.LL;
                        if (interactionAnimationWidget.LLJJIJIIJIL) {
                            interactionAnimationWidget.LLJJIJIIJIL = false;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("changeWhenGameRewardsCardShow ");
                            sbLIZ.append(interactionAnimationWidget.hashCode());
                            C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ));
                            interactionAnimationWidget.O1().animate().cancel();
                            C786410Ut5.bd(0.0f, interactionAnimationWidget.O1());
                            C786410Ut5.LJJZZIII(interactionAnimationWidget.LLJJIJI, new ARunnableS116S0100000_16(interactionAnimationWidget, 120));
                            return;
                        }
                        return;
                    }
                    InteractionAnimationWidget interactionAnimationWidget2 = this.LL;
                    if (num.intValue() < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interactionAnimationWidget2.LLJJIJI.removeCallbacksAndMessages(null);
                    if (interactionAnimationWidget2.LLJJIJIIJIL && !z) {
                        return;
                    }
                    interactionAnimationWidget2.LLJJIJIIJIL = true;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("changeWhenGameRewardsCardHide ");
                    sbLIZ2.append(interactionAnimationWidget2.hashCode());
                    sbLIZ2.append(' ');
                    sbLIZ2.append(z);
                    C20441214yg.LJIIIZ("InteractionAnimationWidget", C2188811AlT.LIZIZ(sbLIZ2));
                    if (z) {
                        interactionAnimationWidget2.O1().animate().cancel();
                        C786410Ut5.bd(0.0f, interactionAnimationWidget2.O1());
                        C0C3D.LIZ.getClass();
                        if (C0C3D.LIZ()) {
                            View viewN1 = interactionAnimationWidget2.N1();
                            if ((viewN1 instanceof View) && viewN1 != null) {
                                C786410Ut5.ed(viewN1, 0.0f);
                            }
                        }
                        int childCount = interactionAnimationWidget2.O1().getChildCount();
                        while (i < childCount) {
                            View childAt = interactionAnimationWidget2.O1().getChildAt(i);
                            childAt.animate().cancel();
                            C786410Ut5.T4(childAt, 1.0f);
                            i++;
                        }
                        return;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = interactionAnimationWidget2.O1().animate();
                    viewPropertyAnimatorAnimate.cancel();
                    viewPropertyAnimatorAnimate.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
                    C0C3D.LIZ.getClass();
                    if (C0C3D.LIZ()) {
                        View viewN12 = interactionAnimationWidget2.N1();
                        if ((viewN12 instanceof View) && viewN12 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewN12.animate();
                            viewPropertyAnimatorAnimate2.cancel();
                            viewPropertyAnimatorAnimate2.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
                        }
                    }
                    int childCount2 = interactionAnimationWidget2.O1().getChildCount();
                    while (i < childCount2) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = interactionAnimationWidget2.O1().getChildAt(i).animate();
                        viewPropertyAnimatorAnimate3.cancel();
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
                        i++;
                    }
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM5 = (FeedLiveViewHolderVM) this.LLJJIII.getValue();
        if (feedLiveViewHolderVM5 != null && (mutableLiveData = feedLiveViewHolderVM5.LLJLLL) != null) {
            mutableLiveData.observe(this, new AObserverS220S0100000_16(this, 6));
        }
    }
}
