package com.bytedance.globalpayment.iap.common.ability.api;

import X.C11NZ;
import X.C1792570wkR;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.activecontract.MoneyV1ActiveContractResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku.MoneyV1NextAvailableSKUsRequest;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku.MoneyV1NextAvailableSKUsResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder.IapV1PayRequest;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.createpayorder.IapV1PayResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.storesubs.IAPStoreSubRequest;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.storesubs.IAPStoreSubResponse;

/* JADX INFO: loaded from: classes28.dex */
public interface IapFlowApi {
    @InterfaceC1501160pAQ("/money/v1/contract/active_contract/")
    C11NZ<C1792570wkR<MoneyV1ActiveContractResponse>> checkContractStatus(@InterfaceC1501070pAH("mid") String str, @InterfaceC1501070pAH("from_user_id") long j, @InterfaceC1501070pAH("sub_merchant_id") String str2, @InterfaceC1501070pAH("to_user_id") long j2);

    @InterfaceC1501170pAR("/money/iap/v1/store_sub_purchases/")
    C11NZ<C1792570wkR<IAPStoreSubResponse>> checkStoreSubStatus(@InterfaceC1485405rg IAPStoreSubRequest iAPStoreSubRequest);

    @InterfaceC1501170pAR("/money/v1/iap/pay")
    C11NZ<C1792570wkR<IapV1PayResponse>> createPayOrder(@InterfaceC1485405rg IapV1PayRequest iapV1PayRequest);

    @InterfaceC1501170pAR("/money/v1/contract/next_available_skus/")
    C11NZ<C1792570wkR<MoneyV1NextAvailableSKUsResponse>> getNextAvailableSKUs(@InterfaceC1485405rg MoneyV1NextAvailableSKUsRequest moneyV1NextAvailableSKUsRequest);
}
