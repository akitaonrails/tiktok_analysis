package ttpobfuscated;

import X.AbstractC23273099z;
import X.AnonymousClass0956;
import X.C09AE;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LE;
import X.C19719612Di;
import X.C23250099c;
import X.C817503Hh;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class d2 {
    public static final d2 a = new d2();
    public static final String b = C13LE.LIZ(d2.class).LJI();
    public static final ConcurrentLinkedDeque<C09AE> c = new ConcurrentLinkedDeque<>();

    public final void b() {
        while (true) {
            ConcurrentLinkedDeque<C09AE> concurrentLinkedDeque = c;
            if (!(!concurrentLinkedDeque.isEmpty())) {
                return;
            }
            C09AE c09aePollLast = concurrentLinkedDeque.pollLast();
            if (c09aePollLast != null) {
                c09aePollLast.LIZIZ(null);
            }
        }
    }

    public final void d() {
        C19719612Di.LJJIII(c, b.a, true);
    }

    public final ConcurrentLinkedDeque<C09AE> c() {
        return c;
    }

    /* JADX INFO: loaded from: classes4.dex */
    @C09DV(c = "ttp.orbu.sdk.coroutines.CoroutinesManager$launchGlobalCoroutineIO$1", f = "CoroutinesManager.kt", l = {29}, m = "invokeSuspend")
    public final class a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> c;

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to ttpobfuscated.d2$a for r11v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // njp.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.String r4 = "d2@12ab.a$1"
                X.C1C7U.LIZ(r4)
                java.lang.Object r3 = X.C099R.LJFF()
                int r0 = r11.a
                r2 = 1
                if (r0 == 0) goto L19
                if (r0 != r2) goto L11
                goto L2c
            L11:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L19:
                X.C155000ia.LIZIZ(r12)
                java.lang.Object r1 = r11.b
                kotlin.jvm.functions.Function2<X.01wk, X.05Vn<? super kotlin.Unit>, java.lang.Object> r0 = r11.c
                r11.a = r2     // Catch: java.lang.Throwable -> L35
                java.lang.Object r0 = r0.invoke(r1, r11)     // Catch: java.lang.Throwable -> L35
                if (r0 != r3) goto L2f
                X.C1C7U.LIZIZ(r4)
                return r3
            L2c:
                X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> L35
            L2f:
                kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L35
                X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L35
                goto L41
            L35:
                r1 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
                X.00Yq r0 = new X.00Yq
                r0.<init>(r1)
                X.C189200o6.m2constructorimpl(r0)
            L41:
                java.lang.Throwable r2 = X.C189200o6.m5exceptionOrNullimpl(r0)
                if (r2 == 0) goto L64
                ttpobfuscated.q3$a r5 = ttpobfuscated.q3.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r0 = "Unexpected error happened in GlobalScope coroutine, error details: "
                r1.<init>(r0)
                java.lang.String r0 = r2.getMessage()
                r1.append(r0)
                java.lang.String r6 = r1.toString()
                java.lang.String r7 = ttpobfuscated.d2.b
                r8 = 0
                r9 = 4
                r10 = r8
                ttpobfuscated.q3.b.b(r5, r6, r7, r8, r9, r10)
            L64:
                kotlin.Unit r0 = kotlin.Unit.LIZ
                X.C1C7U.LIZIZ(r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.d2.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            a aVar = new a(this.c, interfaceC1364105Vn);
            aVar.b = interfaceC497601wk;
            return aVar.invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            a aVar = new a(this.c, interfaceC1364105Vn);
            aVar.b = obj;
            return aVar;
        }
    }

    public final class b extends C09AY implements Function1<C09AE, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C09AE c09ae) {
            boolean z;
            if (c09ae != null && !c09ae.isCompleted() && !c09ae.isCancelled()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public final C09AE a(Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        C817503Hh c817503Hh = C817503Hh.LL;
        bf.a.getClass();
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(c817503Hh, (AbstractC23273099z) bf.b.getValue(), null, new a(function2, null), 2);
        a.getClass();
        ConcurrentLinkedDeque<C09AE> concurrentLinkedDeque = c;
        C19719612Di.LJJIII(concurrentLinkedDeque, b.a, true);
        concurrentLinkedDeque.add(anonymousClass0956LIZLLL);
        q3.b.a(q3.a, "Invoke launchGlobalCoroutineIO, current job pool: " + concurrentLinkedDeque.size(), b, (Throwable) null, 4, (Object) null);
        return anonymousClass0956LIZLLL;
    }
}
