package com.ss.android.ugc.aweme.xtrace;

import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC854680Xfu;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.xtrace.IXtrace;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class BigBitmapCheckKit {
    public static Map<Drawable, String> drawableStackMap = new ConcurrentHashMap();
    public static SecureRandom random = new SecureRandom();
    public static Method updateDrawable;

    public static void monitor() {
        updateDrawable = ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZIZ(ImageView.class, "updateDrawable", Drawable.class);
        ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LJ(updateDrawable, ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZIZ(BigBitmapCheckKit.class, "updateDrawableProxy", ImageView.class, Drawable.class));
    }

    public static void doCheckIfHitSample(ImageView imageView, Drawable drawable) {
        if (random.nextDouble() < 0.25d && !drawableStackMap.containsKey(drawable)) {
            drawableStackMap.put(drawable, Log.getStackTraceString(new Throwable("BigBitmapChecker")));
            C786410Ut5.x3(imageView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC854680Xfu(imageView, drawable, 2));
        }
    }

    public static void updateDrawableProxy(ImageView imageView, Drawable drawable) {
        ((IXtrace) PluggableExtentionKt.pluggableSpi(IXtrace.class)).LIZJ(updateDrawable, imageView, drawable);
        if (drawable != null) {
            doCheckIfHitSample(imageView, drawable);
        }
    }
}
