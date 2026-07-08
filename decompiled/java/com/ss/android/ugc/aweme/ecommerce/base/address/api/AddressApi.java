package com.ss.android.ugc.aweme.ecommerce.base.address.api;

import X.C040F;
import X.C040I;
import X.C0X52;
import X.C11NZ;
import X.C980703sT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501240pAY;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.BuyerHasAddressResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandDetailPlaceResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClaimIncentiveWithAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeleteRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetPudoAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.GetShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.PudoAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressMapResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressPromotionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ShippingAddressPromotionResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShippingAddressSelectResponse;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface AddressApi {
    public static final C980703sT LIZ = C980703sT.LIZ;

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/get")
    C11NZ<C0X52<Response<AddressListData>>> ft();

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/input_item")
    Object getInputItems(@C040I InputItemRequest inputItemRequest, @C040F HashMap<String, String> map, InterfaceC1364105Vn<? super Response<InputItemData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/get_detail_place")
    Object gt(@C040I CandDetailPlaceRequest candDetailPlaceRequest, InterfaceC1364105Vn<? super Response<CandDetailPlaceResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/save")
    Object ht(@C040I SaveRequest saveRequest, InterfaceC1364105Vn<? super Response<SaveData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/buyer/has_address")
    C11NZ<C0X52<Response<BuyerHasAddressResponse>>> jt();

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/delete")
    Object kt(@C040I DeleteRequest deleteRequest, InterfaceC1364105Vn<? super Response<Object>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/logistics/get_pudo_address")
    Object lt(@C040I GetPudoAddressRequest getPudoAddressRequest, InterfaceC1364105Vn<? super Response<PudoAddressData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/claim_incentive")
    C11NZ<C0X52<Response<ClaimIncentiveWithAddressResponseData>>> mt(@C040I ClaimIncentiveWithAddressRequest claimIncentiveWithAddressRequest);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/change_on_order")
    Object nt(@C040I ChangeOrderShippingAddressRequest changeOrderShippingAddressRequest, InterfaceC1364105Vn<? super Response<ChangeOrderShippingAddressResponseData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/get")
    C11NZ<C0X52<Response<AddressListData>>> ot(@C040I GetShippingAddressRequest getShippingAddressRequest);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/get_shipping_address_candidate_input")
    Object pt(@C040I CandInputRequest candInputRequest, InterfaceC1364105Vn<? super Response<CandInputDataOptions>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/promotion")
    Object qt(@C040I ShippingAddressPromotionRequest shippingAddressPromotionRequest, InterfaceC1364105Vn<? super Response<ShippingAddressPromotionResponse>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/shop/shipping_address/select")
    Object rt(@C040I ShippingAddressSelectRequest shippingAddressSelectRequest, InterfaceC1364105Vn<? super ShippingAddressSelectResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("api/v1/shop/shipping_address/map")
    Object st(@C040I ShippingAddressMapRequest shippingAddressMapRequest, InterfaceC1364105Vn<? super Response<ShippingAddressMapResponseData>> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/api/v1/shop/shipping_address/check")
    Object tt(@C040I CheckShippingAddressRequest checkShippingAddressRequest, InterfaceC1364105Vn<? super Response<CheckShippingAddressData>> interfaceC1364105Vn);
}
