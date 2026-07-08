package ttpobfuscated;

import X.C01GW;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C189200o6;
import X.C1C7U;
import X.C2097908Jt;
import X.C452501pT;
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
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfigKt;
import ttp.orbu.sdk.requestvalidator.OrbuResult;
import ttp.orbu.sdk.requestvalidator.Request;
import ttpobfuscated.b9;
import ttpobfuscated.lb;
import ttpobfuscated.q3;
import ttpobfuscated.ra;
import ttpobfuscated.z5;

/* JADX INFO: loaded from: classes24.dex */
public final class df implements ra {
    public static final c r = new c();
    public final OrbuCodeConfig b;
    public final fe c;
    public final Map<String, Map<String, String>> d;
    public final ad<Request> e;
    public ttpobfuscated.g i;
    public ra.c j;
    public p7 k;
    public Map<Integer, Integer> l;
    public ByteBuffer m;
    public final s n;
    public final ByteBuffer q;
    public final String f = C13LE.LIZ(df.class).LJI();
    public final C01GW g = C452501pT.LIZIZ(e.a);
    public final C01GW h = C452501pT.LIZIZ(g.a);
    public boolean o = true;
    public final ConcurrentHashMap<Integer, a> p = new ConcurrentHashMap<>();

    public static final class b {
        public final a a;
        public int b;

        public final o7 b() {
            if (this.b >= this.a.a.size()) {
                return null;
            }
            List<o7> list = this.a.a;
            int i = this.b;
            this.b = i + 1;
            return (o7) ListProtector.get(list, i);
        }

        public final int a() {
            return this.b;
        }

        public b(a aVar) {
            this.a = aVar;
        }

        public final void a(byte b) throws pa {
            if (b > 0) {
                int i = (this.b + b) - 1;
                if (i >= 0 && i < this.a.a.size()) {
                    this.b = i;
                    return;
                }
                throw new pa("Instruction position after jump [" + i + "] is out of bounds");
            }
            throw new pa("Instruction offset [" + ((int) b) + "] should be more than 0");
        }
    }

    public static final class c {
    }

    public final class e extends C09AY implements Function0<j4> {
        public static final e a = new e();

        public e() {
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

    public final class g extends C09AY implements Function0<tg> {
        public static final g a = new g();

        public g() {
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

    public /* synthetic */ class d {
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

    public final j4 e() {
        return (j4) this.g.getValue();
    }

    public final tg h() {
        return (tg) this.h.getValue();
    }

    public static final class a {
        public final List<o7> a;

        public final List<o7> a() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends o7> list) {
            this.a = list;
        }
    }

    @Override // ttpobfuscated.ra
    public boolean a() {
        return this.o;
    }

    public final ttpobfuscated.g b() {
        return this.i;
    }

    public final Map<Integer, Integer> c() {
        return this.l;
    }

    public final ByteBuffer d() {
        return this.m;
    }

    public final ra.c f() {
        return this.j;
    }

    public final p7 g() {
        return this.k;
    }

    @C09DV(c = "ttp.orbu.sdk.requestvalidator.TTPOrbuCodeRuntime$updateInvalidRequestLogBucket$1", f = "TTPOrbuCodeRuntime.kt", l = {296, 297}, m = "invokeSuspend")
    public final class f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Integer e;
        public final /* synthetic */ df f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            df dfVar;
            b9 b9Var;
            Object objA = obj;
            C1C7U.LIZ("df@1277.a$1");
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
                    C1C7U.LIZIZ("df@1277.a$1");
                    return unit;
                }
                b9Var = (b9) this.a;
                dfVar = (df) this.c;
                C155000ia.LIZIZ(objA);
            } else {
                C155000ia.LIZIZ(objA);
                String str = this.d;
                Integer num = this.e;
                dfVar = this.f;
                String str2 = "request.invalid." + str.toLowerCase(Locale.ROOT);
                String strValueOf = String.valueOf(c9.AppVersion.a);
                v3.s.getClass();
                b9Var = new b9(UUID.randomUUID(), new Date(), new b9.b(str2, "", -1, 1, str, C2097908Jt.LIZJ(new Pair(strValueOf, (String) new z5.b(v3.u.h()).c.getValue())), C2097908Jt.LIZJ(new Pair(String.valueOf(f9.DataFlowId.a), String.valueOf(num)))));
                j4 j4VarA = df.a(dfVar);
                this.c = dfVar;
                this.a = b9Var;
                this.b = 1;
                objA = j4VarA.a(b9Var, this);
                if (objA == objLJFF) {
                    C1C7U.LIZIZ("df@1277.a$1");
                    return objLJFF;
                }
            }
            if (((Boolean) objA).booleanValue()) {
                j4 j4VarA2 = df.a(dfVar);
                this.c = null;
                this.a = null;
                this.b = 2;
                if (j4VarA2.b(b9Var, this) == objLJFF) {
                    C1C7U.LIZIZ("df@1277.a$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("df@1277.a$1");
            return unit2;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            f fVar = new f(this.d, this.e, this.f, interfaceC1364105Vn);
            fVar.c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Integer num, df dfVar, InterfaceC1364105Vn<? super f> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.d = str;
            this.e = num;
            this.f = dfVar;
        }
    }

    public final a a(int i) {
        a aVar;
        Long lA = nd.a(lb.j);
        synchronized (this.k) {
            try {
                if (i + 48 <= this.k.b()) {
                    o7 o7VarA = this.k.a(Integer.valueOf(i));
                    if (o7VarA instanceof o) {
                        int i2 = ((o) o7VarA).n;
                        if (i2 >= 2) {
                            if ((i2 * 24) + i <= this.k.b()) {
                                ArrayList arrayList = new ArrayList(i2);
                                arrayList.add(o7VarA);
                                int i3 = 1;
                                do {
                                    o7 o7VarA2 = this.k.a(Integer.valueOf((i3 * 24) + i));
                                    if (!(o7VarA2 instanceof o)) {
                                        if (i3 != i2 - 1) {
                                            if (o7VarA2 instanceof n) {
                                                throw new pa("Found BlockEnd inside the block");
                                            }
                                        } else if (!(o7VarA2 instanceof n)) {
                                            throw new pa("Final instruction must be BlockEnd. [" + o7VarA2.a + "] found");
                                        }
                                        arrayList.add(o7VarA2);
                                        i3++;
                                    } else {
                                        throw new pa("Found BlockStart inside the block");
                                    }
                                } while (i3 < i2);
                                lb.j.getClass();
                                lb.a(lb.k, "CodeBlock.build", lA, false, null, 12, null);
                                aVar = new a(arrayList);
                            } else {
                                throw new pa("Instruction buffer should have at least [" + i2 + "] instructions starting from [" + i + "] offset");
                            }
                        } else {
                            throw new pa("Instruction count must be at least 2. [" + i2 + "] found");
                        }
                    } else {
                        throw new pa("First instruction must be BlockStart. [" + o7VarA.a + "] found");
                    }
                } else {
                    throw new pa("Instruction buffer should have at least [2] instructions starting from [" + i + "] offset");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return aVar;
    }

    public final a b(int i) {
        a aVarPutIfAbsent;
        a aVarA = this.p.get(Integer.valueOf(i));
        if (aVarA == null && (aVarPutIfAbsent = this.p.putIfAbsent(Integer.valueOf(i), (aVarA = a(i)))) != null) {
            return aVarPutIfAbsent;
        }
        return aVarA;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ttp.orbu.sdk.requestvalidator.OrbuResult a(ttpobfuscated.cc r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.df.a(ttpobfuscated.cc):ttp.orbu.sdk.requestvalidator.OrbuResult");
    }

    public final ra.c b(ByteBuffer byteBuffer) {
        return new ra.c(byteBuffer.get(), byteBuffer.get());
    }

    public final ByteBuffer a(ByteBuffer byteBuffer) throws pa {
        lb.a aVar = lb.j;
        Long lA = nd.a(aVar);
        ByteBuffer byteBufferA = z.a(byteBuffer, Integer.valueOf(byteBuffer.getInt()), byteBuffer.getInt(), true);
        aVar.getClass();
        lb.a(lb.k, "ByteBuffer.readSection", lA, false, null, 12, null);
        return byteBufferA;
    }

    public static final j4 a(df dfVar) {
        return (j4) dfVar.g.getValue();
    }

    @Override // ttpobfuscated.ra
    public void a(boolean z) {
        this.o = z;
    }

    public final boolean a(o7 o7Var, tc tcVar) {
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

    public final void a(Integer num, String str) {
        d2.a.a(new f(str, num, this, null));
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

    public final OrbuResult b(cc ccVar, ib ibVar, fc fcVar) {
        Object obj;
        int iIntValue;
        try {
            lb.j.getClass();
            Long lC = lb.k.c();
            Integer numC = ccVar.b.c();
            OrbuResult orbuResultA = a(ccVar);
            OrbuResult orbuResult = orbuResultA;
            if (orbuResultA == null) {
                Integer num = this.l.get(numC);
                int iIntValue2 = 0;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (ibVar != null) {
                    if (numC != null) {
                        iIntValue2 = numC.intValue();
                    }
                    ibVar.a(iIntValue2, iIntValue);
                }
                this.e.add(ccVar.b);
                OrbuResult orbuResultA2 = a(b(iIntValue), ccVar, ibVar, 0, new qa(this.m.duplicate().order(ByteOrder.LITTLE_ENDIAN)));
                OrbuResult orbuResult2 = orbuResultA2;
                if (orbuResultA2 == null) {
                    orbuResult2 = OrbuResult.a.a;
                }
                if (ibVar != null) {
                    ibVar.a(orbuResult2, (Throwable) null);
                }
                lb.a(lb.k, ccVar.a + ".processOrbuCodeRequest", lC, false, null, 12, null);
                orbuResult = orbuResult2;
            }
            C189200o6.m2constructorimpl(orbuResult);
            obj = orbuResult;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
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

    /* JADX WARN: Multi-variable type inference failed */
    public df(OrbuCodeConfig orbuCodeConfig, fe feVar, GeneralConfig generalConfig, Map<String, ? extends Map<String, String>> map, ad<Request> adVar) throws pa {
        this.b = orbuCodeConfig;
        this.c = feVar;
        this.d = map;
        this.e = adVar;
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(OrbuCodeConfigKt.getOrbuCode(orbuCodeConfig)).asReadOnlyBuffer().order(ByteOrder.LITTLE_ENDIAN);
        this.q = byteBufferOrder;
        Long lC = lb.j.a().c();
        if (Intrinsics.LJFF(z.a(byteBufferOrder, (Integer) null, 8, (Charset) null, 5, (Object) null), "OrbuCode")) {
            this.j = b(byteBufferOrder);
            this.i = ttpobfuscated.g.b.a((short) (byteBufferOrder.get() | (byteBufferOrder.get() << 8)));
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
            if (bh.c.a().a("0.17")) {
                this.k = new q7(a(this.q), tVar, generalConfig, this.b, h(), e(), this.e);
            } else {
                this.k = new r7(a(this.q), tVar, this.e);
            }
            for (Integer num : concurrentHashMap.values()) {
                o7 o7VarA = this.k.a(num);
                if (o7VarA.g() != ha.BlockStart) {
                    throw new pa("OpCode at offset [" + num.intValue() + "] must be BlockStart, but found [" + o7VarA.g() + ']');
                }
            }
            this.m = a(this.q).asReadOnlyBuffer();
            lb.a(lb.j.a(), "TTPOrbuCodeRuntime.init", lC, false, null, 12, null);
            return;
        }
        throw new pa("Wrong header magic number");
    }

    public final OrbuResult a(a aVar, cc ccVar, ib ibVar, int i, xc xcVar) throws pa {
        Long lA = nd.a(lb.j);
        b bVar = new b(aVar);
        for (o7 o7VarB = bVar.b(); o7VarB != null; o7VarB = bVar.b()) {
            if (ibVar != null) {
                q3.b.a(q3.a, this.f, ibVar.a(o7VarB, xcVar), (Throwable) null, 4, (Object) null);
            }
            tc tcVarA = o7VarB.a(xcVar, ccVar);
            if (ibVar != null) {
                ibVar.a(bVar.b, i, o7VarB, xcVar, tcVarA);
            }
            OrbuResult orbuResultA = a(bVar, ccVar, ibVar, o7VarB, i, tcVarA, xcVar);
            if (orbuResultA != null) {
                lb.j.getClass();
                lb.a(lb.k, "CodeBlock.run", lA, false, null, 12, null);
                return orbuResultA;
            }
            if (o7VarB.a == ha.BlockEnd) {
                break;
            }
        }
        lb.j.getClass();
        lb.a(lb.k, "CodeBlock.run", lA, false, null, 12, null);
        return null;
    }

    public final OrbuResult a(b bVar, cc ccVar, ib ibVar, o7 o7Var, int i, tc tcVar, xc xcVar) throws pa {
        if (tcVar == tc.NoOp) {
            if (!(o7Var instanceof n) && (o7Var instanceof a0)) {
                if (i < 1) {
                    return a(b(((a0) o7Var).m), ccVar, ibVar, i + 1, xcVar);
                }
                throw new pa("Unsupported CallBlock depth [" + (i + 1) + ']');
            }
            return null;
        }
        int i2 = d.a[o7Var.d.ordinal()];
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 == 5 && a(o7Var, tcVar)) {
                        return new OrbuResult.e(o7Var.j);
                    }
                    return null;
                }
                if (a(o7Var, tcVar)) {
                    bVar.a(o7Var.k);
                    return null;
                }
                return null;
            }
            if (a(o7Var, tcVar)) {
                return OrbuResult.d.a;
            }
            return null;
        }
        if (a(o7Var, tcVar)) {
            return OrbuResult.a.a;
        }
        return null;
    }
}
