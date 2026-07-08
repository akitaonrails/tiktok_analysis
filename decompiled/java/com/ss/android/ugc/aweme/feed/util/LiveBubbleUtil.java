package com.ss.android.ugc.aweme.feed.util;

import X.AbstractC20660015ss;
import X.C09JN;
import X.C0IJT;
import X.C0IL2;
import X.C0IVA;
import X.C0J9F;
import X.C0UO0;
import X.C0X4H;
import X.C0X4J;
import X.C1161920gLG;
import X.C1585060rLk;
import X.C1720106oR;
import X.C1905610zgl;
import X.C1905680zgs;
import X.C19EG;
import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C464330IIt;
import X.C464950ILd;
import X.C474500IjA;
import X.C480270IsT;
import X.C480460Ism;
import X.C497740JfY;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC471750Iej;
import X.RunnableC1905570zgh;
import Y.ARunnableS128S0100000_28;
import Y.AfS189S0100000_20;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.feed.LiveInfeedSkylightEntranceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleGetSettingAvoidSwitchTab;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveBubbleWarmStarupSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.BubbleSettingResponse;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.GetLiveBubbleResponse;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil$handler$1;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class LiveBubbleUtil {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static LiveBubbleData LJI;
    public static LiveBubbleData LJII;
    public static LiveBubbleExtra LJIIIIZZ;
    public static WeakReference<View> LJIIIZ;
    public static WeakReference<View> LJIIJ;
    public static WeakReference<View> LJIIJJI;
    public static WeakReference<View> LJIIL;
    public static BubbleSettingData LJIILLIIL;
    public static C1905680zgs LJIIZILJ;
    public static boolean LJIJ;
    public static boolean LJIJJ;
    public static boolean LJIL;
    public static long LJJ;
    public static final LiveBubbleUtil$handler$1 LJJI;
    public static final RunnableC1905570zgh LJJIFFI;
    public static final LiveBubbleUtil LIZ = new LiveBubbleUtil();
    public static boolean LJIILIIL = true;
    public static String LJIILJJIL = "";
    public static String LJIILL = "";
    public static boolean LJIJI = true;
    public static boolean LJIJJLI = true;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil$handler$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        LJJI = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String str;
                String str2;
                C1C7U.LIZ("LiveBubbleUtil@6424.handler$1");
                int i = message.what;
                if (i != 42) {
                    if (i == 43 && HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof GetLiveBubbleResponse)) {
                        GetLiveBubbleResponse getLiveBubbleResponse = (GetLiveBubbleResponse) HandlerHook.getMessageObj(message.obj);
                        LiveBubbleData liveBubbleData = getLiveBubbleResponse.data;
                        if (liveBubbleData != null && liveBubbleData.roomData != null) {
                            if (liveBubbleData == null || (str2 = liveBubbleData.bubbleTitle) == null) {
                                str2 = "";
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                LiveBubbleData liveBubbleData2 = getLiveBubbleResponse.data;
                                LiveBubbleUtil.LJI = liveBubbleData2;
                                LiveBubbleUtil.LIZ.getClass();
                                LiveBubbleUtil.LJII = liveBubbleData2;
                                LiveBubbleUtil.LJIIIIZZ = getLiveBubbleResponse.extra;
                                LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJI;
                                if (liveBubbleData3 != null) {
                                    LiveBubbleUtil.LIZ(liveBubbleData3);
                                }
                            }
                        }
                        C1C7U.LIZIZ("LiveBubbleUtil@6424.handler$1");
                        return;
                    }
                } else if (HandlerHook.getMessageObj(message.obj) != null && (HandlerHook.getMessageObj(message.obj) instanceof BubbleSettingResponse)) {
                    BubbleSettingResponse bubbleSettingResponse = (BubbleSettingResponse) HandlerHook.getMessageObj(message.obj);
                    LiveBubbleUtil liveBubbleUtil = LiveBubbleUtil.LIZ;
                    BubbleSettingData bubbleSettingData = bubbleSettingResponse.data;
                    liveBubbleUtil.getClass();
                    LiveBubbleUtil.LJIILLIIL = bubbleSettingData;
                    if (bubbleSettingData != null) {
                        if (bubbleSettingData.getStayInterval() > 0 && bubbleSettingData.getShowInterval() > 0) {
                            postDelayed(new ARunnableS128S0100000_28(bubbleSettingData, 32), bubbleSettingData.getShowInterval() * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        } else {
                            if (bubbleSettingData.getStayInterval() <= 0) {
                                str = "not_stay";
                            } else {
                                str = "not_show";
                            }
                            C1905610zgl.LIZLLL(str);
                            C1C7U.LIZIZ("LiveBubbleUtil@6424.handler$1");
                            return;
                        }
                    }
                }
                C1C7U.LIZIZ("LiveBubbleUtil@6424.handler$1");
            }
        };
        LJJIFFI = RunnableC1905570zgh.LL;
    }

    public static View LIZLLL() {
        WeakReference<View> weakReference = LJIIIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static View LJ() {
        WeakReference<View> weakReference = LJIIJJI;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LJFF() {
        View viewLIZLLL;
        C1905610zgl.LJFF("livesdk_bubble_getLiveBubble");
        if (LIZIZ() && !LJIJ) {
            if ((LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJI) || (viewLIZLLL = LIZLLL()) == null || !viewLIZLLL.isShown() || LJIIIIZZ() || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LIZIZ() || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LIZ()) {
                return;
            }
            C464950ILd c464950ILd = C464950ILd.LJI;
            LiveBubbleUtil$handler$1 liveBubbleUtil$handler$1 = LJJI;
            c464950ILd.getClass();
            C480460Ism.LIZ().getClass();
            ((RoomRetrofitApi) C480460Ism.LIZLLL(RoomRetrofitApi.class)).getLiveBubble().LJIILIIL(new C0UO0()).LJJLL(new AfS197S0100000_28(liveBubbleUtil$handler$1, 55), new AfS189S0100000_20(liveBubbleUtil$handler$1, 4));
            C0IJT.LIZIZ("livesdk_bubble_interface", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0())).LIZ();
        }
    }

    public static View LJI() {
        WeakReference<View> weakReference = LJIIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static View LJII() {
        WeakReference<View> weakReference = LJIIJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static boolean LJIIIIZZ() {
        return LJIL || ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LIZLLL();
    }

    public static void LJIIJ() {
        C1905610zgl.LJFF("livesdk_bubble_readBubbleSettingAndtryShowBubble");
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (!iUserService.isLogin()) {
            C1905610zgl.LIZLLL("not_log_in");
            return;
        }
        LJIILL = iUserService.getCurrentUserID();
        if (LJIJ) {
            C1905610zgl.LIZLLL("showed");
            return;
        }
        if (LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJI) {
            C1905610zgl.LIZLLL("switch_tab");
            return;
        }
        if (LJIJJ) {
            C1905610zgl.LIZLLL("is_showing");
            return;
        }
        if (LJIIIIZZ()) {
            C1905610zgl.LIZLLL("draw_guide");
            return;
        }
        if (C1585060rLk.LIZIZ()) {
            C1905610zgl.LIZLLL("story_fyp_entrance_exp");
            return;
        }
        if (C480270IsT.LIZ()) {
            C1905610zgl.LIZLLL("toplive_new_page");
            return;
        }
        LiveBubbleUtil$handler$1 liveBubbleUtil$handler$1 = LJJI;
        Message messageObtainMessage = liveBubbleUtil$handler$1.obtainMessage(42);
        BubbleSettingResponse bubbleSettingResponse = new BubbleSettingResponse(null, null);
        bubbleSettingResponse.setData(LiveBubbleSetting.INSTANCE.getConfig());
        bubbleSettingResponse.setExtra(new BubbleSettingExtra(null));
        messageObtainMessage.obj = bubbleSettingResponse;
        C786410Ut5.LJLJJL(liveBubbleUtil$handler$1, messageObtainMessage);
    }

    public static void LJIIJJI() {
        if (LiveBubbleWarmStarupSetting.INSTANCE.enable()) {
            C0X4H c0x4h = C0X4H.LIZ;
            C0X4J c0x4j = new C0X4J() { // from class: X.0zgj
                @Override // X.C0X4J
                public final void LJJJJJ(final int i) {
                    boolean z;
                    if (i == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LiveBubbleUtil.LIZJ = z;
                    C786410Ut5.LJLIIL(3000L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0zgi
                        public final void LIZ() {
                            if (i == 3) {
                                LiveBubbleUtil.LIZ.getClass();
                                LiveBubbleUtil.LJIJ = false;
                                LiveBubbleUtil.LJIJJ = false;
                                LiveBubbleUtil.LJIILIIL = true;
                                LiveBubbleUtil.LJ = false;
                                LiveBubbleUtil.LIZIZ = false;
                                LiveBubbleUtil.LJFF = false;
                                LiveBubbleUtil.LJIIZILJ = null;
                                LiveBubbleUtil.LJI = null;
                                LiveBubbleUtil.LJII = null;
                                LiveBubbleUtil.LJIIIZ = new WeakReference<>(null);
                                LiveBubbleUtil.LJIILLIIL = null;
                                LiveBubbleUtil.LJIIIIZZ = null;
                                LiveBubbleUtil.LJIJJ = false;
                                LiveBubbleUtil.LJIILIIL = true;
                                LiveBubbleUtil.LJIJI = true;
                                LiveBubbleUtil.LJFF = false;
                                LiveBubbleUtil.LJJI.removeCallbacksAndMessages(null);
                                C0J9F.LIZLLL = false;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("livesdk_bubble_restart_");
                            sbLIZ.append(i);
                            C1905610zgl.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                            LiveBubbleUtil.LIZ.getClass();
                            LiveBubbleUtil.LJIIJ();
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveBubbleUtil@6424.register$1$onStateChanged$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveBubbleUtil@6424.register$1$onStateChanged$1");
                        }
                    });
                }
            };
            c0x4h.getClass();
            C0X4H.LIZJ = c0x4j;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init, hasInit=");
            sbLIZ.append(C0X4H.LIZIZ);
            C1720106oR.LJI("LiveBubbleTrigger", C2188811AlT.LIZIZ(sbLIZ));
            if (!C0X4H.LIZIZ) {
                C2214201BlK.LIZIZ.LJJLIIJ().LJJLJLI(C0X4H.LIZLLL);
                C2214201BlK.LIZIZ().LJJLJLI(C0X4H.LJ);
                C2214201BlK.LJ().LJJLJLI(new C09JN() { // from class: X.0X4I
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveBubbleTrigger@35c7.init$1");
                        C0X4H.LIZLLL.LL = true;
                        C1C7U.LIZIZ("LiveBubbleTrigger@35c7.init$1");
                    }
                });
                C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0X4K
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveBubbleTrigger@35c7.init$2");
                        try {
                            C622680Oba.LIZJ(C0X4H.LIZ);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveBubbleTrigger@35c7.init$2");
                    }
                });
                C0X4H.LIZIZ = true;
            }
        }
        LJIIJ();
    }

    public static boolean LIZIZ() {
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        return iUserService.isLogin() && Intrinsics.LJFF(LJIILL, iUserService.getCurrentUserID());
    }

    public static void LIZ(LiveBubbleData liveBubbleData) {
        C1905610zgl.LJFF("livesdk_bubble_checkIsShowBubblePopWindow");
        if (!LIZIZ()) {
            C1905610zgl.LIZIZ("not_login_in");
            return;
        }
        if (!LJIJ && !LJIJJ) {
            BubbleSettingData bubbleSettingData = LJIILLIIL;
            if (bubbleSettingData != null && bubbleSettingData.getStayInterval() > 0) {
                if (LiveBubbleGetSettingAvoidSwitchTab.INSTANCE.disable() && !LJIJI) {
                    C1905610zgl.LIZIZ("switch_tab");
                    return;
                }
                if (LJIIIIZZ()) {
                    C1905610zgl.LIZIZ("draw_guide");
                    return;
                }
                if (((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LIZ()) {
                    C1905610zgl.LIZIZ("ad_before");
                    return;
                }
                if (((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LIZIZ()) {
                    C1905610zgl.LIZIZ("push_before");
                    return;
                } else if (C0J9F.LIZLLL) {
                    C1905610zgl.LIZIZ("bubble_before");
                    return;
                } else {
                    C1905610zgl.LJFF("livesdk_bubble_showTopLiveBubble");
                    C786410Ut5.LJJZZIII(LJJI, new ARunnableS128S0100000_28(liveBubbleData, 34));
                    return;
                }
            }
            C1905610zgl.LIZIZ("switch_page");
            return;
        }
        C1905610zgl.LIZIZ("showed");
    }

    public static void LIZJ(String str, boolean z) {
        C1905680zgs c1905680zgs = LJIIZILJ;
        if ((c1905680zgs != null && c1905680zgs.isShowing()) || LJIJJ) {
            C1905610zgl.LJ = str;
            C1905610zgl.LIZJ = "";
            C1905680zgs c1905680zgs2 = LJIIZILJ;
            if (c1905680zgs2 != null) {
                c1905680zgs2.LLJILLL = z;
                c1905680zgs2.dismiss();
            }
            if (Intrinsics.LJFF("ad_avoid", str)) {
                C1905610zgl.LIZIZ("ad_after");
            } else {
                if (!Intrinsics.LJFF("push_avoid", str)) {
                    return;
                }
                C1905610zgl.LIZIZ("push_after");
            }
        }
    }

    public static void LJIIIZ(int i, int i2) {
        String str;
        Room room;
        final EnterRoomConfig enterRoomConfig;
        String str2;
        LogPb logPb;
        Room room2;
        String string;
        Room room3;
        EnterRoomConfig.RoomsData roomsData;
        Map<String, Object> mapL7 = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).L7(-1L);
        if (mapL7.get("feed_url") instanceof String) {
            str = (String) mapL7.get("feed_url");
        } else {
            str = "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LiveBubbleData liveBubbleData = LJII;
        String string2 = null;
        if (liveBubbleData != null) {
            room = liveBubbleData.roomData;
        } else {
            room = null;
        }
        LiveBubbleExtra liveBubbleExtra = LJIIIIZZ;
        if (room == null) {
            enterRoomConfig = null;
        } else {
            enterRoomConfig = new EnterRoomConfig();
            C464330IIt.LIZLLL(room, enterRoomConfig);
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
                str2 = logPb.imprId;
            } else {
                str2 = null;
            }
            logData.requestId = str2;
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            if (roomsData2 != null) {
                roomsData2.feedUrl = str;
            }
        }
        if (enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
            if (roomsData3 != null) {
                roomsData3.fromNewStyle = true;
            }
            EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
            if (logData2 != null) {
                logData2.loadDuration = jCurrentTimeMillis;
            }
        }
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            roomsData.enterMethod = "live_cover";
        }
        if (enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
            if (roomsData4 != null) {
                roomsData4.enterFromMerge = "live_merge";
            }
            EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
            if (roomsData5 != null) {
                roomsData5.actionType = "draw";
            }
            EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
            if (roomsData6 != null) {
                roomsData6.fromNewStyle = true;
            }
            EnterRoomConfig.LogData logData3 = enterRoomConfig.mLogData;
            if (logData3 != null) {
                logData3.topLeftRoomLabel = LJIILJJIL;
            }
            EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
            if (roomsData7 != null) {
                roomsData7.fromDrawerStyle = "homepage_hot";
            }
            EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
            if (roomsData8 != null) {
                roomsData8.enterFromLiveSource = "live_square";
            }
            EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig.mRoomsData;
            if (roomsData9 != null) {
                roomsData9.windowMode = "full_screen";
            }
            EnterRoomConfig.RoomsData roomsData10 = enterRoomConfig.mRoomsData;
            if (roomsData10 != null) {
                roomsData10.enterRoomScene = "outside_normal_click";
            }
            EnterRoomConfig.RoomsData roomsData11 = enterRoomConfig.mRoomsData;
            if (roomsData11 != null) {
                LiveBubbleData liveBubbleData2 = LJII;
                if (liveBubbleData2 != null && (room3 = liveBubbleData2.roomData) != null) {
                    string = Long.valueOf(room3.getId()).toString();
                } else {
                    string = null;
                }
                roomsData11.bubbleRoomId = string;
            }
            EnterRoomConfig.RoomsData roomsData12 = enterRoomConfig.mRoomsData;
            if (roomsData12 != null) {
                LiveBubbleData liveBubbleData3 = LJII;
                if (liveBubbleData3 != null && (room2 = liveBubbleData3.roomData) != null) {
                    string2 = Long.valueOf(room2.getOwnerUserId()).toString();
                }
                roomsData12.bubbleOwnerd = string2;
            }
        }
        C0IL2.LIZ.LIZLLL(new EnterRoomLinkSession(enterRoomConfig));
        if (enterRoomConfig == null) {
            return;
        }
        EnterRoomConfig.RoomsData roomsData13 = enterRoomConfig.mRoomsData;
        roomsData13.isFromBubble = i;
        roomsData13.isFromCache = i2;
        if (LiveInfeedSkylightEntranceSetting.matchEntrance("live_merge", "live_cover")) {
            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zX1();
            final CommonSkylightDataManager commonSkylightDataManager = CommonSkylightDataManager.LIZ;
            commonSkylightDataManager.LJIJ(EnumC471750Iej.TOPLIVE_BUBBLE);
            if (CommonSkylightDataManager.LIZIZ.LIZIZ && !commonSkylightDataManager.LJI()) {
                commonSkylightDataManager.LJFF(new C0IVA() { // from class: X.0Iqi
                    @Override // X.C0IVA
                    public final void LIZ(EnumC471750Iej enumC471750Iej, long j) {
                    }

                    @Override // X.C0IVA
                    public final void LIZIZ(EnumC471750Iej enumC471750Iej, boolean z) {
                        LiveBubbleUtil.LIZ.getClass();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("startRoom onResult ");
                        sbLIZ.append(z);
                        C20441214yg.LJIIIZ("LiveBubbleUtil", C2188811AlT.LIZIZ(sbLIZ));
                        commonSkylightDataManager.LIZJ(this);
                        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(C497740JfY.LJII(), enterRoomConfig);
                    }
                });
                return;
            }
        }
        ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(C497740JfY.LJII(), enterRoomConfig);
    }

    public static void LJIIL(final C19EG c19eg, final LiveBubbleData liveBubbleData) {
        Long lValueOf;
        Room room;
        Room room2;
        PopupManager.LJIJI(new AbstractC20660015ss<PopupWindow>(c19eg, liveBubbleData) { // from class: X.0zgr
            public final C19EG LL;
            public final LiveBubbleData LLILLJJLI;
            public final int LLILLL = 2000;

            @Override // X.InterfaceC20660415sw
            public final C688120Qyw i2() {
                C19EG c19eg2 = this.LL;
                return new C688120Qyw(c19eg2, c19eg2, null);
            }

            @Override // X.InterfaceC20660515sx
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C688120Qyw c688120Qyw) {
                Window window;
                View decorView;
                Context context;
                long stayInterval;
                Window window2;
                final View decorView2;
                User owner;
                ImageModel avatarThumb;
                Window window3;
                View decorView3;
                LiveBubbleUtil liveBubbleUtil = LiveBubbleUtil.LIZ;
                LiveBubbleData liveBubbleData2 = this.LLILLJJLI;
                liveBubbleUtil.getClass();
                List<String> listLIZ = null;
                if (!LiveBubbleUtil.LJIJ && !LiveBubbleUtil.LJIJJ) {
                    Activity activityLJFF = C2214201BlK.LJFF();
                    if (activityLJFF == null || (window = activityLJFF.getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getContext() == null) {
                        return null;
                    }
                    LiveBubbleUtil.LJIJ = true;
                    ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LJ();
                    Activity activityLJFF2 = C2214201BlK.LJFF();
                    if (activityLJFF2 != null && (window3 = activityLJFF2.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                        context = decorView3.getContext();
                    } else {
                        context = null;
                    }
                    C1905680zgs c1905680zgs = new C1905680zgs(context);
                    LiveBubbleUtil.LJIIZILJ = c1905680zgs;
                    c1905680zgs.LLILZIL.setText(liveBubbleData2.bubbleTitle);
                    if (liveBubbleData2.showHead) {
                        C786410Ut5.Y(c1905680zgs.LLILLJJLI, 0);
                        C786410Ut5.LLJJIII(c1905680zgs.LLILLL, 0);
                        C786410Ut5.LJLLLLLL(8, c1905680zgs.LLILZ);
                        Room room3 = liveBubbleData2.roomData;
                        if (room3 != null && (owner = room3.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
                            listLIZ = C842240X2g.LIZ(avatarThumb);
                        }
                        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(listLIZ);
                        c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                        c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                        c1324610kZfLIZJ.LJJ = Boolean.FALSE;
                        c1324610kZfLIZJ.LJJI(c1905680zgs.LLILLL);
                        C1324720kZq c1324720kZq = c1905680zgs.LLILLL;
                        c1905680zgs.LL = new C1610740s1A(true, (View) c1324720kZq, (View) c1324720kZq, c1905680zgs.LLILLJJLI);
                    } else {
                        C786410Ut5.Y(c1905680zgs.LLILLJJLI, 4);
                        C786410Ut5.LLJJIII(c1905680zgs.LLILLL, 4);
                        C786410Ut5.LJLLLLLL(0, c1905680zgs.LLILZ);
                    }
                    C1905680zgs c1905680zgs2 = LiveBubbleUtil.LJIIZILJ;
                    if (c1905680zgs2 != null) {
                        c1905680zgs2.LLJJ = LiveBubbleUtil.LJIJJLI;
                    }
                    C844470XAv.LIZ.getClass();
                    final int iLIZJ = C497820Jfg.LIZJ(C844470XAv.LIZ()) + ((int) C497740JfY.LIZIZ(8.0f));
                    Activity activityLJFF3 = C2214201BlK.LJFF();
                    if (activityLJFF3 != null && (window2 = activityLJFF3.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                        C1619100sEe c1619100sEe = new C1619100sEe(LiveBubbleUtil.LJIIZILJ, new InterfaceC1619230sEr() { // from class: X.0zgu
                            @Override // X.InterfaceC1619230sEr
                            public final void show() {
                                if (C497740JfY.LJJ()) {
                                    C1905680zgs c1905680zgs3 = LiveBubbleUtil.LJIIZILJ;
                                    if (c1905680zgs3 != null) {
                                        c1905680zgs3.showAtLocation(decorView2, 53, 0, iLIZJ);
                                        PopupMonitorServiceImpl.LIZ.getClass();
                                        PopupMonitorServiceImpl.LJJJI(c1905680zgs3);
                                        C787990Uvd.LIZ.getClass();
                                        C994003uc.LIZ();
                                        return;
                                    }
                                    return;
                                }
                                C1905680zgs c1905680zgs4 = LiveBubbleUtil.LJIIZILJ;
                                if (c1905680zgs4 != null) {
                                    c1905680zgs4.showAtLocation(decorView2, 51, 0, iLIZJ);
                                    PopupMonitorServiceImpl.LIZ.getClass();
                                    PopupMonitorServiceImpl.LJJJI(c1905680zgs4);
                                    C787990Uvd.LIZ.getClass();
                                    C994003uc.LIZ();
                                }
                            }
                        });
                        if (C295090BhT.LIZ()) {
                            C1905750zgz.LIZIZ.LJFF(new C1618950sEP("live_toplive", EnumC1584360rKc.TOP_LIVE, 10000L, EnumC1619300sEy.JUMP_NEW_PAGE, c1619100sEe), null);
                        } else {
                            C1905750zgz c1905750zgz = C1905750zgz.LIZIZ;
                            c1905750zgz.LIZ("live_toplive", EnumC1584360rKc.TOP_LIVE);
                            c1905750zgz.LJIIIZ(LiveBubbleUtil.LJIIZILJ, "live_toplive");
                            c1619100sEe.show();
                        }
                    }
                    BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
                    RunnableC1904540zf2 runnableC1904540zf2 = new Runnable() { // from class: X.0zf2
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveBubbleUtil@6424.showPop$2");
                            try {
                                C1905750zgz.LIZIZ.LJII(EnumC1584360rKc.TOP_LIVE, EnumC1905830zh7.BEYOND_TIME_LIMIT);
                                LiveBubbleUtil.LIZ.getClass();
                                LiveBubbleUtil.LIZJ("natural", true);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveBubbleUtil@6424.showPop$2");
                        }
                    };
                    BubbleSettingData bubbleSettingData = LiveBubbleUtil.LJIILLIIL;
                    if (bubbleSettingData != null) {
                        stayInterval = bubbleSettingData.getStayInterval();
                    } else {
                        stayInterval = 0;
                    }
                    C786410Ut5.LJLIIL(stayInterval * ((long) LSPassThroughRecordSizeConfig.DEFAULT), bPEAHandler, runnableC1904540zf2);
                    C1905680zgs c1905680zgs3 = LiveBubbleUtil.LJIIZILJ;
                    if (c1905680zgs3 != null) {
                        c1905680zgs3.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: X.0zeA
                            @Override // android.widget.PopupWindow.OnDismissListener
                            public final void onDismiss() {
                                C1905750zgz.LIZIZ.LIZJ(EnumC1584360rKc.TOP_LIVE);
                                LiveBubbleUtil$handler$1 liveBubbleUtil$handler$1 = LiveBubbleUtil.LJJI;
                                RunnableC1869850yl5 runnableC1869850yl5 = new Runnable() { // from class: X.0yl5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        boolean zLIZ;
                                        C1C7U.LIZ("LiveBubbleUtil@6424.showPop$3$1");
                                        try {
                                            LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJI;
                                            if (liveBubbleData3 != null) {
                                                liveBubbleData3.setRoomData(null);
                                            }
                                        } finally {
                                            if (!zLIZ) {
                                            }
                                        }
                                        C1C7U.LIZIZ("LiveBubbleUtil@6424.showPop$3$1");
                                    }
                                };
                                LiveBubbleUtil.LIZ.getClass();
                                BubbleSettingData bubbleSettingData2 = LiveBubbleUtil.LJIILLIIL;
                                C786410Ut5.LJLIIL((bubbleSettingData2 != null ? bubbleSettingData2.getCacheInterval() : 0L) * ((long) LSPassThroughRecordSizeConfig.DEFAULT), liveBubbleUtil$handler$1, runnableC1869850yl5);
                                LiveBubbleUtil.LJIJJ = false;
                                ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LJFF();
                            }
                        });
                    }
                    return LiveBubbleUtil.LJIIZILJ;
                }
                ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LJFF();
                return null;
            }

            {
                this.LL = c19eg;
                this.LLILLJJLI = liveBubbleData;
            }
        }, true);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_bubble_enter_queue");
        LIZ.getClass();
        LiveBubbleData liveBubbleData2 = LJII;
        Long lValueOf2 = null;
        if (liveBubbleData2 != null && (room2 = liveBubbleData2.roomData) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        LiveBubbleData liveBubbleData3 = LJII;
        if (liveBubbleData3 != null && (room = liveBubbleData3.roomData) != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LIZ();
        C0X4H.LIZ.getClass();
        ((ILiveBubblePopService) ServiceManager.get().getService(ILiveBubblePopService.class)).LJFF();
    }
}
