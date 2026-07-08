package com.ss.pusher.core.engine;

import X.AbstractC1279280jOY;
import X.C1278940jO0;
import X.C1279290jOZ;
import X.InterfaceC1279270jOX;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.statics.StaticsReport;
import com.ss.pusher.core.transport.PushStreamStallRecorder;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Transport extends NativeObject {
    public InterfaceC1279270jOX mObserver;

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
        return true;
    }

    public String getString(int i) {
        return null;
    }

    public abstract void registerFeedbackObserber(AbstractC1279280jOY abstractC1279280jOY);

    public void sendPacket(C1279290jOZ c1279290jOZ) {
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

    public abstract void unRegisterFeedbackObserber(AbstractC1279280jOY abstractC1279280jOY);

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

    public void setEventObserver(InterfaceC1279270jOX interfaceC1279270jOX) {
        this.mObserver = interfaceC1279270jOX;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void onEvent(int i, int i2, long j, String str) {
        InterfaceC1279270jOX interfaceC1279270jOX = this.mObserver;
        if (interfaceC1279270jOX != null) {
            ((C1278940jO0) interfaceC1279270jOX).LJ(i, i2, j, str);
        }
    }
}
