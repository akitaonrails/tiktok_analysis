package com.ss.android.ugc.aweme.series.profile.api;

import X.C09CT;
import X.C11NZ;
import X.InterfaceC1485405rg;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileApi {
    public static RemoveSeriesVideoApi LIZ;

    public interface RemoveSeriesVideoApi {
        @InterfaceC1501170pAR("/tiktok/v1/paid_content/profile/video/remove")
        C11NZ<BaseResponse> removeSeriesVideo(@InterfaceC1485405rg RemoveSeriesVideoRequest removeSeriesVideoRequest);
    }

    public static final class RemoveSeriesVideoRequest {

        @C09CT("item_id")
        public final String itemId;

        public RemoveSeriesVideoRequest(String str) {
            this.itemId = str;
        }
    }
}
