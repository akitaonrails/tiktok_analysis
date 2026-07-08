package com.bytedance.keva;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes24.dex */
public class KevaPrivateOnlyNativeImpl extends KevaPrivateNativeImpl {
    @Override // com.bytedance.keva.KevaPrivateNativeImpl, X.InterfaceC21351618h8
    public long clearCache(int i, boolean z) {
        return 0L;
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void dump() {
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void clear() {
        try {
            nativeClearRepo(this.handle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, "clear_function", null, th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.Keva
    public int count() {
        return nativeGetCount(this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        return super.getAll();
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        super.buildNewMap(map);
        return map;
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.Keva
    public boolean contains(String str) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeContains(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            nativeErase(str2, this.handle);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, null, th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public boolean fetchBoolean(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeGetBoolean(str, z, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public double fetchDouble(String str, double d) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        return nativeGetDouble(str2, d, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public float fetchFloat(String str, float f) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeGetFloat(str, f, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public int fetchInt(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeGetInt(str, i, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public long fetchLong(String str, long j) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        return nativeGetLong(str2, j, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        try {
            return fetchBoolean(str, z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Boolean.valueOf(z), th);
            return z;
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        return getBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return getBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        try {
            return fetchDouble(str, d);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Double.valueOf(d), th);
            return d;
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        try {
            return fetchFloat(str, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Float.valueOf(f), th);
            return f;
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        try {
            return fetchInt(str, i);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Integer.valueOf(i), th);
            return i;
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        try {
            return fetchLong(str, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(2, this.mName, str, Long.valueOf(j), th);
            return j;
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        return getString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        return getStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return getStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        return getString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        return getStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return getStringSet(str, set, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreBoolean(str2, z, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreDouble(str2, d, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d), th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreFloat(str2, f, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f), th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreInt(str2, i, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i), th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreLong(str2, j, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j), th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl, com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    public KevaPrivateOnlyNativeImpl(String str, String str2, int i) {
        super(str, str2, i);
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
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreBytes(str2, bArr, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
            if (kevaMonitor != null) {
                kevaMonitor.reportThrowable(3, this.mName, str2, bArr, th);
            }
        }
    }

    private void storeString(String str, String str2, boolean z) {
        String str3 = str;
        if (TextUtils.isEmpty(str3)) {
            str3 = null;
        }
        try {
            if (nativeStoreString(str3, str2, this.handle)) {
                super.notifyChangeListeners(this, str3);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str3, str2, th);
        }
    }

    private void storeStringArray(String str, String[] strArr, boolean z) {
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        try {
            if (nativeStoreStringArray(str2, strArr, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
            if (kevaMonitor != null) {
                kevaMonitor.reportThrowable(3, this.mName, str2, strArr, th);
            }
        }
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String str2 = str;
        try {
            String[] strArr = null;
            if (TextUtils.isEmpty(str2)) {
                str2 = null;
            }
            if (set != null) {
                strArr = new String[set.size()];
                set.toArray(strArr);
            }
            if (nativeStoreStringArray(str2, strArr, this.handle)) {
                super.notifyChangeListeners(this, str2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            KevaImpl.sMonitor.reportThrowable(3, this.mName, str2, set, th);
        }
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public String fetchString(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        String strNativeGetString = nativeGetString(str, this.handle);
        if (strNativeGetString == null) {
            return str2;
        }
        return strNativeGetString;
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public String[] fetchStringArray(String str, String[] strArr, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        return nativeGetStringArray(str, this.handle);
    }

    @Override // com.bytedance.keva.KevaPrivateNativeImpl, com.bytedance.keva.KevaImpl
    public byte[] fetchBytes(String str, byte[] bArr, int i, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        byte[] bArrNativeGetBytes = nativeGetBytes(str, this.handle);
        if (bArrNativeGetBytes == null) {
            return bArr;
        }
        return bArrNativeGetBytes;
    }
}
