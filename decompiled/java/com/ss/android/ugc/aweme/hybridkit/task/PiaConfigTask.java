package com.ss.android.ugc.aweme.hybridkit.task;

import X.C04TD;
import X.C1542560qFC;
import X.C1C7U;
import X.C2213981Bky;
import X.InterfaceC1503700pEW;
import X.InterfaceC1537230q6b;
import X.InterfaceC1549120qPm;
import X.RunnableC1545360qJi;
import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pia.core.spi.api.IPiaConfigTask;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PiaConfigTask implements IPiaConfigTask {
    public static IPiaConfigTask LIZ() {
        Object objLIZ = C04TD.LIZ(IPiaConfigTask.class, false);
        if (objLIZ != null) {
            return (IPiaConfigTask) objLIZ;
        }
        if (C04TD.M0 == null) {
            synchronized (IPiaConfigTask.class) {
                if (C04TD.M0 == null) {
                    C04TD.M0 = new PiaConfigTask();
                }
            }
        }
        return C04TD.M0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("PiaConfigTask@9ce.run");
        Application application = C2213981Bky.LIZIZ.getApplication();
        if (application != null && C1542560qFC.LIZ == null) {
            C1542560qFC.LIZ = application;
        }
        InterfaceC1549120qPm interfaceC1549120qPm = new InterfaceC1549120qPm() { // from class: X.0qFB
            @Override // X.InterfaceC1549120qPm
            public final <T> T LIZ(String str, Type type, T t) {
                T t2;
                if (str != null && type != null) {
                    if (Intrinsics.LJFF(str, "spark_iab_optimize_pia")) {
                        return (T) Boolean.FALSE;
                    }
                    if (Intrinsics.LJFF(str, "pia_build_task_leak")) {
                        return (T) Boolean.valueOf(C1535880q4Q.LIZJ);
                    }
                    try {
                        t2 = (T) C7740030o.LIZ().getGson().LJIIIIZZ((String) C0C59.LJ().LJIIJJI(str, true), type);
                        C189200o6.m2constructorimpl(t2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        t2 = (T) new C098200Yq(th);
                        C189200o6.m2constructorimpl(t2);
                    }
                    if (!C189200o6.m7isFailureimpl(t2)) {
                        return t2;
                    }
                }
                return t;
            }
        };
        if (C1542560qFC.LIZJ == null) {
            C1542560qFC.LIZJ = interfaceC1549120qPm;
        }
        InterfaceC1537230q6b interfaceC1537230q6b = new InterfaceC1537230q6b() { // from class: X.0qFD
            @Override // X.InterfaceC1537230q6b
            public final Object create() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                C1545710qKH c1545710qKH = C1545710qKH.LIZ;
                C2213981Bky.LIZIZ.getApplication();
                c1545710qKH.getClass();
                sbLIZ.append(C1545710qKH.LIZ());
                sbLIZ.append(" Spark/1.7.2 BytedanceWebview/d8a21c6");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1537230q6b
            public final Object LIZ(Object obj) {
                return create();
            }
        };
        if (C1542560qFC.LIZLLL == null) {
            C1542560qFC.LIZLLL = interfaceC1537230q6b;
        }
        InterfaceC1537230q6b<InterfaceC1503700pEW> interfaceC1537230q6b2 = new InterfaceC1537230q6b<InterfaceC1503700pEW>() { // from class: X.0qF3
            @Override // X.InterfaceC1537230q6b
            public final InterfaceC1503700pEW create() {
                return new C1523250pk3(null, null);
            }

            @Override // X.InterfaceC1537230q6b
            public final InterfaceC1503700pEW LIZ(Object obj) {
                C1530150pvB c1530150pvB;
                C1537480q70 c1537480q70;
                String strLJIJI = null;
                if ((obj instanceof C1530150pvB) && (c1530150pvB = (C1530150pvB) obj) != null && (c1537480q70 = c1530150pvB.LIZ) != null) {
                    strLJIJI = c1537480q70.LJIJI();
                }
                return new C1523250pk3(strLJIJI, obj);
            }
        };
        if (C1542560qFC.LJFF == null) {
            C1542560qFC.LJFF = interfaceC1537230q6b2;
        }
        ((ArrayList) C1542560qFC.LJI).add(new InterfaceC1537230q6b() { // from class: X.0qF5
            @Override // X.InterfaceC1537230q6b
            public final Object create() {
                return C1522140piG.LIZ;
            }

            @Override // X.InterfaceC1537230q6b
            public final Object LIZ(Object obj) {
                create();
                return C1522140piG.LIZ;
            }
        });
        RunnableC1545360qJi runnableC1545360qJi = new Runnable() { // from class: X.0qJi
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PiaConfigTask@9ce.run$5");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PiaConfigTask@9ce.run$5");
            }

            public static void LIZ() {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("spark_pia_initialize_fix", true)) {
                    C1529360ptu.LIZ.LIZLLL(null);
                }
                C1545370qJj c1545370qJj = new C1545370qJj();
                C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
                c1545370qJj.LIZ = c2213981Bky.getAppId();
                c1545370qJj.LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                c1545370qJj.LIZLLL = c2213981Bky.getAppName();
                c1545370qJj.LJ = c2213981Bky.getChannel();
                c1545370qJj.LJFF = Build.PRODUCT;
                c1545370qJj.LJII = c2213981Bky.getVersionName();
                c1545370qJj.LIZIZ = -1L;
                if (c1545370qJj.LIZ == 0 || TextUtils.isEmpty(c1545370qJj.LIZJ)) {
                    return;
                }
                Pattern pattern = C1545400qJm.LJIIIIZZ;
                Matcher matcher = pattern.matcher(c1545370qJj.LJII);
                if (!matcher.find() || matcher.group(0) == null) {
                    return;
                }
                c1545370qJj.LJII = matcher.group(0);
                if (c1545370qJj.LIZIZ <= 0) {
                    c1545370qJj.LIZIZ = -1L;
                }
                Matcher matcher2 = pattern.matcher(c1545370qJj.LJI);
                if (matcher2.find() && matcher2.group(0) != null) {
                    c1545370qJj.LJI = matcher2.group(0);
                }
                C1545400qJm c1545400qJm = new C1545400qJm(c1545370qJj.LIZJ, c1545370qJj.LIZLLL, c1545370qJj.LJ, c1545370qJj.LJFF, c1545370qJj.LJI, c1545370qJj.LJII, c1545370qJj.LIZ, c1545370qJj.LIZIZ);
                InterfaceC1545380qJk interfaceC1545380qJk = (InterfaceC1545380qJk) C1963807me.LIZ(InterfaceC1545380qJk.class);
                if (interfaceC1545380qJk != null) {
                    interfaceC1545380qJk.LIZ(c1545400qJm);
                }
            }
        };
        if (C1542560qFC.LIZIZ == null) {
            C1542560qFC.LIZIZ = runnableC1545360qJi;
        }
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null) {
            iSparkHostApi.LJJZZIII();
        }
        C1C7U.LIZIZ("PiaConfigTask@9ce.run");
    }
}
