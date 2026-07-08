package ms.bd.o;

import X.C08RN;
import X.C0VSJ;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.w2;

/* JADX INFO: loaded from: classes4.dex */
public class t2 {
    public static volatile t2 LJ = null;
    public static int LJFF = 50;
    public final LinkedList<String> LIZ = new LinkedList<>();
    public final Lock LIZIZ = new ReentrantLock();
    public final w2 LIZJ;
    public final ThreadPoolExecutor LIZLLL;

    public class a implements w2.a {
        @Override // ms.bd.o.w2.a
        public final Object a(String str) {
            return str;
        }

        @Override // ms.bd.o.w2.a
        public final String a(Object obj) {
            return (String) obj;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void LIZ() {
            try {
                ((ReentrantLock) t2.this.LIZIZ).lock();
                t2 t2Var = t2.this;
                t2Var.LIZJ.LIZJ(t2Var.LIZ);
                ((ReentrantLock) t2.this.LIZIZ).unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) t2.this.LIZIZ).unlock();
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
            }
        }
    }

    public static t2 LIZ(Context context) {
        if (LJ == null) {
            synchronized (t2.class) {
                try {
                    if (LJ == null) {
                        LJ = new t2(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final Object[] LIZIZ(int i) {
        try {
            if (((ReentrantLock) this.LIZIZ).tryLock(5L, TimeUnit.SECONDS)) {
                if (i <= 0) {
                    LIZJ();
                    return null;
                }
                Object[] array = this.LIZ.size() > i ? this.LIZ.subList(0, i).toArray() : this.LIZ.toArray();
                LJFF = i;
                LIZJ();
                return array;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZJ();
        return null;
    }

    public final void LIZJ() {
        try {
            ((ReentrantLock) this.LIZIZ).unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public t2(Context context) throws Throwable {
        Object obj;
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = context.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file, (String) k.a(16777217, 0, 0L, "059c9c", new byte[]{111, 58, 89, 26, 57, 119, 50, 23, 96, 54}));
        this.LIZLLL = (ThreadPoolExecutor) C786410Ut5.d4(1);
        w2 w2Var = new w2(c0vsj, (String) k.a(16777217, 0, 0L, "0328bd", new byte[]{111, 60, 64, 95, 73}), new a());
        this.LIZJ = w2Var;
        w2Var.LIZIZ(this.LIZ);
    }
}
