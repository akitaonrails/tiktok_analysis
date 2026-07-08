package com.ss.android.ugc.aweme.innerpush.core;

import X.C05EC;
import X.C08JS;
import X.C09JN;
import X.C0SZ8;
import X.C0ZF6;
import X.C11S5;
import X.C145E;
import X.C15O7;
import X.C1618440sDa;
import X.C1909710znN;
import X.C19290510dT;
import X.C19290610dU;
import X.C19329210ji;
import X.C19329510jl;
import X.C19329910jp;
import X.C19331210k2;
import X.C19331310k3;
import X.C20640315ph;
import X.C20640415pi;
import X.C20641815pw;
import X.C20642815q6;
import X.C20643115q9;
import X.C20643415qC;
import X.C20643615qE;
import X.C20644115qJ;
import X.C20663315tP;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2203431BLp;
import X.C2214201BlK;
import X.C261020AKu;
import X.C844470XAv;
import X.EnumC19330310jt;
import X.EnumC20643215qA;
import X.InterfaceC1616070s9l;
import X.InterfaceC19330810jy;
import X.InterfaceC19330910jz;
import X.InterfaceC20673515v3;
import X.InterfaceC2385309Wh;
import X.InterfaceC586170Myt;
import X.InterfaceC781210Ukh;
import Y.ACListenerS56S1200000_14;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYMessageHandler;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.api.model.PushHistoryInfo;
import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushManager;
import com.ss.android.ugc.aweme.innerpush.core.InnerPushQueueLooper;
import com.ss.android.ugc.aweme.innerpush.settings.InnerPushAIExp;
import com.ss.android.ugc.aweme.innerpush.settings.PullSettings;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class InnerPushManager implements InterfaceC586170Myt, HostSetupListener, PTYMessageHandler, InterfaceC1616070s9l {
    public static long coldStartTime;
    public static boolean isInit;
    public static boolean isNextWarmStart;
    public static volatile boolean isPureMode;
    public static final InnerPushManager INSTANCE = new InnerPushManager();
    public static boolean isNextColdStart = true;

    @Override // X.InterfaceC1616160s9u
    public /* bridge */ /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public /* bridge */ /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public /* bridge */ /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    public final synchronized void triggerInit() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("triggerInit, isInit:");
        sbLIZ.append(isInit);
        C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!isInit) {
            onAppEnterForeground(true);
            initOnceReal();
            isInit = true;
        }
    }

    private final void initOnceReal() {
        C19290510dT.LIZLLL("InnerPushManager", "initOnceReal...");
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(this);
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0T6d
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InnerPushManager@e6b2.initOnceReal$1");
                InnerPushManager.INSTANCE.onAppEnterForeground(!((Boolean) obj).booleanValue());
                C1C7U.LIZIZ("InnerPushManager@e6b2.initOnceReal$1");
            }
        });
        C2214201BlK.LJ().LJJLJLI(new C09JN() { // from class: X.0T6e
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InnerPushManager@e6b2.initOnceReal$2");
                InnerPushManager.isNextWarmStart = true;
                C1C7U.LIZIZ("InnerPushManager@e6b2.initOnceReal$2");
            }
        });
        C20640415pi c20640415pi = C20640415pi.LL;
        c20640415pi.getClass();
        C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
        c2203431BLp.LIZLLL(c20640415pi);
        c2203431BLp.LJI(1777, 11001, c20640415pi);
        c2203431BLp.LJI(1777, 1778, c20640415pi);
        C20644115qJ.LIZ.getClass();
        C20644115qJ.LIZIZ = true;
        C19329910jp.LIZ.getClass();
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            C19290610dU.LIZIZ.LIZ();
        }
        C20641815pw.LIZIZ(new InterfaceC19330810jy() { // from class: X.0ZF2
            public final C01GW LL = C452501pT.LIZIZ(new C0ZF4());

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                return false;
            }

            public static final C0Z9K LIZIZ() {
                return ((C0Z9Y) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJI();
            }

            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return C0ZF5.LIZ;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                return C1866720yg2.LIZ();
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[PHI: r2
              0x0057: PHI (r2v2 boolean) = (r2v0 boolean), (r2v5 boolean) binds: [B:5:0x0008, B:12:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC19330810jy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r6) {
                /*
                    r5 = this;
                    boolean r2 = X.C1866720yg2.LIZ()
                    if (r2 == 0) goto L5f
                    boolean r0 = com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushDedupExp.LJ
                    if (r0 == 0) goto L57
                    X.10k2 r0 = X.C19331210k2.LIZ
                    r0.getClass()
                    java.lang.String r2 = X.C19331210k2.LIZLLL()
                    java.lang.String r0 = "notification_page"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    r4 = 1
                    r0 = r0 ^ 1
                    if (r0 == 0) goto L67
                    r0 = 3
                    java.lang.Integer[] r3 = new java.lang.Integer[r0]
                    r0 = 9
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    r0 = 0
                    r3[r0] = r1
                    r0 = 34
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r3[r4] = r0
                    r0 = 8
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    r0 = 2
                    r3[r0] = r1
                    java.util.ArrayList r1 = X.C1697810uHb.LJ(r3)
                    int r0 = r6.getType()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    boolean r0 = r1.contains(r0)
                    if (r0 == 0) goto L60
                    java.lang.String r0 = "new_followers"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                L53:
                    r2 = r0 ^ 1
                    if (r2 == 0) goto L5f
                L57:
                    X.0Z9K r1 = LIZIZ()
                    r0 = 0
                    r1.LJIILJJIL(r6, r0)
                L5f:
                    return r2
                L60:
                    java.lang.String r0 = "activity_page"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
                    goto L53
                L67:
                    r2 = 0
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0ZF2.LJI(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                if (innerPushMessage == null) {
                    return false;
                }
                if (!LIZIZ().LJIJJ(innerPushMessage)) {
                    return ((C0ZF3) this.LL.getValue()).LIZ(i, innerPushMessage);
                }
                if (i != 3) {
                    return false;
                }
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                InnerPushUITemplate uiTemplate;
                String str;
                ((C0ZF3) this.LL.getValue()).LL = c20663515tR;
                if (innerPushMessage == null) {
                    return null;
                }
                if (!LIZIZ().LJIJJ(innerPushMessage)) {
                    this.LL.getValue().getClass();
                    if (C13LQ.LJJIJ(innerPushMessage.getType(), C0ZF5.LIZ) >= 0) {
                        ((C0ZF3) this.LL.getValue()).LJIIIZ(c20663515tR, innerPushMessage);
                    }
                    return null;
                }
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                String str2 = "";
                if ((uiTemplate2 == null || (str = uiTemplate2.rightSchemaUrl) == null) && ((uiTemplate = innerPushMessage.getUiTemplate()) == null || (str = uiTemplate.globalSchemaUrl) == null)) {
                    str = "";
                }
                C0Z9K c0z9kLIZIZ = LIZIZ();
                Pair[] pairArr = new Pair[5];
                pairArr[0] = new Pair("enter_from", "inner_push");
                String strLJJJJZI = LIZIZ().LJJJJZI(str);
                if (strLJJJJZI != null) {
                    str2 = strLJJJJZI;
                }
                pairArr[1] = new Pair("enter_method", str2);
                C19331210k2.LIZ.getClass();
                pairArr[2] = new Pair("push_label", C19331210k2.LJI(innerPushMessage));
                pairArr[3] = new Pair("light_interaction_enter_from", C19331210k2.LIZLLL());
                pairArr[4] = new Pair("light_interaction_enter_method", EnumC1908380zlE.INNER_PUSH.getValue());
                return c0z9kLIZIZ.LJIIJJI(innerPushMessage, null, false, C2097608Jq.LJIIIIZZ(pairArr), new ACListenerS56S1200000_14((Object) c20663515tR, (Context) str, (String) innerPushMessage, (Map<String, String>) 4), new AwS450S0200000_14(c20663515tR, innerPushMessage, 13));
            }
        });
        C20641815pw.LIZIZ(new C20640315ph());
        C20641815pw.LIZIZ(new InterfaceC19330810jy() { // from class: X.10M8
            public final int[] LL = {30};

            @Override // X.InterfaceC19330810jy
            public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
                return false;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJFF(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LJI(InnerPushMessage innerPushMessage) {
                return true;
            }

            @Override // X.InterfaceC19330810jy
            public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
                return null;
            }

            @Override // X.InterfaceC19330810jy
            public final int[] LIZJ() {
                return this.LL;
            }

            @Override // X.InterfaceC19330810jy
            public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
                ILiveOuterService iLiveOuterService;
                C19329910jp.LIZ.getClass();
                if (!C19329910jp.LIZ() || ((iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null && iLiveOuterService.LLZZ())) {
                    return false;
                }
                return true;
            }
        });
        ((ConcurrentHashMap) C20663315tP.LIZ.getValue()).put(3, C0ZF6.LIZ);
        C1618440sDa.LIZIZ.LJJIIZI().registerStoryInnerPushHandler();
        registerLiveBroadcastStatusChangeListener();
    }

    private final void registerLiveBroadcastStatusChangeListener() {
        final ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService.isInitedLiveSDK()) {
            registerLiveBroadcastStatusChangeListener$innerRegister(iLiveOuterService);
        } else {
            iLiveOuterService.j5(new C145E() { // from class: X.15qG
            });
        }
    }

    public final long getColdStartTime() {
        return coldStartTime;
    }

    public final boolean isPureMode() {
        return isPureMode;
    }

    public static final void registerLiveBroadcastStatusChangeListener$innerRegister(ILiveOuterService iLiveOuterService) {
        iLiveOuterService.k4().LJJLIIIJLLLLLLLZ();
    }

    public final void onAppEnterForeground(boolean z) {
        List arrayList;
        if (!((Boolean) C261020AKu.LIZ.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAppForeground: ");
            sbLIZ.append(z);
            sbLIZ.append(", ");
            sbLIZ.append(isNextColdStart);
            sbLIZ.append(", ");
            sbLIZ.append(isNextWarmStart);
            C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            C15O7.LJIIIIZZ(PullSettings.LIZ().hotStartDelaySeconds).LIZLLL(new InterfaceC2385309Wh() { // from class: X.15pm
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7 c15o7) {
                    C1C7U.LIZ("InnerPushManager@e6b2.onAppEnterForeground$1");
                    InnerPushQueueLooper.LL.LJIIIZ(true);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InnerPushManager@e6b2.onAppEnterForeground$1");
                    return unit;
                }
            });
            if (isNextColdStart) {
                C19329510jl.LIZ.getClass();
                String string = C19329210ji.LJ().getString("wait_status_messages", "");
                if (!TextUtils.isEmpty(string)) {
                    arrayList = C08JS.LJ(Object[].class, string);
                } else {
                    arrayList = new ArrayList();
                }
                if (!arrayList.isEmpty()) {
                    PushHistoryInfo pushHistoryInfo = new PushHistoryInfo(Long.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), 0L, 0, "");
                    C19331210k2 c19331210k2 = C19331210k2.LIZ;
                    EnumC19330310jt enumC19330310jt = EnumC19330310jt.START;
                    c19331210k2.getClass();
                    C19331210k2.LJIILIIL(null, enumC19330310jt);
                    C19329510jl.LIZ().LIZ(((InterfaceC19330910jz) C19329510jl.LIZJ.getValue()).LIZIZ(0L, enumC19330310jt.getValue(), JsonParseUtils.LJ(pushHistoryInfo)).LJL(C11S5.LIZ()).LJJZ(new C09JN() { // from class: X.10jk
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("InnerPushApi@7661.resetStatus$1");
                            C19329510jl.LIZ.getClass();
                            C19329510jl.LIZ().LJ();
                            if (((BaseResponse) obj).status_code == 0) {
                                C19329210ji.LJ().erase("wait_status_messages");
                            }
                            C1C7U.LIZIZ("InnerPushApi@7661.resetStatus$1");
                        }
                    }, new C09JN() { // from class: X.00OE
                        @Override // X.C09JN
                        public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            C1C7U.LIZ("InnerPushApi@7661.resetStatus$2");
                            C1C7U.LIZIZ("InnerPushApi@7661.resetStatus$2");
                        }
                    }, new InterfaceC781210Ukh() { // from class: X.15qI
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                        }
                    }));
                }
                coldStartTime = System.currentTimeMillis();
                if (((Boolean) InnerPushAIExp.LJ.getValue()).booleanValue()) {
                    if (C05EC.LIZ()) {
                        IPitayaCore iPitayaCore = C05EC.LIZIZ;
                        if (iPitayaCore != null) {
                            iPitayaCore.registerMessageHandler("innerpush_universal_trigger", this);
                        }
                    } else {
                        HostSetupWatcher.INSTANCE.registerHostSetupListener(this);
                    }
                }
                if (PullSettings.LIZ().enabledColdStart) {
                    C20643115q9.LIZIZ(C20643115q9.LIZ, EnumC20643215qA.COLD_START, 6);
                }
            } else if (isNextWarmStart) {
                if (PullSettings.LIZ().enabledWarmStart) {
                    C20643115q9.LIZIZ(C20643115q9.LIZ, EnumC20643215qA.WARM_START, 6);
                }
                C19331210k2 c19331210k22 = C19331210k2.LIZ;
                EnumC20643215qA enumC20643215qA = EnumC20643215qA.WARM_START;
                c19331210k22.getClass();
                int i = C20643415qC.LIZ[enumC20643215qA.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C20684815ws.onEventV3("inner_push_warm_start");
                    }
                } else {
                    C20684815ws.onEventV3("inner_push_hot_start");
                }
            } else {
                if (PullSettings.LIZ().enabledHotStart) {
                    C20643115q9.LIZIZ(C20643115q9.LIZ, EnumC20643215qA.HOT_START, 6);
                }
                C19331210k2 c19331210k23 = C19331210k2.LIZ;
                EnumC20643215qA enumC20643215qA2 = EnumC20643215qA.HOT_START;
                c19331210k23.getClass();
                int i2 = C20643415qC.LIZ[enumC20643215qA2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        C20684815ws.onEventV3("inner_push_warm_start");
                    }
                } else {
                    C20684815ws.onEventV3("inner_push_hot_start");
                }
            }
            isNextColdStart = false;
            isNextWarmStart = false;
            return;
        }
        C1909710znN.LIZ.getClass();
        C1909710znN.LJ();
    }

    public final JSONObject onClientSideIntelligenceMsgBlocked(JSONObject jSONObject) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onClientSideIntelligenceMsgBlocked] message = ");
        sbLIZ.append(jSONObject);
        C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        String strOptString = jSONObject.optString("event_type");
        if (strOptString != null && strOptString.length() != 0) {
            EnumC20643215qA[] enumC20643215qAArrValues = EnumC20643215qA.values();
            int length = enumC20643215qAArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC20643215qA enumC20643215qA = enumC20643215qAArrValues[i];
                if (Intrinsics.LJFF(enumC20643215qA.getEventType(), strOptString)) {
                    C20642815q6.LJ(enumC20643215qA, false);
                    break;
                }
                i++;
            }
        }
        return new JSONObject().put("ret", true);
    }

    @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
    public void onHostSetup(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostSetup success = ");
        sbLIZ.append(z);
        sbLIZ.append(" pitayaReady:");
        sbLIZ.append(C05EC.LIZ());
        C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        if (C05EC.LIZ()) {
            IPitayaCore iPitayaCore = C05EC.LIZIZ;
            if (iPitayaCore != null) {
                iPitayaCore.registerMessageHandler("innerpush_universal_trigger", this);
            }
            final C20643615qE c20643615qE = new C20643615qE(this);
            IPitayaCore iPitayaCore2 = C05EC.LIZIZ;
            if (iPitayaCore2 != null) {
                iPitayaCore2.registerMessageHandler("innerpush_universal_trigger_failed", new PTYMessageHandler() { // from class: com.ss.android.ugc.aweme.innerpush.utils.InnerPushAIHelper$registerBlockedHandler$1
                    @Override // com.bytedance.pitaya.api.PTYMessageHandler
                    public JSONObject onMessage(JSONObject jSONObject) {
                        return c20643615qE.invoke(jSONObject);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.pitaya.api.PTYMessageHandler
    public JSONObject onMessage(JSONObject jSONObject) {
        JSONObject jSONObject2;
        boolean z;
        String strOptString;
        ILiveOuterService iLiveOuterServiceQ4;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage onResult message: ");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", ");
        C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        String strOptString2 = jSONObject.optString("action");
        EnumC20643215qA enumC20643215qA = null;
        try {
            jSONObject2 = new JSONObject(jSONObject.optString("extra"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject2 = null;
        }
        int i = 0;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (iLiveOuterServiceQ4 = iLiveOuterService.q4()) != null && (interfaceC20673515v3K4 = iLiveOuterServiceQ4.k4()) != null && interfaceC20673515v3K4.LLJ(strOptString2, jSONObject, jSONObject2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new JSONObject().put("ret", true);
        }
        if (jSONObject2 != null) {
            strOptString = jSONObject2.optString("event_type");
        } else {
            strOptString = null;
        }
        if (Intrinsics.LJFF(strOptString2, "pull") && !TextUtils.isEmpty(strOptString)) {
            EnumC20643215qA[] enumC20643215qAArrValues = EnumC20643215qA.values();
            int length = enumC20643215qAArrValues.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC20643215qA enumC20643215qA2 = enumC20643215qAArrValues[i];
                if (Intrinsics.LJFF(enumC20643215qA2.getEventType(), strOptString)) {
                    enumC20643215qA = enumC20643215qA2;
                    break;
                }
                i++;
            }
            if (enumC20643215qA != null) {
                C20643115q9.LIZ.getClass();
                C20643115q9.LIZ(enumC20643215qA, 0L, jSONObject2);
            }
        }
        return new JSONObject().put("ret", true);
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public void onPageSelected(int i) {
        if (!((Boolean) C261020AKu.LIZ.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPageSelected postion:");
            sbLIZ.append(i);
            sbLIZ.append(' ');
            C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (InnerPushColdStartExp.LIZ() && i == 1) {
            C20643115q9 c20643115q9 = C20643115q9.LIZ;
            c20643115q9.getClass();
            C20643115q9.LIZLLL = false;
            C20643115q9.LIZIZ(c20643115q9, EnumC20643215qA.COLD_START, 4);
        }
    }

    public final void setColdStartTime(long j) {
        coldStartTime = j;
    }

    @Override // X.InterfaceC586170Myt
    public void onAccountResult(int i, boolean z, int i2, User user) {
        String uid;
        if (!z) {
            return;
        }
        if (i != 1 && i != 2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAccountResult, LOGIN, type = ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        sbLIZ.append(uid);
        C19290510dT.LIZLLL("InnerPushManager", C2188811AlT.LIZIZ(sbLIZ));
        InnerPushQueueLooper.LL.getClass();
        C19331310k3.LJIIJ(AFwS221S0000000_31.get$arr$(16));
        C1909710znN.LIZ.getClass();
        C1909710znN.LJ();
        if (!PullSettings.LIZ().enabledAccountSwitch) {
            return;
        }
        C20643115q9.LIZIZ(C20643115q9.LIZ, EnumC20643215qA.ACCOUNT_LOGIN, 6);
    }
}
