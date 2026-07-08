package com.ss.android.ugc.aweme.memory.profiler.strategy;

import com.google.gson.n;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry;

/* JADX INFO: loaded from: classes4.dex */
public final class DiagnoseRegistry extends AbsCommandRegistry {
    public static final DiagnoseRegistry INSTANCE = new DiagnoseRegistry();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 11;
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsCommandRegistry
    public void executeCommand(int i, String str, n nVar) {
        n nVar2 = new n();
        Boolean bool = Boolean.TRUE;
        nVar2.LJJII(bool, "ok");
        nVar2.LJJII(bool, "todo");
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    nVar2.LJJIIJ("feature", "unknown");
                    sendAck(i, str, nVar2);
                    return;
                } else {
                    nVar2.LJJIIJ("feature", "page-health");
                    nVar2.LJJIIJ("msg", "Secondary page memory health diagnose - TBD");
                    sendAck(i, str, nVar2);
                    return;
                }
            }
            nVar2.LJJIIJ("feature", "thread-memory");
            nVar2.LJJIIJ("msg", "Thread dimension memory diagnose - TBD");
            sendAck(i, str, nVar2);
            return;
        }
        nVar2.LJJIIJ("feature", "jitter");
        nVar2.LJJIIJ("msg", "memory jitter diagnose - TBD");
        sendAck(i, str, nVar2);
    }
}
