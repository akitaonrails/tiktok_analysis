package ttpobfuscated;

import X.C01GW;
import X.C09AY;
import X.C0WZX;
import X.C1297210jrT;
import X.C1495510p1J;
import X.C1495520p1K;
import X.C1501920pBe;
import X.C2204961BRm;
import X.C452501pT;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.init.TTPOrbuContext;

/* JADX INFO: loaded from: classes24.dex */
public final class l5 implements o9 {
    public volatile TTPOrbuContext a;
    public Context b;
    public final C01GW c = C452501pT.LIZIZ(e.a);
    public final C01GW d = C452501pT.LIZIZ(g.a);
    public final C01GW e = C452501pT.LIZIZ(new f());
    public final C01GW f = C452501pT.LIZIZ(new d());
    public final C01GW g = C452501pT.LIZIZ(new c());
    public final C01GW h = C452501pT.LIZIZ(b.a);
    public final C01GW i = C452501pT.LIZIZ(new a());
    public final C01GW j = C452501pT.LIZIZ(j.a);
    public final C01GW k = C452501pT.LIZIZ(new i());

    public final class a extends C09AY implements Function0<f0> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f0 invoke() {
            C1501920pBe c1501920pBe = new C1501920pBe();
            c1501920pBe.LIZIZ(ServerAPIType.CHALLENGE.getBaseUrl());
            c1501920pBe.LIZJ(l5.this.b());
            c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
            return (f0) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null)).LIZIZ(f0.class);
        }

        public a() {
            super(0);
        }
    }

    public final class b extends C09AY implements Function0<C1495520p1K> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1495520p1K invoke() {
            C1495510p1J c1495510p1J = new C1495510p1J();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1495510p1J.connectTimeout(30000L, timeUnit);
            c1495510p1J.writeTimeout(30000L, timeUnit);
            c1495510p1J.readTimeout(30000L, timeUnit);
            return C2204961BRm.k0(c1495510p1J, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null));
        }
    }

    public final class c extends C09AY implements Function0<j1> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1 invoke() {
            C1501920pBe c1501920pBe = new C1501920pBe();
            c1501920pBe.LIZIZ(ServerAPIType.CONFIGURATION.getBaseUrl());
            c1501920pBe.LIZJ(l5.this.d());
            c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
            return (j1) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null)).LIZIZ(j1.class);
        }

        public c() {
            super(0);
        }
    }

    public final class d extends C09AY implements Function0<C1495520p1K> {

        public final class a extends C09AY implements Function0<String> {
            public final /* synthetic */ l5 a;

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.a.v().getExtraInfo().optString("sandbox_rules_experiment_group");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l5 l5Var) {
                super(0);
                this.a = l5Var;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1495520p1K invoke() {
            C1495510p1J c1495510p1J = new C1495510p1J();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1495510p1J.connectTimeout(30000L, timeUnit);
            c1495510p1J.writeTimeout(30000L, timeUnit);
            c1495510p1J.readTimeout(30000L, timeUnit);
            c1495510p1J.addInterceptor(new wd(ServerAPIType.CONFIGURATION));
            c1495510p1J.addInterceptor(new e7());
            c1495510p1J.addInterceptor(new vb());
            c1495510p1J.addInterceptor(new p1(x3.a(l5.this.j()), new a(l5.this), x3.c(), "0.17.0"));
            return C2204961BRm.k0(c1495510p1J, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null));
        }

        public d() {
            super(0);
        }
    }

    public final class e extends C09AY implements Function0<KeyStore> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        public final KeyStore a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }

        @Override // kotlin.jvm.functions.Function0
        public KeyStore invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }
    }

    public final class f extends C09AY implements Function0<z8> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z8 invoke() {
            C1501920pBe c1501920pBe = new C1501920pBe();
            c1501920pBe.LIZIZ(ServerAPIType.LOGGING.getBaseUrl());
            c1501920pBe.LIZJ(l5.this.g());
            c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
            return (z8) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null)).LIZIZ(z8.class);
        }

        public f() {
            super(0);
        }
    }

    public final class g extends C09AY implements Function0<C1495520p1K> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1495520p1K invoke() {
            C1495510p1J c1495510p1J = new C1495510p1J();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1495510p1J.connectTimeout(30000L, timeUnit);
            c1495510p1J.writeTimeout(30000L, timeUnit);
            c1495510p1J.readTimeout(30000L, timeUnit);
            c1495510p1J.addInterceptor(new wd(ServerAPIType.LOGGING));
            c1495510p1J.addInterceptor(new e7());
            c1495510p1J.addInterceptor(new vb());
            return C2204961BRm.k0(c1495510p1J, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null));
        }
    }

    public final class h extends C09AY implements Function0<String> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            JSONObject extraInfo;
            String strOptString;
            TTPOrbuContext tTPOrbuContext = l5.this.a;
            return (tTPOrbuContext == null || (extraInfo = tTPOrbuContext.getExtraInfo()) == null || (strOptString = extraInfo.optString("sandbox_rules_experiment_group")) == null) ? "" : strOptString;
        }

        public h() {
            super(0);
        }
    }

    public final class i extends C09AY implements Function0<jd> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jd invoke() {
            C1501920pBe c1501920pBe = new C1501920pBe();
            c1501920pBe.LIZIZ(ServerAPIType.SAMPLING.getBaseUrl());
            c1501920pBe.LIZJ(l5.this.i());
            c1501920pBe.LIZ(C1297210jrT.LIZIZ().LIZ());
            return (jd) C2204961BRm.l0(c1501920pBe, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null)).LIZIZ(jd.class);
        }

        public i() {
            super(0);
        }
    }

    public final class j extends C09AY implements Function0<C1495520p1K> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1495520p1K invoke() {
            C1495510p1J c1495510p1J = new C1495510p1J();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c1495510p1J.connectTimeout(30000L, timeUnit);
            c1495510p1J.writeTimeout(30000L, timeUnit);
            c1495510p1J.readTimeout(30000L, timeUnit);
            c1495510p1J.addInterceptor(new wd(ServerAPIType.SAMPLING));
            c1495510p1J.addInterceptor(new e7());
            c1495510p1J.addInterceptor(new vb());
            return C2204961BRm.k0(c1495510p1J, new C0WZX("YCtuUwA8StnfVEMkQVyIMw==", null));
        }
    }

    public final f0 a() {
        return (f0) this.i.getValue();
    }

    public final C1495520p1K b() {
        return (C1495520p1K) this.h.getValue();
    }

    public final j1 c() {
        return (j1) this.g.getValue();
    }

    public final C1495520p1K d() {
        return (C1495520p1K) this.f.getValue();
    }

    public final KeyStore e() {
        return (KeyStore) this.c.getValue();
    }

    public final z8 f() {
        return (z8) this.e.getValue();
    }

    public final C1495520p1K g() {
        return (C1495520p1K) this.d.getValue();
    }

    public final jd h() {
        return (jd) this.k.getValue();
    }

    public final C1495520p1K i() {
        return (C1495520p1K) this.j.getValue();
    }

    public final Context j() {
        Context applicationContext;
        TTPOrbuContext tTPOrbuContext = this.a;
        if ((tTPOrbuContext == null || (applicationContext = tTPOrbuContext.getApplicationContext()) == null) && (applicationContext = this.b) == null) {
            throw new p9("No applicationContext initialized");
        }
        return applicationContext;
    }

    public final k3 o() {
        return new k3(j());
    }

    public final Function0<String> p() {
        return new h();
    }

    public final w9 s() {
        return new nc();
    }

    public final SecureRandom u() {
        return Build.VERSION.SDK_INT >= 26 ? SecureRandom.getInstanceStrong() : new SecureRandom();
    }

    public final TTPOrbuContext v() throws p9 {
        TTPOrbuContext tTPOrbuContext = this.a;
        if (tTPOrbuContext != null) {
            return tTPOrbuContext;
        }
        throw new p9("No TTPOrbuContext initialized");
    }

    public final f0 k() {
        return a();
    }

    public final SharedPreferences l() {
        return j().getSharedPreferences("config", 0);
    }

    public final j1 m() {
        return c();
    }

    public final SharedPreferences n() {
        return j().getSharedPreferences("ttpCrashlog", 0);
    }

    public final KeyStore q() {
        return e();
    }

    public final z8 r() {
        return f();
    }

    public final jd t() {
        return h();
    }

    public final void a(TTPOrbuContext tTPOrbuContext) {
        this.a = tTPOrbuContext;
        this.b = tTPOrbuContext.getApplicationContext();
    }

    public final void a(Context context) {
        this.b = context;
    }
}
