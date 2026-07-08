package com.ss.android.ugc.aweme.feed.adapter.widget.player;

import X.AbstractC1511510pR7;
import X.AnonymousClass0956;
import X.C01GW;
import X.C08CX;
import X.C08LW;
import X.C09JN;
import X.C0C21;
import X.C0C64;
import X.C0COV;
import X.C0IIP;
import X.C0IJT;
import X.C0IYH;
import X.C0J60;
import X.C0J65;
import X.C0J66;
import X.C0J7H;
import X.C0J89;
import X.C0N33;
import X.C0UO0;
import X.C1161920gLG;
import X.C118300cf;
import X.C11JF;
import X.C11NZ;
import X.C123100dR;
import X.C1244080iTm;
import X.C1306400k6I;
import X.C1338270kvh;
import X.C1389340mG4;
import X.C13IQ;
import X.C13LE;
import X.C13LZ;
import X.C14EU;
import X.C14LC;
import X.C1511750pRV;
import X.C1869240yk6;
import X.C19386510sx;
import X.C19719912Dl;
import X.C19748512Ol;
import X.C1AC7;
import X.C1ACA;
import X.C1ACD;
import X.C1ACH;
import X.C1ACM;
import X.C1ACO;
import X.C1ACS;
import X.C1ACV;
import X.C1AD0;
import X.C1AD2;
import X.C1AD3;
import X.C1AD5;
import X.C1ADJ;
import X.C1ADN;
import X.C20441214yg;
import X.C2174311A7p;
import X.C2175531ACh;
import X.C2175781ADg;
import X.C2188811AlT;
import X.C23250099c;
import X.C238400w2;
import X.C275100AqK;
import X.C285940BIq;
import X.C293620Bf6;
import X.C309690CBz;
import X.C326690CrL;
import X.C452501pT;
import X.C473250Ih9;
import X.C473410IhP;
import X.C474500IjA;
import X.C481640Iug;
import X.C481660Iui;
import X.C481670Iuj;
import X.C481940IvA;
import X.C482240Ive;
import X.C486280J5e;
import X.C486300J5g;
import X.C486320J5i;
import X.C486330J5j;
import X.C486370J5n;
import X.C486790J7d;
import X.C497740JfY;
import X.C497820Jfg;
import X.C500260Jjc;
import X.C582620MtA;
import X.C582630MtB;
import X.C582650MtD;
import X.C583980MvM;
import X.C755980Tl6;
import X.C786410Ut5;
import X.C827750WdZ;
import X.EnumC1488260opc;
import X.EnumC1488280ope;
import X.EnumC1913550ztZ;
import X.EnumC2175041AAk;
import X.EnumC494740Jai;
import X.EnumC765980U2y;
import X.EnumC993870byD;
import X.InterfaceC1097170eep;
import X.InterfaceC1511740pRU;
import X.InterfaceC1512530pSl;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.InterfaceC582670MtF;
import Y.AObserverS213S0100000_9;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS133S0100000_33;
import Y.AfS8S0100100_23;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.game.GameLiveOptSmoothEnterRoomSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveParallelPullCostOpt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveParallelStreamCDNStrategyKey;
import com.bytedance.android.livesdk.livesetting.linkmic.PullSceneConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreviewPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveRoomBackLiveCardOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LivePausePrePullStreamExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.starship.engine.strategy.IStarShipStrategy;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.ab.BetaGammaEatConfig;
import com.ss.android.ugc.aweme.ab.Config;
import com.ss.android.ugc.aweme.ab.PullConfig;
import com.ss.android.ugc.aweme.ab.PullStreamSyncConfig;
import com.ss.android.ugc.aweme.ab.StrategyConfig;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.feed.vm.VideoActionViewModel;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.hangout.component.interact.model.MultiTopLiveRoomMatchScene;
import com.ttkmedia.datacenter.api.featurecenter.VCFeatureCenterManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS44S0200100_23;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public final class LivePreviewPlayerWidget extends LiveWatchPreviewWidget {
    public static final int LLLF = C497740JfY.LJIIIZ(R.dimen.atb);
    public static boolean LLLFF;
    public VideoStateViewModel LLJ;
    public VideoActionViewModel LLJI;
    public C1ADJ LLJIJIL;
    public C11JF LLJILJIL;
    public C11JF LLJILJILJ;
    public C11JF LLJILLL;
    public InterfaceC420801kM LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public DisplayManager LLJJJ;
    public AnonymousClass0956 LLJJJIL;
    public final String LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C1ACO LLJJL;
    public C1ACM LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public ARunnableS133S0100000_33 LLJLIL;
    public C2175531ACh LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C1AD0 LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C0IYH LLL;

    /* JADX WARN: Type inference failed for: r0v19, types: [X.1ACO] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.1AD0] */
    public LivePreviewPlayerWidget() {
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c19719912DlLIZ, 637);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS575S0100000_31, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS575S0100000_31(c19719912DlLIZ2, 638), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ViewHolderStatusVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new AwS575S0100000_31(c19719912DlLIZ3, 639), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MaskLayerAndWarningVM.class);
        this.LLJJIJIIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new AwS575S0100000_31(c19719912DlLIZ4, 640), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new AwS575S0100000_31(c19719912DlLIZ5, 641), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJJJJ = C1AD3.LIZ().enableEtaPulse ? "stream_pull_with_warmup" : "stream_pull";
        this.LLJJL = new DisplayManager.DisplayListener() { // from class: X.1ACO
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
                this.LL.getClass();
                C766270U4b.LIZLLL(2131855455);
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = this.LL.Q1();
                if (livePreviewPlayerVMQ1 != null) {
                    livePreviewPlayerVMQ1.LLJLLIL.LJJJJIZL();
                    livePreviewPlayerVMQ1.LLJJIII = false;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_anti_capture_recording_toast");
                c474500IjALIZ.LJIJJLI(this.LL.dataChannel);
                c474500IjALIZ.LJJII("recording_toast", "toast_type");
                c474500IjALIZ.LJJII("preview", "event_page");
                c474500IjALIZ.LIZ();
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
                C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "preview anti capture -> onDisplayRemoved");
                this.LL.getClass();
                this.LL.V1(EnumC2175041AAk.OTHERS);
            }
        };
        this.LLJLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2132));
        this.LLJLLIL = new InterfaceC19562711gH() { // from class: X.1AD0
            @Override // X.InterfaceC19562711gH
            public final void LLF(Context context) {
                C1ACD c1acd;
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = this.LL.Q1();
                if (livePreviewPlayerVMQ1 != null && (c1acd = livePreviewPlayerVMQ1.LLJLLIL) != null) {
                    c1acd.onAppBackground(false);
                }
            }

            @Override // X.InterfaceC19562711gH
            public final void LLLLIILLL(Context context) {
                C1ACD c1acd;
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = this.LL.Q1();
                if (livePreviewPlayerVMQ1 != null && (c1acd = livePreviewPlayerVMQ1.LLJLLIL) != null) {
                    c1acd.onAppBackground(true);
                }
            }
        };
        this.LLJLLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2131));
        this.LLJZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2133));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2130));
        this.LLL = new C0IYH(new AwS575S0100000_31(this, 642));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:315:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c6  */
    /* JADX WARN: Type inference failed for: r0v209, types: [X.1ACN] */
    /* JADX WARN: Type inference failed for: r0v210, types: [X.1AAe] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1ACM] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B1() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget.B1():void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        C20441214yg.LIZIZ("shared_bg", "ttlive_preview_LivePreviewPlayerWidget onHolderResume");
        LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable();
        this.LL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        C1ACV c1acv;
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        C19386510sx<Integer> c19386510sx;
        Integer value;
        MutableLiveData<Boolean> mutableLiveData;
        C473410IhP.LJ(this.LLJLIL);
        LivePreviewPlayerVM livePreviewPlayerVMQ12 = Q1();
        if (livePreviewPlayerVMQ12 != null && (mutableLiveData = livePreviewPlayerVMQ12.LLJILJIL) != null) {
            mutableLiveData.setValue(Boolean.FALSE);
        }
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LLJJIJI.getValue();
        if ((viewHolderStatusVM == null || (c19386510sx = viewHolderStatusVM.LLIZ) == null || (value = c19386510sx.LIZ.getValue()) == null || 1 != value.intValue()) ? false : true) {
            if ((!C293620Bf6.LIZ(Q1() != null ? r0.BQ2() : null)) && (livePreviewPlayerVMQ1 = Q1()) != null) {
                livePreviewPlayerVMQ1.yQ2("onViewHolderUnSelected", true);
            }
        }
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "deactivateAntiScreenCapture");
        DisplayManager displayManager = this.LLJJJ;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.LLJJL);
        }
        this.LLJJJ = null;
        this.LLL.LIZIZ();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (c1acv = c1acaZ1.LJJLIL) != null) {
            c1acv.LLLLIILL();
        }
        C11JF c11jf2 = this.LLJILJIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!LivePreviewPerfOptSetting.enablePreviewPullStrategyOpt() || this.LLJJJJJIL) {
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(this.LLJJJJ);
        }
    }

    public final void N1() {
        C2175531ACh c2175531ACh = this.LLJLILLLLZIIL;
        if (c2175531ACh != null) {
            c2175531ACh.LJI.set(true);
            c2175531ACh.LIZJ.removeCallbacks(c2175531ACh.LJIIIZ);
            c2175531ACh.LIZJ.removeCallbacks(c2175531ACh.LJIIJ);
        }
        this.LLJLILLLLZIIL = null;
    }

    public final boolean O1() {
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJJIJIL.getValue();
        return livePreviewHighlightsPlayerVM != null && livePreviewHighlightsPlayerVM.xQ2();
    }

    public final FeedLiveViewHolderVM P1() {
        return (FeedLiveViewHolderVM) this.LLJJIII.getValue();
    }

    public final LivePreviewPlayerVM Q1() {
        return (LivePreviewPlayerVM) this.LLJJI.getValue();
    }

    public final FrameLayout R1() {
        return (FrameLayout) this.LLJLL.getValue();
    }

    public final void h2() {
        C11JF c11jf = this.LLJILJIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", "stopPauseStreamTimer");
            C11JF c11jf2 = this.LLJILJIL;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
        }
        this.LLJILJIL = null;
    }

    public final void k2() {
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "unRegisterPreVideoState");
        VideoStateViewModel videoStateViewModel = this.LLJ;
        if (videoStateViewModel != null) {
            LiveData liveData = C583980MvM.LIZJ().fixObserver ? videoStateViewModel.LLILLJJLI : videoStateViewModel.LL;
            if (liveData != null) {
                liveData.removeObserver((AObserverS213S0100000_9) this.LLJLLL.getValue());
            }
        }
        VideoStateViewModel videoStateViewModel2 = this.LLJ;
        if (videoStateViewModel2 != null) {
            LiveData liveData2 = C583980MvM.LIZJ().fixObserver ? videoStateViewModel2.LLILZ : videoStateViewModel2.LLILLL;
            if (liveData2 != null) {
                liveData2.removeObserver((AObserverS213S0100000_9) this.LLJZ.getValue());
            }
        }
        this.LLJ = null;
    }

    public final void l2() {
        NextLiveData<C582620MtA> nextLiveData;
        VideoActionViewModel videoActionViewModel = this.LLJI;
        if (videoActionViewModel != null && (nextLiveData = videoActionViewModel.LL) != null) {
            nextLiveData.removeObserver((Observer) this.LLJZIJLIL.getValue());
        }
        this.LLJI = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        LiveRoomStruct liveRoomStruct;
        StreamUrlStruct streamUrlStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        if (!f2()) {
            V1(EnumC2175041AAk.RESUME_FEED_PLAY);
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = Q1();
        boolean z = false;
        if (livePreviewPlayerVMQ1 != null && (mutableLiveData = livePreviewPlayerVMQ1.LLJILJIL) != null && Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE)) {
            LivePreviewPlayerVM livePreviewPlayerVMQ12 = Q1();
            if (livePreviewPlayerVMQ12 != null && (mutableLiveData2 = livePreviewPlayerVMQ12.LLJILJIL) != null) {
                mutableLiveData2.setValue(Boolean.FALSE);
            }
            show();
        }
        C1ACA c1acaZ1 = z1();
        if (C500260Jjc.LJJJI((c1acaZ1 == null || (liveRoomStruct3 = c1acaZ1.LIZJ) == null) ? null : Boolean.valueOf(liveRoomStruct3.disableScreenRecord))) {
            C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "activateAntiScreenCapture");
            this.LLL.LIZJ(C0IIP.ROOM_DISABLE_RECORD, true);
            DisplayManager displayManager = (DisplayManager) C786410Ut5.H2(this.context, "display");
            this.LLJJJ = displayManager;
            displayManager.registerDisplayListener(this.LLJJL, null);
        }
        C1ACA c1acaZ12 = z1();
        if (C500260Jjc.LJJJI((c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) ? null : Boolean.valueOf(liveRoomStruct2.disableScreenRecord))) {
            return;
        }
        C1ACA c1acaZ13 = z1();
        String str = (c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null || (streamUrlStruct = liveRoomStruct.stream_url) == null) ? null : streamUrlStruct.streamLanguage;
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        String appLanguage = iHostAppContext != null ? iHostAppContext.getAppLanguage() : null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(appLanguage)) {
            return;
        }
        if (str != null && str.length() != 0 && appLanguage != null && appLanguage.length() != 0) {
            String strT2 = C786410Ut5.t2(Locale.forLanguageTag(str));
            String strT22 = C786410Ut5.t2(Locale.forLanguageTag(appLanguage));
            if (strT2.length() > 0 && Intrinsics.LJFF(strT2, strT22)) {
                z = true;
            }
        }
        this.LLL.LIZJ(C0IIP.STREAM_TRANSLATION, z);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        LiveRoomStruct liveRoomStruct;
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        c2();
        k2();
        if (LiveRoomBackLiveCardOpt.INSTANCE.enable()) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (!LivePreviewPerfOptSetting.enablePreviewPullStrategyOpt() || this.LLJJJJJIL) {
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(this.LLJJJJ);
        }
        if (C285940BIq.LIZ() && (livePreviewPlayerVMQ1 = Q1()) != null) {
            livePreviewPlayerVMQ1.IQ2();
        }
        C11JF c11jf = this.LLJILLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
        C1ACA c1acaZ1 = z1();
        iHostWatch.clearSessionId((c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id));
        InterfaceC420801kM interfaceC420801kM = this.LLJJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJ = null;
    }

    public final int W1() {
        Aweme aweme;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (aweme = c1acaZ1.LIZ) == null || AwemeSaaSExtKt.isLive(aweme)) {
            return -2;
        }
        Object videoFeatureFromNative = VCFeatureCenterManager.getInstance().getVideoFeatureFromNative(aweme.getAid(), "", 3501);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("predictPrePullStreamTime: ");
        sbLIZ.append(videoFeatureFromNative);
        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (videoFeatureFromNative instanceof Integer) {
            return ((Number) videoFeatureFromNative).intValue();
        }
        return -1;
    }

    public final void b2() {
        Fragment fragment;
        NextLiveData<C582620MtA> nextLiveData;
        C1AD2 c1ad2;
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null && (c1ad2 = feedLiveViewHolderVMP1.LLLI) != null) {
            c1ad2.LIZ = EnumC1488260opc.IDLE;
            c1ad2.LIZIZ = null;
            c1ad2.LIZJ = 0L;
            c1ad2.LJ = 0L;
            c1ad2.LIZLLL = null;
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep == null || (fragment = interfaceC1097170eep.getFragment()) == null) {
            return;
        }
        if (this.LLJI == null && fragment.isAdded()) {
            this.LLJI = (VideoActionViewModel) ViewModelProviders.of(fragment).get(VideoActionViewModel.class);
        }
        VideoActionViewModel videoActionViewModel = this.LLJI;
        if (videoActionViewModel == null || (nextLiveData = videoActionViewModel.LL) == null) {
            return;
        }
        nextLiveData.observe(this, (Observer) this.LLJZIJLIL.getValue());
    }

    public final void c2() {
        h2();
        i2(true);
        if (Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, C755980Tl6.LIZ().LIZ)) {
            C755980Tl6.LIZ().LIZIZ(null);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", "set callback null");
            C755980Tl6.LIZ().LIZ = null;
        }
        C755980Tl6.LIZ().LIZJ = null;
        l2();
    }

    public final boolean f2() {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaZ12 = z1();
        return (c1acaZ12 == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || liveRoomStruct.liveSubOnly != 1 || (c1acaZ1 = z1()) == null || (liveRoomStruct2 = c1acaZ1.LIZJ) == null || liveRoomStruct2.allowPreviewTime != 0) ? false : true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        N1();
        this.dataChannel.zQ2(this);
        c2();
        if (LiveRoomBackLiveCardOpt.INSTANCE.enable()) {
            EventBus.LIZLLL().LJJI(this);
        }
        if (Q1() != null) {
            C481670Iuj c481670Iuj = C481670Iuj.LIZ;
            Map<C13IQ<?>, C0J66<?, ?>> map = C481670Iuj.LIZIZ;
            Object obj = ((LinkedHashMap) map).get(C13LE.LIZ(C486320J5i.class));
            if (obj == null) {
                synchronized (c481670Iuj) {
                    try {
                        Object obj2 = ((LinkedHashMap) map).get(C13LE.LIZ(C486320J5i.class));
                        obj = obj2;
                        if (obj2 == null) {
                            C19719912Dl c19719912DlLIZ = C13LE.LIZ(C486320J5i.class);
                            C0J66<?, ?> c486370J5n = Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486370J5n.class)) ? new C486370J5n() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C0J60.class)) ? new C0J60() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486330J5j.class)) ? new C486330J5j() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486320J5i.class)) ? new C486320J5i() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C486300J5g.class)) ? new C486300J5g() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481940IvA.class)) ? new C481940IvA() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481660Iui.class)) ? new C481660Iui() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C482240Ive.class)) ? new C482240Ive() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(C481640Iug.class)) ? new C481640Iug() : Intrinsics.LJFF(c19719912DlLIZ, C13LE.LIZ(MultiTopLiveRoomMatchScene.class)) ? new MultiTopLiveRoomMatchScene() : null;
                            map.put(C13LE.LIZ(C486320J5i.class), c486370J5n);
                            obj = c486370J5n;
                            if (c486370J5n != null) {
                                C0J65.LL.LJI(c486370J5n);
                                obj = c486370J5n;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            boolean z = obj instanceof C486320J5i;
            Object obj3 = obj;
            if (!z) {
                obj3 = null;
            }
            C0J66 c0j66 = (C0J66) obj3;
            if (c0j66 != null) {
                C486280J5e c486280J5e = new C486280J5e(null);
                c486280J5e.LIZ = C08CX.INSTANCE;
                c0j66.LJIIJ(c486280J5e);
            }
        }
        InterfaceC420801kM interfaceC420801kM = this.LLJJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LLJJ = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (O1()) {
            return;
        }
        super.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r10) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget.LJJIJIIJIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        LivePreviewPlayerVM livePreviewPlayerVMQ1;
        C1ACD c1acd;
        LivePreviewPlayerVM livePreviewPlayerVMQ12;
        C473410IhP.LJ(this.LLJLIL);
        if (!LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable() && (livePreviewPlayerVMQ12 = Q1()) != null) {
            livePreviewPlayerVMQ12.LLJLLIL.LJJJJJ();
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ13 = Q1();
        if (livePreviewPlayerVMQ13 != null && (c1acd = livePreviewPlayerVMQ13.LLJLLIL) != null) {
            c1acd.LJJIIJ(false);
        }
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "deactivateAntiScreenCapture");
        DisplayManager displayManager = this.LLJJJ;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.LLJJL);
        }
        this.LLJJJ = null;
        this.LLL.LIZIZ();
        if (!LivePreviewPerfOptSetting.enablePreviewPullStrategyOpt() || this.LLJJJJJIL) {
            ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).CW(this.LLJJJJ);
        }
        if (C285940BIq.LIZ() && (livePreviewPlayerVMQ1 = Q1()) != null) {
            livePreviewPlayerVMQ1.IQ2();
        }
    }

    public final void S1(boolean z) {
        i2(z);
        h2();
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null) {
            C1AD2 c1ad2 = feedLiveViewHolderVMP1.LLLI;
            if (c1ad2.LIZ == EnumC1488260opc.IDLE) {
                c1ad2.LIZ = EnumC1488260opc.PAUSE;
            }
            if (feedLiveViewHolderVMP1.LLLFF == C1ACS.PLAYING) {
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = Q1();
                if (livePreviewPlayerVMQ1 != null) {
                    livePreviewPlayerVMQ1.yQ2("handlePrePullPause", true);
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                feedLiveViewHolderVMP1.LLLIIII = jUptimeMillis;
                feedLiveViewHolderVMP1.LLLI.LIZJ += jUptimeMillis - feedLiveViewHolderVMP1.LLLII;
                feedLiveViewHolderVMP1.LLLFF = C1ACS.INTERRUPT_STOP;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x065f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V1(X.EnumC2175041AAk r29) {
        /*
            Method dump skipped, instruction units count: 1883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget.V1(X.1AAk):void");
    }

    public final void X1(boolean z) throws JSONException {
        long j;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1ACA c1acaZ1;
        int iOptInt;
        C1ACA c1acaZ12;
        int iOptInt2;
        LiveRoomStruct liveRoomStruct;
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        LiveRoomStruct liveRoomStruct2;
        StreamUrlStruct streamUrlStruct2;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.PullData pullData2;
        LiveRoomStruct liveRoomStruct3;
        StreamUrlStruct streamUrlStruct3;
        LiveCoreSDKData liveCoreSDKData3;
        LiveCoreSDKData.PullData pullData3;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct4;
        P1();
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.uptimeMillis();
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null) {
            feedLiveViewHolderVMP1.LLLFFI = c238400w2.element;
        }
        C1ACA c1acaZ13 = z1();
        boolean z2 = true;
        if (c1acaZ13 != null) {
            c1acaZ13.LJLLI = 1;
        }
        C1AC7 c1ac7 = C1AC7.LIZ;
        Pair[] pairArr = new Pair[5];
        C1ACA c1acaZ14 = z1();
        if (c1acaZ14 != null && (liveRoomStruct4 = c1acaZ14.LIZJ) != null) {
            j = liveRoomStruct4.id;
        } else {
            j = 0;
        }
        pairArr[0] = new Pair("roomId", Long.valueOf(j));
        pairArr[1] = new Pair("isNewModel", Boolean.valueOf(z));
        C1ACA c1acaZ15 = z1();
        JSONObject jSONObject = null;
        if (c1acaZ15 != null && (aweme = c1acaZ15.LIZ) != null) {
            boolValueOf = Boolean.valueOf(AwemeSaaSExtKt.isLive(aweme));
        } else {
            boolValueOf = null;
        }
        pairArr[2] = new Pair("previousLive", boolValueOf);
        C1ACA c1acaZ16 = z1();
        if (c1acaZ16 != null) {
            boolValueOf2 = Boolean.valueOf(TextUtils.equals(c1acaZ16.LIZLLL, "homepage_live"));
        } else {
            boolValueOf2 = null;
        }
        pairArr[3] = new Pair("fromLiveTab", boolValueOf2);
        C1ACA c1acaZ17 = z1();
        if (c1acaZ17 == null || (liveRoomStruct3 = c1acaZ17.LIZJ) == null || (streamUrlStruct3 = liveRoomStruct3.stream_url) == null || (liveCoreSDKData3 = streamUrlStruct3.liveCoreSDKData) == null || (pullData3 = liveCoreSDKData3.getPullData()) == null || pullData3.getStreamData() == null) {
            z2 = false;
        }
        pairArr[4] = new Pair("streamDataReady", Boolean.valueOf(z2));
        c1ac7.getClass();
        C1AC7.LJIILL("preview_pull_strategy_start", pairArr);
        C1ACA c1acaZ18 = z1();
        if ((c1acaZ18 == null || (liveRoomStruct2 = c1acaZ18.LIZJ) == null || (streamUrlStruct2 = liveRoomStruct2.stream_url) == null || (liveCoreSDKData2 = streamUrlStruct2.liveCoreSDKData) == null || (pullData2 = liveCoreSDKData2.getPullData()) == null || pullData2.getStreamData() == null) && (c1acaZ1 = z1()) != null) {
            c1acaZ1.LJLLI = 2;
        }
        C1ACA c1acaZ19 = z1();
        if (c1acaZ19 != null && (liveRoomStruct = c1acaZ19.LIZJ) != null && (streamUrlStruct = liveRoomStruct.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
            StrategyCenter.getInstance().setStringValue(12001, streamData);
            String stringValue = StrategyCenter.getInstance().getStringValue(12000, "");
            if (!TextUtils.isEmpty(stringValue)) {
                try {
                    jSONObject = new JSONObject(stringValue);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                jSONObject = new JSONObject();
                jSONObject.put("main", 0);
            }
        }
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = SystemClock.uptimeMillis();
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("main", -1);
        } else {
            iOptInt = -1;
        }
        C1ACA c1acaZ110 = z1();
        if (c1acaZ110 != null) {
            if (jSONObject != null) {
                iOptInt2 = jSONObject.optInt("code", -1);
            } else {
                iOptInt2 = -1;
            }
            c1acaZ110.LJLJJL = iOptInt2;
        }
        long j2 = c238400w22.element - c238400w2.element;
        if (iOptInt == -1 && (c1acaZ12 = z1()) != null) {
            c1acaZ12.LJLJJLL = "no_run_p95_strategy";
        }
        String value = LiveParallelStreamCDNStrategyKey.INSTANCE.getValue();
        IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
        C1306400k6I c1306400k6I = new C1306400k6I(value);
        c1306400k6I.LIZ(Integer.valueOf(iOptInt), "pricing_method_p95");
        iStarShipStrategy.runStrategy(c1306400k6I, new C1AD5(c238400w22, this, iOptInt, c238400w2, z, j2));
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [X.0pSn] */
    public final void a2(final PullSceneConfig pullSceneConfig) {
        long pullDelay;
        long pullTime;
        PullConfig pullConfigLIZ;
        Number numberValueOf;
        long j;
        PullConfig pullConfigLIZ2;
        C1ACA c1acaZ1;
        Aweme aweme;
        String string;
        String str;
        BetaGammaEatConfig betaGammaEatConfig = null;
        Aweme aweme2 = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        betaGammaEatConfig = null;
        if (pullSceneConfig.getIntelligent() == 1) {
            b2();
            FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
            if (feedLiveViewHolderVMP1 != null) {
                feedLiveViewHolderVMP1.LLLFF = C1ACS.CLIENT_INTELLIGENCE;
            }
            C01GW c01gw = C2175781ADg.LIZIZ;
            long j2 = ((PullStreamSyncConfig) c01gw.getValue()).delayTime;
            long j3 = ((PullStreamSyncConfig) c01gw.getValue()).streamKeepTime;
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null) {
                aweme2 = c1acaZ12.LIZ;
            }
            if (pullSceneConfig.getPullDelay() == 0) {
                pullSceneConfig.setPullDelay(j2);
            }
            if (pullSceneConfig.getPullTime() == 0) {
                pullSceneConfig.setPullTime(j3);
            }
            C01GW c01gw2 = C1511750pRV.LIZIZ;
            AbstractC1511510pR7 abstractC1511510pR7 = (AbstractC1511510pR7) c01gw2.getValue();
            if (abstractC1511510pR7 != null && abstractC1511510pR7.enable() && aweme2 != null) {
                C0N33 c0n33 = new C0N33();
                c0n33.LJIIJ = aweme2;
                final long jUptimeMillis = SystemClock.uptimeMillis();
                final ?? r5 = new InterfaceC1512530pSl() { // from class: X.0pSn
                    @Override // X.InterfaceC1512530pSl
                    public final void LIZ(C1512540pSm c1512540pSm, long j4) {
                        Long lValueOf;
                        if (c1512540pSm != null) {
                            LivePreviewPlayerWidget livePreviewPlayerWidget = this.LIZ;
                            long jMax = Math.max(c1512540pSm.LIZIZ - j4, 0L);
                            if (C1511750pRV.LIZ().async) {
                                C0CNO.LIZLLL(0L, new AwS44S0200100_23(livePreviewPlayerWidget, c1512540pSm, jMax, 0));
                            } else {
                                LivePreviewPlayerWidget.g2(livePreviewPlayerWidget, c1512540pSm.LIZ, jMax, c1512540pSm.LIZJ);
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SmartLivePreviewManager: async: true, duration:");
                        sbLIZ.append(j4);
                        sbLIZ.append(", delay:");
                        Long lValueOf2 = null;
                        if (c1512540pSm != null) {
                            lValueOf = Long.valueOf(c1512540pSm.LIZIZ);
                        } else {
                            lValueOf = null;
                        }
                        sbLIZ.append(lValueOf);
                        sbLIZ.append(", keep:");
                        if (c1512540pSm != null) {
                            lValueOf2 = Long.valueOf(c1512540pSm.LIZJ);
                        }
                        sbLIZ.append(lValueOf2);
                        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
                AbstractC1511510pR7 abstractC1511510pR72 = (AbstractC1511510pR7) c01gw2.getValue();
                if (abstractC1511510pR72 != null) {
                    abstractC1511510pR72.runAsync(c0n33, new InterfaceC1511740pRU() { // from class: X.0pSk
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[PHI: r2
                          0x0025: PHI (r2v8 java.lang.String) = (r2v2 java.lang.String), (r2v9 java.lang.String) binds: [B:14:0x0023, B:12:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[PHI: r2
                          0x00e0: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v8 java.lang.String) binds: [B:14:0x0023, B:16:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // X.InterfaceC1511740pRU
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(X.C1512100pS4 r13) {
                            /*
                                Method dump skipped, instruction units count: 298
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1512520pSk.LIZ(X.0pS4):void");
                        }
                    });
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Default PrePull Stream: delay:");
            sbLIZ.append(j2);
            sbLIZ.append(", keep:");
            sbLIZ.append(j3);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
            g2(this, EnumC993870byD.FAST_FIXED, pullSceneConfig.getPullDelay(), pullSceneConfig.getPullTime());
            return;
        }
        if (pullSceneConfig.getPullDelay() > 0) {
            pullDelay = pullSceneConfig.getPullDelay();
        } else {
            pullDelay = ((PullStreamSyncConfig) C2175781ADg.LIZIZ.getValue()).delayTime;
        }
        if (pullSceneConfig.getPullTime() > 0) {
            pullTime = pullSceneConfig.getPullTime();
        } else {
            pullTime = ((PullStreamSyncConfig) C2175781ADg.LIZIZ.getValue()).streamKeepTime;
        }
        b2();
        if (((StrategyConfig) C1ADN.LIZIZ.getValue()).enable && (c1acaZ1 = z1()) != null && (aweme = c1acaZ1.LIZ) != null && !AwemeSaaSExtKt.isLive(aweme)) {
            Object videoFeatureFromNative = VCFeatureCenterManager.getInstance().getVideoFeatureFromNative(aweme.getAid(), "", 3503);
            if ((videoFeatureFromNative instanceof String) && (str = (String) videoFeatureFromNative) != null) {
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (C123100dR.LIZ(str)) {
                        sb.append(cCharAt);
                    }
                }
                string = sb.toString();
            } else {
                string = null;
            }
            try {
                BetaGammaEatConfig betaGammaEatConfig2 = (BetaGammaEatConfig) C19748512Ol.LIZJ.LJII(string, BetaGammaEatConfig.class);
                if (betaGammaEatConfig2.beta > 0.0d && betaGammaEatConfig2.gamma > 0.0d) {
                    if (betaGammaEatConfig2.eta > 0.0d) {
                        betaGammaEatConfig = betaGammaEatConfig2;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (betaGammaEatConfig != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calculateWithNewStrategy: betaData=");
            sbLIZ2.append(betaGammaEatConfig);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ2));
            double d = betaGammaEatConfig.beta;
            if (d >= 1.0d) {
                numberValueOf = Integer.valueOf(((StrategyConfig) C1ADN.LIZIZ.getValue()).maxPullTime);
            } else {
                double d2 = ((StrategyConfig) C1ADN.LIZIZ.getValue()).threshold;
                double d3 = betaGammaEatConfig.eta;
                numberValueOf = Double.valueOf(C13LZ.LIZJ(betaGammaEatConfig.gamma + (d3 * Math.pow(d / (d2 * d3), 1.0d / (1.0d - d))), ((StrategyConfig) r14.getValue()).minPullTime, ((StrategyConfig) r14.getValue()).maxPullTime));
            }
            int iW1 = W1();
            if (iW1 >= 0 && (pullConfigLIZ2 = C1869240yk6.LIZ(iW1)) != null) {
                j = pullConfigLIZ2.delayTime;
                C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", "calculateWithNewStrategy: live predict pullDelay=" + pullDelay);
            } else {
                j = pullDelay;
            }
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", "calculateWithNewStrategy:  pullDelay=" + pullDelay + " , predictPullTime=" + numberValueOf);
            Pair pair = new Pair(Long.valueOf(j), Long.valueOf(numberValueOf.longValue()));
            long jLongValue = ((Number) pair.getFirst()).longValue();
            long jLongValue2 = ((Number) pair.getSecond()).longValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("pullWithSmartManager: pullDelay=");
            sbLIZ3.append(jLongValue);
            sbLIZ3.append(", pullTime=");
            sbLIZ3.append(jLongValue2);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ3));
            g2(this, EnumC993870byD.FAST_FIXED, jLongValue, jLongValue2);
            return;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Config config = C1869240yk6.LIZ;
        Config config2 = (Config) c0c64LJIILLIIL.LJJII(Config.class, config, "live_predict_pre_pull_time_exp", true);
        if (config2 != null) {
            config = config2;
        }
        if (config.enableFirstPull) {
            int iW12 = W1();
            if (iW12 >= 0 && (pullConfigLIZ = C1869240yk6.LIZ(iW12)) != null) {
                pullDelay = pullConfigLIZ.delayTime;
                pullTime = pullConfigLIZ.pullTime;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("pullWithSmartManager: live predict pullDelay=");
                sbLIZ4.append(pullDelay);
                sbLIZ4.append(", pullTime=");
                sbLIZ4.append(pullTime);
                C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ4));
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("pullWithSmartManager: pullDelay=");
            sbLIZ5.append(pullDelay);
            sbLIZ5.append(", pullTime=");
            sbLIZ5.append(pullTime);
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ5));
            g2(this, EnumC993870byD.FAST_FIXED, pullDelay, pullTime);
            return;
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("pullWithSmartManager: pullDelay=");
        sbLIZ6.append(pullDelay);
        sbLIZ6.append(", pullTime=");
        sbLIZ6.append(pullTime);
        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ6));
        g2(this, EnumC993870byD.FAST_FIXED, pullDelay, pullTime);
    }

    public final void e2(PullSceneConfig pullSceneConfig) {
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId;
        int iIntValue;
        if (pullSceneConfig.getEnable() == 1) {
            FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
            if (feedLiveViewHolderVMP1 != null) {
                feedLiveViewHolderVMP1.LLLFF = C1ACS.STRATEGY_SUCCESS;
            }
            if (pullSceneConfig.getLevelNum() >= 10) {
                a2(pullSceneConfig);
                return;
            }
            if (pullSceneConfig.getLevelNum() <= 0 || (strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()) == null) {
                return;
            }
            Integer numLIZ = C1244080iTm.LIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.charAt(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId.length() - 1));
            if (numLIZ != null) {
                iIntValue = numLIZ.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue <= pullSceneConfig.getLevelNum()) {
                return;
            }
            a2(pullSceneConfig);
        }
    }

    public final void i2(boolean z) {
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", "stopPlayLiveTimer");
            C11JF c11jf2 = this.LLJILJILJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
        }
        this.LLJILJILJ = null;
        this.LLJIJIL = null;
        if (z) {
            N1();
        }
        k2();
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null) {
            feedLiveViewHolderVMP1.LLLFZ = false;
        }
    }

    public final void j2(boolean z) {
        Fragment fragment;
        C1ACA c1acaZ1;
        boolean z2;
        String str;
        LiveRoomStruct liveRoomStruct;
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (c1acaZ1 = z1()) != null && c1acaZ1.LJIIIIZZ == 0) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null && liveRoomStruct.isTopGifter) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                List<String> list = C0C21.LIZ;
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 == null || (str = c1acaZ13.LIZLLL) == null || str.length() == 0 || !((List) C0C21.LIZIZ.getValue()).contains(str)) {
                    return;
                }
            }
            if (z) {
                this.LLJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C0J7H(fragment, null), 3);
                return;
            }
            C0J89 c0j89 = C0J89.LIZ;
            int iHashCode = fragment.hashCode();
            c0j89.getClass();
            Set<Integer> set = C0J89.LJIIJJI;
            if (set.contains(Integer.valueOf(iHashCode))) {
                return;
            }
            set.add(Integer.valueOf(iHashCode));
            AnonymousClass0956 anonymousClass0956 = this.LLJJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LifecycleOwnerExtensionsKt.LIZIZ(this, 1000L, new ARunnableS107S0100000_7(fragment, 114));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<EnumC765980U2y> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        MutableLiveData<Pair<EnumC1913550ztZ, Object>> mutableLiveData3;
        MutableLiveData<Unit> mutableLiveData4;
        com.bytedance.ies.sdk.datachannel.NextLiveData<Boolean> nextLiveData;
        com.bytedance.ies.sdk.datachannel.NextLiveData<Integer> nextLiveData2;
        MutableLiveData<Unit> mutableLiveData5;
        com.bytedance.ies.sdk.datachannel.NextLiveData<Boolean> nextLiveData3;
        MutableLiveData<C2174311A7p> mutableLiveData6;
        MutableLiveData<Boolean> mutableLiveData7;
        MutableLiveData<C473250Ih9> mutableLiveData8;
        MutableLiveData<Unit> mutableLiveData9;
        super.onLoad(objArr);
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = Q1();
        if (livePreviewPlayerVMQ1 != null && (mutableLiveData9 = livePreviewPlayerVMQ1.LLILZ) != null) {
            mutableLiveData9.observe(this, new AObserverS235S0100000_33(this, 30));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ12 = Q1();
        if (livePreviewPlayerVMQ12 != null && (mutableLiveData8 = livePreviewPlayerVMQ12.LLILLJJLI) != null) {
            mutableLiveData8.observe(this, new AObserverS235S0100000_33(this, 31));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ13 = Q1();
        if (livePreviewPlayerVMQ13 != null && (mutableLiveData7 = livePreviewPlayerVMQ13.LLJ) != null) {
            mutableLiveData7.observe(this, new AObserverS235S0100000_33(this, 32));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ14 = Q1();
        if (livePreviewPlayerVMQ14 != null && (mutableLiveData6 = livePreviewPlayerVMQ14.LLJJ) != null) {
            mutableLiveData6.observe(this, new AObserverS235S0100000_33(this, 33));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null && (nextLiveData3 = feedLiveViewHolderVMP1.LLJJJIL) != null) {
            nextLiveData3.observe(this, new AObserverS235S0100000_33(this, 34));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ15 = Q1();
        if (livePreviewPlayerVMQ15 != null && (mutableLiveData5 = livePreviewPlayerVMQ15.LLIZ) != null) {
            mutableLiveData5.observe(this, new AObserverS235S0100000_33(this, 35));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP12 = P1();
        if (feedLiveViewHolderVMP12 != null && (nextLiveData2 = feedLiveViewHolderVMP12.LLJJJJJIL) != null) {
            nextLiveData2.observe(this, new AObserverS235S0100000_33(this, 36));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP13 = P1();
        if (feedLiveViewHolderVMP13 != null && (nextLiveData = feedLiveViewHolderVMP13.LLJJL) != null) {
            nextLiveData.observe(this, new AwS612S0100000_33(this, 64), true);
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LLJJIJIIJIL.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData4 = maskLayerAndWarningVM.LLILZLL) != null) {
            mutableLiveData4.observe(this, new AObserverS235S0100000_33(this, 37));
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ16 = Q1();
        if (livePreviewPlayerVMQ16 != null && (mutableLiveData3 = livePreviewPlayerVMQ16.LL) != null) {
            mutableLiveData3.observe(this, new AObserverS235S0100000_33(this, 27));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJJIJIL.getValue();
        if (livePreviewHighlightsPlayerVM != null && (mutableLiveData2 = livePreviewHighlightsPlayerVM.LLILZ) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 28));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM2 = (LivePreviewHighlightsPlayerVM) this.LLJJIJIL.getValue();
        if (livePreviewHighlightsPlayerVM2 != null && (mutableLiveData = livePreviewHighlightsPlayerVM2.LLILLL) != null) {
            mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 29));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSmoothExitEvent(C08LW c08lw) {
        Long l;
        C1ACA c1acaZ1;
        C1ACA c1acaZ12;
        LiveRoomStruct liveRoomStruct;
        if (c08lw != null && (l = c08lw.LIZ) != null) {
            long jLongValue = l.longValue();
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && c1acaZ13.LLFFF && (c1acaZ1 = z1()) != null && c1acaZ1.LJII && c08lw.LIZIZ && ((c1acaZ12 = z1()) == null || (liveRoomStruct = c1acaZ12.LIZJ) == null || liveRoomStruct.id != jLongValue)) {
                V1(EnumC2175041AAk.EXIT_PULL_OPT);
            }
        }
        LivePreviewPlayerVM livePreviewPlayerVMQ1 = Q1();
        if (livePreviewPlayerVMQ1 != null) {
            livePreviewPlayerVMQ1.LLJLLIL.LJII();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M1(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget.M1(int, int):void");
    }

    public final void T1(C582650MtD c582650MtD, String str) {
        String aid;
        C11JF c11jf;
        C1ADJ c1adj;
        long j;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreVideoStateEvent: ");
        sbLIZ.append(c582650MtD);
        C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (z1() != null) {
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null && c1acaZ1.LJII) {
                return;
            }
            C1ACA c1acaZ12 = z1();
            C1ACS c1acs = null;
            if (c1acaZ12 != null && (aweme = c1acaZ12.LIZ) != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (!Intrinsics.LJFF(aid, c582650MtD.LIZ) || c582650MtD.LIZIZ <= 0) {
                return;
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
            if (feedLiveViewHolderVMP1 != null) {
                c1acs = feedLiveViewHolderVMP1.LLLFF;
            }
            if (c1acs != C1ACS.SCHEDULING || (c11jf = this.LLJILJILJ) == null || c11jf.isDisposed() || (c1adj = this.LLJIJIL) == null) {
                return;
            }
            EnumC993870byD enumC993870byD = c1adj.LIZ;
            if (enumC993870byD != EnumC993870byD.FAST_PREDICT && enumC993870byD != EnumC993870byD.FAST_FIXED) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - c1adj.LIZLLL;
            if (C583980MvM.LIZJ().keepTimeType == 1 && jCurrentTimeMillis > 0 && jCurrentTimeMillis < c1adj.LIZJ) {
                j = c1adj.LIZIZ + jCurrentTimeMillis;
            } else {
                j = c1adj.LIZIZ;
            }
            if (((c582650MtD instanceof C582630MtB) && j > ((C582630MtB) c582650MtD).LIZJ) || c1adj.LIZIZ <= 0) {
                return;
            }
            i2(false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onStartPreStream: event=");
            sbLIZ2.append(c582650MtD);
            sbLIZ2.append(", expired=");
            sbLIZ2.append(jCurrentTimeMillis);
            sbLIZ2.append(", realKeepTime=");
            sbLIZ2.append(j);
            C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ2));
            U1(j, str);
        }
    }

    public final void U1(final long j, final String str) {
        C1ACS c1acs;
        long j2;
        C1AD2 c1ad2;
        LiveRoomStruct liveRoomStruct;
        C1AD2 c1ad22;
        long j3;
        long j4;
        C1AD2 c1ad23;
        long j5;
        LiveRoomStruct liveRoomStruct2;
        Long lValueOf = null;
        this.LLJIJIL = null;
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null) {
            c1acs = feedLiveViewHolderVMP1.LLLFF;
        } else {
            c1acs = null;
        }
        C1ACS c1acs2 = C1ACS.PLAYING;
        if (c1acs == c1acs2) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            Pair[] pairArr = new Pair[3];
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null) {
                j5 = liveRoomStruct2.id;
            } else {
                j5 = 0;
            }
            pairArr[0] = new Pair("roomId", Long.valueOf(j5));
            pairArr[1] = new Pair("reason", "already_playing");
            pairArr[2] = new Pair("triggerScene", str);
            c1ac7.getClass();
            C1AC7.LJIILL("preview_pull_skip", pairArr);
            return;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP12 = P1();
        if (feedLiveViewHolderVMP12 != null) {
            feedLiveViewHolderVMP12.LLLFF = c1acs2;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP13 = P1();
        if (feedLiveViewHolderVMP13 != null) {
            feedLiveViewHolderVMP13.LLLII = SystemClock.uptimeMillis();
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP14 = P1();
        if (feedLiveViewHolderVMP14 != null && (c1ad23 = feedLiveViewHolderVMP14.LLLI) != null) {
            c1ad23.LIZLLL = str;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP15 = P1();
        if (feedLiveViewHolderVMP15 != null && (c1ad22 = feedLiveViewHolderVMP15.LLLI) != null) {
            FeedLiveViewHolderVM feedLiveViewHolderVMP16 = P1();
            if (feedLiveViewHolderVMP16 != null) {
                j3 = feedLiveViewHolderVMP16.LLLII;
            } else {
                j3 = 0;
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMP17 = P1();
            if (feedLiveViewHolderVMP17 != null) {
                j4 = feedLiveViewHolderVMP17.LLLFFI;
            } else {
                j4 = 0;
            }
            c1ad22.LJ = j3 - j4;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartPreStream: pullTime=");
        sbLIZ.append(j);
        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        C1AC7 c1ac72 = C1AC7.LIZ;
        Pair[] pairArr2 = new Pair[4];
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null && (liveRoomStruct = c1acaZ12.LIZJ) != null) {
            j2 = liveRoomStruct.id;
        } else {
            j2 = 0;
        }
        pairArr2[0] = new Pair("roomId", Long.valueOf(j2));
        pairArr2[1] = new Pair("triggerScene", str);
        pairArr2[2] = new Pair("keepTime", Long.valueOf(j));
        FeedLiveViewHolderVM feedLiveViewHolderVMP18 = P1();
        if (feedLiveViewHolderVMP18 != null && (c1ad2 = feedLiveViewHolderVMP18.LLLI) != null) {
            lValueOf = Long.valueOf(c1ad2.LJ);
        }
        pairArr2[3] = new Pair("realStartInterval", lValueOf);
        c1ac72.getClass();
        C1AC7.LJIILL("preview_pull_start", pairArr2);
        V1(EnumC2175041AAk.PRE_PULL);
        h2();
        this.LLJILJIL = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.1ACI
            @Override // X.C09JN
            public final void accept(Object obj) {
                long j6;
                Long lValueOf2;
                LiveRoomStruct liveRoomStruct3;
                C1C7U.LIZ("LivePreviewPlayerWidget@e362.onStartPreStream$1");
                C755980Tl6.LIZ().LIZJ = null;
                this.LL.l2();
                if (C285940BIq.LIZ()) {
                    LivePreviewPlayerVM livePreviewPlayerVMQ1 = this.LL.Q1();
                    if (livePreviewPlayerVMQ1 != null) {
                        livePreviewPlayerVMQ1.IQ2();
                    }
                } else if (LivePausePrePullStreamExp.INSTANCE.isEnable()) {
                    LivePreviewPlayerVM livePreviewPlayerVMQ12 = this.LL.Q1();
                    if (livePreviewPlayerVMQ12 != null) {
                        livePreviewPlayerVMQ12.LLJLLIL.LJJJIL();
                        livePreviewPlayerVMQ12.LLJJIII = false;
                    }
                } else {
                    LivePreviewPlayerVM livePreviewPlayerVMQ13 = this.LL.Q1();
                    if (livePreviewPlayerVMQ13 != null) {
                        livePreviewPlayerVMQ13.LLJLLIL.LJJJJIZL();
                        livePreviewPlayerVMQ13.LLJJIII = false;
                    }
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ14 = this.LL.Q1();
                if (livePreviewPlayerVMQ14 != null) {
                    livePreviewPlayerVMQ14.DQ2();
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP19 = this.LL.P1();
                if (feedLiveViewHolderVMP19 != null) {
                    feedLiveViewHolderVMP19.LLLFF = C1ACS.STOP;
                }
                FeedLiveViewHolderVM feedLiveViewHolderVMP110 = this.LL.P1();
                if (feedLiveViewHolderVMP110 != null) {
                    feedLiveViewHolderVMP110.LLLIIII = SystemClock.uptimeMillis();
                }
                C1AC7 c1ac73 = C1AC7.LIZ;
                Pair[] pairArr3 = new Pair[4];
                C1ACA c1acaZ13 = this.LL.z1();
                if (c1acaZ13 != null && (liveRoomStruct3 = c1acaZ13.LIZJ) != null) {
                    j6 = liveRoomStruct3.id;
                } else {
                    j6 = 0;
                }
                pairArr3[0] = new Pair("roomId", Long.valueOf(j6));
                pairArr3[1] = new Pair("triggerScene", str);
                pairArr3[2] = new Pair("keepTime", Long.valueOf(j));
                FeedLiveViewHolderVM feedLiveViewHolderVMP111 = this.LL.P1();
                if (feedLiveViewHolderVMP111 != null) {
                    lValueOf2 = Long.valueOf(feedLiveViewHolderVMP111.LLLIIII);
                } else {
                    lValueOf2 = null;
                }
                pairArr3[3] = new Pair("stopTs", lValueOf2);
                c1ac73.getClass();
                C1AC7.LJIILL("preview_pull_stop", pairArr3);
                this.LL.h2();
                C1ACA c1acaZ14 = this.LL.z1();
                if (c1acaZ14 != null) {
                    c1acaZ14.LJJLIIIJ = null;
                }
                C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.onStartPreStream$1");
            }
        }, new C09JN() { // from class: X.0opd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewPlayerWidget@e362.onStartPreStream$2");
                C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.onStartPreStream$2");
            }
        });
    }

    public final void Y1(PullSceneConfig pullSceneConfig, String str) {
        boolean z;
        int iP95StrategyFailOpt;
        LiveRoomStruct liveRoomStruct;
        StreamUrlStruct streamUrlStruct;
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.PullData pullData;
        String streamData;
        P1();
        long jUptimeMillis = SystemClock.uptimeMillis();
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = P1();
        if (feedLiveViewHolderVMP1 != null) {
            feedLiveViewHolderVMP1.LLLFFI = jUptimeMillis;
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = -1;
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = SystemClock.uptimeMillis();
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && (streamUrlStruct = liveRoomStruct.stream_url) != null && (liveCoreSDKData = streamUrlStruct.liveCoreSDKData) != null && (pullData = liveCoreSDKData.getPullData()) != null && (streamData = pullData.getStreamData()) != null) {
            StrategyCenter.getInstance().setStringValue(12001, streamData);
            String stringValue = StrategyCenter.getInstance().getStringValue(12000, "");
            if (!TextUtils.isEmpty(stringValue)) {
                try {
                    JSONObject jSONObject = new JSONObject(stringValue);
                    c118300cf.element = jSONObject.optInt("main", -1);
                    C1ACA c1acaZ12 = z1();
                    if (c1acaZ12 != null) {
                        c1acaZ12.LJLJJL = jSONObject.optInt("code", -1);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                c118300cf.element = 0;
                C1ACA c1acaZ13 = z1();
                if (c1acaZ13 != null) {
                    c1acaZ13.LJLJJL = -1;
                }
            }
        }
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        c238400w22.element = jUptimeMillis2;
        c238400w2.element = jUptimeMillis2 - jUptimeMillis;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("duration+ ");
        sbLIZ.append(c238400w2.element);
        sbLIZ.append(" isP95: ");
        sbLIZ.append(c118300cf.element);
        C827750WdZ.LIZ("ttlive_preview_LivePreviewPlayerWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (c118300cf.element == -1 && LiveParallelPullCostOpt.INSTANCE.p95StrategyFailOpt() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (c118300cf.element == -1 && !z) {
            C1ACA c1acaZ14 = z1();
            if (c1acaZ14 != null) {
                c1acaZ14.LJLJJLL = "no_run_p95_strategy";
            }
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaZ15 = z1();
            EnumC1488280ope enumC1488280ope = EnumC1488280ope.ERR_STREAM_STRATEGY;
            long j = c238400w2.element;
            int i = c118300cf.element;
            c1ac7.getClass();
            C1AC7.LJII(c1acaZ15, enumC1488280ope, j, -1L, i, -1, null);
            P1();
            return;
        }
        String value = LiveParallelStreamCDNStrategyKey.INSTANCE.getValue();
        if (z) {
            iP95StrategyFailOpt = LiveParallelPullCostOpt.INSTANCE.p95StrategyFailOpt();
        } else {
            iP95StrategyFailOpt = c118300cf.element;
        }
        IStarShipStrategy iStarShipStrategy = C326690CrL.LIZ;
        C1306400k6I c1306400k6I = new C1306400k6I(value);
        c1306400k6I.LIZ(Integer.valueOf(iP95StrategyFailOpt), "pricing_method_p95");
        iStarShipStrategy.runStrategy(c1306400k6I, new C1ACH(c238400w22, this, c238400w2, c118300cf, iP95StrategyFailOpt, str, pullSceneConfig));
    }

    public final void d2(int i, int i2) {
        FrameLayout.LayoutParams layoutParams;
        int iLIZJ;
        String str;
        String str2;
        Object objValueOf;
        String str3;
        String str4;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        LiveRoomStruct liveRoomStruct3;
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams2 = R1().getLayoutParams();
        LiveMode liveMode = null;
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            int i3 = C1389340mG4.LIZJ(this.context, null).LIZJ;
            layoutParams.height = i3;
            int width = R1().getWidth();
            Map<String, Object> map = C1338270kvh.LIZ;
            if (i3 > 0 && width > 0) {
                int i4 = 0;
                if (C0COV.LIZIZ) {
                    boolean z = C14LC.LJIIIZ;
                    C309690CBz.LIZ.getClass();
                    iLIZJ = C497820Jfg.LIZJ(this.context);
                } else {
                    iLIZJ = 0;
                }
                float f = i2;
                float f2 = i;
                int i5 = (int) ((width / f) * f2);
                if (GameLiveOptSmoothEnterRoomSetting.INSTANCE.isOptPortrait()) {
                    i4 = iLIZJ;
                }
                int i6 = LLLF;
                if (i5 + i6 + i4 <= i3) {
                    layoutParams.topMargin = i6 + iLIZJ;
                    layoutParams.width = width;
                    layoutParams.height = i5;
                    layoutParams.gravity = 1;
                    str = "bottom";
                } else if (i4 + i5 <= i3) {
                    layoutParams.topMargin = ((i3 - i5) / 2) + iLIZJ;
                    layoutParams.width = width;
                    layoutParams.height = i5;
                    layoutParams.gravity = 1;
                    str = "middle";
                } else {
                    layoutParams.topMargin = iLIZJ;
                    layoutParams.width = (int) ((i3 / f2) * f);
                    layoutParams.height = i3;
                    layoutParams.gravity = 1;
                    str = "top";
                }
                C786410Ut5.a6(R1(), layoutParams);
                try {
                    C1ACA c1acaZ1 = z1();
                    if (c1acaZ1 != null && (liveRoomStruct3 = c1acaZ1.LIZJ) != null && (numValueOf = Integer.valueOf(liveRoomStruct3.liveRoomMode)) != null) {
                        if (numValueOf.intValue() == 0) {
                            liveMode = LiveMode.VIDEO;
                        } else if (numValueOf.intValue() == 1) {
                            liveMode = LiveMode.THIRD_PARTY;
                        } else if (numValueOf.intValue() == 4) {
                            liveMode = LiveMode.SCREEN_RECORD;
                        } else if (numValueOf.intValue() == 6) {
                            liveMode = LiveMode.LIVE_STUDIO;
                        }
                    }
                    float f3 = 9;
                    int i7 = (int) ((f / f2) * f3);
                    int i8 = (int) ((r3.LIZIZ / r3.LIZJ) * f3);
                    C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_portrait_room_live_play_size", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                    c474500IjALIZIZ.LJJII(str, "show_type");
                    c474500IjALIZIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUser().getId()), "user_id");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i7);
                    sbLIZ.append(":9");
                    c474500IjALIZIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "live_size");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i8);
                    sbLIZ2.append(":9");
                    c474500IjALIZIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ2), "mobile_size");
                    String str5 = "";
                    if (liveMode == null || (str2 = liveMode.logStreamingType) == null) {
                        str2 = "";
                    }
                    c474500IjALIZIZ.LJJII(str2, "live_type");
                    C1ACA c1acaZ12 = z1();
                    if (c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) {
                        objValueOf = "";
                    } else {
                        objValueOf = Long.valueOf(liveRoomStruct2.ownerUserId);
                    }
                    c474500IjALIZIZ.LJJII(objValueOf, "anchor_id");
                    C1ACA c1acaZ13 = z1();
                    if (c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null || (str3 = liveRoomStruct.idStr) == null) {
                        str3 = "";
                    }
                    c474500IjALIZIZ.LJJII(str3, "room_id");
                    c474500IjALIZIZ.LJJII("portrait", "room_orientation");
                    c474500IjALIZIZ.LJJII("preview_live_card", "enter_method");
                    C1ACA c1acaZ14 = z1();
                    if (c1acaZ14 != null && (str4 = c1acaZ14.LJ) != null) {
                        str5 = str4;
                    }
                    c474500IjALIZIZ.LJJII(str5, "enter_from_merge");
                    c474500IjALIZIZ.LJJII("preview", "action_type");
                    c474500IjALIZIZ.LIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                LivePreviewPlayerVM livePreviewPlayerVMQ1 = Q1();
                if (livePreviewPlayerVMQ1 != null) {
                    livePreviewPlayerVMQ1.HQ2(1);
                }
            }
        }
    }

    public static void g2(final LivePreviewPlayerWidget livePreviewPlayerWidget, EnumC993870byD enumC993870byD, long j, long j2) {
        boolean z;
        long j3;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        FeedLiveViewHolderVM feedLiveViewHolderVMP1 = livePreviewPlayerWidget.P1();
        if (feedLiveViewHolderVMP1 != null && feedLiveViewHolderVMP1.LLLFZ) {
            z = true;
        } else {
            z = false;
        }
        long j4 = 0;
        if (!z) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            Pair[] pairArr = new Pair[2];
            C1ACA c1acaZ1 = livePreviewPlayerWidget.z1();
            if (c1acaZ1 != null && (liveRoomStruct2 = c1acaZ1.LIZJ) != null) {
                j4 = liveRoomStruct2.id;
            }
            pairArr[0] = new Pair("roomId", Long.valueOf(j4));
            pairArr[1] = new Pair("reason", "continue_parallel_pull_false");
            c1ac7.getClass();
            C1AC7.LJIILL("preview_pull_fallback", pairArr);
            return;
        }
        C1ACA c1acaZ12 = livePreviewPlayerWidget.z1();
        if (c1acaZ12 != null) {
            c1acaZ12.LJLJI = j2 + 0;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP12 = livePreviewPlayerWidget.P1();
        if (feedLiveViewHolderVMP12 != null) {
            feedLiveViewHolderVMP12.LLLFF = C1ACS.SCHEDULING;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP13 = livePreviewPlayerWidget.P1();
        if (feedLiveViewHolderVMP13 != null) {
            feedLiveViewHolderVMP13.LLLII = 0L;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMP14 = livePreviewPlayerWidget.P1();
        if (feedLiveViewHolderVMP14 != null) {
            feedLiveViewHolderVMP14.LLLIIII = 0L;
        }
        C1AC7 c1ac72 = C1AC7.LIZ;
        Pair[] pairArr2 = new Pair[5];
        C1ACA c1acaZ13 = livePreviewPlayerWidget.z1();
        if (c1acaZ13 != null && (liveRoomStruct = c1acaZ13.LIZJ) != null) {
            j3 = liveRoomStruct.id;
        } else {
            j3 = 0;
        }
        pairArr2[0] = new Pair("roomId", Long.valueOf(j3));
        pairArr2[1] = new Pair("predictType", enumC993870byD);
        pairArr2[2] = new Pair("startInterval", Long.valueOf(j));
        pairArr2[3] = new Pair("keepTime", Long.valueOf(j2));
        pairArr2[4] = new Pair("firstPullTime", 0L);
        c1ac72.getClass();
        C1AC7.LJIILL("preview_pull_timer_start", pairArr2);
        if (((Boolean) C275100AqK.LIZ.getValue()).booleanValue()) {
            C755980Tl6.LIZ().LIZJ = new InterfaceC582670MtF() { // from class: X.1ADF
                @Override // X.InterfaceC582670MtF
                public final void LIZ(String str) {
                    C20441214yg.LIZIZ("ttlive_preview_LivePreviewPlayerWidget", "prePullLiveCallback -> onLivePause");
                    LivePreviewPlayerWidget livePreviewPlayerWidget2 = this.LIZ;
                    int i = LivePreviewPlayerWidget.LLLF;
                    livePreviewPlayerWidget2.S1(true);
                }
            };
        }
        livePreviewPlayerWidget.i2(false);
        livePreviewPlayerWidget.LLJIJIL = new C1ADJ(enumC993870byD, j2, j, System.currentTimeMillis());
        livePreviewPlayerWidget.LLJILJILJ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS8S0100100_23(j2, livePreviewPlayerWidget, 0), new C09JN() { // from class: X.00Q8
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("LivePreviewPlayerWidget@e362.startPauseStreamTimer$3");
                C1C7U.LIZIZ("LivePreviewPlayerWidget@e362.startPauseStreamTimer$3");
            }
        });
        C486790J7d.LIZLLL(new ARunnableS133S0100000_33(livePreviewPlayerWidget, 12), null, C583980MvM.LIZJ().delayTime);
    }
}
