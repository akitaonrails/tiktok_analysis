package com.ss.android.ugc.aweme.shortvideo.api;

import X.AbstractC2126608Uu;
import X.C09S2;
import X.InterfaceC1501160pAQ;
import X.InterfaceC2661011f;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.MusicList;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes30.dex */
public final class MusicChoicesApi {
    public static final InterfaceC2661011f LIZ = C09S2.LIZ(Api.LIZ);

    public interface RealApi {
        @InterfaceC1501160pAQ("/aweme/v1/commerce/music/choices/")
        ListenableFuture<MusicList> getCommerceMusicList();

        @InterfaceC1501160pAQ("/aweme/v1/music/choices/")
        ListenableFuture<MusicList> getMusicList();
    }

    public static MusicList LIZ() {
        try {
            return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ() ? ((RealApi) LIZ.create(RealApi.class)).getCommerceMusicList().get() : ((RealApi) LIZ.create(RealApi.class)).getMusicList().get();
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            throw AbstractC2126608Uu.getCompatibleException(e);
        }
    }
}
