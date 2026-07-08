package com.ss.android.ugc.aweme.services;

import X.C01GW;
import X.C036E;
import X.C09UZ;
import X.C0BOA;
import X.C0C64;
import X.C0H62;
import X.C0HTI;
import X.C0O0L;
import X.C0WZX;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13LP;
import X.C15O7;
import X.C1609910rzp;
import X.C1701330uNH;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1954807lC;
import X.C1AF0;
import X.C1BWL;
import X.C1C7U;
import X.C20626215nQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C299060Bns;
import X.C305550ByL;
import X.C346460Di8;
import X.C346480DiA;
import X.C418440Gaw;
import X.C430590GuX;
import X.C452501pT;
import X.C814420VxA;
import X.C908340ZkG;
import X.C908350ZkH;
import X.C908360ZkI;
import X.C908370ZkJ;
import X.C908420ZkO;
import X.C908450ZkR;
import X.EnumC1609900rzo;
import X.InterfaceC908430ZkP;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class NetworkStandardUIServiceImpl implements INetworkStandardUIService, C0H62 {
    public static final Companion Companion = new Companion();
    public static final int TIPS_ENABLE_KEY = R.id.hc3;
    public static final C01GW<List<String>> newStylePanelList$delegate = C452501pT.LIZIZ(new NetworkStandardUIServiceImpl$Companion$newStylePanelList$2());
    public boolean needPortal;
    public int retryCount;
    public final Map<WeakReference<C1749280vcc>, WeakReference<Function0<Unit>>> autoRetryListener = new LinkedHashMap();
    public final C01GW init$delegate = C452501pT.LIZIZ(new NetworkStandardUIServiceImpl$init$2(this));
    public long tipsBarrierTime = 10000;
    public final Map<EnumC1609900rzo, Runnable> showLazyToastWhenFake = new LinkedHashMap();
    public final ConcurrentHashMap<String, Long> historyToast = new ConcurrentHashMap<>();

    public static final class Companion {
        public final List<String> getNewStylePanelList() {
            return NetworkStandardUIServiceImpl.newStylePanelList$delegate.getValue();
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[C0O0L.values().length];
            try {
                iArr[C0O0L.NOT_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[C0O0L.FAKE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[C0O0L.AVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean hasRetryButton() {
        return true;
    }

    public final void retryEvent(String str, String str2) {
    }

    public boolean triggerNetworkTipsForSharePanelExperiment(Activity activity) {
        return false;
    }

    private final boolean getInit() {
        return ((Boolean) this.init$delegate.getValue()).booleanValue();
    }

    private final boolean autoRefresh() {
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "network_standard_ui_experiment", true) == 2 || C0C64.LJIILLIIL().LJIJ(31744, 2, "network_standard_ui_experiment", true) == 3 || C305550ByL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public boolean isStandardUIEnable() {
        return C0C64.LJIILLIIL().LJIJ(31744, 2, "network_standard_ui_experiment", true) != 0;
    }

    public static final class StatusInfo {
        public int networkStatus;
        public int retryCount;
        public Function0<Unit> retryFunc;
        public String sceneName;

        public final int getNetworkStatus() {
            return this.networkStatus;
        }

        public final int getRetryCount() {
            return this.retryCount;
        }

        public final Function0<Unit> getRetryFunc() {
            return this.retryFunc;
        }

        public final String getSceneName() {
            return this.sceneName;
        }

        public final void setNetworkStatus(int i) {
            this.networkStatus = i;
        }

        public final void setRetryCount(int i) {
            this.retryCount = i;
        }

        public final void setRetryFunc(Function0<Unit> function0) {
            this.retryFunc = function0;
        }

        public final void setSceneName(String str) {
            this.sceneName = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public InterfaceC908430ZkP getNetworkStateForSharePanel() {
        return C908420ZkO.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void registerForNetworkChangeToasts() {
        getInit();
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x00dd A[PHI: r5
      0x00dd: PHI (r5v4 boolean) = (r5v2 boolean), (r5v2 boolean), (r5v7 boolean), (r5v7 boolean) binds: [B:86:0x00cd, B:88:0x00d8, B:65:0x0099, B:67:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int checkForTag(android.content.Context r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.checkForTag(android.content.Context):int");
    }

    private final boolean checkNetworkDiagnosisOn(String str) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "openNetworkDiagosis", true, false)) {
            List<String> list = C1609910rzp.LIZ;
            if (C13LP.LJJJJ(str, C1609910rzp.LIZLLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final boolean checkRepeatedToast(String str) {
        Long l = this.historyToast.get(str);
        if (l != null && SystemClock.uptimeMillis() - l.longValue() <= this.tipsBarrierTime) {
            return true;
        }
        this.historyToast.put(str, Long.valueOf(SystemClock.uptimeMillis()));
        return false;
    }

    private final boolean checkStatusIfChanged(C1749280vcc c1749280vcc) {
        Object tag;
        if (c1749280vcc == null || (tag = c1749280vcc.getTag(R.id.p4y)) == null) {
            return true;
        }
        if (((StatusInfo) tag).getNetworkStatus() != checkForTag(C1BWL.LIZ())) {
            return true;
        }
        return false;
    }

    public final StatusInfo getStatus(C1749280vcc c1749280vcc) {
        Object tag;
        if (c1749280vcc == null || (tag = c1749280vcc.getTag(R.id.p4y)) == null || !(tag instanceof StatusInfo)) {
            return null;
        }
        return (StatusInfo) tag;
    }

    public final void initTipsEnableTag(C1749280vcc c1749280vcc) {
        if (c1749280vcc.getTag(TIPS_ENABLE_KEY) == null && c1749280vcc.isShown()) {
            markTipsEnable(c1749280vcc, false);
        }
    }

    public final boolean isTipsEnable(C1749280vcc c1749280vcc) {
        if (!c1749280vcc.isShown()) {
            return true;
        }
        return Intrinsics.LJFF(c1749280vcc.getTag(TIPS_ENABLE_KEY), Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void removeLazyToast(EnumC1609900rzo enumC1609900rzo) {
        if (enumC1609900rzo != EnumC1609900rzo.DEFAULT && this.showLazyToastWhenFake.remove(enumC1609900rzo) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeLazyToast ");
            sbLIZ.append(enumC1609900rzo);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void resetTipsBarrier(C1749280vcc c1749280vcc) {
        markTipsEnable(c1749280vcc, false);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmtcYnH3zdD6AixIZzoTuh8McORa2WwrUBy8e6pjwC4QSE94h0=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    private final void tipsShowEvent(String str, String str2) {
        C20684815ws.LJIILLIIL("network_toast_show", C2097608Jq.LJIIIIZZ(new Pair("toast_content", str), new Pair(Scene.SCENE_SERVICE, str2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if ((r0 instanceof X.C23112093u) != false) goto L20;
     */
    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getStatusViewNeedShowForSearch(X.EnumC1609900rzo r4, java.lang.Exception r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof X.C1494690ozz
            r2 = 1
            if (r0 == 0) goto L2a
            r0 = r5
            X.0ozz r0 = (X.C1494690ozz) r0
            int r1 = r0.getCronetInternalErrorCode()
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r1 != r0) goto L2a
        L10:
            X.0Vh4 r0 = X.C036E.LIZ
            X.0O0L r0 = r0.LIZJ
            if (r0 == 0) goto L48
            int[] r1 = com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r1 = r1[r0]
            if (r1 == r2) goto L41
            r0 = 2
            if (r1 != r0) goto L48
            com.ss.android.ugc.aweme.services.SearchDynamicViewStatus r0 = com.ss.android.ugc.aweme.services.SearchDynamicViewStatus.FAKE
            int r0 = r0.getStatus()
            return r0
        L2a:
            boolean r0 = r5 instanceof X.C23112093u
            if (r0 != 0) goto L38
            if (r5 == 0) goto L3f
            java.lang.Throwable r0 = r5.getCause()
        L34:
            boolean r0 = r0 instanceof X.C23112093u
            if (r0 == 0) goto L10
        L38:
            com.ss.android.ugc.aweme.services.SearchDynamicViewStatus r0 = com.ss.android.ugc.aweme.services.SearchDynamicViewStatus.SERVER_ERROR
            int r0 = r0.getStatus()
            return r0
        L3f:
            r0 = 0
            goto L34
        L41:
            com.ss.android.ugc.aweme.services.SearchDynamicViewStatus r0 = com.ss.android.ugc.aweme.services.SearchDynamicViewStatus.NOT_AVAILABLE
            int r0 = r0.getStatus()
            return r0
        L48:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.network.spi.INetworkStateService> r0 = com.ss.android.ugc.aweme.network.spi.INetworkStateService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.network.spi.INetworkStateService r0 = (com.ss.android.ugc.aweme.network.spi.INetworkStateService) r0
            boolean r0 = r0.isWeakNetwork()
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.services.SearchDynamicViewStatus r0 = com.ss.android.ugc.aweme.services.SearchDynamicViewStatus.WEAK
            int r0 = r0.getStatus()
            return r0
        L61:
            com.ss.android.ugc.aweme.services.SearchDynamicViewStatus r0 = com.ss.android.ugc.aweme.services.SearchDynamicViewStatus.SERVER_ERROR
            int r0 = r0.getStatus()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.getStatusViewNeedShowForSearch(X.0rzo, java.lang.Exception):int");
    }

    public final void markTipsEnable(C1749280vcc c1749280vcc, boolean z) {
        c1749280vcc.setTag(TIPS_ENABLE_KEY, Boolean.valueOf(z));
    }

    @Override // X.C0H62
    public void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
        C0O0L c0o0l3 = C0O0L.AVAILABLE;
        if (c0o0l != c0o0l3 && c0o0l2 == c0o0l3) {
            if (!checkRepeatedToast(EnumC1609900rzo.FULL_FEED.getValue())) {
                Activity topActivity = ActivityStack.getTopActivity();
                if (C299060Bns.LIZ()) {
                    C1389880mGw c1389880mGw = new C1389880mGw(topActivity);
                    c1389880mGw.LIZ(true);
                    c1389880mGw.LJIIIIZZ(2131829442);
                    c1389880mGw.LJIIJ();
                } else {
                    C1389890mGx c1389890mGx = new C1389890mGx(topActivity);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIIZ(2131829442);
                    c1389890mGx.LJIIJJI();
                }
            }
            if (!autoRefresh()) {
                return;
            }
            for (Map.Entry<WeakReference<C1749280vcc>, WeakReference<Function0<Unit>>> entry : this.autoRetryListener.entrySet()) {
                final C1749280vcc c1749280vcc = entry.getKey().get();
                final Function0<Unit> function0 = entry.getValue().get();
                if (c1749280vcc != null) {
                    markTipsEnable(c1749280vcc, true);
                    Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$onChange$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("NetworkStandardUIServiceImpl@8dac.onChange$1$1$1");
                            com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            C1C7U.LIZIZ("NetworkStandardUIServiceImpl@8dac.onChange$1$1$1");
                        }

                        public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1__run$___twin___() {
                            Function0<Unit> function02;
                            if (!c1749280vcc.isAttachedToWindow() || (function02 = function0) == null) {
                                return;
                            }
                            function02.invoke();
                        }

                        public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$onChange$1$1$1 networkStandardUIServiceImpl$onChange$1$1$1) {
                            try {
                                networkStandardUIServiceImpl$onChange$1$1$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onChange$1$1$1__run$___twin___();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    };
                    int i = C09UZ.LIZ;
                    C15O7.LJIIIIZZ(500L).LJII(new C346480DiA(runnable, 7), C15O7.LJIIIIZZ).LIZLLL(new C346460Di8(0));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void startLazyToast(final EnumC1609900rzo enumC1609900rzo, final Activity activity) {
        if (enumC1609900rzo != EnumC1609900rzo.DEFAULT && activity != null) {
            this.showLazyToastWhenFake.put(enumC1609900rzo, new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("NetworkStandardUIServiceImpl@8dac.startLazyToast$1$showToast$1");
                    com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("NetworkStandardUIServiceImpl@8dac.startLazyToast$1$showToast$1");
                }

                public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1__run$___twin___() {
                    if (activity.isFinishing() || activity.isDestroyed() || C036E.LIZ.LIZJ != C0O0L.FAKE) {
                        return;
                    }
                    this.triggerNetworkTips(activity, enumC1609900rzo, (Exception) null, (C1749280vcc) null);
                }

                public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1 networkStandardUIServiceImpl$startLazyToast$1$showToast$1) {
                    try {
                        networkStandardUIServiceImpl$startLazyToast$1$showToast$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$showToast$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            });
            Runnable runnable = new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$startLazyToast$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("NetworkStandardUIServiceImpl@8dac.startLazyToast$1$1");
                    com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    C1C7U.LIZIZ("NetworkStandardUIServiceImpl@8dac.startLazyToast$1$1");
                }

                public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1__run$___twin___() {
                    Runnable runnableRemove = this.this$0.showLazyToastWhenFake.remove(enumC1609900rzo);
                    if (runnableRemove != null) {
                        runnableRemove.run();
                    }
                }

                public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NetworkStandardUIServiceImpl$startLazyToast$1$1 networkStandardUIServiceImpl$startLazyToast$1$1) {
                    try {
                        networkStandardUIServiceImpl$startLazyToast$1$1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$startLazyToast$1$1__run$___twin___();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!C2179971ATj.LIZ(th)) {
                            throw th;
                        }
                    }
                }
            };
            int i = C09UZ.LIZ;
            C15O7.LJIIIIZZ(Mp4ScreenVideoLoadTimeout.CONTROL).LJII(new C346480DiA(runnable, 7), C15O7.LJIIIIZZ).LIZLLL(new C346460Di8(0));
        }
    }

    private final void forceShowTips(Activity activity, int i, String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIIZ(i);
        c1389890mGx.LJIIJJI();
    }

    public final void onEvent(final int i, final String str, final String str2) {
        C09UZ.LIZ(new Runnable() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.onEvent.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("NetworkStandardUIServiceImpl@8dac.onEvent$1");
                com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("NetworkStandardUIServiceImpl@8dac.onEvent$1");
            }

            public final void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1__run$___twin___() {
                try {
                    int effectiveConnectionType = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType();
                    JSONObject jSONObject = new JSONObject();
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    jSONObject.put("connection_error_type", i2);
                    jSONObject.put("network_status", effectiveConnectionType);
                    jSONObject.put("enter_from", str3);
                    jSONObject.put("exit_method", str4);
                    C20684815ws.LJIJ("network_diagnosis_panel", jSONObject);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }

            public static void com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                try {
                    anonymousClass1.com_ss_android_ugc_aweme_services_NetworkStandardUIServiceImpl$onEvent$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void showNetworkToast(Activity activity, InterfaceC908430ZkP interfaceC908430ZkP, String str) {
        if (!Intrinsics.LJFF(interfaceC908430ZkP, C908420ZkO.LIZ)) {
            if (Intrinsics.LJFF(interfaceC908430ZkP, C908450ZkR.LIZ)) {
                forceShowTips(activity, 2131829445, str);
                return;
            }
            if (Intrinsics.LJFF(interfaceC908430ZkP, C908350ZkH.LIZ)) {
                forceShowTips(activity, 2131829441, str);
                return;
            }
            if (Intrinsics.LJFF(interfaceC908430ZkP, C908360ZkI.LIZ)) {
                forceShowTips(activity, 2131829443, str);
            } else if (Intrinsics.LJFF(interfaceC908430ZkP, C908370ZkJ.LIZ)) {
                forceShowTips(activity, 2131829438, str);
            } else {
                if (Intrinsics.LJFF(interfaceC908430ZkP, C908340ZkG.LIZ)) {
                    forceShowTips(activity, 2131829440, str);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }

    private final void saveStatus(C1749280vcc c1749280vcc, String str, int i, Function0<Unit> function0) {
        StatusInfo status = getStatus(c1749280vcc);
        if (status == null) {
            StatusInfo statusInfo = new StatusInfo();
            statusInfo.setSceneName(str);
            statusInfo.setRetryFunc(function0);
            statusInfo.setNetworkStatus(i);
            c1749280vcc.setTag(R.id.p4y, statusInfo);
            return;
        }
        status.setSceneName(str);
        status.setRetryFunc(function0);
        status.setNetworkStatus(i);
        status.setRetryCount(status.getRetryCount());
    }

    private final boolean showCenterTips(Activity activity, int i, String str, Integer num) {
        String value;
        CharSequence charSequenceLIZ;
        if (C1609910rzp.LJ.contains(str)) {
            value = EnumC1609900rzo.FULL_FEED.getValue();
        } else {
            value = str;
        }
        if (checkRepeatedToast(str)) {
            return false;
        }
        String string = activity.getString(i);
        if (C0BOA.LIZ() && num != null) {
            charSequenceLIZ = C430590GuX.LIZ(num.intValue(), string);
        } else {
            charSequenceLIZ = string;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(activity);
        c1389880mGw.LJIIIZ(charSequenceLIZ);
        c1389880mGw.LJIIJ();
        tipsShowEvent(string, value);
        return true;
    }

    private final boolean showTips(Activity activity, int i, String str, Integer num) {
        String value;
        CharSequence charSequenceLIZ;
        if (C1609910rzp.LJ.contains(str)) {
            value = EnumC1609900rzo.FULL_FEED.getValue();
        } else {
            value = str;
        }
        if (checkRepeatedToast(str)) {
            return false;
        }
        String string = activity.getString(i);
        if (C0BOA.LIZ() && num != null) {
            charSequenceLIZ = C430590GuX.LIZ(num.intValue(), string);
        } else {
            charSequenceLIZ = string;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(activity);
        c1389890mGx.LJIIJ(charSequenceLIZ);
        c1389890mGx.LJIIJJI();
        tipsShowEvent(string, value);
        return true;
    }

    private final C1722300uv6 smallPanelStatusView(Context context, String str, String str2, String str3) {
        String string;
        Application applicationLIZ = C1BWL.LIZ();
        if (applicationLIZ != null) {
            string = applicationLIZ.getString(2131821671);
        } else {
            string = null;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        if (C13LP.LJJJJ(str3, Companion.getNewStylePanelList())) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(context);
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            c1722300uv6.LJI = context.getString(R.string.m25);
        } else {
            if (str != null) {
                c1722300uv6.LJI = str;
            }
            if (str2 != null) {
                c1722300uv6.LJIIIIZZ = str2;
            }
        }
        if (hasRetryButton()) {
            c1722300uv6.LJIIIZ = new NetworkStandardUIServiceImpl$smallPanelStatusView$4$1(string, str3);
        }
        return c1722300uv6;
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void setStatusView(C1749280vcc c1749280vcc, String str, Function0<Unit> function0, Exception exc) {
        innerSetStatusView(c1749280vcc, str, function0, exc, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$2] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$3] */
    /* JADX WARN: Type inference failed for: r0v36, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$4] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$showDiagnoseDialog$5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void showDiagnoseDialog(final android.content.Context r21, int r22, boolean r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.showDiagnoseDialog(android.content.Context, int, boolean, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void triggerNetworkTips(android.app.Activity r8, java.lang.String r9, java.lang.Exception r10, X.C1749280vcc r11) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.triggerNetworkTips(android.app.Activity, java.lang.String, java.lang.Exception, X.0vcc):void");
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc) {
        setStatusView(c1749280vcc, enumC1609900rzo.getValue(), function0, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void triggerNetworkTips(Activity activity, EnumC1609900rzo enumC1609900rzo, Exception exc, C1749280vcc c1749280vcc) {
        this.tipsBarrierTime = 10000L;
        triggerNetworkTips(activity, enumC1609900rzo.getValue(), exc, c1749280vcc);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void innerSetStatusView(final X.C1749280vcc r23, final java.lang.String r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, final java.lang.Exception r26, X.C20626215nQ r27) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.innerSetStatusView(X.0vcc, java.lang.String, kotlin.jvm.functions.Function0, java.lang.Exception, X.15nQ):void");
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc, C20626215nQ c20626215nQ) {
        innerSetStatusView(c1749280vcc, enumC1609900rzo.getValue(), function0, exc, c20626215nQ);
    }

    public void triggerNetworkTips(Activity activity, EnumC1609900rzo enumC1609900rzo, Exception exc, C1749280vcc c1749280vcc, long j) {
        this.tipsBarrierTime = j;
        triggerNetworkTips(activity, enumC1609900rzo.getValue(), exc, c1749280vcc);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.C1722300uv6 largePanelStatusView(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.Runnable r17, kotlin.jvm.functions.Function0<kotlin.Unit> r18, X.C20626215nQ r19) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl.largePanelStatusView(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Runnable, kotlin.jvm.functions.Function0, X.15nQ):X.0uv6");
    }
}
