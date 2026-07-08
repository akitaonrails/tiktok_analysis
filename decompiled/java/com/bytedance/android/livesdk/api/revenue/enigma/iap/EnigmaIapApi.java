package com.bytedance.android.livesdk.api.revenue.enigma.iap;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaIAPPurchaseResponse;
import tikcast.api.privilege.enigma.EnigmaIAPReceiptRequest;
import tikcast.api.privilege.enigma.EnigmaIAPReceiptResponse;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;
import tikcast.api.privilege.enigma.EnigmaUserDetailsResponse;

/* JADX INFO: loaded from: classes.dex */
public interface EnigmaIapApi {
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/privilege/enigma/iap_purchase/")
    C11NZ<C470590Icr<EnigmaIAPPurchaseResponse.Data>> createIapPurchase(@InterfaceC1485405rg EnigmaIAPPurchaseRequest enigmaIAPPurchaseRequest);

    @InterfaceC1501160pAQ("/webcast/privilege/enigma/products/")
    @C09SO(EnumC1846380y9E.GIFT)
    C11NZ<C470590Icr<EnigmaProductsResponse.Data>> getProductDetails(@InterfaceC1501070pAH("iap_channel") String str, @InterfaceC1501070pAH("app_store_region") String str2);

    @InterfaceC1501160pAQ("/webcast/privilege/enigma/user_details/")
    @C09SO(EnumC1846380y9E.GIFT)
    C11NZ<C470590Icr<EnigmaUserDetailsResponse.Data>> getUserDetails();

    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/privilege/enigma/iap_receipt/")
    C11NZ<C470590Icr<EnigmaIAPReceiptResponse.Data>> uploadIapReceipt(@InterfaceC1485405rg EnigmaIAPReceiptRequest enigmaIAPReceiptRequest);
}
