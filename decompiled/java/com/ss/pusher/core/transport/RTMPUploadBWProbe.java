package com.ss.pusher.core.transport;

import X.C1282850jUJ;
import X.C2188811AlT;
import X.InterfaceC1279270jOX;
import X.InterfaceC1282750jU9;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.engine.NativeObject;
import com.ss.pusher.core.utils.AVLog;

/* JADX INFO: loaded from: classes21.dex */
public class RTMPUploadBWProbe extends NativeObject {
    public boolean mEnableCallback = true;
    public InterfaceC1282750jU9 mListener;
    public InterfaceC1279270jOX mObserver;

    private native int nativeCreate();

    private native void nativeGetBandwidthResult(TEBundle tEBundle);

    private native void nativeOnEvent(int i, int i2, long j, String str);

    private native void nativeSendLogInfo(TEBundle tEBundle);

    private native void nativeSetEndNodeOptimizeTime1970(long j);

    private native void nativeSetParameter(TEBundle tEBundle, TEBundle tEBundle2);

    private native void nativeSetStartNativeApiCallTime1970(long j);

    private native void nativeStartBWTest(String str);

    private native void nativeStartPrePushStream(String str);

    private native void nativeStopBWTest();

    public void disableCallback() {
        this.mEnableCallback = false;
    }

    @Override // com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        this.mListener = null;
        super.release();
    }

    public void stopBWTest() {
        this.mEnableCallback = false;
        nativeStopBWTest();
    }

    public C1282850jUJ GetBandwidthResult() {
        TEBundle tEBundle = new TEBundle();
        nativeGetBandwidthResult(tEBundle);
        C1282850jUJ c1282850jUJ = new C1282850jUJ(tEBundle.getInt("event1"), tEBundle.getInt("event2"), (int) tEBundle.getLong("event3"), tEBundle.getString("msg"));
        tEBundle.release();
        return c1282850jUJ;
    }

    public RTMPUploadBWProbe(InterfaceC1282750jU9 interfaceC1282750jU9) {
        this.mListener = interfaceC1282750jU9;
        nativeCreate();
    }

    public void SendLogInfo(TEBundle tEBundle) {
        nativeSendLogInfo(tEBundle);
    }

    public void SetEndNodeOptimizeTime1970(long j) {
        nativeSetEndNodeOptimizeTime1970(j);
    }

    public void SetStartNativeApiCallTime1970(long j) {
        nativeSetStartNativeApiCallTime1970(j);
    }

    public void startBWTest(String str) {
        nativeStartBWTest(str);
    }

    public void startPrePushStream(String str) {
        nativeStartPrePushStream(str);
    }

    public void setParameter(TEBundle tEBundle, TEBundle tEBundle2) {
        nativeSetParameter(tEBundle, tEBundle2);
    }

    private void onMessage(int i, int i2, long j, String str) {
        InterfaceC1282750jU9 interfaceC1282750jU9 = this.mListener;
        if (interfaceC1282750jU9 != null && this.mEnableCallback) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onMessage from c++ RTMPUploadBWProbe code1: ");
            sbLIZ.append(i);
            sbLIZ.append(" , code2: ");
            sbLIZ.append(i2);
            sbLIZ.append(" , code3 : ");
            sbLIZ.append(j);
            sbLIZ.append(", msg: ");
            sbLIZ.append(str);
            AVLog.logKibana(4, "RTMPUploadBWProbe", C2188811AlT.LIZIZ(sbLIZ), null);
            interfaceC1282750jU9.LIZ(i, i2, j, str);
        }
    }

    public void OnEvent(int i, int i2, long j, String str) {
        nativeOnEvent(i, i2, j, str);
    }
}
