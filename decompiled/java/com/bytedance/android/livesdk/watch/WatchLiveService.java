package com.bytedance.android.livesdk.watch;

import X.AbstractC19484711Kz;
import X.AbstractC464380IIy;
import X.AbstractC484600IzS;
import X.C01GW;
import X.C098200Yq;
import X.C09JN;
import X.C0IFB;
import X.C0IFM;
import X.C0IFS;
import X.C0IGU;
import X.C0IH6;
import X.C0IHN;
import X.C0IIS;
import X.C0IJ7;
import X.C0IKG;
import X.C0IKH;
import X.C0IL2;
import X.C0IO1;
import X.C0IR8;
import X.C0IT5;
import X.C0IUA;
import X.C0IWZ;
import X.C0J0Q;
import X.C0J1N;
import X.C0J3Y;
import X.C0J4A;
import X.C0UO0;
import X.C1084940eL6;
import X.C1106210etP;
import X.C1148390fzR;
import X.C1161920gLG;
import X.C11NZ;
import X.C11RD;
import X.C11S5;
import X.C1276840jKc;
import X.C13LP;
import X.C1834150xpV;
import X.C189200o6;
import X.C19EG;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C463160IEg;
import X.C463620IGa;
import X.C463700IGi;
import X.C463900IHc;
import X.C464740IKi;
import X.C464770IKl;
import X.C465230IMf;
import X.C466240IQc;
import X.C466510IRd;
import X.C466820ISi;
import X.C467220ITw;
import X.C468990IaH;
import X.C469060IaO;
import X.C469070IaP;
import X.C469090IaR;
import X.C469110IaT;
import X.C469120IaU;
import X.C469140IaW;
import X.C469220Iae;
import X.C469660IbM;
import X.C472280Ifa;
import X.C473600Ihi;
import X.C480460Ism;
import X.C483010Iwt;
import X.C483100Ix2;
import X.C483390IxV;
import X.C483410IxX;
import X.C484630IzV;
import X.C485730J3b;
import X.C485760J3e;
import X.C516201zk;
import X.C516401zm;
import X.C784440Upu;
import X.C786410Ut5;
import X.C823050WQl;
import X.C924810aAp;
import X.C930940aKi;
import X.EnumC469210Iad;
import X.EnumC485780J3g;
import X.InterfaceC469080IaQ;
import X.InterfaceC469100IaS;
import X.RunnableC514501zT;
import X.RunnableC519000KXa;
import X.ViewOnTouchListenerC473590Ihh;
import Y.ARunnableS86S0000000_7;
import Y.AfS0S0101100_7;
import Y.AfS1S0201100_7;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.hashtag.IHashTagService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.competition.service.ILiveCompetitionExternalService;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.live.userinfowidget.IUserInfoWidgetService;
import com.bytedance.android.livesdk.LiveRoomFragment;
import com.bytedance.android.livesdk.chatroom.bl.enterroomboost.LiveEnterRoomUpdateSetting;
import com.bytedance.android.livesdk.chatroom.helper.AudienceLivePlayTaskManager;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CloseWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveDrawerEntranceWidget;
import com.bytedance.android.livesdk.chatroom.widget.survey.feedback.LightSurveyFeedbackSheet;
import com.bytedance.android.livesdk.cla.StreamTranslationAPI;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SwitchTranslationStream;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.bytedance.android.livesdk.drawerfeed.LiveNonPersonalizedDialog;
import com.bytedance.android.livesdk.livesetting.other.IncreaseSDKRegistrationOptimize;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.other.ToolbarTipsExperiment;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnterRoomClickPerfOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveInteractViewAsyncOpt;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetQuickReturnReuseSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.IncreaseStrategySetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetRecyableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFollowGuideNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerFeedLoadMorePreloadEarly;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStaticLogOptSetting;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdk.pip.PipSwitchDialog;
import com.bytedance.android.livesdk.ultralitemode.LiveAdaptiveLiteModeDialog;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProviderProxy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.adapter.widget.survey.PreviewSurveyViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.consumefeature.LiveConsumeFeatureManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS61S0210000_7;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import webcast.api.feed.SortStatsTag;
import webcast.api.room.ShowMode;
import webcast.api.room.StrategyData;
import webcast.api.room.StrategyFilter;
import webcast.api.room.WebcastRoomSwitchStreamLanguageResponse;

/* JADX INFO: loaded from: classes8.dex */
public class WatchLiveService implements IWatchLiveService {
    public int LL;

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void clearSafeZone() {
        ViewOnTouchListenerC473590Ihh.LLIZLLLIL = null;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Ai() {
        C01GW c01gw = LiveConsumeFeatureManager.LIZ;
        if (LiveConsumeFeatureManager.LIZJ) {
            return;
        }
        AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0IaX
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$1");
                Long lLJIILIIL = C2095008Iq.LJIILIIL(LiveConsumeFeatureManager.LIZ().getString("live_consume_info_cache_time_stamp", ""));
                if ((lLJIILIIL != null ? lLJIILIIL.longValue() : 0L) - System.currentTimeMillis() <= 86400000 && (string = LiveConsumeFeatureManager.LIZ().getString("live_consume_info_cache", "")) != null && string.length() != 0) {
                    ArrayList<LiveConsumeFeatureManager.ConsumeInfo> arrayList = (ArrayList) GsonProtectorUtils.fromJson(C293501Bt.LIZ(), string, new TypeToken<ArrayList<LiveConsumeFeatureManager.ConsumeInfo>>() { // from class: X.0Iaa
                    }.getType());
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(GsonProtectorUtils.toJson(C293501Bt.LIZ(), it2.next()));
                    }
                    ArrayList<LiveConsumeFeatureManager.ConsumeInfo> arrayList3 = new ArrayList();
                    C2099208Kg<String, LiveConsumeFeatureManager.ConsumeInfo> c2099208Kg = LiveConsumeFeatureManager.LJFF;
                    arrayList3.addAll(c2099208Kg.values());
                    c2099208Kg.clear();
                    for (LiveConsumeFeatureManager.ConsumeInfo consumeInfo : arrayList) {
                        C2099208Kg<String, LiveConsumeFeatureManager.ConsumeInfo> c2099208Kg2 = LiveConsumeFeatureManager.LJFF;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(consumeInfo.getRoomId());
                        sbLIZ.append('_');
                        sbLIZ.append(consumeInfo.isPreview());
                        c2099208Kg2.put(C2188811AlT.LIZIZ(sbLIZ), consumeInfo);
                    }
                    for (LiveConsumeFeatureManager.ConsumeInfo consumeInfo2 : arrayList3) {
                        C2099208Kg<String, LiveConsumeFeatureManager.ConsumeInfo> c2099208Kg3 = LiveConsumeFeatureManager.LJFF;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(consumeInfo2.getRoomId());
                        sbLIZ2.append('_');
                        sbLIZ2.append(consumeInfo2.isPreview());
                        c2099208Kg3.put(C2188811AlT.LIZIZ(sbLIZ2), consumeInfo2);
                    }
                    LiveConsumeFeatureManager.LIZLLL();
                    LiveConsumeFeatureManager.LIZ().erase("live_consume_info_cache");
                    LiveConsumeFeatureManager.LIZ().erase("live_consume_info_cache_time_stamp");
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$1");
                return unit;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0IaK
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$2");
                C01GW c01gw2 = LiveConsumeFeatureManager.LIZ;
                LiveConsumeFeatureManager.LIZJ = true;
                C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$2");
            }
        }, new C09JN() { // from class: X.0IaL
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$3");
                C01GW c01gw2 = LiveConsumeFeatureManager.LIZ;
                LiveConsumeFeatureManager.LIZJ = true;
                C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.refreshWhenColdStart$3");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean F10() {
        C464740IKi c464740IKi = C0IH6.LIZ;
        return c464740IKi != null && c464740IKi.LJIIIIZZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void JT1() {
        Object next;
        Iterator it2 = ((ArrayList) C469070IaP.LIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (((AbstractC484600IzS) next).LIZIZ() == 9) {
                    break;
                }
            }
        }
        AbstractC484600IzS abstractC484600IzS = (AbstractC484600IzS) next;
        if (abstractC484600IzS != null) {
            abstractC484600IzS.LJII();
            ((ArrayList) C469070IaP.LIZ).remove(abstractC484600IzS);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void MW() {
        LiveConsumeFeatureManager.LJ.clear();
        LiveConsumeFeatureManager.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C463900IHc Mi() {
        C01GW<C463900IHc> c01gw = C463900IHc.LJIIJJI;
        return C0IFB.LIZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean Na() {
        C464770IKl c464770IKl = C464770IKl.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C464770IKl.LIZIZ);
        sbLIZ.append('_');
        sbLIZ.append(C464770IKl.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if ((TextUtils.equals("balance_live_head", strLIZIZ) || TextUtils.equals("balance_balance_rec_watch", strLIZIZ)) && TextUtils.equals("follow_recommend", C0IUA.LJIILLIIL)) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C0IUA.LJIILLIIL);
        sbLIZ2.append('_');
        sbLIZ2.append(C0IUA.LJIIZILJ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        return TextUtils.equals("balance_balance_rec_explore", strLIZIZ2) || TextUtils.equals("balance_balance_non_rec_watch", strLIZIZ2);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void R81() {
        long jCurrentTimeMillis;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        if (enterRoomConfig == null || (roomsData = enterRoomConfig.mRoomsData) == null || (timeStamp = roomsData.timeStamps) == null || timeStamp.enterRoomStarTimeReal <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            EnterRoomConfig.TimeStamp timeStamp2 = enterRoomConfig.mRoomsData.timeStamps;
            jCurrentTimeMillis = timeStamp2 != null ? timeStamp2.enterRoomStarTimeReal : 0L;
        }
        C463160IEg.LIZLLL = jCurrentTimeMillis;
        C463160IEg.LIZJ = 0L;
        C463160IEg.LIZIZ = 0L;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Uw1() {
        Iterator it2 = ((ArrayList) C469070IaP.LIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC484600IzS) it2.next()).LJII();
        }
        ((ArrayList) C469070IaP.LIZ).clear();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List<Class<? extends IRecyclableWidget>> XT1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ISlotService) C1161920gLG.LIZJ(ISlotService.class)).getFrameL3SlotWidget());
        Class<? extends LiveRecyclableWidget> clsSp2 = ((IUserInfoWidgetService) C1161920gLG.LIZJ(IUserInfoWidgetService.class)).Sp2();
        if (clsSp2 != null) {
            arrayList.add(clsSp2);
        }
        Class<? extends LiveRecyclableWidget> clsKK1 = ((ICommentService) C1161920gLG.LIZJ(ICommentService.class)).KK1();
        if (clsKK1 != null) {
            arrayList.add(clsKK1);
        }
        Class<? extends LiveRecyclableWidget> clsYE2 = ((IHashTagService) C1161920gLG.LIZJ(IHashTagService.class)).YE2();
        if (clsYE2 != null) {
            arrayList.add(clsYE2);
        }
        Class clsVP1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).VP1();
        if (clsVP1 != null) {
            arrayList.add(clsVP1);
        }
        arrayList.add(LiveDrawerEntranceWidget.class);
        arrayList.add(CloseWidget.class);
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean YF1() {
        C467220ITw.LIZ.getClass();
        if (C467220ITw.LIZIZ) {
            return false;
        }
        C467220ITw.LIZIZ = true;
        return C467220ITw.LJFF;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final String Ze0() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        return (room == null || room.roomLayout != 2) ? (iInteractService.Nt() || ((ILiveCompetitionExternalService) C1161920gLG.LIZJ(ILiveCompetitionExternalService.class)).v91()) ? "video_anchor_pk" : iInteractService.w9() ? "video_anchor_connect" : C924810aAp.LJ().LJIILIIL ? "video_anchor_guest_connect" : "normal_video_live" : "video_anchor_order";
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List<C0IHN> en0() {
        C469060IaO.LIZ.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) C469060IaO.LIZIZ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC469100IaS) it2.next()).LIZ());
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final int getInternalWindowState() {
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        return ViewOnTouchListenerC473590Ihh.LLILLJJLI.ordinal();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void hideInternalWindow() {
        ViewOnTouchListenerC473590Ihh.LL.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean isInternalWindowUserManualMute() {
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        return ViewOnTouchListenerC473590Ihh.LLILZIL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final Map<String, String> jh0() {
        String strLJIL;
        String strLJIL2;
        String strLJIL3;
        String strLJIL4;
        Float fLJIIIIZZ;
        JSONObject jSONObjectLJI;
        HashMap map = new HashMap();
        String str = "";
        if (LiveStaticLogOptSetting.enable()) {
            InterfaceC469080IaQ interfaceC469080IaQ = (InterfaceC469080IaQ) DataChannelGlobal.LLILZ.gg0(C1148390fzR.class);
            if (interfaceC469080IaQ == null || (strLJIL = interfaceC469080IaQ.LJIL(315)) == null) {
                strLJIL = "";
            }
            map.put("stream_fps", strLJIL);
            map.put("render_fps", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Float.valueOf((interfaceC469080IaQ == null || (strLJIL4 = interfaceC469080IaQ.LJIL(314)) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strLJIL4)) == null) ? -1.0f : fLJIIIIZZ.floatValue())}, 1)));
            String strLJIL5 = null;
            if (interfaceC469080IaQ != null) {
                strLJIL2 = interfaceC469080IaQ.LJIL(305);
                strLJIL5 = interfaceC469080IaQ.LJIL(306);
            } else {
                strLJIL2 = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIL2);
            sbLIZ.append('*');
            sbLIZ.append(strLJIL5);
            map.put("stream_resolution", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC469080IaQ != null && (strLJIL3 = interfaceC469080IaQ.LJIL(312)) != null) {
                str = strLJIL3;
            }
            map.put("decode_type", str);
            C1276840jKc.LIZ.getClass();
            map.put("live_last_effect_id", C1276840jKc.LJIJJ());
            map.put("live_last_resource_id", C1276840jKc.LJIL());
        } else {
            InterfaceC469080IaQ interfaceC469080IaQ2 = (InterfaceC469080IaQ) DataChannelGlobal.LLILZ.gg0(C1148390fzR.class);
            if (interfaceC469080IaQ2 != null && (jSONObjectLJI = interfaceC469080IaQ2.LJI()) != null) {
                map.put("stream_fps", jSONObjectLJI.optString("push_client_fps:", ""));
                map.put("render_fps", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(jSONObjectLJI.optDouble("render_fps:", -1.0d))}, 1)));
                String strOptString = jSONObjectLJI.optString("width:");
                String strOptString2 = jSONObjectLJI.optString("height:");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strOptString);
                sbLIZ2.append('*');
                sbLIZ2.append(strOptString2);
                map.put("stream_resolution", C2188811AlT.LIZIZ(sbLIZ2));
                map.put("decode_type", jSONObjectLJI.optString("HardDecode:", ""));
                C1276840jKc.LIZ.getClass();
                map.put("live_last_effect_id", C1276840jKc.LJIJJ());
                map.put("live_last_resource_id", C1276840jKc.LJIL());
            }
        }
        map.put("live_room_watch_duration", C469120IaU.LIZ(C463700IGi.LIZ > 0 ? SystemClock.elapsedRealtime() - C463700IGi.LIZ : 0L));
        map.put("live_activity_watch_duration", C469120IaU.LIZ(C463700IGi.LIZIZ > 0 ? SystemClock.elapsedRealtime() - C463700IGi.LIZIZ : 0L));
        return map;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean r8() {
        return LiveEnterRoomUpdateSetting.INSTANCE.enableForPreview();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean re() {
        C464770IKl c464770IKl = C464770IKl.LIZ;
        String strLIZLLL = C464770IKl.LIZLLL();
        return TextUtils.equals("mobile_consumption_live_head", strLIZLLL) || TextUtils.equals("mobile_consumption_rec_watch", strLIZLLL) || TextUtils.equals("follow_recommend_mobile_consumption", strLIZLLL);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void resetUserManualMuteClickState() {
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        ViewOnTouchListenerC473590Ihh.LLILZIL = false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final List<ILiveRoomStatusNewListener> rq1() {
        C469060IaO.LIZ.getClass();
        return C13LP.LLIIII(ServiceManager.get().getServices(ILiveRoomStatusNewListener.class));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveNonPersonalizedDialog xd() {
        return new LiveNonPersonalizedDialog();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean zp0() {
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        return (ViewOnTouchListenerC473590Ihh.LLJILLL == null || ViewOnTouchListenerC473590Ihh.LLIZ == null) ? false : true;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void U5() {
        C784440Upu.LIZ().LIZIZ(new C463620IGa());
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final ViewOnTouchListenerC473590Ihh HW0() {
        return ViewOnTouchListenerC473590Ihh.LL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C483410IxX Lb() {
        return C483410IxX.LIZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void M21() {
        ViewOnTouchListenerC473590Ihh viewOnTouchListenerC473590Ihh = ViewOnTouchListenerC473590Ihh.LL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean ZK2() {
        return C469660IbM.LIZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void hK() {
        C466240IQc.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean isInternalWindowMute() {
        return ViewOnTouchListenerC473590Ihh.LLILZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void ku() {
        C483390IxV c483390IxV = C483390IxV.LIZ;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void lA0() {
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void notifyHostAppBoot() {
        C1084940eL6.LIZ();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final int ob2() {
        return this.LL;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void resetInternalWindow() {
        ViewOnTouchListenerC473590Ihh.LJIILLIIL();
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void zD0() {
        C0IO1 c0io1 = C0IO1.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Fb(LifecycleOwner lifecycleOwner) {
        Context context;
        Context context2;
        Context context3 = null;
        if (LiveWidgetRecyableSetting.INSTANCE.enable()) {
            if (lifecycleOwner instanceof Context) {
                context2 = (Context) lifecycleOwner;
            } else {
                context2 = null;
            }
            C469220Iae.LIZ(context2);
        }
        if (LiveWidgetQuickReturnReuseSetting.INSTANCE.enable()) {
            if (lifecycleOwner instanceof Context) {
                context3 = (Context) lifecycleOwner;
            }
            if (C0IJ7.LIZIZ(context3)) {
                IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
                if (iHostAppContext != null && (context = iHostAppContext.context()) != null) {
                    LiveWidgetProviderProxy.Companion.getInstance().prepareWhitelistWidgetsForReuse(C1834150xpV.LJIIIZ(context));
                } else {
                    LiveWidgetProviderProxy.Companion.getInstance().clearAll();
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean IJ(DataChannel dataChannel) {
        if (dataChannel == null) {
            return false;
        }
        return C0IR8.LIZ(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean Jv(String str) {
        C0IKH c0ikhLIZJ = C0IKG.LIZJ(str);
        if (c0ikhLIZJ != null) {
            return c0ikhLIZJ.mt();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Oa(C1106210etP c1106210etP) {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tz1();
        C0IWZ.LIZ.LIZLLL(c1106210etP, null, null, null);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void SK2(AbstractC464380IIy abstractC464380IIy) {
        AudienceLivePlayTaskManager audienceLivePlayTaskManagerLIZIZ = AudienceLivePlayTaskManager.LIZIZ();
        ((CopyOnWriteArrayList) audienceLivePlayTaskManagerLIZIZ.LIZ).add(abstractC464380IIy);
        if (audienceLivePlayTaskManagerLIZIZ.LIZIZ) {
            audienceLivePlayTaskManagerLIZIZ.LIZLLL(abstractC464380IIy);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Sx(String str) {
        C784440Upu.LIZ().LIZIZ(new C469110IaT(str));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void T8(Map map) {
        C823050WQl.LIZIZ().submit(new RunnableC514501zT(this, map, 8));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Uc0(int i) {
        this.LL = i;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void W7(Context context) {
        C1084940eL6.LIZ();
        C0J3Y c0j3y = C0J3Y.LIZ;
        int iIntValue = ((Number) new Pair(Integer.valueOf(R.layout.gjf), "ttlive_fragment_live_room_surface").getFirst()).intValue();
        C485730J3b c485730J3bLIZ = C485760J3e.LIZ((String) new Pair(Integer.valueOf(R.layout.gjf), "ttlive_fragment_live_room_surface").getSecond());
        EnumC485780J3g enumC485780J3g = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(iIntValue, null, c485730J3bLIZ, enumC485780J3g, false);
        C468990IaH.LIZ();
        if (LiveInteractViewAsyncOpt.INSTANCE.enablePreload()) {
            C485730J3b c485730J3bLIZ2 = C485760J3e.LIZ("ttlive_fragment_portrait_interaction_constraint_update");
            EnumC485780J3g enumC485780J3g2 = EnumC485780J3g.UN_SET;
            c0j3y.getClass();
            C0J3Y.LJIILIIL(R.layout.gl0, null, c485730J3bLIZ2, enumC485780J3g2, false);
        }
        ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).tc1();
        LiveToolbarReuseOptimizeSetting liveToolbarReuseOptimizeSetting = LiveToolbarReuseOptimizeSetting.INSTANCE;
        if (liveToolbarReuseOptimizeSetting.enableStrategy("AUDIENCE_SLOT")) {
            C468990IaH.LIZJ();
        }
        if (liveToolbarReuseOptimizeSetting.enableStrategy("AUDIENCE_INTERACTION_FEATURES")) {
            C468990IaH.LIZIZ();
        }
        C485730J3b c485730J3bLIZ3 = C485760J3e.LIZ("ttlive_widget_interaction_close");
        EnumC485780J3g enumC485780J3g3 = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(R.layout.hzr, null, c485730J3bLIZ3, enumC485780J3g3, false);
        if (LiveEnterRoomClickPerfOptSetting.xmlPreloadDialogLiveDrawerFeedV3DrawOpt()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).So0(new RunnableC519000KXa("live_enter_room_drawer_xml_preload", null, true, 2000L, new Runnable() { // from class: X.0IaI
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("WatchPreloadHelper@5d11.preloadOnce$1");
                    try {
                        C0J3Y c0j3y2 = C0J3Y.LIZ;
                        C485730J3b c485730J3bLIZ4 = C485760J3e.LIZ("dialog_live_drawer_feed_v3_draw_opt");
                        EnumC485780J3g enumC485780J3g4 = EnumC485780J3g.UN_SET;
                        c0j3y2.getClass();
                        C0J3Y.LJIILIIL(R.layout.bmp, null, c485730J3bLIZ4, enumC485780J3g4, false);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("WatchPreloadHelper@5d11.preloadOnce$1");
                }
            }));
            return;
        }
        C485730J3b c485730J3bLIZ4 = C485760J3e.LIZ("dialog_live_drawer_feed_v3_draw_opt");
        EnumC485780J3g enumC485780J3g4 = EnumC485780J3g.UN_SET;
        c0j3y.getClass();
        C0J3Y.LJIILIIL(R.layout.bmp, null, c485730J3bLIZ4, enumC485780J3g4, false);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final float YG0(long j) {
        LivePlayFragment livePlayFragment;
        int i = C0IH6.LJFF;
        if (i >= 6 && i < 9 && (livePlayFragment = C0IH6.LJII) != null && livePlayFragment.V == 1 && j == livePlayFragment.LLILLJJLI) {
            return livePlayFragment.LLLLLZ.getTranslationY();
        }
        return 0.0f;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Zq(String str) {
        Map<String, WeakReference<C0IFS>> map;
        if (!TextUtils.isEmpty(str) && (map = C0IKG.LIZ) != null) {
            ((HashMap) map).remove(str);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void addLiveDuration(long j) {
        ((ArrayList) LivePlayFragment.w2).add(Long.valueOf(j));
        C0IFM.LIZ.add(Long.valueOf(j));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:8:0x0016, B:10:0x001c, B:11:0x0022, B:26:0x004f, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:20:0x003d, B:22:0x0043, B:24:0x0049), top: B:37:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean canShowInternalWindow(java.lang.Long r6) {
        /*
            r5 = this;
            X.0Ihh r0 = X.ViewOnTouchListenerC473590Ihh.LL
            r0.getClass()
            boolean r0 = X.ViewOnTouchListenerC473590Ihh.LJIIIIZZ()
            r4 = 0
            if (r0 == 0) goto L74
            boolean r0 = X.ViewOnTouchListenerC473590Ihh.LJIILJJIL()
            if (r0 != 0) goto L74
            r2 = 0
            r3 = 1
            if (r6 == 0) goto L2b
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = X.ViewOnTouchListenerC473590Ihh.LJIIIZ()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L27
            long r0 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L59
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L59
        L22:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)     // Catch: java.lang.Throwable -> L59
            goto L29
        L27:
            r0 = r2
            goto L22
        L29:
            if (r0 == 0) goto L57
        L2b:
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = X.ViewOnTouchListenerC473590Ihh.LJIIIZ()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            X.19EG r0 = r0.getActivity()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            boolean r0 = r0.isFinishing()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L57
            com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment r0 = X.ViewOnTouchListenerC473590Ihh.LJIIIZ()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            X.19EG r0 = r0.getActivity()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            boolean r0 = r0.isDestroyed()     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L57
        L4f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L59
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L59
            goto L65
        L57:
            r3 = 0
            goto L4f
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L65:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L6c
            r2 = r1
        L6c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L74
            boolean r4 = r2.booleanValue()
        L74:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.watch.WatchLiveService.canShowInternalWindow(java.lang.Long):boolean");
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void fW0(long j) {
        LiveConsumeFeatureManager.LIZIZ(1, j);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean fi(String str) {
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(str);
        if (c472280IfaLIZLLL != null) {
            return c472280IfaLIZLLL.getIsKeyboardOpen();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveRoomFragment fk(EnterRoomConfig enterRoomConfig) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(71947);
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).yG0(C0J0Q.APP);
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).yG0(C0J0Q.LIVE);
        if (LiveRoomFragment.LLZLLIL == null) {
            LiveRoomFragment.LLZLLIL = new BPEAHandler();
        }
        C786410Ut5.LJJZZIII(LiveRoomFragment.LLZLLIL, new ARunnableS86S0000000_7(1));
        if (!LiveInnerFeedLoadMorePreloadEarly.INSTANCE.enable() && !LiveEnterRoomClickPerfOptSetting.optFeedLoadMorePreloadDefer()) {
            C466820ISi.LIZ(enterRoomConfig);
        }
        LiveRoomFragment liveRoomFragment = new LiveRoomFragment();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        liveRoomFragment.LLJILJILJ = roomsData.roomId;
        liveRoomFragment.LLJL = roomsData.translationRoomFragment;
        if ("homepage_hot".equals(roomsData.enterFromMerge) && "live_cell".equals(enterRoomConfig.mRoomsData.enterMethod)) {
            z = true;
        } else {
            z = false;
        }
        liveRoomFragment.LLJJJJLIIL = z;
        ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).Iy(liveRoomFragment);
        LiveWidgetProvider.getInstance().isValid = true;
        LiveWidgetProvider.getInstance().isRecycleWidgetContentView = true;
        LiveWidgetProvider.getInstance().isDestoryReInit = true;
        LiveWidgetProvider.getInstance().isEnablePriorityPreload = false;
        C0IIS.LIZ = false;
        C0IIS.LIZJ = false;
        liveRoomFragment.NR(true, true);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return liveRoomFragment;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean hp1(DataChannel dataChannel) {
        return C465230IMf.LIZ(dataChannel);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void km1(List list) {
        LiveConsumeFeatureManager.LIZJ(1, list);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void muteInternalWindow(boolean z) {
        ViewOnTouchListenerC473590Ihh.LL.LJ(z);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void pJ0(long j) {
        C01GW c01gw = LiveConsumeFeatureManager.LIZ;
        if (LiveConsumeFeatureManager.LIZIZ) {
            AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0IaY
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$1");
                    LiveConsumeFeatureManager.LIZ().erase("live_consume_info_cache");
                    LiveConsumeFeatureManager.LIZ().storeString("live_consume_info_cache", GsonProtectorUtils.toJson(C293501Bt.LIZ(), LiveConsumeFeatureManager.LJFF.values()));
                    LiveConsumeFeatureManager.LIZ().storeString("live_consume_info_cache_time_stamp", String.valueOf(System.currentTimeMillis()));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$1");
                    return unit;
                }
            }).LJIIIIZZ(j, TimeUnit.MILLISECONDS).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new C09JN() { // from class: X.0IaM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$2");
                    C01GW c01gw2 = LiveConsumeFeatureManager.LIZ;
                    LiveConsumeFeatureManager.LIZIZ = false;
                    C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$2");
                }
            }, new C09JN() { // from class: X.0IaN
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$3");
                    C01GW c01gw2 = LiveConsumeFeatureManager.LIZ;
                    LiveConsumeFeatureManager.LIZIZ = false;
                    C1C7U.LIZIZ("LiveConsumeFeatureManager@a4f9.saveToAppCache$3");
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void pb0(InterfaceC469100IaS interfaceC469100IaS) {
        C469060IaO.LIZ.getClass();
        ArrayList arrayList = (ArrayList) C469060IaO.LIZIZ;
        if (!arrayList.contains(interfaceC469100IaS)) {
            arrayList.add(interfaceC469100IaS);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void pd(EnterRoomConfig enterRoomConfig) {
        C466820ISi.LIZ(enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void s42(Context context) {
        List<Class<? extends IRecyclableWidget>> listXT1 = ((IWatchLiveService) C1161920gLG.LIZJ(IWatchLiveService.class)).XT1();
        C0J4A c0j4a = new C0J4A(new MutableContextWrapper(C1834150xpV.LJIIIZ(context)));
        FrameLayout frameLayout = new FrameLayout(context);
        for (Class<? extends IRecyclableWidget> cls : listXT1) {
            if (!Intrinsics.LJFF(cls, ((IHashTagService) C1161920gLG.LIZJ(IHashTagService.class)).YE2())) {
                try {
                    C469220Iae.LIZIZ(c0j4a, cls, frameLayout);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void setLiveAudioControllerIntercept(boolean z) {
        EventBus.LIZLLL().LJIILL(new C0IGU(z));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void setLiveFunnelSession(boolean z) {
        ViewOnTouchListenerC473590Ihh.LLIZ = Boolean.valueOf(z);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void tt(FragmentManager fragmentManager) {
        LiveAdaptiveLiteModeDialog liveAdaptiveLiteModeDialog = new LiveAdaptiveLiteModeDialog();
        liveAdaptiveLiteModeDialog.LLILLJJLI = "icon";
        liveAdaptiveLiteModeDialog.show(fragmentManager, "LiveAdaptiveLiteModeDialog");
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void u8(C1106210etP c1106210etP) {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tz1();
        C0IWZ.LIZ(c1106210etP, "sharing_panel", false, false);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean up(String str) {
        C472280Ifa c472280IfaLIZLLL = C0IKG.LIZLLL(str);
        if (c472280IfaLIZLLL != null) {
            return c472280IfaLIZLLL.getIsClearScreen();
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void updateRecInfo(Map<String, ? extends List<SortStatsTag>> map) {
        C0IT5.LIZ(map);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final C483100Ix2 x5(Context context) {
        try {
            return new C483100Ix2(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return null;
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void Be(Activity activity, Boolean bool) {
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        ViewOnTouchListenerC473590Ihh.LJIJJLI(activity, null, bool, null, null);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void ZO(Activity activity, long j) {
        if (activity instanceof C19EG) {
            PipSwitchDialog pipSwitchDialog = new PipSwitchDialog();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("enter_from", "live_page", bundle);
            bundle.putLong("room_id", j);
            pipSwitchDialog.setArguments(bundle);
            pipSwitchDialog.show(((C19EG) activity).getSupportFragmentManager(), "PipSwitchDialog");
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LightSurveyFeedbackSheet gS1(PreviewSurveyViewModel previewSurveyViewModel, C483010Iwt c483010Iwt) {
        return new LightSurveyFeedbackSheet(previewSurveyViewModel, c483010Iwt);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void kc(MotionEvent motionEvent, String str) {
        C784440Upu.LIZ().LIZIZ(new C466510IRd(motionEvent, str));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void yp(String str, C0IFS c0ifs) {
        if (C0IKG.LIZ == null) {
            C0IKG.LIZ = new HashMap();
        }
        if (c0ifs != null && !TextUtils.isEmpty(str)) {
            ((HashMap) C0IKG.LIZ).put(str, new WeakReference(c0ifs));
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final boolean E5(String str, String str2, boolean z) {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tz1();
        return C0IWZ.LJ(str, str2, z);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void VL2(int i, Room room, final DataChannel dataChannel) {
        LifecycleOwner lifecycleOwner;
        final boolean z = true;
        if (i != 1) {
            z = false;
        }
        final String appLanguage = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getAppLanguage();
        C480460Ism.LIZ().getClass();
        C11NZ<R> c11nzLJIILIIL = ((StreamTranslationAPI) C480460Ism.LIZLLL(StreamTranslationAPI.class)).switchStreamLanguage(room.getId(), z).LJIILIIL(new C0UO0());
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        ((C0J1N) c11nzLJIILIIL.LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new C09JN() { // from class: X.0IaJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                StreamUrl streamUrl;
                String str;
                C1C7U.LIZ("StreamTranslationManager@2d8d.requestAndSwitchStream$1");
                WebcastRoomSwitchStreamLanguageResponse.ResponseData responseData = ((WebcastRoomSwitchStreamLanguageResponse) obj).data;
                if (responseData != null && (streamUrl = responseData.streamUrl) != null) {
                    if (z) {
                        str = appLanguage;
                    } else {
                        str = "";
                    }
                    streamUrl.streamLanguage = str;
                    DataChannel dataChannel2 = dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.LC0(SwitchTranslationStream.class, streamUrl);
                    }
                }
                C1C7U.LIZIZ("StreamTranslationManager@2d8d.requestAndSwitchStream$1");
            }
        }, new C09JN() { // from class: X.00Jw
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("StreamTranslationManager@2d8d.requestAndSwitchStream$2");
                C20441214yg.LJIILIIL("StreamTranslationManager", "requestAndSwitchStream failed", (Throwable) obj);
                C1C7U.LIZIZ("StreamTranslationManager@2d8d.requestAndSwitchStream$2");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final LiveDrawerDialogV3 jX1(C472280Ifa c472280Ifa, Bundle bundle, EnumC469210Iad enumC469210Iad) {
        LiveDrawerDialogV3 liveDrawerDialogV3 = new LiveDrawerDialogV3();
        liveDrawerDialogV3.LLJILLL = null;
        liveDrawerDialogV3.LLJILJIL = bundle;
        liveDrawerDialogV3.LLJIJIL = c472280Ifa;
        liveDrawerDialogV3.LLJILJILJ = enumC469210Iad;
        return liveDrawerDialogV3;
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void tM0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, EnterRoomConfig enterRoomConfig) {
        if (IncreaseStrategySetting.INSTANCE.getValue() && (!LiveFollowGuideNewStyleSetting.INSTANCE.enableNewStrategy() || LiveFollowGuideNewStyleSetting.applyFollowGuideNewStyle())) {
            ((ArrayList) C469070IaP.LIZ).add(new AbstractC484600IzS() { // from class: X.0IzU
                public final int LJII;

                {
                    this.LJII = LiveFollowGuideNewStyleSetting.INSTANCE.enableNewStrategy() ? 8 : 1;
                }

                @Override // X.AbstractC484600IzS
                public final int LIZIZ() {
                    return this.LJII;
                }

                @Override // X.AbstractC484600IzS
                public final AbstractC484590IzR LIZ(StrategyFilter strategyFilter) {
                    return new AbstractC484590IzR(strategyFilter) { // from class: X.0IzP
                        {
                            int i;
                            if (LiveFollowGuideNewStyleSetting.INSTANCE.enableNewStrategy()) {
                                i = 8;
                            } else {
                                i = 1;
                            }
                        }

                        @Override // X.AbstractC484590IzR
                        public final boolean LJFF(DataChannel dataChannel2) {
                            boolean zIsFollowing;
                            Object data;
                            User owner;
                            TTMCore tTMCore = TTMCore.getInstance();
                            if (!tTMCore.isInit()) {
                                return false;
                            }
                            HashMap map = new HashMap();
                            Room room = (Room) dataChannel2.gg0(RoomChannel.class);
                            if (room != null && (owner = room.getOwner()) != null) {
                                zIsFollowing = owner.isFollowing();
                            } else {
                                zIsFollowing = false;
                            }
                            map.put("has_followed_anchor", Boolean.valueOf(zIsFollowing));
                            TTMInput tTMInput = new TTMInput();
                            tTMInput.machineCode = this.LIZIZ.filterExpression;
                            tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
                            tTMInput.paramData = new TTMParamData((Map<String, Object>) map);
                            TTMOutput tTMOutputExecute = tTMCore.execute(tTMInput);
                            if (tTMOutputExecute != null) {
                                data = tTMOutputExecute.getData();
                            } else {
                                data = null;
                            }
                            if (!(data instanceof Boolean)) {
                                return false;
                            }
                            return ((Boolean) data).booleanValue();
                        }

                        @Override // X.AbstractC484590IzR
                        public final boolean LIZ(DataChannel dataChannel2, StrategyData strategyData) {
                            User owner;
                            Room room = (Room) dataChannel2.gg0(RoomChannel.class);
                            boolean z = false;
                            if (room != null && (owner = room.getOwner()) != null && owner.isFollowing()) {
                                z = true;
                            }
                            return !z;
                        }

                        @Override // X.AbstractC484590IzR
                        public final void LJ(DataChannel dataChannel2, EnterRoomConfig enterRoomConfig2, StrategyData strategyData, C484610IzT c484610IzT, long j, long j2, AwS373S0200000_7 awS373S0200000_7) {
                            String str;
                            String str2;
                            long j3 = enterRoomConfig2.mRoomsData.roomId;
                            int i = c484610IzT.LIZ.triggerType;
                            LIZLLL(i, j3);
                            C480460Ism.LIZ().getClass();
                            StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZIZ(StrategyApi.class);
                            if (strategyApi != null) {
                                int i2 = this.LIZ;
                                EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
                                long j4 = roomsData.enterUserId;
                                String str3 = "";
                                if (strategyData == null || (str = strategyData.actionType) == null) {
                                    str = "";
                                }
                                long j5 = j / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                String str4 = roomsData.enterFromMerge;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = c484610IzT.LIZ.triggerId;
                                if (strategyData != null && (str2 = strategyData.strategyId) != null) {
                                    str3 = str2;
                                }
                                C11NZ<C470580Icq> c11nzStrategyCheck = strategyApi.strategyCheck(i2, j3, j4, str, j5, i, j2, str4, str5, str3);
                                if (c11nzStrategyCheck != null) {
                                    c11nzStrategyCheck.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS1S0201100_7(this, j3, i, awS373S0200000_7, 0), new AfS0S0101100_7(this, j3, i, 0));
                                }
                            }
                        }
                    };
                }

                @Override // X.AbstractC484600IzS
                public final void LJ(C470580Icq c470580Icq, C484610IzT c484610IzT) {
                    long j;
                    long j2;
                    ShowMode showMode;
                    ShowMode showMode2;
                    if (c470580Icq == null) {
                        return;
                    }
                    GuideMessage guideMessage = new GuideMessage();
                    guideMessage.guideType = 2L;
                    StrategyData strategyData = this.LJ;
                    if (strategyData != null && (showMode2 = strategyData.showMode) != null) {
                        j = showMode2.durationMs;
                    } else {
                        j = 0;
                    }
                    guideMessage.duration = j;
                    if (strategyData != null && (showMode = strategyData.showMode) != null) {
                        j2 = showMode.displayStyle;
                    } else {
                        j2 = 3;
                    }
                    guideMessage.displayStyle = j2;
                    guideMessage.scene = c484610IzT.LIZ.triggerScene;
                    CommonMessageData commonMessageData = new CommonMessageData();
                    guideMessage.baseMessage = commonMessageData;
                    commonMessageData.logId = c470580Icq.LIZIZ;
                    commonMessageData.describe = "increase_sdk";
                    EnumC1087550ePJ.INSTANCE.add(guideMessage);
                }
            });
        }
        if (ToolbarTipsExperiment.INSTANCE.hasTips() && !IncreaseSDKRegistrationOptimize.avoidComponentLoading() && !IncreaseSDKRegistrationOptimize.avoidFirstFrame()) {
            ((ArrayList) C469070IaP.LIZ).add(new C484630IzV());
        }
        Iterator it2 = ((ArrayList) C469070IaP.LIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC484600IzS) it2.next()).LJFF(dataChannel, lifecycleOwner, enterRoomConfig);
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void v12(boolean z, DataChannel dataChannel, AwS61S0210000_7 awS61S0210000_7) {
        long j;
        LifecycleOwner lifecycleOwner;
        if (z) {
            j = 1;
        } else {
            j = 2;
        }
        C480460Ism.LIZ().getClass();
        C11NZ<R> c11nzLJIILIIL = ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(33L, j).LJIILIIL(new C0UO0());
        if (dataChannel != null) {
            lifecycleOwner = dataChannel.LLILZ;
        } else {
            lifecycleOwner = null;
        }
        ((C0J1N) c11nzLJIILIIL.LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new C516401zm(j, awS61S0210000_7, 4), new C516201zk(awS61S0210000_7, 233));
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void wl2(DataChannel dataChannel, LifecycleOwner lifecycleOwner, EnterRoomConfig enterRoomConfig) {
        Iterator it2 = ((ArrayList) C469070IaP.LIZ).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((AbstractC484600IzS) next).LIZIZ() == 9) {
                if (next != null) {
                    return;
                }
            }
        }
        C484630IzV c484630IzV = new C484630IzV();
        ((ArrayList) C469070IaP.LIZ).add(c484630IzV);
        c484630IzV.LJFF(dataChannel, lifecycleOwner, enterRoomConfig);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void N6(float f, float f2, float f3, float f4) {
        C784440Upu.LIZ().LIZIZ(new C469140IaW(f, f2, f3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        if (r2 != null) goto L10;
     */
    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0IKH tf(X.C19EG r7, X.C472280Ifa r8, int r9, X.EnumC469210Iad r10) {
        /*
            r6 = this;
            java.lang.String r0 = X.C0IKG.LIZ(r7)
            X.0IKH r0 = X.C0IKG.LIZJ(r0)
            r5 = 0
            if (r0 != 0) goto L71
            if (r7 == 0) goto L71
            androidx.fragment.app.FragmentManager r4 = r7.getSupportFragmentManager()
            X.19EH r3 = r4.LJIIJ()
            com.bytedance.android.livesdk.livesetting.message.LivePadMultiScreenSetting r0 = com.bytedance.android.livesdk.livesetting.message.LivePadMultiScreenSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L52
            java.lang.Class<com.bytedance.android.livesdk.pad.IPadMultiScreenService> r0 = com.bytedance.android.livesdk.pad.IPadMultiScreenService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.pad.IPadMultiScreenService r0 = (com.bytedance.android.livesdk.pad.IPadMultiScreenService) r0
            com.bytedance.android.livesdk.pad.PadLiveRoomMultiScreenFragment r2 = r0.fO()
            if (r2 == 0) goto L52
            r2.SR(r8)
        L2e:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "LiveDrawerHelper_drawer_fragment_"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            androidx.fragment.app.Fragment r0 = r4.LJJJJZI(r1)
            if (r0 == 0) goto L66
            r3.LJIIZILJ(r0)
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            r3.LJIJ(r9, r0, r1)
            r3.LJIIJ()
            return r2
        L52:
            java.lang.Class<com.bytedance.android.livesdk.watch.IWatchLiveService> r0 = com.bytedance.android.livesdk.watch.IWatchLiveService.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdk.watch.IWatchLiveService r1 = (com.bytedance.android.livesdk.watch.IWatchLiveService) r1
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3 r2 = r1.jX1(r8, r0, r10)
            if (r2 == 0) goto L71
            goto L2e
        L66:
            androidx.fragment.app.Fragment r0 = r2.getFragment()
            r3.LIZJ(r9, r0, r1)
            r3.LJIIJ()
            return r2
        L71:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.watch.WatchLiveService.tf(X.19EG, X.0Ifa, int, X.0Iad):X.0IKH");
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void updateSafeZone(int i, int i2, int i3, int i4) {
        View view;
        ViewOnTouchListenerC473590Ihh.LLIZLLLIL = new C473600Ihi(i, i2, i3, i4);
        ViewGroup viewGroup = ViewOnTouchListenerC473590Ihh.LLJILJILJ;
        if (viewGroup != null) {
            Object parent = viewGroup.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(Math.max(i, Math.min(marginLayoutParams.getMarginStart(), (view.getWidth() - i3) - viewGroup.getWidth())));
                    marginLayoutParams.topMargin = Math.max(i2, Math.min(marginLayoutParams.topMargin, (view.getHeight() - i4) - viewGroup.getHeight()));
                    C786410Ut5.W5(viewGroup, marginLayoutParams);
                    if (ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL == null) {
                        ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL = new C469090IaR();
                    }
                    C469090IaR c469090IaR = ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL;
                    if (c469090IaR != null) {
                        c469090IaR.LIZ = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).getMarginStart();
                    }
                    C469090IaR c469090IaR2 = ViewOnTouchListenerC473590Ihh.LLJJIJIIJIL;
                    if (c469090IaR2 != null) {
                        c469090IaR2.LIZIZ = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin;
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void xi(int i, Room room, String str, String str2, String str3, Map map) {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tz1();
        C0IWZ.LIZIZ(room, str, str2, str3, i, false, map);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void wH(Room room, String str, String str2, String str3, String str4, String str5, Map map) {
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).tz1();
        C0IWZ.LIZJ(room, str, str2, "long_press", str3, str4, str5, map, null);
    }

    @Override // com.bytedance.android.livesdk.watch.IWatchLiveService
    public final void showInternalWindow(Activity activity, DialogFragment dialogFragment, Boolean bool, Map<String, String> map, Integer num, Integer num2, Integer num3, Integer num4) {
        C473600Ihi c473600Ihi;
        if (num != null && num2 != null && num3 != null && num4 != null) {
            c473600Ihi = new C473600Ihi(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        } else {
            c473600Ihi = null;
        }
        ViewOnTouchListenerC473590Ihh.LL.getClass();
        ViewOnTouchListenerC473590Ihh.LJIJJLI(activity, dialogFragment, bool, map, c473600Ihi);
    }
}
