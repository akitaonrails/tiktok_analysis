package com.bytedance.android.livesdk.revenue.level.impl.superfan.payment.api;

import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.scene.Scene;
import tikcast.api.fans.CreateSuperFanContractResult;
import tikcast.api.fans.GetFansBasicInfoReq;
import tikcast.api.fans.GetFansBasicInfoResp;
import tikcast.api.fans.GetNonFansUserDataResponse;
import tikcast.api.fans.GetSuperFansTreasureBoxDataRequest;
import tikcast.api.fans.GetSuperFansTreasureBoxDataResponse;
import tikcast.api.fans.PolingSuperFanContractStatusResult;
import tikcast.api.fans.SuperFanPurchaseRequest;
import tikcast.api.fans.SuperFanRecoverRequest;
import tikcast.api.fans.SuperFanRecoverResponse;

/* JADX INFO: loaded from: classes8.dex */
public interface IRevenueApi {
    @InterfaceC1501170pAR("/webcast/privilege/fans_get_basic_info/")
    C11NZ<C470590Icr<GetFansBasicInfoResp.Data>> getFansBasicInfo(@InterfaceC1485405rg GetFansBasicInfoReq getFansBasicInfoReq);

    @InterfaceC1501170pAR("/webcast/privilege/super_fan_treasure_box/")
    C11NZ<C470590Icr<GetSuperFansTreasureBoxDataResponse.Data>> getFansTreasureBox(@InterfaceC1485405rg GetSuperFansTreasureBoxDataRequest getSuperFansTreasureBoxDataRequest);

    @InterfaceC1501160pAQ("/webcast/privilege/non_fans_get_user_data/")
    C11NZ<C470590Icr<GetNonFansUserDataResponse.Data>> getFansUserData(@InterfaceC1501070pAH("anchor_id") String str, @InterfaceC1501070pAH("iap_country_code") String str2, @InterfaceC1501070pAH("req_source") int i, @InterfaceC1501070pAH("panel_exp_group") long j, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) int i2);

    @InterfaceC1501170pAR("/webcast/privilege/super_fan_purchase/")
    C11NZ<C470590Icr<CreateSuperFanContractResult>> purchaseFans(@InterfaceC1485405rg SuperFanPurchaseRequest superFanPurchaseRequest);

    @InterfaceC1501160pAQ("/webcast/privilege/super_fan_contract_status/")
    C11NZ<C470590Icr<PolingSuperFanContractStatusResult>> queryContractStatus(@InterfaceC1501070pAH("to_uid") String str, @InterfaceC1501070pAH("contract_id") String str2, @InterfaceC1501070pAH("polling_type") int i);

    @InterfaceC1501170pAR("/webcast/privilege/super_fan_recover/")
    C11NZ<C470590Icr<SuperFanRecoverResponse.RecoverContractInAppResult>> recoverFansSub(@InterfaceC1485405rg SuperFanRecoverRequest superFanRecoverRequest);
}
