package defpackage;

import X.AbstractC1538690q8x;
import X.C098200Yq;
import X.C131400em;
import X.C13LP;
import X.C13LQ;
import X.C1554510qYT;
import X.C189200o6;
import X.C19719512Dh;
import android.net.Uri;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class v8 extends AbstractC1538690q8x {
    public static final String[] LIZIZ = {"header", "headers"};
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"x.request", "x.downloadFile"});

    public static final class a {
    }

    public static String LJII(String str) {
        boolean z;
        Object c098200Yq;
        String lowerCase;
        boolean z2 = false;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            lowerCase = scheme.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        if (!Intrinsics.LJFF(lowerCase, "http") && !Intrinsics.LJFF(lowerCase, "https")) {
            return null;
        }
        String host = uri.getHost();
        if (host == null || a0.LJJJIL(host)) {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        return uri.buildUpon().encodedQuery(null).fragment(null).build().toString();
    }

    public static boolean LJIIIIZZ(String str) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            c098200Yq = UriProtector.parse(str).getHost();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null || a0.LJJJIL(str2)) {
            return false;
        }
        try {
            c098200Yq2 = Boolean.valueOf(Intrinsics.LJFF(NetworkDomainRecognize.domainIdentityRecognize(str2), "tt_1st"));
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = bool;
        }
        return ((Boolean) c098200Yq2).booleanValue();
    }

    @Override // X.AbstractC1538690q8x
    public final void LJ(SparkContext sparkContext, String str) {
        super.LJ(sparkContext, str);
        sparkContext.LJJJJZI(new C1554510qYT(sparkContext, this, 0));
    }

    public static void LJIIIZ(String str, String str2, Map map) {
        String strLJII;
        Map map2;
        if (C131400em.LIZ() && LJIIIIZZ(str) && (strLJII = LJII(str2)) != null) {
            for (String str3 : LIZIZ) {
                Object obj = map.get(str3);
                if (!C19719512Dh.LJII(obj) || (map2 = (Map) obj) == null) {
                    map2 = new HashMap();
                    map.put(str3, map2);
                }
                Set setKeySet = map2.keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : setKeySet) {
                    if (u.LJIJI((String) obj2, "x-tt-referer", true)) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it2 = C13LP.LLIIII(arrayList).iterator();
                while (it2.hasNext()) {
                    map2.remove(it2.next());
                }
                map2.put("x-tt-referer", strLJII);
            }
        }
    }

    public static void LJIIJ(String str, String str2, JSONObject jSONObject) throws JSONException {
        String strLJII;
        if (C131400em.LIZ() && LJIIIIZZ(str) && (strLJII = LJII(str2)) != null) {
            for (String str3 : LIZIZ) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str3);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                    jSONObject.put(str3, jSONObjectOptJSONObject);
                }
                ArrayList arrayList = new ArrayList();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (u.LJIJI(next, "x-tt-referer", true)) {
                        arrayList.add(next);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONObjectOptJSONObject.remove((String) it2.next());
                }
                jSONObjectOptJSONObject.put("x-tt-referer", strLJII);
            }
        }
    }
}
