package com.ss.android.ugc.aweme.keva;

import X.C08O8;
import X.C08OB;
import X.C08Q0;
import X.C08TN;
import X.C08TQ;
import X.C08TR;
import X.C08U6;
import X.C0VSJ;
import X.C0VSP;
import X.C1937307iN;
import X.C810670Vr7;
import X.C823050WQl;
import Y.ARunnableS103S0100000_3;
import android.content.Context;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.appinit.PreloaderInAppInit;
import com.ss.android.ugc.bytex.pthread.base.convergence.helper.NewThreadPoolHelper;
import com.tiktok.ttf.storage.task.IInitStorageHook;
import java.io.DataInputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class InitKevaHookImpl implements IInitStorageHook {
    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final void LIZ() {
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final void LIZIZ(Context context) {
        boolean zLJ;
        DataInputStream dataInputStream;
        if (C08Q0.LJ(context, "optimize_kevaio", false)) {
            zLJ = C08Q0.LJ(context, "keva_bak_sp", false);
        } else if (!C08O8.LIZ(context).exists()) {
            zLJ = false;
        } else {
            try {
                dataInputStream = new DataInputStream(new C0VSP(C08O8.LIZ));
                zLJ = dataInputStream.readBoolean();
            } catch (Throwable th) {
                th = th;
                zLJ = false;
            }
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
            }
        }
        boolean zLJ2 = C08Q0.LJ(context, "optimize_keva_sp_lazy_init", false);
        C810670Vr7.LIZIZ = zLJ;
        C810670Vr7.LJIIJ = zLJ2;
        if (!zLJ2) {
            C810670Vr7.LIZLLL(context);
        }
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final void LIZJ(String str) {
        C08TN.LIZ().LJ("application_init_keva_cso_duration", false);
        Librarian.LJFF("c++_shared");
        C08TN.LIZ().LJI("application_init_keva_cso_duration");
        C08TN.LIZ().LJ("application_init_keva_kevaso_duration", false);
        Librarian.LJFF(str);
        C08TN.LIZ().LJI("application_init_keva_kevaso_duration");
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final Executor LIZLLL(Context context) {
        if (C1937307iN.LIZIZ(32, context)) {
            int iMin = Math.min(10, Math.max(Runtime.getRuntime().availableProcessors() * 2, 6));
            ThreadPoolExecutor threadPoolExecutorNewThreadPool = NewThreadPoolHelper.INSTANCE.newThreadPool(iMin, iMin, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C08U6("keva-pool-"), new ThreadPoolExecutor.AbortPolicy());
            threadPoolExecutorNewThreadPool.allowCoreThreadTimeOut(true);
            return threadPoolExecutorNewThreadPool;
        }
        return C823050WQl.LIZLLL();
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final boolean LJ(Context context) {
        boolean zBooleanValue = false;
        if (context == null) {
            return false;
        }
        Boolean bool = C08OB.LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(new C0VSJ(C08OB.LIZ(context) + "/is_keva_load_opt_enabled_v3.cfg").exists());
            C08OB.LIZ = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            return zBooleanValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return zBooleanValue;
        }
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final void LJFF(KevaBuilder kevaBuilder) {
        kevaBuilder.setMainThreadPriorityOpt(((Boolean) C08TQ.LIZ.getValue()).booleanValue());
        kevaBuilder.setMainThreadPriorityValue(((Number) C08TR.LIZ.getValue()).intValue());
    }

    @Override // com.tiktok.ttf.storage.task.IInitStorageHook
    public final void LJI(Context context) {
        PreloaderInAppInit.LIZLLL.countDown();
        if (C08Q0.LJ(context, "optimize_initkeva_v2", false)) {
            C823050WQl.LIZLLL().execute(new ARunnableS103S0100000_3(context, 129));
        }
    }
}
