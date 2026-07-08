package com.bytedance.tt.reliability.monitor.viewchecker;

import X.C2110908Ot;
import X.C2111008Ou;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C806790Vkr;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.CommonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes14.dex */
public class BitmapCrashChecker {
    public static final C806790Vkr<BitmapRecyclePoint> bitmapRecyclePoints = new C806790Vkr<>();
    public static boolean enableCheck;
    public static BitmapCrashCheckerListener listener;

    public interface BitmapCrashCheckerListener {
        void onCrash(String str);
    }

    public static class BitmapRecyclePoint {
        public int bitmapHash;
        public String bitmapInfo;
        public long timestamp = System.currentTimeMillis();
        public String threadName = C786410Ut5.u3().getName();
        public Exception exception = new RuntimeException("BitmapRecyclePoint");

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("\nBitmapRecyclePoint{time=");
            sbLIZ.append(CommonUtils.transformTime(this.timestamp));
            sbLIZ.append(", bitmapInfo='");
            sbLIZ.append(this.bitmapInfo);
            sbLIZ.append('\'');
            sbLIZ.append(", bitmapHash='");
            sbLIZ.append(this.bitmapHash);
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

        public BitmapRecyclePoint(String str, int i) {
            this.bitmapInfo = str;
            this.bitmapHash = i;
        }
    }

    public void recycle() {
        int i = C2110908Ot.LIZ;
        int i2 = C2111008Ou.LIZ;
        recordBitmapRecyclePoint((Bitmap) new Object());
    }

    public static String getRecycledBitmapInfo(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C806790Vkr<BitmapRecyclePoint> c806790Vkr = bitmapRecyclePoints;
            if (c806790Vkr.LIZ.size() > 0) {
                for (BitmapRecyclePoint bitmapRecyclePoint : c806790Vkr.LIZ) {
                    if (bitmapRecyclePoint.bitmapHash == System.identityHashCode(bitmap)) {
                        return bitmapRecyclePoint.toString();
                    }
                }
                return "no match bitmap";
            }
            return "no match bitmap";
        }
        return "canvas drawable isn't BitmapDrawable";
    }

    public static String getTooLargeImageViewInfo(ImageView imageView) {
        StringBuilder sb = new StringBuilder("Bitmap draw too large crash,time:");
        sb.append(CommonUtils.transformTime(System.currentTimeMillis()));
        sb.append(" thread:");
        sb.append(C786410Ut5.u3().getName());
        Context context = imageView.getContext();
        if (context instanceof Activity) {
            sb.append(" Activity: ");
            sb.append(context);
        } else if (context != null) {
            sb.append(" Context: ");
            sb.append(context);
        }
        sb.append(" ImageView: ");
        sb.append(imageView);
        sb.append(" view layout params:");
        sb.append(CommonUtils.getLayoutParams(imageView));
        sb.append(" view id:");
        sb.append(CommonUtils.getViewResourceId(imageView));
        sb.append("\nParent view info:\n");
        ViewParent parent = imageView.getParent();
        for (int i = 1; parent != null && i < 10; i++) {
            if (parent instanceof View) {
                sb.append(i);
                sb.append(" layer parent view:");
                sb.append(parent);
                sb.append(" view layout params:");
                View view = (View) parent;
                sb.append(CommonUtils.getLayoutParams(view));
                sb.append(" view id:");
                sb.append(CommonUtils.getViewResourceId(view));
                sb.append("\n");
            }
            parent = parent.getParent();
        }
        return sb.toString();
    }

    public static void recordBitmapRecyclePoint(Bitmap bitmap) {
        String string;
        if (!enableCheck) {
            return;
        }
        C806790Vkr<BitmapRecyclePoint> c806790Vkr = bitmapRecyclePoints;
        synchronized (c806790Vkr) {
            if (bitmap == null) {
                string = "[bitmap is nul]";
            } else {
                try {
                    string = bitmap.toString();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int iIdentityHashCode = System.identityHashCode(bitmap);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bitmap: ");
            sbLIZ.append(string);
            BitmapRecyclePoint bitmapRecyclePoint = new BitmapRecyclePoint(C2188811AlT.LIZIZ(sbLIZ), iIdentityHashCode);
            if (c806790Vkr.LIZ.size() == c806790Vkr.LIZIZ) {
                c806790Vkr.LIZ.pollLast();
            }
            c806790Vkr.LIZ.addFirst(bitmapRecyclePoint);
        }
    }

    public void onDraw(Canvas canvas) {
        try {
            int i = C2110908Ot.LIZ;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2111008Ou.LIZ;
            doCheck(e, (ImageView) new Object());
            throw e;
        }
    }

    public static void doCheck(RuntimeException runtimeException, ImageView imageView) {
        try {
            String message = runtimeException.getMessage();
            if (message != null) {
                if (message.contains("trying to draw too large") && listener != null) {
                    listener.onCrash(getTooLargeImageViewInfo(imageView));
                }
                if (message.contains("trying to use a recycled bitmap") && listener != null) {
                    listener.onCrash(getRecycledBitmapInfo(imageView));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void monitor(boolean z, BitmapCrashCheckerListener bitmapCrashCheckerListener) {
        if (z && enableCheck) {
            return;
        }
        enableCheck = z;
        listener = bitmapCrashCheckerListener;
    }
}
