package com.bytedance.android.livesdk.game.broadcast.mirror;

import X.1JLP;
import X.1JLc;
import X.C098200Yq;
import X.C09JN;
import X.C0TFE;
import X.C0TH2;
import X.C0THC;
import X.C0THL;
import X.C1161920gLG;
import X.C11JF;
import X.C11LS;
import X.C1338270kvh;
import X.C189200o6;
import X.C1C7U;
import X.C1CC2;
import X.C20441214yg;
import X.C2104308Mf;
import X.C2188811AlT;
import X.C433901mT;
import X.C500260Jjc;
import X.C743540TEq;
import X.C744080TGs;
import X.C744140TGy;
import X.InterfaceC420801kM;
import X.InterfaceC500940Jki;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import androidx.fragment.app.Fragment;
import com.byted.cast.common.api.IBrowseListener;
import com.byted.cast.common.api.ILogger;
import com.byted.cast.common.api.ISurfaceListener;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.config.IInitListener;
import com.byted.cast.common.source.IMirrorListener;
import com.byted.cast.common.source.ServiceInfo;
import com.byted.cast.common.source.Statistics;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.game.broadcast.mirror.MirrorCastDevicesChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.MirrorCastInitChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.widget.GameCastWirelessWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.GameCastRefactorEnableSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS138S0201000_12;
import kotlin.jvm.internal.AwS31S0202000_12;
import kotlin.jvm.internal.AwS42S0102000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public final class GameCast {
    public static final GameCast LIZ = new GameCast();
    public static 1JLc LIZIZ;
    public static C0THL LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static ServiceInfo LJFF;
    public static boolean LJI;
    public static boolean LJII;
    public static final AtomicBoolean LJIIIIZZ;
    public static long LJIIIZ;
    public static C11LS LJIIJ;
    public static UUID LJIIJJI;
    public static long LJIIL;
    public static InterfaceC420801kM LJIILIIL;
    public static C11JF LJIILJJIL;
    public static final GameCast$mainHandler$1 LJIILL;

    public static void LIZLLL() {
        LJ = true;
        DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.BROWSING);
        LJIIJJI = UUID.randomUUID();
        GameCast$mainHandler$1 gameCast$mainHandler$1 = LJIILL;
        Message messageObtain = Message.obtain();
        messageObtain.what = 10087;
        messageObtain.obj = LJIIJJI;
        gameCast$mainHandler$1.sendMessageDelayed(messageObtain, 20000L);
        1JLc r0 = LIZIZ;
        if (r0 != null) {
            r0.LJIIJ();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C1CC2.LJIIIIZZ("ttlive_game_cast_start_browse", 1, jSONObject);
        LIZIZ("on begin device browsing..");
    }

    public static void LJI() {
        LJI = true;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        LJIIIZ = interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L;
        LJIIJ = (C11LS) UserService.getInstance().user().LJII().LJIIL(new C09JN() { // from class: X.0TGu
            @Override // X.C09JN
            public final void accept(Object obj) throws JSONException {
                long currentUserId;
                C1C7U.LIZ("GameCast@704e.markCastingStatus$1");
                C784060UpI c784060UpI = (C784060UpI) obj;
                long j = GameCast.LJIIIZ;
                GameCast gameCast = GameCast.LIZ;
                InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
                if (interfaceC500940JkiUser2 != null) {
                    currentUserId = interfaceC500940JkiUser2.getCurrentUserId();
                } else {
                    currentUserId = 0;
                }
                if (j != currentUserId || (c784060UpI != null && c784060UpI.LIZ == EnumC1098720ehK.Logout)) {
                    GameCast.LIZIZ("login out");
                    GameCast.LJIJ();
                }
                C1C7U.LIZIZ("GameCast@704e.markCastingStatus$1");
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.game.broadcast.mirror.GameCast$mainHandler$1] */
    static {
        Map<String, Object> map = C1338270kvh.LIZ;
        LJIIIIZZ = new AtomicBoolean(false);
        LJIIL = System.currentTimeMillis();
        final Looper mainLooper = Looper.getMainLooper();
        LJIILL = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.game.broadcast.mirror.GameCast$mainHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws JSONException {
                C1C7U.LIZ("GameCast@704e.mainHandler$1");
                if (message.what == 10087 && (HandlerHook.getMessageObj(message.obj) instanceof UUID) && Intrinsics.LJFF(HandlerHook.getMessageObj(message.obj), GameCast.LJIIJJI)) {
                    DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.ERROR);
                    GameCast gameCast = GameCast.LIZ;
                    GameCast.LJIILLIIL();
                    C743540TEq.LJJIIJ(true, 10088, 0, "");
                }
                C1C7U.LIZIZ("GameCast@704e.mainHandler$1");
            }
        };
    }

    public static void LJ() throws JSONException {
        if (LIZIZ != null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isCasting", LJI);
        jSONObject.put("isWireless", true);
        jSONObject.put("bindSdkSucceed", LJII);
        C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", -1, jSONObject);
        Context context = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context();
        if (C2104308Mf.LIZIZ(context)) {
            LIZIZ = new 1JLc();
            LJIIJJI();
            1JLc r2 = LIZIZ;
            if (r2 != null) {
                C0TFE.LIZ.getClass();
                r2.LJFF(context, C0TFE.LJ("ByteCast", false), new IInitListener() { // from class: X.0TGk
                    public final /* synthetic */ void onError(int i, String str) {
                        1JMs.LIZ(this, i, str);
                    }

                    public final void onSuccess() throws JSONException {
                        GameCast.LJII = true;
                        DataChannelGlobal.LLILZ.HQ2(MirrorCastInitChannel.class, Boolean.TRUE);
                        C743540TEq.LJJI(1, 0, "", "", GameCast.LJI, true);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isWireless", true);
                        C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", 1, jSONObject2);
                    }

                    public final void onFail(int i, String str, Exception exc) throws JSONException {
                        String string;
                        GameCast.LJII = false;
                        boolean z = GameCast.LJI;
                        if (exc != null) {
                            string = exc.toString();
                        } else {
                            string = null;
                        }
                        C743540TEq.LJJI(-1, i, str, string, z, true);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("isWireless", true);
                        jSONObject2.put("errCode", i);
                        jSONObject2.put("errMsg", str);
                        jSONObject2.put("e", exc);
                        C1CC2.LJIIIIZZ("ttlive_game_cast_init_sdk", 0, jSONObject2);
                    }
                });
            }
            1JLc r1 = LIZIZ;
            if (r1 != null) {
                C0TFE.LIZ.getClass();
                C0TFE.LJIIIIZZ(r1);
            }
            LJIIL();
            1JLc r22 = LIZIZ;
            if (r22 != null) {
                r22.LJIIIZ(10018, new Object[]{"ByteLink"});
            }
        }
        LJFF();
        LIZJ = new C0THL(context);
    }

    public static void LJFF() {
        1JLc r1 = LIZIZ;
        if (r1 != null) {
            r1.LJI(new IBrowseListener() { // from class: X.0TGt
                public final /* synthetic */ void onBrowseInvalidDevice(int i, List list) {
                    1JMA.LIZ(this, i, list);
                }

                public final /* synthetic */ void onError(int i, String str) {
                    1JMA.LIZIZ(this, i, str);
                }

                public final void onBrowse(int i, List<ServiceInfo> list) {
                    GameCast.LJIIJJI = null;
                    DataChannelGlobal.LLILZ.HQ2(MirrorCastDevicesChannel.class, new C744140TGy(list));
                    GameCast gameCast = GameCast.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on devices founded, list[");
                    sbLIZ.append(list);
                    sbLIZ.append(']');
                    GameCast.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCast init version: ------> ");
        1JLc r0 = LIZIZ;
        sbLIZ.append(r0 != null ? r0.LJ() : null);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIIIZ() {
        if (LJI || LIZIZ == null) {
            return;
        }
        if (GameCastRefactorEnableSetting.INSTANCE.enable()) {
            1JLc r1 = LIZIZ;
            if (r1 != null) {
                r1.LIZJ(LJFF);
            }
            LJII = false;
        }
        C0THL c0thl = LIZJ;
        if (c0thl != null) {
            c0thl.LIZIZ();
        }
        1JLc r0 = LIZIZ;
        if (r0 != null) {
            r0.LIZIZ();
        }
        LIZIZ = null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C1CC2.LJIIIIZZ("ttlive_game_cast_release_sdk", 1, jSONObject);
    }

    public static void LJIIJJI() {
        1JLP r1;
        1JLc r0 = LIZIZ;
        if (r0 == null || (r1 = r0.LIZLLL()) == null) {
            return;
        }
        r1.LJII(new IMirrorListener() { // from class: X.0TGo
            public final /* synthetic */ void onConnectFailed(ServiceInfo serviceInfo, int i, String str) {
                1JMD.LIZIZ(this, serviceInfo, i, str);
            }

            public final /* synthetic */ void onConnecting(ServiceInfo serviceInfo) {
                1JMD.LIZLLL(this, serviceInfo);
            }

            public final /* synthetic */ void onDisconnected(ServiceInfo serviceInfo, int i, String str) {
                1JMD.LJFF(this, serviceInfo, i, str);
            }

            public final /* synthetic */ void onDisconnecting(ServiceInfo serviceInfo) {
                1JMD.LJI(this, serviceInfo);
            }

            public final /* synthetic */ void onInfo(int i, int i2, int i3, String str) {
                1JFt.LIZJ(this, i, i2, i3, str);
            }

            public final /* synthetic */ void onInfo(ServiceInfo serviceInfo, int i, String str) {
                1JMD.LJIIIIZZ(this, serviceInfo, i, str);
            }

            public final boolean onInvite(String str, int i) {
                return false;
            }

            public final /* synthetic */ boolean onInvite(String str, int i, String str2) {
                return 1JFt.LJ(this, str, i, str2);
            }

            public final void onMirrorModeChange(int i) {
            }

            public final boolean onStartMirrorAuthorization() {
                return true;
            }

            public final void onStatistics(Statistics statistics) {
            }

            public final void onConnected(ServiceInfo serviceInfo) {
                1JMD.LIZJ(this, serviceInfo);
                C743540TEq.LJIJI(0, String.valueOf(serviceInfo), true);
            }

            public final void onStart(int i) throws JSONException {
                if (i != 3) {
                    return;
                }
                GameCast gameCast = GameCast.LIZ;
                GameCast.LJIIL = System.currentTimeMillis();
                C743540TEq.LJIJJ(true);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isWireless", true);
                jSONObject.put("serviceId", i);
                C1CC2.LJIIIIZZ("ttlive_game_cast_onStart", 1, jSONObject);
                C20441214yg.LJ("cast_wired", "onStar - less");
                if (GameCastRefactorEnableSetting.INSTANCE.enable()) {
                    GameCast.LJI();
                    DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.CASTING);
                }
                C0THC.LIZLLL(GameCastWirelessWidget.class, true);
            }

            public final void onStop(int i) throws JSONException {
                if (i != 3) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis() - GameCast.LJIIL;
                if (jCurrentTimeMillis > 0) {
                    C743540TEq.LJIJJLI(jCurrentTimeMillis, true);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isWireless", true);
                jSONObject.put("serviceId", i);
                C1CC2.LJIIIIZZ("ttlive_game_cast_onStop", 1, jSONObject);
                C20441214yg.LJ("cast_wired", "onStop wireless - m");
            }

            public final void onConnect(ServiceInfo serviceInfo, int i) {
                1JMD.LIZ(this, serviceInfo, i);
                C743540TEq.LJIJI(i, String.valueOf(serviceInfo), true);
            }

            public final void onDisconnect(ServiceInfo serviceInfo, int i, int i2) throws JSONException {
                Boolean boolValueOf;
                String str;
                if (serviceInfo != null && (str = serviceInfo.protocols) != null) {
                    boolValueOf = Boolean.valueOf(a0.LJJIIZI(str, "ByteLink", false));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    return;
                }
                GameCast gameCast = GameCast.LIZ;
                GameCast.LIZIZ("onDisconnect");
                GameCast.LIZJ(i, i2, "", false);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("extra", i2);
                jSONObject.put("serviceInfo", String.valueOf(serviceInfo));
                jSONObject.put("isWireless", true);
                jSONObject.put("what", i);
                C1CC2.LJIIIIZZ("ttlive_game_cast_disConnect", 0, jSONObject);
            }

            public final void onError(ServiceInfo serviceInfo, int i, String str) throws JSONException {
                Boolean boolValueOf;
                String str2;
                if (serviceInfo != null && (str2 = serviceInfo.protocols) != null) {
                    boolValueOf = Boolean.valueOf(a0.LJJIIZI(str2, "ByteLink", false));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                    return;
                }
                Exception exc = new Exception();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cast_Error, what=");
                sbLIZ.append(211005);
                sbLIZ.append(",extra=");
                sbLIZ.append(i);
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), exc);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mirror_play_error what=");
                sbLIZ2.append(211005);
                sbLIZ2.append(",extra=");
                sbLIZ2.append(i);
                C20441214yg.LJ("GameLive_ByteCast", C2188811AlT.LIZIZ(sbLIZ2));
                GameCast gameCast = GameCast.LIZ;
                GameCast.LIZJ(211005, i, str, true);
                if (i != 22008 && i != 30014) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("on casting error..");
                    sbLIZ3.append(211005);
                    sbLIZ3.append(" -> ");
                    sbLIZ3.append(i);
                    GameCast.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                } else {
                    GameCast.LJII = false;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isCasting", GameCast.LJI);
                jSONObject.put("isWireless", true);
                jSONObject.put("what", 211005);
                jSONObject.put("extra", i);
                C1CC2.LJIIIIZZ("ttlive_game_cast_onError", 1, jSONObject);
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onError(int r5, int r6, int r7, java.lang.String r8) throws org.json.JSONException {
                /*
                    r4 = this;
                    r0 = 3
                    if (r5 == r0) goto L4
                    return
                L4:
                    java.lang.Exception r3 = new java.lang.Exception
                    r3.<init>()
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "Cast_Error, what="
                    r1.append(r0)
                    r1.append(r6)
                    java.lang.String r2 = ",extra="
                    r1.append(r2)
                    r1.append(r7)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    X.C1CC2.LIZ(r0, r3)
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "mirror_play_error what="
                    r1.append(r0)
                    r1.append(r6)
                    r1.append(r2)
                    r1.append(r7)
                    java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
                    java.lang.String r0 = "GameLive_ByteCast"
                    X.C20441214yg.LJ(r0, r1)
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast r0 = com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LIZ
                    r2 = 1
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LIZJ(r6, r7, r8, r2)
                    r0 = 210010(0x3345a, float:2.94287E-40)
                    if (r6 != r0) goto L75
                    java.lang.String r0 = "on casting devices no response...."
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LIZIZ(r0)
                L4f:
                    org.json.JSONObject r3 = new org.json.JSONObject
                    r3.<init>()
                    java.lang.String r1 = "isCasting"
                    boolean r0 = com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LJI
                    r3.put(r1, r0)
                    java.lang.String r0 = "isWireless"
                    r3.put(r0, r2)
                    java.lang.String r0 = "id"
                    r3.put(r0, r5)
                    java.lang.String r0 = "what"
                    r3.put(r0, r6)
                    java.lang.String r0 = "extra"
                    r3.put(r0, r7)
                    java.lang.String r0 = "ttlive_game_cast_onError"
                    X.C1CC2.LJIIIIZZ(r0, r2, r3)
                    return
                L75:
                    r1 = 0
                    r0 = 211005(0x3383d, float:2.95681E-40)
                    if (r6 != r0) goto L82
                    r0 = 22008(0x55f8, float:3.084E-41)
                    if (r7 != r0) goto L90
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LJII = r1
                    goto L4f
                L82:
                    if (r6 == r0) goto L90
                    r0 = 212001(0x33c21, float:2.97077E-40)
                    if (r6 != r0) goto L97
                    r0 = 2131841843(0x7f115333, float:1.9317005E38)
                    X.C766270U4b.LIZLLL(r0)
                    goto L4f
                L90:
                    r0 = 30014(0x753e, float:4.2059E-41)
                    if (r7 != r0) goto L97
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LJII = r1
                    goto L4f
                L97:
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = "on casting error.."
                    r1.append(r0)
                    r1.append(r6)
                    java.lang.String r0 = " -> "
                    r1.append(r0)
                    r1.append(r7)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                    com.bytedance.android.livesdk.game.broadcast.mirror.GameCast.LIZIZ(r0)
                    goto L4f
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C744040TGo.onError(int, int, int, java.lang.String):void");
            }
        });
    }

    public static void LJIIL() {
        1JLc r2 = LIZIZ;
        if (r2 != null) {
            r2.LJIIIZ(100042, new Object[]{new ILogger() { // from class: X.0TFP
                public final void onDebug(String str, String str2) {
                    C20441214yg.LIZIZ(str, str2);
                }

                public final void onError(String str, String str2) {
                    C20441214yg.LJ(str, str2);
                }

                public final void onInfo(String str, String str2) {
                    C20441214yg.LJIIIZ(str, str2);
                }

                public final void onVerbose(String str, String str2) {
                    C20441214yg.LJIIJJI(str, str2);
                }

                public final void onWarn(String str, String str2) {
                    C20441214yg.LJIIL(str, str2);
                }

                public final void onError(String str, String str2, Throwable th) {
                    C20441214yg.LJFF(str, str2, th);
                }
            }});
        }
        LIZIZ.LJIIIZ(10022, new Object[]{Boolean.TRUE});
    }

    public static void LJIILLIIL() throws JSONException {
        if (LJ) {
            LJ = false;
            1JLc r0 = LIZIZ;
            if (r0 != null) {
                r0.LJIIJJI();
            }
            LIZIZ("on device browsing stopped...");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isWireless", true);
            C1CC2.LJIIIIZZ("ttlive_game_cast_stop_browse", 1, jSONObject);
        }
    }

    public final void LIZ() throws JSONException {
        if (!LJII) {
            LJ();
        }
        if (LJ) {
            return;
        }
        if (LJII) {
            LIZLLL();
        } else {
            DataChannelGlobal.LLILZ.DQ2(MirrorCastInitChannel.class, this, AFwS245S0000000_12.get$arr$(53));
        }
    }

    public static void LJIJ() throws JSONException {
        C11LS c11ls;
        LJIILLIIL();
        LJIJI(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), false);
        try {
            C11LS c11ls2 = LJIIJ;
            if ((c11ls2 == null || !c11ls2.isDisposed()) && (c11ls = LJIIJ) != null) {
                c11ls.dispose();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZIZ(String str) {
        C20441214yg.LIZIZ("GameLive_ByteCast", str);
    }

    public static void LJIIJ(Fragment fragment) {
        Object c098200Yq;
        if (fragment == null) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = LJIIIIZZ;
            if (!atomicBoolean.get()) {
                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(fragment, 271));
                atomicBoolean.set(true);
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LJIIIIZZ.set(false);
            C20441214yg.LJI("GameLive_ByteCast", thM5exceptionOrNullimpl);
            C743540TEq.LJJIIJ(true, 10091, 0, "");
        }
        LIZIZ("try request for mirror display permission....");
    }

    public static void LJIILJJIL(ServiceInfo serviceInfo) {
        int i;
        int i2;
        int i3;
        1JLP r1;
        1JLP r0;
        1JLP r12;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before  start mirror to ");
        sbLIZ.append(serviceInfo);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIILLIIL();
        LJFF = serviceInfo;
        C0THL c0thl = LIZJ;
        if (c0thl != null) {
            c0thl.LIZLLL(serviceInfo.width, serviceInfo.height);
        }
        C743540TEq.LJJ(true);
        final C744080TGs c744080TGs = new ISurfaceListener() { // from class: X.0TGs
            public final void surfaceAvailable(Surface surface, int i4, int i5) {
                boolean z;
                MediaProjection mediaProjection;
                1JLc r2;
                GameCast gameCast = GameCast.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("try request : surface = ");
                sbLIZ2.append(surface);
                GameCast.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (surface == null) {
                    DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.ERROR);
                    C743540TEq.LJJIIJ(true, 10089, 0, "");
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("setOption with MediaProjection, is null = ");
                C0THL c0thl2 = GameCast.LIZJ;
                if (c0thl2 != null && c0thl2.LIZLLL != null) {
                    z = false;
                } else {
                    z = true;
                }
                sbLIZ3.append(z);
                GameCast.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                C0THL c0thl3 = GameCast.LIZJ;
                if (c0thl3 != null && (mediaProjection = c0thl3.LIZLLL) != null && (r2 = GameCast.LIZIZ) != null) {
                    r2.LJIIIZ(10015, new Object[]{mediaProjection});
                }
                C0THL c0thl4 = GameCast.LIZJ;
                if (c0thl4 != null) {
                    c0thl4.LJ(surface);
                }
                C0THL c0thl5 = GameCast.LIZJ;
                if (c0thl5 != null) {
                    c0thl5.LIZ();
                }
                C743540TEq.LJIL(true);
                C743540TEq.LJJIFFI(true);
            }
        };
        1JLc r02 = LIZIZ;
        if (r02 != null && (r12 = r02.LIZLLL()) != null) {
            r12.LJ(new ISurfaceListener() { // from class: X.0TGw
                public final void surfaceAvailable(Surface surface, int i4, int i5) {
                    C500260Jjc.LJJLIIIJJIZ(new AwS31S0202000_12(c744080TGs, surface, i4, i5, 0));
                }
            });
        }
        1JLc r2 = LIZIZ;
        if (r2 != null) {
            r2.LJIIIZ(10012, new Object[]{2});
        }
        1JLc r3 = LIZIZ;
        if (r3 != null) {
            r3.LJIIIZ(10013, new Object[]{"xxx-v-display"});
        }
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setVirtualDisplayFlag(2);
        mirrorInfo.setVirtualDisplayName("xxx-v-display");
        ServiceInfo serviceInfo2 = LJFF;
        if (serviceInfo2 != null) {
            i = serviceInfo2.fps;
        } else {
            i = 30;
        }
        mirrorInfo.setFps(i);
        mirrorInfo.setServiceInfo(LJFF);
        C0THL c0thl2 = LIZJ;
        int i4 = 1920;
        if (c0thl2 != null) {
            i2 = c0thl2.LIZIZ;
        } else {
            i2 = 1920;
        }
        mirrorInfo.setEncodeWidth(i2);
        C0THL c0thl3 = LIZJ;
        int i5 = 1080;
        if (c0thl3 != null) {
            i3 = c0thl3.LIZJ;
        } else {
            i3 = 1080;
        }
        mirrorInfo.setEncodeHeight(i3);
        C0THL c0thl4 = LIZJ;
        if (c0thl4 != null) {
            i4 = c0thl4.LIZIZ;
        }
        mirrorInfo.setVirtualDisplayWidth(i4);
        C0THL c0thl5 = LIZJ;
        if (c0thl5 != null) {
            i5 = c0thl5.LIZJ;
        }
        mirrorInfo.setVirtualDisplayHeight(i5);
        if (Build.VERSION.SDK_INT >= 29) {
            mirrorInfo.setAudioEnable(true);
            mirrorInfo.setAudioSource(3);
        } else {
            mirrorInfo.setAudioEnable(false);
            1JLc r22 = LIZIZ;
            if (r22 != null) {
                r22.LJIIIZ(10017, new Object[]{Boolean.FALSE});
            }
        }
        mirrorInfo.enableAudioMix(true);
        mirrorInfo.setAutoBitrate(false);
        mirrorInfo.setBitRateLevel(4);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setResolutionLevel(3);
        1JLc r03 = LIZIZ;
        if (r03 != null && (r0 = r03.LIZLLL()) != null) {
            r0.LJI(mirrorInfo);
        }
        1JLc r04 = LIZIZ;
        if (r04 != null && (r1 = r04.LIZLLL()) != null) {
            r1.LJIIIIZZ("ByteLink");
        }
    }

    public static void LJIILL(Context context) {
        C20441214yg.LIZIZ("GameLive_ByteCast", "startService");
        C0TFE.LIZ.getClass();
        C0TFE.LJIILIIL(context);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C1CC2.LJIIIIZZ("ttlive_game_cast_start_service", 1, jSONObject);
        LIZLLL = true;
    }

    public static void LJIIZILJ(Context context) {
        if (LJI && LJFF != null) {
            LJIJI(context, false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ensure current status is casting.. [isCasting = ");
        sbLIZ.append(LJI);
        sbLIZ.append(", device=");
        sbLIZ.append(LJFF);
        sbLIZ.append(']');
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LJIILIIL(ServiceInfo serviceInfo, final Fragment fragment) throws JSONException {
        int i;
        int i2;
        int i3;
        1JLP r1;
        1JLP r0;
        1JLP r12;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("before  start mirror to ");
        sbLIZ.append(serviceInfo);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isWireless", true);
        C1CC2.LJIIIIZZ("ttlive_game_cast_start_mirror", 1, jSONObject);
        LJIILLIIL();
        LJFF = serviceInfo;
        C0THL c0thl = LIZJ;
        if (c0thl != null) {
            c0thl.LIZLLL(serviceInfo.width, serviceInfo.height);
        }
        C743540TEq.LJJ(true);
        1JLc r02 = LIZIZ;
        if (r02 != null && (r12 = r02.LIZLLL()) != null) {
            r12.LJ(new ISurfaceListener() { // from class: X.0TGp
                public final void surfaceAvailable(Surface surface, int i4, int i5) throws JSONException {
                    Object c098200Yq;
                    GameCast gameCast = GameCast.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("try request : surface = ");
                    sbLIZ2.append(surface);
                    GameCast.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (surface == null) {
                        DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.ERROR);
                        C743540TEq.LJJIIJ(true, 10089, 0, "");
                        return;
                    }
                    C743540TEq.LJIL(true);
                    C0THL c0thl2 = GameCast.LIZJ;
                    if (c0thl2 != null) {
                        c0thl2.LJ(surface);
                    }
                    Fragment fragment2 = fragment;
                    if (fragment2 != null) {
                        try {
                            AtomicBoolean atomicBoolean = GameCast.LJIIIIZZ;
                            if (!atomicBoolean.get()) {
                                C500260Jjc.LJJLIIIJJIZ(new AwS556S0100000_12(fragment2, 272));
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("isWireless", true);
                                C1CC2.LJIIIIZZ("ttlive_game_cast_start_request", 1, jSONObject2);
                                atomicBoolean.set(true);
                            }
                            c098200Yq = Unit.LIZ;
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        if (thM5exceptionOrNullimpl != null) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("isWireless", true);
                            C1CC2.LJIIIIZZ("ttlive_game_cast_start_service", 0, jSONObject3);
                            GameCast.LJIIIIZZ.set(false);
                            C20441214yg.LJI("GameLive_ByteCast", thM5exceptionOrNullimpl);
                            C743540TEq.LJJIIJ(true, 10091, 0, "");
                        }
                        GameCast gameCast2 = GameCast.LIZ;
                        GameCast.LIZIZ("try request for mirror display permission....");
                    }
                }
            });
        }
        1JLc r2 = LIZIZ;
        if (r2 != null) {
            r2.LJIIIZ(10012, new Object[]{2});
        }
        1JLc r3 = LIZIZ;
        if (r3 != null) {
            r3.LJIIIZ(10013, new Object[]{"xxx-v-display"});
        }
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setVirtualDisplayFlag(2);
        mirrorInfo.setVirtualDisplayName("xxx-v-display");
        ServiceInfo serviceInfo2 = LJFF;
        if (serviceInfo2 != null) {
            i = serviceInfo2.fps;
        } else {
            i = 30;
        }
        mirrorInfo.setFps(i);
        mirrorInfo.setServiceInfo(LJFF);
        if (Build.VERSION.SDK_INT >= 29) {
            mirrorInfo.setAudioEnable(true);
            mirrorInfo.setAudioSource(3);
        } else {
            mirrorInfo.setAudioEnable(false);
            1JLc r22 = LIZIZ;
            if (r22 != null) {
                r22.LJIIIZ(10017, new Object[]{Boolean.FALSE});
            }
        }
        mirrorInfo.enableAudioMix(true);
        C0THL c0thl2 = LIZJ;
        int i4 = 1920;
        if (c0thl2 != null) {
            i2 = c0thl2.LIZIZ;
        } else {
            i2 = 1920;
        }
        mirrorInfo.setEncodeWidth(i2);
        C0THL c0thl3 = LIZJ;
        int i5 = 1080;
        if (c0thl3 != null) {
            i3 = c0thl3.LIZJ;
        } else {
            i3 = 1080;
        }
        mirrorInfo.setEncodeHeight(i3);
        C0THL c0thl4 = LIZJ;
        if (c0thl4 != null) {
            i4 = c0thl4.LIZIZ;
        }
        mirrorInfo.setVirtualDisplayWidth(i4);
        C0THL c0thl5 = LIZJ;
        if (c0thl5 != null) {
            i5 = c0thl5.LIZJ;
        }
        mirrorInfo.setVirtualDisplayHeight(i5);
        mirrorInfo.setAutoBitrate(false);
        mirrorInfo.setBitRateLevel(4);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setResolutionLevel(3);
        1JLc r03 = LIZIZ;
        if (r03 != null && (r0 = r03.LIZLLL()) != null) {
            r0.LJI(mirrorInfo);
        }
        1JLc r04 = LIZIZ;
        if (r04 != null && (r1 = r04.LIZLLL()) != null) {
            r1.LJIIIIZZ("ByteLink");
        }
    }

    public static void LJIJI(Context context, boolean z) {
        1JLP r1;
        LIZIZ("on mirror stopped..");
        LJI = false;
        LJIIIZ = 0L;
        C20441214yg.LIZIZ("GameLive_ByteCast", "stopService");
        try {
            if (LIZLLL) {
                C0TFE.LIZ.getClass();
                C0TFE.LJIILJJIL(context);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isWireless", true);
                C1CC2.LJIIIIZZ("ttlive_game_cast_stop_service", 1, jSONObject);
                LIZLLL = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LIZLLL(th.getMessage());
        }
        1JLc r0 = LIZIZ;
        if (r0 != null && (r1 = r0.LIZLLL()) != null) {
            r1.LJIIJ("ByteLink");
        }
        C0THL c0thl = LIZJ;
        if (c0thl != null) {
            c0thl.LIZIZ();
        }
        if (!z) {
            DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.STOPPED);
        }
        C0THC.LIZLLL(GameCastWirelessWidget.class, false);
        C20441214yg.LJ("cast_wired", "stopMirror - less");
        LIZIZ("on mirror stopped..");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("isWireless", true);
        C1CC2.LJIIIIZZ("ttlive_game_cast_stop_mirror", 1, jSONObject2);
    }

    public static void LIZJ(int i, int i2, String str, boolean z) {
        String str2;
        C0TH2 c0th2;
        if (LJI || z) {
            C743540TEq.LJJIIJ(true, Integer.valueOf(i), Integer.valueOf(i2), str);
        }
        LJIJI(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), z);
        C0TFE.LIZ.getClass();
        if (i == 211032) {
            str2 = "LS_disconnect";
        } else {
            str2 = "error";
        }
        C743540TEq.LJJII(str2, true);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        if (z) {
            c0th2 = C0TH2.ERROR;
        } else {
            c0th2 = C0TH2.STOPPED;
        }
        dataChannelGlobal.HQ2(LiveCastChannel.class, c0th2);
    }

    public final boolean LJII(int i, int i2, Intent intent, Fragment fragment) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCaptureActivityResult requestCode =");
        sbLIZ.append(i);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ.set(false);
        if (i == 20086) {
            if (i2 == -1 && intent != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("on permission granted ... ");
                sbLIZ2.append(intent);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C11JF c11jf = LJIILJJIL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                LJIILJJIL = C433901mT.LIZ(fragment, new AwS556S0100000_12(fragment, 269));
                LJI();
                DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.CASTING);
                InterfaceC420801kM interfaceC420801kM = LJIILIIL;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
                LJIILIIL = C433901mT.LIZIZ(fragment, new AwS42S0102000_12(i2, i, intent, 0));
                return true;
            }
        } else {
            if (i == 20086) {
            }
            return false;
        }
        1JLc r0 = LIZIZ;
        if (r0 != null) {
            r0.LJII();
        }
        LJIJI(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).context(), true);
        DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.ERROR);
        C743540TEq.LJJIIJ(true, 10090, 0, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bindSdkSuccess", LJII);
        jSONObject.put("isCasting", LJI);
        jSONObject.put("isWireless", true);
        jSONObject.put("requestCode", i);
        jSONObject.put("resultCode", i2);
        jSONObject.put("data", String.valueOf(intent));
        C1CC2.LJIIIIZZ("ttlive_game_cast_result", 0, jSONObject);
        C743540TEq.LJJIIZI(i2, -1, i, String.valueOf(intent), true);
        return false;
    }

    public final boolean LJIIIIZZ(int i, int i2, Intent intent, Fragment fragment) {
        List<ServiceInfo> list;
        ServiceInfo next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCaptureActivityResult requestCode =");
        sbLIZ.append(i);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        LJIIIIZZ.set(false);
        if (i == 20086) {
            if (i2 == -1 && intent != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("on permission granted ... ");
                sbLIZ2.append(intent);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                C744140TGy c744140TGy = (C744140TGy) DataChannelGlobal.LLILZ.gg0(MirrorCastDevicesChannel.class);
                if (c744140TGy != null && (list = c744140TGy.LIZ) != null) {
                    Iterator<ServiceInfo> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (a0.LJJIIZI(next.name, "TTLiveStudioAndroid", false)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    ServiceInfo serviceInfo = next;
                    if (serviceInfo != null) {
                        try {
                            C11JF c11jf = LJIILJJIL;
                            if (c11jf != null) {
                                c11jf.dispose();
                            }
                            LJIILJJIL = C433901mT.LIZ(fragment, new AwS556S0100000_12(fragment, 270));
                            AwS138S0201000_12 awS138S0201000_12 = new AwS138S0201000_12(i2, intent, serviceInfo, 2);
                            InterfaceC420801kM interfaceC420801kM = LJIILIIL;
                            if (interfaceC420801kM != null) {
                                interfaceC420801kM.dispose();
                            }
                            LJIILIIL = C433901mT.LIZIZ(fragment, awS138S0201000_12);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C743540TEq.LJJIIJ(true, 10092, 0, e.toString());
                        }
                    }
                }
                C743540TEq.LJJIIZI(i2, 1, i, intent.toString(), true);
                return true;
            }
        } else {
            if (i == 20086) {
            }
            return false;
        }
        DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.MEDIA_PROJECTION_PERMISSION_REJECT);
        C743540TEq.LJJIIJ(true, 10090, 0, "");
        C743540TEq.LJJIIZI(i2, -1, i, String.valueOf(intent), true);
        return false;
    }
}
