package com.ss.android.ugc.aweme.comment.gift.api;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;

/* JADX INFO: loaded from: classes22.dex */
public final class GiftListApi {
    public static FetchGiftListApi LIZ;

    public interface FetchGiftListApi {
        @InterfaceC1501160pAQ("/tiktok/v1/gift/list/")
        C11NZ<GiftResponse> getGiftList(@InterfaceC1501070pAH("aweme_id") String str, @InterfaceC1501070pAH("creator_uid") String str2, @InterfaceC1501070pAH("gift_list_type") Integer num);
    }
}
