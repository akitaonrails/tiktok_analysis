package com.ss.android.socialbase.downloader.downloader;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1490830otl;
import X.C1B74;
import X.C1B7F;
import X.C2188191AkT;
import X.C2199681B7e;
import X.C2199751B7l;
import X.C2214201BlK;
import X.C788530UwV;
import Y.ARunnableS134S0100000_34;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes35.dex */
public class DownloadService extends Service {
    public C1B7F LL;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        C2199681B7e.LJJIFFI(this);
        C1B7F c1b7fLJIIZILJ = C2199681B7e.LJIIZILJ();
        this.LL = c1b7fLJIIZILJ;
        ((C1B74) c1b7fLJIIZILJ).LL = new WeakReference<>(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        if (C1490830otl.LIZ()) {
            C1490830otl.LIZIZ("DownloadService", "onDestroy", "Run");
        }
        C1B7F c1b7f = this.LL;
        if (c1b7f != null) {
            ((C1B74) c1b7f).LLILLL = false;
            this.LL = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        Object obj;
        boolean z = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/socialbase/downloader/downloader/DownloadService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisof7N9FEeDQZETXLNP4+VD805HjKC53CVRbvM", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        if (C1490830otl.LIZ()) {
            StringBuilder sb = new StringBuilder("DownloadServiceHandler != null:");
            if (this.LL == null) {
                z = false;
            }
            sb.append(z);
            C1490830otl.LIZIZ("DownloadService", "onBind", sb.toString());
        }
        C1B7F c1b7f = this.LL;
        if (c1b7f == null) {
            return null;
        }
        return c1b7f.LIZJ(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.socialbase.downloader.downloader.DownloadService] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.ss.android.socialbase.downloader.downloader.DownloadService] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
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
    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        ?? r2;
        ?? r22;
        if (C1490830otl.LIZ()) {
            r2 = "Run";
            C1490830otl.LIZIZ("DownloadService", "onStartCommand", "Run");
        }
        try {
            r2 = this;
            C1B7F c1b7f = r2.LL;
            r22 = r2;
            if (c1b7f != null) {
                c1b7f.LIZIZ();
                r22 = r2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            r22 = r2;
        }
        ExecutorService executorServiceLJI = C2199681B7e.LJI();
        if (executorServiceLJI != null) {
            executorServiceLJI.execute(new ARunnableS134S0100000_34(r22, intent, i, i2, 16));
        }
        if (C2199751B7l.LJFF.LJIIIIZZ("switch_not_auto_boot_service", C2199681B7e.LJJJJ ? 1 : 0) > 0) {
            return 2;
        }
        return 3;
    }
}
