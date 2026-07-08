package com.ss.android.ugc.aweme.search.entry.searchbubble.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501170pAR;
import com.ss.android.ugc.aweme.search.entry.searchbubble.model.SearchBubbleInfoResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface SearchBubbleApi {
    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/aweme/v1/search/bubble/")
    Object getSearchBubbleInfo(@InterfaceC1501100pAK("last_new_gid") String str, InterfaceC1364105Vn<? super SearchBubbleInfoResponse> interfaceC1364105Vn);
}
