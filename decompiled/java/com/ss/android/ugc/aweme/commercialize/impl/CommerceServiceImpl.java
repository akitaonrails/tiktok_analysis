package com.ss.android.ugc.aweme.commercialize.impl;

import X.C01GW;
import X.C1048110dNh;
import X.C1103104Td;
import X.C1109704Vr;
import X.C1807670x8n;
import X.C1807730x8t;
import X.C21140917oF;
import X.C21141017oG;
import X.C21141117oH;
import X.C21141217oI;
import X.C21141317oJ;
import X.C21141417oK;
import X.C452501pT;
import X.InterfaceC582810MtT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter;
import com.ss.android.ugc.aweme.ICommercePageTrackingService;
import com.ss.android.ugc.aweme.ad.comment.ICommerceCommentService;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.commercialize.profile.api.ad.profilepage.ICommerceProfilePageService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.vm.ads.preview.service.IVMPreviewAdsOfflineService;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class CommerceServiceImpl implements ICommerceService {
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommerceLandPageService LIZ() {
        return (ICommerceLandPageService) this.LIZJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final IFeedService LIZIZ() {
        return (IFeedService) this.LIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommerceCommentService LIZJ() {
        return (ICommerceCommentService) this.LIZIZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommercePageTrackingService LIZLLL() {
        return (ICommercePageTrackingService) this.LJFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final InterfaceC582810MtT LJ() {
        return C1048110dNh.LIZLLL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommerceFeatureCenter LJFF() {
        return (ICommerceFeatureCenter) PluggableExtentionKt.pluggableSpi$default(ICommerceFeatureCenter.class, false, false, false, 14, null);
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommerceProfilePageService LJI() {
        return (ICommerceProfilePageService) this.LIZLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final C1807730x8t LJII() {
        C1048110dNh c1048110dNh = C1048110dNh.LIZLLL;
        C1807730x8t c1807730x8t = c1048110dNh.LIZ;
        if (c1807730x8t == null) {
            synchronized (c1048110dNh) {
                c1807730x8t = c1048110dNh.LIZ;
                if (c1807730x8t == null) {
                    C1807730x8t c1807730x8t2 = (C1807730x8t) C1807670x8n.LJJIJIL();
                    c1048110dNh.LIZ = c1807730x8t2;
                    return c1807730x8t2;
                }
            }
        }
        return c1807730x8t;
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ILikeEffectService LJIIIIZZ() {
        return (ILikeEffectService) this.LJII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final IVMPreviewAdsOfflineService LJIIIZ() {
        return (IVMPreviewAdsOfflineService) this.LJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.structure.api.ICommerceService
    public final ICommerceNavigateService w2() {
        return (ICommerceNavigateService) this.LJ.getValue();
    }

    public CommerceServiceImpl() {
        new HashMap();
        this.LIZ = C452501pT.LIZIZ(new C21140917oF());
        this.LIZIZ = C452501pT.LIZIZ(new C1109704Vr());
        this.LIZJ = C452501pT.LIZIZ(new C1103104Td());
        this.LIZLLL = C452501pT.LIZIZ(new C21141117oH());
        this.LJ = C452501pT.LIZIZ(new C21141017oG());
        this.LJFF = C452501pT.LIZIZ(new C21141417oK());
        this.LJI = C452501pT.LIZIZ(new C21141217oI());
        this.LJII = C452501pT.LIZIZ(new C21141317oJ());
    }
}
