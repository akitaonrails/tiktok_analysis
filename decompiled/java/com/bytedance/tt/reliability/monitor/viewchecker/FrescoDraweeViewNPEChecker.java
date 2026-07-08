package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C2110908Ot;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C806760Vko;
import X.InterfaceC1320380kSq;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.CommonUtils;
import com.bytedance.tt.reliability.monitor.viewchecker.FrescoDraweeViewNPEChecker;
import java.lang.Thread;

/* JADX INFO: loaded from: classes14.dex */
public class FrescoDraweeViewNPEChecker {
    public static boolean enableCheck;
    public static DraweeViewNullCheckerListener listener;
    public static Thread.UncaughtExceptionHandler originalHandler;
    public static final C806760Vko<DrawableNullPoint> drawableNullPoints = new C806760Vko<>();
    public static final Thread.UncaughtExceptionHandler crashHandler = new Thread.UncaughtExceptionHandler() { // from class: X.0Vkn
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            FrescoDraweeViewNPEChecker.DraweeViewNullCheckerListener draweeViewNullCheckerListener;
            if (FrescoDraweeViewNPEChecker.enableCheck && FrescoDraweeViewNPEChecker.isDraweeViewNPE(th)) {
                C806760Vko<FrescoDraweeViewNPEChecker.DrawableNullPoint> c806760Vko = FrescoDraweeViewNPEChecker.drawableNullPoints;
                if (c806760Vko.LIZ.size() > 0 && (draweeViewNullCheckerListener = FrescoDraweeViewNPEChecker.listener) != null) {
                    draweeViewNullCheckerListener.onCrash(c806760Vko.toString());
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = FrescoDraweeViewNPEChecker.originalHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    };

    public interface DraweeViewNullCheckerListener {
        void onCrash(String str);
    }

    public static class DrawableNullPoint {
        public final long timestamp = System.currentTimeMillis();
        public final String threadName = C786410Ut5.u3().getName();
        public final Exception exception = new RuntimeException("FrescoDraweeNullPoint");

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nFrescoDraweeNullPoint{time=");
            sbLIZ.append(CommonUtils.transformTime(this.timestamp));
            sbLIZ.append(", threadName='");
            sbLIZ.append(this.threadName);
            sbLIZ.append('\'');
            sbLIZ.append(", stack='");
            sbLIZ.append(Log.getStackTraceString(this.exception));
            sbLIZ.append('\'');
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static void recordDrawableNullPoint() {
        if (enableCheck) {
            C806760Vko<DrawableNullPoint> c806760Vko = drawableNullPoints;
            DrawableNullPoint drawableNullPoint = new DrawableNullPoint();
            while (!c806760Vko.LIZ.offerFirst(drawableNullPoint)) {
                c806760Vko.LIZ.pollLast();
            }
        }
    }

    public static boolean isDraweeViewNPE(Throwable th) {
        while (th != null) {
            if ((th instanceof NullPointerException) && th.getMessage() != null && th.getMessage().contains("Parent has no child drawable")) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void monitor(boolean z, DraweeViewNullCheckerListener draweeViewNullCheckerListener) {
        if (z && enableCheck) {
            return;
        }
        enableCheck = z;
        listener = draweeViewNullCheckerListener;
        if (z) {
            originalHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(crashHandler);
        }
    }

    public void setPlaceholderImage(Drawable drawable, InterfaceC1320380kSq interfaceC1320380kSq) {
        if (drawable == null) {
            recordDrawableNullPoint();
        }
        int i = C2110908Ot.LIZ;
    }
}
