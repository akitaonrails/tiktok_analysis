package com.bytedance.keva;

import X.C08Q0;
import X.C1519840peY;
import X.C1AF0;
import X.C202094145s;
import X.C2188811AlT;
import X.C309220CAe;
import X.C844470XAv;
import X.InterfaceC21351618h8;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class KevaPrivateNativeImpl extends KevaImpl implements InterfaceC21351618h8 {
    public long handle;
    public ConcurrentHashMap<String, Object[]> keyValueMap;
    public boolean needRelease;

    @Override // com.bytedance.keva.KevaImpl
    public void doLoadRepo(boolean z) {
        com_bytedance_keva_KevaPrivateNativeImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_doLoadRepo(this, z);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void dump() {
    }

    public native long getRepoWithNative(String str, String str2, int i, boolean z);

    public native boolean nativeClearRepo(long j);

    public native boolean nativeContains(String str, long j);

    public native boolean nativeErase(String str, long j);

    public native void nativeGetAll(long j, Map<String, Object> map);

    public native Object nativeGetAllKey(long j, Set<String> set);

    public native boolean nativeGetBoolean(String str, boolean z, long j);

    public native byte[] nativeGetBytes(String str, long j);

    public native int nativeGetCount(long j);

    public native double nativeGetDouble(String str, double d, long j);

    public native float nativeGetFloat(String str, float f, long j);

    public native int nativeGetInt(String str, int i, long j);

    public native long nativeGetLong(String str, long j, long j2);

    public native String nativeGetString(String str, long j);

    public native String[] nativeGetStringArray(String str, long j);

    public native boolean nativeIsUseHashIndex(long j);

    public native void nativeReleaseRepo(long j);

    public native boolean nativeStoreBoolean(String str, boolean z, long j);

    public native boolean nativeStoreBytes(String str, byte[] bArr, long j);

    public native boolean nativeStoreDouble(String str, double d, long j);

    public native boolean nativeStoreFloat(String str, float f, long j);

    public native boolean nativeStoreInt(String str, int i, long j);

    public native boolean nativeStoreLong(String str, long j, long j2);

    public native boolean nativeStoreString(String str, String str2, long j);

    public native boolean nativeStoreStringArray(String str, String[] strArr, long j);

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void clear() {
        try {
            this.keyValueMap.clear();
            nativeClearRepo(this.handle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, "clear_function", null, th);
        }
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return nativeGetCount(this.handle);
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        HashMap map = new HashMap();
        try {
            nativeGetAll(this.handle, map);
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, "getAll_function", null, th);
            return map;
        }
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getAllKey() {
        HashSet hashSet = new HashSet();
        Object objNativeGetAllKey = nativeGetAllKey(this.handle, hashSet);
        if (!(objNativeGetAllKey instanceof String[])) {
            return objNativeGetAllKey instanceof Set ? (Set) objNativeGetAllKey : hashSet;
        }
        String[] strArr = (String[]) objNativeGetAllKey;
        HashSet hashSet2 = new HashSet(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                hashSet2.add(str);
            }
        }
        return hashSet2;
    }

    @Override // X.InterfaceC21351618h8
    public String getRepoName() {
        if (this.mSpecifiedPath == null) {
            return this.mName;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mSpecifiedPath);
        sbLIZ.append("/");
        sbLIZ.append(this.mName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ boolean isUserEnableHashIndex() {
        return super.isUserEnableHashIndex();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ int mode() {
        return super.mode();
    }

    @Override // com.bytedance.keva.KevaImpl
    public /* bridge */ /* synthetic */ void dumpNative() {
        super.dumpNative();
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        nativeGetAll(this.handle, map);
        return map;
    }

    public void com_bytedance_keva_KevaPrivateNativeImpl__doLoadRepo$___twin___(boolean z) {
        try {
            this.handle = getRepoWithNative(this.mName, this.mSpecifiedPath, this.mMode, z);
            if (!z) {
                KevaImpl.sMonitor.onLoadRepo(this.mName, this.mMode);
            }
            this.mIsUseHashMappingFile = nativeIsUseHashIndex(this.handle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        if ("".equals(str)) {
            str = null;
        }
        return nativeContains(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            this.keyValueMap.remove(str2);
            nativeErase(str2, this.handle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, null, th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl
    public void init(boolean z) {
        if (this.handle != 0) {
            return;
        }
        doLoadRepo(z);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        super.registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public /* bridge */ /* synthetic */ void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        super.unRegisterChangeListener(onChangeListener);
    }

    public static void com_bytedance_keva_KevaPrivateNativeImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_doLoadRepo(KevaPrivateNativeImpl kevaPrivateNativeImpl, boolean z) {
        try {
            if (C202094145s.LJIILL > 0) {
                if (C1519840peY.LIZIZ.compareAndSet(false, true)) {
                    C844470XAv.LIZ.getClass();
                    Context contextLIZ = C844470XAv.LIZ();
                    if (contextLIZ != null) {
                        C1519840peY.LIZ.set(C08Q0.LJ(contextLIZ, "optimize_preload_keva_v2", false));
                    }
                }
                if (C1519840peY.LIZ.get() && (kevaPrivateNativeImpl instanceof KevaPrivateNativeImpl)) {
                    C309220CAe.LJI(kevaPrivateNativeImpl.mode(), kevaPrivateNativeImpl.name());
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "KevaImplLancet");
        }
        kevaPrivateNativeImpl.com_bytedance_keva_KevaPrivateNativeImpl__doLoadRepo$___twin___(z);
    }

    private void saveValueAccessInformation(String str, Object obj) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr == null) {
            this.keyValueMap.put(str, new Object[]{obj, Long.valueOf(jCurrentTimeMillis)});
        } else {
            objArr[0] = obj;
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0092 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:4:0x0010, B:6:0x0016, B:8:0x0041, B:10:0x004e, B:12:0x0052, B:14:0x0056, B:31:0x0090, B:34:0x0097, B:15:0x0061, B:17:0x0065, B:19:0x0069, B:21:0x006d, B:23:0x0071, B:25:0x0075, B:27:0x007b, B:28:0x0089, B:30:0x008d, B:33:0x0095, B:32:0x0092, B:35:0x0099, B:37:0x009f, B:39:0x00a7, B:41:0x00ab), top: B:49:0x0010 }] */
    @Override // X.InterfaceC21351618h8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long clearCache(int r14, boolean r15) {
        /*
            r13 = this;
            long r11 = java.lang.System.currentTimeMillis()
            r3 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object[]> r0 = r13.keyValueMap     // Catch: java.lang.Exception -> Lb3
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Exception -> Lb3
            java.util.Iterator r10 = r0.iterator()     // Catch: java.lang.Exception -> Lb3
            r2 = 0
        L10:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L9d
            java.lang.Object r9 = r10.next()     // Catch: java.lang.Exception -> Lb5
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r8 = r9.getValue()     // Catch: java.lang.Exception -> Lb5
            java.lang.Object[] r8 = (java.lang.Object[]) r8     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r0 = r9.getKey()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb5
            int r0 = r0.length()     // Catch: java.lang.Exception -> Lb5
            int r0 = r0 * 2
            int r0 = r0 + 40
            int r2 = r2 + r0
            r5 = 1
            r0 = r8[r5]     // Catch: java.lang.Exception -> Lb5
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> Lb5
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> Lb5
            long r6 = r11 - r0
            long r0 = (long) r14     // Catch: java.lang.Exception -> Lb5
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 <= 0) goto L99
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object[]> r1 = r13.keyValueMap     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r0 = r9.getKey()     // Catch: java.lang.Exception -> Lb5
            r1.remove(r0)     // Catch: java.lang.Exception -> Lb5
            r6 = r8[r3]     // Catch: java.lang.Exception -> Lb5
            if (r6 == 0) goto L10
            boolean r0 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto L92
            boolean r0 = r6 instanceof java.lang.String     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L61
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lb5
            int r0 = r6.length()     // Catch: java.lang.Exception -> Lb5
            int r0 = r0 * 2
            int r0 = r0 + 40
            goto L90
        L61:
            boolean r0 = r6 instanceof java.lang.Double     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto L95
            boolean r0 = r6 instanceof java.lang.Long     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto L95
            boolean r0 = r6 instanceof java.lang.Integer     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto L92
            boolean r0 = r6 instanceof java.lang.Float     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto L92
            boolean r0 = r6 instanceof java.lang.String[]     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L89
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Exception -> Lb5
            int r4 = r6.length     // Catch: java.lang.Exception -> Lb5
            r1 = 0
        L79:
            if (r1 >= r4) goto L97
            r0 = r6[r1]     // Catch: java.lang.Exception -> Lb5
            int r0 = r0.length()     // Catch: java.lang.Exception -> Lb5
            int r0 = r0 * 2
            int r0 = r0 + 40
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L79
        L89:
            boolean r0 = r6 instanceof byte[]     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L97
            byte[] r6 = (byte[]) r6     // Catch: java.lang.Exception -> Lb5
            int r0 = r6.length     // Catch: java.lang.Exception -> Lb5
        L90:
            int r2 = r2 + r0
            goto L97
        L92:
            int r2 = r2 + 16
            goto L97
        L95:
            int r2 = r2 + 24
        L97:
            int r2 = r2 + 16
        L99:
            r13.needRelease = r5     // Catch: java.lang.Exception -> Lb5
            goto L10
        L9d:
            if (r15 == 0) goto Lbb
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object[]> r0 = r13.keyValueMap     // Catch: java.lang.Exception -> Lb5
            int r0 = r0.size()     // Catch: java.lang.Exception -> Lb5
            if (r0 != 0) goto Lbb
            boolean r0 = r13.needRelease     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto Lbb
            long r0 = r13.handle     // Catch: java.lang.Exception -> Lb5
            r13.nativeReleaseRepo(r0)     // Catch: java.lang.Exception -> Lb5
            r13.needRelease = r3     // Catch: java.lang.Exception -> Lb5
            goto Lbb
        Lb3:
            r0 = move-exception
            goto Lb7
        Lb5:
            r0 = move-exception
            r3 = r2
        Lb7:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r2 = r3
        Lbb:
            long r0 = (long) r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaPrivateNativeImpl.clearCache(int, boolean):long");
    }

    @Override // com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
            return ((Boolean) objArr[0]).booleanValue();
        }
        boolean zNativeGetBoolean = nativeGetBoolean(str, z, this.handle);
        this.keyValueMap.put(str, new Object[]{Boolean.valueOf(zNativeGetBoolean), Long.valueOf(jCurrentTimeMillis)});
        return zNativeGetBoolean;
    }

    @Override // com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str2);
        if (objArr != null) {
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
            return ((Double) objArr[0]).doubleValue();
        }
        double dNativeGetDouble = nativeGetDouble(str2, d, this.handle);
        this.keyValueMap.put(str2, new Object[]{Double.valueOf(dNativeGetDouble), Long.valueOf(jCurrentTimeMillis)});
        return dNativeGetDouble;
    }

    @Override // com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f) {
        if ("".equals(str)) {
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
            return ((Float) objArr[0]).floatValue();
        }
        float fNativeGetFloat = nativeGetFloat(str, f, this.handle);
        this.keyValueMap.put(str, new Object[]{Float.valueOf(fNativeGetFloat), Long.valueOf(jCurrentTimeMillis)});
        return fNativeGetFloat;
    }

    @Override // com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i) {
        if ("".equals(str)) {
            str = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str);
        if (objArr != null) {
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
            return ((Integer) objArr[0]).intValue();
        }
        int iNativeGetInt = nativeGetInt(str, i, this.handle);
        this.keyValueMap.put(str, new Object[]{Integer.valueOf(iNativeGetInt), Long.valueOf(jCurrentTimeMillis)});
        return iNativeGetInt;
    }

    @Override // com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object[] objArr = this.keyValueMap.get(str2);
        if (objArr != null) {
            objArr[1] = Long.valueOf(jCurrentTimeMillis);
            return ((Long) objArr[0]).longValue();
        }
        long jNativeGetLong = nativeGetLong(str2, j, this.handle);
        this.keyValueMap.put(str2, new Object[]{Long.valueOf(jNativeGetLong), Long.valueOf(jCurrentTimeMillis)});
        return jNativeGetLong;
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        try {
            return fetchBoolean(str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Boolean.valueOf(z), th);
            return z;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        return getBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return getBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        try {
            return fetchDouble(str, d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Double.valueOf(d), th);
            return d;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        try {
            return fetchFloat(str, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Float.valueOf(f), th);
            return f;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        try {
            return fetchInt(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Integer.valueOf(i), th);
            return i;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        try {
            return fetchLong(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Long.valueOf(j), th);
            return j;
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        return getString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        return getStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return getStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        return getString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        return getStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return getStringSet(str, set, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Boolean.valueOf(z));
            nativeStoreBoolean(str2, z, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Double.valueOf(d));
            nativeStoreDouble(str2, d, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Float.valueOf(f));
            nativeStoreFloat(str2, f, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Integer.valueOf(i));
            nativeStoreInt(str2, i, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        try {
            saveValueAccessInformation(str2, Long.valueOf(j));
            nativeStoreLong(str2, j, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j), th);
        }
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    public KevaPrivateNativeImpl(String str, String str2, int i) {
        super(str, str2, i);
        this.needRelease = true;
        if (KevaImpl.sIsEnableLoadFromNative == 1) {
            this.keyValueMap = new ConcurrentHashMap<>(5);
            KevaCacheManager.registerClearListener(this);
        }
    }

    private byte[] getBytes(String str, byte[] bArr, boolean z) {
        try {
            return fetchBytes(str, bArr, -1, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, bArr, th);
            return bArr;
        }
    }

    private String getString(String str, String str2, boolean z) {
        try {
            return fetchString(str, str2, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, str2, th);
            return str2;
        }
    }

    private String[] getStringArray(String str, String[] strArr, boolean z) {
        try {
            String[] strArrFetchStringArray = fetchStringArray(str, null, z);
            if (strArrFetchStringArray == null) {
                return strArr;
            }
            return strArrFetchStringArray;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, strArr, th);
            return strArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0025: INVOKE 
      (r0v1 ?? I:com.bytedance.keva.KevaMonitor)
      (r1v0 ?? I:int)
      (r2v0 ?? I:java.lang.String)
      (r3 I:java.lang.String)
      (r4 I:java.lang.Object)
      (r5 I:java.lang.Throwable)
     VIRTUAL call: com.bytedance.keva.KevaMonitor.reportThrowable(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void (m)] (LINE:50331685), block:B:12:0x001d */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0025: INVOKE 
      (r0v1 ?? I:com.bytedance.keva.KevaMonitor)
      (r1v0 ?? I:int)
      (r2v0 ?? I:java.lang.String)
      (r3v0 ?? I:java.lang.String)
      (r4 I:java.lang.Object)
      (r5 I:java.lang.Throwable)
     VIRTUAL call: com.bytedance.keva.KevaMonitor.reportThrowable(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void A[MD:(int, java.lang.String, java.lang.String, java.lang.Object, java.lang.Throwable):void (m)] (LINE:50331685), block:B:12:0x001d */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private Set<String> getStringSet(String str, Set<String> set, boolean z) {
        String strReportThrowable;
        ?? ReportThrowable;
        try {
            String[] strArrFetchStringArray = fetchStringArray(str, null, z);
            if (strArrFetchStringArray == null) {
                if (set == null) {
                    return set;
                }
                return new HashSet(set);
            }
            return new HashSet(Arrays.asList(strArrFetchStringArray));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, strReportThrowable, ReportThrowable, th);
            return ReportThrowable;
        }
    }

    private void storeBytes(String str, byte[] bArr, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str2, bArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, bArr, th);
                return;
            }
        }
        nativeStoreBytes(str2, bArr, this.handle);
        super.notifyChangeListeners(this, str2);
    }

    private void storeString(String str, String str2, boolean z) {
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str3, str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str3, str2, th);
                return;
            }
        }
        nativeStoreString(str3, str2, this.handle);
        super.notifyChangeListeners(this, str3);
    }

    private void storeStringArray(String str, String[] strArr, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        if (!z) {
            try {
                saveValueAccessInformation(str2, strArr);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, strArr, th);
                return;
            }
        }
        nativeStoreStringArray(str2, strArr, this.handle);
        super.notifyChangeListeners(this, str2);
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String str2 = str;
        try {
            String[] strArr = null;
            if ("".equals(str2)) {
                str2 = null;
            }
            if (set != null) {
                strArr = new String[set.size()];
                set.toArray(strArr);
                if (!z) {
                    saveValueAccessInformation(str2, strArr);
                }
            }
            nativeStoreStringArray(str2, strArr, this.handle);
            super.notifyChangeListeners(this, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, set, th);
        }
    }

    public void addBooleanValue(String str, boolean z, Map<String, Object> map) {
        map.put(str, Boolean.valueOf(z));
    }

    public void addDoubleValue(String str, double d, Map<String, Object> map) {
        map.put(str, Double.valueOf(d));
    }

    public void addFloatValue(String str, float f, Map<String, Object> map) {
        map.put(str, Float.valueOf(f));
    }

    public void addIntValue(String str, int i, Map<String, Object> map) {
        map.put(str, Integer.valueOf(i));
    }

    public void addLongValue(String str, long j, Map<String, Object> map) {
        map.put(str, Long.valueOf(j));
    }

    public void addObjectValue(String str, Object obj, Map<String, Object> map) {
        map.put(str, obj);
    }

    @Override // com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        String strNativeGetString;
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(jCurrentTimeMillis);
                strNativeGetString = (String) objArr[0];
            } else {
                strNativeGetString = nativeGetString(str, this.handle);
                this.keyValueMap.put(str, new Object[]{strNativeGetString, Long.valueOf(jCurrentTimeMillis)});
            }
        } else {
            strNativeGetString = nativeGetString(str, this.handle);
        }
        if (strNativeGetString == null) {
            return str2;
        }
        return strNativeGetString;
    }

    @Override // com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(jCurrentTimeMillis);
                return (String[]) objArr[0];
            }
            String[] strArrNativeGetStringArray = nativeGetStringArray(str, this.handle);
            this.keyValueMap.put(str, new Object[]{strArrNativeGetStringArray, Long.valueOf(jCurrentTimeMillis)});
            return strArrNativeGetStringArray;
        }
        return nativeGetStringArray(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        byte[] bArrNativeGetBytes;
        if ("".equals(str)) {
            str = null;
        }
        if (!z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object[] objArr = this.keyValueMap.get(str);
            if (objArr != null) {
                objArr[1] = Long.valueOf(jCurrentTimeMillis);
                bArrNativeGetBytes = (byte[]) objArr[0];
            } else {
                bArrNativeGetBytes = nativeGetBytes(str, this.handle);
                this.keyValueMap.put(str, new Object[]{bArrNativeGetBytes, Long.valueOf(jCurrentTimeMillis)});
            }
        } else {
            bArrNativeGetBytes = nativeGetBytes(str, this.handle);
        }
        if (bArrNativeGetBytes == null) {
            return bArr;
        }
        return bArrNativeGetBytes;
    }
}
