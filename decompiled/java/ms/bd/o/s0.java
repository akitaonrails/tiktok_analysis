package ms.bd.o;

import X.C08RN;
import X.C0VSJ;
import X.C2188811AlT;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) throws Throwable {
        Context context = a.LIZIZ.LIZ;
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
                    Object obj2 = declaredField.get(objInvoke);
                    if (obj2 instanceof Application) {
                        applicationContext = ((Application) obj2).getApplicationContext();
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Application context obtained through ActivityThread: ");
                        sbLIZ.append(applicationContext);
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error: ");
                    sbLIZ2.append(e.getMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            file = C786450Ut9.LIZJ;
        }
        C0VSJ c0vsj = new C0VSJ(file, (String) k.a(16777217, 0, 0L, "d2f85b", new byte[]{59, 61, 6, 72, 11, 97, 102}));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.getAbsolutePath();
    }
}
