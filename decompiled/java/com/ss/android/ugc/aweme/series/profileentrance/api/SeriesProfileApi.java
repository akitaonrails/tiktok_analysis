package com.ss.android.ugc.aweme.series.profileentrance.api;

import X.C11NZ;
import X.C1578470rB7;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.series.feed.profile.model.SeriesProfileTabResponse;

/* JADX INFO: loaded from: classes25.dex */
public final class SeriesProfileApi {
    public static GetSeriesProfileTabApi LIZ;

    public interface GetSeriesProfileTabApi {
        @InterfaceC1501160pAQ("{path}")
        C11NZ<SeriesProfileTabResponse> getSeriesProfileTabApi(@InterfaceC1501060pAG(encode = false, value = "path") String str, @InterfaceC1501070pAH("creator_uid") long j, @InterfaceC1501070pAH("cursor") long j2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("view_collection_id") String str2, @InterfaceC1501070pAH("view_video_id") String str3);
    }

    static {
        new C1578470rB7();
    }
}
