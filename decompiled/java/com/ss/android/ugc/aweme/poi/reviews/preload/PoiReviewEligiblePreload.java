package com.ss.android.ugc.aweme.poi.reviews.preload;

import X.C0BVC;
import X.C11NZ;
import X.C1499810p8F;
import X.EnumC1186570gz1;
import X.InterfaceC727570SgN;
import android.os.Bundle;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewEligiblePreload implements InterfaceC727570SgN<PoiReviewsApi, C11NZ<PoiReviewsApi.PoiReviewEligibleResponse>> {
    @Override // X.InterfaceC20153313tL
    public boolean enable(Bundle bundle) {
        return C0BVC.LIZ();
    }

    @Override // X.InterfaceC727570SgN
    public C1499810p8F getPreloadStrategy(Bundle bundle) {
        return new C1499810p8F(false, Api.LIZ, null, 20000, false, 28);
    }

    @Override // X.InterfaceC727570SgN
    public boolean handleException(Exception exc) throws Exception {
        throw exc;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.InterfaceC727570SgN
    /* JADX INFO: renamed from: preload */
    public C11NZ<PoiReviewsApi.PoiReviewEligibleResponse> preload2(Bundle bundle, Function1<? super Class<PoiReviewsApi>, ? extends PoiReviewsApi> function1) {
        String string;
        if (bundle == null || (string = bundle.getString("poi_id")) == null) {
            string = "";
        }
        return function1.invoke(PoiReviewsApi.class).isReviewEligible(string, EnumC1186570gz1.REVIEW_LANDING_PAGE.getValue(), null);
    }
}
