package com.bytedance.keva.ext;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class KevaMultiProcessCache extends Keva {
    public static final ConcurrentHashMap<String, Keva> sInstanceMap = new ConcurrentHashMap<>();
    public final CombinedMap<String, Object> mCombinedCache;
    public final Keva mInstance;

    public static class CombinedMap<K, V> extends AbstractMap<K, V> {
        public final Map<K, V> mCache;
        public final Map<K, V> mNullValuesCache;

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.mCache.clear();
            this.mNullValuesCache.clear();
        }

        public CombinedMap() {
            this.mCache = new ConcurrentHashMap();
            this.mNullValuesCache = new ConcurrentHashMap();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (!this.mCache.containsKey(obj) && !this.mNullValuesCache.containsKey(obj)) {
                return false;
            }
            return true;
        }

        public V getNotNull(Object obj) {
            return this.mCache.get(obj);
        }

        public boolean isNullValue(V v) {
            return this.mNullValuesCache.containsKey(v);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (this.mCache.containsKey(obj)) {
                return this.mCache.remove(obj);
            }
            return this.mNullValuesCache.remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            try {
                if (v != null) {
                    return this.mCache.put(k, v);
                }
                return this.mNullValuesCache.put(k, v);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return v;
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        this.mInstance.clear();
        this.mCombinedCache.clear();
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return this.mInstance.count();
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        this.mInstance.dump();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        return this.mInstance.getAll();
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getAllKey() {
        return this.mInstance.getAllKey();
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mInstance.name();
    }

    public KevaMultiProcessCache(String str) {
        CombinedMap<String, Object> combinedMap = new CombinedMap<>();
        this.mCombinedCache = combinedMap;
        Keva repoSync = KevaImpl.getRepoSync(str, 1);
        this.mInstance = repoSync;
        repoSync.buildNewMap(combinedMap);
    }

    public static Keva getRepoSync(String str) {
        ConcurrentHashMap<String, Keva> concurrentHashMap = sInstanceMap;
        Keva keva = concurrentHashMap.get(str);
        if (keva == null) {
            KevaMultiProcessCache kevaMultiProcessCache = new KevaMultiProcessCache(str);
            concurrentHashMap.put(str, kevaMultiProcessCache);
            return kevaMultiProcessCache;
        }
        return keva;
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        return this.mInstance.buildNewMap(map);
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        return this.mCombinedCache.containsKey(str);
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        this.mInstance.erase(str);
        this.mCombinedCache.remove(str);
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        throw new UnsupportedOperationException();
    }

    private Object getBasicTypeValue(String str, Object obj) {
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull != null) {
            return notNull;
        }
        return obj;
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        try {
            return ((Boolean) getBasicTypeValue(str, Boolean.valueOf(z))).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return z;
        }
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof byte[]) {
            return (byte[]) notNull;
        }
        return bArr;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        try {
            return ((Double) getBasicTypeValue(str, Double.valueOf(d))).doubleValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return d;
        }
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        try {
            return ((Float) getBasicTypeValue(str, Float.valueOf(f))).floatValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return f;
        }
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        try {
            return ((Integer) getBasicTypeValue(str, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i;
        }
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        try {
            return ((Long) getBasicTypeValue(str, Long.valueOf(j))).longValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof String) {
            return (String) notNull;
        }
        return str2;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof String[]) {
            return (String[]) notNull;
        }
        return strArr;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        if (this.mCombinedCache.isNullValue(str)) {
            return null;
        }
        Object notNull = this.mCombinedCache.getNotNull(str);
        if (notNull instanceof Set) {
            return (Set) notNull;
        }
        return set;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        if (str == null) {
            return;
        }
        this.mCombinedCache.put(str, Boolean.valueOf(z));
        this.mInstance.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.mCombinedCache.put(str, bArr);
            this.mInstance.storeBytes(str, bArr);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        if (str != null && bArr != null) {
            this.mInstance.storeBytesJustDisk(str, bArr);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        if (str == null) {
            return;
        }
        this.mCombinedCache.put(str, Double.valueOf(d));
        this.mInstance.storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        if (str == null) {
            return;
        }
        this.mCombinedCache.put(str, Float.valueOf(f));
        this.mInstance.storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        if (str == null) {
            return;
        }
        this.mCombinedCache.put(str, Integer.valueOf(i));
        this.mInstance.storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        if (str == null) {
            return;
        }
        this.mCombinedCache.put(str, Long.valueOf(j));
        this.mInstance.storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        if (str != null && str2 != null) {
            this.mCombinedCache.put(str, str2);
            this.mInstance.storeString(str, str2);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        if (str != null && strArr != null) {
            this.mCombinedCache.put(str, strArr);
            this.mInstance.storeStringArray(str, strArr);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        if (str != null && strArr != null) {
            this.mInstance.storeStringArrayJustDisk(str, strArr);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        if (str != null && str2 != null) {
            this.mInstance.storeStringJustDisk(str, str2);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        if (str != null && set != null) {
            this.mCombinedCache.put(str, set);
            this.mInstance.storeStringSet(str, set);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        if (str != null && set != null) {
            this.mInstance.storeStringSetJustDisk(str, set);
        }
    }
}
