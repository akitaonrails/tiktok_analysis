package com.ss.android.ugc.aweme.tako.share.panel;

import X.C1382840m5a;
import X.C13BV;
import X.InterfaceC1370310llN;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoBatchSheetActionProtocol extends TTSheetActionProtocol {
    public TakoBatchSheetActionProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage) {
        if ((baseSharePackage instanceof TakoBatchMessageSharePackage) && baseSharePackage != null) {
            Collection collection = (Collection) ((LinkedHashMap) C1382840m5a.LIZ).get(baseSharePackage);
            if (collection == null) {
                collection = C13BV.INSTANCE;
            }
            return new ArrayList(collection);
        }
        return new ArrayList();
    }
}
