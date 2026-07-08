package com.ss.android.ugc.aweme.story.share;

import X.C110200bM;
import X.C13LP;
import X.C1954807lC;
import X.C20186213ye;
import X.C201950140e;
import X.C201955140j;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C786410Ut5;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes31.dex */
public final class ShareToStoryVideoStreamControllerImpl implements IShareToStoryVideoStreamController {
    @Override // com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController
    public final C2252331DDr LIZJ() {
        C20186213ye.LIZ.getClass();
        return C20186213ye.LJ;
    }

    @Override // com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController
    public final Map<String, String> LIZ(Set<String> set) {
        C20186213ye.LIZ.getClass();
        HashMap map = new HashMap();
        if (!set.isEmpty()) {
            Set setLLIIIZ = C13LP.LLIIIZ(set);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int iOrdinal = C20186213ye.LJFF(setLLIIIZ, map).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new C1954807lC();
                    }
                } else {
                    long jLIZIZ = C20186213ye.LIZIZ();
                    C201950140e c201950140e = C201950140e.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("awaitDownloads: waiting up to ");
                    sbLIZ.append(jLIZIZ);
                    sbLIZ.append("ms for ");
                    sbLIZ.append(setLLIIIZ.size());
                    sbLIZ.append(" url(s)");
                    C201955140j.LIZLLL(c201950140e, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() + jLIZIZ;
                    while (SystemClock.elapsedRealtime() < jElapsedRealtime2) {
                        try {
                            Thread.sleep(250L);
                            int iOrdinal2 = C20186213ye.LJFF(setLLIIIZ, map).ordinal();
                            if (iOrdinal2 != 0) {
                                if (iOrdinal2 != 1) {
                                    if (iOrdinal2 == 2) {
                                        C201950140e c201950140e2 = C201950140e.LIZIZ;
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("awaitDownloads: done, resolved=");
                                        sbLIZ2.append(map.size());
                                        sbLIZ2.append('/');
                                        sbLIZ2.append(set.size());
                                        C201955140j.LIZLLL(c201950140e2, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ2));
                                        return map;
                                    }
                                    throw new C1954807lC();
                                }
                            } else {
                                C201950140e c201950140e3 = C201950140e.LIZIZ;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("awaitDownloads: done, resolved=");
                                sbLIZ3.append(map.size());
                                sbLIZ3.append('/');
                                sbLIZ3.append(set.size());
                                C201955140j.LIZLLL(c201950140e3, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ3));
                                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("resolved", Integer.valueOf(map.size())), new Pair("total", Integer.valueOf(set.size())), new Pair("wait_ms", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime)));
                                C110200bM.LIZ.getClass();
                                C110200bM.LIZIZ("await", "success", "", mapLJIIIIZZ);
                                return map;
                            }
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C786410Ut5.u3().interrupt();
                            C201955140j.LJIJJ(C201950140e.LIZIZ, "ShareToStoryVideoStream", "awaitDownloads: interrupted, returning partial result");
                            return map;
                        }
                    }
                    C201950140e c201950140e4 = C201950140e.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("awaitDownloads: timeout, resolved=");
                    sbLIZ4.append(map.size());
                    sbLIZ4.append('/');
                    sbLIZ4.append(set.size());
                    sbLIZ4.append(" unresolved=");
                    sbLIZ4.append(setLLIIIZ.size());
                    C201955140j.LJIJJ(c201950140e4, "ShareToStoryVideoStream", C2188811AlT.LIZIZ(sbLIZ4));
                    C110200bM.LIZ("await", "timeout", C2097608Jq.LJIIIIZZ(new Pair("resolved", Integer.valueOf(map.size())), new Pair("total", Integer.valueOf(set.size())), new Pair("unresolved", Integer.valueOf(setLLIIIZ.size())), new Pair("wait_ms", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime))));
                    return map;
                }
            } else {
                Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(new Pair("resolved", Integer.valueOf(map.size())), new Pair("total", Integer.valueOf(set.size())), new Pair("wait_ms", 0));
                C110200bM.LIZ.getClass();
                C110200bM.LIZIZ("await", "success", "", mapLJIIIIZZ2);
            }
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController
    public final String LIZIZ(String str) {
        C20186213ye.LIZ.getClass();
        return C20186213ye.LIZJ(str);
    }
}
