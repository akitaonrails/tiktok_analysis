package com.ss.ttlivestreamer.core.utils;

import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.engine.NativeObject;

/* JADX INFO: loaded from: classes21.dex */
public class TEBundle extends NativeObject {
    private native void nativeClear();

    private native long nativeClone();

    private native boolean nativeContains(String str);

    private native long nativeCopyFrom(long j);

    private native void nativeCreate();

    private native void nativeDump();

    private native boolean nativeGetBool(String str);

    private native TEBundle nativeGetBundle(String str);

    private native double nativeGetDouble(String str);

    private native int nativeGetInt(String str);

    private native long nativeGetLong(String str);

    private native Object nativeGetObj(String str);

    private native String nativeGetString(String str);

    private native void nativeRelease();

    private native void nativeRemove(String str);

    private native void nativeSetBool(String str, boolean z);

    private native void nativeSetBundle(String str, TEBundle tEBundle);

    private native void nativeSetDouble(String str, double d);

    private native void nativeSetInt(String str, int i);

    private native void nativeSetLong(String str, long j);

    private native void nativeSetObj(String str, Object obj);

    private native void nativeSetString(String str, String str2);

    private native String nativeToString();

    private native void nativeUpdateFrom(TEBundle tEBundle);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0L;
        }
    }

    public TEBundle copy() {
        return new TEBundle(nativeClone());
    }

    public TEBundle() {
        nativeCreate();
    }

    public String toString() {
        return nativeToString();
    }

    public void clear() {
        nativeClear();
    }

    public void dump() {
        nativeDump();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
    }

    public TEBundle(TEBundle tEBundle) {
        if (tEBundle != null) {
            this.mNativeObj = nativeCopyFrom(tEBundle.mNativeObj);
            return;
        }
        throw new AndroidRuntimeException("Bad parameters");
    }

    public boolean contains(String str) {
        return nativeContains(str);
    }

    public boolean getBool(String str) {
        return nativeGetBool(str);
    }

    public TEBundle getBundle(String str) {
        return nativeGetBundle(str);
    }

    public double getDouble(String str) {
        return nativeGetDouble(str);
    }

    public int getInt(String str) {
        return nativeGetInt(str);
    }

    public long getLong(String str) {
        return nativeGetLong(str);
    }

    public Object getObject(String str) {
        return nativeGetObj(str);
    }

    public String getString(String str) {
        return nativeGetString(str);
    }

    public void remove(String str) {
        nativeRemove(str);
    }

    public void updateFrom(TEBundle tEBundle) {
        if (tEBundle != null) {
            nativeUpdateFrom(tEBundle);
            return;
        }
        throw new AndroidRuntimeException("Bad parameters");
    }

    public TEBundle(long j) {
        this.mNativeObj = j;
    }

    public boolean equal(String str, Object obj) {
        boolean zContains = contains(str);
        if (zContains) {
            if (obj instanceof Integer) {
                if (getInt(str) == ((Integer) obj).intValue()) {
                    return true;
                }
                return false;
            }
            if (obj instanceof Long) {
                if (getLong(str) == ((Long) obj).longValue()) {
                    return true;
                }
                return false;
            }
            if (obj instanceof String) {
                return getString(str).equalsIgnoreCase((String) obj);
            }
            if (obj instanceof Boolean) {
                if (getBool(str) == ((Boolean) obj).booleanValue()) {
                    return true;
                }
                return false;
            }
            if (obj instanceof Double) {
                if (getDouble(str) == ((Double) obj).doubleValue()) {
                    return true;
                }
                return false;
            }
            throw new AndroidRuntimeException("Not found Object type");
        }
        return zContains;
    }

    public void setBool(String str, boolean z) {
        nativeSetBool(str, z);
    }

    public void setBundle(String str, TEBundle tEBundle) {
        nativeSetBundle(str, tEBundle);
    }

    public void setDouble(String str, double d) {
        nativeSetDouble(str, d);
    }

    public void setInt(String str, int i) {
        nativeSetInt(str, i);
    }

    public void setLong(String str, long j) {
        nativeSetLong(str, j);
    }

    public void setObject(String str, Object obj) {
        nativeSetObj(str, obj);
        throw new AndroidRuntimeException("No implament");
    }

    public void setString(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            nativeSetString(str, str2);
        }
    }
}
