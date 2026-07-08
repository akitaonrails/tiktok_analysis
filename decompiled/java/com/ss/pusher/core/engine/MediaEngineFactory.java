package com.ss.pusher.core.engine;

import X.C2118308Rp;
import X.C2188811AlT;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.bytertc.engine.loader.LyraxSoLoadState;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public class MediaEngineFactory {
    public static final /* synthetic */ int LIZIZ = 0;
    public long LIZ;

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory);

    public static native long nativeGetMediaEngineFactory();

    private native void nativeSetStatisticsType(int i);

    public static native void nativeSetupClassLoader();

    static {
        for (String str : Arrays.asList("c++_shared", "ttcrypto", "yuv", "bytevc0", "bytevc1enc", "ttboringssl", "ttffmpeg", "vcbasekit", "ttquic", "fdk_aac", "volcenginertc")) {
            try {
                C2118308Rp.LIZ(str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Loading library lib");
                sbLIZ.append(str);
                sbLIZ.append(".so done (");
                sbLIZ.append(true);
                sbLIZ.append(")");
                C2188811AlT.LIZIZ(sbLIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Loading library lib");
                sbLIZ2.append(str);
                sbLIZ2.append(".so error (");
                sbLIZ2.append(th.getMessage());
                sbLIZ2.append(")");
                C2188811AlT.LIZIZ(sbLIZ2);
                try {
                    LoadSoLancet.LIZJ(str);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF(str);
                    LoadSoLancet.LJ(jUptimeMillis, str);
                    LoadSoLancet.LIZLLL(jUptimeMillis, str);
                    LoadSoLancet.LIZIZ(str);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
    }

    public static MediaEngineFactory LIZ() {
        if (!LyraxSoLoadState.isLyraxNativeReady()) {
            return null;
        }
        long jNativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (jNativeGetMediaEngineFactory != 0) {
            return new MediaEngineFactory(jNativeGetMediaEngineFactory);
        }
        return null;
    }

    public static void LIZJ() {
        if (LyraxSoLoadState.isLyraxNativeReady()) {
            nativeSetupClassLoader();
        }
    }

    public MediaEngineFactory(long j) {
        this.LIZ = j;
    }

    public final void LIZLLL(int i) {
        nativeSetStatisticsType(i);
    }

    public final MediaEncodeStream LIZIZ(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory) {
        long j = this.LIZ;
        if (j == 0) {
            return null;
        }
        long jNativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(j, videoEncoderFactory, audioEncoderFactory);
        if (jNativeCreateMediaEncodeStream == 0) {
            return null;
        }
        return new MediaEncodeStream(jNativeCreateMediaEncodeStream);
    }
}
