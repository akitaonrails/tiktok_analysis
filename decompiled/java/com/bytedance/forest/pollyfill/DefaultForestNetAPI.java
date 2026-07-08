package com.bytedance.forest.pollyfill;

import X.AbstractC1522670pj7;
import X.AbstractC1522680pj8;
import X.AbstractC1522730pjD;
import X.C0X9O;
import X.C0X9S;
import X.C1493620oyG;
import X.C1494430ozZ;
import X.C1494690ozz;
import X.C1515120pWw;
import X.C1522600pj0;
import X.C1522660pj6;
import X.C1534070q1V;
import X.C2097608Jq;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2174608fY;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import X.InterfaceC2177008fw;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public final class DefaultForestNetAPI extends AbstractC1522670pj7 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX INFO: loaded from: classes14.dex */
    public interface NetApi {
        @InterfaceC2174608fY
        @InterfaceC1501160pAQ
        C0X9S<TypedInput> doGet(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC2177008fw Object obj);

        @C0X9O
        C0X9S<Void> doHead(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map, @InterfaceC2177008fw Object obj);
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522730pjD LIZLLL(AbstractC1522680pj8 abstractC1522680pj8) throws Exception {
        String message;
        boolean z;
        C1522660pj6 c1522660pj6;
        C1522660pj6 c1522660pj62;
        int iIntValue = 499;
        try {
            NetApi netApi = (NetApi) C1515120pWw.LJIIIZ(NetApi.class, abstractC1522680pj8.LIZ);
            String str = abstractC1522680pj8.LIZ;
            Map<String, String> mapLJ = abstractC1522680pj8.LJ;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            C1493620oyG c1493620oyG = new C1493620oyG();
            long j = abstractC1522680pj8.LIZLLL;
            c1493620oyG.LIZJ = j;
            c1493620oyG.LIZLLL = j;
            c1493620oyG.LJIIIZ = true;
            if (ForestExperiment.INSTANCE.getFollowTTNetRedirect() && (abstractC1522680pj8 instanceof C1522660pj6) && (c1522660pj62 = (C1522660pj6) abstractC1522680pj8) != null && c1522660pj62.LJIIIIZZ) {
                z = true;
            } else {
                z = false;
            }
            c1493620oyG.LJIILLIIL = z;
            C0X9S<TypedInput> c0x9sDoGet = netApi.doGet(str, mapLJ, c1493620oyG);
            if (c0x9sDoGet != null) {
                if ((abstractC1522680pj8 instanceof C1522660pj6) && (c1522660pj6 = (C1522660pj6) abstractC1522680pj8) != null) {
                    c1522660pj6.LJII = c0x9sDoGet;
                }
                return new C1522600pj0(c0x9sDoGet.execute().LIZ, abstractC1522680pj8);
            }
            final String str2 = "create response failed";
            throw new Exception(str2) { // from class: X.0pj4
                public final String LL;

                @Override // java.lang.Throwable
                public String getMessage() {
                    return this.LL;
                }

                {
                    this.LL = str2;
                }
            };
        } catch (C1494430ozZ e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numValueOf = Integer.valueOf(e.getStatusCode());
            if (numValueOf.intValue() != 0) {
                iIntValue = numValueOf.intValue();
            }
            HashMap map = new HashMap();
            try {
                message = e.getErrorResponse();
                if (message == null) {
                    message = e.getMessage();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                message = e.getMessage();
            }
            return new C1522600pj0(iIntValue, map, abstractC1522680pj8, message);
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            Integer numValueOf2 = Integer.valueOf(e2.getStatusCode());
            if (numValueOf2.intValue() != 0) {
                iIntValue = numValueOf2.intValue();
            } else {
                Integer numValueOf3 = Integer.valueOf(e2.getCronetInternalErrorCode());
                if (numValueOf3.intValue() != 0) {
                    iIntValue = numValueOf3.intValue();
                }
            }
            return new C1522600pj0(iIntValue, new HashMap(), abstractC1522680pj8, e2.getMessage());
        }
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522680pj8 LIZIZ(WebResourceRequest webResourceRequest, C1534070q1V c1534070q1V) {
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders == null) {
            requestHeaders = new HashMap<>();
        }
        return new C1522660pj6(c1534070q1V, requestHeaders);
    }

    @Override // X.AbstractC1522670pj7
    public final AbstractC1522680pj8 LIZJ(C1534070q1V c1534070q1V, Map<String, String> map) {
        return new C1522660pj6(c1534070q1V, map);
    }
}
