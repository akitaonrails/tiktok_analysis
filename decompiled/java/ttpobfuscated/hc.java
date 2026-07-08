package ttpobfuscated;

import X.AbstractC23140094w;
import X.AbstractC842530X3j;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0X0P;
import X.C0X76;
import X.C13LE;
import X.C1500770p9n;
import X.C155000ia;
import X.C1C7U;
import X.C842540X3k;
import X.InterfaceC1364105Vn;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttpobfuscated.i2;
import ttpobfuscated.jd;

/* JADX INFO: loaded from: classes24.dex */
public final class hc implements i2 {
    public final w9 a;
    public final jd b;
    public final Context c;
    public final c3 d;
    public final n1 e;
    public final String f = C13LE.LIZ(hc.class).LJI();

    public final ServerConfig a() {
        ServerConfig next;
        Iterator<ServerConfig> it2 = ((GeneralConfig) this.e.get()).getServerConfigs().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.name == ServerAPIType.SAMPLING) {
                break;
            }
        }
        return next;
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.sample.RetrofitCrashLogRepository", f = "RetrofitCrashLogRepository.kt", l = {70}, m = "send")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws i2.a {
            C1C7U.LIZ("hc@11fe.a$1");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = hc.this.a((k2) null, this);
            C1C7U.LIZIZ("hc@11fe.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.sample.RetrofitCrashLogRepository$send$2$result$1", f = "RetrofitCrashLogRepository.kt", l = {71}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<Unit>>, Object> {
        public int a;
        public final /* synthetic */ ServerConfig c;
        public final /* synthetic */ C0X76 d;
        public final /* synthetic */ l2 e;
        public final /* synthetic */ k2 f;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return hc.this.new b(this.c, this.d, this.e, this.f, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objA = obj;
            C1C7U.LIZ("hc@11fe.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(objA);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objA);
                hc hcVar = hc.this;
                jd jdVar = hcVar.b;
                String strA = hcVar.a(this.c);
                String str = "crash." + x3.b(hc.this.c);
                C0X76 c0x76 = this.d;
                String string = this.e.k.toString();
                Map<String, String> map = this.f.a;
                this.a = 1;
                objA = jd.a.a(jdVar, strA, str, c0x76, string, map, null, null, null, this, 224, null);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("hc@11fe.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("hc@11fe.a$2");
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ServerConfig serverConfig, C0X76 c0x76, l2 l2Var, k2 k2Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = serverConfig;
            this.d = c0x76;
            this.e = l2Var;
            this.f = k2Var;
        }
    }

    public final String a(ServerConfig serverConfig) {
        String str;
        if (serverConfig == null || (str = serverConfig.apiVersionPathParameter) == null) {
            return "v1";
        }
        return str;
    }

    public final int b(ServerConfig serverConfig) {
        Integer num;
        if (serverConfig != null && (num = serverConfig.maxPayloadSizeInBytes) != null) {
            return num.intValue();
        }
        return 65536;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093 A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:24:0x008a, B:25:0x008d, B:27:0x0093, B:28:0x0099, B:29:0x00a6), top: B:46:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x00aa, TryCatch #1 {all -> 0x00aa, blocks: (B:24:0x008a, B:25:0x008d, B:27:0x0093, B:28:0x0099, B:29:0x00a6), top: B:46:0x008a }] */
    @Override // ttpobfuscated.i2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.k2 r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws ttpobfuscated.i2.a {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.hc.a(ttpobfuscated.k2, X.05Vn):java.lang.Object");
    }

    public final AbstractC842530X3j a(ServerConfig serverConfig, String str) {
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("text/plain"), str);
        AbstractC842530X3j abstractC842530X3jA = y9.a(c842540X3kLIZJ, Integer.valueOf(b(serverConfig)));
        if (abstractC842530X3jA != null) {
            return abstractC842530X3jA;
        }
        return c842540X3kLIZJ;
    }

    public hc(w9 w9Var, jd jdVar, Context context, c3 c3Var, n1 n1Var) {
        this.a = w9Var;
        this.b = jdVar;
        this.c = context;
        this.d = c3Var;
        this.e = n1Var;
    }
}
