package com.ss.android.ugc.aweme.pgc.hybrid.xbridge;

import X.AbstractC1549150qPp;
import X.C1552100qUa;
import X.C1552570qVL;
import X.C1697810uHb;
import X.C1801390wyf;
import X.C1851830yI1;
import X.C1890990zJB;
import X.C1891050zJH;
import X.C20304014cY;
import X.C844470XAv;
import com.ss.android.ugc.aweme.i18n.xbridge.IPGCXBridgeService;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class PGCXBridgeServiceImpl implements IPGCXBridgeService {
    @Override // com.ss.android.ugc.aweme.i18n.xbridge.IPGCXBridgeService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIILJJIL = C1697810uHb.LJIILJJIL(C1801390wyf.class, C1851830yI1.class, C20304014cY.class, C1890990zJB.class, C1891050zJH.class);
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
            listLJIILJJIL.addAll(C1697810uHb.LJIILJJIL(C1552100qUa.class, C1552570qVL.class));
        }
        return listLJIILJJIL;
    }
}
