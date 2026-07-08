package com.bytedance.keva;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes24.dex */
public class KevaMultiProcessImpl extends KevaImpl {
    @Override // com.bytedance.keva.Keva
    public int count() {
        int size;
        synchronized (this) {
            try {
                this.mValueMap.clear();
                try {
                    rebuildValueMap(this.mHandle);
                    KevaImpl.checkReportException(this.mHandle);
                    size = this.mValueMap.size();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    KevaImpl.sMonitor.reportThrowable(2, name(), null, null, th);
                    return 0;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return size;
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        Map<String, ?> mapObtainMap;
        synchronized (this) {
            try {
                this.mValueMap.clear();
                try {
                    rebuildValueMap(this.mHandle);
                    KevaImpl.checkReportException(this.mHandle);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    KevaImpl.sMonitor.reportThrowable(2, name(), null, null, th);
                }
                mapObtainMap = KevaImpl.obtainMap();
                buildNewMap(mapObtainMap);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return mapObtainMap;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getAllKey() {
        HashSet hashSet;
        synchronized (this) {
            try {
                hashSet = new HashSet();
                fetchAllKey(this.mHandle, hashSet);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return hashSet;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ boolean isUserEnableHashIndex() {
        return super.isUserEnableHashIndex();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ int mode() {
        return super.mode();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ String name() {
        return super.name();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void dump() {
        super.dump();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ Map buildNewMap(Map map) {
        super.buildNewMap(map);
        return map;
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        long j;
        boolean zContains;
        synchronized (this) {
            try {
                try {
                    KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
                    long j2 = this.mHandle;
                    if (kevaValueWrapper == null) {
                        j = 0;
                    } else {
                        j = kevaValueWrapper.offset;
                    }
                    zContains = contains(j2, str, j);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    KevaImpl.sMonitor.reportThrowable(2, name(), str, null, th);
                    return false;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        return zContains;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void erase(String str) {
        super.erase(str);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchBoolean(j2, str, j, z);
    }

    @Override // com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchDouble(j2, str, j, d);
    }

    @Override // com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchFloat(j2, str, j, f);
    }

    @Override // com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchInt(j2, str, j, i);
    }

    @Override // com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j) {
        long j2;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j3 = this.mHandle;
        if (kevaValueWrapper == null) {
            j2 = 0;
        } else {
            j2 = kevaValueWrapper.offset;
        }
        return fetchLong(j3, str, j2, j);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ boolean getBoolean(String str, boolean z) {
        return super.getBoolean(str, z);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ byte[] getBytes(String str, byte[] bArr) {
        return super.getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ byte[] getBytesJustDisk(String str, byte[] bArr) {
        return super.getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ double getDouble(String str, double d) {
        return super.getDouble(str, d);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ float getFloat(String str, float f) {
        return super.getFloat(str, f);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ int getInt(String str, int i) {
        return super.getInt(str, i);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ long getLong(String str, long j) {
        return super.getLong(str, j);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ String getString(String str, String str2) {
        return super.getString(str, str2);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ String[] getStringArray(String str, String[] strArr) {
        return super.getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ String[] getStringArrayJustDisk(String str, String[] strArr) {
        return super.getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ String getStringJustDisk(String str, String str2) {
        return super.getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ Set getStringSet(String str, Set set) {
        return super.getStringSet(str, set);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ Set getStringSetJustDisk(String str, Set set) {
        return super.getStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeBoolean(String str, boolean z) {
        super.storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeBytes(String str, byte[] bArr) {
        super.storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeBytesJustDisk(String str, byte[] bArr) {
        super.storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeDouble(String str, double d) {
        super.storeDouble(str, d);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeFloat(String str, float f) {
        super.storeFloat(str, f);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeInt(String str, int i) {
        super.storeInt(str, i);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeLong(String str, long j) {
        super.storeLong(str, j);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeString(String str, String str2) {
        super.storeString(str, str2);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeStringArray(String str, String[] strArr) {
        super.storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeStringArrayJustDisk(String str, String[] strArr) {
        super.storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeStringJustDisk(String str, String str2) {
        super.storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeStringSet(String str, Set set) {
        super.storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void storeStringSetJustDisk(String str, Set set) {
        super.storeStringSetJustDisk(str, set);
    }

    public KevaMultiProcessImpl(String str, String str2, int i) {
        super(str, str2, i);
    }

    @Override // com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchString(j2, str, j, str2);
    }

    @Override // com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchStringArray(j2, str, j, strArr, 3);
    }

    @Override // com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        long j;
        KevaImpl.KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        long j2 = this.mHandle;
        if (kevaValueWrapper == null) {
            j = 0;
        } else {
            j = kevaValueWrapper.offset;
        }
        return fetchBytes(j2, str, j, bArr, i);
    }
}
