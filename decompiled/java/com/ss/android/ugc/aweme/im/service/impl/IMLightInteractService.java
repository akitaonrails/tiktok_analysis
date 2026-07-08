package com.ss.android.ugc.aweme.im.service.impl;

import X.C460800I5e;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.sayhi.data.keva.MessageAfterFollowBackKeva;
import com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService;

/* JADX INFO: loaded from: classes15.dex */
public final class IMLightInteractService implements IIMLightInteractService {
    public static final IMLightInteractService LIZ = new IMLightInteractService();
    public static final MessageAfterFollowBackKeva LIZIZ = MessageAfterFollowBackKeva.LIZIZ;
    public static final C460800I5e LIZJ = C460800I5e.LIZ;

    public static final class Service implements IIMLightInteractService {
        public final /* synthetic */ IMLightInteractService LIZ = IMLightInteractService.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService
        public final MessageAfterFollowBackKeva LIZ() {
            this.LIZ.getClass();
            return IMLightInteractService.LIZIZ;
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService
        public final C460800I5e LIZIZ() {
            this.LIZ.getClass();
            return IMLightInteractService.LIZJ;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService
    public final MessageAfterFollowBackKeva LIZ() {
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IIMLightInteractService
    public final C460800I5e LIZIZ() {
        return LIZJ;
    }
}
