package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C0C3F;
import X.C0K9R;
import X.C13IQ;
import X.C13LE;
import X.C1548820qPI;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19EG;
import X.C1AAR;
import X.C1AAZ;
import X.C1ABE;
import X.C1ABQ;
import X.C1ABT;
import X.C1ACA;
import X.C1AF0;
import X.C20441214yg;
import X.C21153017qC;
import X.C2175011AAh;
import X.C2188811AlT;
import X.C256860A4u;
import X.C305570ByN;
import X.C339190DRl;
import X.C452501pT;
import X.C486790J7d;
import X.C486860J7k;
import X.C487180J8q;
import X.C5182020e;
import X.EnumC2175001AAg;
import X.EnumC494740Jai;
import X.InterfaceC1141530foN;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS51S0110000_33;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.game.GameLiveOptSmoothEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePaidEventDRMSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveFollowingPagePreviewGuideExp;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.PreviewEnterRoomGuideWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.PreviewMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.ReportPreviewMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.paidevent.PaidEventMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideCardWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.openlive.GoLiveGuideVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.performance.LivePreviewPerformanceWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.PreviewGoLiveAnchorPoint;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewTopMaskLayerWidget extends LiveWatchPreviewWidget {
    public final String LLJ;
    public final View LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public GoLiveGuideCardWidget LLJJIJIL;
    public final AtomicBoolean LLJJJ;
    public PreviewEnterRoomGuideWidget LLJJJIL;
    public MaskLayerWidget LLJJJJ;
    public SubscribeMaskLayerWidget LLJJJJJIL;
    public PaidEventMaskLayerWidget LLJJJJLIIL;
    public final C01GW LLJJL;
    public Bitmap LLJJLIIIJLLLLLLLZ;
    public ARunnableS128S0100000_28 LLJL;

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

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void I1() {
        LiveRoomStruct liveRoomStruct;
        SubscribeMaskLayerWidget subscribeMaskLayerWidget;
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LLJILLL.getValue();
        if (maskLayerAndWarningVM != null) {
            maskLayerAndWarningVM.wQ2();
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || liveRoomStruct.allowPreviewTime != 0 || (subscribeMaskLayerWidget = this.LLJJJJJIL) == null || subscribeMaskLayerWidget.isShowing()) {
            return;
        }
        U1(false);
    }

    public final void M1() {
        C0C3F c0c3f = C0C3F.LIZ;
        String str = this.LLJ;
        c0c3f.getClass();
        if (!C0C3F.LIZJ(str)) {
            C486790J7d.LIZLLL(new ARunnableS133S0100000_33(this, 48), this, 40L);
            return;
        }
        C21153017qC c21153017qC = C21153017qC.LIZ;
        C1ABQ c1abq = new C1ABQ(this);
        c21153017qC.getClass();
        C21153017qC.LIZ(c1abq);
    }

    public final ImageView N1() {
        return (ImageView) this.LLJJL.getValue();
    }

    public final LivePreviewPlayerVM O1() {
        return (LivePreviewPlayerVM) this.LLJJIII.getValue();
    }

    public final void T1() {
        LiveRoomStruct liveRoomStruct;
        if (LiveCadSmoothExitSetting.INSTANCE.enable()) {
            C339190DRl.LIZIZ(N1());
            Bitmap bitmap = this.LLJJLIIIJLLLLLLLZ;
            if (bitmap != null) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            Long lValueOf = null;
            this.LLJJLIIIJLLLLLLLZ = null;
            this.LLJL = null;
            LivePreviewPlayerVM livePreviewPlayerVMO1 = O1();
            if (livePreviewPlayerVMO1 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindFrameView:false ");
                C1ACA c1acaZ1 = z1();
                if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
                    lValueOf = Long.valueOf(liveRoomStruct.id);
                }
                sbLIZ.append(lValueOf);
                sbLIZ.append(" ... preview");
                livePreviewPlayerVMO1.LLJLLIL.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        MutableLiveData<Boolean> mutableLiveData;
        T1();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && TextUtils.equals(c1acaZ1.LIZLLL, "homepage_follow") && LiveFollowingPagePreviewGuideExp.INSTANCE.getValue() > 0) {
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJJ.getValue();
            if (livePreviewGuideEnterVM != null) {
                livePreviewGuideEnterVM.vz2();
            }
            LivePreviewGuideEnterVM livePreviewGuideEnterVM2 = (LivePreviewGuideEnterVM) this.LLJJ.getValue();
            if (livePreviewGuideEnterVM2 != null && (mutableLiveData = livePreviewGuideEnterVM2.LLILLJJLI) != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
        }
        P1("un_bind");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        PreviewMaskLayerVM previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJILJILJ.getValue();
        if (previewMaskLayerVM != null) {
            C1ABE c1abe = new C1ABE(false);
            previewMaskLayerVM.wQ2(true);
            previewMaskLayerVM.LLILLL.setValue(c1abe);
        }
        P1("un_selected");
        T1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        T1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaVQ2;
        LiveRoomStruct liveRoomStruct2;
        super.LJJIJIIJIL(i);
        T1();
        C01GW c01gw = C305570ByN.LIZ;
        if (C305570ByN.LIZIZ(this.LLJ) && C305570ByN.LIZJ() == 2 && !this.LLJJJ.get()) {
            C486790J7d.LIZLLL(new Runnable() { // from class: X.1ABN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LivePreviewTopMaskLayerWidget@c1da.onViewHolderSelected$1");
                    try {
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                        C0C3F c0c3f = C0C3F.LIZ;
                        String str = livePreviewTopMaskLayerWidget.LLJ;
                        c0c3f.getClass();
                        livePreviewTopMaskLayerWidget.R1(C0C3F.LIZIZ(str), true);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LivePreviewTopMaskLayerWidget@c1da.onViewHolderSelected$1");
                }
            }, this, 1000L);
        }
        PreviewMaskLayerVM previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJILJILJ.getValue();
        if (previewMaskLayerVM != null && (c1acaVQ2 = previewMaskLayerVM.vQ2()) != null && (liveRoomStruct2 = c1acaVQ2.LIZJ) != null && C1ABT.LJIILLIIL(liveRoomStruct2) != EnumC2175001AAg.NORMAL && LivePaidEventDRMSetting.INSTANCE.getValue().enableStandardDRM && C1ABT.LJIILLIIL(liveRoomStruct2) != EnumC2175001AAg.PAID_MASK) {
            C20441214yg.LIZIZ("PreviewMaskLayerVM", "register");
            C1548820qPI.LIZLLL("live_event_update_result", (InterfaceC1141530foN) previewMaskLayerVM.LLILZ.getValue());
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
            S1(liveRoomStruct, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        C19EG activity;
        PreviewMaskLayerVM previewMaskLayerVM;
        this.LL = false;
        if (i == 1 && TextUtils.equals(this.LLJ, "homepage_follow")) {
            try {
                Fragment fragmentFragmentFinder = WidgetViewModelLazyKt.fragmentFinder(this);
                if (fragmentFragmentFinder != null && (activity = fragmentFragmentFinder.getActivity()) != null && !C486860J7k.LIZIZ(activity).FQ2("page_feed") && (previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJILJILJ.getValue()) != null) {
                    C1ABE c1abe = new C1ABE(false);
                    previewMaskLayerVM.wQ2(false);
                    previewMaskLayerVM.LLILLL.setValue(c1abe);
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJFF(th, "live_preview_crash");
                return;
            }
        }
        PreviewMaskLayerVM previewMaskLayerVM2 = (PreviewMaskLayerVM) this.LLJILJILJ.getValue();
        if (previewMaskLayerVM2 != null) {
            C1ABE c1abe2 = new C1ABE(false);
            previewMaskLayerVM2.wQ2(false);
            previewMaskLayerVM2.LLILLL.setValue(c1abe2);
        }
    }

    public final void P1(String str) {
        PaidEventMaskLayerWidget paidEventMaskLayerWidget;
        if (Intrinsics.LJFF(str, "un_selected") && (paidEventMaskLayerWidget = this.LLJJJJLIIL) != null && paidEventMaskLayerWidget.isShowing()) {
            C1AAZ c1aaz = C1AAZ.LIZ;
            C1ACA c1acaZ1 = z1();
            c1aaz.getClass();
            C1AAZ.LIZJ(c1acaZ1, "swipe", "draw");
        }
        PaidEventMaskLayerWidget paidEventMaskLayerWidget2 = this.LLJJJJLIIL;
        if (paidEventMaskLayerWidget2 != null) {
            paidEventMaskLayerWidget2.N1();
        }
    }

    public final void Q1(final boolean z) {
        NextLiveData nextLiveData;
        com.bytedance.ies.sdk.datachannel.NextLiveData nextLiveData2;
        com.bytedance.ies.sdk.datachannel.NextLiveData nextLiveData3;
        MutableLiveData<C0K9R> mutableLiveData;
        com.bytedance.ies.sdk.datachannel.NextLiveData<Integer> nextLiveData4;
        MutableLiveData<Boolean> mutableLiveData2;
        com.bytedance.ies.sdk.datachannel.NextLiveData<PreviewGoLiveAnchorPoint> nextLiveData5;
        LivePreviewGuideEnterVM livePreviewGuideEnterVM;
        MutableLiveData<Boolean> mutableLiveData3;
        C1AAR.LIZ.getClass();
        if (((PreviewGuideData) C1AAR.LIZJ.getValue()).style > 0 && (livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LLJJ.getValue()) != null && (mutableLiveData3 = livePreviewGuideEnterVM.LLILLJJLI) != null) {
            mutableLiveData3.observe(this, new Observer() { // from class: X.1ABM
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget;
                    Boolean bool = (Boolean) obj;
                    LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                    if (livePreviewTopMaskLayerWidget.LLJJJIL == null) {
                        RecyclableWidgetManager recyclableWidgetManager = livePreviewTopMaskLayerWidget.subWidgetManager;
                        if (recyclableWidgetManager != null) {
                            previewEnterRoomGuideWidget = (PreviewEnterRoomGuideWidget) recyclableWidgetManager.load(R.id.htr, PreviewEnterRoomGuideWidget.class, false);
                        } else {
                            previewEnterRoomGuideWidget = null;
                        }
                        livePreviewTopMaskLayerWidget.LLJJJIL = previewEnterRoomGuideWidget;
                    }
                    if (bool.booleanValue()) {
                        PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget2 = this.LL.LLJJJIL;
                        if (previewEnterRoomGuideWidget2 != null) {
                            previewEnterRoomGuideWidget2.show();
                            return;
                        }
                        return;
                    }
                    PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget3 = this.LL.LLJJJIL;
                    if (previewEnterRoomGuideWidget3 == null) {
                        return;
                    }
                    previewEnterRoomGuideWidget3.hide();
                }
            });
        }
        GoLiveGuideVM goLiveGuideVM = (GoLiveGuideVM) this.LLJJIJIIJIL.getValue();
        if (goLiveGuideVM != null && (nextLiveData5 = goLiveGuideVM.LLILLJJLI) != null) {
            nextLiveData5.observe(this, new Observer() { // from class: X.0Izk
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    GoLiveGuideCardWidget goLiveGuideCardWidget;
                    PreviewGoLiveAnchorPoint previewGoLiveAnchorPoint = (PreviewGoLiveAnchorPoint) obj;
                    LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                    GoLiveGuideCardWidget goLiveGuideCardWidget2 = livePreviewTopMaskLayerWidget.LLJJIJIL;
                    if (goLiveGuideCardWidget2 == null) {
                        livePreviewTopMaskLayerWidget.LLJJIJIL = new GoLiveGuideCardWidget((ViewGroup) this.LL.findViewById(R.id.nc5), previewGoLiveAnchorPoint);
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget2 = this.LL;
                        RecyclableWidgetManager recyclableWidgetManager = livePreviewTopMaskLayerWidget2.subWidgetManager;
                        if (recyclableWidgetManager != null) {
                            recyclableWidgetManager.load(R.id.j2y, livePreviewTopMaskLayerWidget2.LLJJIJIL);
                            return;
                        }
                        return;
                    }
                    if (!goLiveGuideCardWidget2.isInitialized() || (goLiveGuideCardWidget = this.LL.LLJJIJIL) == null) {
                        return;
                    }
                    goLiveGuideCardWidget.O1(previewGoLiveAnchorPoint);
                }
            });
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LLJILLL.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData2 = maskLayerAndWarningVM.LLILZIL) != null) {
            mutableLiveData2.observe(this, new Observer() { // from class: X.1ABL
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    MaskLayerWidget maskLayerWidget;
                    MaskLayerWidget maskLayerWidget2;
                    if (((Boolean) obj).booleanValue()) {
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                        MaskLayerWidget maskLayerWidget3 = livePreviewTopMaskLayerWidget.LLJJJJ;
                        if (maskLayerWidget3 == null) {
                            RecyclableWidgetManager recyclableWidgetManager = livePreviewTopMaskLayerWidget.subWidgetManager;
                            if (recyclableWidgetManager != null) {
                                maskLayerWidget2 = (MaskLayerWidget) recyclableWidgetManager.load(R.id.hts, MaskLayerWidget.class, z);
                            } else {
                                maskLayerWidget2 = null;
                            }
                            livePreviewTopMaskLayerWidget.LLJJJJ = maskLayerWidget2;
                        } else if (maskLayerWidget3.isInitialized() && (maskLayerWidget = this.LL.LLJJJJ) != null) {
                            maskLayerWidget.M1();
                        }
                        LivePreviewPlayerVM livePreviewPlayerVMO1 = this.LL.O1();
                        if (livePreviewPlayerVMO1 != null) {
                            livePreviewPlayerVMO1.yQ2("loadMaskLayerWidget", true);
                            return;
                        }
                        return;
                    }
                    MaskLayerWidget maskLayerWidget4 = this.LL.LLJJJJ;
                    if (maskLayerWidget4 == null) {
                        return;
                    }
                    maskLayerWidget4.hide();
                }
            });
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJIJIL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData4 = feedLiveViewHolderVM.LLJJJJJIL) != null) {
            nextLiveData4.observe(this, new Observer() { // from class: X.1ABJ
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LL.LLJILJIL.getValue();
                    if (subscribeMaskLayerVM != null) {
                        subscribeMaskLayerVM.vQ2(false);
                    }
                }
            });
        }
        LivePreviewPlayerVM livePreviewPlayerVMO1 = O1();
        if (livePreviewPlayerVMO1 != null && (mutableLiveData = livePreviewPlayerVMO1.LLILZLL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.1ABI
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    com.bytedance.ies.sdk.datachannel.NextLiveData<C1ABF> nextLiveData6;
                    com.bytedance.ies.sdk.datachannel.NextLiveData<C1ABF> nextLiveData7;
                    MutableLiveData<Unit> mutableLiveData4;
                    C0K9R c0k9r = (C0K9R) obj;
                    if (c0k9r.LIZ) {
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                        SubscribeMaskLayerWidget subscribeMaskLayerWidget = livePreviewTopMaskLayerWidget.LLJJJJJIL;
                        if (subscribeMaskLayerWidget != null && subscribeMaskLayerWidget.isInitialized()) {
                            subscribeMaskLayerWidget.hide();
                            C1ACA c1acaZ1 = subscribeMaskLayerWidget.z1();
                            if (c1acaZ1 != null) {
                                c1acaZ1.LJJI = false;
                            }
                        }
                        LivePreviewPlayerVM livePreviewPlayerVMO12 = livePreviewTopMaskLayerWidget.O1();
                        if (livePreviewPlayerVMO12 != null && (mutableLiveData4 = livePreviewPlayerVMO12.LLIZ) != null) {
                            mutableLiveData4.setValue(Unit.LIZ);
                        }
                    } else if (c0k9r.LIZIZ) {
                        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LL.LLJILJIL.getValue();
                        if (subscribeMaskLayerVM != null) {
                            subscribeMaskLayerVM.vQ2(true);
                        }
                    } else {
                        SubscribeMaskLayerVM subscribeMaskLayerVM2 = (SubscribeMaskLayerVM) this.LL.LLJILJIL.getValue();
                        if (subscribeMaskLayerVM2 != null && (nextLiveData6 = subscribeMaskLayerVM2.LLILLL) != null) {
                            nextLiveData6.setValue(new C1ABF(false, -1L));
                        }
                        this.LL.U1(true);
                        return;
                    }
                    SubscribeMaskLayerVM subscribeMaskLayerVM3 = (SubscribeMaskLayerVM) this.LL.LLJILJIL.getValue();
                    if (subscribeMaskLayerVM3 != null && (nextLiveData7 = subscribeMaskLayerVM3.LLILLL) != null) {
                        nextLiveData7.setValue(new C1ABF());
                    }
                }
            });
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LLJILJIL.getValue();
        if (subscribeMaskLayerVM != null && (nextLiveData3 = subscribeMaskLayerVM.LLILLJJLI) != null) {
            nextLiveData3.observe(this, new Observer() { // from class: X.1ABO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.LL.U1(((Boolean) obj).booleanValue());
                }
            });
        }
        PreviewMaskLayerVM previewMaskLayerVM = (PreviewMaskLayerVM) this.LLJILJILJ.getValue();
        if (previewMaskLayerVM != null && (nextLiveData2 = previewMaskLayerVM.LLILLJJLI) != null) {
            nextLiveData2.observe(this, new Observer() { // from class: X.1AAi
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    LiveRoomStruct liveRoomStruct;
                    C1ACA c1acaZ1 = this.LL.z1();
                    if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null) {
                        this.LL.S1(liveRoomStruct, true);
                    }
                }
            });
        }
        LivePreviewPlayerVM livePreviewPlayerVMO12 = O1();
        if (livePreviewPlayerVMO12 != null && (nextLiveData = livePreviewPlayerVMO12.LLJI) != null) {
            nextLiveData.observe(this, new Observer() { // from class: X.1AAm
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    Bitmap bitmapLJIJI;
                    int iLIZJ;
                    int top;
                    FrameLayout.LayoutParams layoutParams;
                    LiveRoomStruct liveRoomStruct;
                    Float f;
                    int iFloatValue;
                    View videoView;
                    if (((Boolean) obj).booleanValue()) {
                        LivePreviewPlayerVM livePreviewPlayerVMO13 = this.LL.O1();
                        if (livePreviewPlayerVMO13 != null) {
                            livePreviewPlayerVMO13.LLJLLIL.LJIIJJI(false);
                        }
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget = this.LL;
                        LivePreviewPlayerVM livePreviewPlayerVMO14 = livePreviewTopMaskLayerWidget.O1();
                        Long lValueOf = null;
                        if (livePreviewPlayerVMO14 != null) {
                            bitmapLJIJI = livePreviewPlayerVMO14.LLJLLIL.LJIJI(true);
                        } else {
                            bitmapLJIJI = null;
                        }
                        livePreviewTopMaskLayerWidget.LLJJLIIIJLLLLLLLZ = bitmapLJIJI;
                        LivePreviewTopMaskLayerWidget livePreviewTopMaskLayerWidget2 = this.LL;
                        Bitmap bitmap = livePreviewTopMaskLayerWidget2.LLJJLIIIJLLLLLLLZ;
                        if (bitmap != null) {
                            if (C0COV.LIZIZ) {
                                boolean z2 = C14LC.LJIIIZ;
                                C309690CBz.LIZ.getClass();
                                iLIZJ = C497820Jfg.LIZJ(livePreviewTopMaskLayerWidget2.context);
                            } else {
                                iLIZJ = 0;
                            }
                            LivePreviewPlayerVM livePreviewPlayerVMO15 = livePreviewTopMaskLayerWidget2.O1();
                            if (livePreviewPlayerVMO15 != null && (videoView = livePreviewPlayerVMO15.LLJLLIL.getVideoView()) != null) {
                                top = videoView.getTop();
                                Object parent = videoView.getParent();
                                if (parent instanceof View) {
                                    top += ((View) parent).getTop();
                                }
                            } else {
                                top = 0;
                            }
                            int i = iLIZJ + top;
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                            if (width > height) {
                                layoutParams = new FrameLayout.LayoutParams(width, height);
                                layoutParams.gravity = 48;
                                scaleType = ImageView.ScaleType.CENTER_INSIDE;
                                C1ACA c1acaZ1 = livePreviewTopMaskLayerWidget2.z1();
                                if (c1acaZ1 != null) {
                                    f = c1acaZ1.LJIJ;
                                } else {
                                    f = null;
                                }
                                if (!C500260Jjc.LJJIJIIJIL(Boolean.valueOf(GameLiveOptSmoothEnterRoomSetting.INSTANCE.isOptLandscape())) && f != null) {
                                    f.floatValue();
                                    if (width > 0 && height > 0 && f.floatValue() > 0.0f && (iFloatValue = (width - ((int) (height * f.floatValue()))) / 2) > 0) {
                                        int i2 = -iFloatValue;
                                        layoutParams.leftMargin = i2;
                                        layoutParams.rightMargin = i2;
                                    }
                                }
                            } else {
                                if (top == 0) {
                                    C291550Bbl.LIZ.getClass();
                                    if (((Boolean) C291550Bbl.LIZIZ.getValue()).booleanValue()) {
                                        layoutParams = new FrameLayout.LayoutParams(-1, height);
                                    } else {
                                        layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                    }
                                } else {
                                    layoutParams = new FrameLayout.LayoutParams(width, height);
                                }
                                layoutParams.gravity = 1;
                            }
                            layoutParams.topMargin = i;
                            C786410Ut5.c6(livePreviewTopMaskLayerWidget2.N1(), layoutParams);
                            C339190DRl.LIZLLL(livePreviewTopMaskLayerWidget2.N1());
                            livePreviewTopMaskLayerWidget2.N1().setScaleType(scaleType);
                            livePreviewTopMaskLayerWidget2.N1().setImageBitmap(bitmap);
                            LivePreviewPlayerVM livePreviewPlayerVMO16 = livePreviewTopMaskLayerWidget2.O1();
                            if (livePreviewPlayerVMO16 != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("bindFrameView:true ");
                                C1ACA c1acaZ12 = livePreviewTopMaskLayerWidget2.z1();
                                if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
                                    lValueOf = Long.valueOf(liveRoomStruct.id);
                                }
                                sbLIZ.append(lValueOf);
                                sbLIZ.append(" ... preview");
                                livePreviewPlayerVMO16.LLJLLIL.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                            livePreviewTopMaskLayerWidget2.LLJL = new ARunnableS128S0100000_28(livePreviewTopMaskLayerWidget2, 69);
                            HandlerHook.viewPostDelay(livePreviewTopMaskLayerWidget2.N1(), livePreviewTopMaskLayerWidget2.LLJL, 2500L);
                            return;
                        }
                        return;
                    }
                    HandlerHook.viewRemoveCallbacks(this.LL.N1(), this.LL.LLJL);
                    this.LL.T1();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U1(boolean r13) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget.U1(boolean):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        RecyclableWidgetManager recyclableWidgetManager;
        enablePreviewSubWidgetManager();
        RecyclableWidgetManager.LoadInterceptor loadInterceptorA1 = LiveWatchPreviewWidget.A1(this.LLJI);
        if (loadInterceptorA1 != null && (recyclableWidgetManager = this.subWidgetManager) != null) {
            recyclableWidgetManager.setLoadInterceptor(loadInterceptorA1);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        super.onLoad(objArr);
        this.subWidgetManager.createWidget(findViewById(R.id.mxz), new ReportPreviewMaskLayerWidget());
        C01GW c01gw = C305570ByN.LIZ;
        if (C305570ByN.LIZ(this.LLJ)) {
            LivePreviewPlayerVM livePreviewPlayerVMO1 = O1();
            if (livePreviewPlayerVMO1 != null && (mutableLiveData2 = livePreviewPlayerVMO1.LLILZ) != null) {
                mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 13));
            }
            LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJJIJI.getValue();
            if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LL) != null) {
                mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 14));
            }
        } else {
            Q1(true);
        }
        this.subWidgetManager.load(new LivePreviewPerformanceWidget());
        if (((Boolean) C256860A4u.LIZ.getValue()).booleanValue()) {
            this.subWidgetManager.createWidget(findViewById(R.id.yg9), new LivePreviewTouchMonitorWidget());
        }
    }

    public LivePreviewTopMaskLayerWidget(View view, String str) {
        this.LLJ = str;
        this.LLJI = view;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 215);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, c5182020e, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(SubscribeMaskLayerVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ2, 216), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(PreviewMaskLayerVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ3, 217), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MaskLayerAndWarningVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ4, 218), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ5, 219), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(LivePreviewBottomCardVM.class);
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ6, 220), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ7, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ7, 221), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ8, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ8, 222), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(GoLiveGuideVM.class);
        this.LLJJIJIIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ9, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ9, 223), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJJ = new AtomicBoolean(false);
        this.LLJJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3853));
    }

    public final void R1(boolean z, boolean z2) {
        String str;
        if (this.isDestroyed || this.LLJJJ.get()) {
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
            C487180J8q.LIZ(new ARunnableS51S0110000_33(this, z, 0), str2);
            return;
        }
        if ((z && !this.LL) || !this.LLJJJ.compareAndSet(false, true)) {
            return;
        }
        Q1(false);
    }

    public final void S1(LiveRoomStruct liveRoomStruct, boolean z) {
        PaidEventMaskLayerWidget paidEventMaskLayerWidget;
        PaidEventMaskLayerWidget paidEventMaskLayerWidget2;
        int i = C2175011AAh.LIZ[C1ABT.LJIILLIIL(liveRoomStruct).ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                throw new C1954807lC();
            }
            P1("notify_change");
            return;
        }
        PaidEventMaskLayerWidget paidEventMaskLayerWidget3 = this.LLJJJJLIIL;
        if (paidEventMaskLayerWidget3 == null) {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                paidEventMaskLayerWidget2 = (PaidEventMaskLayerWidget) recyclableWidgetManager.load(R.id.mxy, PaidEventMaskLayerWidget.class);
            } else {
                paidEventMaskLayerWidget2 = null;
            }
            this.LLJJJJLIIL = paidEventMaskLayerWidget2;
            return;
        }
        if (paidEventMaskLayerWidget3.isInitialized() && (paidEventMaskLayerWidget = this.LLJJJJLIIL) != null) {
            paidEventMaskLayerWidget.M1(z);
        }
    }
}
