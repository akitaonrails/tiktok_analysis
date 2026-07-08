package defpackage;

import X.AbstractC23140094w;
import X.AnonymousClass0950;
import X.C054G;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C09IC;
import X.C09IR;
import X.C0OHT;
import X.C0OPX;
import X.C0PEM;
import X.C155000ia;
import X.C1BNE;
import X.C1DEV;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631630sYr;
import X.InterfaceC383701eN;
import X.InterfaceC497601wk;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import defpackage.o2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class r0 {
    public final String LIZ;
    public final CoroutineContext LIZIZ;
    public final InterfaceC1631630sYr<String, String, Long, InterfaceC1364105Vn<? super BulletinListResponse>, Object> LIZJ;
    public final C2252331DDr LIZLLL;
    public final AnonymousClass0950 LJ;
    public final C2252321DDq LJFF;
    public Long LJI;
    public Long LJII;
    public String LJIIIIZZ;
    public Long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public final C1DEV LJIILIIL;
    public final C054G LJIILJJIL;

    public final class a extends C09AY implements Function0<Unit> {
        public final /* synthetic */ long LL;
        public final /* synthetic */ long LLILLJJLI;
        public final /* synthetic */ r0 LLILLL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2, r0 r0Var) {
            super(0);
            this.LL = j;
            this.LLILLJJLI = j2;
            this.LLILLL = r0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (this.LL <= this.LLILLJJLI) {
                this.LLILLL.LJIIJ = false;
            }
            return Unit.LIZ;
        }
    }

    @C09DV(c = "BulletinInternalLoadMoreTask", f = "BulletinInternalLoadMoreTask.kt", l = {202, 86}, m = "onUserScrolledToLast")
    public final class b extends AbstractC23140094w {
        public InterfaceC383701eN LL;
        public /* synthetic */ Object LLILLJJLI;
        public int LLILZ;

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            this.LLILLJJLI = obj;
            this.LLILZ |= Integer.MIN_VALUE;
            return r0.this.LIZLLL(this);
        }
    }

    @C09DV(c = "BulletinInternalLoadMoreTask$updateLastItemTime$1", f = "BulletinInternalLoadMoreTask.kt", l = {202, 100}, m = "invokeSuspend")
    public final class c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public InterfaceC383701eN LL;
        public r0 LLILLJJLI;
        public Object LLILLL;
        public int LLILZ;
        public final /* synthetic */ Long LLILZLL;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Long l, InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.LLILZLL = l;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return r0.this.new c(this.LLILZLL, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            r0 r0Var;
            InterfaceC383701eN interfaceC383701eN;
            Long l;
            Object objLJFF = C099R.LJFF();
            int i = this.LLILZ;
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            if (i == 2) {
                                interfaceC383701eN = this.LL;
                                C155000ia.LIZIZ(obj);
                                interfaceC383701eN.LIZIZ(null);
                                return Unit.LIZ;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        l = (Long) this.LLILLL;
                        r0Var = this.LLILLJJLI;
                        interfaceC383701eN = this.LL;
                        C155000ia.LIZIZ(obj);
                    } else {
                        C155000ia.LIZIZ(obj);
                        r0Var = r0.this;
                        interfaceC383701eN = r0Var.LJIILIIL;
                        l = this.LLILZLL;
                        this.LL = interfaceC383701eN;
                        this.LLILLJJLI = r0Var;
                        this.LLILLL = l;
                        this.LLILZ = 1;
                        if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                            return objLJFF;
                        }
                    }
                    r0Var.LJIIIZ = l;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = null;
                    this.LLILLL = null;
                    this.LLILZ = 2;
                    if (r0Var.LIZ(this) == objLJFF) {
                        return objLJFF;
                    }
                    interfaceC383701eN.LIZIZ(null);
                    return Unit.LIZ;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    interfaceC383701eN.LIZIZ(null);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }
    }

    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start attemptLoadMore isProcessing:");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", hasMore:");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", _isLoading:");
        sbLIZ.append(((Boolean) this.LJFF.getValue()).booleanValue());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJIIL && !((Boolean) this.LJFF.getValue()).booleanValue()) {
            if (!this.LJIIJJI) {
                C0OPX.LJII("attemptLoadMore : loadFinish, NoMoreData");
                Object objEmit = this.LIZLLL.emit(new o2.a(), interfaceC1364105Vn);
                if (objEmit == C099R.LJFF()) {
                    return objEmit;
                }
                return Unit.LIZ;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start attemptLoadMore beginTime:");
            sbLIZ2.append(this.LJII);
            sbLIZ2.append(", currentCursor:");
            sbLIZ2.append(this.LJIIIIZZ);
            sbLIZ2.append(", lastItemTime:");
            sbLIZ2.append(this.LJIIIZ);
            sbLIZ2.append("， userScrolledToLast：");
            sbLIZ2.append(this.LJIIJ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            Long l = this.LJII;
            if (l != null) {
                long jLongValue = l.longValue();
                if (this.LJIIIIZZ == null) {
                    return Unit.LIZ;
                }
                Long l2 = this.LJIIIZ;
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue <= jLongValue2 && !this.LJIIJ) {
                        return Unit.LIZ;
                    }
                    Object objLIZIZ = LIZIZ(new a(jLongValue, jLongValue2, this), interfaceC1364105Vn);
                    if (objLIZIZ == C099R.LJFF()) {
                        return objLIZIZ;
                    }
                    return Unit.LIZ;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [r0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof r0.b
            if (r0 == 0) goto L26
            r7 = r9
            r0$b r7 = (r0.b) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 == r2) goto L3a
            if (r0 != r3) goto L32
            X.01eN r1 = r7.LL
            goto L2c
        L26:
            r0$b r7 = new r0$b
            r7.<init>(r9)
            goto L12
        L2c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L30
            goto L62
        L30:
            r0 = move-exception
            goto L69
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.01eN r1 = r7.LL
            X.C155000ia.LIZIZ(r6)
            goto L55
        L40:
            X.C155000ia.LIZIZ(r6)
            java.lang.String r0 = "onUserScrolledToLast"
            X.C0OPX.LJII(r0)
            X.1DEV r1 = r8.LJIILIIL
            r7.LL = r1
            r7.LLILZ = r2
            java.lang.Object r0 = r1.LIZLLL(r4, r7)
            if (r0 != r5) goto L55
            return r5
        L55:
            r8.LJIIJ = r2     // Catch: java.lang.Throwable -> L68
            r7.LL = r1     // Catch: java.lang.Throwable -> L68
            r7.LLILZ = r3     // Catch: java.lang.Throwable -> L68
            java.lang.Object r0 = r8.LIZ(r7)     // Catch: java.lang.Throwable -> L68
            if (r0 != r5) goto L62
            return r5
        L62:
            r1.LIZIZ(r4)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            r0 = move-exception
        L69:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L68
            r1.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.LIZLLL(X.05Vn):java.lang.Object");
    }

    public final void LJ(Long l) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLastItemTime lastItemTime:");
        sbLIZ.append(l);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LJIILJJIL, null, null, new c(l, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(r0.a r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.LIZIZ(r0$a, X.05Vn):java.lang.Object");
    }

    public r0(String str, CoroutineContext coroutineContext, C0OHT c0oht) {
        this.LIZ = str;
        this.LIZIZ = coroutineContext;
        this.LIZJ = c0oht;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LIZLLL = c2252331DDrLIZIZ;
        this.LJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(Boolean.FALSE);
        this.LJFF = c2252321DDqLIZ;
        C09IC.LIZIZ(c2252321DDqLIZ);
        this.LJIIJJI = true;
        this.LJIILIIL = C2191201ApK.LIZ();
        this.LJIILJJIL = C2296808zG.LIZ(coroutineContext.plus(C0PEM.LIZJ).plus(C2296908zH.LIZ()));
    }

    public final void LIZJ(Long l, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFirstLoadCompleted initialCursor:");
        sbLIZ.append(str);
        sbLIZ.append(" firstRequestTime:");
        sbLIZ.append(l);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(this.LJIILJJIL, null, null, new t0(this, str, z, l, null), 3);
    }
}
