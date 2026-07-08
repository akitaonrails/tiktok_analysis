package com.bytedance.hybrid.spark.prefetch;

import X.C098200Yq;
import X.C13LP;
import X.C1540210qBP;
import X.C189200o6;
import X.C1946707jt;
import X.C20107413lw;
import X.C2188811AlT;
import X.C443120HZe;
import X.InterfaceC20108013m2;
import X.InterfaceC2373909Rx;
import Y.ARunnableS32S1200000_30;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes31.dex */
public final class PrefetchService {
    public static final PrefetchService INSTANCE = new PrefetchService();
    public static final AtomicBoolean isCacheUsed = new AtomicBoolean(false);
    public static final HashSet<String> routerUriSet = new HashSet<>();

    private final String assembleUrl(Uri uri) {
        boolean z;
        String strLIZ = C1946707jt.LIZ(uri, "channel");
        String strLIZ2 = C1946707jt.LIZ(uri, "bundle");
        boolean z2 = false;
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (strLIZ2 == null || strLIZ2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                Uri.Builder builder = new Uri.Builder();
                Uri.Builder builderAuthority = builder.scheme(uri.getScheme()).authority("prefetch");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(strLIZ);
                sbLIZ.append('/');
                sbLIZ.append(strLIZ2);
                builderAuthority.path(C2188811AlT.LIZIZ(sbLIZ)).query(uri.getQuery());
                return builder.toString();
            }
        }
        String strLIZ3 = C1946707jt.LIZ(uri, "surl");
        if (strLIZ3 == null) {
            strLIZ3 = C1946707jt.LIZ(uri, "url");
        }
        String string = "";
        if (strLIZ3 == null) {
            return "";
        }
        try {
            Uri.Builder builderBuildUpon = UriProtector.parse(strLIZ3).buildUpon();
            builderBuildUpon.query(uri.getQuery());
            string = builderBuildUpon.toString();
            return string;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return string;
        }
    }

    private final void prefetch(String str) {
        Object c098200Yq;
        String authority;
        String strAssembleUrl;
        List listLJJLIIIJILLIZJL;
        InterfaceC20108013m2 interfaceC20108013m2LIZIZ;
        int iHashCode;
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
        if (uri != null && !tryPrefetchByCache(C20107413lw.LJFF, str, uri)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                String scheme = uri.getScheme();
                if (scheme == null || ((iHashCode = scheme.hashCode()) == 3213448 ? !scheme.equals("http") : !(iHashCode == 99617003 && scheme.equals("https")))) {
                    String authority2 = uri.getAuthority();
                    if ((authority2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(authority2, new String[]{"_"}, 0, 6)) != null && (authority = (String) C13LP.LJJJLL(listLJJLIIIJILLIZJL)) != null) || (authority = uri.getAuthority()) != null) {
                        int iHashCode2 = authority.hashCode();
                        if (iHashCode2 != -1772600516) {
                            if (iHashCode2 != -1202757124) {
                                if (iHashCode2 != 1224424441 || !authority.equals("webview")) {
                                    return;
                                }
                            } else if (!authority.equals("hybrid")) {
                                return;
                            }
                        } else if (!authority.equals("lynxview")) {
                            return;
                        }
                        strAssembleUrl = assembleUrl(uri);
                        if (!(!a0.LJJJIL(strAssembleUrl))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    strAssembleUrl = uri.toString();
                }
                if (strAssembleUrl != null && (interfaceC20108013m2LIZIZ = C20107413lw.LIZIZ(strAssembleUrl)) != null) {
                    interfaceC20108013m2LIZIZ.LIZJ(strAssembleUrl);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("start prefetch:");
                    sbLIZ.append(strAssembleUrl);
                    sbLIZ.append(", with time cost:");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void prefetchWhenLoad(String str) {
        if (!routerUriSet.remove(str)) {
            prefetch(str);
        }
    }

    public final void prefetchWhenNavigate(String str) {
        routerUriSet.add(str);
        prefetch(str);
    }

    private final boolean tryPrefetchByCache(C1540210qBP c1540210qBP, String str, Uri uri) {
        Executor executor;
        InterfaceC2373909Rx interfaceC2373909Rx;
        String strLIZ;
        String strLIZ2;
        if (c1540210qBP == null || isCacheUsed.get() || (executor = C1540210qBP.LIZIZ) == null || (interfaceC2373909Rx = C1540210qBP.LIZJ) == null) {
            return false;
        }
        String str2 = c1540210qBP.LIZ.LIZ;
        if (!a0.LJJIIZI(str, str2, false) && (((strLIZ = C1946707jt.LIZ(uri, "url")) == null || !a0.LJJIIZI(strLIZ, str2, false)) && ((strLIZ2 = C1946707jt.LIZ(uri, "surl")) == null || !a0.LJJIIZI(strLIZ2, str2, false)))) {
            return false;
        }
        StringBuilder sb = new StringBuilder(c1540210qBP.LIZ.LIZIZ);
        sb.append('?');
        boolean z = true;
        for (Pair<String, String> pair : c1540210qBP.LIZ.LJFF) {
            String strLIZ3 = C1946707jt.LIZ(uri, pair.getFirst());
            if (strLIZ3 == null) {
                return false;
            }
            if (!z) {
                sb.append('&');
            } else {
                z = false;
            }
            String second = pair.getSecond();
            if (second == null) {
                second = pair.getFirst();
            }
            sb.append(second);
            sb.append('=');
            sb.append(strLIZ3);
        }
        if (!isCacheUsed.compareAndSet(false, true)) {
            return false;
        }
        for (Pair<String, String> pair2 : c1540210qBP.LIZ.LJI) {
            if (!z) {
                sb.append('&');
            } else {
                z = false;
            }
            sb.append(pair2.getFirst());
            sb.append('=');
            sb.append(pair2.getSecond());
        }
        String string = sb.toString();
        C20107413lw.LJ = new C443120HZe<>(c1540210qBP.LIZ.LIZIZ, Long.valueOf(System.currentTimeMillis()), null);
        executor.execute(new ARunnableS32S1200000_30(c1540210qBP, interfaceC2373909Rx, string, 0));
        return true;
    }
}
