package com.ss.android.ugc.aweme.widget.api;

import X.C0X9S;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.widget.model.SuggestedVideoResponse;

/* JADX INFO: loaded from: classes5.dex */
public interface ISuggestedVideoApi {
    @InterfaceC1501170pAR("/growth/widget/suggest/videos")
    C0X9S<SuggestedVideoResponse> fetchSuggestVideos(@InterfaceC1501070pAH("source") int i, @InterfaceC1501070pAH("gaid") String str);
}
