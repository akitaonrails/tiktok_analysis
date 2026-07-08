package ttpobfuscated;

import X.AbstractC23140094w;
import X.C08RN;
import X.C099R;
import X.C09AX;
import X.C09BH;
import X.C09DV;
import X.C0PEM;
import X.C0VSJ;
import X.C155000ia;
import X.C1C7U;
import X.C23250099c;
import X.C786450Ut9;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public final class xf implements vf {
    public final String a;
    public File b;
    public final Queue<String> c;
    public volatile boolean d;
    public Map<wf, t7> e;
    public Map<wf, z1> f;
    public Map<wf, jb> g;

    @Override // ttpobfuscated.vf
    public Map<wf, z1> a() {
        return this.f;
    }

    @Override // ttpobfuscated.vf
    public Map<wf, jb> b() {
        return this.g;
    }

    @Override // ttpobfuscated.vf
    public Map<wf, t7> c() {
        return this.e;
    }

    public final File d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    @C09DV(c = "ttp.orbu.sdk.telemetry.TelemetryImpl$addTraceLog$2", f = "TelemetryImpl.kt", l = {}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C1C7U.LIZ("xf@100b.a$1");
            C099R.LJFF();
            if (this.a == 0) {
                C155000ia.LIZIZ(obj);
                while (!xf.this.c.isEmpty()) {
                    String strPoll = xf.this.c.poll();
                    if (strPoll != null) {
                        C09BH.LIZJ(xf.this.b, strPoll, Charsets.UTF_8);
                    }
                }
                xf.this.d = false;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("xf@100b.a$1");
                return unit;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return xf.this.new a(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return xf.this.new a(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.telemetry.TelemetryImpl", f = "TelemetryImpl.kt", l = {56, 57, 58, 63}, m = "trace")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("xf@100b.a$2");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = xf.this.a((wf) null, (Map<String, ? extends Object>) null, this);
            C1C7U.LIZIZ("xf@100b.a$2");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    public xf(Context context) {
        String str = INVOKEVIRTUAL_ttpobfuscated_xf_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context) + "/capture-" + yf.a + ".log";
        this.a = str;
        this.b = new C0VSJ(str);
        this.c = new LinkedList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new LinkedHashMap();
    }

    public static File INVOKEVIRTUAL_ttpobfuscated_xf_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
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

    public final Object a(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new a(null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // ttpobfuscated.vf
    public void b(Map<wf, z1> map) {
        this.f = map;
    }

    @Override // ttpobfuscated.vf
    public void c(Map<wf, t7> map) {
        this.e = map;
    }

    @Override // ttpobfuscated.vf
    public void a(wf wfVar) {
        this.e.remove(wfVar);
        this.f.remove(wfVar);
        this.g.remove(wfVar);
    }

    public final void a(File file) {
        this.b = file;
    }

    @Override // ttpobfuscated.vf
    public void a(Map<wf, jb> map) {
        this.g = map;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f0  */
    @Override // ttpobfuscated.vf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.wf r13, java.util.Map<java.lang.String, ? extends java.lang.Object> r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.xf.a(ttpobfuscated.wf, java.util.Map, X.05Vn):java.lang.Object");
    }

    @Override // ttpobfuscated.vf
    public void a(t7 t7Var, z1 z1Var, jb jbVar) {
        wf wfVarA = t7Var.a().a();
        this.e.put(wfVarA, t7Var);
        this.f.put(wfVarA, z1Var);
        this.g.put(wfVarA, jbVar);
    }
}
