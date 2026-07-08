package com.ss.android.ugc.aweme.memory.profiler.core;

import X.C1697810uHb;
import X.C2095108Ir;
import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class HprofBridge {
    public static final HprofBridge INSTANCE = new HprofBridge();
    public static final ConcurrentHashMap<String, WeakReference<Object>> identityMap = new ConcurrentHashMap<>();
    public static final WeakHashMap<Bitmap, HprofBitmapInfo> bitmapSizeMap = new WeakHashMap<>();
    public static final int $stable = 8;

    public static final void purge() {
        Iterator<Map.Entry<String, WeakReference<Object>>> it2 = identityMap.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public static final void snapshotBitmapSizes() {
        WeakHashMap weakHashMap;
        String strName;
        bitmapSizeMap.clear();
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        try {
            Field declaredField = Bitmap.class.getDeclaredField("sAllBitmaps");
            declaredField.setAccessible(true);
            synchronized (Bitmap.class) {
                try {
                    Object obj = declaredField.get(null);
                    if (!(obj instanceof WeakHashMap) || (weakHashMap = (WeakHashMap) obj) == null) {
                        return;
                    }
                    for (Bitmap bitmap : weakHashMap.keySet()) {
                        if (bitmap != null && !bitmap.isRecycled()) {
                            try {
                                Bitmap.Config config = bitmap.getConfig();
                                strName = config != null ? config.name() : null;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                strName = "UNKNOWN";
                            }
                            bitmapSizeMap.put(bitmap, new HprofBitmapInfo(bitmap.getAllocationByteCount(), bitmap.getByteCount(), strName));
                        }
                    }
                    Collection<HprofBitmapInfo> collectionValues = bitmapSizeMap.values();
                    if (!collectionValues.isEmpty()) {
                        Iterator<T> it2 = collectionValues.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            if (((HprofBitmapInfo) it2.next()).allocationByteCount > 5120 && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        }
                    }
                    bitmapSizeMap.size();
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
    }

    public static final void register(Object obj) {
        identityMap.put(C2095108Ir.LIZ(obj), new WeakReference<>(obj));
    }

    public static final void unregister(Object obj) {
        identityMap.remove(C2095108Ir.LIZ(obj));
    }
}
