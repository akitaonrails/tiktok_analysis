package com.ss.android.ugc.aweme.feed.assem.digg.request;

import X.InterfaceC1364105Vn;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501260pAa;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public interface VideoDiggApi {
    @InterfaceC1501170pAR("/aweme/v1/commit/item/digg/")
    Object diggAweme(@InterfaceC1501260pAa Map<String, String> map, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);
}
