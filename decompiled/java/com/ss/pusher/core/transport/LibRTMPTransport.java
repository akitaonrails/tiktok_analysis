package com.ss.pusher.core.transport;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.engine.VsyncModule;
import com.ss.pusher.core.statics.StaticsReport;
import com.ss.pusher.core.utils.AVLog;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class LibRTMPTransport extends NativeTransport {
    public final Object LL = new Object();
    public VsyncModule LLILLJJLI;

    private native void nativeAbortRequest();

    private native int nativeAddSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2);

    private native void nativeAddUserMetaData(String str, String str2, int i);

    private native void nativeClearNetInfoInt64Value();

    private native void nativeCreateNative(boolean z, boolean z2);

    private native long nativeGetInt64Value(int i);

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native String nativeGetString(int i);

    private native void nativeSetPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder);

    private native boolean nativeSetupUrl(String str);

    private native void nativeTransReconnectProc();

    private native void nativeTransReconnectStart(String str);

    private native void nativeTransReconnectStop();

    private native void nativeUpdateVideoBitrate(int i, int i2, int i3);

    @Override // com.ss.pusher.core.transport.NativeTransport, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public final synchronized void release() {
        VsyncModule vsyncModule = this.LLILLJJLI;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.LLILLJJLI = null;
        }
        synchronized (this.LL) {
            try {
                super.release();
            } finally {
            }
        }
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void abortRequest() {
        synchronized (this.LL) {
            try {
                nativeAbortRequest();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void clearNetInfoInt64Value() {
        synchronized (this.LL) {
            try {
                nativeClearNetInfoInt64Value();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public LibRTMPTransport() {
        nativeCreateNative(true, true);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void transReconnectProc() {
        nativeTransReconnectProc();
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void transReconnectStop() {
        nativeTransReconnectStop();
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final long getInt64Value(int i) {
        long jNativeGetInt64Value;
        synchronized (this.LL) {
            try {
                jNativeGetInt64Value = nativeGetInt64Value(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jNativeGetInt64Value;
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final boolean getStaticsReport(StaticsReport staticsReport) {
        super.getStaticsReport(staticsReport);
        return nativeGetStaticsReport(staticsReport);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final String getString(int i) {
        return nativeGetString(i);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void setPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder) {
        nativeSetPushStreamStallRecorder(pushStreamStallRecorder);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final synchronized void setVysncModule(VsyncModule vsyncModule) {
        VsyncModule vsyncModule2 = this.LLILLJJLI;
        if (vsyncModule2 != null) {
            vsyncModule2.release();
        }
        this.LLILLJJLI = vsyncModule;
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final boolean setupUrl(String str) {
        boolean zNativeSetupUrl;
        if (str != null) {
            zNativeSetupUrl = nativeSetupUrl(str);
        } else {
            zNativeSetupUrl = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Setup url ");
        sbLIZ.append(str);
        AVLog.d("LibRTMPTransport", C2188811AlT.LIZIZ(sbLIZ));
        return zNativeSetupUrl;
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void transReconnectStart(String str) {
        nativeTransReconnectStart(str);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, 0L, true, true);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final void addUserMetaData(String str, String str2, int i) {
        nativeAddUserMetaData(str, str2, i);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return addSeiField(str, obj, i, j, z, z2, 0);
    }

    @Override // com.ss.pusher.core.engine.Transport
    public final int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                AVLog.ioe("LibRTMPTransport", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                return -1;
            }
        } else if (str != null && !str.isEmpty()) {
            if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported value type: ");
                sbLIZ.append(obj.getClass().getName());
                AVLog.ioe("LibRTMPTransport", C2188811AlT.LIZIZ(sbLIZ));
                return -3;
            }
            if ((i2 & 1 & 1) > 0 && !(obj instanceof JSONObject)) {
                AVLog.ioe("LibRTMPTransport", "value type must be JSONObject when seiFlag is:1");
                return -4;
            }
        } else {
            AVLog.logToIODevice2(6, "LibRTMPTransport", "When value is not a ByteBuffer, a valid key should be specified.", (Throwable) null, "LibRTMPTransport.java::addSeiField", 10000);
            return -2;
        }
        return nativeAddSeiField(str, obj, i, j, z, z2, i2);
    }
}
