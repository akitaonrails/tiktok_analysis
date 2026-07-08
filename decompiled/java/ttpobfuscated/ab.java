package ttpobfuscated;

import X.AbstractC23140094w;
import X.C01GW;
import X.C098200Yq;
import X.C099R;
import X.C09AX;
import X.C09AY;
import X.C09DV;
import X.C1500770p9n;
import X.C155000ia;
import X.C1697810uHb;
import X.C189200o6;
import X.C1954807lC;
import X.C1C7U;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ttp.orbu.sdk.app.domain.usecase.TTPResult;
import ttpobfuscated.q3;
import ttpobfuscated.ya;

/* JADX INFO: loaded from: classes24.dex */
public final class ab implements za {
    public final d4 a;
    public final w9 b;
    public xa c;
    public final List<pe> d;
    public final C01GW e;

    public final class e extends C09AY implements Function0<KeyStore> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        public final KeyStore a() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }

        @Override // kotlin.jvm.functions.Function0
        public KeyStore invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        }
    }

    public final KeyStore a() {
        return (KeyStore) this.e.getValue();
    }

    @C09DV(c = "ttp.orbu.sdk.signing.repo.PKIRepositoryImpl", f = "PKIRepositoryImpl.kt", l = {126}, m = "fetchCertByTypeAndVersion")
    public final class a extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("ab@12d8.a$1");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = ab.this.a(null, 0, this);
            C1C7U.LIZIZ("ab@12d8.a$1");
            return objA;
        }

        public a(InterfaceC1364105Vn<? super a> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.signing.repo.PKIRepositoryImpl$fetchCertByTypeAndVersion$2$1", f = "PKIRepositoryImpl.kt", l = {127}, m = "invokeSuspend")
    public final class b extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<String>>, Object> {
        public int a;
        public final /* synthetic */ xa b;
        public final /* synthetic */ re c;
        public final /* synthetic */ int d;

        public final Object a(InterfaceC1364105Vn<? super C1500770p9n<String>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new b(this.b, this.c, this.d, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(InterfaceC1364105Vn<? super C1500770p9n<String>> interfaceC1364105Vn) {
            return ((njp.a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("ab@12d8.a$2");
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
                xa xaVar = this.b;
                String lowerCase = this.c.name().toLowerCase(Locale.ROOT);
                int i2 = this.d;
                this.a = 1;
                obj = xaVar.a(lowerCase, i2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ab@12d8.a$2");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("ab@12d8.a$2");
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xa xaVar, re reVar, int i, InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.b = xaVar;
            this.c = reVar;
            this.d = i;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.signing.repo.PKIRepositoryImpl", f = "PKIRepositoryImpl.kt", l = {73}, m = "fetchLatestCerts")
    public final class c extends AbstractC23140094w {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("ab@12d8.a$3");
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            Object objA = ab.this.a(this);
            C1C7U.LIZIZ("ab@12d8.a$3");
            return objA;
        }

        public c(InterfaceC1364105Vn<? super c> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    @C09DV(c = "ttp.orbu.sdk.signing.repo.PKIRepositoryImpl$fetchLatestCerts$2$networkResponse$1", f = "PKIRepositoryImpl.kt", l = {74}, m = "invokeSuspend")
    public final class d extends C09AX implements Function1<InterfaceC1364105Vn<? super C1500770p9n<List<? extends String>>>, Object> {
        public int a;
        public final /* synthetic */ xa b;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1364105Vn<? super C1500770p9n<List<String>>> interfaceC1364105Vn) {
            return new d(this.b, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new d(this.b, interfaceC1364105Vn);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("ab@12d8.a$4");
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
                xa xaVar = this.b;
                this.a = 1;
                obj = xaVar.a(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ab@12d8.a$4");
                    return objLJFF;
                }
            }
            C1C7U.LIZIZ("ab@12d8.a$4");
            return obj;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xa xaVar, InterfaceC1364105Vn<? super d> interfaceC1364105Vn) {
            super(1, interfaceC1364105Vn);
            this.b = xaVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @Override // ttpobfuscated.za
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ttpobfuscated.ab.c
            if (r0 == 0) goto L68
            r6 = r8
            ttpobfuscated.ab$c r6 = (ttpobfuscated.ab.c) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r1 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 1
            if (r0 == 0) goto L4c
            if (r0 != r4) goto L6e
            java.lang.Object r3 = r6.a
            ttpobfuscated.ab r3 = (ttpobfuscated.ab) r3
            X.C155000ia.LIZIZ(r1)
        L26:
            ttp.orbu.sdk.app.domain.usecase.TTPResult r1 = (ttp.orbu.sdk.app.domain.usecase.TTPResult) r1
            boolean r0 = r1 instanceof ttp.orbu.sdk.app.domain.usecase.TTPResult.b
            if (r0 == 0) goto L76
            ttp.orbu.sdk.app.domain.usecase.TTPResult$b r1 = (ttp.orbu.sdk.app.domain.usecase.TTPResult.b) r1
            DATA r0 = r1.b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L36:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            ttpobfuscated.pe$a r0 = ttpobfuscated.pe.e
            ttpobfuscated.pe r0 = r0.a(r1)
            r3.a(r0)
            goto L36
        L4c:
            X.C155000ia.LIZIZ(r1)
            ttpobfuscated.xa r3 = r7.c
            if (r3 == 0) goto L7f
            ttpobfuscated.w9 r2 = r7.b
            ttpobfuscated.ab$d r1 = new ttpobfuscated.ab$d
            r0 = 0
            r1.<init>(r3, r0)
            r6.a = r7
            r6.d = r4
            java.lang.Object r1 = r2.a(r1, r6)
            if (r1 != r5) goto L66
            return r5
        L66:
            r3 = r7
            goto L26
        L68:
            ttpobfuscated.ab$c r6 = new ttpobfuscated.ab$c
            r6.<init>(r8)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            boolean r0 = r1 instanceof ttp.orbu.sdk.app.domain.usecase.TTPResult.a
            if (r0 == 0) goto L7f
            java.lang.String r0 = "Could not fetch keys"
            r3.a(r0)
        L7f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ab.a(X.05Vn):java.lang.Object");
    }

    public final void a(pe peVar) {
        Object c098200Yq;
        try {
            a().setCertificateEntry(f(peVar.a, peVar.b), peVar.j());
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            a("Could not save key to keystore");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Certificate a(TTPResult<String> tTPResult) {
        if (tTPResult instanceof TTPResult.b) {
            pe peVarB = pe.e.a((String) ((TTPResult.b) tTPResult).b);
            a(peVarB);
            return peVarB.j();
        }
        if (tTPResult instanceof TTPResult.a) {
            a("Could not fetch key");
            return null;
        }
        throw new C1954807lC();
    }

    public final void a(String str) {
        q3.b.a(q3.a, str, (String) null, (Throwable) null, 6, (Object) null);
        d4 d4Var = this.a;
        if (d4Var != null) {
            d4Var.a(new ya(UUID.randomUUID(), new Date(), new ya.b(str)));
        }
    }

    @Override // ttpobfuscated.za
    public void a(xa xaVar) {
        this.c = xaVar;
    }

    @Override // ttpobfuscated.za
    public Certificate a(re reVar, int i) {
        return e(reVar, i);
    }

    @Override // ttpobfuscated.za
    public PublicKey b(re reVar, int i) {
        pe next;
        Iterator<pe> it2 = this.d.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                pe peVar = next;
                if (peVar.a == reVar && peVar.b == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        pe peVar2 = next;
        if (peVar2 == null) {
            return null;
        }
        return peVar2.k();
    }

    @Override // ttpobfuscated.za
    public boolean c(re reVar, int i) {
        return d(reVar, i);
    }

    public final boolean d(re reVar, int i) {
        Object c098200Yq;
        try {
            a().deleteEntry(f(reVar, i));
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            a("Could not delete key from keystore");
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public final Certificate e(re reVar, int i) {
        Object c098200Yq;
        try {
            c098200Yq = a().getCertificate(f(reVar, i));
            if (c098200Yq == null) {
                a("PKI Feature not available");
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            a("Could not get cert from keystore");
            c098200Yq = null;
        }
        return (Certificate) c098200Yq;
    }

    public final String f(re reVar, int i) {
        return "ttp.orbu." + reVar.name().toLowerCase(Locale.ROOT) + '-' + i;
    }

    public ab(d4 d4Var, w9 w9Var, xa xaVar) {
        this.a = d4Var;
        this.b = w9Var;
        this.c = xaVar;
        re reVar = re.CONFIG;
        qe qeVar = qe.raw;
        pe peVar = new pe(reVar, 2, qeVar, "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQBapF4Sgw712CiNCMyI03qyb6riJ5Redfr+zsSNTUA8Xj8tBAcK5ul74S7Pv/rMQJwFMl5uvSbIyqYZsbCEUd3Fy0AuG683oSe5Dj1EL/MO2T+iNuxy7xtmrUBtWMrDec6BqfMQWzsyJNLzOroyvUFKWDQuYl9yXcXNusaqhAFBkuXukE=");
        re reVar2 = re.GECKO;
        this.d = C1697810uHb.LJIIJJI(peVar, new pe(reVar2, 0, qeVar, "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQAIx2jDZnNxKV3gU3yjK1E5MW/iYiNaDq98ocJLZMuqa0Z6XJoxNYcCbHdWqfG2kqaUi79gpA3s5QHLormhW3DNcYBsNUvYCIjukKowLlUUbYF4WQ+dqBoGHPT0Tc8KhEAnlEhl5Zbw0FWJhFtH5kdvJDkrr4fB02uHMkgZyLcCE6ytxs="), new pe(reVar2, 1, qeVar, "MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQATO+2xEkp2dMaIVqUBGuhQ7wahmt/M3rFicARpiMqkBnjbWk6rju1qnv94SylUBpdrRt2mXpyMmLrOEhazmgG5k4BZoBrelWOGADr77LGAq8zibOsRIANrYHI6WAI9FTy1h7N2xYM8eqgt2mdMt+xg1L5MU1mqkMaxMqOHDLlcLTcUIs="));
        this.e = C452501pT.LIZIZ(e.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    @Override // ttpobfuscated.za
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(ttpobfuscated.re r8, int r9, X.InterfaceC1364105Vn<? super java.security.cert.Certificate> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ttpobfuscated.ab.a
            if (r0 == 0) goto L4f
            r6 = r10
            ttpobfuscated.ab$a r6 = (ttpobfuscated.ab.a) r6
            int r2 = r6.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r6.d = r2
        L12:
            java.lang.Object r1 = r6.b
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.d
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L55
            java.lang.Object r0 = r6.a
            ttpobfuscated.ab r0 = (ttpobfuscated.ab) r0
            X.C155000ia.LIZIZ(r1)
        L26:
            ttp.orbu.sdk.app.domain.usecase.TTPResult r1 = (ttp.orbu.sdk.app.domain.usecase.TTPResult) r1
            java.security.cert.Certificate r2 = r0.a(r1)
        L2c:
            return r2
        L2d:
            X.C155000ia.LIZIZ(r1)
            java.security.cert.Certificate r2 = r7.e(r8, r9)
            if (r2 != 0) goto L2c
            ttpobfuscated.xa r3 = r7.c
            r2 = 0
            if (r3 == 0) goto L2c
            ttpobfuscated.w9 r1 = r7.b
            ttpobfuscated.ab$b r0 = new ttpobfuscated.ab$b
            r0.<init>(r3, r8, r9, r2)
            r6.a = r7
            r6.d = r4
            java.lang.Object r1 = r1.a(r0, r6)
            if (r1 != r5) goto L4d
            return r5
        L4d:
            r0 = r7
            goto L26
        L4f:
            ttpobfuscated.ab$a r6 = new ttpobfuscated.ab$a
            r6.<init>(r10)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.ab.a(ttpobfuscated.re, int, X.05Vn):java.lang.Object");
    }
}
