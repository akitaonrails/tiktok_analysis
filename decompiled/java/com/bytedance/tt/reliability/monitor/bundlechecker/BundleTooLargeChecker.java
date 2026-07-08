package com.bytedance.tt.reliability.monitor.bundlechecker;

import X.C0W0G;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.CommonUtils;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleTooLargeChecker;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.lang.Thread;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes14.dex */
public class BundleTooLargeChecker {
    public static int LARGE_BUNDLE_SIZE = 51200;
    public static int MAX_RECENT_BUNDLE_TOO_LARGE_POINT = 8;
    public static final String[] blackList = {"org.chromium.base.process_launcher.extra.extraFiles"};
    public static final C0W0G<BundleTooLargePoint> bundleTooLargePoints = new C0W0G<>();
    public static final Thread.UncaughtExceptionHandler crashHandler = new Thread.UncaughtExceptionHandler() { // from class: X.0W0F
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            BundleTooLargeChecker.BundleTooLargeCrashListener bundleTooLargeCrashListener;
            if (BundleTooLargeChecker.enableCheck && BundleTooLargeChecker.isBundleTooLargeCrash(th)) {
                C0W0G<BundleTooLargeChecker.BundleTooLargePoint> c0w0g = BundleTooLargeChecker.bundleTooLargePoints;
                if (c0w0g.LIZ.size() > 0 && (bundleTooLargeCrashListener = BundleTooLargeChecker.listener) != null) {
                    bundleTooLargeCrashListener.onCrash(c0w0g.toString());
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = BundleTooLargeChecker.originalHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    };
    public static boolean enableCheck;
    public static BundleTooLargeCrashListener listener;
    public static Thread.UncaughtExceptionHandler originalHandler;

    public interface BundleTooLargeCrashListener {
        void onCrash(String str);
    }

    public static class BundleTooLargePoint {
        public final String bundleInfo;
        public final Exception exception;
        public final String threadName;
        public final long timestamp = System.currentTimeMillis();

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nBundleTooLargePoint{time=");
            sbLIZ.append(CommonUtils.transformTime(this.timestamp));
            sbLIZ.append(", bundle info='");
            sbLIZ.append(this.bundleInfo);
            sbLIZ.append('\'');
            sbLIZ.append(", threadName='");
            sbLIZ.append(this.threadName);
            sbLIZ.append('\'');
            sbLIZ.append(", stack='");
            sbLIZ.append(Log.getStackTraceString(this.exception));
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public static String formatSize(int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i / 1024.0f);
            sbLIZ.append("K");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public BundleTooLargePoint(String str, int i) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bundle key: ");
            sbLIZ.append(str);
            sbLIZ.append(", size: ");
            sbLIZ.append(formatSize(i));
            this.bundleInfo = C2188811AlT.LIZIZ(sbLIZ);
            this.threadName = C786410Ut5.u3().getName();
            this.exception = new RuntimeException("BundleTooLargePoint");
        }
    }

    public static boolean isEnableCheck() {
        return enableCheck;
    }

    public static int getSize(Object obj) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeValue(obj);
            int iDataSize = parcelObtain.dataSize();
            parcelObtain.recycle();
            return iDataSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            parcelObtain.recycle();
            throw th;
        }
    }

    public static boolean isBundleTooLargeCrash(Throwable th) {
        while (th != null) {
            if (th instanceof TransactionTooLargeException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setEnableCheck(boolean z) {
        enableCheck = z;
    }

    public static void setLargeBundleSize(int i) {
        LARGE_BUNDLE_SIZE = i;
    }

    public static void setMaxRecentBundleTooLargePoint(int i) {
        MAX_RECENT_BUNDLE_TOO_LARGE_POINT = i;
    }

    public static void monitor(boolean z, BundleTooLargeCrashListener bundleTooLargeCrashListener) {
        if (z && enableCheck) {
            return;
        }
        enableCheck = z;
        listener = bundleTooLargeCrashListener;
        if (z) {
            originalHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(crashHandler);
        }
    }

    public static void recordBundleTooLargePoint(String str, Object obj) {
        if (obj != null && enableCheck && !(obj instanceof Closeable)) {
            if (obj.getClass().isArray() && Array.getLength(obj) > 0 && (Array.get(obj, 0) instanceof Closeable)) {
                return;
            }
            for (String str2 : blackList) {
                if (str2.equals(str)) {
                    return;
                }
            }
            try {
                int size = getSize(obj);
                if (size >= LARGE_BUNDLE_SIZE) {
                    C0W0G<BundleTooLargePoint> c0w0g = bundleTooLargePoints;
                    synchronized (c0w0g) {
                        try {
                            BundleTooLargePoint bundleTooLargePoint = new BundleTooLargePoint(str, size);
                            if (c0w0g.LIZ.size() == c0w0g.LIZIZ) {
                                c0w0g.LIZ.pollLast();
                            }
                            c0w0g.LIZ.addFirst(bundleTooLargePoint);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            } catch (Throwable th) {
            }
        }
    }
}
