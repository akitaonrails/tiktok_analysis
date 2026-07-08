package com.ss.android.vesdk;

import android.app.Application;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes31.dex */
public final class VEImageInitializer {
    public static final VEImageInitializer INSTANCE = new VEImageInitializer();
    public static ResourceFinder resourceFinder;

    public static final long createEffectResourceFinder(long j) {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            return resourceFinder2.createNativeResourceFinder(j);
        }
        return ((Long) Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("getNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j))).longValue();
    }

    public static final void destoryEffectResourceFinder(long j) throws IllegalAccessException, InvocationTargetException {
        ResourceFinder resourceFinder2 = resourceFinder;
        if (resourceFinder2 != null) {
            resourceFinder = null;
            resourceFinder2.release(j);
        } else {
            Class.forName("com.ss.android.medialib.VideoSdkCore").getDeclaredMethod("releaseNativeFinder", Long.TYPE).invoke(null, Long.valueOf(j));
        }
    }

    public final void init(Application application) {
        resourceFinder = new AssetResourceFinder(application.getAssets(), "");
    }
}
