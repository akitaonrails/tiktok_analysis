package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationType;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;

/* JADX INFO: loaded from: classes24.dex */
public final class vg implements l<s5, Unit, t5> {
    public final n5 a;
    public final r5 b;
    public final zg c;
    public final pb d;
    public final qb e;
    public final j4 f;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeckoValidationType.values().length];
            try {
                iArr[GeckoValidationType.None.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[GeckoValidationType.Structure.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[GeckoValidationType.Signed.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[GeckoValidationType.Production.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            a = iArr;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.gecko.ValidateGeckoPackageUseCase", f = "ValidateGeckoPackageUseCase.kt", l = {45, BaseNotice.CREATOR, 75, 77, 126}, m = "invoke")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("vg@1048.a$1");
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object objA = vg.this.a((s5) null, (InterfaceC1364105Vn<? super UseCaseResult<Unit, t5>>) this);
            C1C7U.LIZIZ("vg@1048.a$1");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.gecko.ValidateGeckoPackageUseCase", f = "ValidateGeckoPackageUseCase.kt", l = {145, 146}, m = "sendEvent")
    public final class c extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("vg@1048.a$2");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = vg.this.a(null, null, this);
            C1C7U.LIZIZ("vg@1048.a$2");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:96))(0)|7|(4:(1:(1:(1:(1:(2:14|(2:16|17)(2:97|98))(2:99|100))(5:18|122|55|56|106))(8:19|124|20|126|52|(2:54|105)|56|106))(8:23|109|24|118|46|(9:48|113|49|(2:51|104)|126|52|(0)|56|106)(2:63|64)|75|(5:77|(1:79)(2:83|(1:85)(2:86|(1:88)(2:89|(1:91)(2:92|(1:94)(1:95)))))|80|(1:82)|(0)(0))(2:107|108)))(3:25|120|26)|28|75|(0)(0))(4:29|117|30|(2:32|101)(2:33|(2:35|102)(1:36)))|115|37|(4:41|111|42|(2:44|103)(6:45|118|46|(0)(0)|75|(0)(0)))(9:40|113|49|(0)|126|52|(0)|56|106)|72|75|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        r5 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159 A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:46:0x0108, B:63:0x0159, B:64:0x0163), top: B:118:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fc  */
    @Override // ttpobfuscated.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.s5 r17, X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<kotlin.Unit, ttpobfuscated.t5>> r18) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.vg.a(ttpobfuscated.s5, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.s5 r10, ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError r11, X.InterfaceC1364105Vn<? super ttpobfuscated.t5> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ttpobfuscated.vg.c
            if (r0 == 0) goto L24
            r5 = r12
            ttpobfuscated.vg$c r5 = (ttpobfuscated.vg.c) r5
            int r2 = r5.e
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.e = r2
        L12:
            java.lang.Object r0 = r5.c
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.e
            r6 = 2
            r8 = 1
            r3 = 0
            if (r1 == 0) goto L3b
            if (r1 == r8) goto L32
            if (r1 != r6) goto L2a
            goto L80
        L24:
            ttpobfuscated.vg$c r5 = new ttpobfuscated.vg$c
            r5.<init>(r12)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            java.lang.Object r2 = r5.b
            ttpobfuscated.v5 r2 = (ttpobfuscated.v5) r2
            java.lang.Object r1 = r5.a
            ttpobfuscated.vg r1 = (ttpobfuscated.vg) r1
            goto L66
        L3b:
            X.C155000ia.LIZIZ(r0)
            ttpobfuscated.v5 r2 = new ttpobfuscated.v5     // Catch: java.lang.Throwable -> L87
            ttpobfuscated.v5$b r7 = new ttpobfuscated.v5$b     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r10.b     // Catch: java.lang.Throwable -> L87
            ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationType r0 = r10.a     // Catch: java.lang.Throwable -> L87
            r7.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> L87
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L87
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L87
            r0.<init>()     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1, r0, r7)     // Catch: java.lang.Throwable -> L87
            ttpobfuscated.j4 r0 = r9.f     // Catch: java.lang.Throwable -> L87
            r5.a = r9     // Catch: java.lang.Throwable -> L87
            r5.b = r2     // Catch: java.lang.Throwable -> L87
            r5.e = r8     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.a(r2, r5)     // Catch: java.lang.Throwable -> L87
            if (r0 != r4) goto L64
            return r4
        L64:
            r1 = r9
            goto L69
        L66:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L87
        L69:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L87
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L83
            ttpobfuscated.j4 r0 = r1.f     // Catch: java.lang.Throwable -> L87
            r5.a = r3     // Catch: java.lang.Throwable -> L87
            r5.b = r3     // Catch: java.lang.Throwable -> L87
            r5.e = r6     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = r0.b(r2, r5)     // Catch: java.lang.Throwable -> L87
            if (r0 != r4) goto L83
            return r4
        L80:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L87
        L83:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L87
            goto L93
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L93:
            java.lang.Throwable r1 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r1 != 0) goto L9a
            return r3
        L9a:
            boolean r0 = r1 instanceof ttpobfuscated.j4.b.f
            if (r0 != 0) goto La8
            boolean r0 = r1 instanceof ttpobfuscated.j4.b.a
            if (r0 != 0) goto La8
            ttpobfuscated.t5$g r0 = new ttpobfuscated.t5$g
            r0.<init>()
            return r0
        La8:
            ttpobfuscated.t5$a r0 = new ttpobfuscated.t5$a
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.vg.a(ttpobfuscated.s5, ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError, X.05Vn):java.lang.Object");
    }

    public vg(n5 n5Var, r5 r5Var, zg zgVar, pb pbVar, qb qbVar, j4 j4Var) {
        this.a = n5Var;
        this.b = r5Var;
        this.c = zgVar;
        this.d = pbVar;
        this.e = qbVar;
        this.f = j4Var;
    }
}
