package com.ss.android.ugc.aweme.compliance.consent;

import X.C08Q1;
import X.C098200Yq;
import X.C0PEM;
import X.C0WSU;
import X.C0WSV;
import X.C0WZW;
import X.C189200o6;
import X.C1915720zx4;
import X.C202094145s;
import X.C20684815ws;
import X.C23250099c;
import X.C687440Qxq;
import X.C817503Hh;
import X.C825890WaZ;
import X.C826560Wbe;
import X.C848230XPh;
import X.EnumC1876780ywG;
import X.EnumC683800Qry;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class PNSBeforeConsentActionInvoker implements C0WSV {
    public static volatile boolean consentApproved;
    public static volatile boolean primed;
    public static final C826560Wbe Companion = new Object() { // from class: X.0Wbe
    };
    public static final C0WSU PASS = new C0WSU(false, null);
    public static final C825890WaZ isInvoking = new ThreadLocal<Boolean>() { // from class: X.0WaZ
        @Override // java.lang.ThreadLocal
        public final Boolean initialValue() {
            return Boolean.FALSE;
        }
    };
    public static final AtomicBoolean primingScheduled = new AtomicBoolean(false);

    @Override // X.C0WSV
    public String name() {
        return "PNSBeforeConsentActionInvoker";
    }

    @Override // X.C0WSV
    public void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C0WZW c0wzw, boolean z) {
    }

    private final C0WSU doPreInvoke(int i, String str, String str2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        if (consentApproved) {
            return PASS;
        }
        try {
            c098200Yq = Boolean.valueOf(C08Q1.LIZJ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        if (!((Boolean) c098200Yq).booleanValue()) {
            try {
                c098200Yq2 = Boolean.valueOf(C848230XPh.LL.LJFF());
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Boolean bool2 = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = bool2;
            }
            if (!((Boolean) c098200Yq2).booleanValue()) {
                if (C202094145s.LJIIL == 0) {
                    return PASS;
                }
                Object obj = null;
                if (!primed) {
                    if (primingScheduled.compareAndSet(false, true)) {
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C687440Qxq(null), 2);
                    }
                    return PASS;
                }
                try {
                    C1915720zx4 c1915720zx4 = C1915720zx4.LIZ;
                    String key = EnumC683800Qry.DEVICE_CONSENT.getKey();
                    c1915720zx4.getClass();
                    c098200Yq3 = C1915720zx4.LIZ(key, null);
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq3)) {
                    obj = c098200Yq3;
                }
                if (obj == EnumC1876780ywG.APPROVE) {
                    consentApproved = true;
                    return PASS;
                }
                if (obj == null) {
                    return PASS;
                }
                if (obj == EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE) {
                    return PASS;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    if (str == null) {
                        str = "unknown";
                    }
                    sb.append(str);
                    sb.append('#');
                    if (str2 == null) {
                        str2 = "unknown";
                    }
                    sb.append(str2);
                    String string = sb.toString();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("blocked_api", string);
                    jSONObject.put("blocked_api_id", i);
                    jSONObject.put("blocked_topic", "before_consent");
                    C20684815ws.LJIJ("blocked_by_pns", jSONObject);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                }
                return PASS;
            }
        }
        return PASS;
    }

    @Override // X.C0WSV
    public C0WSU preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C0WZW c0wzw) {
        C825890WaZ c825890WaZ = isInvoking;
        if (c825890WaZ.get().booleanValue()) {
            return PASS;
        }
        c825890WaZ.set(Boolean.TRUE);
        try {
            C0WSU c0wsuDoPreInvoke = doPreInvoke(i, str, str2);
            c825890WaZ.set(Boolean.FALSE);
            return c0wsuDoPreInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            isInvoking.set(Boolean.FALSE);
            throw th;
        }
    }
}
