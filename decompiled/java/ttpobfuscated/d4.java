package ttpobfuscated;

import X.AbstractC23140094w;
import X.AnonymousClass0956;
import X.AnonymousClass0958;
import X.C099R;
import X.C09AE;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C1954807lC;
import X.C19719612Di;
import X.C1C7U;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.EventSetting;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.constants.TTPErrorCode;
import ttpobfuscated.q3;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class d4 {
    public static final a q = new a();
    public final String a;
    public o4 b;
    public td c;
    public j9 d;
    public j0 e;
    public b6 f;
    public fe g;
    public kd h;
    public List<EventSetting> i;
    public volatile boolean j;
    public final List<fg<? extends b2>> k;
    public long l;
    public k0 m;
    public C09AE n;
    public final AtomicBoolean o;
    public String p;

    public static final class a {
    }

    public final synchronized void n() {
        Iterator<fg<? extends b2>> it2 = this.k.iterator();
        while (it2.hasNext()) {
            b(it2.next());
        }
        this.k.clear();
        q3.b.a(q3.a, "Clear cache", this.a, (Throwable) null, 4, (Object) null);
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TTPErrorCode.values().length];
            try {
                iArr[TTPErrorCode.RequestSizeLargerThanAllowed.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[TTPErrorCode.Unauthorized.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[TTPErrorCode.RequestThrottledInternally.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[TTPErrorCode.RateLimitExceeded.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            a = iArr;
        }
    }

    public final void a() {
        this.o.set(false);
        C09AE c09ae = this.n;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        q3.b.a(q3.a, "Scheduler deactivated", this.a, (Throwable) null, 4, (Object) null);
    }

    public final j0 b() {
        j0 j0Var = this.e;
        if (j0Var != null) {
            return j0Var;
        }
        return null;
    }

    public final List<EventSetting> d() {
        List<EventSetting> list = this.i;
        if (list != null) {
            return list;
        }
        return null;
    }

    public final o4 e() {
        o4 o4Var = this.b;
        if (o4Var != null) {
            return o4Var;
        }
        return null;
    }

    public final b6 f() {
        b6 b6Var = this.f;
        if (b6Var != null) {
            return b6Var;
        }
        return null;
    }

    public final j9 h() {
        j9 j9Var = this.d;
        if (j9Var != null) {
            return j9Var;
        }
        return null;
    }

    public final kd i() {
        kd kdVar = this.h;
        if (kdVar != null) {
            return kdVar;
        }
        return null;
    }

    public final td k() {
        td tdVar = this.c;
        if (tdVar != null) {
            return tdVar;
        }
        return null;
    }

    public final fe l() {
        fe feVar = this.g;
        if (feVar != null) {
            return feVar;
        }
        return null;
    }

    public d4() {
        this.a = C13LE.LIZ(d4.class).LJI();
        this.k = new ArrayList();
        x xVar = x.a;
        ConfigType.General general = ConfigType.General.INSTANCE;
        this.l = ((GeneralConfig) xVar.a(general)).getSendInterval();
        this.m = ((GeneralConfig) xVar.a(general)).getRequestValidation().c();
        this.o = new AtomicBoolean();
        this.p = "logId1";
    }

    public final k0 c() {
        return this.m;
    }

    public final String g() {
        return this.p;
    }

    public final long j() {
        return this.l;
    }

    public final AtomicBoolean m() {
        return this.o;
    }

    /* JADX INFO: loaded from: classes15.dex */
    @C09DV(c = "ttp.orbu.sdk.events.EventHandler$schedule$2", f = "EventHandler.kt", l = {}, m = "invokeSuspend")
    public final class e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @C09DV(c = "ttp.orbu.sdk.events.EventHandler$schedule$2$1", f = "EventHandler.kt", l = {237, 238}, m = "invokeSuspend")
        public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ d4 b;

            @Override // njp.a
            public final Object invokeSuspend(Object obj) {
                C1C7U.LIZ("d4$e@f937.invokeSuspend$1");
                Object objLJFF = C099R.LJFF();
                int i = this.a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            C155000ia.LIZIZ(obj);
                            q3.b.a(q3.a, "Send events by schedule", this.b.a, (Throwable) null, 4, (Object) null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("d4$e@f937.invokeSuspend$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    long j = this.b.l;
                    this.a = 1;
                    if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("d4$e@f937.invokeSuspend$1");
                        return objLJFF;
                    }
                }
                d4 d4Var = this.b;
                this.a = 2;
                if (d4Var.b(this) == objLJFF) {
                    C1C7U.LIZIZ("d4$e@f937.invokeSuspend$1");
                    return objLJFF;
                }
                q3.b.a(q3.a, "Send events by schedule", this.b.a, (Throwable) null, 4, (Object) null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("d4$e@f937.invokeSuspend$1");
                return unit2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d4 d4Var, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
                super(2, interfaceC1364105Vn);
                this.b = d4Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                return new a(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
            }

            @Override // njp.a
            public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
                return new a(this.b, interfaceC1364105Vn);
            }
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d4@12a9.a$3");
            C099R.LJFF();
            if (this.a == 0) {
                C155000ia.LIZIZ(obj);
                AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) this.b, null, null, new a(d4.this, null), 3);
                C1C7U.LIZIZ("d4@12a9.a$3");
                return anonymousClass0956LIZLLL;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public e(InterfaceC1364105Vn<? super e> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
            e eVar = d4.this.new e(interfaceC1364105Vn);
            eVar.b = interfaceC497601wk;
            return eVar.invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            e eVar = d4.this.new e(interfaceC1364105Vn);
            eVar.b = obj;
            return eVar;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {145, 147}, m = "activateScheduler")
    public final class c extends AbstractC23140094w {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d4@12a9.a$1");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = d4.this.a(false, (InterfaceC1364105Vn<? super Unit>) this);
            C1C7U.LIZIZ("d4@12a9.a$1");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {302, 316}, m = "resolveChallenge")
    public final class d extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws r4 {
            C1C7U.LIZ("d4@12a9.a$2");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = d4.this.a((uf) null, this);
            C1C7U.LIZIZ("d4@12a9.a$2");
            return objA;
        }

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {250, 253, 261}, m = "send")
    public final class f extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d4@12a9.b$1");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objB = d4.this.b(this);
            C1C7U.LIZIZ("d4@12a9.b$1");
            return objB;
        }

        public f(InterfaceC1364105Vn<? super f> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {415, 426}, m = "sendEvents")
    public final class g extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws r4 {
            C1C7U.LIZ("d4@12a9.a$4");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = d4.this.a((List<? extends fg<? extends b2>>) null, this);
            C1C7U.LIZIZ("d4@12a9.a$4");
            return objA;
        }

        public g(InterfaceC1364105Vn<? super g> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {284, 293}, m = "sendRegularEvents")
    public final class h extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws r4 {
            C1C7U.LIZ("d4@12a9.a$5");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objA = d4.this.a((String) null, this);
            C1C7U.LIZIZ("d4@12a9.a$5");
            return objA;
        }

        public h(InterfaceC1364105Vn<? super h> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {351, 357, 389, 399}, m = "sendSampleEvent")
    public final class i extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws r4 {
            C1C7U.LIZ("d4@12a9.a$6");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = d4.this.a((dd) null, this);
            C1C7U.LIZIZ("d4@12a9.a$6");
            return objA;
        }

        public i(InterfaceC1364105Vn<? super i> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.events.EventHandler", f = "EventHandler.kt", l = {340}, m = "sendSampleEvents")
    public final class j extends AbstractC23140094w {
        public /* synthetic */ Object a;
        public int c;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("d4@12a9.c$1");
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object objC = d4.this.c(this);
            C1C7U.LIZIZ("d4@12a9.c$1");
            return objC;
        }

        public j(InterfaceC1364105Vn<? super j> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    public final void a(fg<? extends b2> fgVar) {
        if (this.j) {
            b(fgVar);
            return;
        }
        this.k.add(fgVar);
        if (this.k.size() >= 80) {
            C19719612Di.LJJIIZ(this.k);
        }
        q3.b.a(q3.a, "Cache event " + fgVar.d(), this.a, (Throwable) null, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.b(X.05Vn):java.lang.Object");
    }

    public final boolean c(fg<? extends b2> fgVar) {
        EventSetting next;
        zb zbVarC;
        Iterator<EventSetting> it2 = d().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.eventType, fgVar.d())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EventSetting eventSetting = next;
        if (eventSetting == null || (zbVarC = eventSetting.reportingFrequency) == null) {
            zbVarC = fgVar.c();
        }
        q3.b.a(q3.a, "event frequency is: " + fgVar.c() + " for event kind: " + fgVar.d(), this.a, (Throwable) null, 4, (Object) null);
        if (Intrinsics.LJFF(zbVarC, zb.d.h)) {
            if (k().b(fgVar.d()) == null) {
                return true;
            }
            return false;
        }
        if (zbVarC instanceof zb.e) {
            if (new SecureRandom().nextInt(((zb.e) zbVarC).h) == 0) {
                return true;
            }
            return false;
        }
        if (zbVarC instanceof zb.f) {
            qd qdVarB = k().b(fgVar.d());
            if (qdVarB == null || qdVarB.b.getTime() + ((zb.f) zbVarC).h < fgVar.h().getTime()) {
                return true;
            }
            return false;
        }
        if (zbVarC instanceof zb.a) {
            return true;
        }
        if (!(zbVarC instanceof zb.c)) {
            throw new C1954807lC();
        }
        return false;
    }

    public final void a(List<? extends fg<? extends b2>> list) {
        for (fg<? extends b2> fgVar : list) {
            e().b(fgVar.a());
            k().set(rd.a(fgVar));
        }
    }

    public final void b(fg<? extends b2> fgVar) {
        if (c(fgVar)) {
            e().set(fgVar);
            q3.b.a(q3.a, "Saves new event to DB: " + fgVar.d(), this.a, (Throwable) null, 4, (Object) null);
            return;
        }
        q3.b.a(q3.a, "Skip process new event to DB due to frequency: " + fgVar.d(), this.a, (Throwable) null, 4, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ttpobfuscated.d4.j
            if (r0 == 0) goto L6b
            r5 = r8
            ttpobfuscated.d4$j r5 = (ttpobfuscated.d4.j) r5
            int r2 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r5.c = r2
        L12:
            java.lang.Object r1 = r5.a
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.c
            r6 = 1
            if (r0 == 0) goto L25
            if (r0 != r6) goto L71
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.util.List r0 = r7.d()
            java.util.Iterator r3 = r0.iterator()
        L30:
            boolean r0 = r3.hasNext()
            java.lang.String r2 = "sample"
            r1 = 0
            if (r0 == 0) goto L48
            java.lang.Object r1 = r3.next()
            r0 = r1
            ttp.orbu.sdk.configuration.model.EventSetting r0 = (ttp.orbu.sdk.configuration.model.EventSetting) r0
            java.lang.String r0 = r0.eventType
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
            if (r0 == 0) goto L30
        L48:
            ttp.orbu.sdk.configuration.model.EventSetting r1 = (ttp.orbu.sdk.configuration.model.EventSetting) r1
            if (r1 == 0) goto L79
            int r1 = r1.maxEventBatchSize
            ttpobfuscated.o4 r0 = r7.e()
            java.util.List r0 = r0.a(r1, r2)
            java.lang.Object r1 = X.C13LP.LJJJLL(r0)
            boolean r0 = r1 instanceof ttpobfuscated.dd
            if (r0 == 0) goto L22
            ttpobfuscated.dd r1 = (ttpobfuscated.dd) r1
            if (r1 == 0) goto L22
            r5.c = r6
            java.lang.Object r0 = r7.a(r1, r5)
            if (r0 != r4) goto L22
            return r4
        L6b:
            ttpobfuscated.d4$j r5 = new ttpobfuscated.d4$j
            r5.<init>(r8)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.c(X.05Vn):java.lang.Object");
    }

    public final Object a(InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return C2296808zG.LJ(new e(null), interfaceC1364105Vn);
    }

    public final void b(List<EventSetting> list) {
        this.i = list;
    }

    public final void a(long j2) {
        this.l = j2;
    }

    public final void a(String str) {
        this.p = str;
    }

    public final void a(b6 b6Var) {
        this.f = b6Var;
    }

    public final void a(fe feVar) {
        this.g = feVar;
    }

    public final void a(j0 j0Var) {
        this.e = j0Var;
    }

    public final void a(j9 j9Var) {
        this.d = j9Var;
    }

    public final void a(k0 k0Var) {
        this.m = k0Var;
    }

    public final void a(kd kdVar) {
        this.h = kdVar;
    }

    public final void a(o4 o4Var) {
        this.b = o4Var;
    }

    public final void a(td tdVar) {
        this.c = tdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.dd r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) throws ttpobfuscated.r4 {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.a(ttpobfuscated.dd, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f5 -> B:12:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<? extends ttpobfuscated.fg<? extends ttpobfuscated.b2>> r16, X.InterfaceC1364105Vn<? super java.lang.Boolean> r17) throws ttpobfuscated.r4 {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.a(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) throws ttpobfuscated.r4 {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.a(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.uf r9, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r10) throws ttpobfuscated.r4 {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ttpobfuscated.d4.d
            if (r0 == 0) goto L9b
            r6 = r10
            ttpobfuscated.d4$d r6 = (ttpobfuscated.d4.d) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r7 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L57
            if (r0 == r3) goto L71
            if (r0 != r4) goto La2
            java.lang.Object r2 = r6.a
            ttpobfuscated.h0 r2 = (ttpobfuscated.h0) r2
            X.C155000ia.LIZIZ(r7)
        L29:
            ttpobfuscated.k0 r0 = r2.a
            java.lang.String r1 = r0.b
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "challenge_id"
            r6.<init>(r0, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "challenge_result"
            r5.<init>(r0, r7)
            java.lang.Integer r0 = r2.b
            java.lang.String r1 = r0.toString()
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r0 = "challenge_seed_id"
            r2.<init>(r0, r1)
            r0 = 3
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r0 = 0
            r1[r0] = r6
            r1[r3] = r5
            r1[r4] = r2
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r1)
            return r0
        L57:
            X.C155000ia.LIZIZ(r7)
            ttpobfuscated.k0 r1 = r8.m
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.HashCash
            if (r1 != r0) goto Lb2
            ttpobfuscated.b6 r0 = r8.f()
            r6.a = r8
            r6.d = r3
            java.lang.Object r7 = r0.a(r9, r6)
            if (r7 != r5) goto L6f
            return r5
        L6f:
            r2 = r8
            goto L78
        L71:
            java.lang.Object r2 = r6.a
            ttpobfuscated.d4 r2 = (ttpobfuscated.d4) r2
            X.C155000ia.LIZIZ(r7)
        L78:
            ttpobfuscated.h0 r7 = (ttpobfuscated.h0) r7
            ttpobfuscated.k0 r1 = r7.a
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.None
            if (r1 != r0) goto L85
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L85:
            java.lang.Integer r0 = r7.b
            if (r0 == 0) goto Laa
            ttpobfuscated.j0 r0 = r2.b()
            r6.a = r7
            r6.d = r4
            java.lang.Object r0 = r0.a(r7, r6)
            if (r0 != r5) goto L98
            return r5
        L98:
            r2 = r7
            r7 = r0
            goto L29
        L9b:
            ttpobfuscated.d4$d r6 = new ttpobfuscated.d4$d
            r6.<init>(r10)
            goto L12
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laa:
            ttpobfuscated.r4 r1 = new ttpobfuscated.r4
            java.lang.String r0 = "Challenge seed id cannot be null"
            r1.<init>(r0)
            throw r1
        Lb2:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.a(ttpobfuscated.uf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ttpobfuscated.d4.c
            if (r0 == 0) goto L79
            r6 = r9
            ttpobfuscated.d4$c r6 = (ttpobfuscated.d4.c) r6
            int r2 = r6.f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L79
            int r2 = r2 - r1
            r6.f = r2
        L12:
            java.lang.Object r5 = r6.d
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.f
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 == r1) goto L56
            if (r0 != r3) goto L7f
            java.lang.Object r2 = r6.b
            ttpobfuscated.d4 r2 = (ttpobfuscated.d4) r2
            java.lang.Object r0 = r6.a
            ttpobfuscated.d4 r0 = (ttpobfuscated.d4) r0
            X.C155000ia.LIZIZ(r5)
        L2d:
            X.09AE r5 = (X.C09AE) r5
            r2.n = r5
            ttpobfuscated.q3$a r1 = ttpobfuscated.q3.a
            java.lang.String r3 = r0.a
            java.lang.String r2 = "Scheduler activated"
            r4 = 0
            r5 = 4
            r6 = r4
            ttpobfuscated.q3.b.a(r1, r2, r3, r4, r5, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r5)
            X.09AE r0 = r7.n
            if (r0 == 0) goto L54
            r6.a = r7
            r6.c = r8
            r6.f = r1
            java.lang.Object r0 = X.C23118094a.LIZLLL(r0, r6)
            if (r0 != r4) goto L54
            return r4
        L54:
            r2 = r7
            goto L5f
        L56:
            boolean r8 = r6.c
            java.lang.Object r2 = r6.a
            ttpobfuscated.d4 r2 = (ttpobfuscated.d4) r2
            X.C155000ia.LIZIZ(r5)
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.o
            r0.set(r8)
            r6.a = r2
            r6.b = r2
            r6.f = r3
            ttpobfuscated.d4$e r1 = new ttpobfuscated.d4$e
            r0 = 0
            r1.<init>(r0)
            java.lang.Object r5 = X.C2296808zG.LJ(r1, r6)
            if (r5 != r4) goto L77
            return r4
        L77:
            r0 = r2
            goto L2d
        L79:
            ttpobfuscated.d4$c r6 = new ttpobfuscated.d4$c
            r6.<init>(r9)
            goto L12
        L7f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d4.a(boolean, X.05Vn):java.lang.Object");
    }

    public static final Object a(d4 d4Var, InterfaceC1364105Vn interfaceC1364105Vn) {
        d4Var.getClass();
        return C2296808zG.LJ(d4Var.new e(null), interfaceC1364105Vn);
    }

    public final void a(List<EventSetting> list, String str, long j2, k0 k0Var) {
        this.i = list;
        if (str == null) {
            str = "logId1";
        }
        this.p = str;
        this.l = j2;
        this.m = k0Var;
        q3.b.a(q3.a, "Finishes updateConfigProperties", this.a, (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ Object a(d4 d4Var, boolean z, InterfaceC1364105Vn interfaceC1364105Vn, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return d4Var.a(z, (InterfaceC1364105Vn<? super Unit>) interfaceC1364105Vn);
    }

    public d4(o4 o4Var, td tdVar, j9 j9Var, fe feVar, kd kdVar, b6 b6Var, j0 j0Var, List<EventSetting> list) {
        this();
        a(o4Var, tdVar, j9Var, feVar, kdVar, b6Var, j0Var, list);
    }

    public final void a(o4 o4Var, td tdVar, j9 j9Var, fe feVar, kd kdVar, b6 b6Var, j0 j0Var, List<EventSetting> list) {
        this.b = o4Var;
        this.c = tdVar;
        this.d = j9Var;
        this.g = feVar;
        this.h = kdVar;
        this.i = list;
        this.f = b6Var;
        this.e = j0Var;
        this.j = true;
        n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(d4 d4Var, o4 o4Var, td tdVar, j9 j9Var, fe feVar, kd kdVar, b6 b6Var, j0 j0Var, List list, int i2, Object obj) {
        if ((i2 & 128) != 0) {
            list = ((GeneralConfig) x.a.a(ConfigType.General.INSTANCE)).getEvents();
        }
        d4Var.a(o4Var, tdVar, j9Var, feVar, kdVar, b6Var, j0Var, list);
    }
}
