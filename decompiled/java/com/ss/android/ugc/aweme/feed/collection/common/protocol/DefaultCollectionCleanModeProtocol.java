package com.ss.android.ugc.aweme.feed.collection.common.protocol;

import X.C1554610qYd;
import X.InterfaceC665370Q7z;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class DefaultCollectionCleanModeProtocol implements CollectionCleanModeProtocol {
    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CollectionCleanModeProtocol
    public final void UH0() {
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CollectionCleanModeProtocol
    public final void iO0(InterfaceC665370Q7z interfaceC665370Q7z) {
        List listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, CleanModeProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((CleanModeProtocol) it2.next()).Iu0();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.collection.common.protocol.CollectionCleanModeProtocol
    public final void n82(InterfaceC665370Q7z interfaceC665370Q7z) {
        List listLIZIZ = C1554610qYd.LIZIZ(interfaceC665370Q7z, CleanModeProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((CleanModeProtocol) it2.next()).Lv();
            }
        }
    }
}
