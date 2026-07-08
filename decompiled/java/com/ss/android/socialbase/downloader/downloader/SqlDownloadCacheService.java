package com.ss.android.socialbase.downloader.downloader;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1490830otl;
import X.C1B5Y;
import X.C1B5Z;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2199681B7e;
import X.C2199751B7l;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2409809cO;
import X.C786410Ut5;
import X.C788530UwV;
import X.C817700W5w;
import X.InterfaceC2199141B5c;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes31.dex */
public class SqlDownloadCacheService extends Service {
    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = getApplicationContext();
        if (C2409809cO.LIZIZ && applicationContext == null) {
            applicationContext = C2409809cO.LIZ;
        }
        C2199681B7e.LJJIFFI(applicationContext);
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C1B5Y c1b5y = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/socialbase/downloader/downloader/SqlDownloadCacheService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisof7N9FEeDQZETXLNKJGOJc4hETq+42agTbvBtTPKKJ+0Fac=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        InterfaceC2199141B5c interfaceC2199141B5cLJIIJJI = C2199681B7e.LJIIJJI();
        if (interfaceC2199141B5cLJIIJJI instanceof C1B5Z) {
            c1b5y = ((C1B5Z) interfaceC2199141B5cLJIIJJI).LLILLJJLI;
        } else if (interfaceC2199141B5cLJIIJJI instanceof C1B5Y) {
            c1b5y = (C1B5Y) interfaceC2199141B5cLJIIJJI;
        }
        if (c1b5y instanceof IBinder) {
            return (IBinder) c1b5y;
        }
        return new Binder();
    }

    public static void LIZ(Context context, ServiceConnection serviceConnection) {
        if (context != null) {
            try {
                Intent intent = new Intent(context, (Class<?>) SqlDownloadCacheService.class);
                if (serviceConnection != null) {
                    C2204961BRm.LJJJJ(context, intent, serviceConnection, 1, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVdkPAc7AINPwUsIcwZX0WGmMfisof7N9FEeDQZETXLNKJGOJc4hETq+42agTbvBtTPKKJ+0Fac=", null));
                }
                C786410Ut5.s3(context, intent);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1490830otl.LIZJ("SqlDownloadCacheService", "startServiceAndBind", "Exception:" + th.toString());
            }
        }
    }

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
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        Context context = C2199681B7e.LIZ;
        if (C2199751B7l.LJFF.LJIIIIZZ("switch_not_auto_boot_service", C2199681B7e.LJJJJ ? 1 : 0) > 0) {
            return 2;
        }
        return iOnStartCommand;
    }
}
