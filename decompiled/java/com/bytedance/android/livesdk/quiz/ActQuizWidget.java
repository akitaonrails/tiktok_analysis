package com.bytedance.android.livesdk.quiz;

import X.AnonymousClass0207;
import X.C001A;
import X.C09JN;
import X.C0IEB;
import X.C0IJT;
import X.C0IL2;
import X.C0J1N;
import X.C1087250eOp;
import X.C1161920gLG;
import X.C11RD;
import X.C11S5;
import X.C13LP;
import X.C1548820qPI;
import X.C1701940uOG;
import X.C1871910yoP;
import X.C19719612Di;
import X.C19748512Ol;
import X.C1CC2;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C262100zr;
import X.C389001fE;
import X.C464800IKo;
import X.C474500IjA;
import X.C480460Ism;
import X.C516201zk;
import X.C776250Uch;
import X.C963140bAe;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.browser.IHybridPerformanceService;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.activity.quiz.model.QuizUserIdentityInfo;
import com.bytedance.android.livesdk.dataChannel.MultiWindowModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizCardValidateSetting;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper;
import com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ActQuizWidget extends LiveWidget implements OnMessageListener, InterfaceC1141530foN {
    public Room LL;
    public ActivityQuizUserIdentityMessage LLILZIL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public final List<String> LLILLJJLI = new ArrayList();
    public final List<String> LLILLL = new ArrayList();
    public final List<String> LLILZ = new ArrayList();
    public final BPEAHandler LLILZLL = new BPEAHandler(Looper.getMainLooper());
    public boolean LLJ = true;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        C20441214yg.LJIIIZ("EOYQuiz", "quiz widget onDestroy isSuppressed=false");
        C464800IKo.LIZ.LJIJ(false);
        this.LLILZLL.removeCallbacksAndMessages(null);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        x1();
        ((IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class)).Ha2();
        C1548820qPI.LJIIIIZZ("quiz_identity_status_change", this);
        C1548820qPI.LJIIIIZZ("quiz_page_status_open", this);
        C1548820qPI.LJIIIIZZ("quiz_page_status_close", this);
        this.LLJ = false;
        if (!Intrinsics.LJFF(this.LLJIJIL, this.LLJI)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = this.LLJIJIL;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("primary_id", str);
            linkedHashMap.put("reason", "leave_room");
            String str2 = this.LLJILJIL;
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("card_from", str2);
            C1CC2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_eoy_quiz_discard_card_monitor");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            String str3 = this.LLJIJIL;
            if (str3 == null) {
                str3 = "";
            }
            c474500IjALIZ.LJJII(str3, "primary_id");
            c474500IjALIZ.LJJII("leave_room", "reason");
            String str4 = this.LLJILJIL;
            c474500IjALIZ.LJJII(str4 != null ? str4 : "", "card_from");
            c474500IjALIZ.LIZ();
        }
        super.onDestroy();
    }

    public final void x1() {
        Context context = this.context;
        if (context != null) {
            ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).HW1(context, z1("EOYQuizCard"), null);
            ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).HW1(context, z1("EOYQuizIdentity"), null);
            ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).HW1(context, z1("EOYQuizResult"), null);
            C20441214yg.LJIIIZ("EOYQuiz", "clear storages");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLJ = true;
        this.LL = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.dataChannel.gg0(RoomUserChannel.class);
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.gg0(C776250Uch.class);
        this.dataChannel.BQ2(this, MultiWindowModeChannel.class, AnonymousClass0207.get$arr$(26));
        x1();
        IHybridPerformanceService iHybridPerformanceService = (IHybridPerformanceService) C1161920gLG.LIZJ(IHybridPerformanceService.class);
        if (iHybridPerformanceService != null) {
            iHybridPerformanceService.TP2();
            iHybridPerformanceService.Tp0(new AwS596S0100000_17(this, 229));
        }
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.ACTIVITY_QUIZ_CARD_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(C001A.ACTIVITY_QUIZ_USER_IDENTITY_MESSAGE.getIntType(), this);
        }
        C1548820qPI.LIZLLL("quiz_identity_status_change", this);
        C1548820qPI.LIZLLL("quiz_page_status_open", this);
        C1548820qPI.LIZLLL("quiz_page_status_close", this);
        C480460Ism.LIZ().getClass();
        ActQuizApi actQuizApi = (ActQuizApi) C480460Ism.LIZLLL(ActQuizApi.class);
        Room room = this.LL;
        ((C0J1N) actQuizApi.queryUserIdentity(String.valueOf(room != null ? Long.valueOf(room.getId()) : null)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZ(new C516201zk(this, 86), new C09JN() { // from class: X.00n8
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("ActQuizWidget@94df.onCreate$4");
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("identity request fail: ");
                sbLIZ.append(th);
                C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("event_id", "get_identity_fail");
                linkedHashMap.put("msg", th.toString());
                C1CC2.LJII(1, "ttlive_eoy_quiz_exp_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
                C1C7U.LIZIZ("ActQuizWidget@94df.onCreate$4");
            }
        });
    }

    public static String y1(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            String str2 = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL(str, new String[]{"-"}, 0, 6));
            if (str2 == null) {
                return "";
            }
            return str2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public final void B1(ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage) {
        int i;
        Long lValueOf;
        int i2;
        ActivityQuizUserIdentityMessage activityQuizUserIdentityMessage2 = this.LLILZIL;
        if (activityQuizUserIdentityMessage2 != null && Intrinsics.LJFF(activityQuizUserIdentityMessage2.primaryId, activityQuizUserIdentityMessage.primaryId) && activityQuizUserIdentityMessage.version <= activityQuizUserIdentityMessage2.version) {
            return;
        }
        this.LLILZIL = activityQuizUserIdentityMessage;
        if (Intrinsics.LJFF(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId(), activityQuizUserIdentityMessage.retainDeviceId)) {
            i = 1;
        } else {
            i = 2;
        }
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus();
        Room room = this.LL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        C1087250eOp.LJFF(i, lValueOf);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set user status by identity status=");
        sbLIZ.append(i);
        C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
        ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(this.context, GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, activityQuizUserIdentityMessage), z1("EOYQuizIdentity"), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("storage identity msg pk:");
        sbLIZ2.append(activityQuizUserIdentityMessage.primaryId);
        C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ2));
        JSONObject jSONObject = new JSONObject();
        QuizUserIdentityInfo quizUserIdentityInfo = activityQuizUserIdentityMessage.body;
        if (quizUserIdentityInfo != null) {
            i2 = quizUserIdentityInfo.userStatus;
        } else {
            i2 = 0;
        }
        jSONObject.put("user_status", i2);
        jSONObject.put("sender", "client");
        C389001fE.LIZ("quiz_identity_status_change", jSONObject, System.currentTimeMillis(), false);
    }

    public final boolean D1(String str) {
        JSONArray jSONArrayOptJSONArray;
        String str2;
        String str3;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("trivia") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("trivia")) != null && jSONArrayOptJSONArray.length() > 0) {
                ActivityQuizCardMessageSEIWrapper activityQuizCardMessageSEIWrapper = (ActivityQuizCardMessageSEIWrapper) C19748512Ol.LIZIZ.LJII(jSONArrayOptJSONArray.get(0).toString(), ActivityQuizCardMessageSEIWrapper.class);
                List<String> list = this.LLILLJJLI;
                ActivityQuizCardMessage activityQuizCardMessage = activityQuizCardMessageSEIWrapper.quizCardMessage;
                String str4 = null;
                if (activityQuizCardMessage != null) {
                    str2 = activityQuizCardMessage.primaryId;
                } else {
                    str2 = null;
                }
                if (C13LP.LJJJJ(str2, list)) {
                    return true;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive sei pk is: ");
                ActivityQuizCardMessage activityQuizCardMessage2 = activityQuizCardMessageSEIWrapper.quizCardMessage;
                if (activityQuizCardMessage2 != null) {
                    str4 = activityQuizCardMessage2.primaryId;
                }
                sbLIZ.append(str4);
                C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
                ActivityQuizCardMessage activityQuizCardMessage3 = activityQuizCardMessageSEIWrapper.quizCardMessage;
                if (activityQuizCardMessage3 == null || (str3 = activityQuizCardMessage3.primaryId) == null) {
                    str3 = "";
                }
                E1("card", str3, "sei");
                if (!C1(activityQuizCardMessageSEIWrapper.quizCardMessage, "sei")) {
                    A1(activityQuizCardMessageSEIWrapper, "sei");
                }
                return true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receive sei parse error: ");
            sbLIZ2.append(e);
            C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ2));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_id", "parse_sei_exception");
            linkedHashMap.put("msg", e.toString());
            C1CC2.LJII(1, "ttlive_eoy_quiz_exp_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
        }
        return false;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String strLJFF;
        InterfaceC1107590evd interfaceC1107590evd;
        String str = c262100zr.LIZ;
        int iHashCode = str.hashCode();
        Long lValueOf = null;
        if (iHashCode != -1080414863) {
            if (iHashCode != -73738234) {
                if (iHashCode == 855686065 && str.equals("quiz_page_status_close")) {
                    C20441214yg.LJIIIZ("EOYQuiz", "receive js event quiz_page_status_close isSuppressed=false");
                    C464800IKo.LIZ.LJIJ(false);
                    return;
                }
                return;
            }
            if (!str.equals("quiz_identity_status_change")) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                strLJFF = C1871910yoP.LJFF(interfaceC1107590evd2, "sender", "");
            } else {
                strLJFF = null;
            }
            if (Intrinsics.LJFF("client", strLJFF) || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
                return;
            }
            int i = interfaceC1107590evd.getInt("user_status");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("set user status by event status=");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
            ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus();
            Room room = this.LL;
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            }
            C1087250eOp.LJFF(i, lValueOf);
            return;
        }
        if (!str.equals("quiz_page_status_open") || ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).Pp2(this.context, z1("EOYQuizCard"), null) == null) {
            return;
        }
        C20441214yg.LJIIIZ("EOYQuiz", "receive js event quiz_page_status_open isSuppressed=true");
        C464800IKo.LIZ.LJIJ(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage
            java.lang.String r8 = "message"
            if (r0 == 0) goto L24
            java.util.List<java.lang.String> r1 = r11.LLILLJJLI
            r7 = r12
            com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage r7 = (com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage) r7
            java.lang.String r0 = r7.primaryId
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L16
            return
        L16:
            java.lang.String r1 = "card"
            java.lang.String r0 = r7.primaryId
            r11.E1(r1, r0, r8)
            boolean r0 = r11.C1(r7, r8)
            if (r0 == 0) goto L35
            return
        L24:
            boolean r0 = r12 instanceof com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage
            if (r0 == 0) goto La3
            com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage r12 = (com.bytedance.android.livesdk.model.message.ActivityQuizUserIdentityMessage) r12
            java.lang.String r1 = r12.primaryId
            java.lang.String r0 = "identity"
            r11.E1(r0, r1, r8)
            r11.B1(r12)
            return
        L35:
            java.lang.Class<com.bytedance.android.live.livepullstream.api.IPullStreamService> r0 = com.bytedance.android.live.livepullstream.api.IPullStreamService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.livepullstream.api.IPullStreamService r0 = (com.bytedance.android.live.livepullstream.api.IPullStreamService) r0
            X.0It8 r0 = r0.YY()
            X.0Isr r0 = r0.LIZIZ
            r9 = 0
            if (r0 == 0) goto La4
            long r3 = r0.LJJIIJ()
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 <= 0) goto La4
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting r5 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelayMaxTimeSetting.INSTANCE
            long r1 = r5.getValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L65
            long r1 = r5.getValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L65
            long r3 = r5.getValue()
        L65:
            float r1 = (float) r3
            float r0 = r7.seiDelayMultiple
            float r1 = r1 * r0
            long r5 = (long) r1
            long r0 = r7.seiDelayBias
            long r5 = r5 + r0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "receive card msg pk is: "
            r1.append(r0)
            java.lang.String r0 = r7.primaryId
            r1.append(r0)
            java.lang.String r0 = " seiDelay: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "delayTimeMs: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "EOYQuiz"
            X.C20441214yg.LJIIIZ(r0, r1)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto Lab
            com.bytedance.bpea.transmit.delegate.BPEAHandler r2 = r11.LLILZLL
            X.01zT r1 = new X.01zT
            r0 = 5
            r1.<init>(r11, r12, r0)
            X.C786410Ut5.LJLIIL(r5, r2, r1)
        La3:
            return
        La4:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveQuizSEIDelaySetting.INSTANCE
            long r3 = r0.getValue()
            goto L65
        Lab:
            com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper r0 = new com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper
            r0.<init>()
            r0.quizCardMessage = r7
            r11.A1(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.quiz.ActQuizWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final String z1(String str) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        Room room = this.LL;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(UserService.getInstance().user().getCurrentUserId());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [T, X.0IEB] */
    public final void A1(ActivityQuizCardMessageSEIWrapper activityQuizCardMessageSEIWrapper, String str) {
        try {
            ActivityQuizCardMessage activityQuizCardMessage = activityQuizCardMessageSEIWrapper.quizCardMessage;
            if (activityQuizCardMessage != null) {
                String str2 = activityQuizCardMessage.primaryId;
                if (((ArrayList) this.LLILLJJLI).contains(str2)) {
                    return;
                }
                ((ArrayList) this.LLILLJJLI).add(str2);
                if (((ArrayList) this.LLILLJJLI).size() > 1024) {
                    C19719612Di.LJJIIZ(this.LLILLJJLI);
                }
                this.LLIZ = activityQuizCardMessage.timestamp;
                ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(this.context, C19748512Ol.LIZIZ.LJIILL(activityQuizCardMessageSEIWrapper), z1("EOYQuizCard"), null);
                ((IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class)).ZP(true);
                C464800IKo.LIZ.LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("storage card msg pk:");
                sbLIZ.append(activityQuizCardMessage.primaryId);
                C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("primary_id", activityQuizCardMessage.primaryId);
                C1CC2.LJII(0, "ttlive_eoy_quiz_open_card_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_eoy_quiz_open_card_monitor");
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LJJII(activityQuizCardMessage.primaryId, "primary_id");
                c474500IjALIZ.LJJII(y1(activityQuizCardMessage.primaryId), "card_type");
                c474500IjALIZ.LJJII(str, "card_from");
                c474500IjALIZ.LIZ();
                this.LLJI = activityQuizCardMessage.primaryId;
                C259800zU c259800zU = new C259800zU();
                ?? LIZLLL = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).Qt1().LIZLLL(C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.warmUpPlayerTag);
                c259800zU.element = LIZLLL;
                if (LIZLLL != 0) {
                    LIZLLL.saveAudioStatus();
                }
                C0IEB c0ieb = (C0IEB) c259800zU.element;
                if (c0ieb != null) {
                    c0ieb.setAudioRespondDisableForQuiz(true);
                }
                ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(this.context, activityQuizCardMessage.schema, new AwS383S0200000_17(this, (ActQuizWidget) c259800zU, (C259800zU<C0IEB>) 41));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handle card error: ");
            sbLIZ2.append(e);
            C20441214yg.LJIIIZ("EOYQuiz", C2188811AlT.LIZIZ(sbLIZ2));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("event_id", "handle_card_exception");
            linkedHashMap2.put("msg", e.toString());
            C1CC2.LJII(1, "ttlive_eoy_quiz_exp_monitor", C2097608Jq.LJIIZILJ(linkedHashMap2));
        }
    }

    public final boolean C1(ActivityQuizCardMessage activityQuizCardMessage, String str) {
        String str2;
        if (LiveQuizCardValidateSetting.INSTANCE.getValue()) {
            if (activityQuizCardMessage == null) {
                return true;
            }
            if (activityQuizCardMessage.timestamp < this.LLIZ) {
                if (!((ArrayList) this.LLILLL).contains(activityQuizCardMessage.primaryId)) {
                    ((ArrayList) this.LLILLL).add(activityQuizCardMessage.primaryId);
                    if (((ArrayList) this.LLILLL).size() > 1024) {
                        C19719612Di.LJJIIZ(this.LLILLL);
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("primary_id", activityQuizCardMessage.primaryId);
                    linkedHashMap.put("reason", "old_timestamp");
                    linkedHashMap.put("card_from", str);
                    C1CC2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_eoy_quiz_discard_card_monitor");
                    c474500IjALIZ.LJIJJLI(this.dataChannel);
                    c474500IjALIZ.LJJII(activityQuizCardMessage.primaryId, "primary_id");
                    c474500IjALIZ.LJJII("old_timestamp", "reason");
                    c474500IjALIZ.LJJII(str, "card_from");
                    c474500IjALIZ.LIZ();
                }
            } else if (activityQuizCardMessage.expiredTime > 0 && C963140bAe.LIZJ() > activityQuizCardMessage.expiredTime) {
                if (!((ArrayList) this.LLILLL).contains(activityQuizCardMessage.primaryId)) {
                    ((ArrayList) this.LLILLL).add(activityQuizCardMessage.primaryId);
                    if (((ArrayList) this.LLILLL).size() > 1024) {
                        C19719612Di.LJJIIZ(this.LLILLL);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("primary_id", activityQuizCardMessage.primaryId);
                    linkedHashMap2.put("reason", "expired_time");
                    linkedHashMap2.put("card_from", str);
                    C1CC2.LJII(0, "ttlive_eoy_quiz_discard_card_monitor", C2097608Jq.LJIIZILJ(linkedHashMap2));
                    C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_eoy_quiz_discard_card_monitor");
                    c474500IjALIZ2.LJIJJLI(this.dataChannel);
                    c474500IjALIZ2.LJJII(activityQuizCardMessage.primaryId, "primary_id");
                    c474500IjALIZ2.LJJII("expired_time", "reason");
                    c474500IjALIZ2.LJJII(str, "card_from");
                    c474500IjALIZ2.LIZ();
                    return true;
                }
            }
            return true;
        }
        if (activityQuizCardMessage == null) {
            str2 = null;
        }
        this.LLJIJIL = str2;
        this.LLJILJIL = str;
        return false;
        str2 = activityQuizCardMessage.primaryId;
        this.LLJIJIL = str2;
        this.LLJILJIL = str;
        return false;
    }

    public final void E1(String str, String str2, String str3) {
        if (((ArrayList) this.LLILZ).contains(str2)) {
            return;
        }
        ((ArrayList) this.LLILZ).add(str2);
        if (((ArrayList) this.LLILZ).size() > 1024) {
            C19719612Di.LJJIIZ(this.LLILZ);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("primary_id", str2);
        linkedHashMap.put("card_from", str3);
        linkedHashMap.put("card_type", str);
        C1CC2.LJII(0, "ttlive_eoy_quiz_receive_msg_monitor", C2097608Jq.LJIIZILJ(linkedHashMap));
        if (Intrinsics.LJFF(str, "card")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_eoy_quiz_receive_card_monitor");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII(str2, "primary_id");
            c474500IjALIZ.LJJII(str3, "card_from");
            c474500IjALIZ.LJJII(y1(str2), "card_type");
            c474500IjALIZ.LIZ();
            return;
        }
        if (!Intrinsics.LJFF(str, "identity")) {
            return;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_eoy_quiz_receive_identity_monitor");
        c474500IjALIZ2.LJIJJLI(this.dataChannel);
        c474500IjALIZ2.LJJII(str2, "primary_id");
        c474500IjALIZ2.LJJII(str3, "card_from");
        c474500IjALIZ2.LIZ();
    }
}
