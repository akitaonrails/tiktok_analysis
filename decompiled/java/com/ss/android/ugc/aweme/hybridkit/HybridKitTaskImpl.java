package com.ss.android.ugc.aweme.hybridkit;

import X.C01GW;
import X.C098200Yq;
import X.C0CCZ;
import X.C0X2A;
import X.C1058920df8;
import X.C1058970dfD;
import X.C1524240ple;
import X.C1533280q0E;
import X.C1535740q4C;
import X.C1535830q4L;
import X.C1535860q4O;
import X.C1536220q4y;
import X.C1536230q4z;
import X.C1537400q6s;
import X.C1537480q70;
import X.C1537540q76;
import X.C1543000qFu;
import X.C1543890qHL;
import X.C1545700qKG;
import X.C189200o6;
import X.C1942307jB;
import X.C21395818oG;
import X.C2188811AlT;
import X.C2213981Bky;
import X.C2222691Bz1;
import X.C452501pT;
import X.C667530QGh;
import X.EnumC1299500jvA;
import X.EnumC668160QIs;
import X.InterfaceC1059000dfG;
import X.InterfaceC1163110gNB;
import X.InterfaceC1538820q9A;
import X.InterfaceC1539390qA5;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.lynx.service.LynxServiceInitializer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.task.HybridInfoInitTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitInitTask;
import com.ss.android.ugc.aweme.hybridkit.task.HybridKitInitWebKitTask;
import com.ss.android.ugc.aweme.hybridkit.task.SSCInitTask;
import com.ss.android.ugc.aweme.hybridkit.task.SSPInitTask;
import com.ss.android.ugc.aweme.hybridkit.task.SparkLynxPrefetchConfigTask;
import com.ss.android.ugc.aweme.hybridkit.task.WebViewStartChromiumTask;
import com.ss.android.ugc.aweme.hybridkit.task.WebViewWarmUpTask;
import com.ss.android.ugc.aweme.settings.SparkWebViewWarmUpConfig;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class HybridKitTaskImpl implements IHybridKitService {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1536220q4y());
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LJ() {
        WebViewWarmUpTask.LL.getClass();
        return WebViewWarmUpTask.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIIJ() {
        return new HybridKitInitWebKitTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIIL() {
        C1537400q6s c1537400q6s = C1537400q6s.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1537400q6s.getClass();
        C1537400q6s.LIZIZ = jCurrentTimeMillis;
        return WebViewStartChromiumTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIILIIL() {
        return new HybridKitConfigTask();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIILJJIL() {
        C1535740q4C c1535740q4CLLILII;
        C1535860q4O c1535860q4O;
        String str = HybridKitConfigTask.LL;
        String str2 = null;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (c1535740q4CLLILII = iSparkHostApi.LLILII()) != null && (c1535860q4O = c1535740q4CLLILII.LIZIZ) != null) {
            str2 = c1535860q4O.LIZ;
        }
        ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        C1535740q4C c1535740q4CLLILII2 = iSparkHostApi2 != null ? iSparkHostApi2.LLILII() : null;
        String str3 = C0X2A.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        C1533280q0E.LJ(str2, c1535740q4CLLILII2, str3.toLowerCase(Locale.ENGLISH));
        C1533280q0E.LJIIIIZZ(C1533280q0E.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final InterfaceC1163110gNB LJIILL() {
        return new C21395818oG();
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final boolean LJIILLIIL() {
        WebViewStartChromiumTask.LL.getClass();
        return WebViewStartChromiumTask.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIJ() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJIJJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final EnumC668160QIs LJIJJLI() {
        HybridKitInitTask.LL.getClass();
        return HybridKitInitTask.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final int LJJI() {
        WebViewStartChromiumTask.LL.getClass();
        if (!WebViewStartChromiumTask.LIZ() || SparkWebViewWarmUpConfig.LIZ() <= 0) {
            return SparkWebViewWarmUpConfig.LIZ();
        }
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJII() {
        return SSCInitTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIIZILJ() {
        return HybridKitInitTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIJI() {
        return HybridInfoInitTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJIJJ() {
        return SSPInitTask.LL;
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final C0CCZ LJJ() {
        return SparkLynxPrefetchConfigTask.LL;
    }

    public static C1536230q4z LJJIFFI(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new C1536230q4z(false, null);
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false)) {
            Uri uriLJ = C1537540q76.LJ(str);
            String host = uriLJ.getHost();
            if (host == null) {
                host = "";
            }
            if (a0.LJJIIZI(host, "webview", false)) {
                return new C1536230q4z(true, C1942307jB.LIZIZ(uriLJ, "url"));
            }
            return new C1536230q4z(false, null);
        }
        return new C1536230q4z(true, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r12) {
        /*
            r11 = this;
            X.0q4z r4 = LJJIFFI(r12)
            boolean r0 = r4.LIZ
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L22
            java.lang.Class<com.ss.android.ugc.aweme.spark.ISparkHostApi> r5 = com.ss.android.ugc.aweme.spark.ISparkHostApi.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.spark.ISparkHostApi r0 = (com.ss.android.ugc.aweme.spark.ISparkHostApi) r0
            if (r0 != 0) goto L24
            return r6
        L22:
            r1 = 0
            goto L39
        L24:
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r2 = r0.LLIIJI()
            if (r2 == 0) goto L22
            java.lang.String r1 = r4.LIZIZ
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            X.0q4w r0 = X.EnumC1536200q4w.THIRD_INITIAL_PAGE_BYPASS
            boolean r0 = r2.LLJZIJLIL(r1, r0)
            if (r0 != r3) goto L22
            r1 = 1
        L39:
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L40
            if (r1 == 0) goto L40
            return r3
        L40:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LIZ(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r12) {
        /*
            r11 = this;
            X.0q4z r4 = LJJIFFI(r12)
            boolean r0 = r4.LIZ
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L22
            java.lang.Class<com.ss.android.ugc.aweme.spark.ISparkHostApi> r5 = com.ss.android.ugc.aweme.spark.ISparkHostApi.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.spark.ISparkHostApi r0 = (com.ss.android.ugc.aweme.spark.ISparkHostApi) r0
            if (r0 != 0) goto L24
            return r6
        L22:
            r1 = 0
            goto L39
        L24:
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r2 = r0.LLIIJI()
            if (r2 == 0) goto L22
            java.lang.String r1 = r4.LIZIZ
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            X.0q4w r0 = X.EnumC1536200q4w.SINGLE_PAGE_BYPASS
            boolean r0 = r2.LLJZIJLIL(r1, r0)
            if (r0 != r3) goto L22
            r1 = 1
        L39:
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L40
            if (r1 == 0) goto L40
            return r3
        L40:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LIZIZ(java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.lang.String r12) {
        /*
            r11 = this;
            X.0q4z r4 = LJJIFFI(r12)
            boolean r0 = r4.LIZ
            r3 = 1
            r6 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r4.LIZIZ
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L22
            java.lang.Class<com.ss.android.ugc.aweme.spark.ISparkHostApi> r5 = com.ss.android.ugc.aweme.spark.ISparkHostApi.class
            r9 = 14
            r10 = 0
            r7 = r6
            r8 = r6
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.spark.ISparkHostApi r0 = (com.ss.android.ugc.aweme.spark.ISparkHostApi) r0
            if (r0 != 0) goto L24
            return r6
        L22:
            r1 = 0
            goto L39
        L24:
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r2 = r0.LLIIJI()
            if (r2 == 0) goto L22
            java.lang.String r1 = r4.LIZIZ
            if (r1 != 0) goto L30
            java.lang.String r1 = ""
        L30:
            X.0q4w r0 = X.EnumC1536200q4w.FIRST_JUMP_BYPASS
            boolean r0 = r2.LLJZIJLIL(r1, r0)
            if (r0 != r3) goto L22
            r1 = 1
        L39:
            boolean r0 = r4.LIZ
            if (r0 == 0) goto L40
            if (r1 == 0) goto L40
            return r3
        L40:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LIZJ(java.lang.String):boolean");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0dfY] */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final InterfaceC1538820q9A LJFF(C1537480q70 c1537480q70) {
        C1058970dfD c1058970dfD = new C1058970dfD(new InterfaceC1059000dfG() { // from class: X.0dfY
            @Override // X.InterfaceC1059000dfG
            public final boolean LIZ(String str) {
                return true;
            }

            @Override // X.InterfaceC1059000dfG
            public final boolean LIZIZ(C650250Pex c650250Pex) {
                return true;
            }
        }, false, 2);
        c1537480q70.LJJ(C1543000qFu.class, c1058970dfD);
        return C1058920df8.LIZ.LIZ(c1058970dfD);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJI(InterfaceC1539390qA5 interfaceC1539390qA5) {
        HybridKitInitTask.LL.getClass();
        ((ArrayList) HybridKitInitTask.LLILLL).remove(interfaceC1539390qA5);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIIIZ(C667530QGh c667530QGh) {
        HybridKitInitTask.LL.getClass();
        ((ArrayList) HybridKitInitTask.LLILLL).add(c667530QGh);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final synchronized void LJIIJJI(boolean z) {
        Object c098200Yq;
        String strLIZ;
        String str;
        C1535830q4L c1535830q4LLJJLIIIJL;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (z || (iSparkHostApi != null && iSparkHostApi.LJLIIL() && !this.LIZIZ.get())) {
            try {
                C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                C1524240ple c1524240ple = new C1524240ple(c2213981Bky.getApplication());
                c1524240ple.LJ = String.valueOf(c2213981Bky.getAppId());
                c1524240ple.LJFF = c2213981Bky.LIZJ();
                String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
                if (strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId.length() == 0) {
                    c1524240ple.LJIIIIZZ = CardStruct.IStatusCode.DEFAULT;
                } else {
                    c1524240ple.LJIIIIZZ = strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId;
                }
                c1524240ple.LJII = String.valueOf(c2213981Bky.getUpdateVersionCode());
                c1524240ple.LJIIIZ = "https://mon-va.byteoversea.com";
                c1524240ple.LJI = c2213981Bky.getChannel();
                ((Boolean) this.LIZ.getValue()).booleanValue();
                if (iSparkHostApi == null || iSparkHostApi.LLIL() == null || (strLIZ = C2222691Bz1.LIZ()) == null) {
                    strLIZ = "";
                }
                c1524240ple.LIZLLL = strLIZ;
                if (iSparkHostApi == null || (c1535830q4LLJJLIIIJL = iSparkHostApi.LJJLIIIJL()) == null || (str = c1535830q4LLJJLIIIJL.LIZ) == null) {
                    str = "";
                }
                c1524240ple.LIZIZ = str;
                if (iSparkHostApi != null) {
                    iSparkHostApi.LJJLIIIJL();
                }
                c1524240ple.LIZJ = "offlineX";
                c1524240ple.LJIIJJI = true;
                c1524240ple.LJIIL = EnumC1299500jvA.GLOBAL;
                LynxServiceInitializer.INSTANCE.initialize(c1524240ple.LIZ());
                c098200Yq = Integer.valueOf(Log.i("HybridKit", "LynxService init"));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initLynxService failed, ");
                sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("HybridKit", C2188811AlT.LIZIZ(sbLIZ));
            }
            C1543890qHL.LIZ.LIZ();
            this.LIZIZ.set(true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x00ae, TryCatch #0 {all -> 0x00ae, blocks: (B:3:0x0001, B:5:0x000e, B:7:0x0016, B:10:0x0026, B:13:0x002e, B:16:0x0033, B:22:0x0041, B:24:0x0047, B:27:0x004c, B:31:0x0057, B:33:0x005b, B:35:0x0061, B:38:0x0066, B:43:0x0075, B:45:0x0083, B:49:0x0092, B:55:0x00a8), top: B:60:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            r15 = this;
            r10 = 0
            X.0q4z r1 = LJJIFFI(r16)     // Catch: java.lang.Throwable -> Lae
            X.0q4z r6 = LJJIFFI(r17)     // Catch: java.lang.Throwable -> Lae
            boolean r4 = r1.LIZ     // Catch: java.lang.Throwable -> Lae
            r3 = 1
            if (r4 == 0) goto L72
            java.lang.String r0 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lae
            boolean r0 = X.C1533950q1J.LJ(r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L72
            java.lang.Class<com.ss.android.ugc.aweme.spark.ISparkHostApi> r9 = com.ss.android.ugc.aweme.spark.ISparkHostApi.class
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r9 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lae
            com.ss.android.ugc.aweme.spark.ISparkHostApi r9 = (com.ss.android.ugc.aweme.spark.ISparkHostApi) r9     // Catch: java.lang.Throwable -> Lae
            if (r9 != 0) goto L26
            return r10
        L26:
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r5 = r9.LLIIJI()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r7 = ""
            if (r5 == 0) goto L3c
            java.lang.String r2 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lae
            if (r2 != 0) goto L33
            r2 = r7
        L33:
            X.0q4w r0 = X.EnumC1536200q4w.ISOLATED_WEBVIEW     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r5.LLJZIJLIL(r2, r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 != r3) goto L3c
            goto L3e
        L3c:
            r8 = 0
            goto L3f
        L3e:
            r8 = 1
        L3f:
            if (r18 != 0) goto L56
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r2 = r9.LLIIJI()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L56
            java.lang.String r1 = r1.LIZIZ     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L4c
            r1 = r7
        L4c:
            X.0q4w r0 = X.EnumC1536200q4w.SINGLE_PAGE_BYPASS     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r2.LLJZIJLIL(r1, r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 != r3) goto L56
            r5 = 1
            goto L57
        L56:
            r5 = 0
        L57:
            boolean r0 = r6.LIZ     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.spark.SparkHostApiImpl r1 = r9.LLIIJI()     // Catch: java.lang.Throwable -> Lae
            if (r1 == 0) goto L70
            java.lang.String r0 = r6.LIZIZ     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L66
            r7 = r0
        L66:
            X.0q4w r0 = X.EnumC1536200q4w.THIRD_INITIAL_PAGE_BYPASS     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r1.LLJZIJLIL(r7, r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 != r3) goto L70
            r2 = 1
            goto L75
        L70:
            r2 = 0
            goto L75
        L72:
            r5 = 0
            r2 = 0
            r8 = 0
        L75:
            X.01GW r0 = r15.LIZ     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> Lae
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L90
            java.lang.String r1 = "spark_disable_third_party_isolation"
            android.content.SharedPreferences r0 = X.C1537570q79.LIZ()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.getBoolean(r1, r10)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L90
            return r10
        L90:
            if (r4 == 0) goto La8
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "spark_webview_third_isolation"
            r1.getClass()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto La8
            if (r8 == 0) goto La8
            if (r2 != 0) goto La8
            if (r5 != 0) goto La8
            r10 = 1
        La8:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lae
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lae
            return r10
        Lae:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl.LJIIIIZZ(java.lang.String, java.lang.String, boolean):boolean");
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LIZLLL(Context context, String str, String str2, Bundle bundle) {
        C1545700qKG.LIZ(context, str, str2, bundle, null);
    }

    @Override // com.ss.android.ugc.aweme.hybridkit.IHybridKitService
    public final void LJIL(Context context, String str, String str2, Bundle bundle, ThirdPartyBizCert thirdPartyBizCert) {
        C1545700qKG.LIZ(context, str, str2, bundle, thirdPartyBizCert);
    }
}
