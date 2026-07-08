package com.ss.android.ugc.aweme.plugin.retry;

import X.C09HQ;
import X.C0CR1;
import X.C0X52;
import X.C0XIR;
import X.C1493620oyG;
import X.C1494160oz8;
import X.C1494590ozp;
import X.C1494690ozz;
import X.C20684815ws;
import X.C2344009Gk;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public final class RetryNetworkInterceptor implements InterfaceC1904907d9 {
    public static boolean LLILLL;
    public static int LLILZIL;
    public static int LLILZLL;
    public static final RetryNetworkInterceptor LL = new RetryNetworkInterceptor();
    public static NetworkRetryConfig LLILLJJLI = new NetworkRetryConfig(null, null, null, null, null, 31, null);
    public static RetryStrategy LLILZ = RetryStrategy.NO_RETRY;

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494160oz8 c1493620oyG;
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        if (LLILZ.getRetry()) {
            String strLJJJLL = a0.LJJJLL("/", request.getPath().toLowerCase(Locale.ROOT));
            List<String> list = LLILLJJLI.endpoints;
            if (list != null && !list.isEmpty()) {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (u.LJIIZILJ(strLJJJLL, a0.LJJJLL("/", it2.next().toLowerCase(Locale.ROOT)), false)) {
                        String path = request.getPath();
                        if (LLILZLL > 0) {
                            request.getPath();
                            Object extraInfo = request.getExtraInfo();
                            if (extraInfo == null || (extraInfo instanceof C1494160oz8)) {
                                if (!(extraInfo instanceof C1494160oz8) || (c1493620oyG = (C1494160oz8) extraInfo) == null) {
                                    c1493620oyG = new C1493620oyG();
                                }
                                if (extraInfo == null) {
                                    request.setExtraInfo(c1493620oyG);
                                }
                                long j = LLILZLL;
                                c1493620oyG.LIZJ = j;
                                c1493620oyG.LIZLLL = j;
                                c1493620oyG.LJ = j;
                                c1493620oyG.LJIIIIZZ = 0L;
                            }
                        }
                        return LIZIZ(0, path, c1494590ozp);
                    }
                }
            }
        }
        return c1494590ozp.LIZ(request);
    }

    public static C0X52 LIZIZ(int i, String str, C1494590ozp c1494590ozp) throws Exception {
        try {
            if (LLILZ.getDelay() && i > 0) {
                Thread.sleep(LLILZ.getDelay(LLILLJJLI, i));
            }
            C0X52 c0x52LIZ = c1494590ozp.LIZ(c1494590ozp.LIZJ);
            if (!c0x52LIZ.LIZJ() && i < LLILZIL) {
                return LIZIZ(i + 1, str, c1494590ozp);
            }
            LIZ(i, LLILZ, c0x52LIZ.LIZJ(), null, str);
            return c0x52LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if ((!(e instanceof EOFException) && !(e instanceof C09HQ) && !(e instanceof C0CR1) && !(e instanceof C1494690ozz) && !(e instanceof IOException) && ((e instanceof C0XIR) || (e instanceof InterruptedException))) || i >= LLILZIL) {
                LIZ(i, LLILZ, false, e, str);
                throw e;
            }
            return LIZIZ(i + 1, str, c1494590ozp);
        }
    }

    public static void LIZ(int i, RetryStrategy retryStrategy, boolean z, Exception exc, String str) {
        String simpleName;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("endpoint", str);
        c2344009Gk.LIZJ(z ? 1 : 0, "success");
        if (exc != null) {
            simpleName = exc.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        c2344009Gk.LJIIIIZZ("error_type", simpleName);
        c2344009Gk.LJIIIIZZ("strategy", retryStrategy.name().toLowerCase(Locale.ROOT));
        c2344009Gk.LIZJ(i, "attempts");
        C20684815ws.LJIILLIIL("network_retry_complete", c2344009Gk.LIZ);
    }
}
