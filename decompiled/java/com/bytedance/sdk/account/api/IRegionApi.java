package com.bytedance.sdk.account.api;

import X.C080U;
import X.C847960XOg;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public interface IRegionApi {
    public static final C847960XOg LIZ = C847960XOg.LIZ;

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/passport/app/auth_broadcast/")
    Object authBroadcast(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174808fa List<C080U> list, InterfaceC1364105Vn<? super IgnoredResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/passport/app/region/")
    Object getRegion(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174808fa List<C080U> list, InterfaceC1364105Vn<? super GetRegionResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/passport/app/region_alert/")
    Object regionAlert(@InterfaceC1501150pAP Map<String, String> map, @InterfaceC2174808fa List<C080U> list, InterfaceC1364105Vn<? super IgnoredResponse> interfaceC1364105Vn);
}
