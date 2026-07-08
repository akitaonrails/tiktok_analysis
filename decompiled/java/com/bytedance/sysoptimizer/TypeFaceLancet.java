package com.bytedance.sysoptimizer;

import X.C2110908Ot;
import android.graphics.Typeface;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class TypeFaceLancet {
    public static ConcurrentHashMap cache = new ConcurrentHashMap();

    public static Typeface createFromFile(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (cache.contains(path)) {
                return (Typeface) cache.get(path);
            }
            int i = C2110908Ot.LIZ;
            Typeface typeface = (Typeface) new Object();
            cache.put(path, typeface);
            return typeface;
        }
        int i2 = C2110908Ot.LIZ;
        return (Typeface) new Object();
    }

    public static Typeface createFromFile(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (cache.contains(str)) {
                return (Typeface) cache.get(str);
            }
            int i = C2110908Ot.LIZ;
            Typeface typeface = (Typeface) new Object();
            cache.put(str, typeface);
            return typeface;
        }
        int i2 = C2110908Ot.LIZ;
        return (Typeface) new Object();
    }
}
