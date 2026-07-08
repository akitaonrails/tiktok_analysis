package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C04U8;
import X.C07BA;
import X.C0C3F;
import X.C0IJT;
import X.C0PPH;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C13LE;
import X.C19719912Dl;
import X.C1AC4;
import X.C1ACA;
import X.C21153017qC;
import X.C2174971AAd;
import X.C2175311ABl;
import X.C2175361ABq;
import X.C2175371ABr;
import X.C2175771ADf;
import X.C305570ByN;
import X.C452501pT;
import X.C474500IjA;
import X.C486790J7d;
import X.C487180J8q;
import X.C500260Jjc;
import X.C998700c60;
import X.C999000c6U;
import X.C999280c6w;
import X.EnumC494740Jai;
import X.EnumC999300c6y;
import X.RunnableC212347188b;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS50S0110000_32;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationAudienceHideNativeBoard;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.setting.LiveDecorationAudienceHideNativeBoardSMB;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdAboveSponsorSlotLiveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LiveAiSummaryWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.aisummary.LivePreviewAiSummaryNewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.ec.ECLiveFeedBillboardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideButtonWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowGuideCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.GameRewardsPreviewCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.PreviewGameRewardsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessBoardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessingWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.game.moment.PreviewGameMomentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.localservice.LSLiveProductPreviewCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.WarningInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.pcsdecoration.PcsLivePreviewAudienceDecorationWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.PreviewRealTimeCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.serviceplus.PreviewServicePlusBottomInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.LivePreviewShareVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.AdDescLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.BcToggleInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.LivePreviewBottomTagContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.tag.SCMLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBarBlockWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LivePreviewFeedServicePlusInfoSetting;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.SMBInfo;
import com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewInteractionLayerWidget extends LiveWatchPreviewWidget {
    public final View LLJ;
    public final String LLJI;
    public SCMLabelWidget LLJIJIL;
    public ShowInfoWidget LLJILJIL;
    public PreviewGameMomentWidget LLJILJILJ;
    public PreviewGameGuessBoardWidget LLJILLL;
    public PreviewGameGuessingWidget LLJJ;
    public PreviewGameRewardsWidget LLJJI;
    public PreviewHotCommentWidget LLJJIII;
    public PcsLivePreviewAudienceDecorationWidget LLJJIJI;
    public LiveAiSummaryWidget LLJJIJIIJIL;
    public BcToggleInfoWidget LLJJIJIL;
    public AdDescLabelWidget LLJJJ;
    public LivePreviewBottomTagContainerWidget LLJJJIL;
    public AdAboveSponsorSlotLiveWidget LLJJJJ;
    public WarningInfoWidget LLJJJJJIL;
    public ShareWidget LLJJJJLIIL;
    public ReportWidget LLJJL;
    public TitleWidget LLJJLIIIJLLLLLLLZ;
    public LivePreviewAiSummaryNewWidget LLJL;
    public LivePreviewFollowGuideCardWidget LLJLIL;
    public LivePreviewFollowGuideButtonWidget LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public PreviewRealTimeCommentWidget LLJLLIL;
    public PreviewServicePlusBottomInfoWidget LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final AtomicBoolean LLLI;
    public final AtomicBoolean LLLII;
    public final AtomicBoolean LLLIIII;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLJJJIL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() {
        /*
            r3 = this;
            X.01GW r0 = X.C305570ByN.LIZ
            java.lang.String r0 = r3.LLJI
            boolean r0 = X.C305570ByN.LIZ(r0)
            if (r0 == 0) goto L51
            X.01GW r0 = r3.LLLFFI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM r0 = (com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM) r0
            if (r0 == 0) goto L22
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r2 = r0.LLILZ
            if (r2 == 0) goto L22
            Y.AObserverS235S0100000_33 r1 = new Y.AObserverS235S0100000_33
            r0 = 45
            r1.<init>(r3, r0)
            r2.observe(r3, r1)
        L22:
            X.01GW r0 = r3.LLLFZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM r0 = (com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM) r0
            if (r0 == 0) goto L3a
            androidx.lifecycle.MutableLiveData<kotlin.Unit> r2 = r0.LL
            if (r2 == 0) goto L3a
            Y.AObserverS235S0100000_33 r1 = new Y.AObserverS235S0100000_33
            r0 = 46
            r1.<init>(r3, r0)
            r2.observe(r3, r1)
        L3a:
            X.01GW r0 = X.C07BD.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L93
            boolean r0 = X.C14LC.LJIIIZ
            X.14LC r0 = X.C309690CBz.LIZ
            boolean r0 = r0.LJFF
            if (r0 != 0) goto L94
            goto L59
        L51:
            r0 = 1
            r3.X1(r0)
            r3.Y1(r0)
            goto L3a
        L59:
            android.content.Context r0 = r3.context     // Catch: java.lang.Throwable -> L6e
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> L6e
            r0 = 2131297891(0x7f090663, float:1.821374E38)
            int r0 = r1.getDimensionPixelSize(r0)     // Catch: java.lang.Throwable -> L6e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L6e
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6e
            goto L7a
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L7a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L81
            r1 = 0
        L81:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L94
            int r1 = r1.intValue()
        L89:
            r0 = 2131373039(0x7f0a2bef, float:1.8366158E38)
            android.view.View r0 = r3.findViewById(r0)
            X.C12ES.LJIJ(r0, r1)
        L93:
            return
        L94:
            r1 = 0
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget.B1():void");
    }

    public final void N1() {
        C0C3F c0c3f = C0C3F.LIZ;
        String str = this.LLJI;
        c0c3f.getClass();
        if (!C0C3F.LIZJ(str)) {
            C486790J7d.LIZLLL(new ARunnableS133S0100000_33(this, 47), this, 0L);
            return;
        }
        C21153017qC c21153017qC = C21153017qC.LIZ;
        C2175371ABr c2175371ABr = new C2175371ABr(this);
        c21153017qC.getClass();
        C21153017qC.LIZ(c2175371ABr);
    }

    public final void O1() {
        this.subWidgetManager.createWidget(findViewById(R.id.chm), new BottomTipsWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.m4c), new LabelContainerWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.video_bottom_bar_block), new VideoBottomBarBlockWidget());
    }

    public final LivePreviewShareVM Q1() {
        return (LivePreviewShareVM) this.LLL.getValue();
    }

    public final void b2() {
        C0C3F c0c3f = C0C3F.LIZ;
        String str = this.LLJI;
        c0c3f.getClass();
        if (!C0C3F.LIZJ(str)) {
            C486790J7d.LIZLLL(new RunnableC212347188b(this, C0C3F.LIZIZ(this.LLJI), true), this, 0L);
            return;
        }
        C21153017qC c21153017qC = C21153017qC.LIZ;
        C2175361ABq c2175361ABq = new C2175361ABq(this);
        c21153017qC.getClass();
        C21153017qC.LIZ(c2175361ABq);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        GoLiveGuideVM goLiveGuideVM = (GoLiveGuideVM) this.LLLF.getValue();
        if (goLiveGuideVM != null) {
            boolean z = goLiveGuideVM.LLJIJIL;
            String str = goLiveGuideVM.LLJI;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_button_server_check");
            c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_check");
            c474500IjALIZ.LJJII(str, "reason");
            c474500IjALIZ.LIZ();
            goLiveGuideVM.LLILZLL = -1L;
            goLiveGuideVM.LLIZ = false;
            goLiveGuideVM.LLJI = null;
            goLiveGuideVM.LLJIJIL = false;
        }
        LivePreviewBottomCardVM livePreviewBottomCardVM = (LivePreviewBottomCardVM) this.LLJLL.getValue();
        if (livePreviewBottomCardVM != null) {
            livePreviewBottomCardVM.LLILZ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r14) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget.LJJIJIIJIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
    }

    public final void M1(boolean z) {
        ShareWidget shareWidget;
        ShareWidget shareWidget2 = this.LLJJJJLIIL;
        if (shareWidget2 == null) {
            this.LLJJJJLIIL = (ShareWidget) this.subWidgetManager.load(R.id.rra, ShareWidget.class, z);
        } else if (shareWidget2.isInitialized() && (shareWidget = this.LLJJJJLIIL) != null) {
            shareWidget.M1();
        }
        ShareWidget shareWidget3 = this.LLJJJJLIIL;
        if (shareWidget3 != null) {
            shareWidget3.show();
        }
    }

    public final void P1(final boolean z) {
        C2175771ADf c2175771ADf;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<C1365860leC> mutableLiveData2;
        MutableLiveData<C1365850leB> mutableLiveData3;
        MutableLiveData<C1365870leD> mutableLiveData4;
        FeedLiveViewHolderVM feedLiveViewHolderVM;
        NextLiveData<Boolean> nextLiveData;
        this.subWidgetManager.createWidget(findViewById(R.id.f844zvb), new NameWidget());
        LiveInfoContainerWidget.LLJJJ.getClass();
        C999280c6w.LIZ(LiveInfoContainerWidget.LLJJJIL, new AwS577S0100000_33(this, 2092));
        this.subWidgetManager.createWidget(findViewById(R.id.i3m), new InteractionContainerWidget());
        if (!C07BA.LIZ() && (feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJZ.getValue()) != null && (nextLiveData = feedLiveViewHolderVM.LLJJL) != null) {
            nextLiveData.observe(this, new C2175311ABl(this, z), true);
        }
        LivePreviewShareVM livePreviewShareVMQ1 = Q1();
        if (livePreviewShareVMQ1 != null && (mutableLiveData4 = livePreviewShareVMQ1.LLILLJJLI) != null) {
            mutableLiveData4.observe(this, new Observer() { // from class: X.1ABs
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LivePreviewShareVM livePreviewShareVMQ12 = this.LL.Q1();
                    if (livePreviewShareVMQ12 != null) {
                        livePreviewShareVMQ12.LLILZIL = 1;
                    }
                    this.LL.M1(z);
                }
            });
        }
        LivePreviewShareVM livePreviewShareVMQ12 = Q1();
        if (livePreviewShareVMQ12 != null && (mutableLiveData3 = livePreviewShareVMQ12.LLILLL) != null) {
            mutableLiveData3.observe(this, new Observer() { // from class: X.1ABt
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LivePreviewShareVM livePreviewShareVMQ13 = this.LL.Q1();
                    if (livePreviewShareVMQ13 != null) {
                        livePreviewShareVMQ13.LLILZIL = 2;
                    }
                    this.LL.M1(z);
                }
            });
        }
        LivePreviewShareVM livePreviewShareVMQ13 = Q1();
        if (livePreviewShareVMQ13 != null && (mutableLiveData2 = livePreviewShareVMQ13.LLILZ) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.1ABu
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LivePreviewShareVM livePreviewShareVMQ14 = this.LL.Q1();
                    if (livePreviewShareVMQ14 != null) {
                        livePreviewShareVMQ14.LLILZIL = 3;
                    }
                    this.LL.M1(z);
                }
            });
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LLJZIJLIL.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData = maskLayerAndWarningVM.LLIZ) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.1ABo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    WarningInfoWidget warningInfoWidget;
                    if (((Boolean) obj).booleanValue()) {
                        LivePreviewInteractionLayerWidget livePreviewInteractionLayerWidget = this.LL;
                        WarningInfoWidget warningInfoWidget2 = livePreviewInteractionLayerWidget.LLJJJJJIL;
                        if (warningInfoWidget2 == null) {
                            livePreviewInteractionLayerWidget.LLJJJJJIL = (WarningInfoWidget) livePreviewInteractionLayerWidget.subWidgetManager.load(R.id.rsk, WarningInfoWidget.class, z);
                        } else if (warningInfoWidget2.isInitialized() && (warningInfoWidget = this.LL.LLJJJJJIL) != null) {
                            warningInfoWidget.M1();
                        }
                        WarningInfoWidget warningInfoWidget3 = this.LL.LLJJJJJIL;
                        if (warningInfoWidget3 != null) {
                            warningInfoWidget3.show();
                            return;
                        }
                        return;
                    }
                    WarningInfoWidget warningInfoWidget4 = this.LL.LLJJJJJIL;
                    if (warningInfoWidget4 == null) {
                        return;
                    }
                    warningInfoWidget4.hide();
                }
            });
        }
        this.subWidgetManager.createWidget(findViewById(R.id.no0), new LSLiveProductPreviewCardWidget());
        EnumC999300c6y enumC999300c6y = BaseEcLiveFeedCardWidget.LLJJ;
        C999280c6w.LIZ(BaseEcLiveFeedCardWidget.LLJJ, new AwS576S0100000_32(this, 186));
        this.subWidgetManager.createWidget(findViewById(R.id.mwr), new ECLiveFeedBillboardWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.myf), new GameRewardsPreviewCardWidget());
        EcLiveFeedPreviewCardWidget.LLJIJIL.getClass();
        C999280c6w.LIZ(EcLiveFeedPreviewCardWidget.LLJILJIL, new AwS576S0100000_32(this, 187));
        C1ACA c1aca = (C1ACA) this.LLLFF.getValue();
        if (c1aca != null && (c2175771ADf = c1aca.LJJJZ) != null) {
            c2175771ADf.LIZIZ = 1;
        }
    }

    public final void R1(boolean z) {
        Aweme aweme;
        AdAboveSponsorSlotLiveWidget adAboveSponsorSlotLiveWidget;
        if (((Boolean) C04U8.LIZ.getValue()).booleanValue() && this.LLJJJJ == null) {
            int i = AdAboveSponsorSlotLiveWidget.LLJILJIL;
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null && (aweme = c1acaZ1.LIZIZ) != null && C0PPH.LIZ(aweme, "tt_live_preview_above_sponsor")) {
                RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
                if (recyclableWidgetManager != null) {
                    adAboveSponsorSlotLiveWidget = (AdAboveSponsorSlotLiveWidget) recyclableWidgetManager.load(R.id.rop, AdAboveSponsorSlotLiveWidget.class, z);
                } else {
                    adAboveSponsorSlotLiveWidget = null;
                }
                this.LLJJJJ = adAboveSponsorSlotLiveWidget;
                if (adAboveSponsorSlotLiveWidget != null) {
                    adAboveSponsorSlotLiveWidget.show();
                }
            }
        }
    }

    public final void S1(boolean z) {
        AdDescLabelWidget adDescLabelWidget;
        if (this.LLJJJ == null && C998700c60.LIZ(z1())) {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                adDescLabelWidget = (AdDescLabelWidget) recyclableWidgetManager.load(R.id.roq, AdDescLabelWidget.class, z);
            } else {
                adDescLabelWidget = null;
            }
            this.LLJJJ = adDescLabelWidget;
            if (adDescLabelWidget != null) {
                adDescLabelWidget.show();
            }
        }
    }

    public final void T1(boolean z) {
        LivePreviewBottomTagContainerWidget livePreviewBottomTagContainerWidget;
        if (this.LLJJJIL != null) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (!C998700c60.LIZ(c1acaZ1) && !C999000c6U.LIZ(c1acaZ1)) {
            return;
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null) {
            livePreviewBottomTagContainerWidget = (LivePreviewBottomTagContainerWidget) recyclableWidgetManager.load(R.id.rp7, LivePreviewBottomTagContainerWidget.class, z);
        } else {
            livePreviewBottomTagContainerWidget = null;
        }
        this.LLJJJIL = livePreviewBottomTagContainerWidget;
        if (livePreviewBottomTagContainerWidget != null) {
            livePreviewBottomTagContainerWidget.show();
        }
    }

    public final void U1(boolean z) {
        PreviewHotCommentWidget previewHotCommentWidget;
        C1AC4 c1ac4 = PreviewHotCommentWidget.LLJJLIIIJLLLLLLLZ;
        C1ACA c1acaZ1 = z1();
        c1ac4.getClass();
        if (!C1AC4.LIZ(c1acaZ1)) {
            return;
        }
        PreviewHotCommentWidget previewHotCommentWidget2 = this.LLJJIII;
        if (previewHotCommentWidget2 != null && previewHotCommentWidget2.isInitialized()) {
            return;
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null) {
            previewHotCommentWidget = (PreviewHotCommentWidget) recyclableWidgetManager.load(R.id.jsd, PreviewHotCommentWidget.class, z);
        } else {
            previewHotCommentWidget = null;
        }
        this.LLJJIII = previewHotCommentWidget;
    }

    public final void V1(boolean z) {
        LiveRoomStruct liveRoomStruct;
        SMBLivePreview sMBLivePreview;
        List<SMBLivePreview.PreviewItem> list;
        PreviewServicePlusBottomInfoWidget previewServicePlusBottomInfoWidget;
        C1ACA c1acaZ1 = z1();
        if (LivePreviewFeedServicePlusInfoSetting.INSTANCE.enableBottomInfoStyle() && c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (sMBLivePreview = liveRoomStruct.smbLivePreview) != null && (list = sMBLivePreview.previewItem) != null && C500260Jjc.LJJIJIIJI(list)) {
            PreviewServicePlusBottomInfoWidget previewServicePlusBottomInfoWidget2 = this.LLJLLL;
            if (previewServicePlusBottomInfoWidget2 != null && previewServicePlusBottomInfoWidget2.isInitialized()) {
                return;
            }
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                previewServicePlusBottomInfoWidget = (PreviewServicePlusBottomInfoWidget) recyclableWidgetManager.load(R.id.n7e, PreviewServicePlusBottomInfoWidget.class, z);
            } else {
                previewServicePlusBottomInfoWidget = null;
            }
            this.LLJLLL = previewServicePlusBottomInfoWidget;
        }
    }

    public final void W1(boolean z) {
        boolean z2;
        PcsLivePreviewAudienceDecorationWidget pcsLivePreviewAudienceDecorationWidget;
        LiveRoomStruct liveRoomStruct;
        SMBInfo sMBInfo;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (sMBInfo = liveRoomStruct.smbInfo) != null && sMBInfo.optInStatus == 1 && sMBInfo.activeSkuCount > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (LiveDecorationAudienceHideNativeBoard.INSTANCE.getValue() && !z2) {
            return;
        }
        if (LiveDecorationAudienceHideNativeBoardSMB.INSTANCE.getValue() && z2) {
            return;
        }
        PcsLivePreviewAudienceDecorationWidget pcsLivePreviewAudienceDecorationWidget2 = this.LLJJIJI;
        if ((pcsLivePreviewAudienceDecorationWidget2 != null && pcsLivePreviewAudienceDecorationWidget2.isInitialized()) || getView() == null) {
            return;
        }
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null) {
            pcsLivePreviewAudienceDecorationWidget = (PcsLivePreviewAudienceDecorationWidget) recyclableWidgetManager.load(R.id.q6h, PcsLivePreviewAudienceDecorationWidget.class, z);
        } else {
            pcsLivePreviewAudienceDecorationWidget = null;
        }
        this.LLJJIJI = pcsLivePreviewAudienceDecorationWidget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061 A[PHI: r2
      0x0061: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v0 java.lang.String), (r2v3 java.lang.String), (r2v0 java.lang.String) binds: [B:28:0x004d, B:34:0x005d, B:35:0x005f, B:14:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X1(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.isDestroyed
            if (r0 == 0) goto L5
            return
        L5:
            com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget r0 = r5.LLJJLIIIJLLLLLLLZ
            if (r0 != 0) goto L7b
            X.1AAc r0 = com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget.LLJIJIL
            X.1ACA r4 = r5.z1()
            r0.getClass()
            r3 = 1
            if (r4 == 0) goto L7e
            boolean r0 = X.C1ABT.LJIILIIL(r4)
            if (r0 != r3) goto L7e
            r0 = 1
        L1c:
            r2 = 0
            if (r0 == 0) goto L4d
            if (r4 == 0) goto L61
            java.lang.String r1 = r4.LIZLLL
            java.lang.String r0 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == r3) goto L35
            java.lang.String r1 = r4.LIZLLL
            java.lang.String r0 = "homepage_follow"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != r3) goto L4f
        L35:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LIZIZ
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getNewLiveRoomDataExt(r0)
            if (r0 == 0) goto L7c
            com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary r0 = r0.topFrameSummary
            if (r0 == 0) goto L7c
            java.lang.String r0 = r0.getTitle()
        L47:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L67
        L4d:
            if (r4 == 0) goto L61
        L4f:
            boolean r0 = X.C1ABT.LJIIJ(r4)
            if (r0 != r3) goto L5b
            boolean r0 = X.C1ABT.LJIILIIL(r4)
            if (r0 != r3) goto L67
        L5b:
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r4.LIZJ
            if (r0 == 0) goto L61
            java.lang.String r2 = r0.title
        L61:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L7b
        L67:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r5.subWidgetManager
            r1 = 2131386273(0x7f0a5fa1, float:1.8393E38)
            java.lang.Class<com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget> r0 = com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r0 = r2.load(r1, r0, r6)
            com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget r0 = (com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget) r0
            r5.LLJJLIIIJLLLLLLLZ = r0
            if (r0 == 0) goto L7b
            r0.show()
        L7b:
            return
        L7c:
            r0 = r2
            goto L47
        L7e:
            r0 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget.X1(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0372 A[PHI: r2
      0x0372: PHI (r2v14 boolean) = (r2v13 boolean), (r2v17 boolean), (r2v17 boolean) binds: [B:241:0x036f, B:236:0x0367, B:238:0x036b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2 A[PHI: r9
      0x00c2: PHI (r9v6 java.lang.String) = (r9v1 java.lang.String), (r9v7 java.lang.String) binds: [B:58:0x00c0, B:56:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d0 A[PHI: r8 r9
      0x00d0: PHI (r8v3 int) = (r8v1 int), (r8v4 int) binds: [B:78:0x0134, B:65:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:78:0x0134, B:65:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0133 A[PHI: r9
      0x0133: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v6 java.lang.String), (r9v6 java.lang.String) binds: [B:58:0x00c0, B:60:0x00c4, B:62:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1(boolean r15) {
        /*
            Method dump skipped, instruction units count: 905
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget.Y1(boolean):void");
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
        C01GW c01gw = C305570ByN.LIZ;
        if (C305570ByN.LIZ(this.LLJI)) {
            LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLLFFI.getValue();
            if (livePreviewPlayerVM != null && (mutableLiveData2 = livePreviewPlayerVM.LLILZ) != null) {
                mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 47));
            }
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLLFZ.getValue();
            if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LL) != null) {
                mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 48));
                return;
            }
            return;
        }
        O1();
        P1(true);
    }

    public LivePreviewInteractionLayerWidget(View view, String str) {
        this.LLJ = view;
        this.LLJI = str;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewBottomCardVM.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 429);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS556S0100000_12, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ2, 430), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MaskLayerAndWarningVM.class);
        this.LLJZIJLIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ3, 431), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LivePreviewShareVM.class);
        this.LLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ4, 432), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(GoLiveGuideVM.class);
        this.LLLF = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ5, 433), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLLFF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 428));
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLLFFI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ6, 434), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLLFZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ7, enumC494740Jai, new AwS556S0100000_12(c19719912DlLIZ7, 435), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLLI = new AtomicBoolean(false);
        this.LLLII = new AtomicBoolean(false);
        this.LLLIIII = new AtomicBoolean(false);
    }

    public final void a2(boolean z, boolean z2) {
        String str;
        if (this.isDestroyed) {
            return;
        }
        if (this.LLLIIII.get()) {
            if (C2174971AAd.LIZIZ() && this.LLJJLIIIJLLLLLLLZ == null) {
                X1(false);
            }
            if (this.LLJJIII == null) {
                U1(false);
            }
            if (C07BA.LIZ()) {
                T1(this.async);
            } else {
                S1(false);
            }
            if (this.LLJLLL == null) {
                V1(false);
            }
            if (this.LLJJJJ == null) {
                R1(false);
            }
            if (this.LLJJIJI == null) {
                W1(false);
                return;
            }
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
            C487180J8q.LIZ(new ARunnableS50S0110000_32(this, z, 0), str2);
            return;
        }
        if ((z && !this.LL) || !this.LLLIIII.compareAndSet(false, true)) {
            return;
        }
        X1(false);
        Y1(false);
    }
}
