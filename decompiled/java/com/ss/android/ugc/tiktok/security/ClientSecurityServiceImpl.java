package com.ss.android.ugc.tiktok.security;

import X.C098200Yq;
import X.C0WMX;
import X.C0WQX;
import X.C0WZX;
import X.C0X55;
import X.C1200904mt;
import X.C1201004mu;
import X.C189200o6;
import X.C1942007j8;
import X.C1EAZ;
import X.C2123408To;
import X.C2123508Tp;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C794280VDu;
import X.C821960WMg;
import X.C822490WOh;
import X.C822500WOi;
import X.C822530WOl;
import X.C823050WQl;
import X.C828620Wey;
import X.C843670X7t;
import X.EnumC822460WOe;
import X.ExecutorC822630WOv;
import Y.ARunnableS82S0200000_13;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.webkit.WebViewHooker;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import com.bytedance.pumbaa.hybrid.governance.csp.PnsOfflineResComplianceModel;
import com.bytedance.pumbaa.hybrid.governance.router.settings.PnsJsbBlockConfigModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.security.boston.BostonGatewayInterceptor;
import com.ss.android.ugc.tiktok.security.csrf.CSRFClientExt;
import com.ss.android.ugc.tiktok.security.jsguard.PnsThirdBypassPathSettings;
import com.ss.android.ugc.tiktok.security.model.PnsSparkThirdHookModel;
import com.ss.android.ugc.tiktok.security.settings.PnsRuntimeDfIdMapping;
import com.ss.android.ugc.tiktok.security.settings.PnsWebDfIdConfigModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public final class ClientSecurityServiceImpl implements IClientSecurityService {
    public CSRFClientExt LIZ;
    public volatile boolean LIZIZ;

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final String[] LJIIL() {
        return new String[0];
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJIILL() {
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIZILJ() {
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LIZLLL() {
        C828620Wey c828620Wey = C828620Wey.LIZ;
        C843670X7t c843670X7t = new C843670X7t(this);
        c828620Wey.getClass();
        BaseGovernanceModel baseGovernanceModel = C1200904mt.LIZ;
        BaseGovernanceModel baseGovernanceModel2 = (BaseGovernanceModel) C821960WMg.LIZ(PnsOfflineResComplianceModel.class, "pns_offline_resource_compliance", baseGovernanceModel);
        if (baseGovernanceModel2 != null) {
            baseGovernanceModel = baseGovernanceModel2;
        }
        if (baseGovernanceModel.enable && C828620Wey.LIZIZ == null) {
            c843670X7t.invoke();
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void init() {
        if (this.LIZIZ) {
            return;
        }
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.FIXED);
        c2123408ToLIZ.LIZJ = 1;
        c2123408ToLIZ.LIZIZ = "hybrid_security_monitor_csrf";
        CSRFClientExt cSRFClientExt = new CSRFClientExt(C823050WQl.LIZ(c2123408ToLIZ.LIZ()));
        this.LIZ = cSRFClientExt;
        WebViewHooker.LIZLLL(cSRFClientExt);
        SmartRouter.addInterceptor(new BostonGatewayInterceptor());
        this.LIZIZ = true;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJFF() throws Throwable {
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C2204961BRm.LJIIJJI(activityLJFF, new Intent("COM.PNS.LEAVE_THIRD_CONTAINER"), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS7ZpzbzjuZhVW9mcoFsmbIPp9mEocppcU=", null));
        }
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJIIJJI() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("consume_web_dfid_early", true);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final String[] LJIILLIIL() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C0X55.LIZIZ;
        String[] strArr2 = (String[]) settingsManagerLIZLLL.LJIIIIZZ("pns_inner_domains", String[].class, strArr);
        return strArr2 != null ? strArr2 : strArr;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final PnsSparkThirdHookModel LJIJ() {
        return C794280VDu.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJII() throws Throwable {
        C822490WOh.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZ(String str) {
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel pnsThirdBypassPathModelLIZ;
        List<String> list;
        PnsThirdBypassPathSettings.LIZ.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(host);
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0X55 c0x55 = C0X55.LIZ;
        if (str == null) {
            str = "";
        }
        c0x55.getClass();
        if (!C0X55.LIZ(str) || (pnsThirdBypassPathModelLIZ = PnsThirdBypassPathSettings.LIZ()) == null || (list = pnsThirdBypassPathModelLIZ.thirdInitialPage) == null) {
            return false;
        }
        for (String str2 : list) {
            if (a0.LJJIIZI(str2, "/", false)) {
                if (u.LJJIIJZLJL(strLIZIZ, str2, false)) {
                    return true;
                }
            } else {
                if (u.LJJIIJZLJL(str2, e3.d, false)) {
                    if (!u.LJIIZILJ(host, str2, false)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('.');
                        sbLIZ2.append(host);
                        if (Intrinsics.LJFF(str2, C2188811AlT.LIZIZ(sbLIZ2))) {
                        }
                    }
                    return true;
                }
                if (!Intrinsics.LJFF(str2, host)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append('/');
                    if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ3), strLIZIZ)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl.LIZIZ(java.lang.String):boolean");
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LIZJ(String str) {
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel pnsThirdBypassPathModelLIZ;
        List<String> list;
        PnsThirdBypassPathSettings.PnsThirdBypassPathModel pnsThirdBypassPathModelLIZ2;
        List<String> list2;
        PnsThirdBypassPathSettings.LIZ.getClass();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        String host = uri.getHost();
        if (host == null) {
            host = "";
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(host);
        sbLIZ.append(path);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0X55 c0x55 = C0X55.LIZ;
        if (str == null) {
            str = "";
        }
        c0x55.getClass();
        if (!C0X55.LIZ(str) && (pnsThirdBypassPathModelLIZ2 = PnsThirdBypassPathSettings.LIZ()) != null && (list2 = pnsThirdBypassPathModelLIZ2.firstJump) != null) {
            for (String str2 : list2) {
                if (u.LJJIIJZLJL(str2, "/", false) && u.LJJIIJZLJL(path, str2, false)) {
                    break;
                }
            }
            pnsThirdBypassPathModelLIZ = PnsThirdBypassPathSettings.LIZ();
            return pnsThirdBypassPathModelLIZ == null ? false : false;
        }
        pnsThirdBypassPathModelLIZ = PnsThirdBypassPathSettings.LIZ();
        if (pnsThirdBypassPathModelLIZ == null && (list = pnsThirdBypassPathModelLIZ.firstJump) != null) {
            for (String str3 : list) {
                if (a0.LJJIIZI(str3, "/", false)) {
                    if (u.LJJIIJZLJL(strLIZIZ, str3, false)) {
                    }
                } else {
                    if (u.LJJIIJZLJL(str3, e3.d, false)) {
                        if (!u.LJIIZILJ(host, str3, false)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append('.');
                            sbLIZ2.append(host);
                            if (Intrinsics.LJFF(str3, C2188811AlT.LIZIZ(sbLIZ2))) {
                            }
                        }
                    }
                    if (Intrinsics.LJFF(str3, host)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJ(String str) {
        C0X55.LIZ.getClass();
        return C0X55.LIZ(str);
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final ExecutorService LJI(final ExecutorService executorService) {
        return new ExecutorService(executorService) { // from class: X.0WOZ
            public final ExecutorService LL;

            @Override // java.util.concurrent.ExecutorService
            public final boolean isShutdown() {
                return this.LL.isShutdown();
            }

            @Override // java.util.concurrent.ExecutorService
            public final boolean isTerminated() {
                return this.LL.isTerminated();
            }

            @Override // java.util.concurrent.ExecutorService
            public final void shutdown() {
                this.LL.shutdown();
            }

            @Override // java.util.concurrent.ExecutorService
            public final List<Runnable> shutdownNow() {
                return this.LL.shutdownNow();
            }

            {
                this.LL = executorService;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.LL.execute(new ARunnableS82S0200000_13(runnable, new HashMap(C0WMX.LIZ().LIZ), 46));
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
                return this.LL.invokeAll(collection);
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> T invokeAny(Collection<? extends Callable<T>> collection) {
                return (T) this.LL.invokeAny(collection);
            }

            @Override // java.util.concurrent.ExecutorService
            public final Future<?> submit(Runnable runnable) {
                return this.LL.submit(runnable);
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> Future<T> submit(Callable<T> callable) {
                return this.LL.submit(callable);
            }

            @Override // java.util.concurrent.ExecutorService
            public final boolean awaitTermination(long j, TimeUnit timeUnit) {
                return this.LL.awaitTermination(j, timeUnit);
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> Future<T> submit(Runnable runnable, T t) {
                return this.LL.submit(runnable, t);
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
                return this.LL.invokeAll(collection, j, timeUnit);
            }

            @Override // java.util.concurrent.ExecutorService
            public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
                return (T) this.LL.invokeAny(collection, j, timeUnit);
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJIIIIZZ(C822530WOl c822530WOl) {
        CSRFClientExt cSRFClientExt = this.LIZ;
        if (cSRFClientExt != null && cSRFClientExt.LIZLLL(c822530WOl)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final EnumC822460WOe LJIIIZ(String str) {
        PnsRuntimeDfIdMapping pnsRuntimeDfIdMapping = C822500WOi.LIZ;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PnsRuntimeDfIdMapping pnsRuntimeDfIdMapping2 = C822500WOi.LIZ;
        PnsRuntimeDfIdMapping pnsRuntimeDfIdMapping3 = (PnsRuntimeDfIdMapping) settingsManagerLIZLLL.LJIIIIZZ("pns_web_dfid_config", PnsRuntimeDfIdMapping.class, pnsRuntimeDfIdMapping2);
        if (pnsRuntimeDfIdMapping3 != null) {
            pnsRuntimeDfIdMapping2 = pnsRuntimeDfIdMapping3;
        }
        PnsWebDfIdConfigModel pnsWebDfIdConfigModel = pnsRuntimeDfIdMapping2.config;
        if (pnsWebDfIdConfigModel.cctSparkThirdList.contains(str)) {
            return EnumC822460WOe.CCT_DOWN_GRADE_SPARK_THIRD;
        }
        if (pnsWebDfIdConfigModel.cctSystemBrowserList.contains(str)) {
            return EnumC822460WOe.CCT_DOWN_GRADE_SYSTEM_BROWSER;
        }
        if (pnsWebDfIdConfigModel.thirdList.contains(str)) {
            return EnumC822460WOe.SPARK_THIRD;
        }
        if (pnsWebDfIdConfigModel.redirectList.contains(str)) {
            return EnumC822460WOe.SPARK_THIRD_REDIRECT;
        }
        if (pnsWebDfIdConfigModel.liveRedirectList.contains(str)) {
            return EnumC822460WOe.SPARK_THIRD_LIVE_REDIRECT;
        }
        PnsJsbBlockConfigModel pnsJsbBlockConfigModel = (PnsJsbBlockConfigModel) C821960WMg.LIZ(PnsJsbBlockConfigModel.class, "pns_jsb_block_config", C1201004mu.LIZ);
        if (pnsJsbBlockConfigModel == null) {
            pnsJsbBlockConfigModel = new PnsJsbBlockConfigModel(null, null, 3, null);
        }
        if (!pnsJsbBlockConfigModel.enable || (!pnsJsbBlockConfigModel.dfIdWhiteList.isEmpty() && pnsJsbBlockConfigModel.dfIdWhiteList.contains(str))) {
            return EnumC822460WOe.OLD_CONTAINER;
        }
        return EnumC822460WOe.UNKNOWN;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final int LJIILIIL(String str) {
        PnsJsbBlockConfigModel pnsJsbBlockConfigModel = (PnsJsbBlockConfigModel) C821960WMg.LIZ(PnsJsbBlockConfigModel.class, "pns_jsb_block_config", C1201004mu.LIZ);
        if (pnsJsbBlockConfigModel == null) {
            pnsJsbBlockConfigModel = new PnsJsbBlockConfigModel(null, null, 3, null);
        }
        for (Map.Entry<String, String> entry : pnsJsbBlockConfigModel.dfIdMapping.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), str)) {
                try {
                    return CastIntegerProtector.parseInt(entry.getValue());
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                        return 0;
                    }
                }
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final boolean LJIILJJIL(String str) {
        IClientSecurityService iClientSecurityService;
        C1EAZ.LIZ.getClass();
        if (TextUtils.isEmpty(str) || ((iClientSecurityService = (IClientSecurityService) PluggableExtentionKt.pluggableSpi$default(IClientSecurityService.class, false, false, false, 14, null)) != null && iClientSecurityService.LJIILL())) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        Object[] objArr = C1EAZ.LIZIZ;
        Object[] objArr2 = (Object[]) settingsManagerLIZLLL.LJIIIIZZ("pns_gpcp_domains", String[].class, objArr);
        if (objArr2 != null) {
            objArr = objArr2;
        }
        return !C1942007j8.LIZJ(uri, Arrays.asList(objArr));
    }

    @Override // com.ss.android.ugc.tiktok.security.IClientSecurityService
    public final void LJIIJ(Runnable runnable, ExecutorC822630WOv executorC822630WOv) {
        executorC822630WOv.execute(new ARunnableS82S0200000_13(runnable, new HashMap(C0WMX.LIZ().LIZ), 46));
    }
}
