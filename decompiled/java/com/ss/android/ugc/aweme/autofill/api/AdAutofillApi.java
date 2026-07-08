package com.ss.android.ugc.aweme.autofill.api;

import X.AbstractC842530X3j;
import X.C040I;
import X.C0X52;
import X.C0X9S;
import X.C1068770dv1;
import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501330pAh;
import X.InterfaceC1501350pAj;
import X.InterfaceC2174708fZ;
import X.InterfaceC2175608fi;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public interface AdAutofillApi {
    public static final C1068770dv1 LIZ = C1068770dv1.LIZ;

    @InterfaceC1501160pAQ("/tiktok/service/plugin/autofill/get_fields/")
    C11NZ<AdAutofillGetResponse> get(@InterfaceC1501070pAH("sources") String str, @InterfaceC1501070pAH("source_url") String str2, @InterfaceC1501070pAH("enable_autofill_datasource_supplement") Integer num, @InterfaceC1501070pAH("scenario") Integer num2);

    @InterfaceC1501170pAR("/monetization/v1/get_card_number")
    C11NZ<AdAutofillPipoResponse> getCardNumber(@InterfaceC1501350pAj("x-ttnet-isolation-info") String str, @InterfaceC1501350pAj("x-ttnet-cert-id") String str2, @InterfaceC1501350pAj("Content-Type") String str3, @C040I AbstractC842530X3j abstractC842530X3j);

    @InterfaceC1501160pAQ
    C0X9S<String> getCert(@InterfaceC2174708fZ String str, @InterfaceC2175608fi Map<String, String> map);

    @InterfaceC1501160pAQ("/aweme/v1/ad/pipo/client/domain/query")
    C11NZ<PipoDomainQueryResponse> getPipoDomainQuery();

    @InterfaceC1501160pAQ("/tiktok/service/plugin/v2/autofill/get_fields/")
    C11NZ<AdAutofillGetResponse> getV2(@InterfaceC1501070pAH("sources") String str, @InterfaceC1501070pAH("source_url") String str2, @InterfaceC1501070pAH("enable_autofill_datasource_supplement") Integer num, @InterfaceC1501070pAH("scenario") Integer num2);

    @InterfaceC1501170pAR("/monetization/v1/get_valid_pi_list")
    C11NZ<C0X52<AdAutofillPipoResponse>> getValidPiList(@InterfaceC1501350pAj("x-ttnet-isolation-info") String str, @InterfaceC1501350pAj("x-ttnet-cert-id") String str2, @InterfaceC1501350pAj("Content-Type") String str3, @C040I AbstractC842530X3j abstractC842530X3j);

    @InterfaceC1501330pAh({"Content-Type: application/json"})
    @InterfaceC1501170pAR("/tiktok/service/plugin/autofill/set_fields/")
    C11NZ<BaseResponse> set(@C040I n nVar);
}
