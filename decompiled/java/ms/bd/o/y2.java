package ms.bd.o;

import X.C08RN;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public class y2 {
    public static final String LIZ;

    static {
        k.a(16777217, 0, 0L, "774dfa", new byte[]{29, 105, 6, 78, 100});
        LIZ = (String) k.a(16777217, 0, 0L, "33377e", new byte[]{44, 53});
    }

    public static String LIZIZ(BufferedInputStream bufferedInputStream) {
        int i;
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                k.a(16777217, 0, 0L, "2f6d62", new byte[]{38, 109, 70});
            }
        } while (i >= 4096);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.y2.LIZJ(java.lang.String):java.lang.String");
    }

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
