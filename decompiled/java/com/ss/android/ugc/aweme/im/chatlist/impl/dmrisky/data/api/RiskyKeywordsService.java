package com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.api;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.data.model.RiskyKeywords;

/* JADX INFO: loaded from: classes15.dex */
public interface RiskyKeywordsService {
    @InterfaceC1501240pAY("im/filter/update_keywords")
    Object LIZ(@InterfaceC1501120pAM("keywords") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("im/filter/get_keywords")
    Object getRiskyKeywords(InterfaceC1364105Vn<? super RiskyKeywords> interfaceC1364105Vn);
}
