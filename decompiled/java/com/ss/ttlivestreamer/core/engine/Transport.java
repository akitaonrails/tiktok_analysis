package com.ss.ttlivestreamer.core.engine;

import X.AbstractC1270490jAN;
import X.C1270500jAO;
import X.InterfaceC1270480jAM;
import Y.ARunnableS0S0102100_20;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.transport.PushStreamStallRecorder;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Transport extends NativeObject {
    public InterfaceC1270480jAM mObserver;

    public static native void nativeEnableVideoFrameStatistics(boolean z);

    private native TEBundle nativeGetParameter();

    public static native void nativeResetSeiMgr();

    private native void nativeSetParameter(TEBundle tEBundle);

    public static native void nativeSetSeiSourceAble(boolean z);

    public void abortRequest() {
    }

    public int addSeiField(String str, Object obj, int i) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        return 0;
    }

    public void addUserMetaData(String str, String str2, int i) {
    }

    public void clearNetInfoInt64Value() {
    }

    public long getInt64Value(int i) {
        return 0L;
    }

    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public String getString(int i) {
        return null;
    }

    public VsyncModule getVsyncModule() {
        return null;
    }

    public abstract void registerFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN);

    public void sendPacket(c cVar) {
    }

    public void sendPacket(Buffer buffer, int i) {
    }

    public void setPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder) {
    }

    public void setVysncModule(VsyncModule vsyncModule) {
    }

    public boolean setupUrl(String str) {
        return false;
    }

    public void transReconnectProc() {
    }

    public void transReconnectStart(String str) {
    }

    public void transReconnectStop() {
    }

    public abstract void unRegisterFeedbackObserber(AbstractC1270490jAN abstractC1270490jAN);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public static void ResetSeiMgr() {
        nativeResetSeiMgr();
    }

    public static void EnableVideoFrameStatistics(boolean z) {
        nativeEnableVideoFrameStatistics(z);
    }

    public static void SetSeiSourceAble(boolean z) {
        nativeSetSeiSourceAble(z);
    }

    public void setEventObserver(InterfaceC1270480jAM interfaceC1270480jAM) {
        this.mObserver = interfaceC1270480jAM;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void onEvent(int i, int i2, long j, String str) {
        InterfaceC1270480jAM interfaceC1270480jAM = this.mObserver;
        if (interfaceC1270480jAM != null) {
            C1270500jAO c1270500jAO = (C1270500jAO) interfaceC1270480jAM;
            c1270500jAO.getClass();
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1270500jAO.LLJJIII.set(3);
                        SafeHandlerThread safeHandlerThread = c1270500jAO.LLJILLL;
                        if (safeHandlerThread != null) {
                            safeHandlerThread.post(new ARunnableS0S0102100_20(c1270500jAO, j, 3, i2, 1));
                            return;
                        }
                        return;
                    }
                    return;
                }
                AVLog.d("RecorderManager", "Recorded on native.");
                return;
            }
            AVLog.d("RecorderManager", "Recording on native.");
        }
    }

    public static class c {
        public ByteBuffer LIZ;
        public boolean LIZIZ;
        public int LIZJ;
        public int LIZLLL;
        public long LJ;
        public int LJFF;

        public void set(ByteBuffer byteBuffer, boolean z, int i, int i2, long j, int i3) {
            this.LIZ = byteBuffer;
            this.LIZJ = i;
            this.LIZLLL = i2;
            this.LJ = j;
            this.LJFF = i3;
            this.LIZIZ = z;
        }
    }
}
