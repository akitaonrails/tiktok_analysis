package com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight;

import X.C01GW;
import X.C0BTA;
import X.C0C64;
import X.C0COV;
import X.C0RG7;
import X.C12ES;
import X.C1324720kZq;
import X.C1389340mG4;
import X.C1389350mG5;
import X.C13LE;
import X.C1479570obb;
import X.C1482560ogQ;
import X.C1484040oio;
import X.C14LC;
import X.C1819620xS4;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C1ACA;
import X.C2175081AAo;
import X.C2175091AAp;
import X.C2175101AAq;
import X.C2175111AAr;
import X.C2175121AAs;
import X.C2188811AlT;
import X.C275270Aqb;
import X.C285890BIl;
import X.C309690CBz;
import X.C339190DRl;
import X.C425050Glb;
import X.C452501pT;
import X.C468930IaB;
import X.C473410IhP;
import X.C497820Jfg;
import X.C533990Kwv;
import X.C755980Tl6;
import X.C786410Ut5;
import X.EnumC2175031AAj;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import X.InterfaceC1484830ok5;
import X.InterfaceC582670MtF;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS128S0100000_28;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimizeFeedSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeAudience;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ab.LiveHighlightPlayerOptConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlightVideoInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LiveHighlightsVideoPlayerWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJJIII = 0;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public C2175091AAp LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public ARunnableS128S0100000_28 LLJJ;
    public final C01GW LLJJI;

    public LiveHighlightsVideoPlayerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c19719912DlLIZ, 211);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS572S0100000_28, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS572S0100000_28(c19719912DlLIZ2, 212), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2134));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2136));
        this.LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2135));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 210));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        R1("onUnbind", true);
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
        R1("onUnload", true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1AAp] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        LiveRoomStruct liveRoomStruct;
        AILivePreviewHighlight aILivePreviewHighlight;
        AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo;
        LiveRoomStruct liveRoomStruct2;
        C533990Kwv c533990Kwv;
        View view = this.contentView;
        if (view != null) {
            C339190DRl.LIZIZ(view);
        }
        if (M1()) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (aILivePreviewHighlight = liveRoomStruct.aiLivePreviewHighlight) != null && (aILivePreviewHighlightVideoInfo = aILivePreviewHighlight.videoInfo) != null) {
            int i = (int) aILivePreviewHighlightVideoInfo.width;
            int i2 = (int) aILivePreviewHighlightVideoInfo.height;
            Object value = this.LLJILJIL.getValue();
            int iLIZJ = 0;
            if (this.contentView.getLayoutParams() != null && value != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.contentView.getLayoutParams();
                C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(this.context, null);
                C0RG7 c0rg7LJIIJ = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ();
                if (c0rg7LJIIJ != null && c0rg7LJIIJ.LIZLLL()) {
                    View view2 = (View) ((View) this.LLJILJIL.getValue()).getParent();
                    int width = view2.getWidth();
                    if (width == 0) {
                        width = c1389350mG5LIZJ.LIZIZ;
                    }
                    int height = view2.getHeight();
                    if (height == 0) {
                        height = c1389350mG5LIZJ.LIZJ;
                    }
                    if (LinkMicRtcRatioOptimize.INSTANCE.getValueFromSEI() <= 0 || !LinkmicRtcRatioOptimizeAudience.isEnable()) {
                        c533990Kwv = new C533990Kwv(i, i2, width, height);
                    } else {
                        double d = LinkMicRtcRatioOptimizeFeedSettings.getValue().feedContainerResizeRatio;
                        double d2 = i;
                        c533990Kwv = d2 / ((double) i2) > d ? new C533990Kwv(i, (int) (d2 / d), width, height) : new C533990Kwv(i, i2, width, height);
                    }
                    C533990Kwv c533990KwvLIZIZ = c0rg7LJIIJ.LIZIZ(c533990Kwv);
                    layoutParams.height = c533990KwvLIZIZ.LIZLLL;
                    layoutParams.width = c533990KwvLIZIZ.LIZJ;
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = 17;
                } else if (i > i2) {
                    if (C0COV.LIZIZ) {
                        boolean z = C14LC.LJIIIZ;
                        C309690CBz.LIZ.getClass();
                        iLIZJ = C497820Jfg.LIZJ(this.context);
                    }
                    layoutParams.topMargin = ((int) (((Boolean) C285890BIl.LIZ.getValue()).booleanValue() ? C12ES.LIZJ(130.0f, this.context) : C12ES.LIZJ(96.0f, this.context))) + iLIZJ;
                    int i3 = c1389350mG5LIZJ.LIZIZ;
                    layoutParams.width = i3;
                    layoutParams.height = (int) (i2 * (i3 / i));
                    layoutParams.gravity = 49;
                } else if (c1389350mG5LIZJ.LJFF) {
                    int i4 = c1389350mG5LIZJ.LIZJ;
                    layoutParams.height = i4;
                    layoutParams.width = (int) (i4 * (i / i2));
                    layoutParams.topMargin = 0;
                    layoutParams.gravity = 17;
                } else {
                    Pair pairLIZ = C425050Glb.LIZ(i, i2, c1389350mG5LIZJ.LIZIZ, c1389350mG5LIZJ.LIZJ);
                    layoutParams.width = ((Number) pairLIZ.getFirst()).intValue();
                    layoutParams.height = ((Number) pairLIZ.getSecond()).intValue();
                    layoutParams.gravity = 17;
                    layoutParams.topMargin = 0;
                }
                if (C0COV.LIZIZ) {
                    boolean z2 = C14LC.LJIIIZ;
                    C309690CBz.LIZ.getClass();
                    layoutParams.topMargin += C497820Jfg.LIZJ(this.context);
                    FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJI.getValue();
                    if (feedLiveViewHolderVM != null) {
                        feedLiveViewHolderVM.LLLIIIIL = true;
                    }
                }
                C786410Ut5.W5(this.contentView, layoutParams);
                int i5 = layoutParams.topMargin;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("adjustLiveContainerSize:width:{");
                sbLIZ.append(i);
                sbLIZ.append("},height{");
                sbLIZ.append(i2);
                sbLIZ.append("},topMargin{");
                sbLIZ.append(i5);
                sbLIZ.append('}');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C1ACA c1acaZ12 = z1();
                C468930IaB.LIZ((c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct2.id), "ttlive_preview_Highlight_Widget", strLIZIZ);
            }
        }
        this.LLJIJIL = new InterfaceC582670MtF() { // from class: X.1AAp
            @Override // X.InterfaceC582670MtF
            public final void LIZ(String str) {
                LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = this.LIZ.O1();
                if (livePreviewHighlightsPlayerVMO1 != null && livePreviewHighlightsPlayerVMO1.LLJ) {
                    livePreviewHighlightsPlayerVMO1.LLJ = false;
                    C2175101AAq c2175101AAqWQ2 = livePreviewHighlightsPlayerVMO1.wQ2();
                    InterfaceC1484830ok5 interfaceC1484830ok5 = c2175101AAqWQ2.LIZJ;
                    if (interfaceC1484830ok5 != null) {
                        interfaceC1484830ok5.pause();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("pause playerTag:");
                    sbLIZ2.append(c2175101AAqWQ2.LIZ);
                    C468930IaB.LIZ(c2175101AAqWQ2.LIZLLL, "ttlive_preview_Highlight_Player", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        };
        if (((LiveHighlightPlayerOptConfig) C2175111AAr.LIZIZ.getValue()).preRenderOpt) {
            Q1();
            return;
        }
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(this, 29);
        this.LLJJ = aRunnableS128S0100000_28;
        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS128S0100000_28);
    }

    public final C1324720kZq N1() {
        return (C1324720kZq) this.LLJILLL.getValue();
    }

    public final LivePreviewHighlightsPlayerVM O1() {
        return (LivePreviewHighlightsPlayerVM) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        LiveRoomStruct liveRoomStruct;
        MutableLiveData<Boolean> mutableLiveData;
        if (M1()) {
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
            if (livePreviewHighlightsPlayerVMO1 == null || (mutableLiveData = livePreviewHighlightsPlayerVMO1.LLILLJJLI) == null || !Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
                return;
            }
            R1("stopHighlightVideo", true);
            return;
        }
        C473410IhP.LJ((Runnable) this.LLJJI.getValue());
        C1ACA c1acaZ1 = z1();
        C468930IaB.LIZ((c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id), "ttlive_preview_Highlight_Widget", "onResumeFeedPlay");
        View view = this.contentView;
        if (view != null) {
            C339190DRl.LIZLLL(view);
        }
        P1(EnumC2175031AAj.RESUME_FEED_PLAY);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        MutableLiveData<Boolean> mutableLiveData;
        super.L1();
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
        if (livePreviewHighlightsPlayerVMO1 != null && (mutableLiveData = livePreviewHighlightsPlayerVMO1.LLILLJJLI) != null) {
            Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.FALSE);
        }
        if (M1()) {
            View view = this.contentView;
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        C1324720kZq c1324720kZqN1 = N1();
        if (c1324720kZqN1 != null) {
            C339190DRl.LIZLLL(c1324720kZqN1);
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO12 = O1();
        if (livePreviewHighlightsPlayerVMO12 != null) {
            livePreviewHighlightsPlayerVMO12.zQ2(EnumC2175031AAj.UNSELECTED);
        }
        if (((LiveHighlightPlayerOptConfig) C2175111AAr.LIZIZ.getValue()).releaseOpt) {
            R1("unselect", false);
        }
    }

    public final boolean M1() {
        return !(O1() != null ? r0.xQ2() : false);
    }

    public final void Q1() {
        int i;
        LiveRoomStruct liveRoomStruct;
        AILivePreviewHighlight aILivePreviewHighlight;
        AILivePreviewHighlightVideoInfo aILivePreviewHighlightVideoInfo;
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        if (M1()) {
            return;
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
        if (((livePreviewHighlightsPlayerVMO1 == null || (mutableLiveData = livePreviewHighlightsPlayerVMO1.LLILLL) == null) ? null : mutableLiveData.getValue()) != EnumC765980U2y.IDLE) {
            return;
        }
        View view = this.contentView;
        if (view != null) {
            C339190DRl.LIZLLL(view);
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (aILivePreviewHighlight = liveRoomStruct.aiLivePreviewHighlight) != null && (aILivePreviewHighlightVideoInfo = aILivePreviewHighlight.videoInfo) != null) {
            C1819620xS4.LIZ().setUrl(aILivePreviewHighlightVideoInfo.coverUri).LJJI(N1());
            C339190DRl.LIZLLL(N1());
        }
        int iIntValue = ((Number) C275270Aqb.LIZ.getValue()).intValue();
        int i2 = 0;
        if (iIntValue == 0) {
            return;
        }
        if (iIntValue != 1) {
            if (iIntValue != 2) {
                if (iIntValue != 3 || ((Number) C275270Aqb.LIZIZ.getValue()).floatValue() < 8.3d) {
                    return;
                }
            } else if (((Number) C275270Aqb.LIZIZ.getValue()).floatValue() < 6.6d) {
                return;
            }
        } else if (((Number) C275270Aqb.LIZIZ.getValue()).floatValue() < 0.0f) {
            return;
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO12 = O1();
        if (livePreviewHighlightsPlayerVMO12 != null) {
            FrameLayout frameLayout = (FrameLayout) this.LLJILJILJ.getValue();
            if (!livePreviewHighlightsPlayerVMO12.LLJILJIL && !livePreviewHighlightsPlayerVMO12.LLJ) {
                livePreviewHighlightsPlayerVMO12.LLJILJIL = true;
                livePreviewHighlightsPlayerVMO12.yQ2(frameLayout);
                C2175101AAq c2175101AAqWQ2 = livePreviewHighlightsPlayerVMO12.wQ2();
                C1482560ogQ c1482560ogQ = c2175101AAqWQ2.LIZIZ;
                if (c1482560ogQ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("preRenderHighlightVideo:");
                    sbLIZ.append(c2175101AAqWQ2.LIZ);
                    C468930IaB.LIZ(c2175101AAqWQ2.LIZLLL, "ttlive_preview_Highlight_Player", C2188811AlT.LIZIZ(sbLIZ));
                    C1484040oio c1484040oio = new C1484040oio(c1482560ogQ, frameLayout);
                    InterfaceC1484830ok5 interfaceC1484830ok5 = c2175101AAqWQ2.LIZJ;
                    if (interfaceC1484830ok5 != null) {
                        interfaceC1484830ok5.LJFF(c1484040oio);
                    }
                }
            }
        }
        int childCount = ((ViewGroup) this.LLJILJILJ.getValue()).getChildCount();
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "live_highlight_pre_render_surfaceView_opt", true, false) || childCount <= 0 || (i = childCount - 1) < 0) {
            return;
        }
        while (true) {
            View childAt = ((ViewGroup) this.LLJILJILJ.getValue()).getChildAt(i2);
            if (childAt instanceof SurfaceView) {
                C339190DRl.LIZLLL(childAt);
                return;
            } else if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        C1ACA c1acaZ1;
        super.LJJIJIIJIL(i);
        if (M1()) {
            View view = this.contentView;
            if (view != null) {
                C339190DRl.LIZIZ(view);
                return;
            }
            return;
        }
        if (i == 0 && (c1acaZ1 = z1()) != null && TextUtils.equals(c1acaZ1.LIZLLL, "homepage_hot")) {
            P1(EnumC2175031AAj.SELECT);
        }
        View view2 = this.contentView;
        if (view2 != null) {
            C339190DRl.LIZLLL(view2);
        }
    }

    public final void P1(EnumC2175031AAj enumC2175031AAj) {
        boolean z;
        C2175121AAs c2175121AAs;
        LiveRoomStruct liveRoomStruct;
        C2175121AAs c2175121AAs2;
        C2175121AAs c2175121AAs3;
        C2175121AAs c2175121AAs4;
        C2175121AAs c2175121AAs5;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12;
        C2175121AAs c2175121AAs6;
        C2175121AAs c2175121AAs7;
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && c1acaZ13.LJIILIIL) {
            z = true;
        } else {
            z = false;
        }
        if (z && (((c1acaZ1 = z1()) == null || (c2175121AAs7 = c1acaZ1.LJIIJJI) == null || c2175121AAs7.LIZJ <= 0) && (c1acaZ12 = z1()) != null && (c2175121AAs6 = c1acaZ12.LJIIJJI) != null)) {
            c2175121AAs6.LIZJ = System.currentTimeMillis();
        }
        C473410IhP.LJ(this.LLJJ);
        this.LLJJ = null;
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 == null || (c2175121AAs5 = c1acaZ14.LJIIJJI) == null || c2175121AAs5.LIZIZ <= 0) {
            C339190DRl.LIZLLL(N1());
        }
        C755980Tl6.LIZ().LIZIZ = this.LLJIJIL;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
        if (livePreviewHighlightsPlayerVMO1 != null) {
            FrameLayout frameLayout = (FrameLayout) this.LLJILJILJ.getValue();
            if (!livePreviewHighlightsPlayerVMO1.LLJ) {
                livePreviewHighlightsPlayerVMO1.LLJ = true;
                C1ACA c1acaVQ2 = livePreviewHighlightsPlayerVMO1.vQ2();
                if (c1acaVQ2 != null && (liveRoomStruct = c1acaVQ2.LIZJ) != null) {
                    C1ACA c1acaVQ22 = livePreviewHighlightsPlayerVMO1.vQ2();
                    if (c1acaVQ22 != null && (c2175121AAs4 = c1acaVQ22.LJIIJJI) != null) {
                        c2175121AAs4.LJI = System.currentTimeMillis();
                    }
                    if (livePreviewHighlightsPlayerVMO1.LLILLL.getValue() == EnumC765980U2y.PAUSE_PLAY && !livePreviewHighlightsPlayerVMO1.LLJILLL) {
                        C1ACA c1acaVQ23 = livePreviewHighlightsPlayerVMO1.vQ2();
                        if (c1acaVQ23 != null && (c2175121AAs3 = c1acaVQ23.LJIIJJI) != null) {
                            c2175121AAs3.LJFF = 0L;
                        }
                        C2175101AAq c2175101AAqWQ2 = livePreviewHighlightsPlayerVMO1.wQ2();
                        InterfaceC1484830ok5 interfaceC1484830ok5 = c2175101AAqWQ2.LIZJ;
                        if (interfaceC1484830ok5 != null) {
                            interfaceC1484830ok5.resume();
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("resume playerTag:");
                        sbLIZ.append(c2175101AAqWQ2.LIZ);
                        sbLIZ.append(" scene:");
                        sbLIZ.append(enumC2175031AAj);
                        C468930IaB.LIZ(c2175101AAqWQ2.LIZLLL, "ttlive_preview_Highlight_Player", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        C1ACA c1acaVQ24 = livePreviewHighlightsPlayerVMO1.vQ2();
                        if (c1acaVQ24 != null && (c2175121AAs2 = c1acaVQ24.LJIIJJI) != null) {
                            c2175121AAs2.LJ = 1;
                            c2175121AAs2.LIZLLL = 0L;
                            c2175121AAs2.LIZIZ = 0L;
                            c2175121AAs2.LJFF = -1L;
                        }
                        livePreviewHighlightsPlayerVMO1.yQ2(frameLayout);
                        livePreviewHighlightsPlayerVMO1.LLJILLL = false;
                        livePreviewHighlightsPlayerVMO1.LLJI = false;
                        livePreviewHighlightsPlayerVMO1.LLJJ = false;
                        C2175101AAq c2175101AAqWQ22 = livePreviewHighlightsPlayerVMO1.wQ2();
                        C1482560ogQ c1482560ogQ = c2175101AAqWQ22.LIZIZ;
                        if (c1482560ogQ != null) {
                            C1479570obb c1479570obbLIZLLL = c1482560ogQ.LIZLLL();
                            if (c1479570obbLIZLLL != null) {
                                c1479570obbLIZLLL.LJJ = false;
                            }
                            InterfaceC1484830ok5 interfaceC1484830ok52 = c2175101AAqWQ22.LIZJ;
                            if (interfaceC1484830ok52 != null) {
                                interfaceC1484830ok52.LJ(c1482560ogQ);
                            }
                            float fLIZIZ = C0BTA.LIZIZ();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("play playerTag:");
                            sbLIZ2.append(c2175101AAqWQ22.LIZ);
                            sbLIZ2.append(" scene:");
                            sbLIZ2.append(enumC2175031AAj);
                            sbLIZ2.append(" device score:");
                            sbLIZ2.append(fLIZIZ);
                            C468930IaB.LIZ(Long.valueOf(liveRoomStruct.id), "ttlive_preview_Highlight_Player", C2188811AlT.LIZIZ(sbLIZ2));
                        }
                    }
                }
            }
        }
        C1ACA c1acaZ15 = z1();
        if (c1acaZ15 == null || (c2175121AAs = c1acaZ15.LJIIJJI) == null || c2175121AAs.LIZIZ <= 0) {
            C339190DRl.LIZLLL(N1());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        FeedLiveViewHolderVM feedLiveViewHolderVM;
        NextLiveData<Integer> nextLiveData;
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<EnumC765980U2y> mutableLiveData2;
        super.onLoad(objArr);
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
        if (livePreviewHighlightsPlayerVMO1 != null && (mutableLiveData2 = livePreviewHighlightsPlayerVMO1.LLILLL) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 38));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO12 = O1();
        if (livePreviewHighlightsPlayerVMO12 != null && (mutableLiveData = livePreviewHighlightsPlayerVMO12.LL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 39));
        }
        if (((LiveHighlightPlayerOptConfig) C2175111AAr.LIZIZ.getValue()).releaseOpt && (feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJI.getValue()) != null && (nextLiveData = feedLiveViewHolderVM.LLJJJJJIL) != null) {
            nextLiveData.observe(this, new AObserverS235S0100000_33(this, 40));
        }
    }

    public final void R1(String str, boolean z) {
        LiveRoomStruct liveRoomStruct;
        InterfaceC1484830ok5 interfaceC1484830ok5;
        C473410IhP.LJ(this.LLJJ);
        Long lValueOf = null;
        this.LLJJ = null;
        C473410IhP.LJ((Runnable) this.LLJJI.getValue());
        if (Intrinsics.LJFF(this.LLJIJIL, C755980Tl6.LIZ().LIZIZ)) {
            InterfaceC582670MtF interfaceC582670MtF = C755980Tl6.LIZ().LIZIZ;
            if (interfaceC582670MtF != null) {
                interfaceC582670MtF.LIZ(null);
            }
            C755980Tl6.LIZ().LIZIZ = null;
        }
        if (z) {
            View view = this.contentView;
            if (view != null) {
                C339190DRl.LIZIZ(view);
            }
            C339190DRl.LIZIZ(N1());
            N1().setBackground(null);
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVMO1 = O1();
        if (livePreviewHighlightsPlayerVMO1 != null && livePreviewHighlightsPlayerVMO1.LLIZLLLIL) {
            C2175081AAo c2175081AAo = livePreviewHighlightsPlayerVMO1.LLIZ;
            if (c2175081AAo != null && (interfaceC1484830ok5 = livePreviewHighlightsPlayerVMO1.wQ2().LIZJ) != null) {
                interfaceC1484830ok5.LJJIIZ(c2175081AAo);
            }
            C2175101AAq c2175101AAqWQ2 = livePreviewHighlightsPlayerVMO1.wQ2();
            c2175101AAqWQ2.getClass();
            InterfaceC1484830ok5 interfaceC1484830ok52 = c2175101AAqWQ2.LIZJ;
            if (interfaceC1484830ok52 != null) {
                interfaceC1484830ok52.release();
            }
            c2175101AAqWQ2.LIZIZ = null;
            c2175101AAqWQ2.LIZJ = null;
            c2175101AAqWQ2.LJ = null;
            c2175101AAqWQ2.LIZLLL = null;
            c2175101AAqWQ2.LIZ = null;
            livePreviewHighlightsPlayerVMO1.LLJ = false;
            livePreviewHighlightsPlayerVMO1.LLJILJIL = false;
            livePreviewHighlightsPlayerVMO1.LLJI = false;
            livePreviewHighlightsPlayerVMO1.LLJIJIL = false;
            livePreviewHighlightsPlayerVMO1.LLIZ = null;
            livePreviewHighlightsPlayerVMO1.LLJILLL = false;
            livePreviewHighlightsPlayerVMO1.LLJILJILJ = false;
            livePreviewHighlightsPlayerVMO1.LLIZLLLIL = false;
            EnumC765980U2y value = livePreviewHighlightsPlayerVMO1.LLILLL.getValue();
            EnumC765980U2y enumC765980U2y = EnumC765980U2y.IDLE;
            if (value != enumC765980U2y) {
                livePreviewHighlightsPlayerVMO1.LLILLL.setValue(enumC765980U2y);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroy reason: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C1ACA c1acaVQ2 = livePreviewHighlightsPlayerVMO1.vQ2();
            if (c1acaVQ2 != null && (liveRoomStruct = c1acaVQ2.LIZJ) != null) {
                lValueOf = Long.valueOf(liveRoomStruct.id);
            }
            C468930IaB.LIZ(lValueOf, "ttlive_preview_Highlight_VM", strLIZIZ);
        }
    }
}
