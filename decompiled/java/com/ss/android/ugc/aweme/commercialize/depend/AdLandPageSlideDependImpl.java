package com.ss.android.ugc.aweme.commercialize.depend;

import X.C04TD;
import X.C1019030ccn;
import X.C626450Ohf;
import X.EnumC1002140cBY;
import android.content.Context;
import com.ss.android.ugc.aweme.ad.depend.IAdLandPageSlideDepend;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: loaded from: classes12.dex */
public final class AdLandPageSlideDependImpl implements IAdLandPageSlideDepend {
    public static IAdLandPageSlideDepend LIZIZ() {
        Object objLIZ = C04TD.LIZ(IAdLandPageSlideDepend.class, false);
        if (objLIZ != null) {
            return (IAdLandPageSlideDepend) objLIZ;
        }
        if (C04TD.LLJZIJLIL == null) {
            synchronized (IAdLandPageSlideDepend.class) {
                if (C04TD.LLJZIJLIL == null) {
                    C04TD.LLJZIJLIL = new AdLandPageSlideDependImpl();
                }
            }
        }
        return C04TD.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.ad.depend.IAdLandPageSlideDepend
    public final void LIZ(Context context, Aweme aweme) {
        IAdPhotoModeService iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null);
        if (iAdPhotoModeService != null) {
            iAdPhotoModeService.LJJI(EnumC1002140cBY.SUPPLY);
        }
        C1019030ccn.LJJIJIIJI(context, aweme, "");
        C626450Ohf.LIZ(context, aweme, "slide");
    }
}
