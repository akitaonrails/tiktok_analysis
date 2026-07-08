package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.C1189410h3b;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailWriteReviewViewModel extends AssemViewModel<C1189410h3b> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1189410h3b(0);
    }

    public static boolean vQ2(PoiReviewsApi.PoiWriteReviewResponse poiWriteReviewResponse, String str) {
        PoiReviewFrequencyControl.DetailPage detailPage;
        PoiReviewFrequencyControl.Frequency frequency;
        if (Intrinsics.LJFF(poiWriteReviewResponse.getEligible(), Boolean.TRUE)) {
            PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
            if (str == null) {
                str = "";
            }
            poiReviewFrequencyControl.getClass();
            PoiReviewFrequencyControl.InnerConfig innerConfigLIZ = PoiReviewFrequencyControl.LIZ();
            if (innerConfigLIZ != null && (detailPage = innerConfigLIZ.detailPage) != null && (frequency = detailPage.poi) != null) {
                int i = frequency.frequencyDay;
                int i2 = frequency.frequencyTimes;
                String strLIZLLL = PoiReviewFrequencyControl.LIZLLL("ts_detail_page_with_same_poi", str);
                Keva keva = PoiReviewFrequencyControl.LIZIZ;
                if (System.currentTimeMillis() - keva.getLong(strLIZLLL, 0L) > ((long) (i * 24 * 60 * 60)) * 1000 || keva.getInt(PoiReviewFrequencyControl.LIZLLL("count_detail_page_with_same_poi", str), 0) < i2) {
                }
            }
            return true;
        }
        return false;
    }
}
