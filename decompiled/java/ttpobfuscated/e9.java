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
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes24.dex */
public final class e9 extends o7 {
    public final s m;
    public final tg n;
    public final u1 o;
    public final u1 p;
    public final j4 q;

    @C09DV(c = "ttp.orbu.sdk.app.domain.runtime.instruction.LogInstruction", f = "LogInstruction.kt", l = {73, 74, 117, 119}, m = "createLog")
    public final class a extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public int h;
        public /* synthetic */ Object i;
        public int k;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("e9@1285.a$1");
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            Object objA = e9.this.a(null, 0, 0, 0, null, this);
            C1C7U.LIZIZ("e9@1285.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.runtime.instruction.LogInstruction$run$1", f = "LogInstruction.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "invokeSuspend")
    public final class b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ cc g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("e9@1285.a$2");
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
                e9 e9Var = e9.this;
                String str = this.c;
                int i2 = this.d;
                int i3 = this.e;
                int i4 = this.f;
                cc ccVar = this.g;
                this.a = 1;
                if (e9Var.a(str, i2, i3, i4, ccVar, this) == objLJFF) {
                    C1C7U.LIZIZ("e9@1285.a$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("e9@1285.a$2");
            return unit;
        }

        public final Object a(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return e9.this.new b(this.c, this.d, this.e, this.f, this.g, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i, int i2, int i3, cc ccVar, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = ccVar;
        }
    }

    @Override // ttpobfuscated.o7
    public tc a(xc xcVar, cc ccVar) {
        String string = kotlin.text.a0.LJLIIIL(c(xcVar).toLowerCase(Locale.ROOT)).toString();
        if (!this.m.a(string)) {
            return tc.False;
        }
        d2.a.a(new b(string, c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 2)).LL), c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 3)).LL), c(xcVar, ((C1507240pKE) ListProtector.get(this.b, 4)).LL), ccVar, null));
        return tc.True;
    }

    public e9(List<C1507240pKE> list, s sVar, tg tgVar, u1 u1Var, u1 u1Var2, j4 j4Var) {
        super(ha.Log, list);
        this.m = sVar;
        this.n = tgVar;
        this.o = u1Var;
        this.p = u1Var2;
        this.q = j4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:58:0x0192, B:59:0x0195, B:52:0x0178, B:53:0x017b, B:55:0x0183, B:31:0x00d9, B:32:0x00dc, B:33:0x00e4, B:35:0x010e, B:37:0x0111, B:39:0x0117, B:42:0x011d, B:43:0x0123, B:45:0x012e, B:48:0x0134, B:49:0x013a, B:25:0x00b7, B:26:0x00ba, B:28:0x00be, B:21:0x008a), top: B:64:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:58:0x0192, B:59:0x0195, B:52:0x0178, B:53:0x017b, B:55:0x0183, B:31:0x00d9, B:32:0x00dc, B:33:0x00e4, B:35:0x010e, B:37:0x0111, B:39:0x0117, B:42:0x011d, B:43:0x0123, B:45:0x012e, B:48:0x0134, B:49:0x013a, B:25:0x00b7, B:26:0x00ba, B:28:0x00be, B:21:0x008a), top: B:64:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0183 A[Catch: all -> 0x019b, TryCatch #0 {all -> 0x019b, blocks: (B:58:0x0192, B:59:0x0195, B:52:0x0178, B:53:0x017b, B:55:0x0183, B:31:0x00d9, B:32:0x00dc, B:33:0x00e4, B:35:0x010e, B:37:0x0111, B:39:0x0117, B:42:0x011d, B:43:0x0123, B:45:0x012e, B:48:0x0134, B:49:0x013a, B:25:0x00b7, B:26:0x00ba, B:28:0x00be, B:21:0x008a), top: B:64:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r23, int r24, int r25, int r26, ttpobfuscated.cc r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.e9.a(java.lang.String, int, int, int, ttpobfuscated.cc, X.05Vn):java.lang.Object");
    }
}
