package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.TimeZone;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int rawOffset;
        String id = null;
        try {
            TimeZone timeZone = TimeZone.getDefault();
            id = timeZone.getID();
            rawOffset = ((timeZone.getRawOffset() / 60) / 60) / LSPassThroughRecordSizeConfig.DEFAULT;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            rawOffset = 0;
        }
        return id + ((String) k.a(16777217, 0, 0L, "2832a6", new byte[]{111})) + rawOffset;
    }
}
