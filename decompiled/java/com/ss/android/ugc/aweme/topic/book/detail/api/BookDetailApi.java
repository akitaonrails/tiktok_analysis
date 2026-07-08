package com.ss.android.ugc.aweme.topic.book.detail.api;

import X.C613220O3k;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: loaded from: classes10.dex */
public interface BookDetailApi {
    public static final C613220O3k LIZ = C613220O3k.LIZ;

    @InterfaceC1501240pAY("/tiktok/topic/book/collect/v1/")
    Object collectBook(@InterfaceC1501070pAH("book_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/topic/book/detail/v1/")
    Object getBookDetail(@InterfaceC1501070pAH("book_id") String str, InterfaceC1364105Vn<? super BookDetailResp> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/tiktok/topic/book/itemlist/v1/")
    Object getBookVideos(@InterfaceC1501070pAH("book_id") String str, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("page_extra") String str2, InterfaceC1364105Vn<? super BookVideosResp> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/topic/book/uncollect/v1/")
    Object unCollectBook(@InterfaceC1501070pAH("book_id") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
