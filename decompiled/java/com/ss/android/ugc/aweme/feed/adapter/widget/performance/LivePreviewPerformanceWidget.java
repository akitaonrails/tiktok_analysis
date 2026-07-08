package com.ss.android.ugc.aweme.feed.adapter.widget.performance;

import X.AbstractC2175691ACx;
import X.C01GW;
import X.C09JN;
import X.C1100750ekb;
import X.C1101180elI;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1300530jwp;
import X.C1300540jwq;
import X.C1300550jwr;
import X.C13LE;
import X.C1954807lC;
import X.C19719912Dl;
import X.C1ACA;
import X.C1ACB;
import X.C1ACR;
import X.C1ADG;
import X.C1ADU;
import X.C2175731ADb;
import X.C2175741ADc;
import X.C2175751ADd;
import X.C2175861ADo;
import X.C2487409ou;
import X.C452501pT;
import X.C465520INi;
import X.C781400Ul0;
import X.C786410Ut5;
import X.EnumC1913550ztZ;
import X.EnumC480200IsM;
import X.EnumC494740Jai;
import Y.AObserverS230S0100000_28;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS89S0200000_20;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFeedPreviewAddMultiGuestParamsSetting;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.degrade.exps.LiveCardDegradeConfigStore;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.feed.setting.LivePreviewLinkPerfSendSetting;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewPerformanceWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public C11JF LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    public LivePreviewPerformanceWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS556S0100000_12(c19719912DlLIZ, 476), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LLJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 475));
        this.LLJJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 209));
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2128));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(293));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LL = true;
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        this.LLJI = false;
        this.LLJIJIL = false;
        O1();
        N1();
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

    static {
        new LinkedHashSet();
    }

    public final void M1() {
        if (!this.LLJILLL) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.ENTER_PREVIEW_CARD);
            this.LLJILLL = true;
        }
        if (((LivePreviewLinkPerfSendSetting.PreviewLinkPerfSendConfig) LivePreviewLinkPerfSendSetting.LIZIZ.getValue()).isEnable) {
            S1(true);
        }
    }

    public final void N1() {
        if (this.LLJILLL) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).S5(EnumC480200IsM.LEAVE_PREVIEW_CARD);
            this.LLJILLL = false;
        }
        if (((LivePreviewLinkPerfSendSetting.PreviewLinkPerfSendConfig) LivePreviewLinkPerfSendSetting.LIZIZ.getValue()).isEnable) {
            S1(false);
        }
    }

    public static void O1() {
        if (C1300550jwr.LIZ().enableSelectPerformance || C1300550jwr.LIZ().enableStayPerformance) {
            C1300530jwp.LIZ.getClass();
            C1300530jwp.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        R1();
        N1();
        if (C1300550jwr.LIZ().enableSelectPerformance) {
            P1(C2175741ADc.LIZJ);
        }
        C2487409ou.LIZ((Runnable) this.LLJJIII.getValue());
        O1();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q1() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.performance.LivePreviewPerformanceWidget.Q1():void");
    }

    public final void R1() {
        C01GW c01gw;
        C1ACB c1acb;
        if (C1300550jwr.LIZ().enablePlayFluency) {
            if (this.LLJIJIL) {
                C2487409ou.LIZ((Runnable) this.LLJJI.getValue());
                C1ACR c1acr = C1ACR.LIZ;
                C1ACA c1acaZ1 = z1();
                Aweme aweme = c1acaZ1 != null ? c1acaZ1.LIZIZ : null;
                c1acr.getClass();
                if (aweme != null && (c01gw = (C01GW) ((LinkedHashMap) C1ACR.LIZIZ).get("preview_watch")) != null && (c1acb = (C1ACB) c01gw.getValue()) != null) {
                    if (c1acb.LJII) {
                        c1acb.LJ = aweme;
                        c1acb.LIZIZ.LJI();
                        c1acb.LJIIIZ = System.currentTimeMillis();
                    }
                    c1acb.LJII = false;
                }
            }
            this.LLJIJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        M1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        C1ACA c1acaZ1;
        C2175861ADo c2175861ADo;
        if (this.LLJI && (c1acaZ1 = z1()) != null && (c2175861ADo = c1acaZ1.LJIIIZ) != null && c2175861ADo.LIZIZ) {
            Q1();
        }
        M1();
        if (C1300550jwr.LIZ().enableSelectPerformance) {
            P1(C2175731ADb.LIZJ);
        }
        if (C1300550jwr.LIZ().enableStayPerformance) {
            C2487409ou.LIZ((Runnable) this.LLJJIII.getValue());
            C2487409ou.LIZLLL(15000L, (Runnable) this.LLJJIII.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        C2487409ou.LIZ((Runnable) this.LLJJIII.getValue());
        O1();
        N1();
    }

    public final void P1(C1ADG c1adg) {
        C1ACA c1acaZ1;
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        String requestId;
        AbstractC2175691ACx abstractC2175691ACx;
        long j;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        C1100750ekb c1100750ekbNy0;
        C1101180elI c1101180elI;
        Float fValueOf;
        Aweme aweme2;
        int liveMgCoverShowStyle;
        Aweme aweme3;
        String str;
        Aweme aweme4;
        boolean z = false;
        if (!VideoStateViewModel.LLILZLL && !VideoStateViewModel.LLIZ) {
            return;
        }
        C1300530jwp.LIZ.getClass();
        if (!C1300530jwp.LIZJ && this.dataChannel != null && (c1acaZ1 = z1()) != null && (aweme = c1acaZ1.LIZIZ) != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null) {
            HashMap map = new HashMap();
            C1ACA c1acaZ12 = z1();
            String str2 = null;
            if (c1acaZ12 != null) {
                str2 = c1acaZ12.LIZLLL;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            map.put("enter_from_merge", str2);
            map.put("enter_method", "live_cell");
            map.put(Scene.SCENE_SERVICE, c1adg.LIZ);
            map.put("sub_scene", c1adg.LIZIZ);
            map.put("room_id", String.valueOf(newLiveRoomDataExt.id));
            map.put("author_id", String.valueOf(newLiveRoomDataExt.getAnchorId()));
            map.put("live_type", RoomStruct.getStreamType(newLiveRoomDataExt).logStreamingType);
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 == null || (aweme4 = c1acaZ13.LIZIZ) == null || (requestId = aweme4.getRequestId()) == null) {
                requestId = "";
            }
            map.put("request_id", requestId);
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null && (str = c1acaZ14.LJJJJ) != null) {
                str3 = str;
            }
            map.put("live_play_session_id", str3);
            C1ACA c1acaZ15 = z1();
            if (c1acaZ15 != null && (aweme2 = c1acaZ15.LIZIZ) != null && AwemeBizExtKt.getLiveMgCoverShowStyle(aweme2) > 0) {
                map.put("mg_cover_type", "profile_voice");
                C1ACA c1acaZ16 = z1();
                if (c1acaZ16 != null && (aweme3 = c1acaZ16.LIZIZ) != null) {
                    liveMgCoverShowStyle = AwemeBizExtKt.getLiveMgCoverShowStyle(aweme3);
                } else {
                    liveMgCoverShowStyle = 0;
                }
                map.put("mg_cover_style", String.valueOf(liveMgCoverShowStyle));
            }
            if (LiveCardDegradeConfigStore.LIZ() && (c1100750ekbNy0 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).ny0("live_preview_card")) != null && (c1101180elI = c1100750ekbNy0.LIZ) != null && (fValueOf = Float.valueOf(c1101180elI.LIZIZ)) != null) {
                map.put("cur_perf_score", String.valueOf(fValueOf.floatValue()));
            }
            if (LiveSdkFeedPreviewAddMultiGuestParamsSetting.isEnable()) {
                MultiLiveUserSettings multiLiveUserSettings = newLiveRoomDataExt.multiLiveUserSettings;
                if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                    j = multiGuestLayoutInfo.guestCnt;
                } else {
                    j = 0;
                }
                map.put("guest_cnt", String.valueOf((int) j));
            }
            final Long lValueOf = Long.valueOf(newLiveRoomDataExt.id);
            if (!C1300530jwp.LIZJ && lValueOf != null && lValueOf.longValue() > 0) {
                C2175731ADb c2175731ADb = C2175731ADb.LIZJ;
                if (Intrinsics.LJFF(c1adg, c2175731ADb)) {
                    abstractC2175691ACx = new AbstractC2175691ACx(lValueOf) { // from class: X.1ADV
                    };
                } else if (Intrinsics.LJFF(c1adg, C2175741ADc.LIZJ)) {
                    abstractC2175691ACx = new AbstractC2175691ACx(lValueOf) { // from class: X.1ADW
                    };
                } else if (Intrinsics.LJFF(c1adg, C2175751ADd.LIZJ)) {
                    abstractC2175691ACx = new AbstractC2175691ACx(lValueOf) { // from class: X.1ADX
                    };
                } else {
                    throw new C1954807lC();
                }
                if (!Intrinsics.LJFF(C1300530jwp.LJ, C1300540jwq.LIZLLL) && Intrinsics.LJFF(C1300530jwp.LJ.LIZ, lValueOf) && abstractC2175691ACx.LIZIZ > C1300530jwp.LJ.LIZIZ) {
                    abstractC2175691ACx.LIZJ = C1300530jwp.LJ.LIZJ;
                } else {
                    float fNextFloat = C1300530jwp.LIZLLL.nextFloat();
                    if (!Intrinsics.LJFF(c1adg, c2175731ADb) && !Intrinsics.LJFF(c1adg, C2175741ADc.LIZJ) && !Intrinsics.LJFF(c1adg, C2175751ADd.LIZJ)) {
                        throw new C1954807lC();
                    }
                    float f = C1300550jwr.LIZ().performanceSamplingRate;
                    double d = f;
                    if (0.0d > d || d > 1.0d) {
                        f = 0.0f;
                    }
                    if (fNextFloat <= f) {
                        z = true;
                    }
                    abstractC2175691ACx.LIZJ = z;
                }
                C1300530jwp.LJ = abstractC2175691ACx;
                if (abstractC2175691ACx.LIZJ) {
                    C1300530jwp.LIZJ = true;
                    C786410Ut5.LJJZZIII(new BPEAHandler(C786410Ut5.W2(C465520INi.LIZ.XD1())), new ARunnableS89S0200000_20(map, c1adg, 181));
                }
            }
        }
    }

    public final void S1(boolean z) {
        CopyOnWriteArrayList<Long> copyOnWriteArrayList;
        CopyOnWriteArrayList<Float> copyOnWriteArrayList2;
        CopyOnWriteArrayList<Float> copyOnWriteArrayList3;
        CopyOnWriteArrayList<Double> copyOnWriteArrayList4;
        CopyOnWriteArrayList<Double> copyOnWriteArrayList5;
        CopyOnWriteArrayList<Float> copyOnWriteArrayList6;
        if (!z) {
            if (this.LLJILJILJ) {
                C11JF c11jf = this.LLJILJIL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                this.LLJILJILJ = false;
            }
            ((C1ADU) C781400Ul0.LIZ.getValue()).stop();
            return;
        }
        if (!this.LLJILJILJ) {
            C11JF c11jf2 = this.LLJILJIL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null && (copyOnWriteArrayList6 = c1acaZ1.LJJIZ) != null) {
                copyOnWriteArrayList6.clear();
            }
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (copyOnWriteArrayList5 = c1acaZ12.LJJIL) != null) {
                copyOnWriteArrayList5.clear();
            }
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && (copyOnWriteArrayList4 = c1acaZ13.LJJIJLIJ) != null) {
                copyOnWriteArrayList4.clear();
            }
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null && (copyOnWriteArrayList3 = c1acaZ14.LJJIJIIJIL) != null) {
                copyOnWriteArrayList3.clear();
            }
            C1ACA c1acaZ15 = z1();
            if (c1acaZ15 != null && (copyOnWriteArrayList2 = c1acaZ15.LJJIJIL) != null) {
                copyOnWriteArrayList2.clear();
            }
            C1ACA c1acaZ16 = z1();
            if (c1acaZ16 != null && (copyOnWriteArrayList = c1acaZ16.LJJIJL) != null) {
                copyOnWriteArrayList.clear();
            }
            C1ACA c1acaZ17 = z1();
            if (c1acaZ17 != null) {
                c1acaZ17.LJJJI = 0L;
            }
            this.LLJILJIL = (C11JF) C11NZ.LJJJJJL(((Number) this.LLJJIJI.getValue()).longValue(), ((Number) this.LLJJIJI.getValue()).longValue(), TimeUnit.SECONDS).LJJJLZIJ(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.00Q6
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LivePreviewPerformanceWidget@1bbd.startPerformanceCollectForFullLink$1");
                    C1C7U.LIZIZ("LivePreviewPerformanceWidget@1bbd.startPerformanceCollectForFullLink$1");
                }
            }, new C09JN() { // from class: X.00Q7
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LivePreviewPerformanceWidget@1bbd.startPerformanceCollectForFullLink$2");
                    C1C7U.LIZIZ("LivePreviewPerformanceWidget@1bbd.startPerformanceCollectForFullLink$2");
                }
            });
            this.LLJILJILJ = true;
        }
        ((C1ADU) C781400Ul0.LIZ.getValue()).start();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Pair<EnumC1913550ztZ, Object>> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        super.onLoad(objArr);
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJ.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData2 = livePreviewPlayerVM.LLILZ) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 26));
        }
        LivePreviewPlayerVM livePreviewPlayerVM2 = (LivePreviewPlayerVM) this.LLJ.getValue();
        if (livePreviewPlayerVM2 != null && (mutableLiveData = livePreviewPlayerVM2.LL) != null) {
            mutableLiveData.observe(this, new AObserverS230S0100000_28(this, 21));
        }
    }
}
