package com.lynx.jsbridge;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes21.dex */
public final class CallbackImpl implements Callback {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public boolean mInvoked = false;
    public long mNativePtr;

    private native void nativeInvoke(long j, WritableArray writableArray);

    private native void nativeReleaseNativePtr(long j);

    public void resetNativePtr() {
        this.mNativePtr = 0L;
    }

    public void finalize() throws Throwable {
        super.finalize();
        nativeReleaseNativePtr(this.mNativePtr);
    }

    public CallbackImpl(long j) {
        this.mNativePtr = j;
    }

    @Override // com.lynx.react.bridge.Callback
    public void invoke(Object... objArr) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(300003, "com/lynx/jsbridge/CallbackImpl", "invoke", this, new Object[]{objArr}, "void", new C0WZW(false, "([Ljava/lang/Object;)V", new C0WZX("dzBzEg4jUdKSX0QjVxuAYaZ+eErA3Xvt1E5OG2ma", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null && (obj = objArr2[0]) != null) {
            objArr = (Object[]) obj;
        }
        synchronized (this) {
            try {
                if (this.mInvoked) {
                    LynxLog.e("LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
                    return;
                }
                this.mInvoked = true;
                long j = this.mNativePtr;
                if (j == 0) {
                    LynxLog.e("LynxModule", "callback invoke failed: mNativePtr is NULL");
                } else {
                    nativeInvoke(j, JavaOnlyArray.of(objArr));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void invokeCallback(Object... objArr) {
        synchronized (this) {
            try {
                if (this.mInvoked) {
                    LynxLog.e("LynxModule", "Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
                    return;
                }
                this.mInvoked = true;
                long j = this.mNativePtr;
                if (j == 0) {
                    LynxLog.e("LynxModule", "callback invoke failed: mNativePtr is NULL");
                } else {
                    nativeInvoke(j, JavaOnlyArray.of(objArr));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
