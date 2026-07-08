package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.AnonymousClass0956;
import X.C01GW;
import X.C07BB;
import X.C1088200eQM;
import X.C1091600eVq;
import X.C1106570etz;
import X.C1295960jpS;
import X.C13LE;
import X.C1602160rnK;
import X.C188Y;
import X.C188Z;
import X.C19719912Dl;
import X.C1A5L;
import X.C1AAF;
import X.C1ACA;
import X.C20441214yg;
import X.C21629019km;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C339190DRl;
import X.C488810JEx;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C998890c6J;
import X.EnumC1779530wPP;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import X.InterfaceC20673515v3;
import X.InterfaceC21566419ag;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS36S1100000_32;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveFeedShowIncentiveEnterFromMergeList;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BottomTipsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.Text;
import com.ss.android.ugc.aweme.feed.model.live.WatchReason;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class BottomTipsWidget extends LiveWatchPreviewWidget {
    public View LLJ;
    public C21629019km LLJI;
    public C1091600eVq LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    public BottomTipsWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        C188Y c188y = new C188Y(c19719912DlLIZ);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, c188y, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new C188Z(c19719912DlLIZ2), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ3, 176), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ4, 177), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LLJJIII = false;
        C20441214yg.LJIIIZ("BottomTipsWidget", "on holder resume");
        M1();
        R1(3, 3, false);
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = O1();
        if (livePreviewGuideEnterVMO1 != null) {
            livePreviewGuideEnterVMO1.EQ2();
        }
        this.LLJJI = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        new Object() { // from class: X.1AAJ
        };
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        C21629019km c21629019km;
        LinearLayout tvLiveHighlightContainer;
        int i;
        C20441214yg.LJIIIZ("BottomTipsWidget", "on feed play resume");
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || !c1acaZ1.LJII) {
            LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = O1();
            if (livePreviewGuideEnterVMO1 != null) {
                livePreviewGuideEnterVMO1.yQ2();
            }
            this.LLJJI = false;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null) {
                c1acaZ12.LJJJJZ = false;
            }
        } else {
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1 = P1();
            if ((livePreviewHighlightsPlayerVMP1 == null || !livePreviewHighlightsPlayerVMP1.xQ2()) && (c21629019km = this.LLJI) != null && (tvLiveHighlightContainer = c21629019km.getTvLiveHighlightContainer()) != null && tvLiveHighlightContainer.getVisibility() == 0) {
                C21629019km c21629019km2 = this.LLJI;
                if (c21629019km2 != null) {
                    c21629019km2.LJII();
                }
                C21629019km c21629019km3 = this.LLJI;
                if (c21629019km3 != null) {
                    c21629019km3.LJ();
                }
            }
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP12 = P1();
            if (livePreviewHighlightsPlayerVMP12 != null && livePreviewHighlightsPlayerVMP12.LLJILJILJ) {
                LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP13 = P1();
                if (livePreviewHighlightsPlayerVMP13 != null) {
                    livePreviewHighlightsPlayerVMP13.LLJILJILJ = false;
                }
                C21629019km c21629019km4 = this.LLJI;
                if (c21629019km4 != null) {
                    c21629019km4.LJII();
                }
                i = 2;
            } else {
                i = 7;
            }
            R1(i, 2, this.LLJJIII);
            LivePreviewGuideEnterVM livePreviewGuideEnterVMO12 = O1();
            if (livePreviewGuideEnterVMO12 != null) {
                livePreviewGuideEnterVMO12.yQ2();
            }
            this.LLJJI = false;
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null) {
                c1acaZ13.LJJJJZ = false;
            }
        }
        this.LLJJIII = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        C21629019km c21629019km;
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1;
        C21629019km c21629019km2 = this.LLJI;
        if (c21629019km2 != null && c21629019km2.LLJJL == 0 && (livePreviewGuideEnterVMO1 = O1()) != null) {
            livePreviewGuideEnterVMO1.CQ2("draw");
        }
        Q1();
        if (!this.LL && (c21629019km = this.LLJI) != null) {
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1 = P1();
            boolean z = true ^ (livePreviewHighlightsPlayerVMP1 != null && livePreviewHighlightsPlayerVMP1.xQ2());
            c21629019km.LJII();
            TuxTextView previewLiveSubTips = c21629019km.getPreviewLiveSubTips();
            if (previewLiveSubTips != null) {
                previewLiveSubTips.setText((CharSequence) null);
            }
            TuxTextView previewLiveSubTips2 = c21629019km.getPreviewLiveSubTips();
            if (previewLiveSubTips2 != null) {
                C339190DRl.LIZIZ(previewLiveSubTips2);
            }
            if (z) {
                c21629019km.LJ();
            }
        }
        this.LLJJI = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJZ = false;
        }
    }

    public final void M1() {
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ICoinIncentiveService iCoinIncentiveServiceLJIILIIL;
        LiveFeedShowIncentiveEnterFromMergeList.INSTANCE.getAllowList();
        C1091600eVq c1091600eVq = this.LLJIJIL;
        if (c1091600eVq != null) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (iCoinIncentiveServiceLJIILIIL = interfaceC20673515v3K4.LJIILIIL()) != null) {
                iCoinIncentiveServiceLJIILIIL.Qp1();
            }
            int visibility = c1091600eVq.getVisibility();
            c1091600eVq.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c1091600eVq);
            this.LLJIJIL = null;
        }
        C21629019km c21629019km = this.LLJI;
        if (c21629019km == null) {
            C2271391DvN.LIZ(c21629019km, (C1A5L) C2271381DvM.LJLLILLLL.getValue());
            C21629019km c21629019km2 = (C21629019km) findViewById(R.id.n8d);
            this.LLJI = c21629019km2;
            if (c21629019km2 != null) {
                c21629019km2.setAutoEnterListener(new InterfaceC21566419ag() { // from class: X.1AAL
                    @Override // X.InterfaceC21566419ag
                    public final void onCancel() {
                        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = this.LIZ.O1();
                        if (livePreviewGuideEnterVMO1 != null) {
                            livePreviewGuideEnterVMO1.CQ2("back");
                        }
                    }

                    @Override // X.InterfaceC21566419ag
                    public final void onSuccess() {
                        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = this.LIZ.O1();
                        if (livePreviewGuideEnterVMO1 != null) {
                            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(this.LIZ, 3850);
                            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(this.LIZ, 3851);
                            livePreviewGuideEnterVMO1.zQ2(C0C64.LJIILLIIL().LJIJJLI(31744, 5L, "live_preview_page_auto_entering_guide_duration", true) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), "enter_room");
                            if (livePreviewGuideEnterVMO1.vQ2(true)) {
                                awS577S0100000_332.invoke();
                            } else {
                                awS577S0100000_33.invoke();
                            }
                        }
                    }
                });
            }
            C21629019km c21629019km3 = this.LLJI;
            if (c21629019km3 != null) {
                int visibility2 = c21629019km3.getVisibility();
                c21629019km3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c21629019km3);
                C786410Ut5.LJLZ(0, c21629019km3.getLivingFromXml());
            }
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1 = P1();
            if (livePreviewHighlightsPlayerVMP1 == null || (mutableLiveData = livePreviewHighlightsPlayerVMP1.LLILLL) == null) {
                return;
            }
            mutableLiveData.observe(this, new AObserverS234S0100000_32(this, 33));
        }
    }

    public final FeedLiveViewHolderVM N1() {
        return (FeedLiveViewHolderVM) this.LLJILJILJ.getValue();
    }

    public final LivePreviewGuideEnterVM O1() {
        return (LivePreviewGuideEnterVM) this.LLJILLL.getValue();
    }

    public final LivePreviewHighlightsPlayerVM P1() {
        return (LivePreviewHighlightsPlayerVM) this.LLJJ.getValue();
    }

    public final void Q1() {
        AnimatorSet animatorSet;
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        NextLiveData<C998890c6J> nextLiveData;
        C998890c6J value;
        C21629019km c21629019km = this.LLJI;
        if (c21629019km != null) {
            FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
            boolean z = (feedLiveViewHolderVMN1 == null || (nextLiveData = feedLiveViewHolderVMN1.LLJJJJ) == null || (value = nextLiveData.getValue()) == null || !value.LIZ) ? false : true;
            c21629019km.LLJJ = false;
            LinearLayout realTimeLiveCTAContainer = c21629019km.getRealTimeLiveCTAContainer();
            if (realTimeLiveCTAContainer != null && realTimeLiveCTAContainer.getVisibility() == 0 && c21629019km.getLivingFromXml().getVisibility() == 0 && c21629019km.getLivingIconAnimationViewFromXml().getVisibility() == 0) {
                if (((Boolean) C07BB.LIZ.getValue()).booleanValue()) {
                    c21629019km.getLivingIconAnimationViewFromXml().LIZIZ();
                } else {
                    c21629019km.getLivingIconAnimationViewFromXml().LJ();
                }
            }
            C1106570etz.LIZ.getClass();
            if (C1106570etz.LIZ()) {
                c21629019km.LJFF();
                LinearLayout realTimeLiveCTAContainer2 = c21629019km.getRealTimeLiveCTAContainer();
                if (realTimeLiveCTAContainer2 != null && realTimeLiveCTAContainer2.getVisibility() == 0 && c21629019km.LLJLL && !z) {
                    c21629019km.LIZIZ();
                }
            }
            C1AAF subTitleHelper = c21629019km.getSubTitleHelper();
            AnonymousClass0956 anonymousClass0956 = subTitleHelper.LIZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            subTitleHelper.LIZ = null;
        }
        C1091600eVq c1091600eVq = this.LLJIJIL;
        if (c1091600eVq != null) {
            c1091600eVq.LL = false;
            View view = c1091600eVq.LLILZ;
            if (view != null && view.getVisibility() == 0 && (c1295960jpS = c1091600eVq.LLILLJJLI) != null && c1295960jpS.getVisibility() == 0 && (c1295960jpS2 = c1091600eVq.LLILLJJLI) != null) {
                c1295960jpS2.pauseAnimation();
            }
            View view2 = c1091600eVq.LLILZ;
            if (view2 == null || view2.getVisibility() != 0) {
                return;
            }
            AnimatorSet animatorSet2 = c1091600eVq.LLILZIL;
            if (!C500260Jjc.LJJJI(animatorSet2 != null ? Boolean.valueOf(animatorSet2.isRunning()) : null) || (animatorSet = c1091600eVq.LLILZIL) == null) {
                return;
            }
            animatorSet.cancel();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.dataChannel.zQ2(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        C21629019km c21629019km;
        LiveRoomStruct liveRoomStruct;
        AILivePreviewHighlight aILivePreviewHighlight;
        LiveRoomStruct liveRoomStruct2;
        WatchReason watchReason;
        C21629019km c21629019km2 = (C21629019km) findViewById(R.id.n8d);
        this.LLJI = c21629019km2;
        if (c21629019km2 != null) {
            c21629019km2.setPreviewContextData(z1());
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (c21629019km = this.LLJI) == null) {
            return;
        }
        c21629019km.LLJJI = TextUtils.equals(c1acaZ1.LIZLLL, "homepage_live");
        C1AAF subTitleHelper = c21629019km.getSubTitleHelper();
        C1ACA c1aca = c21629019km.LLJIJIL;
        subTitleHelper.getClass();
        String str = null;
        if (c1aca != null) {
            c1aca.LJZ = null;
            c1aca.LJZL = null;
        }
        subTitleHelper.LJ = null;
        subTitleHelper.LIZIZ = false;
        subTitleHelper.LIZJ = null;
        subTitleHelper.LIZLLL = EnumC1779530wPP.IDLE;
        if (c1aca != null && (liveRoomStruct2 = c1aca.LIZJ) != null && (watchReason = liveRoomStruct2.fypWatchReason) != null && watchReason.style == 2 && watchReason.isShow && !watchReason.isShowed) {
            Iterator<WatchReasonItem> it2 = watchReason.watchReasons.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                WatchReasonItem next = it2.next();
                Text text = next.content;
                String str2 = text != null ? text.key : null;
                LiveRoomStruct liveRoomStruct3 = c1aca.LIZJ;
                Long lValueOf = liveRoomStruct3 != null ? Long.valueOf(liveRoomStruct3.id) : null;
                C1088200eQM.LIZ.getClass();
                if (C1088200eQM.LIZLLL(lValueOf, str2, true)) {
                    C488810JEx c488810JEx = C488810JEx.LIZ;
                    Text text2 = next.content;
                    c488810JEx.getClass();
                    subTitleHelper.LIZJ = C488810JEx.LIZ(text2);
                    subTitleHelper.LIZIZ = true;
                    subTitleHelper.LJ = next;
                    break;
                }
            }
            c1aca.LJZL = "FREQUENCY_CONTROL";
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1 = P1();
        if (livePreviewHighlightsPlayerVMP1 == null || !livePreviewHighlightsPlayerVMP1.xQ2()) {
            c21629019km.LJ();
            return;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && (aILivePreviewHighlight = liveRoomStruct.aiLivePreviewHighlight) != null) {
            str = aILivePreviewHighlight.sourceType;
        }
        String strLJIJI = Intrinsics.LJFF(str, "gift") ? C497740JfY.LJIJI(2131855404) : Intrinsics.LJFF(str, "game") ? C497740JfY.LJIJI(2131855403) : C497740JfY.LJIJI(2131855405);
        C21629019km c21629019km3 = this.LLJI;
        if (c21629019km3 != null && c21629019km3.getTvLiveHighlightContainer() != null) {
            c21629019km.LIZLLL(strLJIJI);
            return;
        }
        View view = this.contentView;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS36S1100000_32(c21629019km, strLJIJI, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        M1();
        R1(2, 1, false);
        this.LLJJI = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJZ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1;
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO12;
        this.LLJJIII = true;
        if (i != 2 && (livePreviewGuideEnterVMO12 = O1()) != null) {
            livePreviewGuideEnterVMO12.EQ2();
        }
        C21629019km c21629019km = this.LLJI;
        if (c21629019km != null && c21629019km.LLJJL == 0 && !this.LLJJI && (livePreviewGuideEnterVMO1 = O1()) != null) {
            livePreviewGuideEnterVMO1.CQ2("draw");
        }
        Q1();
        this.LLJJI = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJJJJZ = false;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJ = findViewById(R.id.chm);
        M1();
        C2271391DvN.LIZ(this.LLJ, (C1A5L) C2271381DvM.LJJJJZI.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Boolean> nextLiveData;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        NextLiveData<Integer> nextLiveData2;
        MutableLiveData<Unit> mutableLiveData3;
        super.onLoad(objArr);
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJILJIL.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData3 = livePreviewPlayerVM.LLILZ) != null) {
            mutableLiveData3.observe(this, new Observer() { // from class: X.0eu4
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Float fValueOf;
                    C21629019km c21629019km = this.LL.LLJI;
                    if (c21629019km != null) {
                        C1106570etz.LIZ.getClass();
                        if (C1106570etz.LIZ()) {
                            List<View> fadeView = c21629019km.getFadeView();
                            if (!(fadeView instanceof Collection) || !fadeView.isEmpty()) {
                                for (View view : fadeView) {
                                    if (view != null) {
                                        fValueOf = Float.valueOf(view.getAlpha());
                                    } else {
                                        fValueOf = null;
                                    }
                                    if (!Intrinsics.LIZLLL(fValueOf, 0.0f)) {
                                        return;
                                    }
                                }
                            }
                            C1106570etz.LIZ.getClass();
                            if (C1106570etz.LIZJ().strategy == EnumC1106630eu5.FIRST_FRAME.getValue()) {
                                Map<EnumC1106640eu6, C09AE> map = c21629019km.LLJLLIL;
                                EnumC1106640eu6 enumC1106640eu6 = EnumC1106640eu6.FIRST_FRAME;
                                C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(enumC1106640eu6);
                                if (c09ae != null) {
                                    c09ae.LIZIZ(null);
                                }
                                Map<EnumC1106640eu6, C09AE> map2 = c21629019km.LLJLLIL;
                                C1DFH c1dfh = C0PEM.LIZ;
                                map2.put(enumC1106640eu6, C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1106600eu2(c21629019km, null), 3));
                            }
                        }
                    }
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMN1 = N1();
        if (feedLiveViewHolderVMN1 != null && (nextLiveData2 = feedLiveViewHolderVMN1.LLJJJJJIL) != null) {
            nextLiveData2.observe(this, new Observer() { // from class: X.1AAK
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Boolean boolValueOf;
                    C1ACA c1acaWQ2;
                    String uid;
                    String str;
                    FeedRoomTagList feedRoomTagList;
                    List<FeedRoomTag> list;
                    FeedRoomTag feedRoomTag;
                    User user;
                    BottomTipsWidget bottomTipsWidget = this.LL;
                    C21629019km c21629019km = bottomTipsWidget.LLJI;
                    if (c21629019km != null && c21629019km.LLJJL == 0) {
                        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = bottomTipsWidget.O1();
                        if (livePreviewGuideEnterVMO1 != null) {
                            livePreviewGuideEnterVMO1.GQ2();
                        }
                        LivePreviewGuideEnterVM livePreviewGuideEnterVMO12 = this.LL.O1();
                        if (livePreviewGuideEnterVMO12 != null) {
                            C1ACA c1acaWQ22 = livePreviewGuideEnterVMO12.wQ2();
                            Long lValueOf = null;
                            if (c1acaWQ22 != null) {
                                boolValueOf = Boolean.valueOf(TextUtils.equals(c1acaWQ22.LIZLLL, "homepage_live"));
                            } else {
                                boolValueOf = null;
                            }
                            if (!C500260Jjc.LJJIJIIJIL(boolValueOf) && (c1acaWQ2 = livePreviewGuideEnterVMO12.wQ2()) != null) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaWQ2.LIZLLL);
                                c2344009Gk.LJIIIIZZ("action_type", "click");
                                LiveRoomStruct liveRoomStruct = c1acaWQ2.LIZJ;
                                if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                                    uid = user.getUid();
                                } else {
                                    uid = null;
                                }
                                c2344009Gk.LJIIIIZZ("anchor_id", uid);
                                LiveRoomStruct liveRoomStruct2 = c1acaWQ2.LIZJ;
                                if (liveRoomStruct2 != null) {
                                    lValueOf = Long.valueOf(liveRoomStruct2.id);
                                }
                                c2344009Gk.LJ(lValueOf, "room_id");
                                c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                                C487710JAr c487710JAr = C487710JAr.LIZ;
                                LiveRoomStruct liveRoomStruct3 = c1acaWQ2.LIZJ;
                                c487710JAr.getClass();
                                c2344009Gk.LIZJ(C487710JAr.LIZ(liveRoomStruct3), "follow_status");
                                c2344009Gk.LIZJ(c1acaWQ2.LJIIIIZZ, "room_position");
                                LiveRoomStruct liveRoomStruct4 = c1acaWQ2.LIZJ;
                                if (liveRoomStruct4 == null || (feedRoomTagList = liveRoomStruct4.feedRoomTagList) == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str = feedRoomTag.content) == null) {
                                    str = "";
                                }
                                c2344009Gk.LJIIIIZZ("label", str);
                                C20684815ws.LJIILLIIL("livesdk_auto_guidance_page_success", c2344009Gk.LIZ);
                            }
                        }
                    }
                    this.LL.LLJJI = true;
                }
            });
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO1 = O1();
        if (livePreviewGuideEnterVMO1 != null && (mutableLiveData2 = livePreviewGuideEnterVMO1.LLILZ) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.1AAI
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    C21629019km c21629019km = this.LL.LLJI;
                    if (c21629019km != null) {
                        c21629019km.LJIILIIL();
                    }
                    C1ACA c1acaZ1 = this.LL.z1();
                    if (c1acaZ1 != null) {
                        c1acaZ1.LJJJJZ = true;
                    }
                }
            });
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVMO12 = O1();
        if (livePreviewGuideEnterVMO12 != null && (mutableLiveData = livePreviewGuideEnterVMO12.LLILLL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.1AAH
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    int height;
                    View view;
                    LivePreviewGuideEnterVM livePreviewGuideEnterVMO13 = this.LL.O1();
                    if (livePreviewGuideEnterVMO13 != null) {
                        C21629019km c21629019km = this.LL.LLJI;
                        Object parent = null;
                        if (c21629019km != null) {
                            parent = c21629019km.getParent();
                        }
                        if ((parent instanceof View) && (view = (View) parent) != null) {
                            height = view.getHeight();
                        } else {
                            height = 0;
                        }
                        livePreviewGuideEnterVMO13.LLIZ = height;
                    }
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMN12 = N1();
        if (feedLiveViewHolderVMN12 != null && (nextLiveData = feedLiveViewHolderVMN12.LLJJL) != null) {
            nextLiveData.observe(this, new Observer() { // from class: X.19ky
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        final BottomTipsWidget bottomTipsWidget = this.LL;
                        C21629019km c21629019km = bottomTipsWidget.LLJI;
                        if (c21629019km != null) {
                            C786410Ut5.T9(c21629019km, new View.OnClickListener() { // from class: X.0TkG
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    FeedLiveViewHolderVM feedLiveViewHolderVMN13;
                                    LivePreviewGuideEnterVM livePreviewGuideEnterVMO13;
                                    MutableLiveData<Boolean> mutableLiveData4;
                                    C1AAR.LIZ.getClass();
                                    if ((((PreviewGuideData) C1AAR.LIZJ.getValue()).enableCTA || (livePreviewGuideEnterVMO13 = bottomTipsWidget.O1()) == null || (mutableLiveData4 = livePreviewGuideEnterVMO13.LLILZIL) == null || !Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) && (feedLiveViewHolderVMN13 = bottomTipsWidget.N1()) != null) {
                                        feedLiveViewHolderVMN13.KQ2(true, bottomTipsWidget.context, "normal", false, false, false, 2, null, false, 0);
                                    }
                                }
                            });
                        }
                        C21629019km c21629019km2 = this.LL.LLJI;
                        if (c21629019km2 != null) {
                            C1106570etz.LIZ.getClass();
                            if (C1106570etz.LIZ() && !c21629019km2.LLJLL) {
                                c21629019km2.LLJLL = true;
                                c21629019km2.LJFF();
                                c21629019km2.LJIIJ();
                                c21629019km2.LJI();
                            }
                            int visibility = c21629019km2.getVisibility();
                            c21629019km2.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c21629019km2);
                            c21629019km2.LJIIIIZZ(false);
                            c21629019km2.LJIILLIIL();
                        }
                        C1091600eVq c1091600eVq = this.LL.LLJIJIL;
                        if (c1091600eVq != null) {
                            int visibility2 = c1091600eVq.getVisibility();
                            c1091600eVq.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, c1091600eVq);
                            c1091600eVq.LIZ(false);
                            return;
                        }
                        return;
                    }
                    BottomTipsWidget bottomTipsWidget2 = this.LL;
                    C21629019km c21629019km3 = bottomTipsWidget2.LLJI;
                    if (c21629019km3 != null) {
                        C786410Ut5.T9(c21629019km3, new ACListenerS147S0100000_12(bottomTipsWidget2, 302));
                    }
                    C21629019km c21629019km4 = this.LL.LLJI;
                    if (c21629019km4 != null) {
                        C1106570etz.LIZ.getClass();
                        if (C1106570etz.LIZ() && c21629019km4.LLJLL) {
                            c21629019km4.LLJLL = false;
                            c21629019km4.LJFF();
                            c21629019km4.LJIIJ();
                            c21629019km4.LJI();
                        }
                        int visibility3 = c21629019km4.getVisibility();
                        c21629019km4.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility3, 0, c21629019km4);
                        c21629019km4.LJIIIIZZ(true);
                    }
                    C1091600eVq c1091600eVq2 = this.LL.LLJIJIL;
                    if (c1091600eVq2 == null) {
                        return;
                    }
                    int visibility4 = c1091600eVq2.getVisibility();
                    c1091600eVq2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility4, 0, c1091600eVq2);
                    c1091600eVq2.LIZ(true);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R1(int r10, int r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.BottomTipsWidget.R1(int, int, boolean):void");
    }
}
