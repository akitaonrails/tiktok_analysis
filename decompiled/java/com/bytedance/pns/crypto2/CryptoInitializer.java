package com.bytedance.pns.crypto2;

import X.C08VJ;
import X.C08VK;
import X.C08VP;
import X.C092I;
import X.C092J;
import X.C092M;
import X.C092N;
import X.C092O;
import X.C092P;
import X.C092R;
import X.C098200Yq;
import X.C0VCZ;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pns.crypto2.CryptoInitializer;
import com.bytedance.pns.crypto2.network.RequestContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class CryptoInitializer {
    public static final /* synthetic */ int LJFF = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final C092P LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public static native int iesCheckDecryptResult();

    public static native RequestContext iesCreate(int i, boolean z);

    public static native byte[] iesNegotiate(long j, byte[] bArr, byte[] bArr2, int i);

    static {
        try {
            LoadSoLancet.LIZJ("pns_crypto");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("pns_crypto");
            LoadSoLancet.LJ(jUptimeMillis, "pns_crypto");
            LoadSoLancet.LIZLLL(jUptimeMillis, "pns_crypto");
            LoadSoLancet.LIZIZ("pns_crypto");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LIZJ(String str) {
        int iLastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(",", 3);
        if (strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[1]) || (iLastIndexOf = strArrSplit[1].lastIndexOf(58)) <= 0) {
            return null;
        }
        return strArrSplit[1].substring(0, iLastIndexOf);
    }

    public static void LIZLLL(Throwable th, C092O c092o) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Network error: ");
        sbLIZ.append(th.getMessage());
        c092o.accept(new C092R(-100, C2188811AlT.LIZIZ(sbLIZ)));
    }

    public final void LIZIZ(String str, boolean z) {
        C092N c092n;
        String strLIZJ = LIZJ(str);
        C08VJ c08vjLIZ = C08VP.LIZ.LIZ(this.LJ, z);
        if (c08vjLIZ != null) {
            synchronized (c08vjLIZ) {
                try {
                    C08VK c08vk = c08vjLIZ.LIZIZ;
                    if (!c08vk.LJ && C08VK.LIZIZ(strLIZJ) && strLIZJ.equals(c08vk.LIZ)) {
                        c092n = new C092N(new C08VK(null, null, c08vk.LIZJ, 0L, c08vk.LIZLLL, false), true);
                    } else {
                        c092n = new C092N(c08vk, false);
                    }
                    c08vjLIZ.LIZIZ = c092n.LIZ;
                    if (c092n.LIZIZ) {
                        c08vjLIZ.LIZIZ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJ(int i, long j, C092O c092o, String str, boolean z) throws JSONException {
        int iLastIndexOf = str.lastIndexOf(58);
        if (iLastIndexOf == -1) {
            C092I.LIZLLL(-104, z ? 1 : 0, i, System.currentTimeMillis() - j, "post", "");
            c092o.accept(new C092R(-101, "Response format error"));
            return;
        }
        String strSubstring = str.substring(0, iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        C08VJ c08vjLIZ = C08VP.LIZ.LIZ(this.LJ, z);
        if (c08vjLIZ != null) {
            synchronized (c08vjLIZ) {
                try {
                    C08VK c08vk = c08vjLIZ.LIZIZ;
                    if (!C08VK.LIZ(strSubstring, strSubstring2)) {
                        c08vk.getClass();
                    } else {
                        String str2 = c08vk.LIZJ;
                        String str3 = c08vk.LIZLLL;
                        if (c08vk.LJ && C08VK.LIZ(c08vk.LIZ, c08vk.LIZIZ)) {
                            str2 = c08vk.LIZ;
                            str3 = c08vk.LIZIZ;
                        }
                        long j2 = c08vk.LJFF;
                        c08vk = c08vk;
                        C08VK c08vk2 = new C08VK(strSubstring, strSubstring2, str2, j2, str3, false);
                    }
                    c08vjLIZ.LIZIZ = c08vk;
                    c08vjLIZ.LIZIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C092I.LIZLLL(0, z ? 1 : 0, i, System.currentTimeMillis() - j, "post", "");
        c092o.accept(new C092R(0, "success"));
    }

    public final void LJII(final int i, final long j, final C092O c092o, final String str, final boolean z) {
        Object c098200Yq;
        C092P c092p = this.LIZJ;
        final int i2 = z ? 1 : 0;
        InterfaceC1631620sYq interfaceC1631620sYq = new InterfaceC1631620sYq() { // from class: X.092H
            @Override // X.InterfaceC1631620sYq
            public final Object invoke(Object obj, Object obj2, Object obj3) throws JSONException {
                boolean z2;
                int iIntValue;
                CryptoInitializer cryptoInitializer = this.LL;
                int i3 = i;
                String str2 = str;
                boolean z3 = z;
                long j2 = j;
                C092O c092o2 = c092o;
                int i4 = i2;
                Integer num = (Integer) obj;
                String str3 = (String) obj2;
                Throwable th = (Throwable) obj3;
                int i5 = CryptoInitializer.LJFF;
                cryptoInitializer.getClass();
                if (th != null) {
                    if (i3 <= 3) {
                        cryptoInitializer.LJII(i3 + 1, j2, c092o2, str2, z3);
                        return null;
                    }
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = -9999;
                    }
                    cryptoInitializer.LIZIZ(str2, z3);
                    C092I.LJFF(iIntValue, i4, i3, System.currentTimeMillis() - j2);
                    CryptoInitializer.LIZLLL(th, c092o2);
                    return null;
                }
                if (str3 != null) {
                    try {
                        C092J c092jLIZ = C092J.LIZ(str3);
                        if (c092jLIZ != null) {
                            if (c092jLIZ.LIZ == 0 && TextUtils.equals(c092jLIZ.LIZIZ, "success")) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                String strLIZJ = CryptoInitializer.LIZJ(str2);
                                C08VJ c08vjLIZ = C08VP.LIZ.LIZ(cryptoInitializer.LJ, z3);
                                if (c08vjLIZ != null) {
                                    synchronized (c08vjLIZ) {
                                        try {
                                            C08VM c08vmLIZJ = c08vjLIZ.LIZIZ.LIZJ(jCurrentTimeMillis, strLIZJ);
                                            c08vjLIZ.LIZIZ = c08vmLIZJ.LIZ;
                                            if (c08vmLIZJ.LIZIZ) {
                                                c08vjLIZ.LIZIZ();
                                            }
                                            z2 = c08vmLIZJ.LIZIZ;
                                        } finally {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                    if (z2) {
                                        C092I.LJFF(0, i4, i3, jCurrentTimeMillis - j2);
                                        c092o2.accept(new C092R(0, "success"));
                                        return null;
                                    }
                                }
                                C092I.LJFF(-108, i4, i3, jCurrentTimeMillis - j2);
                                c092o2.accept(new C092R(-108, "Stale validation response"));
                                return null;
                            }
                            cryptoInitializer.LIZIZ(str2, z3);
                            C092I.LJFF((-c092jLIZ.LIZ) - 300, i4, i3, System.currentTimeMillis() - j2);
                            int i6 = c092jLIZ.LIZ;
                            String str4 = c092jLIZ.LIZIZ;
                            if (str4 == null) {
                                str4 = "Unknown error";
                            }
                            c092o2.accept(new C092R(i6, str4));
                            return null;
                        }
                    } catch (Exception th2) {
                    }
                }
                cryptoInitializer.LIZIZ(str2, z3);
                C092I.LJFF(-102, i4, i3, System.currentTimeMillis() - j2);
                c092o2.accept(new C092R(-101, "Invalid server response"));
                return null;
            }
        };
        c092p.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cipher_text", str);
            c092p.LIZ.LIZ("key_agreement/api/v1/key_validation", C786410Ut5.J3(jSONObject), C2097608Jq.LJ(), interfaceC1631620sYq);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            interfaceC1631620sYq.invoke(-9999, null, thM5exceptionOrNullimpl);
        }
    }

    public final void LJI(int i, boolean z, String str, int i2, boolean z2, C092O<C092R> c092o) throws JSONException {
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C08VJ c08vjLIZ = C08VP.LIZ.LIZ(this.LJ, z2);
        if (c08vjLIZ != null) {
            synchronized (c08vjLIZ) {
                try {
                    j = c08vjLIZ.LIZIZ.LJFF;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            j = 0;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        if (!z2 ? j <= 0 || jCurrentTimeMillis2 >= this.LIZ || jCurrentTimeMillis2 < 0 : j <= 0 || jCurrentTimeMillis2 > this.LIZIZ || jCurrentTimeMillis2 < 0) {
            LJFF(iesCreate(i, z), z2, str, i2, 1, System.currentTimeMillis(), c092o);
            return;
        }
        C092I.LIZLLL(1, z2 ? 1 : 0, -1, System.currentTimeMillis() - jCurrentTimeMillis, "pre", "");
        c092o.accept(new C092R(1, "cache hit: cache is valid"));
    }

    public CryptoInitializer(Context context, String str, C092P c092p, C092M c092m, long j, long j2, boolean z) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZJ = c092p;
        this.LIZLLL = z ? 1 : 0;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LJ = str;
        C08VP.LIZJ(contextN3, str);
        C092I c092i = C092I.LIZ;
        AtomicBoolean atomicBoolean = C092I.LIZIZ;
        if (!atomicBoolean.get()) {
            synchronized (c092i) {
                try {
                    if (atomicBoolean.get()) {
                        return;
                    }
                    C092I.LIZJ = c092m;
                    C092I.LJ = BuildConfig.VERSION_NAME;
                    SDKMonitorUtils.setConfigUrl("751741", Collections.singletonList("https://mon.isnssdk.com/monitor/appmonitor/v4/settings/"));
                    SDKMonitorUtils.setDefaultReportUrl("751741", Collections.singletonList("https://mon.isnssdk.com/monitor/collect/"));
                    SDKMonitorUtils.initMonitor(C786410Ut5.N3(c092m.LIZ), "751741", C092I.LIZ(), new C0VCZ() { // from class: X.07Ri
                        @Override // X.C0VCZ
                        public final Map<String, String> getCommonParams() {
                            return C2097608Jq.LJIIJ(new Pair("oversea", "1"));
                        }

                        @Override // X.C0VCZ
                        public final String getSessionId() {
                            return "";
                        }
                    });
                    C092I.LIZLLL = SDKMonitorUtils.getInstance("751741");
                    atomicBoolean.set(true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJFF(final RequestContext requestContext, final boolean z, final String str, final int i, final int i2, final long j, final C092O<C092R> c092o) throws JSONException {
        Object c098200Yq;
        int i3;
        if (this.LIZJ != null && !TextUtils.isEmpty(str)) {
            if (requestContext == null) {
                C092I.LIZLLL(-106, z ? 1 : 0, i2, 0L, "pre", "");
                c092o.accept(new C092R(-106, "Invalid local request"));
                return;
            }
            C092P c092p = this.LIZJ;
            String requestBodyString = requestContext.getRequestBodyString();
            final int i4 = z ? 1 : 0;
            InterfaceC1631620sYq interfaceC1631620sYq = new InterfaceC1631620sYq() { // from class: X.092L
                @Override // X.InterfaceC1631620sYq
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    CryptoInitializer.LIZ(this.LL, i2, requestContext, z, str, i, j, c092o, i4, (Integer) obj, (String) obj2, (Throwable) obj3);
                    return null;
                }
            };
            c092p.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("request", requestBodyString);
                jSONObject.put("version", i);
                int i5 = 0;
                if (z) {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                jSONObject.put("key_type", i3);
                if (!z) {
                    i5 = 1;
                }
                jSONObject.put("sign_key_type", i5);
                c092p.LIZ.LIZ("key_agreement/api/v1/key_agreement", C786410Ut5.J3(jSONObject), C2097608Jq.LJ(), interfaceC1631620sYq);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                interfaceC1631620sYq.invoke(-9999, null, thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        C092I.LIZLLL(-107, z ? 1 : 0, i2, 0L, "pre", "");
        c092o.accept(new C092R(-106, "Invalid local request"));
    }

    public static void LIZ(CryptoInitializer cryptoInitializer, int i, RequestContext requestContext, boolean z, String str, int i2, long j, C092O c092o, int i3, Integer num, String str2, Throwable th) throws JSONException {
        int iIntValue;
        cryptoInitializer.getClass();
        if (th != null) {
            if (i <= 3) {
                cryptoInitializer.LJFF(requestContext, z, str, i2, i + 1, j, c092o);
                return;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -9999;
            }
            C092I.LIZLLL(iIntValue, i3, i, System.currentTimeMillis() - j, "key_agreement", th.getMessage());
            LIZLLL(th, c092o);
            return;
        }
        if (str2 != null) {
            try {
                C092J c092jLIZ = C092J.LIZ(str2);
                if (c092jLIZ != null) {
                    if (c092jLIZ.LIZ == 0 && TextUtils.equals(c092jLIZ.LIZIZ, "success")) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        try {
                            String string = JSONObjectProtectorUtils.getString(c092jLIZ.LIZJ, "response");
                            if (string.isEmpty()) {
                                C092I.LIZLLL(-104, z ? 1 : 0, i, System.currentTimeMillis() - jCurrentTimeMillis, "post", "");
                                c092o.accept(new C092R(-104, "No response field"));
                                return;
                            }
                            byte[] bArrDecode = Base64.decode(string, 2);
                            byte[] bArrDecode2 = Base64.decode(str, 2);
                            if (bArrDecode != null && bArrDecode.length != 0) {
                                byte[] bArrIesNegotiate = iesNegotiate(requestContext.getContextPtr(), bArrDecode, bArrDecode2, cryptoInitializer.LIZLLL);
                                if (bArrIesNegotiate != null) {
                                    cryptoInitializer.LJ(i, jCurrentTimeMillis, c092o, new String(bArrIesNegotiate, StandardCharsets.UTF_8), z);
                                    return;
                                }
                                int iIesCheckDecryptResult = iesCheckDecryptResult();
                                if (iIesCheckDecryptResult != 0) {
                                    iIesCheckDecryptResult = iIesCheckDecryptResult;
                                    C092I.LIZLLL(iIesCheckDecryptResult, z ? 1 : 0, i, System.currentTimeMillis() - jCurrentTimeMillis, "post", "");
                                }
                                c092o.accept(new C092R(-iIesCheckDecryptResult, "Can't decrypt eAppKey and appKey"));
                                return;
                            }
                            C092I.LIZLLL(-102, z ? 1 : 0, i, System.currentTimeMillis() - jCurrentTimeMillis, "post", "");
                            c092o.accept(new C092R(-104, "Base64 decoding failed for response"));
                            return;
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C092I.LIZLLL(-104, z ? 1 : 0, i, System.currentTimeMillis() - jCurrentTimeMillis, "post", "");
                            c092o.accept(new C092R(-104, "Response JSON parsing error"));
                            return;
                        }
                    }
                    C092I.LIZLLL(c092jLIZ.LIZ - 2000, i3, i, System.currentTimeMillis() - j, "key_agreement", "");
                    int i4 = c092jLIZ.LIZ;
                    String str3 = c092jLIZ.LIZIZ;
                    if (str3 == null) {
                        str3 = "Unknown error";
                    }
                    c092o.accept(new C092R(i4, str3));
                    return;
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        C092I.LIZLLL(-104, i3, i, System.currentTimeMillis() - j, "key_agreement", "");
        c092o.accept(new C092R(-101, "Invalid server response"));
    }
}
