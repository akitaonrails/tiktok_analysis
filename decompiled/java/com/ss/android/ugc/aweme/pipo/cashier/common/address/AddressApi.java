package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C0X52;
import X.C1505740pHo;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;

/* JADX INFO: loaded from: classes.dex */
public interface AddressApi {
    public static final C1505740pHo LIZ = C1505740pHo.LIZ;

    @InterfaceC1501160pAQ("/administrative/district")
    Object fetchDistrict(@InterfaceC1501070pAH("language") String str, @InterfaceC1501070pAH("key") String str2, @InterfaceC1501070pAH("subdistrict") String str3, @InterfaceC1501070pAH("geonameid") String str4, InterfaceC1364105Vn<? super C0X52<DistrictDTO>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/administrative/district")
    Object fetchDistricts(@InterfaceC1501070pAH("language") String str, @InterfaceC1501070pAH("key") String str2, InterfaceC1364105Vn<? super C0X52<DistrictsDTO>> interfaceC1364105Vn);
}
