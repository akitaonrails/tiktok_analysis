package cs.bd.o;

import X.C08PQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
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
        return id + "," + rawOffset;
    }
}
