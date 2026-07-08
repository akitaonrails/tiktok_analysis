package com.ss.android.ugc.aweme.series.banner.serviceimpl;

import X.AbstractC19484711Kz;
import X.AbstractC848400XPy;
import X.C04TD;
import X.C0TGX;
import X.C0XQ7;
import X.C11NJ;
import X.C1331660kl2;
import X.C13LP;
import X.C1581000rFC;
import X.C1697810uHb;
import X.C1957707lf;
import X.C19719512Dh;
import X.C19775012Yq;
import X.C2238021Cie;
import X.C7740030o;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerSetting;
import com.ss.android.ugc.aweme.series.promote.BannerExtra;
import com.ss.android.ugc.aweme.series.promote.EventTypes;
import com.ss.android.ugc.aweme.series.promote.PromoteImpressionEvent;
import com.ss.android.ugc.aweme.series.promote.SeriesPromoteApi;
import com.ss.android.ugc.aweme.service.IPaidContentBannerService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public final class ServiceBannerServiceImpl implements IPaidContentBannerService {
    public List<PaidContentBannerCampaign> LIZ = new ArrayList();
    public final C11NJ LIZIZ = new C11NJ();

    public static IPaidContentBannerService LJFF() {
        Object objLIZ = C04TD.LIZ(IPaidContentBannerService.class, false);
        if (objLIZ != null) {
            return (IPaidContentBannerService) objLIZ;
        }
        if (C04TD.P3 == null) {
            synchronized (IPaidContentBannerService.class) {
                if (C04TD.P3 == null) {
                    C04TD.P3 = new ServiceBannerServiceImpl();
                }
            }
        }
        return C04TD.P3;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final void LIZ() {
        this.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final AbstractC19484711Kz<BaseResponse> LIZIZ(String str) {
        List listSingletonList = Collections.singletonList(new EventTypes(22, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new BannerExtra(str))));
        SeriesPromoteApi.LIZ.getClass();
        return C1581000rFC.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, listSingletonList));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final AbstractC19484711Kz<BaseResponse> LIZJ(String str) {
        List listSingletonList = Collections.singletonList(new EventTypes(21, GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new BannerExtra(str))));
        SeriesPromoteApi.LIZ.getClass();
        return C1581000rFC.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, listSingletonList));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final boolean LIZLLL(boolean z) {
        List<PaidContentBannerCampaign> list;
        PaidContentBannerSetting paidContentBannerSetting = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getPaidContentBannerSetting();
        if (paidContentBannerSetting != null) {
            list = paidContentBannerSetting.paidContentBannerCampaignList;
        } else {
            list = null;
        }
        if (list != null && (!list.isEmpty())) {
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (PaidContentBannerCampaign paidContentBannerCampaign : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaidContentBannerCampaign paidContentBannerCampaign2 = paidContentBannerCampaign;
                    if (i < size) {
                        C1957707lf.LIZ.getClass();
                        String str = paidContentBannerCampaign2.paidContentBannerCampaignId;
                        C1957707lf.LIZIZ(str);
                        if (C1957707lf.LIZJ(str) < paidContentBannerCampaign2.paidContentBannerMaxDisplayCount) {
                            arrayList.add(paidContentBannerCampaign);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LIZ = C19719512Dh.LIZIZ(arrayList);
        }
        if (z && (!this.LIZ.isEmpty()) && ((PaidContentBannerCampaign) ListProtector.get(this.LIZ, 0)).paidContentBannerCampaignId.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentBannerService
    public final void LJ(C0TGX c0tgx, FrameLayout frameLayout) {
        PaidContentBannerCampaign paidContentBannerCampaign = (PaidContentBannerCampaign) C13LP.LJJJLZIJ(0, this.LIZ);
        if (paidContentBannerCampaign != null) {
            C2238021Cie c2238021Cie = new C2238021Cie(c0tgx, paidContentBannerCampaign, this, frameLayout);
            ImageUrlModel imageUrlModel = paidContentBannerCampaign.paidContentBannerIconUrl;
            if (imageUrlModel != null) {
                C1331660kl2.LJIIIIZZ(imageUrlModel).LJJIIJ(new C19775012Yq(c2238021Cie, 2));
            } else {
                c2238021Cie.invoke();
            }
        }
    }
}
