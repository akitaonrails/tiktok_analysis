package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C2110908Ot;
import X.C2111008Ou;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C806780Vkq;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.CommonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class RemoveViewCausedNPEChecker {
    public static boolean enableCheck;
    public static ViewRemovedCausedNPEListener listener;
    public static Thread.UncaughtExceptionHandler originalHandler;
    public static final C806780Vkq<ViewRemovedPoint> removedViewPoints = new C806780Vkq<>();
    public static String[] defaultRemoveViewNpeMessages = {"Attempt to read from field 'int android.view.View.mViewFlags' on a null object reference", "Attempt to invoke virtual method 'int android.view.View.getVisibility()' on a null object reference", "Attempt to invoke virtual method 'android.view.animation.Animation android.view.View.getAnimation()' on a null object reference", "Attempt to invoke virtual method 'android.view.WindowInsets android.view.View.dispatchApplyWindowInsets", "Attempt to invoke virtual method 'void android.view.View.resolveLayoutParams", "Attempt to read from field 'int android.view.View.mPrivateFlags' on a null object reference", "Attempt to read from field 'int android.view.View.mParentViewFlags' on a null object reference"};
    public static final List<String> removeViewNpeMessageList = new ArrayList();
    public static final Thread.UncaughtExceptionHandler crashHandler = new Thread.UncaughtExceptionHandler() { // from class: X.0Vkp
        @Override // java.lang.Thread.UncaughtExceptionHandler
        public final void uncaughtException(Thread thread, Throwable th) {
            RemoveViewCausedNPEChecker.ViewRemovedCausedNPEListener viewRemovedCausedNPEListener;
            if (RemoveViewCausedNPEChecker.enableCheck && RemoveViewCausedNPEChecker.isRemoveViewNPE(th)) {
                C806780Vkq<RemoveViewCausedNPEChecker.ViewRemovedPoint> c806780Vkq = RemoveViewCausedNPEChecker.removedViewPoints;
                if (c806780Vkq.LIZ.size() > 0 && (viewRemovedCausedNPEListener = RemoveViewCausedNPEChecker.listener) != null) {
                    viewRemovedCausedNPEListener.onCrash(c806780Vkq.toString());
                }
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = RemoveViewCausedNPEChecker.originalHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    };

    public interface ViewRemovedCausedNPEListener {
        void onCrash(String str);
    }

    public static class ViewRemovedPoint {
        public String viewInfo;
        public long timestamp = System.currentTimeMillis();
        public String threadName = C786410Ut5.u3().getName();
        public Exception exception = new RuntimeException("ViewRemovedPoint");

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nViewRemovedPoint{time=");
            sbLIZ.append(CommonUtils.transformTime(this.timestamp));
            sbLIZ.append(", viewInfo='");
            sbLIZ.append(this.viewInfo);
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

        public ViewRemovedPoint(String str) {
            this.viewInfo = str;
        }
    }

    public void removeAllViews() {
        int i = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), null);
        int i2 = C2110908Ot.LIZ;
    }

    public void removeAllViewsInLayout() {
        int i = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), null);
        int i2 = C2110908Ot.LIZ;
    }

    public static void addRemoveViewNpeMessage(String str) {
        removeViewNpeMessageList.add(str);
    }

    public static boolean isRemoveViewNPE(Throwable th) {
        String message;
        if (!(th instanceof NullPointerException) || (message = th.getMessage()) == null) {
            return false;
        }
        for (String str : defaultRemoveViewNpeMessages) {
            if (message.contains(str)) {
                return true;
            }
        }
        for (String str2 : defaultRemoveViewNpeMessages) {
            if (th.getMessage().contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void setEnableCheck(boolean z) {
        enableCheck = z;
    }

    public static void setListener(ViewRemovedCausedNPEListener viewRemovedCausedNPEListener) {
        listener = viewRemovedCausedNPEListener;
    }

    public void removeView(View view) {
        int i = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), view);
        int i2 = C2110908Ot.LIZ;
    }

    public void removeViewAt(int i) {
        int i2 = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), null);
        int i3 = C2110908Ot.LIZ;
    }

    public void removeViewInLayout(View view) {
        int i = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), view);
        int i2 = C2110908Ot.LIZ;
    }

    public static void addRemoveViewNpeMessage(List<String> list) {
        removeViewNpeMessageList.addAll(list);
    }

    public static void monitor(boolean z, ViewRemovedCausedNPEListener viewRemovedCausedNPEListener) {
        if (z && enableCheck) {
            return;
        }
        enableCheck = z;
        listener = viewRemovedCausedNPEListener;
        if (z) {
            originalHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(crashHandler);
        }
    }

    public static void recordViewRemovedPoint(ViewGroup viewGroup, View view) {
        String string;
        if (!enableCheck) {
            return;
        }
        C806780Vkq<ViewRemovedPoint> c806780Vkq = removedViewPoints;
        synchronized (c806780Vkq) {
            if (view == null) {
                string = "[empty]";
            } else {
                try {
                    string = view.toString();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            ViewRemovedPoint viewRemovedPoint = new ViewRemovedPoint("view group: " + viewGroup.toString() + ", child view: " + string);
            if (c806780Vkq.LIZ.size() == c806780Vkq.LIZIZ) {
                c806780Vkq.LIZ.pollLast();
            }
            c806780Vkq.LIZ.addFirst(viewRemovedPoint);
        }
    }

    public void removeViews(int i, int i2) {
        int i3 = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), null);
        int i4 = C2110908Ot.LIZ;
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = C2111008Ou.LIZ;
        recordViewRemovedPoint((ViewGroup) new Object(), null);
        int i4 = C2110908Ot.LIZ;
    }
}
