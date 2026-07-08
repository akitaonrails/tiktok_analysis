package ttpobfuscated;

import X.AbstractC23140094w;
import X.C095D;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C13LE;
import X.C155000ia;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import X.InterfaceC346201Wa;
import X.InterfaceC346701Wf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.app.domain.usecase.UseCaseResult;
import ttp.orbu.sdk.configuration.model.EventSetting;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttp.orbu.sdk.constants.TTPErrorCode;
import ttpobfuscated.b6;
import ttpobfuscated.f4;
import ttpobfuscated.i9;
import ttpobfuscated.id;
import ttpobfuscated.j0;

/* JADX INFO: loaded from: classes24.dex */
public final class h4 implements j5<g4, f4> {
    public final u1 a;
    public final b6 b;
    public final j0 c;
    public final j4 d;
    public final sd e;
    public final ce f;
    public final i9 g;
    public final id h;
    public final String i = C13LE.LIZ(h4.class).LJI();
    public InterfaceC346701Wf<? super UseCaseResult<g4, f4>> j;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TTPErrorCode.values().length];
            try {
                iArr[TTPErrorCode.NotModified.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                iArr[TTPErrorCode.Forbidden.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                iArr[TTPErrorCode.NotFound.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            try {
                iArr[TTPErrorCode.InterceptorException.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            try {
                iArr[TTPErrorCode.Unknown.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            try {
                iArr[TTPErrorCode.IOException.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
                TryCatchGuardChecker.doCheck(e6);
            }
            try {
                iArr[TTPErrorCode.Exception.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
                TryCatchGuardChecker.doCheck(e7);
            }
            try {
                iArr[TTPErrorCode.RequestSizeLargerThanAllowed.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
                TryCatchGuardChecker.doCheck(e8);
            }
            try {
                iArr[TTPErrorCode.UnknownHostException.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
                TryCatchGuardChecker.doCheck(e9);
            }
            try {
                iArr[TTPErrorCode.BadRequest.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
                TryCatchGuardChecker.doCheck(e10);
            }
            try {
                iArr[TTPErrorCode.Unauthorized.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
                TryCatchGuardChecker.doCheck(e11);
            }
            try {
                iArr[TTPErrorCode.RequestThrottledInternally.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
                TryCatchGuardChecker.doCheck(e12);
            }
            try {
                iArr[TTPErrorCode.InternalServer.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
                TryCatchGuardChecker.doCheck(e13);
            }
            try {
                iArr[TTPErrorCode.RateLimitExceeded.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
                TryCatchGuardChecker.doCheck(e14);
            }
            try {
                iArr[TTPErrorCode.Unavailable.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
                TryCatchGuardChecker.doCheck(e15);
            }
            a = iArr;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {392, 394, 399, 409}, m = "deleteEvents")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$1");
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objA = h4.this.a((List<? extends fg<? extends b2>>) null, this);
            C1C7U.LIZIZ("h4@122d.a$1");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {556}, m = "deleteEventsOlderThanRetention")
    public final class c extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$2");
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objA = h4.this.a((GeneralConfig) null, this);
            C1C7U.LIZIZ("h4@122d.a$2");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {565, 567}, m = "deleteSentEventsOlderThanRetention")
    public final class d extends AbstractC23140094w {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.b$1");
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            Object objB = h4.this.b((GeneralConfig) null, this);
            C1C7U.LIZIZ("h4@122d.b$1");
            return objB;
        }

        public d(InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase$invoke$2", f = "EventHandlerUseCase.kt", l = {107}, m = "invokeSuspend")
    public final class e extends C09AX implements Function2<InterfaceC346701Wf<? super UseCaseResult<g4, f4>>, InterfaceC1364105Vn<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$3");
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
                h4.this.j = (InterfaceC346701Wf) this.b;
                if (!ua.a.b().f().m().a("standalone")) {
                    h4 h4Var = h4.this;
                    this.a = 1;
                    if (h4Var.b(this) == objLJFF) {
                        C1C7U.LIZIZ("h4@122d.a$3");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("h4@122d.a$3");
            return unit;
        }

        public e(InterfaceC1364105Vn<? super e> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            e eVar = h4.this.new e(interfaceC1364105Vn);
            eVar.b = interfaceC346701Wf;
            return eVar.invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            e eVar = h4.this.new e(interfaceC1364105Vn);
            eVar.b = obj;
            return eVar;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {127, 133, 137, 145, 148, 153, 163, 168, 173, 177, 180}, m = "processEvents")
    public final class f extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.b$2");
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object objB = h4.this.b(this);
            C1C7U.LIZIZ("h4@122d.b$2");
            return objB;
        }

        public f(InterfaceC1364105Vn<? super f> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {438, 448, 458, 470}, m = "processSendLogError")
    public final class g extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$4");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = h4.this.a((i9.a.C0057a) null, (List<? extends fg<? extends b2>>) null, (String) null, this);
            C1C7U.LIZIZ("h4@122d.a$4");
            return objA;
        }

        public g(InterfaceC1364105Vn<? super g> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {493, 497, 507}, m = "processSendSampleError")
    public final class h extends AbstractC23140094w {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$5");
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            Object objA = h4.this.a((id.a.C0058a) null, (dd) null, this);
            C1C7U.LIZIZ("h4@122d.a$5");
            return objA;
        }

        public h(InterfaceC1364105Vn<? super h> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {352, 369}, m = "resolveChallenge")
    public final class i extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) throws n7 {
            C1C7U.LIZ("h4@122d.a$6");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = h4.this.a((k0) null, (uf) null, this);
            C1C7U.LIZIZ("h4@122d.a$6");
            return objA;
        }

        public i(InterfaceC1364105Vn<? super i> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {192, 203, 213, 218, 229, 231, 233, 245, 251, 257, 261, 264}, m = "sendLogEvents")
    public final class j extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public int h;
        public /* synthetic */ Object i;
        public int k;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.a$7");
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            Object objA = h4.this.a((String) null, (GeneralConfig) null, this);
            C1C7U.LIZIZ("h4@122d.a$7");
            return objA;
        }

        public j(InterfaceC1364105Vn<? super j> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.event.EventHandlerUseCase", f = "EventHandlerUseCase.kt", l = {276, 285, 294, 299, 308, 310, 326, 333, 338, 341}, m = "sendSamples")
    public final class k extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public int f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("h4@122d.c$1");
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            Object objC = h4.this.c(null, this);
            C1C7U.LIZIZ("h4@122d.c$1");
            return objC;
        }

        public k(InterfaceC1364105Vn<? super k> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @Override // ttpobfuscated.j5
    public Object a(InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends UseCaseResult<g4, f4>>> interfaceC1364105Vn) {
        return new C095D(new e(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8 A[Catch: all -> 0x0193, TryCatch #1 {all -> 0x0193, blocks: (B:26:0x00ae, B:28:0x00b8, B:32:0x00d1, B:35:0x00e3, B:38:0x00fe, B:31:0x00c9, B:70:0x018d), top: B:108:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[Catch: all -> 0x0188, TRY_LEAVE, TryCatch #4 {all -> 0x0188, blocks: (B:41:0x0110, B:43:0x011a, B:55:0x0162, B:57:0x0166), top: B:112:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128 A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:45:0x0122, B:47:0x0128, B:49:0x0136, B:52:0x014c, B:21:0x0076, B:44:0x011f), top: B:106:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162 A[Catch: all -> 0x0188, TRY_ENTER, TryCatch #4 {all -> 0x0188, blocks: (B:41:0x0110, B:43:0x011a, B:55:0x0162, B:57:0x0166), top: B:112:0x0110 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d A[Catch: all -> 0x0193, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0193, blocks: (B:26:0x00ae, B:28:0x00b8, B:32:0x00d1, B:35:0x00e3, B:38:0x00fe, B:31:0x00c9, B:70:0x018d), top: B:108:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021e A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, ttp.orbu.sdk.configuration.model.GeneralConfig] */
    /* JADX WARN: Type inference failed for: r3v14, types: [T, ttp.orbu.sdk.configuration.model.GeneralConfig] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0126 -> B:108:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0164 -> B:108:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x017a -> B:108:0x00ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.b(X.05Vn):java.lang.Object");
    }

    public final Object c(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf = this.j;
        if (interfaceC346701Wf != null) {
            Object objEmit = interfaceC346701Wf.emit(new UseCaseResult.a(f4.k.a), interfaceC1364105Vn);
            if (objEmit == C099R.LJFF()) {
                return objEmit;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0134 -> B:21:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List<? extends ttpobfuscated.fg<? extends ttpobfuscated.b2>> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ttp.orbu.sdk.configuration.model.GeneralConfig r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof ttpobfuscated.h4.d
            if (r0 == 0) goto L98
            r8 = r13
            ttpobfuscated.h4$d r8 = (ttpobfuscated.h4.d) r8
            int r2 = r8.f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L98
            int r2 = r2 - r1
            r8.f = r2
        L12:
            java.lang.Object r1 = r8.d
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.f
            r7 = 2
            r10 = 1
            if (r0 == 0) goto L63
            if (r0 == r10) goto L88
            if (r0 != r7) goto La2
            long r3 = r8.c
            java.lang.Object r5 = r8.b
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r0 = r8.a
            ttpobfuscated.h4 r0 = (ttpobfuscated.h4) r0
            X.C155000ia.LIZIZ(r1)
        L2f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r6 = r5.next()
            ttpobfuscated.qd r6 = (ttpobfuscated.qd) r6
            java.util.Date r2 = r6.b
            java.util.Date r1 = new java.util.Date
            r1.<init>(r3)
            int r1 = r2.compareTo(r1)
            if (r1 >= 0) goto L2f
            java.lang.String r2 = r6.a
            java.lang.String r1 = "activation"
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 != 0) goto L2f
            ttpobfuscated.sd r1 = r0.e
            r8.a = r0
            r8.b = r5
            r8.c = r3
            r8.f = r7
            java.lang.Object r1 = r1.a(r6, r8)
            if (r1 != r9) goto L2f
            return r9
        L63:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            int r0 = r12.getTelemetryRetentionInDays()
            long r5 = (long) r0
            r0 = 86400000(0x5265c00, float:7.82218E-36)
            long r0 = (long) r0
            long r5 = r5 * r0
            long r3 = r3 - r5
            ttpobfuscated.sd r2 = r11.e
            r8.a = r11
            r8.c = r3
            r8.f = r10
            r1 = 0
            r0 = 0
            java.lang.Object r1 = ttpobfuscated.sd.a.a(r2, r1, r8, r10, r0)
            if (r1 != r9) goto L86
            return r9
        L86:
            r0 = r11
            goto L91
        L88:
            long r3 = r8.c
            java.lang.Object r0 = r8.a
            ttpobfuscated.h4 r0 = (ttpobfuscated.h4) r0
            X.C155000ia.LIZIZ(r1)
        L91:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r5 = r1.iterator()
            goto L2f
        L98:
            ttpobfuscated.h4$d r8 = new ttpobfuscated.h4$d
            r8.<init>(r13)
            goto L12
        L9f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.b(ttp.orbu.sdk.configuration.model.GeneralConfig, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015f A[Catch: all -> 0x0208, TryCatch #4 {all -> 0x0208, blocks: (B:45:0x0155, B:47:0x015f, B:50:0x0165, B:52:0x016d), top: B:124:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165 A[Catch: all -> 0x0208, TRY_LEAVE, TryCatch #4 {all -> 0x0208, blocks: (B:45:0x0155, B:47:0x015f, B:50:0x0165, B:52:0x016d), top: B:124:0x0155 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce A[Catch: all -> 0x01ff, TRY_LEAVE, TryCatch #10 {all -> 0x01ff, blocks: (B:61:0x01ca, B:63:0x01ce, B:65:0x01d4), top: B:133:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x020d A[Catch: all -> 0x0213, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0213, blocks: (B:42:0x013a, B:51:0x016b, B:64:0x01d2, B:81:0x020d), top: B:120:0x013a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022a  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v6, types: [ttpobfuscated.dd] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, ttpobfuscated.dd] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.00zU] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r3v2, types: [ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0136 -> B:41:0x0138). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ttp.orbu.sdk.configuration.model.GeneralConfig r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.c(ttp.orbu.sdk.configuration.model.GeneralConfig, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttp.orbu.sdk.configuration.model.GeneralConfig r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(ttp.orbu.sdk.configuration.model.GeneralConfig, X.05Vn):java.lang.Object");
    }

    public final Object a(r4 r4Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf;
        if (r4Var instanceof n7) {
            InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf2 = this.j;
            if (interfaceC346701Wf2 != null) {
                Object objEmit = interfaceC346701Wf2.emit(new UseCaseResult.a(f4.g.a), interfaceC1364105Vn);
                if (objEmit == C099R.LJFF()) {
                    return objEmit;
                }
                return Unit.LIZ;
            }
        } else if (r4Var instanceof b6.a) {
            InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf3 = this.j;
            if (interfaceC346701Wf3 != null) {
                Object objEmit2 = interfaceC346701Wf3.emit(new UseCaseResult.a(new f4.d(((b6.a) r4Var).a)), interfaceC1364105Vn);
                if (objEmit2 == C099R.LJFF()) {
                    return objEmit2;
                }
                return Unit.LIZ;
            }
        } else if ((r4Var instanceof j0.a.C0059a) && (interfaceC346701Wf = this.j) != null) {
            Object objEmit3 = interfaceC346701Wf.emit(new UseCaseResult.a(new f4.b(((j0.a) r4Var).a)), interfaceC1364105Vn);
            if (objEmit3 == C099R.LJFF()) {
                return objEmit3;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final Object a(n7 n7Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (Intrinsics.LJFF(n7Var.a, "maxBatch")) {
            InterfaceC346701Wf<? super UseCaseResult<g4, f4>> interfaceC346701Wf = this.j;
            if (interfaceC346701Wf != null) {
                Object objEmit = interfaceC346701Wf.emit(new UseCaseResult.a(f4.g.a), interfaceC1364105Vn);
                if (objEmit == C099R.LJFF()) {
                    return objEmit;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        Object objA = a((r4) n7Var, interfaceC1364105Vn);
        if (objA == C099R.LJFF()) {
            return objA;
        }
        return Unit.LIZ;
    }

    public final int a(String str, GeneralConfig generalConfig) throws n7 {
        EventSetting next;
        Iterator<EventSetting> it2 = generalConfig.getEvents().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.eventType, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        EventSetting eventSetting = next;
        if (eventSetting != null) {
            return eventSetting.maxEventBatchSize;
        }
        throw new n7("maxBatch", "Error getting maxEventBatchSize from configuration");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ba A[Catch: all -> 0x02d9, TryCatch #5 {all -> 0x02d9, blocks: (B:45:0x01af, B:47:0x01ba, B:49:0x01bd, B:51:0x01c3), top: B:137:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd A[Catch: all -> 0x02d9, TRY_LEAVE, TryCatch #5 {all -> 0x02d9, blocks: (B:45:0x01af, B:47:0x01ba, B:49:0x01bd, B:51:0x01c3), top: B:137:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0205 A[Catch: all -> 0x02ca, TryCatch #6 {all -> 0x02ca, blocks: (B:58:0x0201, B:60:0x0205, B:61:0x0209), top: B:139:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0257 A[Catch: all -> 0x02e9, TryCatch #4 {all -> 0x02e9, blocks: (B:68:0x0253, B:70:0x0257, B:71:0x0264, B:73:0x026a, B:74:0x027c, B:78:0x02a5, B:35:0x0137, B:67:0x0250, B:77:0x02a2, B:39:0x0188), top: B:135:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02de A[Catch: all -> 0x02e4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x02e4, blocks: (B:41:0x018d, B:96:0x02de), top: B:133:0x018d }] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r16v0, types: [ttpobfuscated.k4] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v4, types: [ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, ttpobfuscated.h4] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02c0 -> B:40:0x018b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r23, ttp.orbu.sdk.configuration.model.GeneralConfig r24, X.InterfaceC1364105Vn<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(java.lang.String, ttp.orbu.sdk.configuration.model.GeneralConfig, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.id.a.C0058a r11, ttpobfuscated.dd r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(ttpobfuscated.id$a$a, ttpobfuscated.dd, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.k0 r10, ttpobfuscated.uf r11, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, java.lang.String>> r12) throws ttpobfuscated.n7 {
        /*
            r9 = this;
            boolean r0 = r12 instanceof ttpobfuscated.h4.i
            if (r0 == 0) goto L93
            r6 = r12
            ttpobfuscated.h4$i r6 = (ttpobfuscated.h4.i) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L93
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r8 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L57
            if (r0 == r3) goto L6d
            if (r0 != r4) goto L9a
            java.lang.Object r7 = r6.a
            ttpobfuscated.h0 r7 = (ttpobfuscated.h0) r7
            X.C155000ia.LIZIZ(r8)
        L29:
            ttpobfuscated.k0 r0 = r7.a
            java.lang.String r1 = r0.b
            kotlin.Pair r6 = new kotlin.Pair
            java.lang.String r0 = "challenge_id"
            r6.<init>(r0, r1)
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r0 = "challenge_result"
            r5.<init>(r0, r8)
            java.lang.Integer r0 = r7.b
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
            X.C155000ia.LIZIZ(r8)
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.HashCash
            if (r10 != r0) goto Lac
            ttpobfuscated.b6 r0 = r9.b
            r6.a = r9
            r6.d = r3
            java.lang.Object r8 = r0.a(r11, r6)
            if (r8 != r5) goto L6b
            return r5
        L6b:
            r2 = r9
            goto L74
        L6d:
            java.lang.Object r2 = r6.a
            ttpobfuscated.h4 r2 = (ttpobfuscated.h4) r2
            X.C155000ia.LIZIZ(r8)
        L74:
            r7 = r8
            ttpobfuscated.h0 r7 = (ttpobfuscated.h0) r7
            ttpobfuscated.k0 r1 = r7.a
            ttpobfuscated.k0 r0 = ttpobfuscated.k0.None
            if (r1 != r0) goto L82
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        L82:
            java.lang.Integer r0 = r7.b
            if (r0 == 0) goto La2
            ttpobfuscated.j0 r0 = r2.c
            r6.a = r7
            r6.d = r4
            java.lang.Object r8 = r0.a(r7, r6)
            if (r8 != r5) goto L29
            return r5
        L93:
            ttpobfuscated.h4$i r6 = new ttpobfuscated.h4$i
            r6.<init>(r12)
            goto L12
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La2:
            ttpobfuscated.n7 r2 = new ttpobfuscated.n7
            java.lang.String r1 = "seedId"
            java.lang.String r0 = "Seed Id cannot be null"
            r2.<init>(r1, r0)
            throw r2
        Lac:
            java.util.Map r0 = X.C2097608Jq.LJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(ttpobfuscated.k0, ttpobfuscated.uf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ttpobfuscated.i9.a.C0057a r12, java.util.List<? extends ttpobfuscated.fg<? extends ttpobfuscated.b2>> r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.h4.a(ttpobfuscated.i9$a$a, java.util.List, java.lang.String, X.05Vn):java.lang.Object");
    }

    public h4(u1 u1Var, b6 b6Var, j0 j0Var, j4 j4Var, sd sdVar, ce ceVar, i9 i9Var, id idVar) {
        this.a = u1Var;
        this.b = b6Var;
        this.c = j0Var;
        this.d = j4Var;
        this.e = sdVar;
        this.f = ceVar;
        this.g = i9Var;
        this.h = idVar;
    }
}
