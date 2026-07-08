package ttpobfuscated;

import X.AnonymousClass0957;
import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C0PEM;
import X.C1507270pKH;
import X.C155000ia;
import X.C1C7U;
import X.C1DFB;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C259800zU;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttpobfuscated.ra;

/* JADX INFO: loaded from: classes24.dex */
public abstract class z5 {
    public static final d a = new d();

    public static final class a extends z5 {
        public final v3 b;

        @Override // ttpobfuscated.z5
        public String a() {
            return this.b.e.a;
        }

        public a(v3 v3Var) {
            this.b = v3Var;
        }
    }

    public static final class b extends z5 {
        public final Context b;
        public final C01GW c = C452501pT.LIZIZ(new a());

        public final class a extends C09AY implements Function0<String> {
            public final String a() {
                return x3.a(b.this.b);
            }

            @Override // kotlin.jvm.functions.Function0
            public String invoke() {
                return x3.a(b.this.b);
            }

            public a() {
                super(0);
            }
        }

        @Override // ttpobfuscated.z5
        public String a() {
            return (String) this.c.getValue();
        }

        public b(Context context) {
            this.b = context;
        }
    }

    public static final class e extends z5 {
        public final cc b;

        @Override // ttpobfuscated.z5
        public String a() {
            String str = this.b.d.get("x-tt-dataflow-id");
            return str == null ? "" : str;
        }

        public e(cc ccVar) {
            this.b = ccVar;
        }
    }

    public static final class f extends z5 {
        public final TTPOrbuContext b;

        @Override // ttpobfuscated.z5
        public String a() {
            return C786410Ut5.J3(this.b.getExtraInfo());
        }

        public f(TTPOrbuContext tTPOrbuContext) {
            this.b = tTPOrbuContext;
        }
    }

    public static final class g extends z5 {
        public static final g b = new g();
        public static final String c;

        static {
            ra.a.getClass();
            c = C1507270pKH.LIZJ(ra.a.b.a);
        }

        @Override // ttpobfuscated.z5
        public String a() {
            return c;
        }
    }

    public static final class j extends z5 {
        public static final j b = new j();
        public static final String c;

        static {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(Build.MANUFACTURER);
            sbLIZ.append(';');
            sbLIZ.append(Build.MODEL);
            sbLIZ.append(';');
            sbLIZ.append(Build.VERSION.RELEASE);
            c = C2188811AlT.LIZIZ(sbLIZ);
        }

        @Override // ttpobfuscated.z5
        public String a() {
            return c;
        }
    }

    public abstract String a();

    public static final class c extends z5 {
        public final String b;

        @Override // ttpobfuscated.z5
        public String a() {
            return this.b;
        }

        public c(jg jgVar) {
            this.b = String.valueOf(jgVar != null ? jgVar.j() : null);
        }
    }

    public static final class h extends z5 {
        public static final h b = new h();
        public static final String c = "android";

        @Override // ttpobfuscated.z5
        public String a() {
            return c;
        }
    }

    public static final class i extends z5 {
        public static final i b = new i();
        public static final String c = x3.c();

        @Override // ttpobfuscated.z5
        public String a() {
            return c;
        }
    }

    public static final class k extends z5 {
        public final String b;

        @Override // ttpobfuscated.z5
        public String a() {
            return this.b;
        }

        public k(cc ccVar) {
            this.b = ccVar.h();
        }
    }

    public static final class l extends z5 {
        public static final l b = new l();
        public static final String c = x3.d();

        @Override // ttpobfuscated.z5
        public String a() {
            return c;
        }
    }

    public static final class d {

        /* JADX INFO: loaded from: classes.dex */
        @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.GenericProperty$Companion$findProperty$1", f = "GenericPropertyInstruction.kt", l = {110}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ C259800zU<jg> c;
            public final /* synthetic */ C01GW<AnonymousClass0957<jg>> d;

            /* JADX INFO: renamed from: ttpobfuscated.z5$d$a$a, reason: collision with other inner class name */
            @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.GenericProperty$Companion$findProperty$1$1", f = "GenericPropertyInstruction.kt", l = {112}, m = "invokeSuspend")
            public final class C0079a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super jg>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ C01GW<AnonymousClass0957<jg>> c;

                /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
                @Override // njp.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.String r4 = "z5$d@fd2b.a$1$invokeSuspend$1"
                        X.C1C7U.LIZ(r4)
                        java.lang.Object r3 = X.C099R.LJFF()
                        int r0 = r5.a
                        r2 = 0
                        r1 = 1
                        if (r0 == 0) goto L1b
                        if (r0 != r1) goto L13
                        goto L38
                    L13:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    L1b:
                        X.C155000ia.LIZIZ(r6)
                        X.01GW<X.0957<ttpobfuscated.jg>> r0 = r5.c
                        if (r0 == 0) goto L36
                        java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L41
                        X.0957 r0 = (X.AnonymousClass0957) r0     // Catch: java.lang.Throwable -> L41
                        if (r0 == 0) goto L36
                        r5.a = r1     // Catch: java.lang.Throwable -> L41
                        java.lang.Object r6 = r0.LJLIIIL(r5)     // Catch: java.lang.Throwable -> L41
                        if (r6 != r3) goto L3b
                        X.C1C7U.LIZIZ(r4)
                        return r3
                    L36:
                        r6 = r2
                        goto L3d
                    L38:
                        X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L41
                    L3b:
                        ttpobfuscated.jg r6 = (ttpobfuscated.jg) r6     // Catch: java.lang.Throwable -> L41
                    L3d:
                        X.C189200o6.m2constructorimpl(r6)     // Catch: java.lang.Throwable -> L41
                        goto L4d
                    L41:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        X.00Yq r6 = new X.00Yq
                        r6.<init>(r0)
                        X.C189200o6.m2constructorimpl(r6)
                    L4d:
                        boolean r0 = X.C189200o6.m7isFailureimpl(r6)
                        if (r0 != 0) goto L54
                        r2 = r6
                    L54:
                        X.C1C7U.LIZIZ(r4)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.z5.d.a.C0079a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0079a(C01GW<? extends AnonymousClass0957<jg>> c01gw, InterfaceC1364105Vn<? super C0079a> interfaceC1364105Vn) {
                    super(2, interfaceC1364105Vn);
                    this.c = c01gw;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super jg> interfaceC1364105Vn) {
                    C0079a c0079a = new C0079a(this.c, interfaceC1364105Vn);
                    c0079a.b = interfaceC497601wk;
                    return c0079a.invokeSuspend(Unit.LIZ);
                }

                @Override // njp.a
                public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                    C0079a c0079a = new C0079a(this.c, interfaceC1364105Vn);
                    c0079a.b = obj;
                    return c0079a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // njp.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C259800zU<jg> c259800zU;
                T t;
                C1C7U.LIZ("z5$d@fd2b.a$1");
                Object objLJFF = C099R.LJFF();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        c259800zU = (C259800zU) this.a;
                        C155000ia.LIZIZ(obj);
                        t = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    c259800zU = this.c;
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C0079a c0079a = new C0079a(this.d, null);
                    this.a = c259800zU;
                    this.b = 1;
                    Object objLJI = C23250099c.LJI(this, c1dfb, c0079a);
                    t = objLJI;
                    if (objLJI == objLJFF) {
                        C1C7U.LIZIZ("z5$d@fd2b.a$1");
                        return objLJFF;
                    }
                }
                c259800zU.element = t;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("z5$d@fd2b.a$1");
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new a(this.c, this.d, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.c, this.d, interfaceC1364105Vn);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(C259800zU<jg> c259800zU, C01GW<? extends AnonymousClass0957<jg>> c01gw, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = c259800zU;
                this.d = c01gw;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        public final z5 a(String str, v3 v3Var, cc ccVar, C01GW<? extends AnonymousClass0957<jg>> c01gw) throws Throwable {
            switch (str.hashCode()) {
                case -1108116780:
                    if (!str.equals("clientIdentifier")) {
                        return null;
                    }
                    break;
                case -1008506225:
                    if (str.equals("osName")) {
                        return h.b;
                    }
                    return null;
                case -889527096:
                    if (str.equals("ttpVersion")) {
                        return l.b;
                    }
                    return null;
                case -253631266:
                    if (str.equals("extraInfo")) {
                        return new f(v3Var.y());
                    }
                    return null;
                case 92751661:
                    if (str.equals("orbuCodeApiLevel")) {
                        return g.b;
                    }
                    return null;
                case 897346355:
                    if (str.equals("dataFlowId")) {
                        return new e(ccVar);
                    }
                    return null;
                case 908408390:
                    if (!str.equals("clientId")) {
                        return null;
                    }
                    break;
                case 1150097001:
                    if (str.equals("requestType")) {
                        return new k(ccVar);
                    }
                    return null;
                case 1276154139:
                    if (str.equals("activationState")) {
                        return new a(v3Var);
                    }
                    return null;
                case 1484112759:
                    if (str.equals("appVersion")) {
                        return new b(v3Var.h());
                    }
                    return null;
                case 1812004436:
                    if (str.equals("osVersion")) {
                        return i.b;
                    }
                    return null;
                default:
                    return null;
            }
            C259800zU c259800zU = new C259800zU();
            C23250099c.LJ(C23271099x.INSTANCE, new a(c259800zU, c01gw, null));
            return new c((jg) c259800zU.element);
        }

        public static z5 a(d dVar, String str, v3 v3Var, cc ccVar, C01GW c01gw, int i, Object obj) {
            if ((i & 2) != 0) {
                v3.s.getClass();
                v3Var = v3.u;
            }
            return dVar.a(str, v3Var, ccVar, c01gw);
        }
    }
}
