package com.ss.android.ugc.aweme.ad.feed.photomode;

import X.C04TD;
import X.C1010280cOg;
import com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload;

/* JADX INFO: loaded from: classes17.dex */
public final class IAdSlidePreloadImpl implements IAdSlidePreload {
    public static IAdSlidePreload LIZJ() {
        Object objLIZ = C04TD.LIZ(IAdSlidePreload.class, false);
        if (objLIZ != null) {
            return (IAdSlidePreload) objLIZ;
        }
        if (C04TD.LJLLL == null) {
            synchronized (IAdSlidePreload.class) {
                if (C04TD.LJLLL == null) {
                    C04TD.LJLLL = new IAdSlidePreloadImpl();
                }
            }
        }
        return C04TD.LJLLL;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload
    public final int LIZ() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJI;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.slide.IAdSlidePreload
    public final int LIZIZ() {
        C1010280cOg.LIZ.getClass();
        return C1010280cOg.LJFF;
    }
}
