package ttpobfuscated;

import X.C01GW;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LE;
import X.C13LZ;
import X.C15438062q;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.C2097908Jt;
import X.C452501pT;
import X.C531650Kt9;
import X.InterfaceC1294060jmO;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfigKt;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttp.orbu.sdk.requestvalidator.Request;
import ttpobfuscated.b9;
import ttpobfuscated.lb;
import ttpobfuscated.p7;
import ttpobfuscated.q3;
import ttpobfuscated.ra;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC1294060jmO
public final class ef implements ra {
    public static final b r = new b();
    public final OrbuCodeConfig b;
    public final fe c;
    public final Map<String, Map<String, String>> d;
    public final ad<Request> e;
    public g i;
    public ra.c j;
    public p7 k;
    public Map<Integer, Integer> l;
    public xc m;
    public final s n;
    public final ByteBuffer q;
    public final String f = C13LE.LIZ(ef.class).LJI();
    public final C01GW g = C452501pT.LIZIZ(d.a);
    public final C01GW h = C452501pT.LIZIZ(f.a);
    public boolean o = true;
    public final HashMap<Integer, a> p = new HashMap<>();

    public static final class a {
        public final List<o7> a;
        public int b;

        public final o7 a() {
            List<o7> list = this.a;
            int i = this.b;
            this.b = i + 1;
            return (o7) ListProtector.get(list, i);
        }

        public final int b() {
            return this.b;
        }

        public final void a(byte b) throws pa {
            if (b > 0) {
                int i = (this.b + b) - 1;
                if (i <= this.a.size() - 1) {
                    this.b = i;
                    return;
                }
                throw new pa("Instruction position after jump [" + i + "] is out of bounds");
            }
            throw new pa("Instruction offset [" + ((int) b) + "] should be more than 0");
        }

        public final void a(int i) {
            this.b = i;
        }

        public a(p7 p7Var, int i) throws pa {
            Long lC = lb.j.a().c();
            if (i + 48 <= p7Var.b()) {
                o7 o7VarA = p7Var.a(Integer.valueOf(i));
                if (o7VarA instanceof o) {
                    int iM = ((o) o7VarA).m();
                    if (iM >= 2) {
                        if ((iM * 24) + i <= p7Var.b()) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(o7VarA);
                            IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(1, iM);
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                            C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                            while (it2.LLILLL) {
                                int iNextInt = it2.nextInt();
                                o7 o7VarA2 = p7.a.a(p7Var, null, 1, null);
                                if (!(o7VarA2 instanceof o)) {
                                    if (iNextInt != iM - 1) {
                                        if (o7VarA2 instanceof n) {
                                            throw new pa("Found BlockEnd inside the block");
                                        }
                                    } else if (!(o7VarA2 instanceof n)) {
                                        throw new pa("Final instruction must be BlockEnd. [" + o7VarA2.g() + "] found");
                                    }
                                    arrayList2.add(o7VarA2);
                                } else {
                                    throw new pa("Found BlockStart inside the block");
                                }
                            }
                            arrayList.addAll(arrayList2);
                            this.a = arrayList;
                            lb.a(lb.j.a(), "CodeBlock.init", lC, false, null, 12, null);
                            return;
                        }
                        throw new pa("Instruction buffer should have at least [" + iM + "] instructions starting from [" + i + "] offset");
                    }
                    throw new pa("Instruction count must be at least 2. [" + iM + "] found");
                }
                throw new pa("First instruction must be BlockStart. [" + o7VarA.g() + "] found");
            }
            throw new pa("Instruction buffer should have at least [2] instructions starting from [" + i + "] offset");
        }
    }

    public static final class b {
    }

    public final class d extends C09AY implements Function0<j4> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        public final j4 a() {
            return ua.a.b().f().l();
        }

        @Override // kotlin.jvm.functions.Function0
        public j4 invoke() {
            return ua.a.b().f().l();
        }
    }

    public final class f extends C09AY implements Function0<tg> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        public final tg a() {
            return ua.a.b().f().F();
        }

        @Override // kotlin.jvm.functions.Function0
        public tg invoke() {
            return ua.a.b().f().F();
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[y1.values().length];
            try {
                iArr[y1.Continue.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[y1.ApproveIf.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[y1.RejectIf.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[y1.JumpIf.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[y1.ReturnCodeIf.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            a = iArr;
        }
    }

    private final j4 d() {
        return (j4) this.g.getValue();
    }

    private final tg h() {
        return (tg) this.h.getValue();
    }

    @Override // ttpobfuscated.ra
    public boolean a() {
        return this.o;
    }

    public final g b() {
        return this.i;
    }

    public final Map<Integer, Integer> c() {
        return this.l;
    }

    public final ra.c e() {
        return this.j;
    }

    public final p7 f() {
        return this.k;
    }

    public final xc g() {
        return this.m;
    }

    @C09DV(c = "ttp.orbu.sdk.requestvalidator.TTPOrbuCodeRuntimeV16$updateInvalidRequestLogBucket$1", f = "TTPOrbuCodeRuntimeV16.kt", l = {316, 317}, m = "invokeSuspend")
    public final class e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ ef f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            ef efVar;
            b9 b9Var;
            Object objA = obj;
            C1C7U.LIZ("ef@1258.a$1");
            Object objLJFF = C099R.LJFF();
            int i = this.b;
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objA);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ef@1258.a$1");
                    return unit;
                }
                b9Var = (b9) this.a;
                efVar = (ef) this.c;
                C155000ia.LIZIZ(objA);
            } else {
                C155000ia.LIZIZ(objA);
                String str = this.d;
                Integer num = this.e;
                efVar = this.f;
                String str2 = "request.invalid." + str.toLowerCase(Locale.ROOT);
                String strValueOf = String.valueOf(c9.AppVersion.a);
                v3.s.getClass();
                b9Var = new b9(UUID.randomUUID(), new Date(), new b9.b(str2, "", -1, 1, str, C2097908Jt.LIZJ(new Pair(strValueOf, (String) new z5.b(v3.u.h()).c.getValue())), C2097908Jt.LIZJ(new Pair(String.valueOf(f9.DataFlowId.a), String.valueOf(num)))));
                j4 j4VarA = ef.a(efVar);
                this.c = efVar;
                this.a = b9Var;
                this.b = 1;
                objA = j4VarA.a(b9Var, this);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("ef@1258.a$1");
                    return objLJFF;
                }
            }
            if (((Boolean) objA).booleanValue()) {
                j4 j4VarA2 = ef.a(efVar);
                this.c = null;
                this.a = null;
                this.b = 2;
                if (j4VarA2.b(b9Var, this) == objLJFF) {
                    C1C7U.LIZIZ("ef@1258.a$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ef@1258.a$1");
            return unit2;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            e eVar = new e(this.d, this.e, this.f, interfaceC1364105Vn);
            eVar.c = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Integer num, ef efVar, InterfaceC1364105Vn<? super e> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.d = str;
            this.e = num;
            this.f = efVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final ttp.orbu.sdk.requestvalidator.OrbuResult a(ttpobfuscated.cc r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ef.a(ttpobfuscated.cc):ttp.orbu.sdk.requestvalidator.OrbuResult");
    }

    private final ra.c b(ByteBuffer byteBuffer) {
        return new ra.c(byteBuffer.get(), byteBuffer.get());
    }

    private final ByteBuffer a(ByteBuffer byteBuffer) throws pa {
        lb.a aVar = lb.j;
        Long lA = nd.a(aVar);
        ByteBuffer byteBufferA = z.a(byteBuffer, Integer.valueOf(byteBuffer.getInt()), byteBuffer.getInt(), true);
        aVar.getClass();
        lb.a(lb.k, "ByteBuffer.readSection", lA, false, null, 12, null);
        return byteBufferA;
    }

    public final a a(int i) {
        a aVar = this.p.get(Integer.valueOf(i));
        if (aVar == null) {
            a aVar2 = new a(this.k, i);
            this.p.put(Integer.valueOf(i), aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static final j4 a(ef efVar) {
        return (j4) efVar.g.getValue();
    }

    @Override // ttpobfuscated.ra
    public void a(boolean z) {
        this.o = z;
    }

    private final boolean a(o7 o7Var, tc tcVar) {
        tc tcVar2 = o7Var.g;
        tc tcVar3 = tc.AnyResult;
        if (tcVar2 != tcVar3 && tcVar != tcVar3) {
            if (o7Var.f == uc.Equal) {
                if (tcVar2.a == tcVar.a) {
                    return true;
                }
                return false;
            }
            if (tcVar2.a != tcVar.a) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // ttpobfuscated.ra
    public OrbuResult a(Throwable th, fc fcVar) {
        if (fcVar != null) {
            fcVar.a(String.valueOf(th));
        }
        return this.b.getStrategy().result;
    }

    private final void a(Integer num, String str) {
        d2.a.a(new e(str, num, this, null));
    }

    private final OrbuResult b(cc ccVar, ib ibVar, fc fcVar) {
        Object obj;
        int iIntValue;
        OrbuResult orbuResult;
        int iIntValue2;
        try {
            lb.j.getClass();
            Long lC = lb.k.c();
            Integer numC = ccVar.b.c();
            OrbuResult orbuResultA = a(ccVar);
            OrbuResult orbuResult2 = orbuResultA;
            if (orbuResultA == null) {
                Integer num = this.l.get(numC);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (ibVar != null) {
                    if (numC == null) {
                        iIntValue2 = 0;
                    } else {
                        iIntValue2 = numC.intValue();
                    }
                    ibVar.a(iIntValue2, iIntValue);
                }
                this.e.add(ccVar.b);
                v3.s.getClass();
                synchronized (v3.t) {
                    try {
                        this.e.add(ccVar.b);
                        OrbuResult orbuResultA2 = a(a(iIntValue), ccVar, ibVar, 0);
                        orbuResult = orbuResultA2;
                        if (orbuResultA2 == null) {
                            orbuResult = OrbuResult.a.a;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (ibVar != null) {
                    ibVar.a(orbuResult, (Throwable) null);
                }
                lb.a(lb.k, ccVar.a + ".processOrbuCodeRequest", lC, false, null, 12, null);
                orbuResult2 = orbuResult;
            }
            C189200o6.m2constructorimpl(orbuResult2);
            obj = orbuResult2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C098200Yq c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object obj2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            OrbuResult orbuResultA3 = a(thM5exceptionOrNullimpl, fcVar);
            obj2 = orbuResultA3;
            if (ibVar != null) {
                ibVar.a(orbuResultA3, thM5exceptionOrNullimpl);
                obj2 = orbuResultA3;
            }
        }
        return (OrbuResult) obj2;
    }

    @Override // ttpobfuscated.ra
    public OrbuResult a(cc ccVar, ib ibVar, fc fcVar) {
        if (this.o) {
            this.c.a(ccVar.b);
            ec.a(this.d);
            return b(ccVar, ibVar, fcVar);
        }
        q3.b.d(q3.a, "OrbuCodeRuntime is not enabled, return default result:OrbuResult.Approve", this.f, null, 4, null);
        return OrbuResult.a.a;
    }

    public final OrbuResult a(a aVar, cc ccVar, ib ibVar, int i) throws pa {
        OrbuResult orbuResultA;
        Long lA = nd.a(lb.j);
        aVar.b = 0;
        o7 o7VarA = aVar.a();
        while (o7VarA != null) {
            if (ibVar != null) {
                q3.b.a(q3.a, this.f, ibVar.a(o7VarA, this.m), (Throwable) null, 4, (Object) null);
            }
            tc tcVarA = o7VarA.a(this.m, ccVar);
            if (ibVar != null) {
                ibVar.a(aVar.b, i, o7VarA, this.m, tcVarA);
            }
            orbuResultA = a(aVar, ccVar, ibVar, o7VarA, i, tcVarA);
            if (orbuResultA == null) {
                if (o7VarA.a == ha.BlockEnd) {
                    break;
                }
                o7VarA = aVar.a();
            } else {
                break;
            }
        }
        orbuResultA = null;
        lb.j.getClass();
        lb.a(lb.k, "CodeBlock.run", lA, false, null, 12, null);
        return orbuResultA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ef(OrbuCodeConfig orbuCodeConfig, fe feVar, GeneralConfig generalConfig, Map<String, ? extends Map<String, String>> map, ad<Request> adVar) throws pa {
        this.b = orbuCodeConfig;
        this.c = feVar;
        this.d = map;
        this.e = adVar;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(OrbuCodeConfigKt.getOrbuCode(orbuCodeConfig)).asReadOnlyBuffer().order(ByteOrder.LITTLE_ENDIAN);
        this.q = byteBufferOrder;
        Long lC = lb.j.a().c();
        if (Intrinsics.LJFF(z.a(byteBufferOrder, (Integer) null, 8, (Charset) null, 5, (Object) null), "OrbuCode")) {
            this.j = b(byteBufferOrder);
            this.i = g.b.a((short) (byteBufferOrder.get() | (byteBufferOrder.get() << 8)));
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            IntBuffer intBufferAsIntBuffer = a(byteBufferOrder).asIntBuffer();
            while (intBufferAsIntBuffer.hasRemaining()) {
                int i = intBufferAsIntBuffer.get();
                if (intBufferAsIntBuffer.hasRemaining()) {
                    concurrentHashMap.put(Integer.valueOf(i), Integer.valueOf(intBufferAsIntBuffer.get()));
                } else {
                    throw new pa("Missing dataFlowId code block offset");
                }
            }
            this.l = concurrentHashMap;
            t tVar = new t();
            this.n = tVar;
            this.k = new q7(a(this.q), tVar, generalConfig, this.b, h(), d(), this.e);
            for (Integer num : concurrentHashMap.values()) {
                o7 o7VarA = this.k.a(num);
                if (o7VarA.g() != ha.BlockStart) {
                    throw new pa("OpCode at offset [" + num.intValue() + "] must be BlockStart, but found [" + o7VarA.g() + ']');
                }
            }
            this.m = new qa(a(this.q));
            lb.a(lb.j.a(), "TTPOrbuCodeRuntime.init", lC, false, null, 12, null);
            return;
        }
        throw new pa("Wrong header magic number");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ttp.orbu.sdk.requestvalidator.OrbuResult a(ttpobfuscated.ef.a r10, ttpobfuscated.cc r11, ttpobfuscated.ib r12, ttpobfuscated.o7 r13, int r14, ttpobfuscated.tc r15) throws ttpobfuscated.pa {
        /*
            r9 = this;
            ttpobfuscated.lb$a r2 = ttpobfuscated.lb.j
            java.lang.Long r4 = ttpobfuscated.nd.a(r2)
            ttpobfuscated.tc r0 = ttpobfuscated.tc.NoOp
            if (r15 != r0) goto L34
            boolean r0 = r13 instanceof ttpobfuscated.n
            if (r0 != 0) goto L75
            boolean r0 = r13 instanceof ttpobfuscated.a0
            if (r0 == 0) goto L75
            r0 = 1
            if (r14 >= r0) goto L77
            ttpobfuscated.a0 r13 = (ttpobfuscated.a0) r13
            int r0 = r13.m
            ttpobfuscated.ef$a r1 = r9.a(r0)
            int r0 = r14 + 1
            ttp.orbu.sdk.requestvalidator.OrbuResult r1 = r9.a(r1, r11, r12, r0)
        L23:
            r2.getClass()
            ttpobfuscated.lb r2 = ttpobfuscated.lb.k
            java.lang.String r3 = "CodeBlock.processReturnCode"
            r5 = 0
            r6 = 0
            r7 = 12
            r8 = r6
            ttpobfuscated.lb.a(r2, r3, r4, r5, r6, r7, r8)
            return r1
        L34:
            ttpobfuscated.y1 r0 = r13.d
            int[] r1 = ttpobfuscated.ef.c.a
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 2
            if (r1 == r0) goto L61
            r0 = 3
            if (r1 == r0) goto L58
            r0 = 4
            if (r1 == r0) goto L6a
            r0 = 5
            if (r1 != r0) goto L75
            boolean r0 = r9.a(r13, r15)
            if (r0 == 0) goto L75
            ttp.orbu.sdk.requestvalidator.OrbuResult$e r1 = new ttp.orbu.sdk.requestvalidator.OrbuResult$e
            byte r0 = r13.j
            r1.<init>(r0)
            goto L23
        L58:
            boolean r0 = r9.a(r13, r15)
            if (r0 == 0) goto L75
            ttp.orbu.sdk.requestvalidator.OrbuResult$d r1 = ttp.orbu.sdk.requestvalidator.OrbuResult.d.a
            goto L23
        L61:
            boolean r0 = r9.a(r13, r15)
            if (r0 == 0) goto L75
            ttp.orbu.sdk.requestvalidator.OrbuResult$a r1 = ttp.orbu.sdk.requestvalidator.OrbuResult.a.a
            goto L23
        L6a:
            boolean r0 = r9.a(r13, r15)
            if (r0 == 0) goto L75
            byte r0 = r13.k
            r10.a(r0)
        L75:
            r1 = 0
            goto L23
        L77:
            ttpobfuscated.pa r2 = new ttpobfuscated.pa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported CallBlock depth ["
            r1.<init>(r0)
            int r0 = r14 + 1
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ef.a(ttpobfuscated.ef$a, ttpobfuscated.cc, ttpobfuscated.ib, ttpobfuscated.o7, int, ttpobfuscated.tc):ttp.orbu.sdk.requestvalidator.OrbuResult");
    }
}
