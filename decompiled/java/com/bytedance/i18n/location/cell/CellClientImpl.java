package com.bytedance.i18n.location.cell;

import X.C098200Yq;
import X.C0TFZ;
import X.C0WZX;
import X.C1164704h3;
import X.C1208460hYK;
import X.C1216920hly;
import X.C13BV;
import X.C1798560wu6;
import X.C1798570wu7;
import X.C1798600wuA;
import X.C183400nA;
import X.C185100nR;
import X.C189200o6;
import X.C2204961BRm;
import android.os.SystemClock;
import android.telephony.CellInfo;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.i18n.location.api.CellClient;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class CellClientImpl implements CellClient {
    public C1798560wu6 LIZIZ;

    @Override // com.bytedance.i18n.location.api.CellClient
    public final C1164704h3 LJIIIIZZ(C1216920hly c1216920hly) throws JSONException {
        String strCertToken;
        int iIntValue;
        String upperCase;
        Object c098200Yq;
        String strInvoke;
        String upperCase2;
        String strInvoke2;
        C0TFZ c0tfz;
        Cert cert;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1798560wu6 c1798560wu6 = this.LIZIZ;
        if (c1798560wu6 == null || !c1798560wu6.LIZIZ) {
            return null;
        }
        if (c1216920hly == null || (c0tfz = c1216920hly.LIZ) == null || (cert = c0tfz.LIZIZ) == null || (strCertToken = cert.certToken()) == null) {
            strCertToken = "no_cert";
        }
        C1208460hYK.LIZLLL(strCertToken, "Cell", "precise");
        Function0<Integer> function0 = c1798560wu6.LJFF;
        if (function0 != null) {
            iIntValue = function0.invoke().intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue < c1798560wu6.LIZLLL) {
            LJIJJLI(-3001, strCertToken, "fail", SystemClock.uptimeMillis() - jUptimeMillis, "no_permission");
            C185100nR c185100nR = C185100nR.LIZ;
            C185100nR c185100nR2 = C185100nR.LIZ;
            C183400nA.LIZ(-102, "no permission", -1L, null);
            return null;
        }
        Function0<String> function02 = c1798560wu6.LJI;
        String str = "";
        if (function02 == null || (strInvoke2 = function02.invoke()) == null || (upperCase = strInvoke2.toUpperCase(Locale.ROOT)) == null) {
            upperCase = "";
        }
        Function0<String> function03 = c1798560wu6.LJII;
        if (function03 != null && (strInvoke = function03.invoke()) != null && (upperCase2 = strInvoke.toUpperCase(Locale.ROOT)) != null) {
            str = upperCase2;
        }
        boolean z = false;
        for (C1798570wu7 c1798570wu7 : c1798560wu6.LIZJ) {
            if (Intrinsics.LJFF(c1798570wu7.LIZ, upperCase) && (c1798570wu7.LIZIZ.contains(str) || c1798570wu7.LIZIZ.isEmpty())) {
                z = true;
            }
        }
        if (upperCase.length() != 0 && str.length() != 0 && z) {
            C1798600wuA c1798600wuA = new C1798600wuA(c1798560wu6.LIZ, c1798560wu6);
            try {
                List<? extends CellInfo> listLLIIJI = C2204961BRm.LLIIJI(c1798600wuA.LIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNkhfzW/n6j/Z/iztcg==", null));
                if (listLLIIJI == null) {
                    listLLIIJI = C13BV.INSTANCE;
                }
                Pair<List<String>, Map<String, Integer>> pairLIZIZ = c1798600wuA.LIZIZ(listLLIIJI);
                c098200Yq = new C1164704h3(pairLIZIZ.getFirst(), pairLIZIZ.getSecond());
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = null;
            }
            C1164704h3 c1164704h3 = (C1164704h3) c098200Yq;
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            if (c1164704h3 != null && !c1164704h3.LIZ.isEmpty()) {
                LJIJJLI(0, strCertToken, "success", jUptimeMillis2, null);
                C185100nR c185100nR3 = C185100nR.LIZ;
                C183400nA.LIZ(0, "success", Long.valueOf(jUptimeMillis2), c1164704h3.LIZIZ);
                return c1164704h3;
            }
            LJIJJLI(-999, strCertToken, "fail", jUptimeMillis2, "unknown");
            C185100nR c185100nR4 = C185100nR.LIZ;
            Long lValueOf = Long.valueOf(jUptimeMillis2);
            C185100nR c185100nR5 = C185100nR.LIZ;
            C183400nA.LIZ(-101, "cell list empty", lValueOf, null);
            return null;
        }
        LJIJJLI(-2001, strCertToken, "fail", SystemClock.uptimeMillis() - jUptimeMillis, "region_blocked");
        C185100nR c185100nR6 = C185100nR.LIZ;
        C185100nR c185100nR7 = C185100nR.LIZ;
        C183400nA.LIZ(-104, "region not match", -1L, null);
        return null;
    }

    @Override // com.bytedance.i18n.location.api.CellClient
    public final void LJIILIIL(C1798560wu6 c1798560wu6) {
        this.LIZIZ = c1798560wu6;
    }

    public static void LJIJJLI(int i, String str, String str2, long j, String str3) {
        C1208460hYK.LIZJ(j, str, "Cell", null, "precise", i, str2, false, str3);
    }
}
