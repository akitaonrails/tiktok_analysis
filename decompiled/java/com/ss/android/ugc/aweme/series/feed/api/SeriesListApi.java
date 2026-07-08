package com.ss.android.ugc.aweme.series.feed.api;

import X.C11NZ;
import X.C1576960r8g;
import X.InterfaceC1485405rg;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterRequest;
import com.ss.android.ugc.aweme.series.feed.model.MiniDramaCenterResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesListApi {
    public static GetSeriesCenterListApi LIZ;

    public interface GetSeriesCenterListApi {
        @InterfaceC1501160pAQ("/tiktok/v1/paid_content/mini_drama/guest_landing")
        C11NZ<MiniDramaGuestLandingResponse> getGuestLanding();

        @InterfaceC1501170pAR("/tiktok/v2/paid_content/mini_drama_center")
        C11NZ<MiniDramaCenterResponse> getMiniDramaCenterV2(@InterfaceC1485405rg MiniDramaCenterRequest miniDramaCenterRequest);

        @InterfaceC1501160pAQ("{path}")
        C11NZ<MyListResponse> getMyList(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("cursor") String str2, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) String str3, @InterfaceC1501070pAH("count") int i);

        @InterfaceC1501160pAQ("{path}")
        C11NZ<SeriesCenterListResponse> getSeriesCenterList(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("cursor") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("category_id") String str3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i2, @InterfaceC1501070pAH("is_validate") Integer num, @InterfaceC1501070pAH("is_preload") Integer num2, @InterfaceC1501070pAH("is_mixed_column_page") Boolean bool, @InterfaceC1501070pAH("is_from_innerfeed_discover") Boolean bool2);

        @InterfaceC1501160pAQ("{path}")
        C11NZ<SeriesCenterListResponse> getSeriesCenterListPreload(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("cursor") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("category_id") String str3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i2, @InterfaceC1501070pAH("is_validate") Integer num, @InterfaceC1501070pAH("is_preload") Integer num2, @InterfaceC1501070pAH("is_mixed_column_page") Boolean bool, @InterfaceC1501070pAH("is_from_innerfeed_discover") Boolean bool2);

        @InterfaceC1501170pAR("/tiktok/v1/paid_content/mini_drama/report")
        C11NZ<BaseResponse> report(@InterfaceC1485405rg MiniDramaReportRequest miniDramaReportRequest);
    }

    static {
        new C1576960r8g();
    }
}
