package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0A54;
import X.C13LE;
import X.C13LN;
import X.C13LP;
import X.C14KQ;
import X.C14LC;
import X.C19719912Dl;
import X.C1ACA;
import X.C20441214yg;
import X.C21282318Qj;
import X.C275290Aqd;
import X.C293750BfJ;
import X.C309690CBz;
import X.C452501pT;
import X.C473250Ih9;
import X.C497740JfY;
import X.C497820Jfg;
import X.C500260Jjc;
import X.C521890KdP;
import X.C755900Tky;
import X.C786410Ut5;
import X.EnumC494740Jai;
import X.EnumC755930Tl1;
import Y.AObserverS234S0100000_32;
import Y.ARunnableS12S0202000_32;
import Y.ARunnableS40S0300000_7;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.performance.LiveRoomBackGroundImageOptSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LivePreviewBgConfig;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.CoverViewVideoAboveWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveImageModel;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class CoverViewVideoAboveWidget extends LiveWatchPreviewWidget {
    public static Drawable LLJJIJIL;
    public final View LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 178));
    public RemoteImageView LLJIJIL;
    public RemoteImageView LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLJILJILJ = false;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            c1acaZ1.LJLLLLLL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void M1() {
        LiveRoomStruct liveRoomStruct;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1;
        RemoteImageView remoteImageView;
        MutableLiveData<C473250Ih9> mutableLiveData;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP12;
        RemoteImageView remoteImageView2;
        MutableLiveData<C473250Ih9> mutableLiveData2;
        String str;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP13;
        View viewO1;
        MutableLiveData<C473250Ih9> mutableLiveData3;
        LiveRoomStruct liveRoomStruct2;
        LiveImageModel liveImageModel;
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP14;
        RemoteImageView remoteImageView3;
        MutableLiveData<Boolean> mutableLiveData4;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP15 = P1();
        if (livePreviewHighlightsPlayerVMP15 != null && livePreviewHighlightsPlayerVMP15.xQ2()) {
            RemoteImageView remoteImageView4 = this.LLJIJIL;
            if (remoteImageView4 != null) {
                C500260Jjc.LJIILIIL(remoteImageView4);
            }
            C500260Jjc.LJIILIIL(O1());
        }
        C755900Tky c755900Tky = C755900Tky.LL;
        EnumC755930Tl1 enumC755930Tl1 = EnumC755930Tl1.LIVE_PREVIEW_COVER;
        c755900Tky.getClass();
        this.LLJILJILJ = C755900Tky.LIZ(enumC755930Tl1, true);
        boolean zR1 = R1();
        C01GW c01gw = C275290Aqd.LIZ;
        String strLL = null;
        if (!((Boolean) c01gw.getValue()).booleanValue() || (((Boolean) c01gw.getValue()).booleanValue() && this.LLJILJILJ)) {
            if ((((Number) C293750BfJ.LIZ.getValue()).intValue() & 2) == 2) {
                View viewO12 = O1();
                if (viewO12 == null || viewO12.getBackground() == null) {
                    if (LLJJIJIL == null) {
                        LLJJIJIL = C497740JfY.LJIIJ(R.drawable.ckh);
                    }
                    View viewO13 = O1();
                    if (viewO13 != null) {
                        viewO13.setBackground(LLJJIJIL);
                    }
                }
            } else {
                View viewO14 = O1();
                if (viewO14 != null) {
                    viewO14.setBackground(C497740JfY.LJIIJ(R.drawable.ckh));
                }
            }
        }
        if (zR1) {
            RemoteImageView remoteImageView5 = this.LLJIJIL;
            if (remoteImageView5 != null) {
                C786410Ut5.l(remoteImageView5, 8);
            }
            View viewO15 = O1();
            if (viewO15 != null) {
                C786410Ut5.LJLLLLLL(8, viewO15);
            }
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 == null || (liveRoomStruct2 = c1acaZ1.LIZJ) == null || (liveImageModel = liveRoomStruct2.background) == null) {
                RemoteImageView remoteImageView6 = this.LLJILJIL;
                if (remoteImageView6 != null) {
                    C786410Ut5.l(remoteImageView6, 8);
                }
            } else {
                int iLJIIIIZZ = C14KQ.LJIIIIZZ(this.context);
                int iLJ = C14KQ.LJ(this.context);
                RemoteImageView remoteImageView7 = this.LLJILJIL;
                if (remoteImageView7 != null) {
                    HandlerHook.viewPost(remoteImageView7, new ARunnableS12S0202000_32(iLJIIIIZZ, iLJ, liveImageModel, this, 0));
                }
                C1ACA c1acaZ12 = z1();
                if ((c1acaZ12 == null || !c1acaZ12.LJIIZILJ) && (((livePreviewPlayerVMQ1 = Q1()) == null || (mutableLiveData4 = livePreviewPlayerVMQ1.LLJIJIL) == null || !Intrinsics.LJFF(mutableLiveData4.getValue(), Boolean.TRUE)) && (((livePreviewHighlightsPlayerVMP14 = P1()) == null || !livePreviewHighlightsPlayerVMP14.xQ2()) && (remoteImageView3 = this.LLJILJIL) != null))) {
                    C786410Ut5.l(remoteImageView3, 0);
                }
            }
            C20441214yg.LIZIZ("CoverView", "bindBackground");
            return;
        }
        RemoteImageView remoteImageView8 = this.LLJILJIL;
        if (remoteImageView8 != null) {
            C786410Ut5.l(remoteImageView8, 8);
        }
        if (this.LLJILJILJ) {
            LivePreviewPlayerVM livePreviewPlayerVMQ12 = Q1();
            if ((livePreviewPlayerVMQ12 == null || (mutableLiveData3 = livePreviewPlayerVMQ12.LLILLJJLI) == null || mutableLiveData3.getValue() == null) && (((livePreviewHighlightsPlayerVMP13 = P1()) == null || !livePreviewHighlightsPlayerVMP13.xQ2()) && (viewO1 = O1()) != null)) {
                C786410Ut5.LJLLLLLL(0, viewO1);
            }
            C20441214yg.LIZIZ("CoverView", "bindDegradedCover");
            return;
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null) {
            final UrlModel avatarThumb = liveRoomStruct.roomCover;
            if (avatarThumb == null) {
                User user = liveRoomStruct.owner;
                avatarThumb = user != null ? user.getAvatarThumb() : null;
            }
            final int iLJIIIIZZ2 = C14KQ.LJIIIIZZ(this.context);
            final int iLJ2 = C14KQ.LJ(this.context);
            UrlModel urlModel = liveRoomStruct.blurredCover;
            final C521890KdP c521890KdP = new C521890KdP(this, 4);
            if (urlModel != null && !LiveRoomBackGroundImageOptSetting.INSTANCE.clientDrawBlur()) {
                RemoteImageView remoteImageView9 = this.LLJIJIL;
                if (remoteImageView9 != null) {
                    HandlerHook.viewPost(remoteImageView9, new ARunnableS40S0300000_7(urlModel, c521890KdP, this, 8));
                }
                try {
                    C1ACA c1acaZ14 = z1();
                    if (c1acaZ14 != null) {
                        List<String> urlList = urlModel.getUrlList();
                        if (urlList != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
                            strLL = C13LN.LL(10, str);
                        }
                        c1acaZ14.LJLLLLLL = strLL;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJFF("CoverView", "bindAboveCover", e);
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ13 = Q1();
                if ((livePreviewPlayerVMQ13 == null || (mutableLiveData2 = livePreviewPlayerVMQ13.LLILLJJLI) == null || mutableLiveData2.getValue() == null) && (((livePreviewHighlightsPlayerVMP12 = P1()) == null || !livePreviewHighlightsPlayerVMP12.xQ2()) && (remoteImageView2 = this.LLJIJIL) != null)) {
                    C786410Ut5.l(remoteImageView2, 0);
                }
            } else if (avatarThumb != null) {
                RemoteImageView remoteImageView10 = this.LLJIJIL;
                if (remoteImageView10 != null) {
                    HandlerHook.viewPost(remoteImageView10, new Runnable() { // from class: X.0IU5
                        public final void LIZ() {
                            LiveRoomBackGroundImageOptSetting liveRoomBackGroundImageOptSetting = LiveRoomBackGroundImageOptSetting.INSTANCE;
                            float f = liveRoomBackGroundImageOptSetting.getConfig().blurRadius;
                            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                            CoverViewVideoAboveWidget coverViewVideoAboveWidget = this;
                            UrlModel urlModel2 = avatarThumb;
                            C521890KdP c521890KdP2 = c521890KdP;
                            c0jbnLIZ.LJIL((iLJIIIIZZ2 * 1.0f) / iLJ2, f, coverViewVideoAboveWidget.LLJIJIL);
                            c0jbnLIZ.LIZJ(urlModel2.getUrlList());
                            c0jbnLIZ.LIZLLL(c521890KdP2);
                            if (liveRoomBackGroundImageOptSetting.getConfig().use8888) {
                                c0jbnLIZ.LJFF(Boolean.FALSE);
                            }
                            c0jbnLIZ.LJJI(coverViewVideoAboveWidget.LLJIJIL);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("CoverViewVideoAboveWidget@1ea7.bindAboveCover$1$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("CoverViewVideoAboveWidget@1ea7.bindAboveCover$1$2");
                        }
                    });
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ14 = Q1();
                if ((livePreviewPlayerVMQ14 == null || (mutableLiveData = livePreviewPlayerVMQ14.LLILLJJLI) == null || mutableLiveData.getValue() == null) && (((livePreviewHighlightsPlayerVMP1 = P1()) == null || !livePreviewHighlightsPlayerVMP1.xQ2()) && (remoteImageView = this.LLJIJIL) != null)) {
                    C786410Ut5.l(remoteImageView, 0);
                }
            } else {
                RemoteImageView remoteImageView11 = this.LLJIJIL;
                if (remoteImageView11 != null) {
                    C786410Ut5.l(remoteImageView11, 8);
                }
            }
        }
        C20441214yg.LIZIZ("CoverView", "bindAboveCover");
    }

    public final void N1() {
        RemoteImageView remoteImageView = this.LLJIJIL;
        if (remoteImageView != null && this.LLJILLL) {
            remoteImageView.animate().cancel();
            C786410Ut5.l(remoteImageView, 8);
            C786410Ut5.I5(remoteImageView, 1.0f);
            this.LLJILLL = false;
        }
    }

    public final View O1() {
        return (View) this.LLJI.getValue();
    }

    public final LivePreviewHighlightsPlayerVM P1() {
        return (LivePreviewHighlightsPlayerVM) this.LLJJIJI.getValue();
    }

    public final LivePreviewPlayerVM Q1() {
        return (LivePreviewPlayerVM) this.LLJJI.getValue();
    }

    public final boolean R1() {
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        return (!((Boolean) C0A54.LIZ.getValue()).booleanValue() || (c1acaZ1 = z1()) == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || liveRoomStruct.background == null) ? false : true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        this.dataChannel.zQ2(this);
        View viewO1 = O1();
        if (viewO1 != null) {
            C786410Ut5.T4(viewO1, 1.0f);
        }
        RemoteImageView remoteImageView = this.LLJIJIL;
        if (remoteImageView != null && (viewPropertyAnimatorAnimate = remoteImageView.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        RemoteImageView remoteImageView2 = this.LLJIJIL;
        if (remoteImageView2 != null) {
            C786410Ut5.I5(remoteImageView2, 1.0f);
        }
        this.LLJILLL = false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        if (this.LLJILLL) {
            N1();
            return;
        }
        if (R1()) {
            return;
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMP1 = P1();
        if (livePreviewHighlightsPlayerVMP1 == null || !livePreviewHighlightsPlayerVMP1.xQ2()) {
            C755900Tky c755900Tky = C755900Tky.LL;
            EnumC755930Tl1 enumC755930Tl1 = EnumC755930Tl1.LIVE_PREVIEW_COVER;
            c755900Tky.getClass();
            boolean zLIZ = C755900Tky.LIZ(enumC755930Tl1, true);
            this.LLJILJILJ = zLIZ;
            if (zLIZ) {
                View viewO1 = O1();
                if (viewO1 != null) {
                    C786410Ut5.LJLLLLLL(0, viewO1);
                    return;
                }
                return;
            }
            RemoteImageView remoteImageView = this.LLJIJIL;
            if (remoteImageView != null) {
                remoteImageView.animate().cancel();
                C786410Ut5.I5(remoteImageView, 1.0f);
                C500260Jjc.LLFFF(remoteImageView);
                this.LLJILLL = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        M1();
    }

    public CoverViewVideoAboveWidget(View view) {
        this.LLJ = view;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(c19719912DlLIZ, 180);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS576S0100000_32, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ2, 181), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PreviewSurveyViewModel.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ3, 182), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS576S0100000_32(c19719912DlLIZ4, 183), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 179));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        if (this.LLJILLL) {
            N1();
        }
    }

    public final void S1(int i) {
        RemoteImageView remoteImageView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        RemoteImageView remoteImageView2 = this.LLJILJIL;
        ViewGroup.LayoutParams layoutParams = null;
        if (remoteImageView2 != null) {
            layoutParams = remoteImageView2.getLayoutParams();
        }
        if ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.topMargin != i) && (remoteImageView = this.LLJILJIL) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) remoteImageView.getLayoutParams();
            marginLayoutParams2.topMargin = i;
            C786410Ut5.f7(remoteImageView, marginLayoutParams2);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LLJILJIL = (RemoteImageView) this.contentView.findViewById(R.id.bnu);
        this.LLJIJIL = (RemoteImageView) this.contentView.findViewById(R.id.tn7);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        RemoteImageView remoteImageView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        NextLiveData<Float> nextLiveData;
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        MutableLiveData<Boolean> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Unit> mutableLiveData4;
        MutableLiveData<Unit> mutableLiveData5;
        NextLiveData<Boolean> nextLiveData2;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData2 = feedLiveViewHolderVM.LLJJJIL) != null) {
            nextLiveData2.observe(this, new AObserverS234S0100000_32(this, 15));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ12 = Q1();
        if (livePreviewPlayerVMQ12 != null && (mutableLiveData5 = livePreviewPlayerVMQ12.LLILZ) != null) {
            mutableLiveData5.observe(this, new AObserverS234S0100000_32(this, 16));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ13 = Q1();
        if (livePreviewPlayerVMQ13 != null && (mutableLiveData4 = livePreviewPlayerVMQ13.LLJILJILJ) != null) {
            mutableLiveData4.observe(this, new AObserverS234S0100000_32(this, 17));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ14 = Q1();
        if (livePreviewPlayerVMQ14 != null && (mutableLiveData3 = livePreviewPlayerVMQ14.LLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS234S0100000_32(this, 18));
        }
        if (R1() && (livePreviewPlayerVMQ1 = Q1()) != null && (mutableLiveData2 = livePreviewPlayerVMQ1.LLJIJIL) != null) {
            mutableLiveData2.observe(this, new AObserverS234S0100000_32(this, 19));
        }
        PreviewSurveyViewModel previewSurveyViewModel = (PreviewSurveyViewModel) this.LLJJIII.getValue();
        if (previewSurveyViewModel != null && (nextLiveData = previewSurveyViewModel.LLL) != null) {
            nextLiveData.observe(this, new AwS611S0100000_32(this, 71), false);
        }
        if (((LivePreviewBgConfig) C21282318Qj.LIZIZ.getValue()).enableMarginBar) {
            boolean z = C14LC.LJIIIZ;
            C309690CBz.LIZ.getClass();
            int iLIZJ = C497820Jfg.LIZJ(this.context);
            if (iLIZJ > 0) {
                RemoteImageView remoteImageView2 = this.LLJIJIL;
                ViewGroup.LayoutParams layoutParams = null;
                if (remoteImageView2 != null) {
                    layoutParams = remoteImageView2.getLayoutParams();
                }
                if ((!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || marginLayoutParams.topMargin != iLIZJ) && (remoteImageView = this.LLJIJIL) != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) remoteImageView.getLayoutParams();
                    marginLayoutParams2.topMargin = iLIZJ;
                    C786410Ut5.f7(remoteImageView, marginLayoutParams2);
                }
            }
        }
        S1(0);
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LLJJ.getValue();
        if (feedLiveViewHolderVM2 != null && (mutableLiveData = feedLiveViewHolderVM2.LLLILZLLLI) != null) {
            mutableLiveData.observe(this, new AObserverS234S0100000_32(this, 20));
        }
    }
}
