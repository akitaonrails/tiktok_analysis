package com.ss.android.ugc.aweme.poi.detail.reviews;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsCell extends AssemPowerCell<PoiReviewsReusedAssem, PoiReviewsApi.PoiReviewListResponse> {
    @Override // com.bytedance.ext_power_list.AssemPowerCell
    public final ReusedUISlotAssem I5() {
        return new PoiReviewsReusedAssem();
    }
}
