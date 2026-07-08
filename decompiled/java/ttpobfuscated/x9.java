package ttpobfuscated;

import X.C0WZX;
import X.C1297210jrT;
import X.C1495510p1J;
import X.C1495520p1K;
import X.C1501920pBe;
import X.C2204961BRm;
import java.util.concurrent.TimeUnit;
import ttp.orbu.sdk.configuration.model.ServerAPIType;

/* JADX INFO: loaded from: classes24.dex */
public class x9 {
    public final e7 a() {
        return new e7();
    }

    public final g9 a(C1495520p1K c1495520p1K) {
        C1501920pBe c1501920pBe = new C1501920pBe();
        c1501920pBe.LIZIZ(ServerAPIType.LOGGING.getBaseUrl());
        c1501920pBe.LIZJ(c1495520p1K);
        c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
        return (g9) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null)).LIZIZ(g9.class);
    }

    public final j1 b(C1495520p1K c1495520p1K) {
        C1501920pBe c1501920pBe = new C1501920pBe();
        c1501920pBe.LIZIZ(ServerAPIType.CONFIGURATION.getBaseUrl());
        c1501920pBe.LIZJ(c1495520p1K);
        c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
        return (j1) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null)).LIZIZ(j1.class);
    }

    public final g9 c(C1495520p1K c1495520p1K) {
        C1501920pBe c1501920pBe = new C1501920pBe();
        c1501920pBe.LIZIZ(ServerAPIType.LOGGING.getBaseUrl());
        c1501920pBe.LIZJ(c1495520p1K);
        c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
        return (g9) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null)).LIZIZ(g9.class);
    }

    public final xa d(C1495520p1K c1495520p1K) {
        C1501920pBe c1501920pBe = new C1501920pBe();
        c1501920pBe.LIZIZ(ServerAPIType.PKI.getBaseUrl());
        c1501920pBe.LIZJ(c1495520p1K);
        c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
        return (xa) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null)).LIZIZ(xa.class);
    }

    public final jd e(C1495520p1K c1495520p1K) {
        C1501920pBe c1501920pBe = new C1501920pBe();
        c1501920pBe.LIZIZ(ServerAPIType.SAMPLING.getBaseUrl());
        c1501920pBe.LIZJ(c1495520p1K);
        c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
        return (jd) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null)).LIZIZ(jd.class);
    }

    public final C1495510p1J a(vd vdVar) {
        C1495510p1J c1495510p1J = new C1495510p1J();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c1495510p1J.connectTimeout(30000L, timeUnit);
        c1495510p1J.writeTimeout(30000L, timeUnit);
        c1495510p1J.readTimeout(30000L, timeUnit);
        c1495510p1J.addInterceptor(vdVar);
        c1495510p1J.addInterceptor(new e7());
        c1495510p1J.addInterceptor(new vb());
        return c1495510p1J;
    }

    public final C1495520p1K b(vd vdVar) {
        return C2204961BRm.k0(a(vdVar), new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null));
    }

    public final C1495520p1K a(vd vdVar, o1 o1Var) {
        C1495510p1J c1495510p1JA = a(vdVar);
        c1495510p1JA.addInterceptor(o1Var);
        return C2204961BRm.k0(c1495510p1JA, new C0WZX("YCtuUwA8StnfVEMkQVycPw==", null));
    }
}
