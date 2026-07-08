package ttpobfuscated;

import X.AbstractC23140094w;
import X.AnonymousClass0957;
import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1507240pKE;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class gd extends o7 {
    public final s m;
    public final j4 n;
    public final C01GW<AnonymousClass0957<jg>> o;
    public final ad<Request> p;

    @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.SampleInstruction", f = "SampleInstruction.kt", l = {93, 110, 111}, m = "createSampling")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public /* synthetic */ Object h;
        public int j;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("gd@121c.a$1");
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object objA = gd.this.a(null, null, this);
            C1C7U.LIZIZ("gd@121c.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.orbucode.instructions.SampleInstruction$run$1", f = "SampleInstruction.kt", l = {52}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ cc d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("gd@121c.a$2");
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
                gd gdVar = gd.this;
                String str = this.c;
                cc ccVar = this.d;
                this.a = 1;
                if (gdVar.a(str, ccVar, this) == objLJFF) {
                    C1C7U.LIZIZ("gd@121c.a$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("gd@121c.a$2");
            return unit;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return gd.this.new b(this.c, this.d, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, cc ccVar, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = str;
            this.d = ccVar;
        }
    }

    public final String d(xc xcVar) {
        String str;
        ed edVar;
        String string = kotlin.text.a0.LJLIIIL(c(xcVar).toLowerCase(Locale.ROOT)).toString();
        p pVarB = this.m.b(string);
        StringBuilder sb = new StringBuilder(" actualBucketId: ");
        sb.append(string);
        sb.append("; bucketId: ");
        Integer numValueOf = null;
        if (pVarB != null) {
            str = pVarB.a;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("; frequencyId: ");
        if (pVarB != null && (edVar = pVarB.b) != null) {
            numValueOf = Integer.valueOf(edVar.a);
        }
        sb.append(numValueOf);
        return sb.toString();
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        String string = kotlin.text.a0.LJLIIIL(c(xcVar).toLowerCase(Locale.ROOT)).toString();
        if (!this.m.a(string)) {
            return tc.False;
        }
        d2.a.a(new b(string, ccVar, null));
        return tc.True;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187 A[Catch: all -> 0x01a0, TryCatch #0 {all -> 0x01a0, blocks: (B:77:0x0197, B:78:0x019a, B:71:0x017c, B:72:0x017f, B:74:0x0187, B:61:0x0133, B:62:0x0136, B:63:0x0138, B:65:0x014c, B:68:0x0152, B:19:0x0069, B:21:0x0071, B:23:0x0074, B:25:0x007a, B:28:0x0080, B:29:0x0086, B:31:0x0091, B:34:0x0097, B:35:0x009d, B:37:0x00ad, B:40:0x00b3, B:41:0x00c2, B:43:0x00c8, B:44:0x00db, B:45:0x00e1, B:47:0x00e7, B:49:0x00ed, B:50:0x00f1, B:52:0x0107, B:54:0x010f, B:57:0x0126), top: B:83:0x0026 }] */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r23, ttpobfuscated.cc r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.gd.a(java.lang.String, ttpobfuscated.cc, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gd(List<C1507240pKE> list, s sVar, j4 j4Var, C01GW<? extends AnonymousClass0957<jg>> c01gw, ad<Request> adVar) {
        super(ha.Sample, list);
        this.m = sVar;
        this.n = j4Var;
        this.o = c01gw;
        this.p = adVar;
    }
}
