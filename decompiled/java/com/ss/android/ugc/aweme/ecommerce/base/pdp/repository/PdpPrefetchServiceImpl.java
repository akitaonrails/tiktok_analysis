package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository;

import X.C2131908Wv;
import X.InterfaceC420801kM;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPrefetchService;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PdpPrefetchServiceImpl implements IPdpPrefetchService {
    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpPrefetchService
    public final InterfaceC420801kM LIZ(List list, List list2, String str, Map map, C2131908Wv c2131908Wv) {
        PdpPreviewServiceImpl pdpPreviewServiceImpl;
        Object service = ServiceManager.get().getService(IPdpPreviewService.class);
        if (!(service instanceof PdpPreviewServiceImpl) || (pdpPreviewServiceImpl = (PdpPreviewServiceImpl) service) == null) {
            return null;
        }
        return pdpPreviewServiceImpl.LIZJ(list, list2, null, str, map, c2131908Wv);
    }
}
