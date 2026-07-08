package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C19EG;
import X.C2110908Ot;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.ExceptionInfoReporter;
import com.bytedance.tt.reliability.monitor.viewchecker.FragmentAddRecorder;
import com.bytedance.tt.reliability.monitor.viewchecker.FragmentChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.FragmentCheckerConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public class FragmentChecker {
    public static ExceptionInfoReporter sReporter;
    public static List<FragmentCheckerConfig> sConfigs = new ArrayList();
    public static boolean enableCheck = false;
    public static int sMaxDumpCount = 3;
    public static Thread.UncaughtExceptionHandler sDefaultHandler = null;
    public static final Thread.UncaughtExceptionHandler exceptionHandler = new Thread.UncaughtExceptionHandler() { // from class: X.19Eb
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
            try {
                if (FragmentChecker.isAddFragmentException(th)) {
                    List<FragmentAddRecorder.RecordEntry> listSnapshot = FragmentAddRecorder.snapshot(FragmentChecker.sMaxDumpCount);
                    ExceptionInfoReporter exceptionInfoReporter = FragmentChecker.sReporter;
                    if (exceptionInfoReporter != null) {
                        exceptionInfoReporter.report(listSnapshot.toString());
                    }
                }
                uncaughtExceptionHandler = FragmentChecker.sDefaultHandler;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    uncaughtExceptionHandler = FragmentChecker.sDefaultHandler;
                    if (uncaughtExceptionHandler == null) {
                        return;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = FragmentChecker.sDefaultHandler;
                    if (uncaughtExceptionHandler2 != null) {
                        uncaughtExceptionHandler2.uncaughtException(thread, th);
                    }
                    throw th3;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    };

    public static String getHostActivity(Fragment fragment) {
        try {
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                return activity.getClass().getSimpleName();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static boolean isAddFragmentException(Throwable th) {
        if ((th instanceof IllegalStateException) && th.getMessage() != null && th.getMessage().contains("Fragment already added")) {
            return true;
        }
        return false;
    }

    public static boolean filterFragment(Fragment fragment, String str) {
        if (enableCheck && !sConfigs.isEmpty()) {
            for (FragmentCheckerConfig fragmentCheckerConfig : sConfigs) {
                if (fragmentCheckerConfig != null) {
                    if (fragmentCheckerConfig.getTag() != null && fragmentCheckerConfig.getTag().equals(str)) {
                        return true;
                    }
                    if (fragmentCheckerConfig.getFragmentName() != null && fragmentCheckerConfig.getFragmentName().equals(fragment.getClass().getSimpleName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void init(boolean z, int i, List<FragmentCheckerConfig> list, ExceptionInfoReporter exceptionInfoReporter) {
        if (z) {
            enableCheck = true;
            sConfigs.clear();
            sConfigs.addAll(list);
            sMaxDumpCount = i;
            sReporter = exceptionInfoReporter;
            sDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(exceptionHandler);
        }
    }

    public void doAddOpInsert(int i, Fragment fragment, String str, int i2) {
        try {
            if (filterFragment(fragment, str)) {
                FragmentAddRecorder.record(fragment, str, i, getHostActivity(fragment), 24);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        int i3 = C2110908Ot.LIZ;
    }
}
