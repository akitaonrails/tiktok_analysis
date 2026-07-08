package com.ss.android.ugc.aweme.commentv2.offline;

import X.C058V;
import X.C058W;
import X.C05KA;
import X.C1210404oQ;
import X.C23250099c;
import X.InterfaceC497601wk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class OfflineCommentLifecycleListenerImpl implements IOfflineCacheLifecycleListener {
    public final String LIZ = "OfflineComment";

    @Override // com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener
    public final void LIZ(List list) {
        if (C1210404oQ.LIZ() && !list.isEmpty()) {
            C23250099c.LIZLLL((InterfaceC497601wk) C05KA.LIZIZ.getValue(), null, null, new C058W(list, this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.repo.IOfflineCacheLifecycleListener
    public final void LIZIZ(Aweme aweme, String str) {
        if (C1210404oQ.LIZ() && str.length() != 0) {
            C23250099c.LIZLLL((InterfaceC497601wk) C05KA.LIZIZ.getValue(), null, null, new C058V(str, aweme, this, null), 3);
        }
    }
}
