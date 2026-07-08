package ttp.orbu.sdk;

import X.AbstractC2252651DEx;
import X.AbstractC23273099z;
import X.C01GW;
import X.C08FF;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C189200o6;
import X.C1954807lC;
import X.C19719512Dh;
import X.C1C7U;
import X.C2097608Jq;
import X.C23250099c;
import X.C23271099x;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.Version;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttpobfuscated.bf;
import ttpobfuscated.d2;
import ttpobfuscated.jg;
import ttpobfuscated.k0;
import ttpobfuscated.l;
import ttpobfuscated.l5;
import ttpobfuscated.m;
import ttpobfuscated.p0;
import ttpobfuscated.q3;
import ttpobfuscated.s0;
import ttpobfuscated.t0;
import ttpobfuscated.te;
import ttpobfuscated.tg;
import ttpobfuscated.u0;
import ttpobfuscated.ua;
import ttpobfuscated.v0;
import ttpobfuscated.v3;
import ttpobfuscated.ve;
import ttpobfuscated.w0;
import ttpobfuscated.y5;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPOrbuUtil {
    public static final TTPOrbuUtil INSTANCE = new TTPOrbuUtil();
    public static final String a = C13LE.LIZ(TTPOrbuUtil.class).LJI();
    public static final C01GW b = C452501pT.LIZIZ(e.a);

    public static final class e extends C09AY implements Function0<Map<String, String>> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map<String, String> invoke() {
            Version.b bVar = Version.b.a;
            return C2097608Jq.LJIIJ(new Pair(bVar.getName(), bVar.getValue().invoke()));
        }
    }

    public final void updateConfig(Context context, boolean z, String str, boolean z2) {
    }

    public final Map<String, String> a() {
        return (Map) b.getValue();
    }

    public final Map<String, String> getVersion() {
        C01GW c01gw = b;
        Map mapLIZJ = C19719512Dh.LIZJ(c01gw.getValue());
        Version.a aVar = Version.a.a;
        mapLIZJ.put(aVar.getName(), aVar.getValue().invoke());
        return (Map) c01gw.getValue();
    }

    public final boolean loadLocalGeneralConfig() {
        Object c098200Yq;
        try {
            C23250099c.LJ(C23271099x.INSTANCE, new d(null));
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public enum TTPCleanupResult {
        SUCCESS(0),
        GENERAL_ERROR(1),
        INVALID_SEQUENCE(2);

        public final int code;

        public static TTPCleanupResult valueOf(String str) {
            return (TTPCleanupResult) C08FF.LIZ(TTPCleanupResult.class, str);
        }

        public final int getCode() {
            return this.code;
        }

        TTPCleanupResult(int i) {
            this.code = i;
        }
    }

    public final String getClassName() {
        return a;
    }

    @C09DV(c = "ttp.orbu.sdk.TTPOrbuUtil$cleanupTTP$1$result$1", f = "TTPOrbuUtil.kt", l = {146}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UseCaseResult<t0, s0>>, Object> {
        public int a;
        public final /* synthetic */ l<p0, t0, s0> b;

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new c(this.b, interfaceC1364105Vn);
        }

        @C09DV(c = "ttp.orbu.sdk.TTPOrbuUtil$cleanupTTP$1$result$1$1", f = "TTPOrbuUtil.kt", l = {148}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UseCaseResult<t0, s0>>, Object> {
            public int a;
            public final /* synthetic */ l<p0, t0, s0> b;

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.b, interfaceC1364105Vn);
            }

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("TTPOrbuUtil$c@c6a6.invokeSuspend$1");
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
                    l<p0, t0, s0> lVar = this.b;
                    v3.s.getClass();
                    p0 p0Var = new p0(v3.u.b);
                    this.a = 1;
                    obj = lVar.a(p0Var, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("TTPOrbuUtil$c@c6a6.invokeSuspend$1");
                        return objLJFF;
                    }
                }
                C1C7U.LIZIZ("TTPOrbuUtil$c@c6a6.invokeSuspend$1");
                return obj;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l<p0, t0, s0> lVar, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.b = lVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UseCaseResult<t0, s0>> interfaceC1364105Vn) {
                return new a(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1C7U.LIZ("TTPOrbuUtil@ada1.cleanupTTP$3");
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
                bf.a.getClass();
                AbstractC23273099z abstractC23273099z = (AbstractC23273099z) bf.b.getValue();
                a aVar = new a(this.b, null);
                this.a = 1;
                obj = C23250099c.LJI(this, abstractC23273099z, aVar);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$3");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$3");
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(l<p0, t0, s0> lVar, InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.b = lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UseCaseResult<t0, s0>> interfaceC1364105Vn) {
            return new c(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.TTPOrbuUtil$cleanupTTP$1$1", f = "TTPOrbuUtil.kt", l = {167}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ l<v0, Unit, w0> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ TTPCleanupResult d;
        public final /* synthetic */ k0 e;
        public final /* synthetic */ String f;

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new a(this.b, this.c, this.d, this.e, this.f, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("TTPOrbuUtil@ada1.cleanupTTP$1");
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
                l<v0, Unit, w0> lVar = this.b;
                v0 v0Var = new v0(this.c, this.d.getCode(), this.e, this.f);
                this.a = 1;
                if (lVar.a(v0Var, this) == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$1");
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l<v0, Unit, w0> lVar, String str, TTPCleanupResult tTPCleanupResult, k0 k0Var, String str2, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.b = lVar;
            this.c = str;
            this.d = tTPCleanupResult;
            this.e = k0Var;
            this.f = str2;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.TTPOrbuUtil$cleanupTTP$1$clientIdentifier$1", f = "TTPOrbuUtil.kt", l = {132}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
        public int a;

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            String str;
            C1C7U.LIZ("TTPOrbuUtil@ada1.cleanupTTP$2");
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
                tg tgVarF = ua.a.b().f().F();
                this.a = 1;
                obj = tgVarF.a(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$2");
                    return objLJFF;
                }
            }
            jg jgVar = (jg) obj;
            if (jgVar == null || (str = jgVar.e) == null) {
                str = "";
            }
            C1C7U.LIZIZ("TTPOrbuUtil@ada1.cleanupTTP$2");
            return str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
            return new b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.TTPOrbuUtil$loadLocalGeneralConfig$1$1", f = "TTPOrbuUtil.kt", l = {71}, m = "invokeSuspend")
    public final class d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
        public int a;

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return TTPOrbuUtil.this.new d(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C1C7U.LIZ("TTPOrbuUtil@ada1.loadLocalGeneralConfig$1");
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
                m<ve, te> mVarK = ua.a.b().g().k();
                this.a = 1;
                obj = mVarK.a(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TTPOrbuUtil@ada1.loadLocalGeneralConfig$1");
                    return objLJFF;
                }
            }
            UseCaseResult useCaseResult = (UseCaseResult) obj;
            if (useCaseResult instanceof UseCaseResult.b) {
                q3.b.a(q3.a, TTPOrbuUtil.this.getClassName() + ".loadLocalConfig().SetLocalGeneralConfigUseCase -> Result: " + ((UseCaseResult.b) useCaseResult).a, TTPOrbuUtil.this.getClassName(), (Throwable) null, 4, (Object) null);
                obj2 = Unit.LIZ;
            } else if (useCaseResult instanceof UseCaseResult.a) {
                q3.b.a(q3.a, TTPOrbuUtil.this.getClassName() + ".loadLocalConfig().SetLocalGeneralConfigUseCase -> Result: " + ((UseCaseResult.a) useCaseResult).a, TTPOrbuUtil.this.getClassName(), (Throwable) null, 4, (Object) null);
                obj2 = false;
            } else {
                throw new C1954807lC();
            }
            C1C7U.LIZIZ("TTPOrbuUtil@ada1.loadLocalGeneralConfig$1");
            return obj2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
            return TTPOrbuUtil.this.new d(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TTPCleanupResult cleanupTTP(Context context, String str) {
        Object obj;
        TTPCleanupResult tTPCleanupResult;
        try {
            q3.a aVar = q3.a;
            q3.b.a(aVar, "cleanupTTP is called. reasonCode: " + str, (String) null, (Throwable) null, 6, (Object) null);
            ua uaVar = ua.a;
            l5 l5VarC = uaVar.b().c();
            l5VarC.getClass();
            l5VarC.b = context;
            if (!loadLocalGeneralConfig()) {
                q3.b.a(aVar, "Error on Config update.", (String) null, (Throwable) null, 6, (Object) null);
            }
            uaVar.b().e().getClass();
            new y5();
            k0 k0Var = y5.b.getRequestValidation().a;
            bf.a.getClass();
            String str2 = (String) C23250099c.LJ((AbstractC2252651DEx) bf.b.getValue(), new b(null));
            u0 u0Var = new u0(uaVar.b().g().a.g());
            l<v0, Unit, w0> lVarC = uaVar.b().g().c();
            UseCaseResult useCaseResult = (UseCaseResult) C23250099c.LJ(C23271099x.INSTANCE, new c(u0Var, null));
            if (useCaseResult instanceof UseCaseResult.b) {
                tTPCleanupResult = ((t0) ((UseCaseResult.b) useCaseResult).a).a;
            } else if (useCaseResult instanceof UseCaseResult.a) {
                tTPCleanupResult = ((s0) ((UseCaseResult.a) useCaseResult).a).a;
            } else {
                throw new C1954807lC();
            }
            d2.a.a(new a(lVarC, str, tTPCleanupResult, k0Var, str2, null));
            q3.b.a(aVar, "cleanupTTP done. result: " + tTPCleanupResult.getCode(), (String) null, (Throwable) null, 6, (Object) null);
            C189200o6.m2constructorimpl(tTPCleanupResult);
            obj = tTPCleanupResult;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object obj2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            q3.b.b(q3.a, "Unknown error occurred while trying to clean the sandbox instance", null, null, 6, null);
            obj2 = TTPCleanupResult.GENERAL_ERROR;
        }
        return (TTPCleanupResult) obj2;
    }
}
