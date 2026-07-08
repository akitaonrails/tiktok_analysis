package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import android.media.AudioManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e2 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int streamVolume;
        int iZ3;
        Context context = a.LIZIZ.LIZ;
        String[] strArr = q2.LIZ;
        AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "5f519b", new byte[]{37, 113, 66, 76, 9}));
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
