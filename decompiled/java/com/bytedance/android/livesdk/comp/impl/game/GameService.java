package com.bytedance.android.livesdk.comp.impl.game;

import X.AbstractC468490IYt;
import X.C09GA;
import X.C09JN;
import X.C0IF4;
import X.C0IJT;
import X.C0IQQ;
import X.C0J1N;
import X.C0J1R;
import X.C0KQH;
import X.C0TAA;
import X.C0TDF;
import X.C0TDU;
import X.C0TET;
import X.C0TFR;
import X.C0UO0;
import X.C0UW2;
import X.C0UW3;
import X.C0UW5;
import X.C0UW6;
import X.C0UW7;
import X.C0UW9;
import X.C0UWC;
import X.C0UWD;
import X.C0UX6;
import X.C0WZX;
import X.C1109440eyc;
import X.C1153020g6u;
import X.C1161920gLG;
import X.C11NZ;
import X.C11PQ;
import X.C11RD;
import X.C11RK;
import X.C11S5;
import X.C1269340j8W;
import X.C1300610jwx;
import X.C1305320k4Y;
import X.C1338270kvh;
import X.C13LE;
import X.C13LQ;
import X.C14KS;
import X.C150R;
import X.C163900k1;
import X.C1701330uNH;
import X.C1701940uOG;
import X.C1811940xFg;
import X.C19719912Dl;
import X.C19EG;
import X.C1CC2;
import X.C20337914i1;
import X.C20441214yg;
import X.C212350188e;
import X.C2177041AIc;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2348809Ig;
import X.C247600xW;
import X.C262200zs;
import X.C2659011d;
import X.C2660011e;
import X.C465520INi;
import X.C468440IYo;
import X.C469790IbZ;
import X.C474500IjA;
import X.C478080Iow;
import X.C480460Ism;
import X.C497740JfY;
import X.C498390Jgb;
import X.C516201zk;
import X.C516401zm;
import X.C580610Mpv;
import X.C743440TEg;
import X.C743550TEr;
import X.C743580TEu;
import X.C770500UKi;
import X.C772710USv;
import X.C773530UVz;
import X.C773730UWt;
import X.C776440Ud0;
import X.C776710UdR;
import X.C786410Ut5;
import X.C931130aL1;
import X.C931160aL4;
import X.EnumC785640Urq;
import X.InterfaceC1112400f3O;
import X.InterfaceC19562711gH;
import X.InterfaceC465600INq;
import X.InterfaceC471600IeU;
import X.InterfaceC772390URp;
import X.InterfaceC773130UUl;
import Y.ACListenerS142S0100000_7;
import Y.AfS153S0200000_17;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.PushStreamInfo;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.dataChannel.BroadcastShareScreenDefinition;
import com.bytedance.android.livesdk.dataChannel.GameRecommendQuickCommentChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.StreamLogUploadEvent;
import com.bytedance.android.livesdk.game.api.GameLiveServerFeatureApi;
import com.bytedance.android.livesdk.game.bottombar.GameLiveBottombarFlowActivity;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameFloatWindowTipsDialog;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameInGameRankDialog;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameScreenShareTipsDialog;
import com.bytedance.android.livesdk.game.broadcast.education.GameLiveNewBroadcastEducationBannerWidget;
import com.bytedance.android.livesdk.game.broadcast.fragment.GameDualDeviceSourceFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneAsCameraFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.GamePhoneCameraScannerFragment;
import com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3.GameDualDeviceDialogV3;
import com.bytedance.android.livesdk.game.broadcast.highlight.PreviewHighLightVideoWidget;
import com.bytedance.android.livesdk.game.broadcast.interruption.PreviewMultiDeviceInterruptGuide;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastChooseFragment;
import com.bytedance.android.livesdk.game.broadcast.tns.api.TnsPiracyApi;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryFragment;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdk.game.model.GameServerFeature;
import com.bytedance.android.livesdk.game.points.GamePointsMgr;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverMarkWidget;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.android.livesdk.livesetting.GblServerFeaturesListSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDualDeviceQRCodeCacheSetting;
import com.bytedance.android.livesdk.livesetting.game.EnableMobileGameBroadcastFeedbackInfoAndDiagnose;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceRtcTestingSetting;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentAudienceEnabledSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveServiceManagerOptSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.log.monitor.IPerformanceManager;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsGamingModeratorsCommentGuide;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.GameAction;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.AwS256S0300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import webcast.api.game.CreateInfoResponse;
import webcast.api.game.GetAllGameFeaturesResponse;
import webcast.api.game.InGameRankSettingResponse;

/* JADX INFO: loaded from: classes13.dex */
public class GameService implements IGameService {
    public C0UW7 LL;
    public volatile boolean LLILLJJLI;
    public C478080Iow LLILLL;
    public C469790IbZ LLILZ;

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C19719912Dl CH0() {
        return C13LE.LIZ(GameLiveNewBroadcastEducationBannerWidget.class);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void iu1() {
        C0UW3.LIZ = false;
        C0UW3.LIZIZ = null;
        C0UW3.LIZJ = 0;
        C0UW3.LIZLLL = "";
        C0UW3.LJ = false;
        C0UW3.LJFF = "";
        C0UW3.LJI = false;
        C0UW3.LJII = false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void jN() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void pm2() {
        C743550TEr.LIZIZ = null;
        C743550TEr.LIZJ = null;
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "release cache bitmap");
        C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
        C743580TEu.LIZJ.set(false);
        C743580TEu.LIZLLL.set(false);
        C20441214yg.LJIIIZ("DualDeviceQRCodeHelper", "release cache tips");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C19719912Dl xG0() {
        return C13LE.LIZ(PreviewHighLightVideoWidget.class);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameInGameRankDialog BQ1() {
        Bundle bundle = new Bundle();
        GameInGameRankDialog gameInGameRankDialog = new GameInGameRankDialog();
        gameInGameRankDialog.setArguments(bundle);
        return gameInGameRankDialog;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final CreateInfoResponse.ResponseData I92() {
        if (C163900k1.LIZ == null) {
            C20441214yg.LIZIZ("GameService", "gameCreateInfo is null");
        }
        return C163900k1.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final InterfaceC471600IeU Kj2() {
        C478080Iow c478080Iow = this.LLILLL;
        if (c478080Iow != null) {
            return (InterfaceC471600IeU) c478080Iow.invoke();
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void NI0() {
        C773530UVz c773530UVz = C773530UVz.LIZ;
        synchronized (c773530UVz) {
            Map<String, Object> map = C1338270kvh.LIZ;
            c773530UVz.LJIIIZ();
            C773530UVz.LJIJJLI = null;
            C773530UVz.LIZJ.set(true);
            C773530UVz.LJFF.set(System.currentTimeMillis());
            C773530UVz.LJJ = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(new InterfaceC19562711gH() { // from class: X.0UW8
                @Override // X.InterfaceC19562711gH
                public final void LLF(Context context) {
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }

                @Override // X.InterfaceC19562711gH
                public final void LLLLIILLL(Context context) {
                    C773530UVz.LJIL.set(true);
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
            });
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C2177041AIc NM1() {
        return new C2177041AIc();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean RW1() {
        C0UW2 c0uw2LJII = C773530UVz.LIZ.LJII();
        return c0uw2LJII != null && c0uw2LJII.LJJJI == 1;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void WI() {
        IMixCategoryAbility iMixCategoryAbility;
        C469790IbZ c469790IbZ = this.LLILZ;
        if (c469790IbZ == null || (iMixCategoryAbility = (IMixCategoryAbility) c469790IbZ.invoke()) == null) {
            return;
        }
        iMixCategoryAbility.k92();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void ae1() {
        C773530UVz.LIZ.getClass();
        C773530UVz.LJIJJ.set(true);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C262200zs dm2() {
        return new C262200zs();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C150R e52() {
        return new C150R();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void initPublicScreenConfiguration() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new C1109440eyc());
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x02e9  */
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String ln2() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 989
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.GameService.ln2():java.lang.String");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void qz0() {
        Map<C0UW5, C0UWD> map = C0UW6.LIZ;
        Iterator it2 = ((LinkedHashMap) C0UW6.LIZ).entrySet().iterator();
        while (it2.hasNext()) {
            C0UWD c0uwd = (C0UWD) ((Map.Entry) it2.next()).getValue();
            if (c0uwd != null) {
                c0uwd.LIZIZ();
            }
        }
        C0UW6.LIZIZ.set(true);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final String r50() {
        String string;
        String str;
        C773530UVz c773530UVz = C773530UVz.LIZ;
        synchronized (c773530UVz) {
            System.currentTimeMillis();
            C0UW2 c0uw2LJII = c773530UVz.LJII();
            JSONArray jSONArray = new JSONArray();
            if (c0uw2LJII != null) {
                C773530UVz.LIZJ(jSONArray, c0uw2LJII);
                C773530UVz.LIZLLL(jSONArray, c0uw2LJII);
                C773530UVz.LJ(jSONArray, c0uw2LJII);
                C773530UVz.LJI(jSONArray, c0uw2LJII);
                C773530UVz.LJFF(jSONArray);
                int i = 0;
                if (C773530UVz.LJIJJ.getAndSet(false)) {
                    str = "link_mic_silence";
                    i = 1;
                } else {
                    str = "";
                }
                String strValueOf = String.valueOf(i);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str);
                jSONArray.put(C773530UVz.LIZ("diagnose_audio_issue", strValueOf, arrayList));
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            string = jSONArray.toString();
        }
        return string;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameAutoCoverMarkWidget ss0() {
        return new GameAutoCoverMarkWidget();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void x2() {
        IMixCategoryAbility iMixCategoryAbility;
        C469790IbZ c469790IbZ = this.LLILZ;
        if (c469790IbZ == null || (iMixCategoryAbility = (IMixCategoryAbility) c469790IbZ.invoke()) == null) {
            return;
        }
        iMixCategoryAbility.x2();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean yP1() {
        return EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void zI0() {
        if (((LinkedHashMap) C0UW6.LIZ).get(C0UW5.HIGH_PING_BITRATE_ADJUST_MODULE) != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final PushStreamInfo.Quality WG1() {
        return C773730UWt.LIZJ();
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final Pair<Float, Float> dQ1() {
        Object obj;
        Float f;
        Float f2;
        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId());
        float fFloatValue = 0.0f;
        Float fValueOf = Float.valueOf(0.0f);
        if (c09gaLIZIZ == null) {
            return new Pair<>(fValueOf, fValueOf);
        }
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        C1300610jwx c1300610jwx2 = C1300610jwx.LJIIJ;
        Bundle bundle = new Bundle();
        c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx, c1300610jwx2}, bundle);
        Object obj2 = null;
        try {
            obj = bundle.get(c1300610jwx.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        Float fValueOf2 = Float.valueOf((!(obj instanceof Float) || (f2 = (Float) obj) == null) ? 0.0f : f2.floatValue());
        try {
            obj2 = bundle.get(c1300610jwx2.LIZ);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (OutOfMemoryError e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        if ((obj2 instanceof Float) && (f = (Float) obj2) != null) {
            fFloatValue = f.floatValue();
        }
        return new Pair<>(fValueOf2, Float.valueOf(fFloatValue));
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean dU() {
        return C0TDF.LJI();
    }

    public final void onInit() {
        if (LiveServiceManagerOptSetting.enable()) {
            return;
        }
        this.LLILLJJLI = true;
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).jc0(new C1109440eyc());
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(50, new InterfaceC1112400f3O() { // from class: X.010n
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            public static String LIZJ(CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide) {
                GameAction gameAction;
                Integer numValueOf;
                if (capsuleBizParamsGamingModeratorsCommentGuide != null && (gameAction = capsuleBizParamsGamingModeratorsCommentGuide.action) != null && (numValueOf = Integer.valueOf(gameAction.actionType)) != null) {
                    if (numValueOf.intValue() == 3) {
                        return "comment";
                    }
                    if (numValueOf.intValue() == 1) {
                        return "try";
                    }
                    return "";
                }
                return "";
            }

            public static void LIZLLL(C1112330f3H c1112330f3H) {
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel == null) {
                    return;
                }
                if (!C753430Tgz.LJIIJJI(dataChannel)) {
                    C766270U4b.LIZLLL(2131853851);
                    return;
                }
                DataChannel dataChannel2 = c1112330f3H.LLIIIILZ().LJIIIZ;
                Context context = c1112330f3H.LLIIIILZ().LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("open_page_time", String.valueOf(System.currentTimeMillis()));
                C753430Tgz.LJIIL("capsule", linkedHashMap, dataChannel2, context);
            }

            public static void LJ(C1112330f3H c1112330f3H) {
                IRoomFunctionService iRoomFunctionService;
                int i;
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel == null) {
                    return;
                }
                if (!((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).qA2()) {
                    C766270U4b.LIZLLL(2131853851);
                    return;
                }
                C0KX8 c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
                if (c0kx8 != null && c0kx8.LIZLLL) {
                    C766270U4b.LIZLLL(2131844187);
                    return;
                }
                if (C494680Jac.LJI(dataChannel)) {
                    if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel)) {
                        i = 2131856620;
                    } else {
                        i = 2131844448;
                    }
                    C766270U4b.LIZLLL(i);
                    return;
                }
                dataChannel.SX0(C753250Tgh.class, "capsule");
                if (dataChannel.gg0(C748880TZe.class) != null && (iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)) != null) {
                    iRoomFunctionService.le1();
                }
            }

            public static final void LJFF(C1112330f3H c1112330f3H) {
                CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide;
                Text text;
                MESSAGE message = c1112330f3H.LJIL;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) message).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsGamingModeratorsCommentGuide = capsuleBizParams.gamingModeratorsCommentGuide) == null || (text = capsuleBizParamsGamingModeratorsCommentGuide.replyMsgText) == null) {
                    return;
                }
                C1110530f0N c1110530f0N = new C1110530f0N(1, C0KVU.LIZ(capsuleBizParamsGamingModeratorsCommentGuide.user), "", C1133830fbx.LJIILIIL(text, "").toString(), C13BV.INSTANCE);
                c1110530f0N.LJ = "";
                c1110530f0N.LJIIL = message.getMessageId();
                c1110530f0N.LJIILIIL = c1112330f3H.LJIJ.LIZ;
                c1110530f0N.LJIIIZ = "message";
                c1110530f0N.LIZLLL = capsuleBizParamsGamingModeratorsCommentGuide.user;
                ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.COMMENT_GAME_MODERATOR_TIPS;
                sender.getLogArgs().clear();
                sender.getLogArgs().put("reply_method", "viewer");
                c1110530f0N.LJIIJ = sender;
                C784440Upu.LIZ().LIZIZ(c1110530f0N);
                C473050Igp.LIZIZ().LJFF(true);
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(GameRecommendQuickCommentChannel.class, capsuleBizParamsGamingModeratorsCommentGuide.recommendText);
                }
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                long jUptimeMillis;
                CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide;
                GameAction gameAction;
                try {
                    jUptimeMillis = SystemClock.uptimeMillis();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (jUptimeMillis - C2644010o.LIZ < 500) {
                    return true;
                }
                C2644010o.LIZ = jUptimeMillis;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsGamingModeratorsCommentGuide = capsuleBizParams.gamingModeratorsCommentGuide) == null || (gameAction = capsuleBizParamsGamingModeratorsCommentGuide.action) == null) {
                    return true;
                }
                int i = gameAction.actionType;
                if (i != 1) {
                    if (i == 3) {
                        LJFF(c1112330f3H);
                        return true;
                    }
                } else {
                    int i2 = gameAction.jumpPage;
                    if (i2 != 7) {
                        if (i2 == 13) {
                            LJ(c1112330f3H);
                            return true;
                        }
                    } else {
                        LIZLLL(c1112330f3H);
                        return true;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
            @Override // X.InterfaceC1112400f3O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(X.C1112330f3H r5, java.util.Map<java.lang.String, java.lang.String> r6) {
                /*
                    r4 = this;
                    MESSAGE extends X.0ffY r0 = r5.LJIL
                    com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
                    com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
                    r3 = 0
                    if (r0 == 0) goto L4e
                    com.bytedance.android.livesdk.model.message.CapsuleBizParamsGamingModeratorsCommentGuide r2 = r0.gamingModeratorsCommentGuide
                    if (r2 == 0) goto L15
                    com.bytedance.android.livesdk.model.message.common.Text r0 = r2.replyMsgText
                    if (r0 == 0) goto L15
                    java.lang.String r1 = r0.key
                    if (r1 != 0) goto L17
                L15:
                    java.lang.String r1 = ""
                L17:
                    java.lang.String r0 = "starling_key"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L4c
                    com.bytedance.android.livesdk.model.message.RecommendComment r0 = r2.recommendText
                    if (r0 == 0) goto L4c
                    long r0 = r0.tipsType
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L28:
                    java.lang.String r1 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = "tips_type"
                    r6.put(r0, r1)
                    java.lang.String r1 = LIZJ(r2)
                    java.lang.String r0 = "action_type"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L42
                    long r0 = r2.ruleId
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                L42:
                    java.lang.String r1 = java.lang.String.valueOf(r3)
                    java.lang.String r0 = "rule_id"
                    r6.put(r0, r1)
                    return
                L4c:
                    r0 = r3
                    goto L28
                L4e:
                    r2 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2643010n.LJII(X.0f3H, java.util.Map):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
            @Override // X.InterfaceC1112400f3O
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIFFI(X.C1112330f3H r5, java.util.Map<java.lang.String, java.lang.String> r6) {
                /*
                    r4 = this;
                    MESSAGE extends X.0ffY r0 = r5.LJIL
                    com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
                    com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
                    r3 = 0
                    if (r0 == 0) goto L4e
                    com.bytedance.android.livesdk.model.message.CapsuleBizParamsGamingModeratorsCommentGuide r2 = r0.gamingModeratorsCommentGuide
                    if (r2 == 0) goto L15
                    com.bytedance.android.livesdk.model.message.common.Text r0 = r2.replyMsgText
                    if (r0 == 0) goto L15
                    java.lang.String r1 = r0.key
                    if (r1 != 0) goto L17
                L15:
                    java.lang.String r1 = ""
                L17:
                    java.lang.String r0 = "starling_key"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L4c
                    com.bytedance.android.livesdk.model.message.RecommendComment r0 = r2.recommendText
                    if (r0 == 0) goto L4c
                    long r0 = r0.tipsType
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L28:
                    java.lang.String r1 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = "tips_type"
                    r6.put(r0, r1)
                    java.lang.String r1 = LIZJ(r2)
                    java.lang.String r0 = "action_type"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L42
                    long r0 = r2.ruleId
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                L42:
                    java.lang.String r1 = java.lang.String.valueOf(r3)
                    java.lang.String r0 = "rule_id"
                    r6.put(r0, r1)
                    return
                L4c:
                    r0 = r3
                    goto L28
                L4e:
                    r2 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2643010n.LJJIFFI(X.0f3H, java.util.Map):void");
            }
        });
        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).bQ1(51, new InterfaceC1112400f3O() { // from class: X.010n
            @Override // X.InterfaceC1112400f3O
            public final boolean LIZ() {
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJIL(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIIJ(C1112330f3H c1112330f3H) {
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIIZI(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIJIIJI() {
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
                return false;
            }

            @Override // X.InterfaceC1112400f3O
            public final int LJJIJL(CapsuleMessage capsuleMessage) {
                return -1;
            }

            @Override // X.InterfaceC1112400f3O
            public final LiveCapsuleStyleItemConfig LJI() {
                return C952230at3.LIZ();
            }

            public static String LIZJ(CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide) {
                GameAction gameAction;
                Integer numValueOf;
                if (capsuleBizParamsGamingModeratorsCommentGuide != null && (gameAction = capsuleBizParamsGamingModeratorsCommentGuide.action) != null && (numValueOf = Integer.valueOf(gameAction.actionType)) != null) {
                    if (numValueOf.intValue() == 3) {
                        return "comment";
                    }
                    if (numValueOf.intValue() == 1) {
                        return "try";
                    }
                    return "";
                }
                return "";
            }

            public static void LIZLLL(C1112330f3H c1112330f3H) {
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel == null) {
                    return;
                }
                if (!C753430Tgz.LJIIJJI(dataChannel)) {
                    C766270U4b.LIZLLL(2131853851);
                    return;
                }
                DataChannel dataChannel2 = c1112330f3H.LLIIIILZ().LJIIIZ;
                Context context = c1112330f3H.LLIIIILZ().LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("open_page_time", String.valueOf(System.currentTimeMillis()));
                C753430Tgz.LJIIL("capsule", linkedHashMap, dataChannel2, context);
            }

            public static void LJ(C1112330f3H c1112330f3H) {
                IRoomFunctionService iRoomFunctionService;
                int i;
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel == null) {
                    return;
                }
                if (!((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).qA2()) {
                    C766270U4b.LIZLLL(2131853851);
                    return;
                }
                C0KX8 c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
                if (c0kx8 != null && c0kx8.LIZLLL) {
                    C766270U4b.LIZLLL(2131844187);
                    return;
                }
                if (C494680Jac.LJI(dataChannel)) {
                    if (((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).Kw0(dataChannel)) {
                        i = 2131856620;
                    } else {
                        i = 2131844448;
                    }
                    C766270U4b.LIZLLL(i);
                    return;
                }
                dataChannel.SX0(C753250Tgh.class, "capsule");
                if (dataChannel.gg0(C748880TZe.class) != null && (iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)) != null) {
                    iRoomFunctionService.le1();
                }
            }

            public static final void LJFF(C1112330f3H c1112330f3H) {
                CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide;
                Text text;
                MESSAGE message = c1112330f3H.LJIL;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) message).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsGamingModeratorsCommentGuide = capsuleBizParams.gamingModeratorsCommentGuide) == null || (text = capsuleBizParamsGamingModeratorsCommentGuide.replyMsgText) == null) {
                    return;
                }
                C1110530f0N c1110530f0N = new C1110530f0N(1, C0KVU.LIZ(capsuleBizParamsGamingModeratorsCommentGuide.user), "", C1133830fbx.LJIILIIL(text, "").toString(), C13BV.INSTANCE);
                c1110530f0N.LJ = "";
                c1110530f0N.LJIIL = message.getMessageId();
                c1110530f0N.LJIILIIL = c1112330f3H.LJIJ.LIZ;
                c1110530f0N.LJIIIZ = "message";
                c1110530f0N.LIZLLL = capsuleBizParamsGamingModeratorsCommentGuide.user;
                ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.COMMENT_GAME_MODERATOR_TIPS;
                sender.getLogArgs().clear();
                sender.getLogArgs().put("reply_method", "viewer");
                c1110530f0N.LJIIJ = sender;
                C784440Upu.LIZ().LIZIZ(c1110530f0N);
                C473050Igp.LIZIZ().LJFF(true);
                DataChannel dataChannel = c1112330f3H.LLIIIILZ().LJIIIZ;
                if (dataChannel != null) {
                    dataChannel.zW(GameRecommendQuickCommentChannel.class, capsuleBizParamsGamingModeratorsCommentGuide.recommendText);
                }
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZJ();
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJIIIZ(C1112330f3H c1112330f3H) {
                long jUptimeMillis;
                CapsuleBizParamsGamingModeratorsCommentGuide capsuleBizParamsGamingModeratorsCommentGuide;
                GameAction gameAction;
                try {
                    jUptimeMillis = SystemClock.uptimeMillis();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (jUptimeMillis - C2644010o.LIZ < 500) {
                    return true;
                }
                C2644010o.LIZ = jUptimeMillis;
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsGamingModeratorsCommentGuide = capsuleBizParams.gamingModeratorsCommentGuide) == null || (gameAction = capsuleBizParamsGamingModeratorsCommentGuide.action) == null) {
                    return true;
                }
                int i = gameAction.actionType;
                if (i != 1) {
                    if (i == 3) {
                        LJFF(c1112330f3H);
                        return true;
                    }
                } else {
                    int i2 = gameAction.jumpPage;
                    if (i2 != 7) {
                        if (i2 == 13) {
                            LJ(c1112330f3H);
                            return true;
                        }
                    } else {
                        LIZLLL(c1112330f3H);
                        return true;
                    }
                }
                return true;
            }

            @Override // X.InterfaceC1112400f3O
            public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
                return C952230at3.LIZIZ(c1112330f3H);
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJII(C1112330f3H v, Map<String, String> v2) {
                /*
                    this = this;
                    MESSAGE extends X.0ffY r0 = r5.LJIL
                    com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
                    com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
                    r3 = 0
                    if (r0 == 0) goto L4e
                    com.bytedance.android.livesdk.model.message.CapsuleBizParamsGamingModeratorsCommentGuide r2 = r0.gamingModeratorsCommentGuide
                    if (r2 == 0) goto L15
                    com.bytedance.android.livesdk.model.message.common.Text r0 = r2.replyMsgText
                    if (r0 == 0) goto L15
                    java.lang.String r1 = r0.key
                    if (r1 != 0) goto L17
                L15:
                    java.lang.String r1 = ""
                L17:
                    java.lang.String r0 = "starling_key"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L4c
                    com.bytedance.android.livesdk.model.message.RecommendComment r0 = r2.recommendText
                    if (r0 == 0) goto L4c
                    long r0 = r0.tipsType
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L28:
                    java.lang.String r1 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = "tips_type"
                    r6.put(r0, r1)
                    java.lang.String r1 = LIZJ(r2)
                    java.lang.String r0 = "action_type"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L42
                    long r0 = r2.ruleId
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                L42:
                    java.lang.String r1 = java.lang.String.valueOf(r3)
                    java.lang.String r0 = "rule_id"
                    r6.put(r0, r1)
                    return
                L4c:
                    r0 = r3
                    goto L28
                L4e:
                    r2 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2643010n.LJII(X.0f3H, java.util.Map):void");
            }

            @Override // X.InterfaceC1112400f3O
            public final void LJJIFFI(C1112330f3H v, Map<String, String> v2) {
                /*
                    this = this;
                    MESSAGE extends X.0ffY r0 = r5.LJIL
                    com.bytedance.android.livesdk.model.message.CapsuleMessage r0 = (com.bytedance.android.livesdk.model.message.CapsuleMessage) r0
                    com.bytedance.android.livesdk.model.message.CapsuleBizParams r0 = r0.bizParams
                    r3 = 0
                    if (r0 == 0) goto L4e
                    com.bytedance.android.livesdk.model.message.CapsuleBizParamsGamingModeratorsCommentGuide r2 = r0.gamingModeratorsCommentGuide
                    if (r2 == 0) goto L15
                    com.bytedance.android.livesdk.model.message.common.Text r0 = r2.replyMsgText
                    if (r0 == 0) goto L15
                    java.lang.String r1 = r0.key
                    if (r1 != 0) goto L17
                L15:
                    java.lang.String r1 = ""
                L17:
                    java.lang.String r0 = "starling_key"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L4c
                    com.bytedance.android.livesdk.model.message.RecommendComment r0 = r2.recommendText
                    if (r0 == 0) goto L4c
                    long r0 = r0.tipsType
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L28:
                    java.lang.String r1 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = "tips_type"
                    r6.put(r0, r1)
                    java.lang.String r1 = LIZJ(r2)
                    java.lang.String r0 = "action_type"
                    r6.put(r0, r1)
                    if (r2 == 0) goto L42
                    long r0 = r2.ruleId
                    java.lang.Long r3 = java.lang.Long.valueOf(r0)
                L42:
                    java.lang.String r1 = java.lang.String.valueOf(r3)
                    java.lang.String r0 = "rule_id"
                    r6.put(r0, r1)
                    return
                L4c:
                    r0 = r3
                    goto L28
                L4e:
                    r2 = r3
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2643010n.LJJIFFI(X.0f3H, java.util.Map):void");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C1153020g6u Tk1() {
        return C1153020g6u.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void WK() {
        GameCast gameCast = GameCast.LIZ;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void hY() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void lU0() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void na1() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void ot0() {
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameAutoCoverWidget DK(String str) {
        return new GameAutoCoverWidget(str);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final BaseFragment F60(Map map) {
        HashMap map2 = (HashMap) map;
        Object obj = map2.get("is_rtc");
        if (obj == null) {
            obj = 0;
        }
        Object obj2 = map2.get("ver");
        if (obj2 == null) {
            obj2 = -1;
        }
        if (Intrinsics.LJFF(obj, 1)) {
            return C0TAA.LIZ(map);
        }
        if (GameDualDeviceRtcTestingSetting.INSTANCE.isDefault() && Intrinsics.LJFF(obj2, -1)) {
            return C0TAA.LIZ(map);
        }
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_plugin_not_loaded");
            c474500IjALIZ.LJJII("create_fragment", "from");
            Object obj3 = map2.get("room_id");
            if (obj3 == null) {
                obj3 = "";
            }
            c474500IjALIZ.LJJII(obj3, "room_id");
            c474500IjALIZ.LIZ();
            return null;
        }
        String str = GameDualDeviceSourceFragmentV2._pnsPageId;
        C20441214yg.LJIIIZ("GameDualDeviceSourceV2", map.toString());
        GameDualDeviceSourceFragmentV2 gameDualDeviceSourceFragmentV2 = new GameDualDeviceSourceFragmentV2();
        Bundle bundle = new Bundle();
        for (String str2 : map2.keySet()) {
            Object obj4 = map2.get(str2);
            if (obj4 instanceof Integer) {
                bundle.putInt(str2, ((Number) obj4).intValue());
            } else if (obj4 instanceof String) {
                C786410Ut5.LJJJI(str2, (String) obj4, bundle);
            } else if (obj4 instanceof Float) {
                bundle.putFloat(str2, ((Number) obj4).floatValue());
            } else if (obj4 instanceof Long) {
                bundle.putLong(str2, ((Number) obj4).longValue());
            }
        }
        gameDualDeviceSourceFragmentV2.setArguments(bundle);
        return gameDualDeviceSourceFragmentV2;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GamePhoneCameraScannerFragment HN2(Bundle bundle) {
        GamePhoneCameraScannerFragment gamePhoneCameraScannerFragment = new GamePhoneCameraScannerFragment();
        gamePhoneCameraScannerFragment.setArguments(bundle);
        return gamePhoneCameraScannerFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Iw0(Fragment fragment) {
        C11PQ<SpannableStringBuilder> c11pq = C743580TEu.LIZ;
        C743580TEu.LIZJ(fragment);
        C743580TEu.LIZIZ();
    }

    @Override // X.C0IF4
    public final void LIZIZ(DataChannel dataChannel) {
        C0IF4 c0if4;
        if (dataChannel != null && (c0if4 = (C0IF4) C2659011d.LIZ(dataChannel, InterfaceC465600INq.class)) != null) {
            c0if4.LIZIZ(dataChannel);
        }
    }

    @Override // X.C0IF4
    public final void LJII(DataChannel dataChannel) {
        C0IF4 c0if4;
        if (dataChannel != null && (c0if4 = (C0IF4) C2659011d.LIZ(dataChannel, InterfaceC465600INq.class)) != null) {
            c0if4.LJII(dataChannel);
        }
    }

    @Override // X.C0IF4
    public final void LJIIIIZZ(DataChannel dataChannel) {
        if (dataChannel != null) {
            C0IF4 c0if4 = (C0IF4) C2659011d.LIZ(dataChannel, InterfaceC465600INq.class);
            if (c0if4 != null) {
                c0if4.LJIIIIZZ(dataChannel);
            }
            C2660011e c2660011e = (C2660011e) dataChannel.gg0(C770500UKi.class);
            if (c2660011e != null) {
                ((ConcurrentHashMap) c2660011e.LIZ).remove(InterfaceC465600INq.class);
            }
            C0UWC c0uwc = (C0UWC) C2659011d.LIZ(dataChannel, C0UWC.class);
            if (c0uwc != null) {
                c0uwc.onDestroy();
            }
            C2660011e c2660011e2 = (C2660011e) dataChannel.gg0(C770500UKi.class);
            if (c2660011e2 != null) {
                ((ConcurrentHashMap) c2660011e2.LIZ).remove(C0UWC.class);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void SD2(ACListenerS142S0100000_7 aCListenerS142S0100000_7) {
        IMixCategoryAbility iMixCategoryAbility;
        C469790IbZ c469790IbZ = this.LLILZ;
        if (c469790IbZ != null && (iMixCategoryAbility = (IMixCategoryAbility) c469790IbZ.invoke()) != null) {
            iMixCategoryAbility.mu0(aCListenerS142S0100000_7);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void YD(String str) {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ArrayList) C247600xW.LLILZLL).add(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fragment_id", str);
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        C1CC2.LJII(-1, C0KQH.LIZ("ttlive_highlight_to_draft_monitor"), linkedHashMap);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final PreviewMultiDeviceInterruptGuide Z70(Fragment fragment) {
        return new PreviewMultiDeviceInterruptGuide(fragment);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void bx2(final int i) {
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0UW4
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameService@298.storeLiveCoreNetworkStatusRepeat$1");
                C773530UVz c773530UVz = C773530UVz.LIZ;
                int i2 = i;
                synchronized (c773530UVz) {
                    if (C773530UVz.LIZJ.get()) {
                        C773530UVz.LJIILIIL.add(Integer.valueOf(i2));
                    }
                }
                C1C7U.LIZIZ("GameService@298.storeLiveCoreNetworkStatusRepeat$1");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void iD0(final C1269340j8W c1269340j8W) {
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0UW1
            /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: all -> 0x00c3, PHI: r0
              0x002b: PHI (r0v4 android.app.ActivityManager) = (r0v3 android.app.ActivityManager), (r0v30 android.app.ActivityManager) binds: [B:5:0x0014, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0049 A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: all -> 0x00c3, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0016, B:8:0x001c, B:9:0x0022, B:13:0x0035, B:15:0x0049, B:16:0x0052, B:18:0x0056, B:19:0x005f, B:21:0x0063, B:22:0x006c, B:24:0x0071, B:25:0x0077, B:27:0x007b, B:28:0x0081, B:30:0x0085, B:32:0x0091, B:33:0x0095, B:34:0x0097, B:36:0x009b, B:38:0x00b0, B:40:0x00b4, B:41:0x00b6, B:12:0x002b), top: B:49:0x000a }] */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.String r0 = "GameService@298.updateGameLiveStreamConfigToFeedbackDiagnose$1"
                    X.C1C7U.LIZ(r0)
                    X.0UVz r8 = X.C773530UVz.LIZ
                    X.0j8W r6 = r1
                    monitor-enter(r8)
                    java.util.Map<java.lang.String, java.lang.Object> r0 = X.C1338270kvh.LIZ     // Catch: java.lang.Throwable -> Lc3
                    android.app.ActivityManager$MemoryInfo r3 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Throwable -> Lc3
                    r3.<init>()     // Catch: java.lang.Throwable -> Lc3
                    android.app.ActivityManager r0 = X.C773530UVz.LJIJ     // Catch: java.lang.Throwable -> Lc3
                    r4 = 0
                    if (r0 != 0) goto L2b
                    android.content.Context r1 = X.C497740JfY.LJII()     // Catch: java.lang.Throwable -> Lc3
                    if (r1 == 0) goto L27
                    java.lang.String r0 = "activity"
                    java.lang.Object r0 = X.C786410Ut5.H2(r1, r0)     // Catch: java.lang.Throwable -> Lc3
                L22:
                    android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Throwable -> Lc3
                    X.C773530UVz.LJIJ = r0     // Catch: java.lang.Throwable -> Lc3
                    goto L29
                L27:
                    r0 = r4
                    goto L22
                L29:
                    if (r0 == 0) goto L35
                L2b:
                    X.0WZX r2 = new X.0WZX     // Catch: java.lang.Throwable -> Lc3
                    java.lang.String r1 = "dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Lt1ii9BXT1/wqeOdlFK34ujZyDWQgaivCJEUF0fttKRQCJx8VP8="
                    r2.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lc3
                    X.C2204961BRm.LJFF(r0, r3, r2)     // Catch: java.lang.Throwable -> Lc3
                L35:
                    X.0UW9 r2 = new X.0UW9     // Catch: java.lang.Throwable -> Lc3
                    r2.<init>()     // Catch: java.lang.Throwable -> Lc3
                    X.C773530UVz.LIZLLL = r2     // Catch: java.lang.Throwable -> Lc3
                    int r0 = r6.LJJIJIIJI()     // Catch: java.lang.Throwable -> Lc3
                    long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc3
                    r2.LJFF = r0     // Catch: java.lang.Throwable -> Lc3
                    X.0UW9 r2 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    r7 = 1000(0x3e8, float:1.401E-42)
                    if (r2 == 0) goto L52
                    int r0 = r6.LJJIFFI()     // Catch: java.lang.Throwable -> Lc3
                    long r4 = (long) r0     // Catch: java.lang.Throwable -> Lc3
                    long r0 = (long) r7     // Catch: java.lang.Throwable -> Lc3
                    long r4 = r4 / r0
                    r2.LJ = r4     // Catch: java.lang.Throwable -> Lc3
                L52:
                    X.0UW9 r2 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    if (r2 == 0) goto L5f
                    int r0 = r6.LJJIJIL()     // Catch: java.lang.Throwable -> Lc3
                    long r4 = (long) r0     // Catch: java.lang.Throwable -> Lc3
                    long r0 = (long) r7     // Catch: java.lang.Throwable -> Lc3
                    long r4 = r4 / r0
                    r2.LIZLLL = r4     // Catch: java.lang.Throwable -> Lc3
                L5f:
                    X.0UW9 r2 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    if (r2 == 0) goto L6c
                    int r0 = r6.LJJIJL()     // Catch: java.lang.Throwable -> Lc3
                    long r4 = (long) r0     // Catch: java.lang.Throwable -> Lc3
                    long r0 = (long) r7     // Catch: java.lang.Throwable -> Lc3
                    long r4 = r4 / r0
                    r2.LIZJ = r4     // Catch: java.lang.Throwable -> Lc3
                L6c:
                    X.0UW9 r1 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    r5 = 0
                    if (r1 == 0) goto L77
                    int r0 = r6.LJJIL(r5)     // Catch: java.lang.Throwable -> Lc3
                    r1.LJI = r0     // Catch: java.lang.Throwable -> Lc3
                L77:
                    X.0UW9 r1 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    if (r1 == 0) goto L81
                    int r0 = r6.LJJIJIIJIL(r5)     // Catch: java.lang.Throwable -> Lc3
                    r1.LJII = r0     // Catch: java.lang.Throwable -> Lc3
                L81:
                    X.0UW9 r2 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    if (r2 == 0) goto L97
                    com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Throwable -> Lc3
                    java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
                    java.lang.Object r0 = r1.gg0(r0)     // Catch: java.lang.Throwable -> Lc3
                    com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Throwable -> Lc3
                    if (r0 == 0) goto Lb9
                    long r0 = r0.getId()     // Catch: java.lang.Throwable -> Lc3
                L95:
                    r2.LIZIZ = r0     // Catch: java.lang.Throwable -> Lc3
                L97:
                    X.0UW9 r4 = X.C773530UVz.LIZLLL     // Catch: java.lang.Throwable -> Lc3
                    if (r4 == 0) goto Lbc
                    long r2 = r3.totalMem     // Catch: java.lang.Throwable -> Lc3
                    r0 = 1000000(0xf4240, float:1.401298E-39)
                    long r0 = (long) r0     // Catch: java.lang.Throwable -> Lc3
                    long r2 = r2 / r0
                    r4.LIZ = r2     // Catch: java.lang.Throwable -> Lc3
                    com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Throwable -> Lc3
                    java.lang.Class<X.0aKi> r0 = X.C930940aKi.class
                    java.lang.Object r0 = r1.gg0(r0)     // Catch: java.lang.Throwable -> Lc3
                    com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0     // Catch: java.lang.Throwable -> Lc3
                    if (r0 == 0) goto Lb6
                    com.bytedance.android.livesdk.model.Creator r0 = r0.creator     // Catch: java.lang.Throwable -> Lc3
                    if (r0 == 0) goto Lb6
                    int r5 = r0.roomContinue     // Catch: java.lang.Throwable -> Lc3
                Lb6:
                    r4.LJIIIIZZ = r5     // Catch: java.lang.Throwable -> Lc3
                    goto Lbc
                Lb9:
                    r0 = 0
                    goto L95
                Lbc:
                    monitor-exit(r8)
                    java.lang.String r0 = "GameService@298.updateGameLiveStreamConfigToFeedbackDiagnose$1"
                    X.C1C7U.LIZIZ(r0)
                    return
                Lc3:
                    r0 = move-exception
                    monitor-exit(r8)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0UW1.accept(java.lang.Object):void");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void jX0(final JSONObject jSONObject) {
        C11NZ.LJJJJZ(Boolean.TRUE).LJJJLZIJ(C11S5.LIZ()).LJJLJLI(new C09JN() { // from class: X.0UW0
            @Override // X.C09JN
            public final void accept(Object obj) {
                int i;
                long j;
                Object objH2;
                C1C7U.LIZ("GameService@298.storeLiveCoreDataRepeat$1");
                if (EnableMobileGameBroadcastFeedbackInfoAndDiagnose.INSTANCE.isEnable()) {
                    C773530UVz c773530UVz = C773530UVz.LIZ;
                    JSONObject jSONObject2 = jSONObject;
                    synchronized (c773530UVz) {
                        if (C773530UVz.LIZJ.get()) {
                            AtomicLong atomicLong = C773530UVz.LJ;
                            atomicLong.set(atomicLong.get() + 1);
                            System.currentTimeMillis();
                            try {
                                j = JSONObjectProtectorUtils.getLong(jSONObject2, "rtt");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                j = -1;
                            }
                            if (j >= 0) {
                                C773530UVz.LJI.add(Long.valueOf(j));
                            }
                            try {
                                long j2 = JSONObjectProtectorUtils.getLong(jSONObject2, "real_bitrate");
                                if (j2 >= 0) {
                                    C773530UVz.LJII.add(Long.valueOf(j2));
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                            try {
                                long j3 = JSONObjectProtectorUtils.getLong(jSONObject2, "real_video_framerate");
                                if (j3 >= 0) {
                                    C773530UVz.LJIIIIZZ.add(Long.valueOf(j3));
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                            C1300340jwW c1300340jwW = C476230Ilx.LIZ;
                            float f = c1300340jwW.LJFF;
                            boolean zLJII = c1300340jwW.LJII();
                            if (f > 0.0f) {
                                C773530UVz.LJIIIZ.add(new Pair<>(Float.valueOf(f), Boolean.valueOf(zLJII)));
                            }
                            Map<String, Object> map = C1338270kvh.LIZ;
                            C773530UVz.LJIIJ.add(Boolean.valueOf(C778190Ufp.LJFF()));
                            C773530UVz.LJIIL();
                            C773530UVz.LJIIJ(jSONObject2);
                            if (C773530UVz.LJ.get() % ((long) 3) == 0) {
                                C773530UVz.LJIIJJI();
                            }
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            ActivityManager activityManager = C773530UVz.LJIJ;
                            if (activityManager == null) {
                                Context contextLJII = C497740JfY.LJII();
                                if (contextLJII != null) {
                                    objH2 = C786410Ut5.H2(contextLJII, "activity");
                                } else {
                                    objH2 = null;
                                }
                                activityManager = (ActivityManager) objH2;
                                C773530UVz.LJIJ = activityManager;
                                if (activityManager != null) {
                                }
                                C773530UVz.LJIIZILJ.add(Long.valueOf(memoryInfo.availMem / ((long) 1000000)));
                                DataChannelGlobal.LLILZ.GQ2(StreamLogUploadEvent.class);
                            }
                            C2204961BRm.LJFF(activityManager, memoryInfo, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7Cugu7MyFf9A4/HWWwV5Lt1ii9BXT1/wqeOdlFK34ujZyDWQgaivCJEUF0fttKRQCJx8VP8=", null));
                            C773530UVz.LJIIZILJ.add(Long.valueOf(memoryInfo.availMem / ((long) 1000000)));
                            DataChannelGlobal.LLILZ.GQ2(StreamLogUploadEvent.class);
                        }
                    }
                }
                C779120UhK c779120UhK = (C779120UhK) ((LinkedHashMap) C0UW6.LIZ).get(C0UW5.HIGH_PING_BITRATE_ADJUST_MODULE);
                if (c779120UhK != null) {
                    JSONObject jSONObject3 = jSONObject;
                    int i2 = -1;
                    try {
                        i = JSONObjectProtectorUtils.getInt(jSONObject3, "meta_video_bitrate");
                    } catch (Exception e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        i = -1;
                    }
                    c779120UhK.LJ = i;
                    try {
                        i2 = JSONObjectProtectorUtils.getInt(jSONObject3, "real_bitrate");
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                    }
                    c779120UhK.LJFF = i2;
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                }
                C1C7U.LIZIZ("GameService@298.storeLiveCoreDataRepeat$1");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameFloatWindowTipsDialog ns1(String str) {
        GameFloatWindowTipsDialog gameFloatWindowTipsDialog = new GameFloatWindowTipsDialog();
        gameFloatWindowTipsDialog.LLILZ = str;
        return gameFloatWindowTipsDialog;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C776440Ud0 pB0(C776710UdR c776710UdR) {
        return new C776440Ud0(c776710UdR);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void qn2(C11RK c11rk) {
        IMixCategoryAbility iMixCategoryAbility;
        C469790IbZ c469790IbZ = this.LLILZ;
        if (c469790IbZ != null && (iMixCategoryAbility = (IMixCategoryAbility) c469790IbZ.invoke()) != null) {
            iMixCategoryAbility.Qz1(c11rk);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameCastChooseFragment sP2(Bundle bundle) {
        GameCastChooseFragment gameCastChooseFragment = new GameCastChooseFragment();
        gameCastChooseFragment.setArguments(bundle);
        return gameCastChooseFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void u71(PushStreamInfo.Quality quality) {
        C773730UWt.LJIIJJI(quality);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GamePhoneAsCameraFragment wt(Map map) {
        String str;
        Integer num;
        String str2;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Float f;
        Integer num6;
        String str3;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        String str4;
        String str5;
        Long l;
        C0TET c0tet;
        if (!LiveAppBundleUtils.isPluginAvailable(EnumC785640Urq.CAST, "other")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_plugin_not_loaded");
            c474500IjALIZ.LJJII("create_fragment", "from");
            Object obj = ((HashMap) map).get("room_id");
            if (obj == null) {
                obj = "";
            }
            c474500IjALIZ.LJJII(obj, "room_id");
            c474500IjALIZ.LIZ();
            return null;
        }
        HashMap map2 = (HashMap) map;
        Object obj2 = map2.get("source_ip");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = map2.get("source_port");
        if (obj3 instanceof Integer) {
            num = (Integer) obj3;
        } else {
            num = null;
        }
        Object obj4 = map2.get("room_id");
        if (obj4 instanceof String) {
            str2 = (String) obj4;
        } else {
            str2 = null;
        }
        Object obj5 = map2.get("video_w");
        if (obj5 instanceof Integer) {
            num2 = (Integer) obj5;
        } else {
            num2 = null;
        }
        Object obj6 = map2.get("video_h");
        if (obj6 instanceof Integer) {
            num3 = (Integer) obj6;
        } else {
            num3 = null;
        }
        Object obj7 = map2.get("ver");
        if (obj7 instanceof Integer) {
            num4 = (Integer) obj7;
        } else {
            num4 = null;
        }
        Object obj8 = map2.get("pcVersion");
        if (obj8 instanceof Integer) {
            num5 = (Integer) obj8;
        } else {
            num5 = null;
        }
        Object obj9 = map2.get("bit_rate_scale");
        if (obj9 instanceof Float) {
            f = (Float) obj9;
        } else {
            f = null;
        }
        Object obj10 = map2.get("fps");
        if (obj10 instanceof Integer) {
            num6 = (Integer) obj10;
        } else {
            num6 = null;
        }
        Object obj11 = map2.get("settings");
        if (obj11 instanceof String) {
            str3 = (String) obj11;
        } else {
            str3 = null;
        }
        Object obj12 = map2.get("audio_source");
        if (obj12 instanceof Integer) {
            num7 = (Integer) obj12;
        } else {
            num7 = null;
        }
        Object obj13 = map2.get("mic_scale");
        if (obj13 instanceof Integer) {
            num8 = (Integer) obj13;
        } else {
            num8 = null;
        }
        Object obj14 = map2.get("server_mode");
        if (obj14 instanceof Integer) {
            num9 = (Integer) obj14;
        } else {
            num9 = null;
        }
        Object obj15 = map2.get("landscape");
        if (obj15 instanceof Integer) {
            num10 = (Integer) obj15;
        } else {
            num10 = null;
        }
        Object obj16 = map2.get("uuid");
        if (obj16 instanceof String) {
            str4 = (String) obj16;
        } else {
            str4 = null;
        }
        Object obj17 = map2.get("enter_from");
        if (obj17 instanceof String) {
            str5 = (String) obj17;
        } else {
            str5 = null;
        }
        Object obj18 = map2.get("timestamp");
        if (obj18 instanceof Long) {
            l = (Long) obj18;
        } else {
            l = null;
        }
        Object obj19 = map2.get("phone_as_camera_link_type_key");
        if (!(obj19 instanceof String)) {
            obj19 = null;
        }
        if (Intrinsics.LJFF(obj19, "phone_as_camera_wired_link")) {
            c0tet = C0TET.WIRED;
        } else if (Intrinsics.LJFF(obj19, "phone_as_camera_wireless_link")) {
            c0tet = C0TET.WIRELESS;
        } else {
            c0tet = C0TET.WIRELESS;
        }
        C20441214yg.LJIIIZ("GamePhoneAsCameraFragment", map.toString());
        GamePhoneAsCameraFragment gamePhoneAsCameraFragment = new GamePhoneAsCameraFragment();
        Bundle bundle = new Bundle();
        if (num2 != null) {
            bundle.putInt("video_width", num2.intValue());
        }
        if (num3 != null) {
            bundle.putInt("video_height", num3.intValue());
        }
        C786410Ut5.LJJJI("source_ip", str, bundle);
        if (num != null) {
            bundle.putInt("source_port", num.intValue());
        }
        C786410Ut5.LJJJI("room_id", str2, bundle);
        if (num4 != null) {
            bundle.putInt("version", num4.intValue());
        }
        if (num5 != null) {
            bundle.putInt("pc_version", num5.intValue());
        }
        if (f != null) {
            bundle.putFloat("bit_rate_scale", f.floatValue());
        }
        if (num6 != null) {
            bundle.putInt("fps", num6.intValue());
        }
        if (str3 != null) {
            C786410Ut5.LJJJI("settings", str3, bundle);
        }
        if (num7 != null) {
            bundle.putInt("audio_source", num7.intValue());
        }
        if (num8 != null) {
            bundle.putInt("mic_scale", num8.intValue());
        }
        if (num9 != null) {
            bundle.putInt("server_mode", num9.intValue());
        }
        if (num10 != null) {
            bundle.putInt("landscape", num10.intValue());
        }
        if (str4 != null) {
            C786410Ut5.LJJJI("uuid", str4, bundle);
        }
        if (str5 != null) {
            C786410Ut5.LJJJI("enter_from", str5, bundle);
        }
        C786410Ut5.LJJIZ(bundle, "phone_as_camera_link_type_key", c0tet);
        if (l != null) {
            bundle.putLong("timestamp", l.longValue());
        }
        gamePhoneAsCameraFragment.setArguments(bundle);
        return gamePhoneAsCameraFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void CE0(Fragment fragment, long j) {
        Map<String, Object> map = C1338270kvh.LIZ;
        String strLJIIIIZZ = C2348809Ig.LJIIIIZZ(GblServerFeaturesListSetting.INSTANCE.getValue());
        C480460Ism.LIZ().getClass();
        ((GameLiveServerFeatureApi) C480460Ism.LIZLLL(GameLiveServerFeatureApi.class)).getAllGameFeatures(j, strLJIIIIZZ).LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new C09JN() { // from class: X.00JO
            @Override // X.C09JN
            public final void accept(Object obj) {
                GetAllGameFeaturesResponse.ResponseData responseData;
                List<GameServerFeature> list;
                C1C7U.LIZ("GameServerFeatureManager@7f7b.fetchGameFeatures$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && (responseData = (GetAllGameFeaturesResponse.ResponseData) baseResponse.data) != null && (list = responseData.features) != null) {
                    for (GameServerFeature gameServerFeature : list) {
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).vT0(gameServerFeature.id, gameServerFeature.value, gameServerFeature.valueMap);
                    }
                }
                C1C7U.LIZIZ("GameServerFeatureManager@7f7b.fetchGameFeatures$1");
            }
        }, new C09JN() { // from class: X.00Jd
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameServerFeatureManager@7f7b.fetchGameFeatures$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAllGameFeatures error: ");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("GameServerFeatureManager", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("GameServerFeatureManager@7f7b.fetchGameFeatures$2");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void KT(C19EG c19eg, GameLiveFragment gameLiveFragment) {
        C0UW7 c1811940xFg = this.LL;
        if (c1811940xFg == null) {
            c1811940xFg = new C1811940xFg();
        }
        this.LL = c1811940xFg;
        c1811940xFg.LIZ(c19eg, gameLiveFragment);
    }

    @Override // X.C0IF4
    public final void LIZ(Fragment fragment, DataChannel dataChannel) {
        C0IF4 c0if4;
        if (dataChannel != null && (c0if4 = (C0IF4) C2659011d.LIZ(dataChannel, InterfaceC465600INq.class)) != null) {
            c0if4.LJIIIIZZ(dataChannel);
        }
        GamePointsMgr gamePointsMgr = new GamePointsMgr();
        if (dataChannel != null) {
            C2659011d.LIZIZ(dataChannel, InterfaceC465600INq.class, gamePointsMgr, true);
        }
        gamePointsMgr.LIZ(fragment, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final boolean NQ(DataChannel dataChannel, C0UX6 c0ux6) {
        return C0IQQ.LIZ(dataChannel, c0ux6);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Oz0(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        C773730UWt.LJIIIIZZ(lifecycleOwner, dataChannel);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void VN0(Fragment fragment, DataChannel dataChannel) {
        boolean zLJI = MethodIDManager.LJI(202154);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C480460Ism.LIZ().getClass();
        ((TnsPiracyApi) C480460Ism.LIZLLL(TnsPiracyApi.class)).getPreviewGameCreateInfo().LJIILIIL(new C0UO0()).LJIILIIL(C0J1R.LIZIZ(fragment)).LJJLL(new C516401zm(jCurrentTimeMillis, dataChannel, 6), new C516201zk(dataChannel, 256));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Wp1(String str, String str2) {
        String str3;
        String str4;
        Long lValueOf;
        long jLongValue;
        Integer num;
        C773530UVz c773530UVz = C773530UVz.LIZ;
        synchronized (c773530UVz) {
            System.currentTimeMillis();
            C0UW2 c0uw2LJII = c773530UVz.LJII();
            if (c0uw2LJII != null) {
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                PushStreamInfo.Quality quality = (PushStreamInfo.Quality) dataChannelGlobal.gg0(BroadcastShareScreenDefinition.class);
                Long lValueOf2 = null;
                if (quality != null) {
                    str3 = quality.sdkKey;
                } else {
                    str3 = null;
                }
                if (C772710USv.LIZLLL()) {
                    str4 = "manual_speedtest";
                } else if (C772710USv.LIZJ()) {
                    str4 = "auto_speedtest";
                } else {
                    Map<String, String> mapLIZIZ = InterfaceC772390URp.p.LIZIZ();
                    if (mapLIZIZ != null && !mapLIZIZ.isEmpty()) {
                        str4 = "selected";
                    } else {
                        str4 = "default";
                    }
                }
                String strLIZIZ = InterfaceC772390URp.q.LIZIZ();
                if (strLIZIZ == null) {
                    strLIZIZ = "";
                }
                String strLIZIZ2 = InterfaceC772390URp.r.LIZIZ();
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "";
                }
                if (strLIZIZ.length() > 0 && strLIZIZ2.length() > 0) {
                    str3 = strLIZIZ;
                    str4 = strLIZIZ2;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ttlive_feedback_diagnose");
                c474500IjALIZ.LJJII(str2, "feedback_label_id");
                c474500IjALIZ.LJJII(str, "feedback_questionnaire_id");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                C0UW9 c0uw9 = C773530UVz.LIZLLL;
                if (c0uw9 != null) {
                    lValueOf = Long.valueOf(c0uw9.LIZIZ);
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "room_id");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJIIZI), "diagnose_video_birate_result");
                c474500IjALIZ.LJJII(c0uw2LJII.LJJIJ, "diagnose_video_birate_bad_reason");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJIJIIJI), "diagnose_video_framerate_result");
                c474500IjALIZ.LJJII(c0uw2LJII.LJJIJIIJIL, "diagnose_video_framerate_bad_reason");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJIJIL), "diagnose_push_stream_network_result");
                c474500IjALIZ.LJJII(c0uw2LJII.LJJIJL, "diagnose_push_stream_network_bad_reason");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJJI), "app_had_enter_background");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJIJLIJ), "diagnose_game_fps_result");
                c474500IjALIZ.LJJII(c0uw2LJII.LJJIL, "diagnose_game_fps_bad_reason");
                c474500IjALIZ.LJJII(str3, "definitions");
                c474500IjALIZ.LJJII(str4, "definition_select_strategy");
                String str5 = (String) dataChannelGlobal.gg0(C931130aL1.class);
                if (str5 == null) {
                    str5 = "";
                }
                c474500IjALIZ.LJJII(str5, "game_category");
                Long l = (Long) dataChannelGlobal.gg0(C931160aL4.class);
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                double d = jLongValue * ((double) 8);
                double d2 = 1024;
                c474500IjALIZ.LJJIII("speed_detection_result", Double.valueOf((d / d2) / d2));
                c474500IjALIZ.LJJIII("real_bitrate_avg", Double.valueOf(c0uw2LJII.LIZ));
                c474500IjALIZ.LJJIII("real_video_framerate_avg", Double.valueOf(c0uw2LJII.LJFF));
                if (C773530UVz.LIZLLL != null) {
                    num = 0;
                } else {
                    num = null;
                }
                c474500IjALIZ.LJJII(num, "auto_bitrate_strategy");
                c474500IjALIZ.LJJII(Integer.valueOf(C1305320k4Y.LJ(C497740JfY.LJII())), "cpu_cores");
                c474500IjALIZ.LJJIII("cpu_speed_avg", Double.valueOf(c0uw2LJII.LJIIZILJ));
                c474500IjALIZ.LJJIII("cpu_rate_avg", Double.valueOf(c0uw2LJII.LJIJ));
                c474500IjALIZ.LJJIII("single_core_speed_avg", Double.valueOf(c0uw2LJII.LJIJI));
                C0UW9 c0uw92 = C773530UVz.LIZLLL;
                if (c0uw92 != null) {
                    lValueOf2 = Long.valueOf(c0uw92.LIZ);
                }
                c474500IjALIZ.LJJII(lValueOf2, "device_memory");
                c474500IjALIZ.LJJIII("free_memory_avg", Double.valueOf(c0uw2LJII.LJIJJ));
                c474500IjALIZ.LJJIII("battery_thermal_avg", Double.valueOf(c0uw2LJII.LJIJJLI));
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0uw2LJII.LJIL), "battery_thermal_max");
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0uw2LJII.LJJ), "battery_thermal_min");
                c474500IjALIZ.LJJIII("battery_thermal_higher_percent", Double.valueOf(c0uw2LJII.LJJI));
                c474500IjALIZ.LJJIII("low_battery_percent", Double.valueOf(c0uw2LJII.LJJIIJ));
                c474500IjALIZ.LJJIII("saver_mode_percent", Double.valueOf(c0uw2LJII.LJJIII));
                c474500IjALIZ.LJJIII("low_push_bitrate_proportion", Double.valueOf(c0uw2LJII.LIZJ));
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJ * 5), "low_push_bitrate_max_continuous_duration");
                c474500IjALIZ.LJJIII("low_push_framerate_proportion", Double.valueOf(c0uw2LJII.LJIIIIZZ));
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJIIJ * 5), "low_push_framerate_max_continuous_duration");
                c474500IjALIZ.LJJIII("avg_push_rtt", Double.valueOf(c0uw2LJII.LJIIJJI));
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJIILIIL * 5), "high_push_rtt_max_continuous_duration");
                c474500IjALIZ.LJJIII("low_battery_proportion", Double.valueOf(c0uw2LJII.LJJIIJ));
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJJII * 5), "high_temperature_max_continuous_duration");
                c474500IjALIZ.LJJIII("power_save_mode_proportion", Double.valueOf(c0uw2LJII.LJJIII));
                c474500IjALIZ.LJJII(Long.valueOf(c0uw2LJII.LJJIZ), "live_duration");
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0uw2LJII.LJJJ), "low_live_core_network_proportion");
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0uw2LJII.LJIILL), "avg_ping");
                c474500IjALIZ.LJJIFFI(Float.valueOf(c0uw2LJII.LJIILLIIL), "high_ping_proportion");
                c474500IjALIZ.LJJII(Integer.valueOf(c0uw2LJII.LJIILJJIL), "valid_ping_count");
                c474500IjALIZ.LIZ();
            }
            Map<String, Object> map = C1338270kvh.LIZ;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameDrawerCategoryFragment e90(Object obj, Object obj2) {
        GameDrawerCategoryFragment gameDrawerCategoryFragment = new GameDrawerCategoryFragment(obj, obj2);
        this.LLILLL = new C478080Iow(gameDrawerCategoryFragment);
        this.LLILZ = new C469790IbZ(gameDrawerCategoryFragment);
        gameDrawerCategoryFragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.livesdk.comp.impl.game.GameService$getGameDrawerCategoryFragment$1$3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    GameService gameService = this.LL;
                    gameService.LLILLL = null;
                    gameService.LLILZ = null;
                }
            }
        });
        return gameDrawerCategoryFragment;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameScreenShareTipsDialog eq0(FragmentManager fragmentManager, AwS256S0300000_12 awS256S0300000_12) {
        if (fragmentManager != null) {
            GameScreenShareTipsDialog gameScreenShareTipsDialog = new GameScreenShareTipsDialog();
            gameScreenShareTipsDialog.show(fragmentManager, "GameScreenShareTipsDialog");
            gameScreenShareTipsDialog.LLILZIL = awS256S0300000_12;
            return gameScreenShareTipsDialog;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C11PQ<InGameRankSettingResponse.ResponseData> kl0(LifecycleOwner lifecycleOwner, boolean z) {
        return C0TFR.LIZ(lifecycleOwner, z, null, 4);
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final GameBroadcastFragment pk(InterfaceC773130UUl interfaceC773130UUl, Bundle bundle) {
        IPerformanceManager iPerformanceManager = C465520INi.LIZ;
        iPerformanceManager.fA0(LiveMode.SCREEN_RECORD);
        iPerformanceManager.setIsAnchor(true);
        iPerformanceManager.ml0("create_live");
        if (iPerformanceManager.JI2()) {
            iPerformanceManager.Ox2();
        } else {
            iPerformanceManager.V42();
        }
        iPerformanceManager.Bl0();
        GameBroadcastFragment gameBroadcastFragment = new GameBroadcastFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJIIZI(bundle2, bundle, "extra");
        gameBroadcastFragment.setArguments(bundle2);
        gameBroadcastFragment.LLILZLL = interfaceC773130UUl;
        return gameBroadcastFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r71(long r17, com.bytedance.android.livesdkapi.depend.model.live.LiveMode r19) {
        /*
            r16 = this;
            X.11PQ<webcast.api.game.InGameRankSettingResponse$ResponseData> r0 = X.C0TFR.LIZ
            X.0Tiz r0 = X.EnumC754690Tj1.Companion
            r0.getClass()
            X.0Tj1 r0 = X.C754670Tiz.LIZ(r19)
            r7 = 0
            if (r0 == 0) goto L4a
            com.bytedance.android.livesdk.model.GameTag r2 = r0.getGameTag()
        L12:
            X.11PQ<webcast.api.game.InGameRankSettingResponse$ResponseData> r0 = X.C0TFR.LIZ
            java.lang.Object r1 = r0.LJLZ()
            webcast.api.game.InGameRankSettingResponse$ResponseData r1 = (webcast.api.game.InGameRankSettingResponse.ResponseData) r1
            r9 = r17
            if (r1 == 0) goto L79
            long r5 = r1.inGameRankSettingStatus
            r3 = 1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L79
            if (r2 == 0) goto La0
            java.util.List<webcast.api.game.AuthorizedGame> r0 = r1.authorizedGames
            java.util.Iterator r8 = r0.iterator()
        L2e:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r1 = r8.next()
            webcast.api.game.AuthorizedGame r1 = (webcast.api.game.AuthorizedGame) r1
            long r5 = r1.gameTagId
            java.lang.Long r0 = r2.id
            if (r0 == 0) goto L2e
            long r3 = r0.longValue()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L2e
            r7 = r1
            goto L2e
        L4a:
            r2 = r7
            goto L12
        L4c:
            if (r7 == 0) goto L79
            java.lang.String r0 = r7.inGameRank
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L79
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r0 = r7.gameName
            r1.append(r0)
            java.lang.String r0 = " · "
            r1.append(r0)
            java.lang.String r0 = r7.inGameRank
            r1.append(r0)
            java.lang.String r14 = r1.toString()
            java.lang.String r15 = r7.gameName
            long r11 = r7.gameTagId
            r13 = 1
            com.bytedance.android.livesdk.model.message.LiveGameIntroMessage r11 = X.C181500mr.LIZJ(r9, r11, r13, r14, r15)
            if (r11 != 0) goto L91
        L79:
            if (r2 == 0) goto La0
            boolean r0 = r2.isNonGameOrOtherGameItem()
            if (r0 != 0) goto La0
            java.lang.String r14 = r2.showName
            java.lang.Long r0 = r2.id
            if (r0 == 0) goto La1
            long r11 = r0.longValue()
        L8b:
            r13 = 0
            r15 = r14
            com.bytedance.android.livesdk.model.message.LiveGameIntroMessage r11 = X.C181500mr.LIZJ(r9, r11, r13, r14, r15)
        L91:
            if (r11 == 0) goto La0
            java.lang.Class<com.bytedance.android.live.publicscreen.api.IPublicScreenService> r0 = com.bytedance.android.live.publicscreen.api.IPublicScreenService.class
            X.006A r8 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.publicscreen.api.IPublicScreenService r8 = (com.bytedance.android.live.publicscreen.api.IPublicScreenService) r8
            r12 = 0
            r13 = 0
            r8.Jf0(r9, r11, r12, r13)
        La0:
            return
        La1:
            r11 = 0
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.game.GameService.r71(long, com.bytedance.android.livesdkapi.depend.model.live.LiveMode):void");
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final android.util.Pair<Integer, Integer> vy2(int i, int i2) {
        int iLJ = ((C0TDF.LJ() * i) / C0TDF.LJFF()) + i2;
        int i3 = ((i + 15) / 16) * 16;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finStreamW: ");
        sbLIZ.append(i3);
        sbLIZ.append(" finStreamH: ");
        sbLIZ.append(iLJ);
        sbLIZ.append(" screenRecordW: ");
        sbLIZ.append(i);
        sbLIZ.append(" screenRecordH: ");
        sbLIZ.append(i2);
        sbLIZ.append(" vw: ");
        sbLIZ.append(C0TDF.LJFF());
        sbLIZ.append(" vh: ");
        sbLIZ.append(C0TDF.LJ());
        sbLIZ.append(' ');
        C20441214yg.LIZIZ("dual_device_vertical_layout", C2188811AlT.LIZIZ(sbLIZ));
        return new android.util.Pair<>(Integer.valueOf(i3), Integer.valueOf(iLJ));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0IYo] */
    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final C468440IYo xb1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new AbstractC468490IYt<FeedItem>(C786410Ut5.Td(layoutInflater, R.layout.gda, viewGroup, false)) { // from class: X.0IYo
            @Override // X.AbstractC468490IYt
            public final void onViewDetachedFromWindow() {
                this.LL = false;
                IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                if (iGameService != null) {
                    iGameService.x2();
                }
            }

            @Override // X.AbstractC468490IYt
            public final void I5(int i, Object obj) {
                HandlerHook.viewPostDelay(this.itemView, new Runnable() { // from class: X.00xc
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("GameDrawerFeedCategoryViewHolder@10a.bind$1");
                        try {
                            IGameService iGameService = (IGameService) C1161920gLG.LIZJ(IGameService.class);
                            if (iGameService != null) {
                                iGameService.WI();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("GameDrawerFeedCategoryViewHolder@10a.bind$1");
                    }
                }, 50L);
            }
        };
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void DI1(FragmentManager fragmentManager, boolean z, Context context) {
        C20337914i1<Integer> c20337914i1;
        int i = 1;
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment()) {
            String str = GameDualDeviceDialogV3._pnsPageId;
            if (C0TDF.LJI()) {
                i = 7;
            }
            C498390Jgb.LIZ(i, fragmentManager, "live_take_prepare", z);
        } else {
            if (C0TDF.LJI()) {
                i = 4;
            }
            C743440TEg.LIZ(i, fragmentManager, "live_take_page", z);
        }
        if (z) {
            c20337914i1 = InterfaceC772390URp.c0;
        } else {
            c20337914i1 = InterfaceC772390URp.d0;
        }
        Object objLJJIIZ = C13LQ.LJJIIZ(c20337914i1.LIZIZ().intValue(), C0TDU.values());
        if (objLJJIIZ != null) {
            C0TDF.LIZIZ().onNext(objLJJIIZ);
        }
        C0TDF.LIZLLL().LIZLLL.onNext(Boolean.valueOf(z));
        if (context != null) {
            C0TDF.LJII(C14KS.LJI(context), C14KS.LJ(context));
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.context() != null) {
            C0TDF.LIZLLL().LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0101, X.0UWe] */
    @Override // X.C0IF4
    public final void LJIIIZ(Room room, DataChannel dataChannel, boolean z) {
        C0UWC c0uwc;
        C0IF4 c0if4;
        if (dataChannel != null && (c0if4 = (C0IF4) C2659011d.LIZ(dataChannel, InterfaceC465600INq.class)) != null) {
            c0if4.LJIIIZ(room, dataChannel, z);
        }
        if (!z) {
            if (dataChannel != null && (c0uwc = (C0UWC) C2659011d.LIZ(dataChannel, C0UWC.class)) != null) {
                c0uwc.onDestroy();
            }
            ?? r2 = new C0UWC() { // from class: X.0UWe
                public final C11NJ LL = new C11NJ();

                @Override // X.C0UWC
                public final void onDestroy() {
                    C20441214yg.LIZIZ("GameMomentTimeHelperComment", "onDestroy");
                    this.LL.LJ();
                }

                public final void LIZ(DataChannel dataChannel2) {
                    Room room2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onInit : ");
                    sbLIZ.append(dataChannel2);
                    C20441214yg.LIZIZ("GameMomentTimeHelperComment", C2188811AlT.LIZIZ(sbLIZ));
                    if (dataChannel2 != null && (room2 = (Room) dataChannel2.gg0(RoomChannel.class)) != null && room2.getStreamType() != LiveMode.VIDEO && room2.getStreamType() != LiveMode.LIVE_VOICE && LiveGameMomentAudienceEnabledSetting.INSTANCE.enableCommentGiftGuide()) {
                        this.LL.LIZ(C784440Upu.LIZ().LJ(C1114490f6l.class).LJJIL(new InterfaceC19483011Ki() { // from class: X.0UWf
                            @Override // X.InterfaceC19483011Ki
                            public final boolean test(Object obj) {
                                return ((C1114490f6l) obj).LIZIZ;
                            }
                        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS153S0200000_17(room2, this, 0)));
                    }
                }
            };
            if (dataChannel != null) {
                C2659011d.LIZIZ(dataChannel, C0UWC.class, r2, true);
            }
            r2.LIZ(dataChannel);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void cR0(Context context, String str, Map map) {
        Intent intent = new Intent(context, (Class<?>) GameLiveBottombarFlowActivity.class);
        intent.putExtra("params", new HashMap(map));
        intent.putExtra("enterFromMerge", str);
        intent.putExtra("enterMethod", "live_bottom_bar");
        if (context != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VHxysnisJKFbrXE+xIjgK9g=", null));
        }
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void yt1(final LifecycleOwner lifecycleOwner, final DataChannel dataChannel, final AwS591S0100000_12 awS591S0100000_12) {
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZJ(new C09JN() { // from class: X.0TEs
            @Override // X.C09JN
            public final void accept(Object obj) {
                DataChannel dataChannel2;
                C1C7U.LIZ("GameService@298.observeCastState$1");
                awS591S0100000_12.invoke(Boolean.valueOf(C0TDF.LJI()));
                if (LiveDualDeviceQRCodeCacheSetting.INSTANCE.isExperimentGroup() && obj == C0TCU.StateServerStart && (dataChannel2 = dataChannel) != null) {
                    C743550TEr.LIZ(null, null, lifecycleOwner, dataChannel2);
                }
                C1C7U.LIZIZ("GameService@298.observeCastState$1");
            }
        });
    }

    @Override // com.bytedance.android.livesdk.comp.api.game.service.IGameService
    public final void Ut(Context context, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, String str13, String str14, Map<String, String> map, C580610Mpv c580610Mpv) {
        C0UW7 c1811940xFg = this.LL;
        if (c1811940xFg == null) {
            c1811940xFg = new C1811940xFg();
        }
        this.LL = c1811940xFg;
        c1811940xFg.Ut(context, str, str2, str3, str4, i, str5, str6, str7, str8, str9, str10, str11, str12, num, str13, str14, map, c580610Mpv);
    }
}
