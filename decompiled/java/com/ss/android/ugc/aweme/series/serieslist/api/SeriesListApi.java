package com.ss.android.ugc.aweme.series.serieslist.api;

import X.C11NZ;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501200pAU;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesListApi {
    public static GetPaidCollectionListApi LIZ;

    public interface GetPaidCollectionListApi {
        @InterfaceC1501200pAU("{path}")
        C11NZ<PaidCollectionListResponse> getPaidCollectionList(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("creator_uid") long j, @InterfaceC1501070pAH("list_source") int i, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("count") int i2, @InterfaceC1501070pAH("room_id") Long l, @InterfaceC1501070pAH("has_pagination") Boolean bool);
    }
}
