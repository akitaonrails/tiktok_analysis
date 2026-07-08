package com.ss.android.message.log;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C808470VnZ;
import X.C808480Vna;
import X.C808510Vnd;
import X.C817700W5w;
import X.InterfaceC808490Vnb;
import X.InterfaceC808610Vnn;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.util.Log;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes14.dex */
public class LogService extends Service implements WeakHandler.IHandler {
    public Messenger LL;

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        try {
            InterfaceC808490Vnb interfaceC808490Vnb = (InterfaceC808490Vnb) C808470VnZ.LIZ(InterfaceC808490Vnb.class);
            if (interfaceC808490Vnb != null) {
                interfaceC808490Vnb.tryInit();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C808510Vnd.LIZ().getClass();
        this.LL = new Messenger(new WeakHandler(C786410Ut5.W2(C808510Vnd.LLILLL), this));
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

    /* JADX WARN: Can't wrap try/catch for region: R(9:46|(1:48)(1:50)|49|(2:71|51)|57|69|58|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMsg(android.os.Message r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.LogService.handleMsg(android.os.Message):void");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/message/log/LogService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKa4CM6LePJHwm3HtpWxYkxKqRdeqiNg==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
        }
        toString();
        return this.LL.getBinder();
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnBind ");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int iOnStartCommand = super.onStartCommand(intent, i, i2);
        InterfaceC808610Vnn interfaceC808610VnnLIZ = C808480Vna.LIZ();
        if (interfaceC808610VnnLIZ != null && !interfaceC808610VnnLIZ.LJFF()) {
            return iOnStartCommand;
        }
        return 2;
    }
}
