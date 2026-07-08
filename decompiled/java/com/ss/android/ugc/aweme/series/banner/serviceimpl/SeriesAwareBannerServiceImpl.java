package com.ss.android.ugc.aweme.series.banner.serviceimpl;

import X.AbstractC19484711Kz;
import X.AbstractC848400XPy;
import X.C01GW;
import X.C04TD;
import X.C0TGX;
import X.C0XQ7;
import X.C11NJ;
import X.C11S5;
import X.C1581000rFC;
import X.C2238041Cig;
import X.C2238071Cij;
import X.C452501pT;
import android.widget.FrameLayout;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;
import com.ss.android.ugc.aweme.series.promote.EventTypes;
import com.ss.android.ugc.aweme.series.promote.PromoteImpressionEvent;
import com.ss.android.ugc.aweme.series.promote.SeriesPromoteApi;
import com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class SeriesAwareBannerServiceImpl implements IPaidContentAwareBannerService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(111));
    public final C11NJ LIZIZ = new C11NJ();

    public static IPaidContentAwareBannerService LJFF() {
        Object objLIZ = C04TD.LIZ(IPaidContentAwareBannerService.class, false);
        return objLIZ != null ? (IPaidContentAwareBannerService) objLIZ : new SeriesAwareBannerServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final void LIZ() {
        this.LIZIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final AbstractC19484711Kz<BaseResponse> LIZIZ() {
        List listSingletonList = Collections.singletonList(new EventTypes(14, null));
        SeriesPromoteApi.LIZ.getClass();
        return C1581000rFC.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, listSingletonList));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final AbstractC19484711Kz<BaseResponse> LIZLLL() {
        List listSingletonList = Collections.singletonList(new EventTypes(16, null));
        SeriesPromoteApi.LIZ.getClass();
        return C1581000rFC.LIZ().logPromoteImpression(new PromoteImpressionEvent(null, listSingletonList));
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final boolean LJ() {
        if (this.LIZ.getValue() == null) {
            return false;
        }
        C2238071Cij c2238071Cij = C2238071Cij.LIZ;
        c2238071Cij.getClass();
        c2238071Cij.getClass();
        if (((Keva) C2238071Cij.LIZIZ.getValue()).getInt(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), 0) < ((PaidContentAwareBannerSetting) C2238071Cij.LIZJ.getValue()).awareBannerMaxDisplayCount) {
            return true;
        }
        this.LIZIZ.LIZ(LIZIZ().LJJIJIIJI(C11S5.LIZ()).LJJIIJ());
        return false;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService
    public final void LIZJ(C0TGX c0tgx, FrameLayout frameLayout) {
        if (this.LIZ.getValue() != null) {
            PopupManager.LJIJI(new C2238041Cig(c0tgx, (PaidContentAwareBannerSetting) this.LIZ.getValue(), this.LIZIZ, frameLayout), true);
        }
    }
}
