package ttpobfuscated;

import X.AbstractC23140094w;
import X.C01GW;
import X.C08RN;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C1C7U;
import X.C2191201ApK;
import X.C259800zU;
import X.C452501pT;
import X.C786450Ut9;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import X.InterfaceC383701eN;
import X.InterfaceC497601wk;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class md implements a1 {
    public final String a = C13LE.LIZ(md.class).LJI();
    public final C01GW b = C452501pT.LIZIZ(j.a);
    public final C01GW c = C452501pT.LIZIZ(f.a);
    public final C01GW d = C452501pT.LIZIZ(e.a);
    public final C01GW e = C452501pT.LIZIZ(d.a);
    public final C01GW f = C452501pT.LIZIZ(new k());
    public final C01GW g = C452501pT.LIZIZ(new m());
    public final C01GW h = C452501pT.LIZIZ(new l());
    public volatile boolean i;

    public final class d extends C09AY implements Function0<y3> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        public final y3 a() {
            return new y3();
        }

        @Override // kotlin.jvm.functions.Function0
        public y3 invoke() {
            return new y3();
        }
    }

    public final class e extends C09AY implements Function0<l5> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        public final l5 a() {
            return new l5();
        }

        @Override // kotlin.jvm.functions.Function0
        public l5 invoke() {
            return new l5();
        }
    }

    public final class f extends C09AY implements Function0<u8> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        public final u8 a() {
            return new u8();
        }

        @Override // kotlin.jvm.functions.Function0
        public u8 invoke() {
            return new u8();
        }
    }

    public final class k extends C09AY implements Function0<ac> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ac invoke() {
            return new ac((l5) md.this.d.getValue(), (y3) md.this.e.getValue(), (u8) md.this.c.getValue());
        }

        public k() {
            super(0);
        }
    }

    public final class l extends C09AY implements Function0<yc> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yc invoke() {
            return new yc((ac) md.this.f.getValue());
        }

        public l() {
            super(0);
        }
    }

    public final class m extends C09AY implements Function0<pg> {
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pg invoke() {
            return new pg((ac) md.this.f.getValue(), (l5) md.this.d.getValue());
        }

        public m() {
            super(0);
        }
    }

    @Override // ttpobfuscated.a1
    public void a() {
    }

    public final class j extends C09AY implements Function0<InterfaceC383701eN> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        public final InterfaceC383701eN a() {
            return C2191201ApK.LIZ();
        }

        @Override // kotlin.jvm.functions.Function0
        public InterfaceC383701eN invoke() {
            return C2191201ApK.LIZ();
        }
    }

    @Override // ttpobfuscated.a1
    public u8 b() {
        return (u8) this.c.getValue();
    }

    @Override // ttpobfuscated.a1
    public l5 c() {
        return (l5) this.d.getValue();
    }

    @Override // ttpobfuscated.a1
    public yc d() {
        return (yc) this.h.getValue();
    }

    @Override // ttpobfuscated.a1
    public y3 e() {
        return (y3) this.e.getValue();
    }

    @Override // ttpobfuscated.a1
    public ac f() {
        return (ac) this.f.getValue();
    }

    @Override // ttpobfuscated.a1
    public pg g() {
        return (pg) this.g.getValue();
    }

    public final void h() {
        q3.b.c(q3.a, "activateCrashlog -> Start", this.a, null, 4, null);
        d2.a.a(new b(null));
    }

    public final void i() {
        d2.a.a(new c(null));
    }

    public final InterfaceC383701eN j() {
        return (InterfaceC383701eN) this.b.getValue();
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent$activateCrashlog$1", f = "SdkComponent.kt", l = {416, 435}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        public final class a implements InterfaceC346701Wf<UseCaseResult<j2, f2>> {
            public final /* synthetic */ md a;

            public a(md mdVar) {
                this.a = mdVar;
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

        public static File INVOKEVIRTUAL_ttpobfuscated_md$b_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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
            C1C7U.LIZ("md@1162.h$1");
            Object objLJFF = C099R.LJFF();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("md@1162.h$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                md.this.e.getValue().getClass();
                String str = INVOKEVIRTUAL_ttpobfuscated_md$b_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(((l5) md.this.d.getValue()).j()) + "/npth/crash";
                i5<e2, j2, f2> i5VarE = ((pg) md.this.g.getValue()).e();
                e2 e2Var = new e2(str);
                this.a = 1;
                obj = i5VarE.a(e2Var, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("md@1162.h$1");
                    return objLJFF;
                }
            }
            a aVar = new a(md.this);
            this.a = 2;
            if (((InterfaceC346201Wa) obj).collect(aVar, this) == objLJFF) {
                C1C7U.LIZIZ("md@1162.h$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("md@1162.h$1");
            return unit2;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return md.this.new b(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return md.this.new b(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent$activateServices$1", f = "SdkComponent.kt", l = {330, 349, 370, 435}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;

        public final class a implements InterfaceC346701Wf<UseCaseResult<g4, f4>> {
            public final /* synthetic */ md a;

            public a(md mdVar) {
                this.a = mdVar;
            }

            @Override // X.InterfaceC346701Wf
            public Object emit(UseCaseResult<g4, f4> useCaseResult, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                UseCaseResult<g4, f4> useCaseResult2 = useCaseResult;
                if (useCaseResult2 instanceof UseCaseResult.b) {
                    q3.b.a(q3.a, this.a.a + ".activateServices -> EventHandlerUseCase Success Result: " + ((UseCaseResult.b) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                } else if (useCaseResult2 instanceof UseCaseResult.a) {
                    q3.b.a(q3.a, this.a.a + ".activateServices -> EventHandlerUseCase Error Result: " + ((UseCaseResult.a) useCaseResult2).a, this.a.a, (Throwable) null, 4, (Object) null);
                }
                return Unit.LIZ;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0178  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x019c  */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 424
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.md.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return md.this.new c(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return md.this.new c(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent$loadExternalConfigurations$1", f = "SdkComponent.kt", l = {224, 302, 303}, m = "invokeSuspend")
    public final class g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ boolean e;

        @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent$loadExternalConfigurations$1$generalConfigJob$1", f = "SdkComponent.kt", l = {258}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ C259800zU<Long> b;
            public final /* synthetic */ md c;

            /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Long] */
            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("md$g@c4c5.invokeSuspend$1");
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
                    this.b.element = nd.a(lb.j);
                    ttpobfuscated.m<ue, te> mVarH = ((pg) this.c.g.getValue()).h();
                    this.a = 1;
                    obj = mVarH.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("md$g@c4c5.invokeSuspend$1");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                if (useCaseResult instanceof UseCaseResult.a) {
                    UseCaseResult.a aVar = (UseCaseResult.a) useCaseResult;
                    String strLJI = C13LE.LIZ(aVar.a.getClass()).LJI();
                    q3.b.c(q3.a, "loadExternalConfigurations -> Error while loading local config: " + strLJI, C13LE.LIZ(aVar.a.getClass()).LJI(), null, 4, null);
                }
                lb.j.getClass();
                lb.k.a(lf.a(new StringBuilder(), this.c.a, ".loadExternalConfigurations.GetExternalGeneralConfigUseCase"), this.b.element, true, this.c.a);
                q3.b.c(q3.a, "loadExternalConfigurations.GetExternalOrbucodeConfigUseCase -> Start", this.c.a, null, 4, null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("md$g@c4c5.invokeSuspend$1");
                return unit;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new a(this.b, this.c, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.b, this.c, interfaceC1364105Vn);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C259800zU<Long> c259800zU, md mdVar, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.b = c259800zU;
                this.c = mdVar;
            }
        }

        @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent$loadExternalConfigurations$1$orbuConfigJob$1", f = "SdkComponent.kt", l = {284}, m = "invokeSuspend")
        public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public Object a;
            public int b;
            public final /* synthetic */ md c;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                Long lA;
                C1C7U.LIZ("md$g@c4c5.invokeSuspend$2");
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
                    ttpobfuscated.m<ue, te> mVarI = ((pg) this.c.g.getValue()).i();
                    this.a = lA;
                    this.b = 1;
                    obj = mVarI.a(this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("md$g@c4c5.invokeSuspend$2");
                        return objLJFF;
                    }
                }
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                if (useCaseResult instanceof UseCaseResult.a) {
                    String strLJI = C13LE.LIZ(((UseCaseResult.a) useCaseResult).a.getClass()).LJI();
                    q3.b.c(q3.a, "loadExternalConfigurations -> Error while loading local config: " + strLJI, this.c.a, null, 4, null);
                }
                lb.j.getClass();
                lb.k.a(lf.a(new StringBuilder(), this.c.a, ".loadExternalConfigurations.GetExternalOrbucodeConfigUseCase"), lA, true, this.c.a);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("md$g@c4c5.invokeSuspend$2");
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(md mdVar, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.c = mdVar;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0184  */
        /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Long] */
        @Override // njp.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.md.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            g gVar = md.this.new g(this.e, interfaceC1364105Vn);
            gVar.c = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, InterfaceC1364105Vn<? super g> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.e = z;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent", f = "SdkComponent.kt", l = {440, 100, 102}, m = "activate")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("md@1162.a$1");
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object objA = md.this.a(null, null, this);
            C1C7U.LIZIZ("md@1162.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent", f = "SdkComponent.kt", l = {158}, m = "loadLocalGeneralConfig")
    public final class h extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("md@1162.a$3");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = md.this.a(this);
            C1C7U.LIZIZ("md@1162.a$3");
            return objA;
        }

        public h(InterfaceC1364105Vn<? super h> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.framework.di.SdkComponent", f = "SdkComponent.kt", l = {186}, m = "loadLocalOrbucodeConfig")
    public final class i extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("md@1162.b$1");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objB = md.this.b(this);
            C1C7U.LIZIZ("md@1162.b$1");
            return objB;
        }

        public i(InterfaceC1364105Vn<? super i> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ttpobfuscated.md.h
            if (r0 == 0) goto Lb2
            r3 = r14
            ttpobfuscated.md$h r3 = (ttpobfuscated.md.h) r3
            int r2 = r3.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r3.e = r2
        L12:
            java.lang.Object r5 = r3.c
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.e
            r1 = 1
            if (r0 == 0) goto L81
            if (r0 != r1) goto Lb9
            java.lang.Object r4 = r3.b
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r6 = r3.a
            ttpobfuscated.md r6 = (ttpobfuscated.md) r6
            X.C155000ia.LIZIZ(r5)
        L2a:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult r5 = (ttp.orbu.sdk.app.domain.usecase.UseCaseResult) r5
            boolean r0 = r5 instanceof ttp.orbu.sdk.app.domain.usecase.UseCaseResult.a
            if (r0 == 0) goto L58
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a r5 = (ttp.orbu.sdk.app.domain.usecase.UseCaseResult.a) r5
            ERROR r0 = r5.a
            java.lang.Class r0 = r0.getClass()
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.String r3 = r0.LJI()
            ttpobfuscated.q3$a r7 = ttpobfuscated.q3.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "loadLocalGeneralConfig -> Error while loading local config: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            java.lang.String r9 = r6.a
            r10 = 0
            r11 = 4
            r12 = r10
            ttpobfuscated.q3.b.c(r7, r8, r9, r10, r11, r12)
        L58:
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            r0.getClass()
            ttpobfuscated.lb r5 = ttpobfuscated.lb.k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r6.a
            java.lang.String r0 = ".loadLocalGeneralConfig"
            java.lang.String r2 = ttpobfuscated.lf.a(r3, r2, r0)
            java.lang.String r0 = r6.a
            r5.a(r2, r4, r1, r0)
            ttpobfuscated.q3$a r0 = ttpobfuscated.q3.a
            java.lang.String r2 = r6.a
            java.lang.String r1 = "loadLocalGeneralConfig -> End"
            r3 = 0
            r4 = 4
            r5 = r3
            ttpobfuscated.q3.b.c(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L81:
            X.C155000ia.LIZIZ(r5)
            ttpobfuscated.q3$a r4 = ttpobfuscated.q3.a
            java.lang.String r6 = r13.a
            java.lang.String r5 = "loadLocalGeneralConfig -> Start"
            r7 = 0
            r8 = 4
            r9 = r7
            ttpobfuscated.q3.b.c(r4, r5, r6, r7, r8, r9)
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            java.lang.Long r4 = ttpobfuscated.nd.a(r0)
            X.01GW r0 = r13.g
            java.lang.Object r0 = r0.getValue()
            ttpobfuscated.pg r0 = (ttpobfuscated.pg) r0
            ttpobfuscated.m r0 = r0.k()
            r3.a = r13
            r3.b = r4
            r3.e = r1
            java.lang.Object r5 = r0.a(r3)
            if (r5 != r2) goto Laf
            return r2
        Laf:
            r6 = r13
            goto L2a
        Lb2:
            ttpobfuscated.md$h r3 = new ttpobfuscated.md$h
            r3.<init>(r14)
            goto L12
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.md.a(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof ttpobfuscated.md.i
            if (r0 == 0) goto Lb2
            r3 = r14
            ttpobfuscated.md$i r3 = (ttpobfuscated.md.i) r3
            int r2 = r3.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r3.e = r2
        L12:
            java.lang.Object r5 = r3.c
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.e
            r1 = 1
            if (r0 == 0) goto L81
            if (r0 != r1) goto Lb9
            java.lang.Object r4 = r3.b
            java.lang.Long r4 = (java.lang.Long) r4
            java.lang.Object r6 = r3.a
            ttpobfuscated.md r6 = (ttpobfuscated.md) r6
            X.C155000ia.LIZIZ(r5)
        L2a:
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult r5 = (ttp.orbu.sdk.app.domain.usecase.UseCaseResult) r5
            boolean r0 = r5 instanceof ttp.orbu.sdk.app.domain.usecase.UseCaseResult.a
            if (r0 == 0) goto L58
            ttp.orbu.sdk.app.domain.usecase.UseCaseResult$a r5 = (ttp.orbu.sdk.app.domain.usecase.UseCaseResult.a) r5
            ERROR r0 = r5.a
            java.lang.Class r0 = r0.getClass()
            X.12Dl r0 = X.C13LE.LIZ(r0)
            java.lang.String r3 = r0.LJI()
            ttpobfuscated.q3$a r7 = ttpobfuscated.q3.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "loadLocalOrbucodeConfig -> Error while loading local config: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r8 = r2.toString()
            java.lang.String r9 = r6.a
            r10 = 0
            r11 = 4
            r12 = r10
            ttpobfuscated.q3.b.c(r7, r8, r9, r10, r11, r12)
        L58:
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            r0.getClass()
            ttpobfuscated.lb r5 = ttpobfuscated.lb.k
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = r6.a
            java.lang.String r0 = ".loadLocalOrbucodeConfig"
            java.lang.String r2 = ttpobfuscated.lf.a(r3, r2, r0)
            java.lang.String r0 = r6.a
            r5.a(r2, r4, r1, r0)
            ttpobfuscated.q3$a r0 = ttpobfuscated.q3.a
            java.lang.String r2 = r6.a
            java.lang.String r1 = "loadLocalOrbucodeConfig -> End"
            r3 = 0
            r4 = 4
            r5 = r3
            ttpobfuscated.q3.b.c(r0, r1, r2, r3, r4, r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L81:
            X.C155000ia.LIZIZ(r5)
            ttpobfuscated.q3$a r4 = ttpobfuscated.q3.a
            java.lang.String r6 = r13.a
            java.lang.String r5 = "loadLocalOrbucodeConfig -> Start"
            r7 = 0
            r8 = 4
            r9 = r7
            ttpobfuscated.q3.b.c(r4, r5, r6, r7, r8, r9)
            ttpobfuscated.lb$a r0 = ttpobfuscated.lb.j
            java.lang.Long r4 = ttpobfuscated.nd.a(r0)
            X.01GW r0 = r13.g
            java.lang.Object r0 = r0.getValue()
            ttpobfuscated.pg r0 = (ttpobfuscated.pg) r0
            ttpobfuscated.m r0 = r0.l()
            r3.a = r13
            r3.b = r4
            r3.e = r1
            java.lang.Object r5 = r0.a(r3)
            if (r5 != r2) goto Laf
            return r2
        Laf:
            r6 = r13
            goto L2a
        Lb2:
            ttpobfuscated.md$i r3 = new ttpobfuscated.md$i
            r3.<init>(r14)
            goto L12
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.md.b(X.05Vn):java.lang.Object");
    }

    public final void a(boolean z) {
        d2.a.a(new g(z, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2 A[Catch: all -> 0x019d, TryCatch #7 {all -> 0x019d, blocks: (B:29:0x00ac, B:31:0x00e2), top: B:78:0x00ac }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bd  */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // ttpobfuscated.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttp.orbu.sdk.init.TTPOrbuContext r19, ttp.orbu.sdk.TTPOrbuSdk.OrbuState r20, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.init.TTPOrbuActiveResult> r21) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.md.a(ttp.orbu.sdk.init.TTPOrbuContext, ttp.orbu.sdk.TTPOrbuSdk$OrbuState, X.05Vn):java.lang.Object");
    }
}
