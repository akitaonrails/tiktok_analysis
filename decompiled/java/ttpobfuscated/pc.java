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
import ttpobfuscated.id;
import ttpobfuscated.jd;

/* JADX INFO: loaded from: classes24.dex */
public final class pc implements id {
    public final w9 a;
    public final jd b;
    public final Context c;
    public final n1 d;
    public final String e = C13LE.LIZ(pc.class).LJI();

    public final ServerConfig a() {
        ServerConfig next;
        Iterator<ServerConfig> it2 = ((GeneralConfig) this.d.get()).getServerConfigs().iterator();
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

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.sample.RetrofitSampleRepository", f = "RetrofitSampleRepository.kt", l = {57}, m = "put")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws id.a.C0058a {
            C1C7U.LIZ("pc@1106.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = pc.this.a((cd) null, this);
            C1C7U.LIZIZ("pc@1106.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.data.repository.sample.RetrofitSampleRepository$put$2$result$1", f = "RetrofitSampleRepository.kt", l = {58}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<Unit>>, Object> {
        public int a;
        public final /* synthetic */ ServerConfig c;
        public final /* synthetic */ C0X76 d;
        public final /* synthetic */ cd e;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return pc.this.new b(this.c, this.d, this.e, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<Unit>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object objA = obj;
            C1C7U.LIZ("pc@1106.a$2");
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
                pc pcVar = pc.this;
                jd jdVar = pcVar.b;
                String strA = pcVar.a(this.c);
                String strB = x3.b(pc.this.c);
                C0X76 c0x76 = this.d;
                cd cdVar = this.e;
                String str = cdVar.a;
                Map<String, String> map = cdVar.c;
                String str2 = cdVar.b.m.a;
                this.a = 1;
                objA = jd.a.a(jdVar, strA, strB, c0x76, str, map, null, null, null, str2, this, 224, null);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("pc@1106.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("pc@1106.a$2");
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ServerConfig serverConfig, C0X76 c0x76, cd cdVar, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.c = serverConfig;
            this.d = c0x76;
            this.e = cdVar;
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:19:0x0061, B:20:0x0064, B:22:0x006a, B:23:0x0070, B:24:0x007b), top: B:41:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:19:0x0061, B:20:0x0064, B:22:0x006a, B:23:0x0070, B:24:0x007b), top: B:41:0x0061 }] */
    @Override // ttpobfuscated.id
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.cd r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) throws ttpobfuscated.id.a.C0058a {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.pc.a(ttpobfuscated.cd, X.05Vn):java.lang.Object");
    }

    public final AbstractC842530X3j a(ServerConfig serverConfig, String str) {
        C842540X3k c842540X3kLIZJ = AbstractC842530X3j.LIZJ(C0X0P.LIZJ("text/plain"), str);
        AbstractC842530X3j abstractC842530X3jA = y9.a(c842540X3kLIZJ, Integer.valueOf(b(serverConfig)));
        if (abstractC842530X3jA != null) {
            return abstractC842530X3jA;
        }
        return c842540X3kLIZJ;
    }

    public pc(w9 w9Var, jd jdVar, Context context, n1 n1Var) {
        this.a = w9Var;
        this.b = jdVar;
        this.c = context;
        this.d = n1Var;
    }
}
