package ttpobfuscated;

import X.C08QB;
import X.C098200Yq;
import X.C09AY;
import X.C09RB;
import X.C0VSJ;
import X.C13BV;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C189200o6;
import X.C1C7U;
import X.C2286608xc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1364105Vn;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ttp.orbu.sdk.app.domain.entity.gecko.GeckoValidationError;
import ttp.orbu.sdk.configuration.model.GeneralConfig;
import ttpobfuscated.b1;
import ttpobfuscated.q3;
import ttpobfuscated.zg;

/* JADX INFO: loaded from: classes24.dex */
public final class b1 implements zg {
    public static final a i = new a();
    public static ExecutorService j = C786410Ut5.d4(4);
    public final boolean a;
    public final u1 b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f = C13LE.LIZ(b1.class).LJI();
    public final AtomicReference<Throwable> g = new AtomicReference<>(null);
    public final Thread h = C786410Ut5.u3();

    public final class c extends C09AY implements Function0<Unit> {
        public final /* synthetic */ p5 b;
        public final /* synthetic */ mg c;

        public final void a() throws zg.a.C0080a {
            b1.this.a(this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() throws zg.a.C0080a {
            b1.this.a(this.b, this.c);
            return Unit.LIZ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p5 p5Var, mg mgVar) {
            super(0);
            this.b = p5Var;
            this.c = mgVar;
        }
    }

    public static /* synthetic */ void lambda$semisugar$a$0(AtomicReference atomicReference, Function0 function0, Thread thread, CountDownLatch countDownLatch) {
        C1C7U.LIZ("b1@12ea.a$1L");
        a(atomicReference, function0, thread, countDownLatch);
        C1C7U.LIZIZ("b1@12ea.a$1L");
    }

    public final AtomicReference<Throwable> b() {
        return this.g;
    }

    public final Thread c() {
        return this.h;
    }

    public static final class a {
        public final ExecutorService a() {
            return b1.j;
        }

        public final void a(ExecutorService executorService) {
            b1.j = executorService;
        }
    }

    public final class b extends C09AY implements Function1<File, Boolean> {
        public final /* synthetic */ String b;

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            boolean z;
            if (file.isFile() && !b1.this.a(this.b, file.getName(), file.getAbsolutePath())) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.b = str;
        }
    }

    @Override // ttpobfuscated.zg
    public List<Integer> a(int i2, GeneralConfig generalConfig) {
        List<Integer> listLL;
        long jNanoTime = System.nanoTime();
        q3.a aVar = q3.a;
        q3.b.a(aVar, "gecko getSampleList", this.f, (Throwable) null, 4, (Object) null);
        int i3 = generalConfig.getGeckoScanSettings().a;
        double d = generalConfig.getGeckoScanSettings().b;
        if (d < 0.0d) {
            listLL = C13BV.INSTANCE;
        } else {
            int iMin = Math.min(i2, C814420VxA.LIZ(Math.ceil((Math.sqrt(i2) * d) + ((double) i3))));
            if (iMin < 0) {
                return C13BV.INSTANCE;
            }
            if (i2 <= 0) {
                return C13BV.INSTANCE;
            }
            listLL = C13LP.LL(C1697820uHc.LIZLLL(C13LZ.LJIILJJIL(0, i2)), iMin);
        }
        q3.b.a(aVar, "getSampleList size:" + listLL.size() + " and duration: " + ((System.nanoTime() - jNanoTime) / ((long) 1000000)) + " ms", this.f, (Throwable) null, 4, (Object) null);
        return listLL;
    }

    public final void a(String str, q5 q5Var) throws zg.a.C0080a {
        long jNanoTime = System.nanoTime();
        if (C09RB.LJFF(C09RB.LJIIIZ(C08QB.LJIIL(new C0VSJ(str)), new b(str))) == q5Var.c.size()) {
            q3.b.a(q3.a, "checkGeckoFolderFileCountIsSameAsManifestEntryCount duration: " + ((System.nanoTime() - jNanoTime) / ((long) 1000000)) + " ms", this.f, (Throwable) null, 4, (Object) null);
            return;
        }
        throw new zg.a.C0080a(GeckoValidationError.DirectoryContentsDoNotMatch);
    }

    public final void a(p5 p5Var, mg mgVar) throws zg.a.C0080a {
        if (Intrinsics.LJFF(p5Var.b, mgVar.c())) {
        } else {
            throw new zg.a.C0080a(GeckoValidationError.HashDoesNotMatch);
        }
    }

    @Override // ttpobfuscated.zg
    public Object a(String str, q5 q5Var, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object c098200Yq;
        boolean z;
        int size;
        AtomicInteger atomicInteger;
        long jNanoTime;
        q3.a aVar;
        int i2;
        try {
            q3.a aVar2 = q3.a;
            q3.b.a(aVar2, "gecko verification with concurrency for manifest size: " + q5Var.c.size() + '}', this.f, (Throwable) null, 4, (Object) null);
            a(str, q5Var);
            List<Integer> listA = a(q5Var.c.entrySet().size(), (GeneralConfig) this.b.get());
            int i3 = 0;
            if ((listA.isEmpty() || listA.size() >= this.e) && this.c) {
                z = true;
            } else {
                z = false;
            }
            q3.b.a(aVar2, "gecko useThreadExecutor :" + z, this.f, (Throwable) null, 4, (Object) null);
            if (z && (i2 = this.d) != 4 && Integer.compare(i2 ^ Integer.MIN_VALUE, Integer.MIN_VALUE) > 0) {
                j = C786410Ut5.d4(this.d);
            }
            if (listA.isEmpty()) {
                size = q5Var.c.size();
            } else {
                size = listA.size();
            }
            CountDownLatch countDownLatch = new CountDownLatch(size);
            atomicInteger = new AtomicInteger(0);
            jNanoTime = System.nanoTime();
            for (p5 p5Var : q5Var.c.values()) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    p5 p5Var2 = p5Var;
                    mg mgVarA = mg.a.a(str + File.separator + p5Var2.a);
                    if (!listA.isEmpty() && !listA.contains(C2286608xc.LJ(i3))) {
                        if (mgVarA.d() != p5Var2.c) {
                            throw new zg.a.C0080a(GeckoValidationError.SizeDoesNotMatch);
                        }
                    } else if (!z) {
                        z = false;
                        a(p5Var2, mgVarA);
                    } else {
                        z = true;
                        a(j, countDownLatch, this.h, this.g, new c(p5Var2, mgVarA));
                    }
                    atomicInteger.incrementAndGet();
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (z) {
                countDownLatch.await(30L, TimeUnit.SECONDS);
            }
            aVar = q3.a;
            q3.b.a(aVar, "gecko scan file count: " + atomicInteger.get(), this.f, (Throwable) null, 4, (Object) null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (atomicInteger.get() == q5Var.c.size()) {
            q3.b.a(aVar, "gecko files manifest verification duration: " + ((System.nanoTime() - jNanoTime) / ((long) 1000000)) + " ms", this.f, (Throwable) null, 4, (Object) null);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                q3.a aVar3 = q3.a;
                StringBuilder sb = new StringBuilder("Error while validating file entries: ");
                sb.append(str);
                sb.append(' ');
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                sb.append(message);
                String string = sb.toString();
                String str2 = this.f;
                aVar3.getClass();
                q3.a.c.b(string, str2, thM5exceptionOrNullimpl);
                if (thM5exceptionOrNullimpl instanceof InterruptedException) {
                    zg.a.C0080a c0080a = new zg.a.C0080a(GeckoValidationError.HashDoesNotMatch);
                    Throwable th2 = this.g.get();
                    if (th2 instanceof zg.a.C0080a) {
                        throw th2;
                    }
                    throw c0080a;
                }
                if (!(thM5exceptionOrNullimpl instanceof zg.a)) {
                    if (!(thM5exceptionOrNullimpl instanceof IOException) && !(thM5exceptionOrNullimpl instanceof SecurityException) && !(thM5exceptionOrNullimpl instanceof UnsupportedOperationException)) {
                        if (thM5exceptionOrNullimpl instanceof NoSuchAlgorithmException) {
                            throw new zg.a.C0080a(GeckoValidationError.UnableToComputeHash);
                        }
                        throw new zg.a.C0080a(GeckoValidationError.PathDoesNotExist);
                    }
                    throw new zg.a.C0080a(GeckoValidationError.PathDoesNotExist);
                }
                throw thM5exceptionOrNullimpl;
            }
            return Unit.LIZ;
        }
        throw new zg.a.C0080a(GeckoValidationError.DirectoryContentsDoNotMatch);
    }

    public final boolean a(String str, String str2, String str3) {
        if (this.a && (Intrinsics.LJFF(str2, "manifest-sandbox.json") || Intrinsics.LJFF(str2, "manifest-sandbox-signed.json"))) {
            if (Intrinsics.LJFF(str3, str + File.separator + str2)) {
                return true;
            }
        }
        if (Intrinsics.LJFF(str2, "manifest-sandbox-signed.json")) {
            if (Intrinsics.LJFF(str3, str + File.separator + str2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void a(AtomicReference atomicReference, Function0 function0, Thread thread, CountDownLatch countDownLatch) {
        try {
            if (atomicReference.get() != null) {
                countDownLatch.countDown();
                return;
            }
            function0.invoke();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        countDownLatch.countDown();
    }

    public b1(boolean z, u1 u1Var, boolean z2, int i2, int i3) {
        this.a = z;
        this.b = u1Var;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final void a(Executor executor, final CountDownLatch countDownLatch, final Thread thread, final AtomicReference<Throwable> atomicReference, final Function0<Unit> function0) {
        executor.execute(new Runnable() { // from class: X.0pKC
            @Override // java.lang.Runnable
            public final void run() {
                b1.lambda$semisugar$a$0(atomicReference, function0, thread, countDownLatch);
            }
        });
    }
}
