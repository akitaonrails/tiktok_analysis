package com.ss.android.ugc.aweme.topic.book.favorite.api;

import X.C326070CqL;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes5.dex */
public interface BookCollectionListApi {
    public static final C326070CqL LIZ = C326070CqL.LIZ;

    @InterfaceC1501160pAQ("/tiktok/topic/book/collections/v1/")
    Object getBookCollectionList(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super BookCollectionListResponse> interfaceC1364105Vn);
}
