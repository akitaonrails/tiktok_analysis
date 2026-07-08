package ttpobfuscated;

import X.AbstractC23140094w;
import X.AnonymousClass0956;
import X.AnonymousClass0958;
import X.C08RN;
import X.C098200Yq;
import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C189200o6;
import X.C1954807lC;
import X.C1C7U;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C23271099x;
import X.C786450Ut9;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC497601wk;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ttp.orbu.sdk.TTPOrbuSdk;
import ttp.orbu.sdk.TTPOrbuUtil;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfigKt;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.init.TTPOrbuActiveResult;
import ttp.orbu.sdk.init.TTPOrbuContext;
import ttp.orbu.sdk.init.TTPOrbusActiveCallback;
import ttp.orbu.sdk.netnative.TTPOrbuNetworkCaller;
import ttpobfuscated.dg;
import ttpobfuscated.l5.h;
import ttpobfuscated.lb;
import ttpobfuscated.q3;
import ttpobfuscated.ra;
import ttpobfuscated.ue;

/* JADX INFO: loaded from: classes24.dex */
public final class v3 {
    public static final a s = new a();
    public static final Object t = new Object();
    public static v3 u = new v3();
    public static final dg v = dg.a;
    public boolean b;
    public boolean c;
    public boolean d;
    public fe f;
    public volatile ra g;
    public C09AE h;
    public C09AE i;
    public TTPOrbuContext j;
    public Context k;
    public k3 l;
    public za m;
    public oc n;
    public x9 o;
    public yd p;
    public String q;
    public o1 r;
    public final String a = C13LE.LIZ(v3.class).LJI();
    public la e = la.InActive;

    public static final class a {
        public final v3 a() {
            return v3.u;
        }

        public final Object b() {
            return v3.t;
        }
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void x() {
    }

    public final void C() {
    }

    public final void e() {
        this.b = false;
        this.c = false;
        C09AE c09ae = this.i;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.i = null;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TTPOrbuSdk.OrbuState.values().length];
            try {
                iArr[TTPOrbuSdk.OrbuState.PRE_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[TTPOrbuSdk.OrbuState.ENABLE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[TTPOrbuSdk.OrbuState.DISABLE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            a = iArr;
        }
    }

    public final boolean A() {
        ra raVar = this.g;
        return raVar != null && raVar.a();
    }

    public final void B() throws Throwable {
        C23250099c.LJ(C23271099x.INSTANCE, new i(null));
    }

    public final boolean D() {
        if (!this.b) {
            return true;
        }
        bh.c.getClass();
        return bh.d.b;
    }

    public final void E() {
        d2.a.a(new j(null));
    }

    public final void c() {
        d2.a.a(new e(null));
    }

    public final void d() {
        if (this.k != null) {
            a(h(), la.InActive);
        }
        if (this.l != null) {
            m().getClass();
            af.a.a();
        }
        d2.a.b();
        q3.b.a(q3.a, "Cleaned all resources", this.a, (Throwable) null, 4, (Object) null);
    }

    public final void f() {
        if (ua.a.b().f().m().a("pki")) {
            this.h = d2.a.a(new g(null));
        }
        if (this.i == null) {
            a(true);
        }
    }

    public final Context h() {
        Context context = this.k;
        if (context != null) {
            return context;
        }
        return null;
    }

    public final String i() {
        String str = this.q;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final o1 k() {
        o1 o1Var = this.r;
        if (o1Var != null) {
            return o1Var;
        }
        return null;
    }

    public final k3 m() {
        k3 k3Var = this.l;
        if (k3Var != null) {
            return k3Var;
        }
        return null;
    }

    public final oc r() {
        oc ocVar = this.n;
        if (ocVar != null) {
            return ocVar;
        }
        return null;
    }

    public final x9 s() {
        x9 x9Var = this.o;
        if (x9Var != null) {
            return x9Var;
        }
        return null;
    }

    public final za u() {
        za zaVar = this.m;
        if (zaVar != null) {
            return zaVar;
        }
        return null;
    }

    public final yd v() {
        yd ydVar = this.p;
        if (ydVar != null) {
            return ydVar;
        }
        return null;
    }

    public final fe w() {
        fe feVar = this.f;
        if (feVar != null) {
            return feVar;
        }
        return null;
    }

    public final TTPOrbuContext y() {
        TTPOrbuContext tTPOrbuContext = this.j;
        if (tTPOrbuContext != null) {
            return tTPOrbuContext;
        }
        return null;
    }

    public final void z() {
        q3.b.a(q3.a, "Init essential but time consuming components", this.a, (Throwable) null, 4, (Object) null);
        this.l = new k3(h());
        E();
    }

    public final Long j() {
        Map<IntRange, Long> mapLJ;
        GeneralConfig generalConfig;
        Object objA = q4.a(y().getExtraInfo(), "perfScore");
        Integer num = v().a(ServerAPIType.CONFIGURATION).serviceDeferIntervalInSeconds;
        ua uaVar = ua.a;
        s4 s4VarM = uaVar.b().f().m();
        Config config = uaVar.b().f().j().get();
        if (!(config instanceof GeneralConfig) || (generalConfig = (GeneralConfig) config) == null || (mapLJ = generalConfig.getAdaptiveDelayConfig()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Long lValueOf = Long.valueOf(y9.a(objA, num, s4VarM, mapLJ));
        if (lValueOf.longValue() > 0) {
            return lValueOf;
        }
        return null;
    }

    public final la g() {
        return this.e;
    }

    public final boolean n() {
        return this.c;
    }

    public final boolean o() {
        return this.b;
    }

    public final boolean p() {
        return this.d;
    }

    public final ra t() {
        return this.g;
    }

    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$activateSchedulers$1", f = "DependencyGraph.kt", l = {785, 1084}, m = "invokeSuspend")
    public final class e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        public final class a implements InterfaceC346701Wf<UseCaseResult<g4, f4>> {
            public final /* synthetic */ v3 a;

            public a(v3 v3Var) {
                this.a = v3Var;
            }

            @Override // X.InterfaceC346701Wf
            public Object emit(UseCaseResult<g4, f4> useCaseResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                UseCaseResult<g4, f4> useCaseResult2 = useCaseResult;
                if (useCaseResult2 instanceof UseCaseResult.b) {
                    q3.b.a(q3.a, this.a.a + ".activateSchedulers -> EventHandlerUseCase Success Result: " + ((UseCaseResult.b) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                } else if (useCaseResult2 instanceof UseCaseResult.a) {
                    q3.b.a(q3.a, this.a.a + ".activateSchedulers -> EventHandlerUseCase Error Result: " + ((UseCaseResult.a) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                }
                return Unit.LIZ;
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.c$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("v3@107c.c$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                j5<g4, f4> j5VarF = ua.a.b().g().f();
                this.a = 1;
                obj = j5VarF.a(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("v3@107c.c$1");
                    return objLJFF;
                }
            }
            a aVar = new a(v3.this);
            this.a = 2;
            if (((InterfaceC346201Wa) obj).collect(aVar, this) == objLJFF) {
                C1C7U.LIZIZ("v3@107c.c$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.c$1");
            return unit2;
        }

        public e(InterfaceC1364105Vn<? super e> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return v3.this.new e(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return v3.this.new e(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadCloudConfig$1", f = "DependencyGraph.kt", l = {873, 959, 960}, m = "invokeSuspend")
    public final class h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ boolean e;

        @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadCloudConfig$1$generalConfigJob$1", f = "DependencyGraph.kt", l = {908}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ v3 c;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Long lA;
                C1C7U.LIZ("v3$h@2430.invokeSuspend$1");
                Object objLJFF = C099R.LJFF();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        lA = (Long) this.a;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    lA = nd.a(lb.j);
                    m<ue, te> mVarH = ua.a.b().g().h();
                    this.a = lA;
                    this.b = 1;
                    obj = mVarH.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("v3$h@2430.invokeSuspend$1");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                lb.j.getClass();
                lb.k.a(this.c.a + ".GetExternalGeneralConfigUseCase", lA, true, this.c.a);
                if ((useCaseResult instanceof UseCaseResult.b) && (((UseCaseResult.b) useCaseResult).a instanceof ue.a)) {
                    v3.a(this.c, ConfigType.General.INSTANCE, false, 2, null);
                }
                q3.b.a(q3.a, this.c.a + ".loadCloudConfig().GetExternalGeneralConfigUseCase -> Result: " + useCaseResult, this.c.a, (Throwable) null, 4, (Object) null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("v3$h@2430.invokeSuspend$1");
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v3 v3Var, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = v3Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new a(this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.c, interfaceC1364105Vn);
            }
        }

        @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadCloudConfig$1$orbuConfigJob$1", f = "DependencyGraph.kt", l = {935}, m = "invokeSuspend")
        public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ v3 c;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Long lA;
                C1C7U.LIZ("v3$h@2430.invokeSuspend$2");
                Object objLJFF = C099R.LJFF();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        lA = (Long) this.a;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    lA = nd.a(lb.j);
                    m<ue, te> mVarI = ua.a.b().g().i();
                    this.a = lA;
                    this.b = 1;
                    obj = mVarI.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("v3$h@2430.invokeSuspend$2");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                if ((useCaseResult instanceof UseCaseResult.b) && (((UseCaseResult.b) useCaseResult).a instanceof ue.a)) {
                    v3.a(this.c, ConfigType.OrbuCode.INSTANCE, false, 2, null);
                }
                lb.j.getClass();
                lb.k.a(this.c.a + ".GetExternalOrbucodeConfigUseCase", lA, true, this.c.a);
                q3.b.a(q3.a, this.c.a + ".loadCloudConfig().GetExternalOrbucodeConfigUseCase -> Result: " + useCaseResult, this.c.a, (Throwable) null, 4, (Object) null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("v3$h@2430.invokeSuspend$2");
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v3 v3Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = v3Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new b(this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new b(this.c, interfaceC1364105Vn);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0163  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 367
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.v3.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            h hVar = v3.this.new h(this.e, interfaceC1364105Vn);
            hVar.c = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, InterfaceC1364105Vn<? super h> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.e = z;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadLocalConfig$1", f = "DependencyGraph.kt", l = {559, 560}, m = "invokeSuspend")
    public final class i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadLocalConfig$1$generalConfig$1", f = "DependencyGraph.kt", l = {481}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ v3 c;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Long lA;
                C1C7U.LIZ("v3$i@2431.invokeSuspend$1");
                Object objLJFF = C099R.LJFF();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        lA = (Long) this.a;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    lA = nd.a(lb.j);
                    m<ve, te> mVarK = ua.a.b().g().k();
                    this.a = lA;
                    this.b = 1;
                    obj = mVarK.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("v3$i@2431.invokeSuspend$1");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                lb.a aVar = lb.j;
                aVar.getClass();
                lb.k.a(this.c.a + ".loadLocalConfig().SetLocalGeneralConfigUseCase", lA, true, this.c.a);
                if (useCaseResult instanceof UseCaseResult.b) {
                    q3.b.a(q3.a, this.c.a + ".loadLocalConfig().SetLocalGeneralConfigUseCase -> Result: " + ((UseCaseResult.b) useCaseResult).a, this.c.a, (Throwable) null, 4, (Object) null);
                } else if (useCaseResult instanceof UseCaseResult.a) {
                    q3.b.a(q3.a, this.c.a + ".loadLocalConfig().SetLocalGeneralConfigUseCase -> Result: " + ((UseCaseResult.a) useCaseResult).a, this.c.a, (Throwable) null, 4, (Object) null);
                }
                Long lA2 = nd.a(aVar);
                v3.a(this.c, ConfigType.General.INSTANCE, false, 2, null);
                lb.k.a(lf.a(new StringBuilder(), this.c.a, ".loadLocalConfig().onConfigLoaded(genConfig)"), lA2, true, this.c.a);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("v3$i@2431.invokeSuspend$1");
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v3 v3Var, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = v3Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new a(this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.c, interfaceC1364105Vn);
            }
        }

        @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$loadLocalConfig$1$orbuConfig$1", f = "DependencyGraph.kt", l = {522}, m = "invokeSuspend")
        public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ v3 c;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Long lA;
                C1C7U.LIZ("v3$i@2431.invokeSuspend$2");
                Object objLJFF = C099R.LJFF();
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        lA = (Long) this.a;
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    lA = nd.a(lb.j);
                    m<ve, te> mVarL = ua.a.b().g().l();
                    this.a = lA;
                    this.b = 1;
                    obj = mVarL.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("v3$i@2431.invokeSuspend$2");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                lb.a aVar = lb.j;
                aVar.getClass();
                lb.k.a(this.c.a + ".loadLocalConfig().SetLocalOrbucodeConfigUseCase", lA, true, this.c.a);
                if (useCaseResult instanceof UseCaseResult.b) {
                    q3.b.a(q3.a, this.c.a + ".loadLocalConfig().SetLocalOrbucodeConfigUseCase -> Result: " + ((UseCaseResult.b) useCaseResult).a, this.c.a, (Throwable) null, 4, (Object) null);
                } else if (useCaseResult instanceof UseCaseResult.a) {
                    q3.b.a(q3.a, this.c.a + ".loadLocalConfig().SetLocalOrbucodeConfigUseCase -> Result: " + ((UseCaseResult.a) useCaseResult).a, this.c.a, (Throwable) null, 4, (Object) null);
                }
                Long lA2 = nd.a(aVar);
                v3.a(this.c, ConfigType.OrbuCode.INSTANCE, false, 2, null);
                lb.k.a(lf.a(new StringBuilder(), this.c.a, ".loadLocalConfig().onConfigLoaded(orbuConfig)"), lA2, true, this.c.a);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("v3$i@2431.invokeSuspend$2");
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v3 v3Var, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = v3Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new b(this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new b(this.c, interfaceC1364105Vn);
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C09AE c09aeLIZLLL;
            C1C7U.LIZ("v3@107c.B$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("v3@107c.B$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c09aeLIZLLL = (C09AE) this.b;
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.b;
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new a(v3.this, null), 3);
                c09aeLIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new b(v3.this, null), 3);
                this.b = c09aeLIZLLL;
                this.a = 1;
                if (anonymousClass0956LIZLLL.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("v3@107c.B$1");
                    return objLJFF;
                }
            }
            this.b = null;
            this.a = 2;
            if (c09aeLIZLLL.LJJZ(this) == objLJFF) {
                C1C7U.LIZIZ("v3@107c.B$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.B$1");
            return unit2;
        }

        public i(InterfaceC1364105Vn<? super i> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            i iVar = v3.this.new i(interfaceC1364105Vn);
            iVar.b = interfaceC497601wk;
            return iVar.invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            i iVar = v3.this.new i(interfaceC1364105Vn);
            iVar.b = obj;
            return iVar;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$startCrashLogsMonitoring$1", f = "DependencyGraph.kt", l = {438, 1084}, m = "invokeSuspend")
    public final class j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        public final class a implements InterfaceC346701Wf<UseCaseResult<j2, f2>> {
            public final /* synthetic */ v3 a;

            public a(v3 v3Var) {
                this.a = v3Var;
            }

            @Override // X.InterfaceC346701Wf
            public Object emit(UseCaseResult<j2, f2> useCaseResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                UseCaseResult<j2, f2> useCaseResult2 = useCaseResult;
                if (useCaseResult2 instanceof UseCaseResult.b) {
                    q3.b.a(q3.a, this.a.a + ".activateSchedulers -> CrashLogProcessUseCase Success Result: " + ((UseCaseResult.b) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                } else if (useCaseResult2 instanceof UseCaseResult.a) {
                    q3.b.a(q3.a, this.a.a + ".activateSchedulers -> CrashLogProcessUseCase Error Result: " + ((UseCaseResult.a) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                }
                return Unit.LIZ;
            }
        }

        public static File INVOKEVIRTUAL_ttpobfuscated_v3$j_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
            File file = C786450Ut9.LIZJ;
            if (file != null && C786450Ut9.LJ) {
                return file;
            }
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        System.out.println("Application context obtained through ActivityThread: " + applicationContext);
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    System.out.println("Error: " + e.getMessage());
                }
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                } else {
                    throw new Throwable(th.getMessage() + ":" + C08RN.LIZJ() + " applicationContext is null");
                }
            }
            return C786450Ut9.LIZJ;
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.E$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("v3@107c.E$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                ua uaVar = ua.a;
                uaVar.b().e().getClass();
                String str = INVOKEVIRTUAL_ttpobfuscated_v3$j_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(v3.this.h()) + "/npth/crash";
                i5<e2, j2, f2> i5VarE = uaVar.b().g().e();
                e2 e2Var = new e2(str);
                this.a = 1;
                obj = i5VarE.a(e2Var, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("v3@107c.E$1");
                    return objLJFF;
                }
            }
            a aVar = new a(v3.this);
            this.a = 2;
            if (((InterfaceC346201Wa) obj).collect(aVar, this) == objLJFF) {
                C1C7U.LIZIZ("v3@107c.E$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.E$1");
            return unit2;
        }

        public j(InterfaceC1364105Vn<? super j> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return v3.this.new j(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return v3.this.new j(interfaceC1364105Vn);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$activate$1$1", f = "DependencyGraph.kt", l = {204}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.a$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                v3.this.z();
                v3 v3Var = v3.this;
                this.a = 1;
                if (v3Var.a(this) == objLJFF) {
                    C1C7U.LIZIZ("v3@107c.a$1");
                    return objLJFF;
                }
            }
            v3.this.c();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.a$1");
            return unit;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return v3.this.new c(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return v3.this.new c(interfaceC1364105Vn);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$activate$1$2", f = "DependencyGraph.kt", l = {210}, m = "invokeSuspend")
    public final class d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.a$2");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                v3 v3Var = v3.this;
                this.a = 1;
                if (v3Var.a(this) == objLJFF) {
                    C1C7U.LIZIZ("v3@107c.a$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.a$2");
            return unit;
        }

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return v3.this.new d(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return v3.this.new d(interfaceC1364105Vn);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph", f = "DependencyGraph.kt", l = {722, 743}, m = "activateServices")
    public final class f extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.a$3");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = v3.this.a(this);
            C1C7U.LIZIZ("v3@107c.a$3");
            return objA;
        }

        public f(InterfaceC1364105Vn<? super f> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.di.DependencyGraph$fetchNetworkResources$1", f = "DependencyGraph.kt", l = {842, 854}, m = "invokeSuspend")
    public final class g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("v3@107c.f$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("v3@107c.f$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Long lJ = v3.this.j();
                if (lJ != null) {
                    long jLongValue = lJ.longValue();
                    this.a = 1;
                    if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                        C1C7U.LIZIZ("v3@107c.f$1");
                        return objLJFF;
                    }
                }
            }
            v3.this.u().a(v3.this.s().d(v3.this.s().b(new vd(new ig(ServerAPIType.PKI, v3.this.v()), false))));
            za zaVarU = v3.this.u();
            this.a = 2;
            if (zaVarU.a(this) == objLJFF) {
                C1C7U.LIZIZ("v3@107c.f$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("v3@107c.f$1");
            return unit2;
        }

        public g(InterfaceC1364105Vn<? super g> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return v3.this.new g(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return v3.this.new g(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.v3.a(X.05Vn):java.lang.Object");
    }

    public final void b(Context context) {
        this.g = null;
        this.b = false;
        this.c = false;
        C09AE c09ae = this.i;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.i = null;
        ua uaVar = ua.a;
        uaVar.b().c().l().edit().clear().apply();
        uaVar.b().e().getClass();
        new y5().b();
        uaVar.b().e().getClass();
        new va().b();
        k3.b.a(context);
    }

    public final void c(Context context) throws Throwable {
        GeneralConfig generalConfig;
        if (!D()) {
            q3.b.a(q3.a, "Already init essential components, skip", this.a, (Throwable) null, 4, (Object) null);
            return;
        }
        lb.a aVar = lb.j;
        Long lA = nd.a(aVar);
        q3.b.a(q3.a, "initEssentialComponents()", this.a, (Throwable) null, 4, (Object) null);
        Long lA2 = nd.a(aVar);
        this.n = new oc();
        aVar.getClass();
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).networkManager"), lA2, true, this.a);
        Long lA3 = nd.a(aVar);
        this.o = new x9();
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).networkModule"), lA3, true, this.a);
        Long lA4 = nd.a(aVar);
        Config configA = x.a.a(ConfigType.General.INSTANCE);
        if (configA instanceof GeneralConfig) {
            generalConfig = (GeneralConfig) configA;
        } else {
            generalConfig = null;
        }
        this.p = new hg(generalConfig);
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).serverConfigManager"), lA4, true, this.a);
        Long lA5 = nd.a(aVar);
        this.f = new fe();
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).sessionIdManager"), lA5, true, this.a);
        Long lA6 = nd.a(aVar);
        this.m = new ab(null, r(), null);
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).pkiRepository"), lA6, true, this.a);
        Long lA7 = nd.a(aVar);
        this.q = x3.b(context);
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).appId"), lA7, true, this.a);
        Long lA8 = nd.a(aVar);
        String strA = x3.a(context);
        l5 l5VarC = ua.a.b().c();
        l5VarC.getClass();
        this.r = new o1(new s1(strA, "", l5VarC.new h(), x3.c(), x3.b, "android"), v());
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).configRepo"), lA8, true, this.a);
        Long lC = lb.k.c();
        B();
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).loadLocalConfig"), lC, true, this.a);
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).printOrbuVersion"), lb.k.c(), true, this.a);
        this.b = true;
        lb.k.a(lf.a(new StringBuilder(), this.a, ".initEssentialComponents(appContext).initialisedEssentialComponents"), lA, true, this.a);
    }

    public final void d(Context context) {
        this.k = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r9 = r8.getBaseUrl();
        r1 = ttpobfuscated.x.a.a(ttp.orbu.sdk.configuration.model.ConfigType.General.INSTANCE);
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        if ((r1 instanceof ttp.orbu.sdk.configuration.model.GeneralConfig) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        r1 = (ttp.orbu.sdk.configuration.model.GeneralConfig) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r0 = r1.getServerConfigs();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        r6 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r6.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        r1 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r1.name != r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = r1.maxPayloadSizeInBytes;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r7 = new ttp.orbu.sdk.configuration.model.ServerConfig(r8, r9, 30000, r11, r8.getDefaultServiceDeferIntervalInSeconds(), r8.getDefaultApiVersionPathParameter());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(ttp.orbu.sdk.configuration.model.GeneralConfig r15) {
        /*
            r14 = this;
            ttpobfuscated.fe r1 = r14.w()
            ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency r0 = r15.getSessionIdHeaderFrequency()
            r1.getClass()
            r1.b = r0
            ttp.orbu.sdk.configuration.model.ServerAPIType[] r5 = ttp.orbu.sdk.configuration.model.ServerAPIType.values()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = r5.length
            r4.<init>(r0)
            int r3 = r5.length
            r2 = 0
        L19:
            if (r2 >= r3) goto L85
            r8 = r5[r2]
            java.util.List r0 = r15.getServerConfigs()
            java.util.Iterator r1 = r0.iterator()
        L25:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r7 = r1.next()
            r0 = r7
            ttp.orbu.sdk.configuration.model.ServerConfig r0 = (ttp.orbu.sdk.configuration.model.ServerConfig) r0
            ttp.orbu.sdk.configuration.model.ServerAPIType r0 = r0.name
            if (r0 != r8) goto L25
            if (r7 != 0) goto L7d
        L38:
            ttp.orbu.sdk.configuration.model.ServerConfig r7 = new ttp.orbu.sdk.configuration.model.ServerConfig
            java.lang.String r9 = r8.getBaseUrl()
            r10 = 30000(0x7530, float:4.2039E-41)
            ttpobfuscated.x r1 = ttpobfuscated.x.a
            ttp.orbu.sdk.configuration.model.ConfigType$General r0 = ttp.orbu.sdk.configuration.model.ConfigType.General.INSTANCE
            ttp.orbu.sdk.configuration.model.Config r1 = r1.a(r0)
            boolean r0 = r1 instanceof ttp.orbu.sdk.configuration.model.GeneralConfig
            r11 = 0
            if (r0 == 0) goto L72
            ttp.orbu.sdk.configuration.model.GeneralConfig r1 = (ttp.orbu.sdk.configuration.model.GeneralConfig) r1
            if (r1 == 0) goto L72
            java.util.List r0 = r1.getServerConfigs()
            if (r0 == 0) goto L72
            java.util.Iterator r6 = r0.iterator()
        L5b:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r1 = r6.next()
            r0 = r1
            ttp.orbu.sdk.configuration.model.ServerConfig r0 = (ttp.orbu.sdk.configuration.model.ServerConfig) r0
            ttp.orbu.sdk.configuration.model.ServerAPIType r0 = r0.name
            if (r0 != r8) goto L5b
        L6c:
            ttp.orbu.sdk.configuration.model.ServerConfig r1 = (ttp.orbu.sdk.configuration.model.ServerConfig) r1
            if (r1 == 0) goto L72
            java.lang.Integer r11 = r1.maxPayloadSizeInBytes
        L72:
            java.lang.Integer r12 = r8.getDefaultServiceDeferIntervalInSeconds()
            java.lang.String r13 = r8.getDefaultApiVersionPathParameter()
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L7d:
            r4.add(r7)
            int r2 = r2 + 1
            goto L19
        L83:
            r1 = r11
            goto L6c
        L85:
            ttpobfuscated.yd r0 = r14.v()
            r0.a(r4)
            ttpobfuscated.o1 r1 = r14.k()
            int r0 = r15.getVersion()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.a(r0)
            ttpobfuscated.q3$a r0 = ttpobfuscated.q3.a
            java.lang.String r2 = r14.a
            java.lang.String r1 = "GeneralConfig is loaded"
            r3 = 0
            r4 = 4
            r5 = r3
            ttpobfuscated.q3.b.a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.v3.a(ttp.orbu.sdk.configuration.model.GeneralConfig):void");
    }

    public final void b(TTPOrbuSdk.OrbuState orbuState) {
        gb gbVar;
        ra raVar = this.g;
        if (raVar != null) {
            int i2 = b.a[orbuState.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        gbVar = gb.SandboxDeactivate;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    gbVar = gb.SandboxActivate;
                }
            } else {
                gbVar = gb.SandboxPreActivate;
            }
            ra.b.a(raVar, hb.a(gbVar), null, null, 4, null);
            TTPOrbuNetworkCaller.INSTANCE.processPredefinedFlow(gbVar.a);
        }
    }

    public final boolean a(String str) throws Exception {
        if (Intrinsics.LJFF(str, "databaseManager")) {
            if (this.l != null) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "networkManager")) {
            if (this.n != null) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "networkModule")) {
            if (this.o != null) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "serverConfigManager")) {
            if (this.p != null) {
                return true;
            }
            return false;
        }
        throw new Exception("Unknown property name [" + str + ']');
    }

    public final boolean a(dg.a aVar) {
        Object c098200Yq;
        boolean z;
        try {
            v.b(aVar);
            TTPOrbuNetworkCaller tTPOrbuNetworkCaller = TTPOrbuNetworkCaller.INSTANCE;
            if (tTPOrbuNetworkCaller.init(h())) {
                tTPOrbuNetworkCaller.unlockPredefinedDataFlowLock();
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            q3.a aVar2 = q3.a;
            String str = this.a;
            aVar2.getClass();
            q3.a.c.b("exception while unlockPredefinedDataFlowLock: ", str, thM5exceptionOrNullimpl);
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public final void b(String str) {
        this.q = str;
    }

    public final TTPOrbuUtil.TTPCleanupResult a(Context context) {
        Object c098200Yq;
        if (this.b) {
            return TTPOrbuUtil.TTPCleanupResult.INVALID_SEQUENCE;
        }
        try {
            d2.a.b();
            b(context);
            c098200Yq = TTPOrbuUtil.TTPCleanupResult.SUCCESS;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            q3.a aVar = q3.a;
            String str = this.a;
            aVar.getClass();
            q3.a.c.d("clean up error: ", str, thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        TTPOrbuUtil.TTPCleanupResult tTPCleanupResult = (TTPOrbuUtil.TTPCleanupResult) c098200Yq;
        if (tTPCleanupResult != null) {
            return tTPCleanupResult;
        }
        return TTPOrbuUtil.TTPCleanupResult.GENERAL_ERROR;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    public final void a(ConfigType configType) {
        l5 l5VarC = ua.a.b().c();
        Context contextH = h();
        l5VarC.getClass();
        l5VarC.b = contextH;
        ConfigType.General general = ConfigType.General.INSTANCE;
        if (Intrinsics.LJFF(configType, general)) {
            a(this, general, false, 2, null);
            return;
        }
        ConfigType.OrbuCode orbuCode = ConfigType.OrbuCode.INSTANCE;
        if (!Intrinsics.LJFF(configType, orbuCode)) {
            return;
        }
        a(this, orbuCode, false, 2, null);
    }

    public final void a(boolean z) {
        this.i = d2.a.a(new h(z, null));
    }

    public final void a(TTPOrbuSdk.OrbuState orbuState) {
        if (b.a[orbuState.ordinal()] != 1) {
            this.c = true;
        }
    }

    public final void a(TTPOrbuContext tTPOrbuContext) {
        this.j = tTPOrbuContext;
    }

    public final void a(k3 k3Var) {
        this.l = k3Var;
    }

    public final void a(la laVar) {
        this.e = laVar;
    }

    public final void a(o1 o1Var) {
        this.r = o1Var;
    }

    public final void a(oc ocVar) {
        this.n = ocVar;
    }

    public final void a(ra raVar) {
        this.g = raVar;
    }

    public final void a(x9 x9Var) {
        this.o = x9Var;
    }

    public final void a(yd ydVar) {
        this.p = ydVar;
    }

    public final void a(za zaVar) {
        this.m = zaVar;
    }

    public final void a(ConfigType configType, boolean z) {
        synchronized (t) {
            try {
                q3.a aVar = q3.a;
                q3.b.a(aVar, "onConfigLoaded gets called", this.a, (Throwable) null, 4, (Object) null);
                if (Intrinsics.LJFF(configType, ConfigType.General.INSTANCE)) {
                    ua.a.b().e().getClass();
                    new y5();
                    a(y5.b);
                } else if (Intrinsics.LJFF(configType, ConfigType.OrbuCode.INSTANCE)) {
                    ua uaVar = ua.a;
                    uaVar.b().e().getClass();
                    new va();
                    if (!a(va.b, h(), z)) {
                        uaVar.b().e().getClass();
                        new va().b();
                        if (!a(va.b, h(), z)) {
                            this.g = null;
                        }
                    }
                    gb gbVar = gb.OrbuCodeDataLoad;
                    ra raVar = this.g;
                    if (raVar != null) {
                        ra.b.a(raVar, hb.a(gbVar), null, null, 4, null);
                    }
                    TTPOrbuNetworkCaller.INSTANCE.processPredefinedFlow(gbVar.a);
                    q3.b.a(aVar, "Predefined dataflow OrbuCodeDataLoad is finished", this.a, (Throwable) null, 4, (Object) null);
                } else {
                    throw new C1954807lC();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void a(Context context, la laVar) {
        boolean z;
        if (laVar != la.InActive) {
            z = true;
        } else {
            z = false;
        }
        ra raVar = this.g;
        if (raVar != null) {
            raVar.a(z);
        }
        TTPOrbuNetworkCaller tTPOrbuNetworkCaller = TTPOrbuNetworkCaller.INSTANCE;
        tTPOrbuNetworkCaller.init(context);
        tTPOrbuNetworkCaller.setNativeValidatorEnable(z);
        tTPOrbuNetworkCaller.setNativeActivationState(laVar.a);
        Map<String, Object> mapA = b8.a(y().getExtraInfo());
        ArrayList arrayList = new ArrayList(mapA.size());
        for (Map.Entry<String, Object> entry : mapA.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), String.valueOf(entry.getValue())));
        }
        TTPOrbuNetworkCaller.INSTANCE.setExtraInfo(C2097608Jq.LJIILLIIL(arrayList));
        q3.b.a(q3.a, "orbuCodeRuntime is activated: state - " + laVar, this.a, (Throwable) null, 4, (Object) null);
    }

    public final synchronized void a(TTPOrbuContext tTPOrbuContext, TTPOrbuSdk.OrbuState orbuState, TTPOrbusActiveCallback tTPOrbusActiveCallback) {
        Object c098200Yq;
        try {
            u = this;
            this.j = tTPOrbuContext;
            this.k = tTPOrbuContext.getApplicationContext();
            lb.j.getClass();
            lb.a(lb.k, h(), null, null, 6, null);
            Long lC = lb.k.c();
            ua uaVar = ua.a;
            uaVar.b().c().a(y());
            q3.a aVar = q3.a;
            r3.b(aVar);
            q3.b.a(aVar, "Activate sandbox with ttpOrbuContext " + tTPOrbuContext, this.a, (Throwable) null, 4, (Object) null);
            this.e = la.b.a(orbuState);
            y3 y3VarE = uaVar.b().e();
            y3VarE.getClass();
            y3VarE.a = orbuState;
            lb lbVar = lb.k;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.a);
            sbLIZ.append(".OrbuSdk");
            lbVar.a(C2188811AlT.LIZIZ(sbLIZ), lC, true, this.a);
            if (D()) {
                Long lC2 = lb.k.c();
                c(y().getApplicationContext());
                lb lbVar2 = lb.k;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.a);
                sbLIZ2.append(".initEssentialComponents");
                lbVar2.a(C2188811AlT.LIZIZ(sbLIZ2), lC2, true, this.a);
                a(h(), la.PreActive);
                d2.a.a(new c(null));
                f();
            } else {
                d2.a.a(new d(null));
            }
            a(orbuState);
            w().c = null;
            a(h(), this.e);
            b(orbuState);
            boolean zA = a(dg.a.Ready);
            lb lbVar3 = lb.k;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.a);
            sbLIZ3.append(".activate");
            lbVar3.a(C2188811AlT.LIZIZ(sbLIZ3), lC, true, this.a);
            q3.b.a(aVar, "Activating OrbuSDK result: " + zA, this.a, (Throwable) null, 4, (Object) null);
            tTPOrbusActiveCallback.response(new TTPOrbuActiveResult(zA, zA));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            a(dg.a.Broken);
            tTPOrbusActiveCallback.response(new TTPOrbuActiveResult(false, false));
        }
    }

    public final boolean a(OrbuCodeConfig orbuCodeConfig, Context context, boolean z) {
        Object c098200Yq;
        try {
            ua.a.b().e().getClass();
            new y5();
            GeneralConfig generalConfig = y5.b;
            Map<String, Object> mapA = b8.a(y().getExtraInfo());
            ArrayList arrayList = new ArrayList(mapA.size());
            for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), String.valueOf(entry.getValue())));
            }
            Map<String, ? extends Map<String, String>> mapLIZJ = C2097908Jt.LIZJ(new Pair("extraInfo", C2097608Jq.LJIILLIIL(arrayList)));
            mf.a.getClass();
            ra raVarA = mf.b.a(orbuCodeConfig, w(), generalConfig, mapLIZJ, new bd(orbuCodeConfig.getSamplingBufferSize()));
            raVarA.a(true);
            this.g = raVarA;
            ua.a.b().e().getClass();
            new va();
            va.c = va.b.getOrbuHash();
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            q3.a aVar = q3.a;
            String str = this.a;
            aVar.getClass();
            q3.a.c.b("Failed to load orbuCodeRuntime", str, thM5exceptionOrNullimpl);
            return false;
        }
        TTPOrbuNetworkCaller tTPOrbuNetworkCaller = TTPOrbuNetworkCaller.INSTANCE;
        if (tTPOrbuNetworkCaller.init(context)) {
            if (!this.d) {
                if (tTPOrbuNetworkCaller.initializeNativeValidator(OrbuCodeConfigKt.getOrbuCode(orbuCodeConfig), orbuCodeConfig.getSamplingBufferSize(), A(), orbuCodeConfig.getStrategy()) != 0) {
                    return false;
                }
                this.d = true;
            } else if (tTPOrbuNetworkCaller.updateNativeValidator(OrbuCodeConfigKt.getOrbuCode(orbuCodeConfig), A(), orbuCodeConfig.getStrategy()) != 0) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void a(v3 v3Var, ConfigType configType, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        v3Var.a(configType, z);
    }

    public static /* synthetic */ boolean a(v3 v3Var, OrbuCodeConfig orbuCodeConfig, Context context, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        return v3Var.a(orbuCodeConfig, context, z);
    }
}
