package cs.bd.o;

import X.C08PQ;
import X.C08RN;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends C08PQ {
    public static File LIZJ(Context context) throws Throwable {
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

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(8:48|3|(1:5)|6|40|7|42|8)|(6:9|(1:11)(1:50)|46|33|36|37)|12|(1:14)(2:15|(1:17))|44|18|46|33|36|37|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.C08PQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r10, java.lang.String r12, java.lang.Object r13) {
        /*
            r9 = this;
            java.lang.String r4 = "/na.czl"
            X.08Oq r0 = X.C2110608Oq.LIZIZ
            android.content.Context r3 = r0.LIZ
            r8 = 255(0xff, float:3.57E-43)
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7e
            r1.<init>()     // Catch: java.lang.Throwable -> L7e
            java.io.File r0 = LIZJ(r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L7e
            r1.append(r0)     // Catch: java.lang.Throwable -> L7e
            r1.append(r4)     // Catch: java.lang.Throwable -> L7e
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L7e
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L2f
            r8 = 2
            r1.delete()     // Catch: java.lang.Throwable -> L7e
        L2f:
            android.content.res.Resources r0 = r3.getResources()     // Catch: java.lang.Throwable -> L7e
            android.content.res.AssetManager r1 = r0.getAssets()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = "na.czl"
            java.io.InputStream r6 = r1.open(r0)     // Catch: java.lang.Throwable -> L7e
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L81
            r5.<init>()     // Catch: java.lang.Throwable -> L81
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r4]     // Catch: java.lang.Throwable -> L86
        L46:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch: java.lang.Throwable -> L86
            r0 = -1
            if (r1 == r0) goto L52
            r5.write(r3, r2, r1)     // Catch: java.lang.Throwable -> L86
            goto L46
        L52:
            X.0VSV r1 = new X.0VSV     // Catch: java.lang.Throwable -> L86
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L86
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L86
            r1.write(r0)     // Catch: java.lang.Throwable -> L86
            r1.close()     // Catch: java.lang.Throwable -> L86
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L86
            if (r0 > 0) goto L69
            r8 = 3
            goto L75
        L69:
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L86
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L86
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L86
            if (r0 == 0) goto L75
            r8 = 0
        L75:
            r6.close()     // Catch: java.lang.Throwable -> L79
            goto L98
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L98
        L7e:
            r0 = move-exception
            r6 = r2
            goto L82
        L81:
            r0 = move-exception
        L82:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L8b
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r5
        L8b:
            if (r6 == 0) goto L95
            r6.close()     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L95:
            if (r2 == 0) goto La0
            r5 = r2
        L98:
            r5.close()     // Catch: java.lang.Throwable -> L9c
            goto La0
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        La0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cs.bd.o.t.LIZ(long, java.lang.String, java.lang.Object):java.lang.Object");
    }
}
