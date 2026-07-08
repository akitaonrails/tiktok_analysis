package com.ss.android.ugc.tiktok.pipo.saas.hostimpl;

import X.InterfaceC1547600qNK;
import X.InterfaceC1547640qNO;
import X.InterfaceC1713880uhW;
import X.InterfaceC1713900uhY;
import X.InterfaceC1714080uhq;
import X.InterfaceC1716910umP;
import X.InterfaceC1721020ut2;
import X.InterfaceC1722160uus;
import X.InterfaceC1722330uv9;
import X.InterfaceC1722400uvG;
import X.InterfaceC1723340uwm;
import X.InterfaceC1723760uxS;
import X.InterfaceC1724730uz1;
import X.InterfaceC1954907lD;
import X.InterfaceC790140Uz6;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebView;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.geckox.GeckoGlobalConfig;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS109S1200000_26;
import kotlin.jvm.internal.AwS461S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoDefaultHostServiceInitializer implements InterfaceC1954907lD {
    @Override // X.InterfaceC1954907lD
    public <T> T createService(Class<T> cls) {
        if (Intrinsics.LJFF(cls, InterfaceC1722160uus.class)) {
            return (T) new InterfaceC1722160uus() { // from class: X.0uzB
                @Override // X.InterfaceC1722160uus
                public final String LJIIIIZZ() {
                    return "";
                }

                @Override // X.InterfaceC1722160uus
                public final boolean LJIILLIIL() {
                    return false;
                }

                @Override // X.InterfaceC1722160uus
                public final int getAppId() {
                    return 123456;
                }

                @Override // X.InterfaceC1722160uus
                public final String getAppName() {
                    return "pipo_saas";
                }

                @Override // X.InterfaceC1722160uus
                public final String getChannel() {
                    return "unknown";
                }

                @Override // X.InterfaceC1722160uus
                public final String getDeviceId() {
                    return null;
                }

                @Override // X.InterfaceC1722160uus
                public final String getStoreRegionUpperCase() {
                    return null;
                }

                @Override // X.InterfaceC1722160uus
                public final void isDebug() {
                }

                @Override // X.InterfaceC1722160uus
                public final void isLocalTest() {
                }

                @Override // X.InterfaceC1722160uus
                public final void isOffline() {
                }

                @Override // X.InterfaceC1722160uus
                public final InterfaceC1722140uuq LJIIZILJ() {
                    return new InterfaceC1722140uuq() { // from class: X.0uzD
                        @Override // X.InterfaceC1722140uuq
                        public final int LIZ(Context context) {
                            return 0;
                        }

                        @Override // X.InterfaceC1722140uuq
                        public final int LIZIZ(Context context) {
                            return 0;
                        }
                    };
                }

                @Override // X.InterfaceC1722160uus
                public final Application getApplication() {
                    return new Application();
                }

                @Override // X.InterfaceC1722160uus
                public final C1723470uwz getVersionInfo() {
                    return new C1723470uwz("1.0", 1L, 1L, "1.0");
                }

                @Override // X.InterfaceC1722160uus
                public final Context getApplicationContext() {
                    return C786410Ut5.M3(getApplication());
                }

                @Override // X.InterfaceC1722160uus
                public final InterfaceC1724930uzL LJIIIZ(Context context) {
                    return new InterfaceC1724930uzL() { // from class: X.0uzC
                        @Override // X.InterfaceC1724930uzL
                        public final InterfaceC1724930uzL LIZ(CharSequence charSequence) {
                            return this;
                        }

                        @Override // X.InterfaceC1724930uzL
                        public final void show() {
                        }
                    };
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1713900uhY.class)) {
            return (T) new InterfaceC1713900uhY() { // from class: X.0uyt
                @Override // X.InterfaceC1713900uhY
                public final String getAppLanguage() {
                    return "";
                }

                @Override // X.InterfaceC1713900uhY
                public final String getCurrentLocaleStr(Context context) {
                    return "";
                }

                @Override // X.InterfaceC1713900uhY
                public final Locale LJIIL(Context context) {
                    return new Locale("");
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1721020ut2.class)) {
            return (T) new InterfaceC1721020ut2() { // from class: X.0uvl
                @Override // X.InterfaceC1721020ut2
                public final void LJIILIIL(C1718380uom c1718380uom) {
                }

                @Override // X.InterfaceC1721020ut2
                public final void LJIJ(Intent intent) {
                }

                @Override // X.InterfaceC1721020ut2
                public final void LJIJJ(WebView webView) {
                }

                @Override // X.InterfaceC1721020ut2
                public final void appendDataFlowId(Intent intent, String str) {
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1547600qNK.class)) {
            return (T) new InterfaceC1547600qNK() { // from class: X.0qT1
                @Override // X.InterfaceC1547600qNK
                public final void LJIJI(String str, String str2) {
                }

                @Override // X.InterfaceC1547600qNK
                public final InterfaceC1538820q9A LJIJJLI(C1537480q70 c1537480q70) {
                    return null;
                }

                @Override // X.InterfaceC1547600qNK
                public final InterfaceC1504290pFT LJJ() {
                    return null;
                }

                @Override // X.InterfaceC1547600qNK
                public final String getGeckoHost() {
                    return "";
                }

                @Override // X.InterfaceC1547600qNK
                public final C0VSJ LJIL() {
                    return new C0VSJ("");
                }

                @Override // X.InterfaceC1547600qNK
                public final GeckoGlobalConfig.ENVType getGeckoEnvironment() {
                    return GeckoGlobalConfig.ENVType.PROD;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1722330uv9.class)) {
            return (T) new InterfaceC1722330uv9() { // from class: X.0uys
                @Override // X.InterfaceC1722330uv9
                public final String getCurrentRegionCode() {
                    return "";
                }

                @Override // X.InterfaceC1722330uv9
                public final String getPriorityRegion() {
                    return "";
                }

                @Override // X.InterfaceC1722330uv9
                public final String getRegion() {
                    return "";
                }

                @Override // X.InterfaceC1722330uv9
                public final String getSimCountry() {
                    return "";
                }

                @Override // X.InterfaceC1722330uv9
                public final String getStoreRegionUpperCase() {
                    return null;
                }

                @Override // X.InterfaceC1722330uv9
                public final String getSysRegion() {
                    return "";
                }

                @Override // X.InterfaceC1722330uv9
                public final Locale LJFF(Context context) {
                    return new Locale("");
                }

                @Override // X.InterfaceC1722330uv9
                public final void LJII(String str, String str2, String str3, String str4, String str5, AwS109S1200000_26 awS109S1200000_26, AwS461S0200000_26 awS461S0200000_26) {
                    awS461S0200000_26.invoke(-1, "Not implemented");
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1713880uhW.class)) {
            return (T) new InterfaceC1713880uhW() { // from class: X.0uyr
                @Override // X.InterfaceC1713880uhW
                public final void LJIIJ(int i, String str, String str2) {
                }

                @Override // X.InterfaceC1713880uhW
                public final String getIid() {
                    return null;
                }

                @Override // X.InterfaceC1713880uhW
                public final void onEventV3(String str, Map<String, String> map) {
                }

                @Override // X.InterfaceC1713880uhW
                public final void onEventV3(String str, JSONObject jSONObject) {
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1547640qNO.class)) {
            return (T) new InterfaceC1547640qNO() { // from class: X.0pXE
                @Override // X.InterfaceC1547640qNO
                public final InterfaceC1717730unj createBuilder(final String str) {
                    return new InterfaceC1717730unj() { // from class: X.0pXD
                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC1717730unj LIZ(InterfaceC1904907d9 interfaceC1904907d9) {
                            return this;
                        }

                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC1717730unj LIZIZ(NetworkPartner networkPartner) {
                            return this;
                        }

                        @Override // X.InterfaceC1717730unj
                        public final InterfaceC836110Wr3 build() {
                            return new InterfaceC836110Wr3(str) { // from class: X.0pX3
                                public final String LIZ;

                                {
                                    this.LIZ = str;
                                }

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
                                @Override // X.InterfaceC836110Wr3
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final <T> T create(java.lang.Class<T> r8) throws java.lang.Throwable {
                                    /*
                                        r7 = this;
                                        X.0pX4 r6 = new X.0pX4
                                        r6.<init>()
                                        java.lang.String r0 = r7.LIZ
                                        r6.LIZLLL(r0)
                                        com.ss.android.ugc.aweme.net.settings.PayLoadControl r0 = X.C0X15.LIZ()
                                        boolean r0 = r0.enable
                                        r5 = 0
                                        java.lang.String r3 = "dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS4ao/BkiGkQFo4N+Alj+6iWowm+keLKMyS3e5PIRRWcRMkTnU5DjF5pxS1Oxz21PCVhqZov81cPEyr+fwx"
                                        r4 = 0
                                        if (r0 == 0) goto L4f
                                        com.bytedance.common.utility.reflect.Reflect r2 = com.bytedance.common.utility.reflect.Reflect.on(r6)     // Catch: java.lang.Throwable -> L4b
                                        java.lang.String r1 = "clientProvider"
                                        java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L4b
                                        com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L4b
                                        java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L4b
                                        X.0p0G r0 = (X.InterfaceC1494860p0G) r0     // Catch: java.lang.Throwable -> L4b
                                        X.0oyU r2 = r0.get()     // Catch: java.lang.Throwable -> L4b
                                        java.lang.String r1 = "com.ss.android.ugc.aweme.app.api.OkClient"
                                        java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L4b
                                        java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L4b
                                        boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L4b
                                        if (r0 != 0) goto L41
                                        boolean r0 = r2 instanceof X.C1493780oyW     // Catch: java.lang.Throwable -> L4b
                                        if (r0 != 0) goto L41
                                        goto L4f
                                    L41:
                                        X.0WZX r0 = new X.0WZX     // Catch: java.lang.Throwable -> L4b
                                        r0.<init>(r3, r5)     // Catch: java.lang.Throwable -> L4b
                                        com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r6, r0)     // Catch: java.lang.Throwable -> L4b
                                        goto L80
                                    L4b:
                                        r0 = move-exception
                                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                                    L4f:
                                        X.0WZX r0 = new X.0WZX
                                        r0.<init>(r3, r5)
                                        com.bytedance.retrofit2.Retrofit r3 = X.C2204961BRm.LLLLIIIILLL(r6, r0)
                                        java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                                        if (r1 == 0) goto L80
                                        com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor r0 = new com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor
                                        r0.<init>()
                                        r1.add(r0)
                                        java.util.List<X.07d9> r0 = r3.LJIIIIZZ
                                        java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
                                        X.07d9 r2 = (X.InterfaceC1904907d9) r2
                                        java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                                        com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor
                                        r0.<init>(r2)
                                        com.bytedance.mt.protector.impl.collections.ListProtector.set(r1, r4, r0)
                                        java.util.List<X.07d9> r1 = r3.LJIIIIZZ
                                        com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor r0 = new com.ss.android.ugc.aweme.net.interceptor.LastRequestInterceptor
                                        r0.<init>()
                                        r1.add(r0)
                                    L80:
                                        java.lang.Object r0 = r3.LIZ(r8)
                                        return r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C1515190pX3.create(java.lang.Class):java.lang.Object");
                                }
                            };
                        }
                    };
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1714080uhq.class)) {
            return (T) new InterfaceC1714080uhq() { // from class: X.0uyy
                @Override // X.InterfaceC1714080uhq
                public final boolean enableBoe() {
                    return false;
                }

                @Override // X.InterfaceC1714080uhq
                public final boolean enablePpe() {
                    return false;
                }

                @Override // X.InterfaceC1714080uhq
                public final InterfaceC1714090uhr LJIILJJIL() {
                    return new InterfaceC1714090uhr() { // from class: X.0uyz
                        @Override // X.InterfaceC1714090uhr
                        public final InterfaceC1904907d9 getNetworkInterceptor() {
                            return null;
                        }
                    };
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1716910umP.class)) {
            return (T) new InterfaceC1716910umP() { // from class: X.0uyw
                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc LIZJ() {
                    return null;
                }

                @Override // X.InterfaceC1716910umP
                public final AbstractC1387200mCc getTop() {
                    return null;
                }

                @Override // X.InterfaceC1716910umP
                public final Activity getTopActivity() {
                    return null;
                }

                @Override // X.InterfaceC1716910umP
                public final Activity getValidTopActivity() {
                    return null;
                }

                @Override // X.InterfaceC1716910umP
                public final boolean isAppBackGround() {
                    return false;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1722400uvG.class)) {
            return (T) new InterfaceC1722400uvG() { // from class: X.0uvL
                @Override // X.InterfaceC1722400uvG
                public final String getUid() {
                    return null;
                }

                @Override // X.InterfaceC1722400uvG
                public final List<C1722410uvH> LJIIJJI(Context context) {
                    return C13BV.INSTANCE;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1724730uz1.class)) {
            return (T) new InterfaceC1724730uz1() { // from class: X.0uyx
                @Override // X.InterfaceC1724730uz1
                public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC790140Uz6.class)) {
            return (T) new InterfaceC790140Uz6() { // from class: X.0Uz8
                @Override // X.InterfaceC790140Uz6
                public final void LIZ(Context context, String str, String str2, Function1<? super String, Unit> function1) {
                }

                @Override // X.InterfaceC790140Uz6
                public final boolean shouldShowMall2TabOrTopTab() {
                    return false;
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1723340uwm.class)) {
            return (T) new InterfaceC1723340uwm() { // from class: X.0uz0
                @Override // X.InterfaceC1723340uwm
                public final void LJI(C19EG c19eg) {
                }
            };
        }
        if (Intrinsics.LJFF(cls, InterfaceC1723760uxS.class)) {
            return (T) new InterfaceC1723760uxS() { // from class: X.0uyu
                @Override // X.InterfaceC1723760uxS
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC1723760uxS
                public final void LJIILL(C1723700uxM c1723700uxM, InterfaceC202062144m interfaceC202062144m) {
                }

                @Override // X.InterfaceC1723760uxS
                public final boolean checkPluginInstalled(String str) {
                    return false;
                }

                @Override // X.InterfaceC1723760uxS
                public final InterfaceC1723770uxT LIZLLL() {
                    return new InterfaceC1723770uxT() { // from class: X.0uyv
                        @Override // X.InterfaceC1723770uxT
                        public final void LIZ(String str, boolean z) {
                        }

                        @Override // X.InterfaceC1723770uxT
                        public final void splitCompatInstall(Context context) {
                        }
                    };
                }
            };
        }
        return null;
    }
}
