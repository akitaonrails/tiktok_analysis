package com.bytedance.android.livesdk.init;

import X.AbstractC20513081v;
import X.C1161920gLG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C480460Ism;
import X.C766720U5u;
import X.C786410Ut5;
import X.C823050WQl;
import X.C827750WdZ;
import X.InterfaceC1106030et7;
import Y.ARunnableS86S0000000_7;
import android.os.Looper;
import android.os.MessageQueue;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.init.BadPhonesCommonOptTask;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLauchTaskEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharebgFlickOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveClickEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterDelayShowLoadingTimeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.watch.IWatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class BadPhonesCommonOptTask extends AbstractC20513081v {
    @Override // X.AbstractC20513081v
    public String getTaskName() {
        return "bad_phones_common_opt_task";
    }

    public static /* synthetic */ void lambda$preloadConfigs$3() {
        C1C7U.LIZ("BadPhonesCommonOptTask@4fa2.preloadConfigs$1L");
        InterfaceC1106030et7.e5.LIZIZ();
        LiveEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        LiveClickEnterDelayShowLoadingTimeSetting.INSTANCE.getValue();
        LiveUseSurfaceViewExperiment.INSTANCE.isEnable();
        LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        C1C7U.LIZIZ("BadPhonesCommonOptTask@4fa2.preloadConfigs$1L");
    }

    public static /* synthetic */ void lambda$preloadRetrofitApi$4() {
        C1C7U.LIZ("BadPhonesCommonOptTask@4fa2.preloadRetrofitApi$1L");
        C480460Ism c480460IsmLIZ = C480460Ism.LIZ();
        C480460Ism.LIZ().getClass();
        FeedApi feedApi = (FeedApi) C480460Ism.LIZLLL(FeedApi.class);
        feedApi.feed("", new HashMap());
        feedApi.feed("", 0L, "", new HashMap());
        feedApi.feed("", 0L, "", 0L, 0L, 0L, new HashMap());
        feedApi.feed("", 0L, "", "", 0L, 0L, 0L, new HashMap());
        feedApi.feed("", 0L, "", "", "", "", 0L, 0L, new HashMap());
        c480460IsmLIZ.getClass();
        RoomRetrofitApi roomRetrofitApi = (RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class);
        roomRetrofitApi.enterRoom(0L, 0L, 0L, new HashMap<>(0));
        roomRetrofitApi.fetchRoom(new HashMap<>(0));
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Zk();
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).preloadApApi();
        ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).preloadBroadcastApi();
        ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).Zk();
        C1C7U.LIZIZ("BadPhonesCommonOptTask@4fa2.preloadRetrofitApi$1L");
    }

    public static /* synthetic */ boolean lambda$preloadWatchWidgets$0() {
        try {
            C827750WdZ.LIZIZ("widget_v4", "preloadWatchWidgets->addIdleHandler");
            ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).s42(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context());
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadWatchWidgets->addIdleHandler-crash");
            sbLIZ.append(th.getMessage());
            C827750WdZ.LIZIZ("widget_v4", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }

    public static /* synthetic */ void lambda$preloadWatchWidgets$1() {
        C1C7U.LIZ("BadPhonesCommonOptTask@4fa2.preloadWatchWidgets$1L$1L");
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0J7v
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return BadPhonesCommonOptTask.lambda$preloadWatchWidgets$0();
            }
        }, Looper.myQueue());
        C1C7U.LIZIZ("BadPhonesCommonOptTask@4fa2.preloadWatchWidgets$1L$1L");
    }

    public static /* synthetic */ void lambda$preloadWatchWidgets$2() {
        C1C7U.LIZ("BadPhonesCommonOptTask@4fa2.preloadWatchWidgets$1L");
        C827750WdZ.LIZIZ("widget_v4", "preloadWatchWidgets");
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).kc1()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS86S0000000_7(11));
            C1C7U.LIZIZ("BadPhonesCommonOptTask@4fa2.preloadWatchWidgets$1L");
        } else {
            C827750WdZ.LIZIZ("widget_v4", "preloadWatchWidgets->LiveEnablePreloadRecycleWidget.INSTANCE.isDisable()");
            C1C7U.LIZIZ("BadPhonesCommonOptTask@4fa2.preloadWatchWidgets$1L");
        }
    }

    private void preloadShareBgEffectList() {
        if (!(MultiGuestSharebgFlickOptSetting.INSTANCE.isEnable() && MultiGuestLauchTaskEnableSetting.INSTANCE.isEnable())) {
            C20441214yg.LIZIZ("shared_bg", "preloadShareBgEffectList return");
            return;
        }
        C20441214yg.LIZIZ("shared_bg", "preloadShareBgEffectList");
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJI(new IEffectPlatformBaseListener<List<LiveEffect>>() { // from class: X.0J7t
            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<LiveEffect> list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("preloadShareBgEffectList onSuccess list.size: ");
                sbLIZ.append(list.size());
                C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
            }
        }, true);
    }

    private void preloadConfigs() {
        C823050WQl.LIZIZ().submit(new ARunnableS86S0000000_7(13));
    }

    private void preloadRetrofitApi() {
        C823050WQl.LIZIZ().submit(new ARunnableS86S0000000_7(14));
    }

    private void preloadWatchWidgets() {
        C823050WQl.LIZIZ().submit(new ARunnableS86S0000000_7(12));
    }

    @Override // X.AbstractC20513081v
    public void run() {
        preloadRetrofitApi();
        preloadConfigs();
        preloadWatchWidgets();
        preloadShareBgEffectList();
    }
}
