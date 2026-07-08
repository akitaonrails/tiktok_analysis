package com.ss.android.ugc.aweme.internal;

import X.C04TD;
import X.C15MA;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes30.dex */
public final class AVCommerceServiceImpl implements IInternalCommerceService {
    public static IInternalCommerceService LJIIJ() {
        Object objLIZ = C04TD.LIZ(IInternalCommerceService.class, false);
        if (objLIZ != null) {
            return (IInternalCommerceService) objLIZ;
        }
        if (C04TD.v1 == null) {
            synchronized (IInternalCommerceService.class) {
                if (C04TD.v1 == null) {
                    C04TD.v1 = new AVCommerceServiceImpl();
                }
            }
        }
        return C04TD.v1;
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LIZJ() {
        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJ() {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJFF() {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJFF();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final LinkedHashMap<String, Bitmap> LJI() {
        return ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJI();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJIIIIZZ() {
        if (!LJ()) {
            return true;
        }
        C15MA c15ma = C15MA.LL;
        return C15MA.LIZLLL() || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final UrlModel LIZ(String str) {
        return ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIL(str, true, true);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LIZLLL(int i) {
        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LIZLLL(i);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJII(Music music) {
        return ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJII(music);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final void LIZIZ(String str, String str2) {
        ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LIZIZ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.internal.IInternalCommerceService
    public final boolean LJIIIZ(Context context, String str, TextView textView, Boolean bool, String str2) {
        return ((ICommerceChallengeService) ServiceManager.get().getService(ICommerceChallengeService.class)).LJIIJ(str, true, textView, bool.booleanValue(), str2);
    }
}
