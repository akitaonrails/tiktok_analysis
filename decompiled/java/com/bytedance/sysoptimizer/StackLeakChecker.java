package com.bytedance.sysoptimizer;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class StackLeakChecker {
    public static String TAG = "SYSOPTIMIZER";
    public static boolean mCheckerEnabled = false;
    public static int mLeakThreadThreshold = 10;
    public static long mStackCheckInterval = 60000000;
    public static ArrayList<StackLeakItem> mLeakList = new ArrayList<>();
    public static ArrayList<StackLeakListener> mListeners = new ArrayList<>();

    public interface StackLeakListener {
        void onLeakReport(ArrayList<StackLeakItem> arrayList);
    }

    public static native boolean setEnable(boolean z, int i, int i2, long j, String[] strArr);

    public static synchronized void disableChecker() {
        if (mCheckerEnabled) {
            setEnable(false, 0, 0, 0L, null);
        }
    }

    public static void reportLeak() {
        Iterator<StackLeakListener> it2 = mListeners.iterator();
        while (it2.hasNext()) {
            it2.next().onLeakReport(mLeakList);
        }
        mLeakList.clear();
    }

    public static boolean loadOptimizerOnNeed(Context context) {
        if (Build.VERSION.SDK_INT > 29) {
            return false;
        }
        return SysOptimizer.loadOptimizerLibrary(context);
    }

    public static synchronized void registerStackLeakListener(StackLeakListener stackLeakListener) {
        if (stackLeakListener != null) {
            mListeners.add(stackLeakListener);
        }
    }

    public static synchronized boolean enableChecker(Context context, String[] strArr) {
        if (mCheckerEnabled) {
            return true;
        }
        if (!loadOptimizerOnNeed(context)) {
            return false;
        }
        try {
            boolean enable = setEnable(true, Build.VERSION.SDK_INT, mLeakThreadThreshold, mStackCheckInterval, strArr);
            mCheckerEnabled = enable;
            return enable;
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static synchronized void setInterval(int i, long j) {
        long j2;
        int i2 = i;
        synchronized (StackLeakChecker.class) {
            if (i2 <= 0) {
                i2 = 10;
            }
            mLeakThreadThreshold = i2;
            if (j <= 10000000) {
                j2 = 10000000;
            } else {
                j2 = (j / 10000000) * 10000000;
            }
            mStackCheckInterval = j2;
            if (mCheckerEnabled) {
                setEnable(true, 0, i2, j2, null);
            }
        }
    }

    public static void addLeakItem(int i, long j, long j2, long j3, String str, String str2) {
        mLeakList.add(new StackLeakItem(i, j, j2, j3, str, str2));
    }
}
