package com.ss.android.ugc.aweme.search.pages.result.photosearch.repo;

import X.C0X52;
import X.C1494590ozp;
import X.C1494600ozq;
import X.C2175508fh;
import X.InterfaceC1201180hMa;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class SearchPhotoInterceptor implements InterfaceC1904907d9 {
    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        try {
            Request request = ((C1494590ozp) interfaceC841770X0l).LIZJ;
            Object obj = null;
            if (request == null) {
                return null;
            }
            C0X52<?> c0x52LIZ = ((C1494590ozp) interfaceC841770X0l).LIZ(request);
            T t = c0x52LIZ.LIZIZ;
            C2175508fh c2175508fh = c0x52LIZ.LIZ;
            if (c2175508fh != null) {
                obj = c2175508fh.LJFF;
            }
            if ((t instanceof InterfaceC1201180hMa) && (obj instanceof C1494600ozq)) {
                ((InterfaceC1201180hMa) t).setRequestInfo((C1494600ozq) obj);
            }
            return c0x52LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
            return c1494590ozp.LIZ(c1494590ozp.LIZJ);
        }
    }
}
