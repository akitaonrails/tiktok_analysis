package com.ss.android.ugc.aweme.feed.adapter;

import X.C00Y7;
import X.C01GW;
import X.C035D;
import X.C07IN;
import X.C083S;
import X.C08D5;
import X.C08LW;
import X.C0A5B;
import X.C0DMM;
import X.C0IHI;
import X.C0IJT;
import X.C0IL2;
import X.C0ITW;
import X.C0J4Y;
import X.C0S4U;
import X.C0TL6;
import X.C1161920gLG;
import X.C11JF;
import X.C1210440hbW;
import X.C1210880hcE;
import X.C1287300jbU;
import X.C1365850leB;
import X.C1365860leC;
import X.C1365870leD;
import X.C13IQ;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C1594770rbP;
import X.C1602240rnS;
import X.C19252910Tv;
import X.C19386510sx;
import X.C19719912Dl;
import X.C19EG;
import X.C1ABF;
import X.C1ABT;
import X.C1ABU;
import X.C1AC7;
import X.C1ACA;
import X.C1ACS;
import X.C1ACT;
import X.C1ACV;
import X.C1ACW;
import X.C1AD2;
import X.C1ADI;
import X.C1ADO;
import X.C20311514dl;
import X.C20441214yg;
import X.C20448214zo;
import X.C20684815ws;
import X.C2093608Ic;
import X.C21153017qC;
import X.C2175121AAs;
import X.C2175331ABn;
import X.C2175631ACr;
import X.C2175771ADf;
import X.C2188811AlT;
import X.C2222371ByV;
import X.C2344009Gk;
import X.C257100z3;
import X.C275070AqH;
import X.C285930BIp;
import X.C293620Bf6;
import X.C293750BfJ;
import X.C452501pT;
import X.C463180IEi;
import X.C464220IIi;
import X.C464230IIj;
import X.C465520INi;
import X.C466430IQv;
import X.C466460IQy;
import X.C473250Ih9;
import X.C474500IjA;
import X.C479910Irt;
import X.C486790J7d;
import X.C500260Jjc;
import X.C512350K7l;
import X.C5182020e;
import X.C588730N7f;
import X.C692060RCq;
import X.C745180TKy;
import X.C748910TZh;
import X.C749430TaX;
import X.C755900Tky;
import X.C755980Tl6;
import X.C7804033a;
import X.C823050WQl;
import X.C827203La;
import X.C827750WdZ;
import X.C998890c6J;
import X.EnumC1154970gA3;
import X.EnumC1488260opc;
import X.EnumC19379710rr;
import X.EnumC2175041AAk;
import X.EnumC2175161AAw;
import X.EnumC494740Jai;
import X.EnumC744960TKc;
import X.EnumC755930Tl1;
import X.EnumC999300c6y;
import X.InterfaceC1585190rLx;
import X.InterfaceC1601140rlg;
import X.InterfaceC20673515v3;
import X.InterfaceC2175871ADp;
import X.InterfaceC2183451Acp;
import X.InterfaceC480520Iss;
import X.InterfaceC533950Kwr;
import X.InterfaceC755920Tl0;
import X.RunnableC1206180hUe;
import X.RunnableC487170J8p;
import X.RunnableC755950Tl3;
import Y.AObjectS375S0100000_33;
import Y.AObserverS230S0100000_28;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.feed.LivePreviewAutoSkipTimeSetting;
import com.bytedance.android.livesdk.livesetting.feed.LivePreviewNonPlayEventLogSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkEnableFeedLiveTrackAddMultiParamsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMessagePreviewSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePerformanceOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCadSmoothExitSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveNetworkCtlSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LivePlayerCreateLogicOptExp;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewControlPlayLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewInteractionLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LivePreviewTopMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bottom.LivePreviewBottomCardVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.follow.LivePreviewFollowVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.group.LivePreviewNoInteractLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.highlight.LivePreviewHighlightsPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.LivePreviewShareVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBlockVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.live.AILivePreviewHighlight;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStatesTag;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes34.dex */
public final class FeedLiveViewHolderNewV2 extends BaseFeedLiveViewHolder implements InterfaceC533950Kwr, InterfaceC755920Tl0 {
    public final C1ACA LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public LivePreviewControlPlayLayerWidget LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public final ViewGroup LLJJJ;
    public boolean LLJJJIL;
    public C00Y7 LLJJJJ;
    public final String LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C1ACW LLJJL;

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LLZLLLL(int i) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void Rl(C035D c035d) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void h0(Aweme aweme) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LivePreviewPlayerVM A1() {
        return (LivePreviewPlayerVM) this.LLJI.getValue();
    }

    public final ViewHolderStatusVM B1() {
        return (ViewHolderStatusVM) this.LLJIJIL.getValue();
    }

    public final void C1() {
        C1ACA c1aca = this.LLIZ;
        LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
        c1aca.LJJIIZI = new C1ABU(liveRoomStruct != null ? liveRoomStruct.id : 0L, this.context, EnumC19379710rr.PREVIEW, LiveMessagePreviewSetting.INSTANCE.getValue().getStartMessageInstant());
        if (C2175331ABn.LIZ(this.LLIZ) || (C745180TKy.LIZ(this.LLIZ) && C0TL6.LIZ().noUpdate <= 0)) {
            C1ABT.LJIILL(this.LLIZ);
        }
    }

    public final void E1() {
        MutableLiveData<Unit> mutableLiveData;
        C1ACA c1aca = this.LLIZ;
        if (c1aca.LIZJ != null) {
            if (c1aca.LJFF) {
                FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
                if (feedLiveViewHolderVMY1 != null) {
                    feedLiveViewHolderVMY1.LLJJL.setValue(Boolean.TRUE);
                }
                ViewHolderStatusVM viewHolderStatusVMB1 = B1();
                if (viewHolderStatusVMB1 == null || (mutableLiveData = viewHolderStatusVMB1.LLJILJILJ) == null) {
                    return;
                }
                mutableLiveData.setValue(Unit.LIZ);
                return;
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMY12 = y1();
            if (feedLiveViewHolderVMY12 != null) {
                C1ACA c1acaDQ2 = feedLiveViewHolderVMY12.DQ2();
                boolean z = false;
                if (c1acaDQ2 != null && c1acaDQ2.LJII && !feedLiveViewHolderVMY12.LLJ) {
                    C1AC7 c1ac7 = C1AC7.LIZ;
                    C1ACA c1acaDQ22 = feedLiveViewHolderVMY12.DQ2();
                    String str = feedLiveViewHolderVMY12.LLIZLLLIL;
                    C1ADI c1adi = feedLiveViewHolderVMY12.LLJJJ;
                    if (c1adi != null && c1adi.LLILLJJLI) {
                        z = true;
                    }
                    c1ac7.getClass();
                    C1AC7.LJIILIIL(c1acaDQ22, str, z);
                    feedLiveViewHolderVMY12.LLJ = true;
                }
                if (feedLiveViewHolderVMY12.OQ2("end")) {
                    C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderVM", "showLiveEnd: reverse REMOVE_LIVE_END");
                } else {
                    feedLiveViewHolderVMY12.BQ2();
                }
                feedLiveViewHolderVMY12.LLJJL.setValue(Boolean.FALSE);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJIIJ() {
        if (((Boolean) C0A5B.LIZ.getValue()).booleanValue()) {
            C21153017qC.LIZ.getClass();
            try {
                ((LinkedList) C21153017qC.LIZJ.getValue()).clear();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LL() {
        return this.LLIZ.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLIILZL() {
        return this.LLIZ.LLFFF;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final boolean LLZLI() {
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJ.getValue();
        return !(livePreviewHighlightsPlayerVM != null && livePreviewHighlightsPlayerVM.xQ2());
    }

    public final FeedLiveViewHolderVM y1() {
        return (FeedLiveViewHolderVM) this.LLIZLLLIL.getValue();
    }

    public final LivePreviewGuideEnterVM z1() {
        return (LivePreviewGuideEnterVM) this.LLJJI.getValue();
    }

    public final void D1() {
        MutableLiveData<Unit> mutableLiveData;
        MutableLiveData<Unit> mutableLiveData2;
        NextLiveData<Pair<Boolean, Boolean>> nextLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null && (nextLiveData = feedLiveViewHolderVMY1.LLJJJJLIIL) != null) {
            nextLiveData.observe(this, new AObserverS230S0100000_28(this, 20));
        }
        LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
        if (livePreviewPlayerVMA1 != null && (mutableLiveData2 = livePreviewPlayerVMA1.LLILZ) != null) {
            mutableLiveData2.observe(this, new AObserverS235S0100000_33(this, 4));
        }
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJ.getValue();
        if (livePreviewHighlightsPlayerVM == null || (mutableLiveData = livePreviewHighlightsPlayerVM.LL) == null) {
            return;
        }
        mutableLiveData.observe(this, new AObserverS235S0100000_33(this, 5));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0RGM
    public final void LLI() {
        ViewHolderStatusVM viewHolderStatusVMB1 = B1();
        if (viewHolderStatusVMB1 != null) {
            viewHolderStatusVMB1.LLJI.setValue(Unit.LIZ);
        }
    }

    @Override // X.InterfaceC533950Kwr
    public final void LLLLZ() {
        int i;
        int i2;
        LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
        if (livePreviewPlayerVMA1 == null || (i = livePreviewPlayerVMA1.LLJJJIL) == -1 || (i2 = livePreviewPlayerVMA1.LLJJJJ) == -1) {
            return;
        }
        livePreviewPlayerVMA1.LLILLJJLI.setValue(new C473250Ih9(i, i2));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void onDestroyView() {
        EventBus.LIZLLL().LJJI(this);
        C827750WdZ.LIZJ("ttlive_preview_FeedLiveViewHolderNewV2", "onDestroyView");
        if (this.widgetCallback == null) {
            return;
        }
        LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
        if (livePreviewPlayerVMA1 != null) {
            livePreviewPlayerVMA1.yQ2("onDestroyView", true);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null) {
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaDQ2 = feedLiveViewHolderVMY1.DQ2();
            c1ac7.getClass();
            C1AC7.LJI(c1acaDQ2);
            C11JF c11jf = feedLiveViewHolderVMY1.LLJJIJIL;
            if (c11jf != null && !c11jf.isDisposed()) {
                c11jf.dispose();
            }
            feedLiveViewHolderVMY1.LLJJIJIL = null;
            feedLiveViewHolderVMY1.LLJJJ = null;
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVMZ1 = z1();
        if (livePreviewGuideEnterVMZ1 != null) {
            livePreviewGuideEnterVMZ1.vz2();
            C1287300jbU.LIZ.LIZIZ();
        }
        IMessageManager iMessageManager = this.LLIZ.LJJIIZ;
        if (iMessageManager != null) {
            iMessageManager.destroyMessage();
        }
        C755900Tky.LL.getClass();
        C755900Tky.LLILLJJLI.clear();
        C20441214yg.LIZIZ("ttlive_preview_FeedLiveViewHolderNewV2", "release preview card degrade on destroy view");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
        if (livePreviewPlayerVMA1 != null) {
            livePreviewPlayerVMA1.LLJLLIL.onPause();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
        if (livePreviewPlayerVMA1 != null) {
            livePreviewPlayerVMA1.LLJLLIL.onResume();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void unBind() {
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C0ITW c0itw;
        C2175771ADf c2175771ADf;
        C19EG c19egLIZ;
        boolean z;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct liveRoomStruct2;
        User user;
        Aweme aweme2;
        List<LiveRoomStatesTag> liveRoomStatesTags;
        String str;
        InterfaceC2175871ADp interfaceC2175871ADp;
        C2175631ACr c2175631ACrLIZ;
        Aweme aweme3;
        LivePreviewPlayerVM livePreviewPlayerVMA1;
        InterfaceC480520Iss interfaceC480520IssLLJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unBind: ");
        sbLIZ.append(hashCode());
        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderNewV2", C2188811AlT.LIZIZ(sbLIZ));
        C465520INi.LIZ.Ym2();
        C1ACA c1aca = this.LLIZ;
        c1aca.LJFF = true;
        c1aca.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_NONE;
        c1aca.LJJIII = null;
        c1aca.LJLILLLLZI = null;
        String str2 = c1aca.LJIIIZ.LIZ;
        if (str2 != null && (interfaceC480520IssLLJJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LLJJ(str2, LivePlayerCreateLogicOptExp.isForbidCreate())) != null) {
            interfaceC480520IssLLJJ.LJJIII(true);
        }
        EventBus.LIZLLL().LJJI(this);
        LivePreviewPlayerVM livePreviewPlayerVMA12 = A1();
        if (C293620Bf6.LIZ(livePreviewPlayerVMA12 != null ? livePreviewPlayerVMA12.BQ2() : null) && (livePreviewPlayerVMA1 = A1()) != null) {
            livePreviewPlayerVMA1.yQ2("performUnbind", true);
        }
        if (this.widgetCallback != null) {
            C827750WdZ.LIZ("ttlive_preview_FeedLiveViewHolderNewV2", "unbind");
            LivePreviewPlayerVM livePreviewPlayerVMA13 = A1();
            if (livePreviewPlayerVMA13 != null) {
                livePreviewPlayerVMA13.JQ2("performUnbind");
            }
            FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
            if (feedLiveViewHolderVMY1 != null) {
                if (!feedLiveViewHolderVMY1.LLJILJILJ) {
                    C1AC7 c1ac7 = C1AC7.LIZ;
                    C1ACA c1acaDQ2 = feedLiveViewHolderVMY1.DQ2();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    EnumC2175161AAw enumC2175161AAw = EnumC2175161AAw.UNBIND;
                    c1ac7.getClass();
                    C1AC7.LJIIL(c1acaDQ2, jCurrentTimeMillis, enumC2175161AAw);
                    InterfaceC2183451Acp interfaceC2183451Acp = (InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class);
                    C1ACA c1acaDQ22 = feedLiveViewHolderVMY1.DQ2();
                    String requestId = (c1acaDQ22 == null || (aweme3 = c1acaDQ22.LIZIZ) == null) ? null : aweme3.getRequestId();
                    C1ACA c1acaDQ23 = feedLiveViewHolderVMY1.DQ2();
                    interfaceC2183451Acp.LJJIFFI(requestId, Intrinsics.LJFF((c1acaDQ23 == null || (interfaceC2175871ADp = c1acaDQ23.LJJJLIIL) == null || (c2175631ACrLIZ = interfaceC2175871ADp.LIZ(false)) == null) ? null : c2175631ACrLIZ.LIZ, "guest"));
                    if (LivePreviewNonPlayEventLogSetting.INSTANCE.isDisable()) {
                        z = true;
                    } else {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        C1ACA c1acaDQ24 = feedLiveViewHolderVMY1.DQ2();
                        if (c1acaDQ24 != null && (aweme2 = c1acaDQ24.LIZIZ) != null && (liveRoomStatesTags = aweme2.getLiveRoomStatesTags()) != null) {
                            for (LiveRoomStatesTag liveRoomStatesTag : liveRoomStatesTags) {
                                String str3 = liveRoomStatesTag.tagKey;
                                if (str3 != null && (str = liveRoomStatesTag.tagValue) != null) {
                                    linkedHashMap.put(str3, str);
                                }
                            }
                        }
                        C464220IIi c464220IIi = C464220IIi.LIZ;
                        C1ACA c1acaDQ25 = feedLiveViewHolderVMY1.DQ2();
                        String str4 = c1acaDQ25 != null ? c1acaDQ25.LJJLI : null;
                        long jFQ2 = feedLiveViewHolderVMY1.FQ2();
                        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                        C1ACA c1acaDQ26 = feedLiveViewHolderVMY1.DQ2();
                        String uid = (c1acaDQ26 == null || (liveRoomStruct2 = c1acaDQ26.LIZJ) == null || (user = liveRoomStruct2.owner) == null) ? null : user.getUid();
                        C1ACA c1acaDQ27 = feedLiveViewHolderVMY1.DQ2();
                        String requestId2 = (c1acaDQ27 == null || (aweme = c1acaDQ27.LIZIZ) == null) ? null : aweme.getRequestId();
                        C1ACA c1acaDQ28 = feedLiveViewHolderVMY1.DQ2();
                        String str5 = c1acaDQ28 != null ? c1acaDQ28.LIZLLL : null;
                        C1ACA c1acaDQ29 = feedLiveViewHolderVMY1.DQ2();
                        Long lValueOf = (c1acaDQ29 == null || (liveRoomStruct = c1acaDQ29.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id);
                        C1ACA c1acaDQ210 = feedLiveViewHolderVMY1.DQ2();
                        C464230IIj c464230IIj = new C464230IIj(strValueOf, uid, requestId2, str5, "live_cell", "click", linkedHashMap, lValueOf, c1acaDQ210 != null ? c1acaDQ210.LJJJJI : null);
                        c464220IIi.getClass();
                        if (str4 != null) {
                            C464220IIi.LIZ(str4, jFQ2, c464230IIj);
                        }
                        z = true;
                    }
                    feedLiveViewHolderVMY1.LLJILJILJ = z;
                }
                feedLiveViewHolderVMY1.NQ2();
                feedLiveViewHolderVMY1.AQ2();
                feedLiveViewHolderVMY1.LLLIZZ = false;
            }
            LivePreviewPlayerVM livePreviewPlayerVMA14 = A1();
            if (livePreviewPlayerVMA14 != null) {
                Context context = this.context;
                boolean zIsDestroyed = (context == null || (c19egLIZ = C500260Jjc.LIZ(context)) == null) ? false : c19egLIZ.isDestroyed();
                livePreviewPlayerVMA14.LLJJI.LIZIZ.clear();
                C1ACA c1acaZQ2 = livePreviewPlayerVMA14.zQ2();
                if (c1acaZQ2 != null && (c2175771ADf = c1acaZQ2.LJJJZ) != null) {
                    c2175771ADf.LIZ = 0;
                    c2175771ADf.LIZIZ = 0;
                    c2175771ADf.LIZJ = 0;
                }
                if (!zIsDestroyed && (c0itw = livePreviewPlayerVMA14.LLJJLIIIJLLLLLLLZ) != null) {
                    c0itw.LIZIZ("unBind");
                }
            }
            ViewHolderStatusVM viewHolderStatusVMB1 = B1();
            if (viewHolderStatusVMB1 != null) {
                Aweme aweme4 = this.LLIZ.LIZIZ;
                String aid = aweme4 != null ? aweme4.getAid() : null;
                C20441214yg.LJIIIZ("ViewHolderStatusVM.kt", "onViewHolderUnBind");
                viewHolderStatusVMB1.LLJJI.setValue(Integer.valueOf(C1ACT.UNBIND.getState()));
                viewHolderStatusVMB1.LLILLJJLI.LIZ(aid);
            }
            if ((((Number) C293750BfJ.LIZ.getValue()).intValue() & 1) == 1) {
                IMessageManager iMessageManager = this.LLIZ.LJJIIZ;
                C21153017qC c21153017qC = C21153017qC.LIZ;
                AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(iMessageManager, 4059);
                c21153017qC.getClass();
                C21153017qC.LIZ(awS577S0100000_33);
            } else {
                IMessageManager iMessageManager2 = this.LLIZ.LJJIIZ;
                if (iMessageManager2 != null) {
                    iMessageManager2.destroyMessage();
                }
            }
            ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().LLJJIJIL(null);
            C512350K7l c512350K7l = C512350K7l.LIZ;
            String str6 = this.LLIZ.LJ;
            c512350K7l.getClass();
            if (C07IN.LIZ()) {
                C755980Tl6 c755980Tl6LIZ = C755980Tl6.LIZ();
                RunnableC487170J8p runnableC487170J8p = new Runnable() { // from class: X.0J8p
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveHelper@daf7.recycleFeedLiveViewHolder$1");
                        try {
                            BaseFeedLiveViewHolder.LLILZLL.getValue().clear();
                            C512350K7l.LIZIZ.clear();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveHelper@daf7.recycleFeedLiveViewHolder$1");
                    }
                };
                if (c755980Tl6LIZ.LIZLLL == null) {
                    c755980Tl6LIZ.LIZLLL = runnableC487170J8p;
                }
                ConcurrentHashMap<String, HashSet<BaseFeedLiveViewHolder>> concurrentHashMap = C512350K7l.LIZIZ;
                if (concurrentHashMap.get(str6) == null) {
                    concurrentHashMap.put(str6, new HashSet<>());
                }
                HashSet<BaseFeedLiveViewHolder> hashSet = concurrentHashMap.get(str6);
                if (hashSet != null) {
                    hashSet.add(this);
                }
            }
        }
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIL = null;
        C19EG c19egLIZ2 = C827203La.LIZ(this.LLILLL);
        if (c19egLIZ2 == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZ2)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null) {
            return;
        }
        homeTabAbilityLIZ.tx0(this.LLJJL);
    }

    public final void F1(Aweme aweme) {
        LiveRoomStruct liveRoomStructLJI;
        User user;
        C1ACA c1aca = this.LLIZ;
        c1aca.LIZIZ = aweme;
        if (aweme != null) {
            liveRoomStructLJI = C0J4Y.LJI(aweme);
        } else {
            liveRoomStructLJI = null;
        }
        c1aca.LIZJ = liveRoomStructLJI;
        c1aca.LJJIII = null;
        c1aca.LIZLLL = C1ABT.LIZLLL(c1aca);
        C1ABT.LIZJ(c1aca);
        c1aca.LLFII = false;
        c1aca.LLFFF = false;
        c1aca.LJJIFFI = false;
        int i = C20448214zo.LIZ;
        Pair pairLIZ = C20448214zo.LIZ(this.LLIZ.LIZJ);
        c1aca.LJIILIIL = ((Boolean) pairLIZ.getFirst()).booleanValue();
        c1aca.LJIILJJIL = (Set) pairLIZ.getSecond();
        c1aca.LJIIJJI.LIZ = c1aca.LJIILIIL;
        if (aweme != null) {
            Integer numValueOf = Integer.valueOf(AwemeBizExtKt.getRealtimeFollowStatus(aweme));
            if (numValueOf.intValue() != -3) {
                int iIntValue = numValueOf.intValue();
                LiveRoomStruct liveRoomStruct = c1aca.LIZJ;
                if (liveRoomStruct != null && (user = liveRoomStruct.owner) != null) {
                    user.setFollowStatus(iIntValue);
                }
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C748910TZh.class, this.LLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJIIZILJ(boolean z) {
        ViewHolderStatusVM viewHolderStatusVMB1 = B1();
        if (viewHolderStatusVMB1 != null) {
            viewHolderStatusVMB1.LLJILJIL.setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJIFFI(boolean z) {
        ViewHolderStatusVM viewHolderStatusVMB1 = B1();
        if (viewHolderStatusVMB1 != null) {
            viewHolderStatusVMB1.LLJIJIL.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x039d  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIJIIJIL(int r20) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2.LJJIJIIJIL(int):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LJJJLZIJ(C1365850leB c1365850leB) {
        C1ACA c1aca;
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LLJILLL.getValue();
        if (livePreviewShareVM != null && (c1aca = (C1ACA) livePreviewShareVM.LL.getValue()) != null && c1aca.LIZIZ != null && c1365850leB != null) {
            livePreviewShareVM.LLILLL.setValue(c1365850leB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x024f  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(int r14) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2.LJLIIIL(int):void");
    }

    @Override // X.InterfaceC755920Tl0
    public final boolean LLIFFJFJJ(EnumC755930Tl1 enumC755930Tl1) {
        return C755900Tky.LL.LLIFFJFJJ(enumC755930Tl1);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LLILLL(C1365860leC c1365860leC) {
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LLJILLL.getValue();
        if (livePreviewShareVM != null && c1365860leC != null) {
            livePreviewShareVM.LLILZ.setValue(c1365860leC);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LLJJJJ(boolean z) {
        int i;
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null) {
            feedLiveViewHolderVMY1.LLLJIL = z;
        }
        C1ACA c1aca = this.LLIZ;
        if (z) {
            i = 6;
        } else {
            i = 5;
        }
        c1aca.LJJIIJZLJL = i;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void LLLI(int i) {
        FeedLiveViewHolderVM feedLiveViewHolderVMY1;
        LivePreviewGuideEnterVM livePreviewGuideEnterVMZ1;
        Long lValueOf;
        Long lValueOf2;
        String str;
        ConcurrentHashMap<String, C463180IEi> concurrentHashMap;
        C463180IEi c463180IEi;
        C463180IEi c463180IEi2;
        ViewHolderStatusVM viewHolderStatusVMB1;
        if (C275070AqH.LIZ() && (viewHolderStatusVMB1 = B1()) != null && !viewHolderStatusVMB1.LLJJIJIIJIL) {
            return;
        }
        ViewHolderStatusVM viewHolderStatusVMB12 = B1();
        if (viewHolderStatusVMB12 != null) {
            viewHolderStatusVMB12.LLJJIJIIJIL = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderResume: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" moveToNextWhenResume=");
        sbLIZ.append(this.LLJJJIL);
        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderNewV2", C2188811AlT.LIZIZ(sbLIZ));
        C1ACA c1aca = this.LLIZ;
        c1aca.LLFII = false;
        c1aca.LLFFF = false;
        ViewHolderStatusVM viewHolderStatusVMB13 = B1();
        if (viewHolderStatusVMB13 != null) {
            C20441214yg.LJIIIZ("ViewHolderStatusVM.kt", "onViewHolderResume");
            viewHolderStatusVMB13.LLJILLL = false;
            viewHolderStatusVMB13.LLJJI.setValue(Integer.valueOf(C1ACT.RESUME.getState()));
            viewHolderStatusVMB13.LLILZIL.setValue(Unit.LIZ);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMY12 = y1();
        if (feedLiveViewHolderVMY12 != null) {
            if (!LivePreviewNonPlayEventLogSetting.INSTANCE.isDisable()) {
                C464220IIi c464220IIi = C464220IIi.LIZ;
                C1ACA c1acaDQ2 = feedLiveViewHolderVMY12.DQ2();
                if (c1acaDQ2 != null) {
                    str = c1acaDQ2.LJJLI;
                } else {
                    str = null;
                }
                c464220IIi.getClass();
                if (str != null && (c463180IEi = (concurrentHashMap = C464220IIi.LIZIZ).get(str)) != null && c463180IEi.LIZ == 1 && (c463180IEi2 = concurrentHashMap.get(str)) != null) {
                    c463180IEi2.LIZ = 2;
                }
            }
            LiveCadSmoothExitSetting liveCadSmoothExitSetting = LiveCadSmoothExitSetting.INSTANCE;
            C1440005kM.LIZ(new C083S(true, liveCadSmoothExitSetting.getPreviewCardDuration()));
            C998890c6J value = feedLiveViewHolderVMY12.LLJJJJ.getValue();
            if (value != null && value.LIZ) {
                feedLiveViewHolderVMY12.LLJJJJ.setValue(new C998890c6J(false, liveCadSmoothExitSetting.getPreviewCardDuration()));
            }
            if (feedLiveViewHolderVMY12.DQ2() != null && (!r0.LJFF)) {
                feedLiveViewHolderVMY12.BQ2();
            }
            C1ACA c1acaDQ22 = feedLiveViewHolderVMY12.DQ2();
            if (c1acaDQ22 != null) {
                c1acaDQ22.LJJIIJ = false;
            }
            C20311514dl c20311514dl = C20311514dl.LIZ;
            C1ACA c1acaDQ23 = feedLiveViewHolderVMY12.DQ2();
            c20311514dl.getClass();
            if (C20311514dl.LJ && c1acaDQ23 != null) {
                C20311514dl.LJ = false;
                long jUptimeMillis = SystemClock.uptimeMillis() - C20311514dl.LIZLLL;
                C20311514dl.LIZLLL = -1L;
                if (jUptimeMillis <= 3000) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_turn_back_live_cell");
                    c474500IjALIZ.LJJII(c1acaDQ23.LIZLLL, "enter_from_merge");
                    c474500IjALIZ.LJJII("live_cell", "enter_method");
                    LiveRoomStruct liveRoomStruct = c1acaDQ23.LIZJ;
                    if (liveRoomStruct != null) {
                        lValueOf = Long.valueOf(liveRoomStruct.id);
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "room_id");
                    LiveRoomStruct liveRoomStruct2 = c1acaDQ23.LIZJ;
                    if (liveRoomStruct2 != null) {
                        lValueOf2 = Long.valueOf(liveRoomStruct2.getAnchorId());
                    } else {
                        lValueOf2 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
                    c474500IjALIZ.LIZ();
                }
            }
        }
        if (!TextUtils.equals(this.LLIZ.LIZLLL, "homepage_live") && (livePreviewGuideEnterVMZ1 = z1()) != null) {
            livePreviewGuideEnterVMZ1.FQ2();
        }
        if (this.LLJJJIL) {
            if (this.LLJJJJ != C00Y7.FYP_INNER_DRAW_EXP && (feedLiveViewHolderVMY1 = y1()) != null) {
                feedLiveViewHolderVMY1.LLJJ = true;
            }
            C08D5.LIZIZ((Handler) this.LLJJJJLIIL.getValue(), new ARunnableS107S0100000_7(this, 113), this.LLJJJJJIL, LivePreviewAutoSkipTimeSetting.INSTANCE.getValue(this.LLJJJJ));
            this.LLJJJIL = false;
        }
        this.LLJJJJ = null;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.InterfaceC583650Mup
    public final void LLLLIL(Aweme aweme) {
        String aid;
        LivePreviewGuideEnterVM livePreviewGuideEnterVMZ1;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        long j;
        boolean z;
        MutableLiveData<Unit> mutableLiveData;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeFeedPlay: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderNewV2", C2188811AlT.LIZIZ(sbLIZ));
        C1ACA c1aca = this.LLIZ;
        c1aca.LIZIZ = aweme;
        LiveRoomStruct liveRoomStructLJI = c1aca.LIZJ;
        if (liveRoomStructLJI == null) {
            if (aweme != null) {
                liveRoomStructLJI = C0J4Y.LJI(aweme);
            } else {
                liveRoomStructLJI = null;
            }
        }
        c1aca.LIZJ = liveRoomStructLJI;
        c1aca.LIZLLL = C1ABT.LIZLLL(c1aca);
        c1aca.LLFII = false;
        c1aca.LLFFF = false;
        this.dataChannel.SX0(C748910TZh.class, this.LLIZ);
        boolean z2 = true;
        if (this.LLIZ.LJJJJIZL && (livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJ.getValue()) != null) {
            livePreviewHighlightsPlayerVM.LLJILLL = true;
            livePreviewHighlightsPlayerVM.LLJILJILJ = true;
        }
        ViewHolderStatusVM viewHolderStatusVMB1 = B1();
        if (viewHolderStatusVMB1 != null && (mutableLiveData = viewHolderStatusVMB1.LLILZLL) != null) {
            mutableLiveData.setValue(Unit.LIZ);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null) {
            C1ACA c1acaDQ2 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ2 != null) {
                z = c1acaDQ2.LJJJJIZL;
            } else {
                z = false;
            }
            feedLiveViewHolderVMY1.PQ2();
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaDQ22 = feedLiveViewHolderVMY1.DQ2();
            c1ac7.getClass();
            if (c1acaDQ22 != null) {
                if (c1acaDQ22.LJJJJ.length() == 0) {
                    c1acaDQ22.LJJJJ = UUID.randomUUID().toString();
                }
                if (c1acaDQ22.LJJJJIZL) {
                    c1acaDQ22.LJJJJIZL = false;
                    c1acaDQ22.LJJJJI = C0IL2.LIZ.LJ;
                } else {
                    c1acaDQ22.LJJJJI = null;
                }
            }
            C998890c6J value = feedLiveViewHolderVMY1.LLJJJJ.getValue();
            if (value != null && value.LIZ) {
                feedLiveViewHolderVMY1.LLJJJJ.setValue(new C998890c6J(false, LiveCadSmoothExitSetting.INSTANCE.getPreviewCardDuration()));
            }
            if (feedLiveViewHolderVMY1.LLJILJIL && !feedLiveViewHolderVMY1.LLJJ) {
                C1ACA c1acaDQ23 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ23 != null && c1acaDQ23.LJFF) {
                    feedLiveViewHolderVMY1.zQ2(false, true, false, EnumC744960TKc.ON_RESUME_PLAY);
                } else if (!feedLiveViewHolderVMY1.LLJIJIL) {
                    C1ACA c1acaDQ24 = feedLiveViewHolderVMY1.DQ2();
                    C1ADI c1adi = feedLiveViewHolderVMY1.LLJJJ;
                    if (c1adi == null || !c1adi.LLILLJJLI) {
                        z2 = false;
                    }
                    C1AC7.LJIILIIL(c1acaDQ24, "normal", z2);
                }
                feedLiveViewHolderVMY1.LLJJLIIIJLLLLLLLZ.setValue(Unit.LIZ);
                feedLiveViewHolderVMY1.LJJJJZI();
                feedLiveViewHolderVMY1.IQ2(z);
                feedLiveViewHolderVMY1.LLJILJIL = false;
            }
            feedLiveViewHolderVMY1.LLLIZZ = false;
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null) {
            C1ACA c1aca2 = this.LLIZ;
            IMessageManager iMessageManager = c1aca2.LJJIIZ;
            LiveRoomStruct liveRoomStruct = c1aca2.LIZJ;
            if (liveRoomStruct != null) {
                j = liveRoomStruct.id;
            } else {
                j = 0;
            }
            interfaceC20673515v3K4.updateRoomInfo(iMessageManager, j, this.context);
        }
        IMessageManager iMessageManager2 = this.LLIZ.LJJIIZ;
        if (iMessageManager2 != null) {
            iMessageManager2.startMessage();
        }
        if (TextUtils.equals(this.LLIZ.LIZLLL, "homepage_live") && (livePreviewGuideEnterVMZ1 = z1()) != null) {
            livePreviewGuideEnterVMZ1.FQ2();
        }
        ViewHolderStatusVM viewHolderStatusVMB12 = B1();
        if (viewHolderStatusVMB12 != null && viewHolderStatusVMB12.LLJJIJIIJIL && C275070AqH.LIZ()) {
            LLLI(2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v176 */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void h(boolean z) {
        String aid;
        ?? BQ2;
        LivePreviewPlayerVM livePreviewPlayerVMA1;
        NextLiveData<C1ABF> nextLiveData;
        Aweme aweme;
        boolean zBooleanValue;
        String requestId;
        String str;
        String str2;
        String uid;
        Long lValueOf;
        String requestId2;
        Integer numValueOf;
        String str3;
        User user;
        User user2;
        String uid2;
        Long lValueOf2;
        String requestId3;
        Integer numValueOf2;
        User user3;
        User user4;
        Set<EnumC999300c6y> set;
        C2175121AAs c2175121AAs;
        boolean z2;
        C2175121AAs c2175121AAs2;
        C1ADO c1ado;
        C1ADO c1ado2;
        C1ADO c1ado3;
        String str4;
        String uid3;
        String requestId4;
        String str5;
        Long lValueOf3;
        String str6;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme2;
        LiveRoomStruct liveRoomStruct2;
        User user5;
        Aweme aweme3;
        List<LiveRoomStatesTag> liveRoomStatesTags;
        String str7;
        InterfaceC2175871ADp interfaceC2175871ADp;
        C2175631ACr c2175631ACrLIZ;
        Aweme aweme4;
        int i;
        Boolean bool;
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC1601140rlg interfaceC1601140rlgP5;
        ViewHolderStatusVM viewHolderStatusVMB1 = B1();
        if (viewHolderStatusVMB1 != null) {
            viewHolderStatusVMB1.LLJJIJIIJIL = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewHolderUnSelected:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" pageDown:");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("ttlive_preview_FeedLiveViewHolderNewV2", C2188811AlT.LIZIZ(sbLIZ));
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC1601140rlgP5 = iLiveOuterServiceQ4.p5()) != null && interfaceC1601140rlgP5.LJ() != null) {
            C1602240rnS.LIZ(this.LLIZ.LJIIIIZZ);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null) {
            AwS612S0100000_33 awS612S0100000_33 = new AwS612S0100000_33(this, 211);
            C20441214yg.LIZIZ("ttlive_preview_FeedLiveViewHolderVM", "unSelectedReset: ");
            C1AC7 c1ac7 = C1AC7.LIZ;
            C1ACA c1acaDQ2 = feedLiveViewHolderVMY1.DQ2();
            c1ac7.getClass();
            C1AC7.LJI(c1acaDQ2);
            C1ACA c1acaDQ22 = feedLiveViewHolderVMY1.DQ2();
            boolean z3 = feedLiveViewHolderVMY1.LLIZ;
            DataChannel dataChannel = feedLiveViewHolderVMY1.getDataChannel();
            if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C749430TaX.class)) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1AC7.LJIIIIZZ(c1acaDQ22, z3, zBooleanValue);
            C1ACA c1acaDQ23 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ23 != null) {
                if (feedLiveViewHolderVMY1.LLLJIL) {
                    i = 6;
                } else {
                    i = 5;
                }
                c1acaDQ23.LJJIIJZLJL = i;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1AC7.LJIIL(feedLiveViewHolderVMY1.DQ2(), jCurrentTimeMillis, EnumC2175161AAw.UNSELECTED);
            InterfaceC2183451Acp interfaceC2183451Acp = (InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class);
            C1ACA c1acaDQ24 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ24 != null && (aweme4 = c1acaDQ24.LIZIZ) != null) {
                requestId = aweme4.getRequestId();
            } else {
                requestId = null;
            }
            C1ACA c1acaDQ25 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ25 != null && (interfaceC2175871ADp = c1acaDQ25.LJJJLIIL) != null && (c2175631ACrLIZ = interfaceC2175871ADp.LIZ(false)) != null) {
                str = c2175631ACrLIZ.LIZ;
            } else {
                str = null;
            }
            interfaceC2183451Acp.LJJIFFI(requestId, Intrinsics.LJFF(str, "guest"));
            awS612S0100000_33.invoke(Long.valueOf(jCurrentTimeMillis));
            if (!LivePreviewNonPlayEventLogSetting.INSTANCE.isDisable()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C1ACA c1acaDQ26 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ26 != null && (aweme3 = c1acaDQ26.LIZIZ) != null && (liveRoomStatesTags = aweme3.getLiveRoomStatesTags()) != null) {
                    for (LiveRoomStatesTag liveRoomStatesTag : liveRoomStatesTags) {
                        String str8 = liveRoomStatesTag.tagKey;
                        if (str8 != null && (str7 = liveRoomStatesTag.tagValue) != null) {
                            linkedHashMap.put(str8, str7);
                        }
                    }
                }
                C464220IIi c464220IIi = C464220IIi.LIZ;
                C1ACA c1acaDQ27 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ27 != null) {
                    str4 = c1acaDQ27.LJJLI;
                } else {
                    str4 = null;
                }
                long jFQ2 = feedLiveViewHolderVMY1.FQ2();
                String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                C1ACA c1acaDQ28 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ28 != null && (liveRoomStruct2 = c1acaDQ28.LIZJ) != null && (user5 = liveRoomStruct2.owner) != null) {
                    uid3 = user5.getUid();
                } else {
                    uid3 = null;
                }
                C1ACA c1acaDQ29 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ29 != null && (aweme2 = c1acaDQ29.LIZIZ) != null) {
                    requestId4 = aweme2.getRequestId();
                } else {
                    requestId4 = null;
                }
                C1ACA c1acaDQ210 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ210 != null) {
                    str5 = c1acaDQ210.LIZLLL;
                } else {
                    str5 = null;
                }
                C1ACA c1acaDQ211 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ211 != null && (liveRoomStruct = c1acaDQ211.LIZJ) != null) {
                    lValueOf3 = Long.valueOf(liveRoomStruct.id);
                } else {
                    lValueOf3 = null;
                }
                C1ACA c1acaDQ212 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ212 != null) {
                    str6 = c1acaDQ212.LJJJJI;
                } else {
                    str6 = null;
                }
                C464230IIj c464230IIj = new C464230IIj(strValueOf, uid3, requestId4, str5, "live_cell", "click", linkedHashMap, lValueOf3, str6);
                c464220IIi.getClass();
                if (str4 != null) {
                    C464220IIi.LIZ(str4, jFQ2, c464230IIj);
                }
            }
            feedLiveViewHolderVMY1.LLJILJILJ = true;
            feedLiveViewHolderVMY1.LLJILJIL = false;
            C1ACA c1acaDQ213 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ213 != null) {
                c1acaDQ213.LJII = false;
            }
            C1ACA c1acaDQ214 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ214 != null) {
                c1acaDQ214.LJIIZILJ = false;
            }
            C1ACA c1acaDQ215 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ215 != null) {
                c1acaDQ215.LJJIII = null;
            }
            C1ACA c1acaDQ216 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ216 != null) {
                c1acaDQ216.LLD = 0;
            }
            C1ACA c1acaDQ217 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ217 != null && (c1ado3 = c1acaDQ217.LJIIJ) != null) {
                c1ado3.LJFF = -1L;
            }
            C1ACA c1acaDQ218 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ218 != null && (c1ado2 = c1acaDQ218.LJIIJ) != null) {
                c1ado2.LIZJ = 0L;
            }
            C1ACA c1acaDQ219 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ219 != null && (c1ado = c1acaDQ219.LJIIJ) != null) {
                c1ado.LIZLLL = 0L;
            }
            C1ACA c1acaDQ220 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ220 != null && (c2175121AAs2 = c1acaDQ220.LJIIJJI) != null) {
                c2175121AAs2.LIZIZ = 0L;
                c2175121AAs2.LIZJ = 0L;
                c2175121AAs2.LIZLLL = 0L;
                c2175121AAs2.LJ = 0;
                c2175121AAs2.LJFF = -1L;
                c2175121AAs2.LIZ = false;
                c2175121AAs2.LJI = 0L;
                c2175121AAs2.LJII = 0L;
            }
            C1ACA c1acaDQ221 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ221 != null && (c2175121AAs = c1acaDQ221.LJIIJJI) != null) {
                C1ACA c1acaDQ222 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ222 != null) {
                    z2 = c1acaDQ222.LJIILIIL;
                } else {
                    z2 = false;
                }
                c2175121AAs.LIZ = z2;
            }
            C1ACA c1acaDQ223 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ223 != null && (set = c1acaDQ223.LJLJL) != null) {
                set.clear();
            }
            feedLiveViewHolderVMY1.LLJIJIL = false;
            feedLiveViewHolderVMY1.LLJ = false;
            feedLiveViewHolderVMY1.LLJJ = false;
            feedLiveViewHolderVMY1.LLILLJJLI = "";
            feedLiveViewHolderVMY1.LLILLL = "";
            feedLiveViewHolderVMY1.NQ2();
            feedLiveViewHolderVMY1.LLJJIJI.removeMessages(102);
            C1ACA c1acaDQ224 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ224 != null) {
                if (!c1acaDQ224.LJFF && ((Boolean) feedLiveViewHolderVMY1.LLLJ.getValue()).booleanValue()) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from_merge", c1acaDQ224.LIZLLL);
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    LiveRoomStruct liveRoomStruct3 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct3 != null && (user4 = liveRoomStruct3.owner) != null) {
                        uid2 = user4.getUid();
                    } else {
                        uid2 = null;
                    }
                    c2344009Gk.LJIIIIZZ("anchor_id", uid2);
                    LiveRoomStruct liveRoomStruct4 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct4 != null) {
                        lValueOf2 = Long.valueOf(liveRoomStruct4.id);
                    } else {
                        lValueOf2 = null;
                    }
                    c2344009Gk.LJ(lValueOf2, "room_id");
                    Aweme aweme5 = c1acaDQ224.LIZIZ;
                    if (aweme5 != null) {
                        requestId3 = aweme5.getRequestId();
                    } else {
                        requestId3 = null;
                    }
                    c2344009Gk.LJIIIIZZ("request_id", requestId3);
                    c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                    LiveRoomStruct liveRoomStruct5 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct5 != null && (user3 = liveRoomStruct5.owner) != null) {
                        numValueOf2 = Integer.valueOf(user3.getFollowStatus());
                    } else {
                        numValueOf2 = null;
                    }
                    c2344009Gk.LJ(numValueOf2, "follow_status");
                    c2344009Gk.LJIIIIZZ("request_type", feedLiveViewHolderVMY1.LLJI);
                    C20684815ws.LJIILLIIL("livesdk_finish_card_swipe", c2344009Gk.LIZ);
                }
                if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIILIIL("livesdk_live_abnormal_pass") && (str2 = feedLiveViewHolderVMY1.LLJILLL) != null) {
                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                    c2344009Gk2.LJIIIIZZ("enter_from_merge", c1acaDQ224.LIZLLL);
                    c2344009Gk2.LJIIIIZZ("enter_method", "live_cell");
                    c2344009Gk2.LJIIIIZZ("action_type", "click");
                    LiveRoomStruct liveRoomStruct6 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct6 != null && (user2 = liveRoomStruct6.owner) != null) {
                        uid = user2.getUid();
                    } else {
                        uid = null;
                    }
                    c2344009Gk2.LJIIIIZZ("anchor_id", uid);
                    LiveRoomStruct liveRoomStruct7 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct7 != null) {
                        lValueOf = Long.valueOf(liveRoomStruct7.id);
                    } else {
                        lValueOf = null;
                    }
                    c2344009Gk2.LJ(lValueOf, "room_id");
                    Aweme aweme6 = c1acaDQ224.LIZIZ;
                    if (aweme6 != null) {
                        requestId2 = aweme6.getRequestId();
                    } else {
                        requestId2 = null;
                    }
                    c2344009Gk2.LJIIIIZZ("request_id", requestId2);
                    LiveRoomStruct liveRoomStruct8 = c1acaDQ224.LIZJ;
                    if (liveRoomStruct8 != null && (user = liveRoomStruct8.owner) != null) {
                        numValueOf = Integer.valueOf(user.getFollowStatus());
                    } else {
                        numValueOf = null;
                    }
                    c2344009Gk2.LJ(numValueOf, "follow_status");
                    c2344009Gk2.LJIIIIZZ("abnormal_reason", str2);
                    if (C2093608Ic.LIZJ(feedLiveViewHolderVMY1.LLJI, "user_swipe")) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str3 = "1";
                    }
                    c2344009Gk2.LJIIIIZZ("is_auto_pass", str3);
                    C20684815ws.LJIILLIIL("livesdk_live_abnormal_pass", c2344009Gk2.LIZ);
                }
            }
            C1ACA c1acaDQ225 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ225 != null) {
                c1acaDQ225.LJIIIIZZ = -1;
            }
            C1ACA c1acaDQ226 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ226 != null) {
                c1acaDQ226.LJIJJLI = true;
            }
            C1ACA c1acaDQ227 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ227 != null) {
                c1acaDQ227.LJJIJ = 0;
            }
            C1ACA c1acaDQ228 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ228 != null) {
                c1acaDQ228.LJJJ = 0L;
            }
            C1ACA c1acaDQ229 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ229 != null) {
                c1acaDQ229.LJJJI = 0L;
            }
            C1ACA c1acaDQ230 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ230 != null) {
                c1acaDQ230.LJIJ = null;
            }
            C1ACA c1acaDQ231 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ231 != null) {
                c1acaDQ231.LJIJI = null;
            }
            C1ACA c1acaDQ232 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ232 != null) {
                c1acaDQ232.LJJIJIIJI = 0L;
            }
            C1ACA c1acaDQ233 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ233 != null) {
                c1acaDQ233.LJJZZIII = 0;
            }
            C1ACA c1acaDQ234 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ234 != null) {
                c1acaDQ234.LJLI = false;
            }
            C1ACA c1acaDQ235 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ235 != null) {
                c1acaDQ235.LJLIIIL = null;
            }
            C1ACA c1acaDQ236 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ236 != null) {
                c1acaDQ236.LJLIIL = false;
            }
            C1ACA c1acaDQ237 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ237 != null) {
                c1acaDQ237.LJJLIIIJ = null;
            }
            C1ACA c1acaDQ238 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ238 != null) {
                c1acaDQ238.LJLLLL = -1;
            }
            if (MultiGuestEnableFeedFullLinkTrackAddMultiParamsSetting.INSTANCE.isEnable() || LiveSdkEnableFeedLiveTrackAddMultiParamsSetting.INSTANCE.isEnable()) {
                C1ACA c1acaDQ239 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ239 != null) {
                    c1acaDQ239.LJJLIIIJJI = false;
                }
                C1ACA c1acaDQ240 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ240 != null) {
                    c1acaDQ240.LJJLIIIJJIZ = null;
                }
                C1ACA c1acaDQ241 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ241 != null) {
                    c1acaDQ241.LJJLIIIJL = 0;
                }
                C1ACA c1acaDQ242 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ242 != null) {
                    c1acaDQ242.LJJLIIIJLJLI = "";
                }
                feedLiveViewHolderVMY1.DQ2();
                C1ACA c1acaDQ243 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ243 != null) {
                    c1acaDQ243.LJJLIIIJLLLLLLLZ = 0;
                }
                C1ACA c1acaDQ244 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ244 != null) {
                    c1acaDQ244.LJJLIIJ = "";
                }
            }
            C1ACA c1acaDQ245 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ245 != null) {
                c1acaDQ245.LJLJI = -1L;
            }
            C1ACA c1acaDQ246 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ246 != null) {
                c1acaDQ246.LJLJJI = -1L;
            }
            C1ACA c1acaDQ247 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ247 != null) {
                c1acaDQ247.LJLJJL = -1;
            }
            C1ACA c1acaDQ248 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ248 != null) {
                c1acaDQ248.LJLJJLL = "none";
            }
            C1ACA c1acaDQ249 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ249 != null) {
                c1acaDQ249.LJLLI = 0;
            }
            C1ACA c1acaDQ250 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ250 != null) {
                c1acaDQ250.LJLLILLLL = 0L;
            }
            C1ACA c1acaDQ251 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ251 != null) {
                c1acaDQ251.LJLLJ = 0L;
            }
            C1ACA c1acaDQ252 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ252 != null) {
                c1acaDQ252.LJLLL = 0L;
            }
            C1ACA c1acaDQ253 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ253 != null) {
                c1acaDQ253.LLF = 0;
            }
            feedLiveViewHolderVMY1.DQ2();
            C1ACA c1acaDQ254 = feedLiveViewHolderVMY1.DQ2();
            if (c1acaDQ254 != null) {
                c1acaDQ254.LLFF = false;
            }
            feedLiveViewHolderVMY1.DQ2();
            feedLiveViewHolderVMY1.LLLII = 0L;
            feedLiveViewHolderVMY1.LLLIIII = 0L;
            C1AD2 c1ad2 = feedLiveViewHolderVMY1.LLLI;
            c1ad2.getClass();
            c1ad2.LIZ = EnumC1488260opc.IDLE;
            aid = null;
            c1ad2.LIZIZ = null;
            c1ad2.LIZJ = 0L;
            c1ad2.LJ = 0L;
            c1ad2.LIZLLL = null;
            feedLiveViewHolderVMY1.LLLFF = C1ACS.IDLE;
        } else {
            aid = null;
        }
        if (((Boolean) C285930BIp.LIZ.getValue()).booleanValue()) {
            LivePreviewPlayerVM livePreviewPlayerVMA12 = A1();
            if (livePreviewPlayerVMA12 != null) {
                livePreviewPlayerVMA12.yQ2("performViewHolderUnSelected", false);
            }
        } else {
            LivePreviewPlayerVM livePreviewPlayerVMA13 = A1();
            if (livePreviewPlayerVMA13 != null) {
                BQ2 = livePreviewPlayerVMA13.BQ2();
            } else {
                BQ2 = aid;
            }
            if (C293620Bf6.LIZ(BQ2) && (livePreviewPlayerVMA1 = A1()) != null) {
                livePreviewPlayerVMA1.JQ2("performViewHolderUnSelected");
            }
        }
        ViewHolderStatusVM viewHolderStatusVMB12 = B1();
        if (viewHolderStatusVMB12 != null) {
            C20441214yg.LJIIIZ("ViewHolderStatusVM.kt", "onViewHolderUnSelected");
            viewHolderStatusVMB12.LLJJ = false;
            viewHolderStatusVMB12.LLJJI.setValue(Integer.valueOf(C1ACT.UNSELECTED.getState()));
            C19386510sx<String> c19386510sx = viewHolderStatusVMB12.LLIZLLLIL;
            C1ACA c1aca = (C1ACA) viewHolderStatusVMB12.LL.getValue();
            if (c1aca != null && (aweme = c1aca.LIZIZ) != null) {
                aid = aweme.getAid();
            }
            c19386510sx.LIZ(aid);
        }
        LivePreviewFollowVM livePreviewFollowVM = (LivePreviewFollowVM) this.LLJILJIL.getValue();
        if (livePreviewFollowVM != null) {
            livePreviewFollowVM.wQ2();
        }
        LivePreviewBottomCardVM livePreviewBottomCardVM = (LivePreviewBottomCardVM) this.LLJJIII.getValue();
        if (livePreviewBottomCardVM != null) {
            livePreviewBottomCardVM.LLILZ = false;
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LLJILJILJ.getValue();
        if (maskLayerAndWarningVM != null) {
            C1AC7 c1ac72 = C1AC7.LIZ;
            C1ACA c1aca2 = (C1ACA) maskLayerAndWarningVM.LL.getValue();
            boolean zVQ2 = maskLayerAndWarningVM.vQ2();
            c1ac72.getClass();
            C1AC7.LJIIIZ(c1aca2, false, zVQ2);
            maskLayerAndWarningVM.LLILZ = 100;
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVMZ1 = z1();
        if (livePreviewGuideEnterVMZ1 != null) {
            livePreviewGuideEnterVMZ1.vz2();
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LLJJIJI.getValue();
        if (subscribeMaskLayerVM != null) {
            subscribeMaskLayerVM.vQ2(false);
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM2 = (SubscribeMaskLayerVM) this.LLJJIJI.getValue();
        if (subscribeMaskLayerVM2 != null && (nextLiveData = subscribeMaskLayerVM2.LLILLL) != null) {
            nextLiveData.setValue(new C1ABF());
        }
        IMessageManager iMessageManager = this.LLIZ.LJJIIZ;
        if (iMessageManager != null) {
            iMessageManager.stopMessage(new C2222371ByV(true, true, LiveMessagePreviewSetting.INSTANCE.getValue().getStopDisconnectWsDelay()));
        }
        ((Handler) this.LLJJJJLIIL.getValue()).removeCallbacksAndMessages(this.LLJJJJJIL);
        if (LiveNetworkCtlSetting.INSTANCE.isEnable() && C588730N7f.LIZ) {
            C588730N7f.LIZ = false;
            C823050WQl.LIZJ().execute(RunnableC1206180hUe.LL);
        }
    }

    public final void onEvent(C257100z3 c257100z3) {
        FollowPair followPair;
        C1ACA c1aca;
        LiveRoomStruct liveRoomStruct;
        User user;
        if (c257100z3 != null && (followPair = c257100z3.LIZ) != null && (liveRoomStruct = (c1aca = this.LLIZ).LIZJ) != null && followPair.LIZ == liveRoomStruct.ownerUserId) {
            Aweme aweme = c1aca.LIZIZ;
            if (aweme != null) {
                AwemeBizExtKt.setRealtimeFollowStatus(aweme, followPair.followStatus);
            }
            LiveRoomStruct liveRoomStruct2 = this.LLIZ.LIZJ;
            if (liveRoomStruct2 != null && (user = liveRoomStruct2.owner) != null) {
                user.setFollowStatus(followPair.followStatus);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFeedSwipeToNextEvent(C466430IQv c466430IQv) {
        C1ACA c1aca = this.LLIZ;
        if (c1aca.LLFII && c1aca.LJII) {
            this.LLJJJIL = true;
            this.LLJJJJ = c466430IQv.LIZ;
        }
    }

    @C14EU
    public final void onFollowLiveStatusChange(C479910Irt c479910Irt) {
        LiveRoomStruct liveRoomStruct = this.LLILZIL;
        if (liveRoomStruct != null && liveRoomStruct.id == c479910Irt.LIZ && c479910Irt.LIZJ) {
            FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
            if (feedLiveViewHolderVMY1 != null) {
                C1ACA c1acaDQ2 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ2 != null) {
                    c1acaDQ2.LJFF = false;
                }
                C1ACA c1acaDQ22 = feedLiveViewHolderVMY1.DQ2();
                if (c1acaDQ22 != null) {
                    c1acaDQ22.LJI = EnumC1154970gA3.CHECK_ALIVE_STATE_END;
                }
                feedLiveViewHolderVMY1.LLJIJIL = true;
                feedLiveViewHolderVMY1.LLIZLLLIL = "normal";
            }
            LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
            if (livePreviewPlayerVMA1 != null) {
                livePreviewPlayerVMA1.LLJLLIL.LJJIII(false);
            }
            E1();
            LivePreviewPlayerVM livePreviewPlayerVMA12 = A1();
            if (livePreviewPlayerVMA12 != null) {
                livePreviewPlayerVMA12.yQ2("onFollowLiveStatusChange", true);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onReportReceive(C1210440hbW c1210440hbW) {
        String aid;
        NextLiveData<Boolean> nextLiveData;
        String str = c1210440hbW.LIZ;
        Aweme aweme = this.LLILZ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
            if (feedLiveViewHolderVMY1 != null && (nextLiveData = feedLiveViewHolderVMY1.LLJLILLLLZIIL) != null) {
                nextLiveData.setValue(Boolean.FALSE);
            }
            String str2 = c1210440hbW.LIZ;
            if (str2 != null) {
                C692060RCq.LIZ.add(str2);
            } else {
                Set<String> set = C692060RCq.LIZ;
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSmoothExitEvent(C08LW c08lw) {
        Long l;
        C1ACV c1acv;
        LiveRoomStruct liveRoomStruct;
        LivePreviewPlayerVM livePreviewPlayerVMA1;
        com.bytedance.android.widget.NextLiveData nextLiveData;
        NextLiveData<C998890c6J> nextLiveData2;
        C998890c6J value;
        FeedLiveViewHolderVM feedLiveViewHolderVMY1;
        NextLiveData<C998890c6J> nextLiveData3;
        LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJ.getValue();
        if ((livePreviewHighlightsPlayerVM == null || !livePreviewHighlightsPlayerVM.xQ2()) && c08lw != null && (l = c08lw.LIZ) != null) {
            long jLongValue = l.longValue();
            C1ACA c1aca = this.LLIZ;
            if (c1aca.LLFFF && c1aca.LJII && ((c1acv = c1aca.LJJLIL) == null || !c1acv.LJFF())) {
                LiveCadSmoothExitSetting liveCadSmoothExitSetting = LiveCadSmoothExitSetting.INSTANCE;
                C1440005kM.LIZ(new C083S(true, liveCadSmoothExitSetting.getPreviewCardDuration()));
                FeedLiveViewHolderVM feedLiveViewHolderVMY12 = y1();
                if (feedLiveViewHolderVMY12 != null && (nextLiveData2 = feedLiveViewHolderVMY12.LLJJJJ) != null && (value = nextLiveData2.getValue()) != null && value.LIZ && (feedLiveViewHolderVMY1 = y1()) != null && (nextLiveData3 = feedLiveViewHolderVMY1.LLJJJJ) != null) {
                    nextLiveData3.setValue(new C998890c6J(false, liveCadSmoothExitSetting.getPreviewCardDuration()));
                }
                if (c08lw.LIZJ && (liveRoomStruct = this.LLIZ.LIZJ) != null && liveRoomStruct.id == jLongValue && (livePreviewPlayerVMA1 = A1()) != null && (nextLiveData = livePreviewPlayerVMA1.LLJI) != null) {
                    nextLiveData.setValue(Boolean.TRUE);
                }
            }
            LivePreviewPlayerVM livePreviewPlayerVMA12 = A1();
            if (livePreviewPlayerVMA12 != null) {
                livePreviewPlayerVMA12.LLJLLIL.changeLowLatencyMode(false);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onWatchRoomTimeEvent(C7804033a c7804033a) {
        Long lValueOf;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        AILivePreviewHighlight aILivePreviewHighlight;
        if (c7804033a != null) {
            Long l = c7804033a.LIZ;
            LiveRoomStruct liveRoomStruct = this.LLIZ.LIZJ;
            if (liveRoomStruct != null) {
                lValueOf = Long.valueOf(liveRoomStruct.id);
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(l, lValueOf)) {
                C1ACA c1aca = this.LLIZ;
                LiveRoomStruct liveRoomStruct2 = c1aca.LIZJ;
                if (liveRoomStruct2 != null && (aILivePreviewHighlight = liveRoomStruct2.aiLivePreviewHighlight) != null) {
                    c1aca.LJIILIIL = false;
                    C2175121AAs c2175121AAs = c1aca.LJIIJJI;
                    c2175121AAs.LIZIZ = 0L;
                    c2175121AAs.LIZJ = 0L;
                    c2175121AAs.LIZLLL = 0L;
                    c2175121AAs.LJ = 0;
                    c2175121AAs.LJFF = -1L;
                    c2175121AAs.LIZ = false;
                    c2175121AAs.LJI = 0L;
                    c2175121AAs.LJII = 0L;
                    C20448214zo.LIZJ.add(aILivePreviewHighlight);
                }
                LivePreviewPlayerVM livePreviewPlayerVMA1 = A1();
                if (livePreviewPlayerVMA1 != null && (mutableLiveData2 = livePreviewPlayerVMA1.LLJILJIL) != null) {
                    mutableLiveData2.setValue(Boolean.TRUE);
                }
                LivePreviewHighlightsPlayerVM livePreviewHighlightsPlayerVM = (LivePreviewHighlightsPlayerVM) this.LLJ.getValue();
                if (livePreviewHighlightsPlayerVM != null && (mutableLiveData = livePreviewHighlightsPlayerVM.LLILLJJLI) != null) {
                    mutableLiveData.setValue(Boolean.TRUE);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    public final void uq(C1365870leD c1365870leD) {
        LivePreviewShareVM livePreviewShareVM = (LivePreviewShareVM) this.LLJILLL.getValue();
        if (livePreviewShareVM != null && c1365870leD != null) {
            livePreviewShareVM.LLILLJJLI.setValue(c1365870leD);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder
    public final void x1(Aweme aweme) {
        LivePreviewPlayerWidget livePreviewPlayerWidget;
        F1(aweme);
        LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = this.LLJJIJIIJIL;
        if (livePreviewControlPlayLayerWidget != null && (livePreviewPlayerWidget = livePreviewControlPlayLayerWidget.LLJJIJI) != null) {
            EnumC2175041AAk enumC2175041AAk = EnumC2175041AAk.COLD_START;
            int i = LivePreviewPlayerWidget.LLLF;
            livePreviewPlayerWidget.V1(enumC2175041AAk);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1594770rbP c1594770rbP) {
        FeedLiveViewHolderVM feedLiveViewHolderVMY1;
        LiveRoomStruct liveRoomStruct = this.LLILZIL;
        if (liveRoomStruct != null && c1594770rbP.LIZ == liveRoomStruct.id && (feedLiveViewHolderVMY1 = y1()) != null) {
            feedLiveViewHolderVMY1.KQ2(false, this.context, "normal", false, false, false, 1, null, false, 0);
        }
    }

    @C14EU
    public final void onEvent(C0IHI c0ihi) {
        LiveRoomStruct liveRoomStruct = this.LLILZIL;
        if (liveRoomStruct != null && liveRoomStruct.id == c0ihi.LIZ) {
            C1440005kM.LIZ(new C1210880hcE(this.LLIZ.LJ, "FUNCTION_FROM_DEFAULT", "live_kick_off", this.LLILZ));
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C466460IQy c466460IQy) {
        NextLiveData<Boolean> nextLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null && (nextLiveData = feedLiveViewHolderVMY1.LLJLILLLLZIIL) != null) {
            nextLiveData.setValue(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Type inference failed for: r0v41, types: [X.1AD1] */
    @Override // com.ss.android.ugc.aweme.feed.adapter.BaseFeedLiveViewHolder, X.C0SZ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ(int r13, com.ss.android.ugc.aweme.feed.model.Aweme r14) {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2.LJJJJ(int, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARN: Type inference failed for: r2v37, types: [X.1ACW] */
    public FeedLiveViewHolderNewV2(View view, final Fragment fragment, final String str) {
        Lifecycle lifecycle;
        super(view, fragment);
        C1ACA c1aca = new C1ACA(null, null, null, str, 0, -17);
        this.LLIZ = c1aca;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 453);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLIZLLLIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, c5182020e, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewHighlightsPlayerVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ2, 454), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ3, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ3, 455), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ViewHolderStatusVM.class);
        this.LLJIJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ4, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ4, 456), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(LivePreviewFollowVM.class);
        this.LLJILJIL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ5, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ5, 457), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(MaskLayerAndWarningVM.class);
        this.LLJILJILJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ6, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ6, 458), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ7 = C13LE.LIZ(LivePreviewShareVM.class);
        this.LLJILLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ7, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ7, 459), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ8 = C13LE.LIZ(VideoBottomBlockVM.class);
        this.LLJJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ8, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ8, 460), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ9 = C13LE.LIZ(LivePreviewGuideEnterVM.class);
        this.LLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ9, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ9, 461), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ10 = C13LE.LIZ(LivePreviewBottomCardVM.class);
        this.LLJJIII = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ10, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ10, 451), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ11 = C13LE.LIZ(SubscribeMaskLayerVM.class);
        this.LLJJIJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ11, enumC494740Jai, new C5182020e((C13IQ) c19719912DlLIZ11, 452), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.view_rootview);
        this.LLJJJ = viewGroup;
        this.LLJJJJJIL = "live_fyp_feedSwipeToken";
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(534));
        this.LLJJL = new InterfaceC1585190rLx() { // from class: X.1ACW
            @Override // X.InterfaceC1585190rLx
            public final void p1(String str2, String str3) {
                LivePreviewPlayerVM livePreviewPlayerVMA1;
                String str4;
                FeedLiveViewHolderNewV2 feedLiveViewHolderNewV2 = this.LL;
                if (feedLiveViewHolderNewV2.LLIZ.LJII && (livePreviewPlayerVMA1 = feedLiveViewHolderNewV2.A1()) != null) {
                    FeedLiveViewHolderNewV2 feedLiveViewHolderNewV22 = this.LL;
                    String str5 = str;
                    feedLiveViewHolderNewV22.getClass();
                    if (Intrinsics.LJFF(str5, "homepage_hot")) {
                        str4 = "For You";
                    } else if (Intrinsics.LJFF(str5, "homepage_follow")) {
                        str4 = "Following";
                    } else {
                        str4 = "";
                    }
                    livePreviewPlayerVMA1.LLJLLIL.LJJJJL(Intrinsics.LJFF(str3, str4));
                }
            }
        };
        RecyclableWidgetManager recyclableWidgetManagerOf = RecyclableWidgetManager.of(fragment, this, view, LiveWidgetProvider.Companion.getInstance(), (FluencyOpt) null);
        setWidgetCallback(recyclableWidgetManagerOf.widgetCallback);
        this.dataChannel.SX0(C748910TZh.class, c1aca);
        recyclableWidgetManagerOf.createWidget(view, this);
        FeedLiveViewHolderVM feedLiveViewHolderVMY1 = y1();
        if (feedLiveViewHolderVMY1 != null) {
            feedLiveViewHolderVMY1.LLLIIIL = BtmSDK.INSTANCE.getPageId(PageFinder.via(fragment));
        }
        enablePreviewSubWidgetManager();
        View viewFindViewById = view.findViewById(R.id.view_rootview);
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        LivePreviewControlPlayLayerWidget livePreviewControlPlayLayerWidget = new LivePreviewControlPlayLayerWidget(view, str);
        recyclableWidgetManager.createWidget(viewFindViewById, livePreviewControlPlayLayerWidget);
        this.LLJJIJIIJIL = livePreviewControlPlayLayerWidget;
        this.subWidgetManager.createWidget(viewFindViewById, new LivePreviewInteractionLayerWidget(view, str));
        this.subWidgetManager.createWidget(viewFindViewById, new LivePreviewTopMaskLayerWidget(view, str));
        this.subWidgetManager.createWidget(viewFindViewById, new LivePreviewNoInteractLayerWidget(view));
        if (C486790J7d.LIZIZ()) {
            D1();
        } else {
            C486790J7d.LIZJ(new ARunnableS128S0100000_28(this, 112));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVMY12 = y1();
        if (feedLiveViewHolderVMY12 != null) {
            feedLiveViewHolderVMY12.LLJLIL = new AObjectS375S0100000_33(this, 1);
        }
        C512350K7l.LIZ.getClass();
        C755980Tl6.LIZ().LJIIIZ = RunnableC755950Tl3.LL;
        C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJIIJ().LIZ(viewGroup, this);
        if (LivePerformanceOptSetting.enableLiveHolderV2MemOpt() && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNewV2.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    Lifecycle lifecycle2;
                    LiveWidgetProvider.Companion.getInstance().clearWidgetCache(FeedLiveViewHolderNewV2.this.getClass());
                    Fragment fragment2 = fragment;
                    if (fragment2 == null || (lifecycle2 = fragment2.getLifecycle()) == null) {
                        return;
                    }
                    lifecycle2.removeObserver(this);
                }
            });
        }
    }
}
