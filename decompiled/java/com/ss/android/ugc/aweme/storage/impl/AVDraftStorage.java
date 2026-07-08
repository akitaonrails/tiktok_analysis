package com.ss.android.ugc.aweme.storage.impl;

import X.C0CHQ;
import X.C0M4J;
import X.C13VI;
import X.C1449640npK;
import X.C571770Mbf;
import X.EnumC1335420kr6;
import X.EnumC562220M3g;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class AVDraftStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final String LIZ() {
        return "AV_STORAGE_CLEANER_CACHE";
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return C0CHQ.LIZ().LJJIIJZLJL().getFileProvider().LIZ(C1449640npK.LIZJ);
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.DRAFT;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        long jLIZIZ = 0;
        if (!z) {
            List<AwemeDraft> listQueryDraftList = C0CHQ.LIZ().LJI().LJIILJJIL().queryDraftList(new C0M4J(true, true, EnumC562220M3g.NORMAL, null, new AwS587S0100000_8(C0CHQ.LIZ().getPublishService().LJJJJIZL(), (List<MentionDataItem>) 722), 56));
            ArrayList arrayList = new ArrayList();
            if (listQueryDraftList != null && !listQueryDraftList.isEmpty()) {
                arrayList.addAll(listQueryDraftList);
            }
            C571770Mbf c571770Mbf = new C571770Mbf();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c571770Mbf.LIZ = (AwemeDraft) it2.next();
                jLIZIZ += c571770Mbf.LIZIZ();
            }
        }
        return jLIZIZ;
    }
}
