package ttpobfuscated;

import X.C08FF;
import X.C13LE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ttpobfuscated.q3;

/* JADX INFO: loaded from: classes24.dex */
public final class dg {
    public static final dg a = new dg();
    public static final String b = C13LE.LIZ(dg.class).LJI();
    public static ReentrantLock d;
    public static Condition e;
    public static volatile a f;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        d = reentrantLock;
        e = reentrantLock.newCondition();
        f = a.NotReady;
    }

    public final void a() {
        f = a.NotReady;
        ReentrantLock reentrantLock = new ReentrantLock();
        d = reentrantLock;
        e = reentrantLock.newCondition();
    }

    public final Condition b() {
        return e;
    }

    public final ReentrantLock c() {
        return d;
    }

    public final a d() {
        return f;
    }

    public enum a {
        NotReady,
        Ready,
        Broken;

        public static final /* synthetic */ a[] a() {
            return new a[]{NotReady, Ready, Broken};
        }

        public static a valueOf(String str) {
            return (a) C08FF.LIZ(a.class, str);
        }
    }

    public final void a(Function0<Unit> function0) {
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            function0.invoke();
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(a aVar) {
        f = aVar;
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            e.signalAll();
            q3.b.a(q3.a, "Release lock", b, (Throwable) null, 4, (Object) null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean a(long j) {
        return e.await(j, TimeUnit.MILLISECONDS);
    }

    public final void a(Condition condition) {
        e = condition;
    }

    public final void a(ReentrantLock reentrantLock) {
        d = reentrantLock;
    }

    public final void a(a aVar) {
        f = aVar;
    }

    public static boolean a(dg dgVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1500;
        }
        dgVar.getClass();
        return e.await(j, TimeUnit.MILLISECONDS);
    }
}
