package com.ss.android.ugc.aweme.im.saas.host.impl.awemeservice;

import X.C735370Ssx;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService;

/* JADX INFO: loaded from: classes3.dex */
public final class IMAwemeServiceImpl implements IMAwemeService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService
    public final String LIZ(Aweme aweme) {
        return C735370Ssx.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService
    public final String LIZIZ(Aweme aweme) {
        return aweme.getStickerIDs();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService
    public final void LLILLL(Aweme aweme) {
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            iAwemeService.LLILLL(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.awemeservice.IMAwemeService
    public final Aweme LLILZ(String str) {
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null) {
            return iAwemeService.LLILZ(str);
        }
        return null;
    }
}
