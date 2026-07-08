package com.ss.android.ugc.aweme.commercialize.feed;

import X.C04TD;
import X.C13LE;
import X.C19719912Dl;
import com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService;
import com.ss.android.ugc.aweme.commercialize.feed.assem.tag.AdTopInteractInfoAreaTagTrigger;

/* JADX INFO: loaded from: classes3.dex */
public final class AdTagServiceImpl implements IAdTagService {
    @Override // com.ss.android.ugc.aweme.ad.feed.tag.IAdTagService
    public final C19719912Dl LIZ() {
        return C13LE.LIZ(AdTopInteractInfoAreaTagTrigger.class);
    }

    public static IAdTagService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdTagService.class, false);
        if (objLIZ != null) {
            return (IAdTagService) objLIZ;
        }
        if (C04TD.LLLFZ == null) {
            synchronized (IAdTagService.class) {
                if (C04TD.LLLFZ == null) {
                    C04TD.LLLFZ = new AdTagServiceImpl();
                }
            }
        }
        return C04TD.LLLFZ;
    }
}
