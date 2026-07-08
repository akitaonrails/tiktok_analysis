package com.ss.android.ugc.aweme.memory.kill;

import X.BinderC2409309cJ;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C817700W5w;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;

/* JADX INFO: loaded from: classes4.dex */
public class RestartApplicationService extends Service {
    public final BinderC2409309cJ LL = new Binder() { // from class: X.09cJ
    };

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
        Object obj;
        final String stringExtra = null;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11065, "com/ss/android/ugc/aweme/memory/kill/RestartApplicationService", "onBind", this, new Object[]{intent}, "android.os.IBinder", new C0WZW(false, "(Landroid/content/Intent;)Landroid/os/IBinder;", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxUdXNeNl1zAHrkpDkCvMYGMdGdGhEtiZMpmCYAmyQ=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (IBinder) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            intent = (Intent) obj;
        }
        final int intExtra = intent.getIntExtra("s_FLAG_RESTART_MAIN_PROCESS", 0);
        try {
            stringExtra = intent.getStringExtra("s_FLAG_RESTART_MAIN_STRATEGY");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (intExtra != 0) {
            new BPEAThread() { // from class: X.09Ms
                public final void LIZJ() {
                    try {
                        Process.killProcess(intExtra);
                        int i = intExtra;
                        String str = stringExtra;
                        Keva repo = KevaImpl.getRepo("repo_memory_self_kill", 1);
                        repo.storeInt("pid", i);
                        repo.storeString("strategy", str);
                        repo.storeLong("time", System.currentTimeMillis());
                        Cursor cursorLJJJ = C2204961BRm.LJJJ(this.LLILLL.getContentResolver(), UriProtector.parse("content://" + (C1BWL.LIZ().getPackageName() + ".RestartContentProvider") + "/"), new String[0], null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetbpDcxXxUdXNeNl1zAHrkpDkCvMYGMdGdGhEtiZMpmCYAmyQ=", null));
                        if (cursorLJJJ != null) {
                            cursorLJJJ.close();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    try {
                        Process.killProcess(Process.myPid());
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                }

                @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("RestartApplicationService@2f8b.doReStartProcess$1");
                    boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                    try {
                        LIZJ();
                    } finally {
                    }
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    C1C7U.LIZIZ("RestartApplicationService@2f8b.doReStartProcess$1");
                }
            }.start();
        }
        return this.LL;
    }
}
