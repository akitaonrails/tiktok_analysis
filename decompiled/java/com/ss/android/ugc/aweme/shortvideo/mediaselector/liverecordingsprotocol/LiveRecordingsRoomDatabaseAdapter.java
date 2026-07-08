package com.ss.android.ugc.aweme.shortvideo.mediaselector.liverecordingsprotocol;

import X.AbstractC796540VMm;
import X.C098200Yq;
import X.C189200o6;
import X.C533690KwR;
import X.InterfaceC533660KwO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes9.dex */
public abstract class LiveRecordingsRoomDatabaseAdapter extends AbstractC796540VMm {
    public static final C533690KwR LL = new Object() { // from class: X.0KwR
    };
    public static LiveRecordingsRoomDatabaseAdapter LLILLJJLI;
    public static String LLILLL;

    public abstract InterfaceC533660KwO LIZIZ();

    public final synchronized void LIZ(long j) {
        Object c098200Yq;
        int iLJ;
        try {
            if (LLILLJJLI != null) {
                iLJ = LIZIZ().LJ(j);
            } else {
                iLJ = 0;
            }
            c098200Yq = Integer.valueOf(iLJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            num.intValue();
        }
    }
}
