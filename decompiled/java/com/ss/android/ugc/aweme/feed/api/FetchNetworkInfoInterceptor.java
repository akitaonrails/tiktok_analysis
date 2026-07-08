package com.ss.android.ugc.aweme.feed.api;

import X.C0X52;
import X.C0XLJ;
import X.C0XPJ;
import X.C0XPK;
import X.C0XPL;
import X.C1494590ozp;
import X.C1494600ozq;
import X.C2175508fh;
import X.C2276411E8h;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public final class FetchNetworkInfoInterceptor implements InterfaceC1904907d9 {
    public volatile boolean LL;
    public volatile int LLILLJJLI;

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        String url;
        int i;
        String url2;
        String url3;
        int i2 = 1;
        Object obj = null;
        try {
            Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
            C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            if (!C0XLJ.LIZ(request)) {
                return c0x52LIZ;
            }
            C2175508fh c2175508fh = c0x52LIZ.LIZ;
            if (c2175508fh != null) {
                obj = c2175508fh.LJFF;
            }
            if (obj instanceof C1494600ozq) {
                long j = ((C1494600ozq) obj).LJ;
                if (j <= 0) {
                    return c0x52LIZ;
                }
                if (request != null && (url3 = request.getUrl()) != null && a0.LJJIIZI(url3, "first_retry", false)) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (this.LL && request != null && (url2 = request.getUrl()) != null && a0.LJJIIZI(url2, "pull_type=0", false)) {
                    this.LL = false;
                    this.LLILLJJLI = 0;
                    i += this.LLILLJJLI;
                }
                Integer numValueOf = Integer.valueOf(i);
                if (request != null) {
                    request.getUrl();
                }
                C0XPJ.LIZ.putIfAbsent(Long.valueOf(j), new C0XPL(numValueOf));
                T t = c0x52LIZ.LIZIZ;
                if (t instanceof C0XPK) {
                    ((C0XPK) t).setNetworkInfoKey(Long.valueOf(j));
                    return c0x52LIZ;
                }
            } else {
                C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "FetchNetworkInfoInterceptor", "isn't BaseHttpRequestInfo:" + obj);
            }
            return c0x52LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Request request2 = ((C1494590ozp) interfaceC841770X0l).LIZJ;
            if (C0XLJ.LIZ(request2) && request2 != null && (url = request2.getUrl()) != null && a0.LJJIIZI(url, "is_cold_start=1", false)) {
                this.LL = true;
                if (a0.LJJIIZI(url, "first_retry", false)) {
                    i2 = 2;
                }
                this.LLILLJJLI = i2;
            }
            throw th;
        }
    }
}
