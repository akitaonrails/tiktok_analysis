package com.ss.android.ugc.aweme.lemon.share.protocol;

import X.InterfaceC1370310llN;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.share.ShareExtService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareModel;
import com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class Lemon8SheetActionProtocol extends TTSheetActionProtocol {
    public Lemon8SheetActionProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTSheetActionProtocol, com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol
    public final List<InterfaceC1370310llN> uO1(BaseSharePackage baseSharePackage) {
        Aweme aweme;
        ArrayList arrayList = new ArrayList();
        ShareModel shareModel = baseSharePackage.shareModel;
        Serializable serializable = null;
        if (shareModel != null) {
            serializable = shareModel.customModel;
        }
        if ((serializable instanceof Aweme) && (aweme = (Aweme) serializable) != null) {
            arrayList.add(((ShareExtService) ServiceManager.get().getService(ShareExtService.class)).LJLILLLLZI(aweme));
        }
        return arrayList;
    }
}
