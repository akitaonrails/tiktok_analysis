package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C786410Ut5;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int streamVolume;
        int iZ3;
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(C2110608Oq.LIZIZ.LIZ, "audio");
        try {
            iZ3 = C786410Ut5.Z3(audioManager, 3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (iZ3 > 0) {
            streamVolume = (audioManager.getStreamVolume(3) * 100) / iZ3;
        } else {
            streamVolume = -1;
        }
        return Integer.valueOf(streamVolume);
    }
}
