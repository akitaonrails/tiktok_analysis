package com.bytedance.sysoptimizer;

import android.content.Context;
import android.view.LayoutInflater;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class LayoutInflaterAsyncCrashOptimizer {
    public static boolean hasFixed;

    public static final class FixLayoutInflaterAsyncHashMap<K, V> extends HashMap<K, V> {
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public synchronized void clear() {
            super.clear();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public synchronized V remove(Object obj) {
            return (V) super.remove(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public synchronized V put(K k, V v) {
            return (V) super.put(k, v);
        }
    }

    public static synchronized void fix(Context context) {
        if (hasFixed) {
            return;
        }
        hasFixed = true;
        try {
            Field declaredField = LayoutInflater.class.getDeclaredField("sConstructorMap");
            declaredField.setAccessible(true);
            declaredField.set(null, new FixLayoutInflaterAsyncHashMap());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
