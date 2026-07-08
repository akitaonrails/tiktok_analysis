package com.ss.android.ugc.aweme.configcenter;

import X.C08Q0;
import X.C0C4Y;
import X.C0C5A;
import X.C0C5P;
import X.C0CKL;
import X.C0X35;
import X.C2162308dZ;
import X.C308170C6d;
import X.C844470XAv;
import android.content.Context;
import com.bytedance.keva.KevaBuilder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi;
import com.ss.android.ugc.aweme.legoImp.task.TasksHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class AwemeConfigCenter {
    public static boolean LIZ;
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static class AwemeConfigCenterImpl implements IAwemeConfigCenterApi {
        @Override // com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi
        public final void LIZ() {
            AwemeConfigCenter.LIZIZ.set(true);
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi
        public final void LIZIZ() {
            AwemeConfigCenter.LIZJ.set(true);
        }

        @Override // com.ss.android.ugc.aweme.launcher.service.configcenter.IAwemeConfigCenterApi
        public final boolean isInitialized() {
            return AwemeConfigCenter.LIZIZ();
        }
    }

    public static void LIZ() {
        int i;
        if (LIZ) {
            return;
        }
        C0X35.LIZ("method_configcenterinit_experiment", false);
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        if (C08Q0.LJ(contextLIZ, "abmock_io_opt_ab_get_value", false)) {
            C0C5A.LIZJ().LJI = true;
        }
        if (C08Q0.LJ(contextLIZ, "opt_ab_multi_process_java_cache", false)) {
            KevaBuilder.getInstance().setIsEnableMultiProcessLoadFromNative(1);
            i = 1;
        } else {
            i = 2;
        }
        if (contextLIZ != null) {
            try {
                if (C08Q0.LJ(contextLIZ, "cold_boot_ab_repo_merge_opt", false)) {
                    C0C4Y.LIZLLL = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C0C5P.LIZJ().getClass();
        C0C5A.LIZJ().LJFF = i;
        if (C08Q0.LJ(contextLIZ, "ab_record_vid_keva_multi_process_cache_opt", false)) {
            C0C5A.LIZJ().getClass();
        } else {
            C0C5A.LIZJ().getClass();
        }
        Long lValueOf = Long.valueOf(C08Q0.LIZJ(contextLIZ, "ab_record_vid_delay_start_time_ms_opt", 0L));
        if (lValueOf.longValue() > 0) {
            C308170C6d.LIZIZ = lValueOf.longValue();
        }
        C0X35.LJIIJJI("method_configcenterinit_experiment", false);
        C0X35.LIZ("method_init_abtest_duration", false);
        C844470XAv.LIZ.getClass();
        Context contextLIZ2 = C844470XAv.LIZ();
        if (C2162308dZ.LJI(contextLIZ2)) {
            TasksHolder.LIZ().run(contextLIZ2);
        }
        C0X35.LJIIJJI("method_init_abtest_duration", false);
        C0X35.LIZ("method_init_config_duration", false);
        if (TasksHolder.LIZLLL == null) {
            TasksHolder.LIZLLL = C0CKL.LIZIZ.LIZIZ();
        }
        TasksHolder.LIZLLL.run(contextLIZ2);
        C0X35.LJIIJJI("method_init_config_duration", false);
        LIZ = true;
    }

    public static boolean LIZIZ() {
        return LIZJ.get() && LIZIZ.get();
    }
}
