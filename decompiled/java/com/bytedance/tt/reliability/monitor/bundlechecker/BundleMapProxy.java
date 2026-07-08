package com.bytedance.tt.reliability.monitor.bundlechecker;

import android.os.Parcel;
import android.util.ArrayMap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class BundleMapProxy<K, V> implements Map<K, V> {
    public final ArrayMap<K, V> mMap;

    @Override // java.util.Map
    public void clear() {
        this.mMap.clear();
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.mMap.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.mMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.mMap.keySet();
    }

    @Override // java.util.Map
    public int size() {
        return this.mMap.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.mMap.values();
    }

    public BundleMapProxy(ArrayMap<K, V> arrayMap) {
        ArrayMap<K, V> arrayMap2 = new ArrayMap<>();
        this.mMap = arrayMap2;
        if (arrayMap != null) {
            arrayMap2.putAll((ArrayMap) arrayMap);
        }
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

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.mMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.mMap.containsValue(obj);
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.mMap.get(obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        this.mMap.putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return this.mMap.remove(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V put(K k, V v) {
        if (v != null && BundleTooLargeChecker.isEnableCheck() && getSize(v) >= BundleTooLargeChecker.LARGE_BUNDLE_SIZE) {
            BundleTooLargeChecker.recordBundleTooLargePoint((String) k, v);
        }
        return this.mMap.put(k, v);
    }
}
