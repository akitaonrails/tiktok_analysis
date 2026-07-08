package ms.bd.o;

import X.C08RN;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class u2 {
    public static final String LIZ = (String) k.a(16777217, 0, 0, "730659", new byte[]{40, 48, 13, 65, 16, 34});

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
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
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    System.out.println("Application context obtained through ActivityThread: " + applicationContext);
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                System.out.println("Error: " + e.getMessage());
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                throw new Throwable(th.getMessage() + ":" + C08RN.LIZJ() + " applicationContext is null");
            }
        }
        return C786450Ut9.LIZJ;
    }
}
