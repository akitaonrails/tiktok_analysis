package com.ss.ttlivestreamer.core.player;

import X.C1270100j9k;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.player.TTPlayerHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class TTPlayerHelper {
    public static final String TAG = "TTPlayerHelper";

    public static String getTTVideoEngineVersion() {
        try {
            Method method = Class.forName("com.ss.ttvideoengine.TTVideoEngine").getMethod("getEngineVersion", new Class[0]);
            if (method != null) {
                return (String) method.invoke(null, new Object[0]);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        AVLog.ioe(TAG, "probe TTVideoEngine failed", th);
        return null;
    }

    public static native void nativeCloseAudio(long j, boolean z);

    public static native long nativeCreateTTAudioSink(Object obj, int i, int i2);

    public static native int nativeReadTTAudioBuffer(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0j9k] */
    public static C1270100j9k createAudioPlayer(final int i, final int i2) {
        String tTVideoEngineVersion = getTTVideoEngineVersion();
        if (tTVideoEngineVersion != null) {
            String str = TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Create TTAudioPlayer with engine version ");
            sbLIZ.append(tTVideoEngineVersion);
            sbLIZ.append(" sampleHZ ");
            sbLIZ.append(i);
            sbLIZ.append(" channel ");
            sbLIZ.append(i2);
            AVLog.iow(str, C2188811AlT.LIZIZ(sbLIZ));
            return new AudioSink(i, i2) { // from class: X.0j9k
                @Override // com.ss.ttlivestreamer.core.engine.NativeObject
                public final void finalize() {
                    synchronized (this) {
                    }
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public final void onData(Buffer buffer, int i3, int i4, int i5, long j) {
                }

                @Override // com.ss.ttlivestreamer.core.engine.AudioSink
                public final void onNoData() {
                }

                @Override // com.ss.ttlivestreamer.core.engine.NativeObject
                public final synchronized void release() {
                }

                {
                    setNativeObj(TTPlayerHelper.nativeCreateTTAudioSink(this, i, i2));
                }
            };
        }
        return null;
    }
}
