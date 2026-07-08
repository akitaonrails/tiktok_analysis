package com.ttkmedia.datacenter.api;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttkmedia.datacenter.common.DataCenterLibLoader;

/* JADX INFO: loaded from: classes10.dex */
public final class DataCenter {
    public static final String TAG = "DataCenter";
    public static final DataCenter mDataCenter = new DataCenter();
    public Context mContext;
    public long mHandle;
    public int mLogLevel = 3;

    private native void _addEventListener(long j, DataCenterEvent dataCenterEvent);

    private native void _businessEvent(long j, int i, int i2);

    private native void _businessEvent(long j, int i, int i2, int i3);

    private native void _businessEvent(long j, int i, int i2, String str);

    private native void _businessEvent(long j, int i, String str);

    private native long _create();

    private native long _getFeatureHandle();

    private native float _getFloatValue(long j, int i, float f);

    private native int _getIntValue(long j, int i, int i2);

    private native long _getLongValue(long j, int i, long j2);

    private native String _getStrValue(long j, int i, String str);

    private native void _setAppInfo(long j, String str);

    private native void _setFloatValue(long j, int i, float f);

    private native void _setIntValue(long j, int i, int i2);

    private native void _setLongValue(long j, int i, long j2);

    private native void _setStrValue(long j, int i, String str);

    public DataCenter() {
        DataCenterLibLoader.loadLibrary();
        this.mHandle = _create();
    }

    public long getFeatureHandle() {
        try {
            return _getFeatureHandle();
        } catch (UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public static DataCenter getInstance() {
        return mDataCenter;
    }

    public void addEventListener(DataCenterEvent dataCenterEvent) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _addEventListener(j, dataCenterEvent);
    }

    public void setAppInfo(String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setAppInfo(j, str);
    }

    public synchronized void setContext(Context context) {
        this.mContext = context;
    }

    public void businessEvent(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public float getFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return f;
        }
        try {
            return _getFloatValue(j, i, f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return f;
        }
    }

    public int getIntValue(int i, int i2) {
        long j = this.mHandle;
        if (j == 0) {
            return i2;
        }
        try {
            return _getIntValue(j, i, i2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return i2;
        }
    }

    public long getLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return j;
        }
        try {
            return _getLongValue(j2, i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return j;
        }
    }

    public String getStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return str;
        }
        try {
            return _getStrValue(j, i, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public void setFloatValue(int i, float f) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setFloatValue(j, i, f);
    }

    public void setIntValue(int i, int i2) {
        if (i == 10000) {
            this.mLogLevel = i2;
        }
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        _setIntValue(j, i, i2);
    }

    public void setLongValue(int i, long j) {
        long j2 = this.mHandle;
        if (j2 == 0) {
            return;
        }
        try {
            _setLongValue(j2, i, j);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void setStringValue(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _setStrValue(j, i, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void businessEvent(int i, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void businessEvent(int i, int i2, int i3) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, i3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public void businessEvent(int i, int i2, String str) {
        long j = this.mHandle;
        if (j == 0) {
            return;
        }
        try {
            _businessEvent(j, i, i2, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
