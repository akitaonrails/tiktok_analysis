package com.ss.android.ugc.aweme.home.repo.network;

import X.C040I;
import X.C0X52;
import X.C1002400cBy;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501350pAj;
import com.ss.android.ugc.aweme.home.repo.network.data.BaseResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.HomeSchemaResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.HomepageInfoResponse;
import com.ss.android.ugc.aweme.home.repo.network.data.HomepageSchemaRequest;

/* JADX INFO: loaded from: classes17.dex */
public interface WalletHomeApi {
    public static final C1002400cBy LIZ = C1002400cBy.LIZ;

    @InterfaceC1501170pAR("/wallet/v1/user/consult_homepage_schema")
    Object consultHomepageSchema(@InterfaceC1501350pAj("pipo-fp-token") String str, @C040I HomepageSchemaRequest homepageSchemaRequest, InterfaceC1364105Vn<? super C0X52<BaseResponse<HomeSchemaResponse>>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/cashier/v1/basic_info")
    Object getBasicInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501050pAF("merchant_id") String str2, @InterfaceC1501050pAF("biz_content") String str3, InterfaceC1364105Vn<? super C0X52<String>> interfaceC1364105Vn);

    @InterfaceC1485505rh
    @InterfaceC1501170pAR("/wallet/v1/user/homepage_info")
    Object getHomePageInfo(@InterfaceC1501350pAj("pipo-fp-session-id") String str, @InterfaceC1501050pAF("priority_region") String str2, InterfaceC1364105Vn<? super C0X52<BaseResponse<HomepageInfoResponse>>> interfaceC1364105Vn);
}
