package ttpobfuscated;

import X.AbstractC23140094w;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C1507240pKE;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ttp.orbu.sdk.requestvalidator.Request;

/* JADX INFO: loaded from: classes24.dex */
public final class hd extends o7 {
    public final s m;
    public final j4 n;
    public final tg o;
    public final u1 p;
    public final u1 q;
    public final ad<Request> r;

    @C09DV(c = "ttp.orbu.sdk.app.domain.runtime.instruction.SampleInstruction", f = "SampleInstruction.kt", l = {102, 132, 133}, m = "createSampling")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public int h;
        public /* synthetic */ Object i;
        public int k;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("hd@11fd.a$1");
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            Object objA = hd.this.a(null, null, 0, this);
            C1C7U.LIZIZ("hd@11fd.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.runtime.instruction.SampleInstruction$run$1", f = "SampleInstruction.kt", l = {59}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ cc d;
        public final /* synthetic */ int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("hd@11fd.a$2");
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
                hd hdVar = hd.this;
                String str = this.c;
                cc ccVar = this.d;
                int i2 = this.e;
                this.a = 1;
                if (hdVar.a(str, ccVar, i2, this) == objLJFF) {
                    C1C7U.LIZIZ("hd@11fd.a$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("hd@11fd.a$2");
            return unit;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return hd.this.new b(this.c, this.d, this.e, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, cc ccVar, int i, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = str;
            this.d = ccVar;
            this.e = i;
        }
    }

    @Override // ttpobfuscated.o7
    public String a(xc xcVar) {
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
        d2.a.a(new b(string, ccVar, c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 2)).LL), null));
        return tc.True;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[Catch: all -> 0x01b9, TryCatch #0 {all -> 0x01b9, blocks: (B:69:0x01b0, B:70:0x01b3, B:63:0x0194, B:64:0x0197, B:66:0x019f, B:54:0x011a, B:55:0x011d, B:57:0x0167, B:60:0x016d, B:19:0x006c, B:21:0x0084, B:23:0x0087, B:25:0x008d, B:28:0x0093, B:29:0x0099, B:31:0x00a4, B:34:0x00aa, B:35:0x00b0, B:37:0x00bb, B:40:0x00c1, B:41:0x00d0, B:43:0x00d6, B:44:0x00e9, B:47:0x00f1, B:50:0x00fd, B:49:0x00f7), top: B:75:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r24, ttpobfuscated.cc r25, int r26, X.InterfaceC1364105Vn<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.hd.a(java.lang.String, ttpobfuscated.cc, int, X.05Vn):java.lang.Object");
    }

    public hd(List<C1507240pKE> list, s sVar, j4 j4Var, tg tgVar, u1 u1Var, u1 u1Var2, ad<Request> adVar) {
        super(ha.Sample, list);
        this.m = sVar;
        this.n = j4Var;
        this.o = tgVar;
        this.p = u1Var;
        this.q = u1Var2;
        this.r = adVar;
    }
}
