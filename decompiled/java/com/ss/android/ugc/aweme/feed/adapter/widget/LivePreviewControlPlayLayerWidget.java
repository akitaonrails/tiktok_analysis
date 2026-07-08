package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0C3F;
import X.C0SUL;
import X.C13LE;
import X.C19719912Dl;
import X.C1A7N;
import X.C1A7O;
import X.C1A7P;
import X.C1A7Q;
import X.C1AAV;
import X.C1ABZ;
import X.C1ACA;
import X.C1ECM;
import X.C20094213jo;
import X.C21153017qC;
import X.C305570ByN;
import X.C486790J7d;
import X.C487180J8q;
import X.C786410Ut5;
import X.EnumC494740Jai;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewControlPlayLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.billboard.LivePreviewBillboardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.degrade.LivePreviewPerfDegradeWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.degrade.exps.LiveCardDegradeConfigStore;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.pause.LivePreviewPausedWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LiveHighlightsVideoPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2;
import com.ss.android.ugc.feed.platform.panel.accessibility.A11yFeedToolComponent;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewControlPlayLayerWidget extends LiveWatchPreviewWidget {
    public final View LLJ;
    public final String LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final AtomicBoolean LLJILLL;
    public LivePreviewPausedWidget LLJJ;
    public GamePreviewBillboardWidget LLJJI;
    public final HashMap<Integer, String> LLJJIII;
    public LivePreviewPlayerWidget LLJJIJI;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final void N1() {
        C0C3F c0c3f = C0C3F.LIZ;
        String str = this.LLJI;
        c0c3f.getClass();
        if (!C0C3F.LIZJ(str)) {
            C486790J7d.LIZLLL(new ARunnableS133S0100000_33(this, 46), this, 20L);
            return;
        }
        C21153017qC c21153017qC = C21153017qC.LIZ;
        C1ABZ c1abz = new C1ABZ(this);
        c21153017qC.getClass();
        C21153017qC.LIZ(c1abz);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() {
        /*
            r6 = this;
            X.1ACA r5 = r6.z1()
            r2 = 0
            if (r5 == 0) goto La8
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r5.LIZJ
            if (r0 == 0) goto La8
            int r0 = r0.liveRoomMode
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L11:
            r3 = 1
            if (r4 == 0) goto La5
            int r0 = r4.intValue()
            if (r0 != 0) goto L87
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
        L1c:
            if (r5 == 0) goto L2c
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r5.LIZJ
            if (r0 == 0) goto L2c
            com.ss.android.ugc.aweme.feed.model.live.PlayTogetherBasicInfo r0 = r0.playTogetherInfo
            if (r0 == 0) goto L2c
            boolean r0 = r0.isOpenBulletinBoard
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "isOpen: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " \t liveMode: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GamePreviewBillboardWidget"
            X.C20441214yg.LIZIZ(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L5f
            com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget r1 = r6.LLJJI
            if (r1 == 0) goto L5e
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto L5e
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r0 = r6.subWidgetManager
            r0.unload(r1)
        L5e:
            return
        L5f:
            com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget r0 = r6.LLJJI
            if (r0 != 0) goto L79
            android.view.View r0 = r6.getView()
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget r2 = new com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget
            r2.<init>()
            r6.LLJJI = r2
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r1 = r6.subWidgetManager
            r0 = 2131373893(0x7f0a2f45, float:1.836789E38)
            r1.load(r0, r2, r3)
            return
        L79:
            boolean r0 = r0.isInitialized()
            if (r0 != r3) goto L5e
            com.ss.android.ugc.aweme.feed.adapter.widget.game.GamePreviewBillboardWidget r0 = r6.LLJJI
            if (r0 == 0) goto L5e
            r0.P1()
            return
        L87:
            int r0 = r4.intValue()
            if (r0 != r3) goto L90
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.THIRD_PARTY
            goto L1c
        L90:
            int r1 = r4.intValue()
            r0 = 4
            if (r1 != r0) goto L9a
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.SCREEN_RECORD
            goto L1c
        L9a:
            int r1 = r4.intValue()
            r0 = 6
            if (r1 != r0) goto La5
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.LIVE_STUDIO
            goto L1c
        La5:
            r4 = r2
            goto L1c
        La8:
            r4 = r2
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewControlPlayLayerWidget.B1():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        C1ACA c1acaZ1 = z1();
        C1A7N c1a7n = c1acaZ1 != null ? c1acaZ1.LJLILLLLZI : null;
        if ((c1a7n instanceof C1A7Q) || (c1a7n instanceof C1A7P) || (c1a7n instanceof C1A7O)) {
            View viewFindViewById = findViewById(R.id.i72);
            ViewGroup.LayoutParams layoutParams = viewFindViewById != null ? viewFindViewById.getLayoutParams() : null;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        C01GW c01gw = C305570ByN.LIZ;
        if (C305570ByN.LIZIZ(this.LLJI) && C305570ByN.LIZJ() == 2 && !this.LLJILLL.get()) {
            C486790J7d.LIZLLL(new Runnable() { // from class: X.1ABY
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LivePreviewControlPlayLayerWidget@befe.onViewHolderSelected$1");
                    try {
                        LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = this.LL;
                        C0C3F c0c3f = C0C3F.LIZ;
                        String str = livePreviewControlPlayLayerWidget.LLJI;
                        c0c3f.getClass();
                        livePreviewControlPlayLayerWidget.O1(C0C3F.LIZIZ(str), true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LivePreviewControlPlayLayerWidget@befe.onViewHolderSelected$1");
                }
            }, this, 1000L);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
    }

    public final void M1(final boolean z) {
        MutableLiveData<C1AAV> mutableLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJIJIL.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LLJL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.1ABW
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LivePreviewPausedWidget livePreviewPausedWidget;
                    View view;
                    C1AAV c1aav = (C1AAV) obj;
                    LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = this.LL;
                    LivePreviewPausedWidget livePreviewPausedWidget2 = livePreviewControlPlayLayerWidget.LLJJ;
                    if (livePreviewPausedWidget2 == null) {
                        if (c1aav.LIZIZ != 3 && (view = livePreviewControlPlayLayerWidget.getView()) != null) {
                            LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget2 = this.LL;
                            boolean z2 = z;
                            LivePreviewPausedWidget livePreviewPausedWidget3 = new LivePreviewPausedWidget(view);
                            livePreviewControlPlayLayerWidget2.LLJJ = livePreviewPausedWidget3;
                            livePreviewControlPlayLayerWidget2.subWidgetManager.load(R.id.rr4, livePreviewPausedWidget3, z2);
                            return;
                        }
                        return;
                    }
                    if (!livePreviewPausedWidget2.isInitialized() || (livePreviewPausedWidget = this.LL.LLJJ) == null) {
                        return;
                    }
                    livePreviewPausedWidget.N1();
                }
            });
        }
        View view = getView();
        if (view != null) {
            this.subWidgetManager.load(R.id.bos, new LiveSurveyWidgetV2((C0SUL) findViewById(R.id.long_press_layout), (FrameLayout) findViewById(R.id.i72), findViewById(R.id.i3m), view));
            this.subWidgetManager.load(R.id.mu7, new LivePreviewBillboardWidget(), z);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        enablePreviewSubWidgetManager();
        RecyclableWidgetManager.LoadInterceptor loadInterceptorA1 = LiveWatchPreviewWidget.A1(this.LLJ);
        if (loadInterceptorA1 != null) {
            this.subWidgetManager.setLoadInterceptor(loadInterceptorA1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        super.onLoad(objArr);
        View view = getView();
        if (view != null) {
            this.subWidgetManager.createWidget(findViewById(R.id.view_rootview), new CoverViewVideoAboveWidget(view));
        }
        if (LiveCardDegradeConfigStore.LIZ()) {
            this.subWidgetManager.load(new LivePreviewPerfDegradeWidget());
        }
        this.LLJJIJI = new LivePreviewPlayerWidget();
        this.subWidgetManager.createWidget(findViewById(R.id.i72), this.LLJJIJI);
        this.subWidgetManager.createWidget(findViewById(R.id.jmi), new LiveHighlightsVideoPlayerWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.long_press_layout), new LongPressWidget());
        if (LivePreviewPerfOptSetting.disableTopAndBottomMaskWidget()) {
            View viewFindViewById = findViewById(R.id.gradual_top);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = findViewById(R.id.gradual_bottom);
            if (viewFindViewById2 != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById2);
            }
        } else {
            this.subWidgetManager.createWidget(findViewById(R.id.gradual_bottom), new LivePreviewTopAndBottomMaskWidget(findViewById(R.id.gradual_top), findViewById(R.id.gradual_bottom)));
        }
        if (C1ECM.LIZJ) {
            this.subWidgetManager.createWidget(findViewById(R.id.view_rootview), new LivePreviewCounterWidget());
        }
        C01GW c01gw = C305570ByN.LIZ;
        if (C305570ByN.LIZ(this.LLJI)) {
            LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJILJIL.getValue();
            if (livePreviewPlayerVM != null && (mutableLiveData2 = livePreviewPlayerVM.LLILZ) != null) {
                mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 43));
            }
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJILJILJ.getValue();
            if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LL) != null) {
                mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 44));
            }
        } else {
            M1(true);
        }
        q0.LJIJ(findViewById(R.id.long_press_layout), new C20094213jo() { // from class: X.0s1b
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String str;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                A11yFeedToolComponent.LLLFFI.getClass();
                if (A11yFeedToolComponent.LLLII) {
                    HashMap<Integer, String> map = this.LIZ.LLJJIII;
                    String strLJI = map.get(2131851129);
                    if (strLJI == null) {
                        strLJI = C20642515q3.LJI(2131851129);
                        map.put(2131851129, strLJI);
                    }
                    str = strLJI;
                } else {
                    HashMap<Integer, String> map2 = this.LIZ.LLJJIII;
                    String strLJI2 = map2.get(2131843031);
                    if (strLJI2 == null) {
                        strLJI2 = C20642515q3.LJI(2131843031);
                        map2.put(2131843031, strLJI2);
                    }
                    str = strLJI2;
                }
                accessibilityNodeInfoCompat.setContentDescription(str);
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view2, int i, Bundle bundle) {
                if (i == 16) {
                    A11yFeedToolComponent.LLLFFI.getClass();
                    if (A11yFeedToolComponent.LLLII) {
                        C1440005kM.LIZ(new C7843034n());
                        C1ACA c1acaZ1 = this.LIZ.z1();
                        if (c1acaZ1 != null) {
                            c1acaZ1.LJJJLL = true;
                        }
                    }
                }
                return super.performAccessibilityAction(view2, i, bundle);
            }
        });
    }

    public LivePreviewControlPlayLayerWidget(View view, String str) {
        this.LLJ = view;
        this.LLJI = str;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2089);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS577S0100000_33, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ2, 2090), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ3, 2091), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILLL = new AtomicBoolean(false);
        this.LLJJIII = new HashMap<>();
    }

    public final void O1(final boolean z, boolean z2) {
        String str;
        if (this.isDestroyed || this.LLJILLL.get()) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        String str2 = null;
        if (c1acaZ1 != null) {
            str = c1acaZ1.LJ;
        } else {
            str = null;
        }
        if (!C487180J8q.LIZJ(str) && z2) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null) {
                str2 = c1acaZ12.LJ;
            }
            C487180J8q.LIZ(new Runnable() { // from class: X.1ABX
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LivePreviewControlPlayLayerWidget@befe.doPerformWidgetWhenPageIdle$1");
                    try {
                        LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = this.LL;
                        if (!livePreviewControlPlayLayerWidget.isDestroyed && ((!z || livePreviewControlPlayLayerWidget.LL) && livePreviewControlPlayLayerWidget.LLJILLL.compareAndSet(false, true))) {
                            this.LL.M1(false);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LivePreviewControlPlayLayerWidget@befe.doPerformWidgetWhenPageIdle$1");
                }
            }, str2);
            return;
        }
        if ((z && !this.LL) || !this.LLJILLL.compareAndSet(false, true)) {
            return;
        }
        M1(false);
    }
}
