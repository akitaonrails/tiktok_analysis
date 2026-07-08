package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C04U8;
import X.C07BD;
import X.C12ES;
import X.C13LE;
import X.C14LC;
import X.C14Z5;
import X.C19719912Dl;
import X.C1ACA;
import X.C20285414Yy;
import X.C2175271ABh;
import X.C2175281ABi;
import X.C2175291ABj;
import X.C309690CBz;
import X.C452501pT;
import X.C786410Ut5;
import X.C988000bok;
import X.C999280c6w;
import X.EnumC494740Jai;
import Y.AObserverS235S0100000_33;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdAboveInteractiveSlotLiveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCapabilityAggregateLiveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class InteractionContainerWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ = C452501pT.LIZIZ(new C2175291ABj(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2087));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2086));
    public final C01GW LLJILJIL;

    public InteractionContainerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C2175271ABh(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    static {
        new Object() { // from class: X.1ABk
        };
    }

    public final ConstraintLayout M1() {
        return (ConstraintLayout) this.LLJ.getValue();
    }

    public final void N1() {
        boolean z = C14LC.LJIIIZ;
        int dimensionPixelSize = C309690CBz.LIZ.LJFF ? 0 : this.context.getResources().getDimensionPixelSize(R.dimen.ai3);
        if (((Boolean) C07BD.LIZ.getValue()).booleanValue()) {
            C12ES.LJIJ(M1(), dimensionPixelSize);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) M1().getLayoutParams();
        marginLayoutParams.bottomMargin = dimensionPixelSize;
        C786410Ut5.m6(M1(), marginLayoutParams);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        MutableLiveData<Boolean> mutableLiveData;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJILJIL.getValue();
        if (livePreviewGuideEnterVM == null || (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            super.show();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        LivePreviewGuideEnterVM livePreviewGuideEnterVM;
        MutableLiveData<Boolean> mutableLiveData;
        show();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && c1acaZ1.LIZJ != null && ((livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJILJIL.getValue()) == null || (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE))) {
            C786410Ut5.LL(0, M1());
        }
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void G1() {
        N1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void D1(boolean z) {
        if (z) {
            M1().animate().alpha(0.0f).setDuration(200L).start();
            hide();
        } else {
            M1().animate().alpha(1.0f).setDuration(200L).start();
            show();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        String aid;
        Aweme aweme;
        MutableLiveData<Boolean> mutableLiveData;
        show();
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJILJIL.getValue();
        if (livePreviewGuideEnterVM != null && (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            return;
        }
        C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
        C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (c20285414YyLIZ.LIZLLL(C14Z5.BACKGROUND.getType(), aid)) {
            C786410Ut5.LL(8, M1());
        } else {
            C786410Ut5.LL(0, M1());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        enablePreviewSubWidgetManager();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Boolean> mutableLiveData;
        super.onLoad(objArr);
        C999280c6w.LIZ(AdCardWidget.LLJJIJIIJIL, new C2175281ABi(this));
        if (((Boolean) C04U8.LIZ.getValue()).booleanValue()) {
            this.subWidgetManager.createWidget(findViewById(R.id.i3m), new AdAboveInteractiveSlotLiveWidget());
            this.subWidgetManager.createWidget(findViewById(R.id.i3m), new AdCapabilityAggregateLiveWidget());
        }
        this.subWidgetManager.createWidget(findViewById(R.id.i3m), new InteractionAnimationWidget());
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJILJIL.getValue();
        if (livePreviewGuideEnterVM != null && (mutableLiveData = livePreviewGuideEnterVM.LLILZIL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 7));
        }
    }
}
