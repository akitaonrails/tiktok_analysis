package defpackage;

import X.C2188811AlT;
import X.C2344809Gs;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class d1 {
    public static final /* synthetic */ int LJ = 0;
    public final String LIZ;
    public final ConcurrentHashMap<String, Long> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Long> LIZJ = new ConcurrentHashMap<>();
    public int LIZLLL;

    public static final class a {
    }

    public final Map<String, Long> LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Long> entry : this.LIZJ.entrySet()) {
            String key = entry.getKey();
            Long l = this.LIZIZ.get(key);
            if (l != null) {
                long jLongValue = l.longValue();
                Long l2 = this.LIZJ.get(key);
                if (l2 != null) {
                    long jLongValue2 = l2.longValue();
                    long j = (1 > jLongValue || jLongValue > jLongValue2) ? -1L : jLongValue2 - jLongValue;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CommentPageNetCallStageTimingRecorder ");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(": getStageTime: ");
                    sbLIZ.append(key);
                    sbLIZ.append(" : ");
                    sbLIZ.append(j);
                    C2344809Gs.LIZLLL(3, "CommentLog", C2188811AlT.LIZIZ(sbLIZ));
                    if (j != -1) {
                        linkedHashMap.put(entry.getKey(), Long.valueOf(j));
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public d1(String str) {
        this.LIZ = str;
    }

    public final void LIZ(String str) {
        this.LIZIZ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPageNetCallStageTimingRecorder ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(": begin ");
        sbLIZ.append(str);
        sbLIZ.append("()");
        C2344809Gs.LIZLLL(3, "CommentLog", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(String str) {
        this.LIZJ.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentPageNetCallStageTimingRecorder ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(": finish ");
        sbLIZ.append(str);
        sbLIZ.append("()");
        C2344809Gs.LIZLLL(3, "CommentLog", C2188811AlT.LIZIZ(sbLIZ));
    }
}
