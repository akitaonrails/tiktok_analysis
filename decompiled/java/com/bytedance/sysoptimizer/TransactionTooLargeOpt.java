package com.bytedance.sysoptimizer;

import X.C0WZX;
import X.C1701330uNH;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class TransactionTooLargeOpt {
    public static boolean sForceClear = false;
    public static boolean sRestartOnRestore = false;
    public static int sSaveRootBundleSize = 460800;
    public static boolean sStarted;
    public static List<String> sDisableActivities = Collections.EMPTY_LIST;
    public static final Map<String, Bundle> sKey2ContentMap = new HashMap();
    public static ILog sLog = new ILog() { // from class: com.bytedance.sysoptimizer.TransactionTooLargeOpt.1
        @Override // com.bytedance.sysoptimizer.TransactionTooLargeOpt.ILog
        public void d(String str, String str2) {
        }

        @Override // com.bytedance.sysoptimizer.TransactionTooLargeOpt.ILog
        public void e(String str, String str2) {
        }
    };
    public static final Application.ActivityLifecycleCallbacks ACTIVITY_LIFECYCLE_CALLBACKS = new Application.ActivityLifecycleCallbacks() { // from class: com.bytedance.sysoptimizer.TransactionTooLargeOpt.2
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            boolean z;
            boolean zIsFinishing = activity.isFinishing();
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityDestroyed() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append("], finishing = [");
            sbLIZ.append(zIsFinishing);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
            if (zIsFinishing) {
                Bundle bundleRemove = TransactionTooLargeOpt.sKey2ContentMap.remove(TransactionTooLargeOpt.getActivityKey(activity));
                ILog iLog2 = TransactionTooLargeOpt.sLog;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onActivityDestroyed() called with: activity = [");
                sbLIZ2.append(activity);
                sbLIZ2.append("], remove bundle=[");
                if (bundleRemove != null) {
                    z = true;
                } else {
                    z = false;
                }
                sbLIZ2.append(z);
                sbLIZ2.append(e3.f);
                iLog2.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityPaused() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityResumed() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append("], size = [");
            sbLIZ.append(TransactionTooLargeOpt.sKey2ContentMap.size());
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            boolean z;
            Bundle bundleRemove = TransactionTooLargeOpt.sKey2ContentMap.remove(TransactionTooLargeOpt.getActivityKey(activity));
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityStarted() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append("], remove bundle=[");
            if (bundleRemove != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivityStopped() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
            if (TransactionTooLargeOpt.isDisable(activity)) {
                ILog iLog = TransactionTooLargeOpt.sLog;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onActivityPostSaveInstanceState disable for ");
                sbLIZ.append(activity);
                iLog.e("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            TransactionTooLargeOpt.saveRootBundle(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            if (bundle == null) {
                return;
            }
            if (TransactionTooLargeOpt.isDisable(activity)) {
                ILog iLog = TransactionTooLargeOpt.sLog;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onActivityPreCreated disable for ");
                sbLIZ.append(activity);
                iLog.e("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            TransactionTooLargeOpt.restoreRootBundle(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            ILog iLog = TransactionTooLargeOpt.sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onActivitySaveInstanceState() called with: activity = [");
            sbLIZ.append(activity);
            sbLIZ.append("], outState = [");
            sbLIZ.append(bundle);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
        }
    };

    public interface ILog {
        void d(String str, String str2);

        void e(String str, String str2);
    }

    public static byte[] bundle2Bytes(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                parcelObtain.recycle();
                return null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    public static int bundleSize(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.setDataPosition(0);
            parcelObtain.writeBundle(bundle);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            return iDataSize;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                sLog.e("TransactionTooLargeOpt", Log.getStackTraceString(th));
                parcelObtain.recycle();
                return 0;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                parcelObtain.recycle();
                throw th2;
            }
        }
    }

    public static String getActivityKey(Activity activity) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(activity.getClass().getName());
        sbLIZ.append(e3.g);
        sbLIZ.append(Integer.toHexString(activity.hashCode()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean isDisable(Activity activity) {
        String name = activity.getClass().getName();
        Iterator<String> it2 = sDisableActivities.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next(), name)) {
                return true;
            }
        }
        return false;
    }

    public static void restart(Activity activity) {
        Application application = activity.getApplication();
        if (application == null) {
            sLog.e("TransactionTooLargeOpt", "application == null");
            return;
        }
        Intent launchIntentForPackage = application.getPackageManager().getLaunchIntentForPackage(application.getPackageName());
        if (launchIntentForPackage == null) {
            sLog.e("TransactionTooLargeOpt", "intent == null");
            return;
        }
        INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
        sLog.e("TransactionTooLargeOpt", "RestartActivity");
        Runtime.getRuntime().exit(0);
    }

    public static void INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyXf/TQp0Xs43vafH7xlXhhite5H3TVuRqOeni1FvE5KLzGvw==", null));
    }

    public static void INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    public static Object INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static Bundle bytes2Bundle(byte[] bArr, ClassLoader classLoader) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(classLoader);
            parcelObtain.recycle();
            return bundle;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    public static void restoreRootBundle(Activity activity, Bundle bundle) {
        Bundle bundleRemove;
        Object objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get = INVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, "TransactionTooLargeOptActivityRecordKey");
        if (objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get instanceof String) {
            try {
                bundle.remove("TransactionTooLargeOptActivityRecordKey");
                bundleRemove = sKey2ContentMap.remove(objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (bundleRemove == null) {
                ILog iLog = sLog;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("restoreRootBundle() called with: uuid = [");
                sbLIZ.append(objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
                sbLIZ.append("], bundle == null");
                iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
                if (sRestartOnRestore) {
                    restart(activity);
                    return;
                }
                return;
            }
            C786410Ut5.LJJIIJZLJL(bundle, bundleRemove);
            String string = bundle.getString("TransactionTooLargeOptActivityHashCode");
            ILog iLog2 = sLog;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("restoreRootBundle() called with: uuid = [");
            sbLIZ2.append(objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
            sbLIZ2.append("], activityHashCode=[");
            sbLIZ2.append(string);
            sbLIZ2.append(e3.f);
            iLog2.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        ILog iLog3 = sLog;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("restoreRootBundle() uuid = [");
        sbLIZ3.append(objINVOKEVIRTUAL_com_bytedance_sysoptimizer_TransactionTooLargeOpt_com_ss_android_ugc_aweme_lancet_IntentLancet_get);
        sbLIZ3.append(e3.f);
        iLog3.e("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void saveRootBundle(Activity activity, Bundle bundle) {
        int iBundleSize = bundleSize(bundle);
        if (iBundleSize > sSaveRootBundleSize) {
            String activityKey = getActivityKey(activity);
            try {
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                sKey2ContentMap.put(activityKey, bundle2);
                bundle.clear();
                C786410Ut5.LJJJI("TransactionTooLargeOptActivityRecordKey", activityKey, bundle);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            C786410Ut5.LJJJI("TransactionTooLargeOptActivityHashCode", activityKey, bundle);
            ILog iLog = sLog;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveRootBundle() called with: uuid = [");
            sbLIZ.append(activityKey);
            sbLIZ.append("], size=[");
            sbLIZ.append(iBundleSize);
            sbLIZ.append(e3.f);
            iLog.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ILog iLog2 = sLog;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveRootBundle() called size = [");
        sbLIZ2.append(iBundleSize);
        sbLIZ2.append(e3.f);
        iLog2.d("TransactionTooLargeOpt", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static boolean start(ILog iLog, Application application, int i, boolean z, boolean z2, List<String> list) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29) {
            PrintStream printStream = System.out;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Ignore for sdk ");
            sbLIZ.append(i2);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        if (sStarted) {
            System.out.println("Ignore for already started");
            return false;
        }
        sStarted = true;
        sSaveRootBundleSize = i;
        sForceClear = z;
        sRestartOnRestore = z2;
        sDisableActivities = list;
        sLog = iLog;
        application.registerActivityLifecycleCallbacks(ACTIVITY_LIFECYCLE_CALLBACKS);
        return true;
    }
}
