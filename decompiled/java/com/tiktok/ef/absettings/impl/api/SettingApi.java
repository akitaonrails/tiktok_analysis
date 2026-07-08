package com.tiktok.ef.absettings.impl.api;

import X.AbstractC19483511Kn;
import X.C0X52;
import X.InterfaceC1485405rg;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC2174908fb;
import com.google.gson.k;

/* JADX INFO: loaded from: classes5.dex */
public interface SettingApi {
    @InterfaceC1501160pAQ("/common")
    AbstractC19483511Kn<C0X52<k>> queryABTestCommon(@InterfaceC1501070pAH("aid") String str, @InterfaceC1501070pAH("device_id") String str2, @InterfaceC1501070pAH("client_version") long j, @InterfaceC1501070pAH("new_cluster") int i, @InterfaceC1501070pAH("cpu_model") String str3, @InterfaceC1501070pAH("oid") int i2, @InterfaceC1501070pAH("meta_version") String str4, @InterfaceC1501070pAH("cdid") String str5, @InterfaceC1501070pAH("ab_extra_data") String str6, @InterfaceC1501070pAH("libra_function_flag") long j2, @InterfaceC1501070pAH("ab_extra_vids") String str7, @InterfaceC2174908fb int i3);

    @InterfaceC1501170pAR("/common")
    AbstractC19483511Kn<C0X52<k>> queryABTestCommonByGroup(@InterfaceC1501070pAH("aid") String str, @InterfaceC1501070pAH("device_id") String str2, @InterfaceC1501070pAH("client_version") long j, @InterfaceC1501070pAH("new_cluster") int i, @InterfaceC1501070pAH("cpu_model") String str3, @InterfaceC1501070pAH("oid") int i2, @InterfaceC1501070pAH("meta_version") String str4, @InterfaceC1501070pAH("cdid") String str5, @InterfaceC1501070pAH("ab_extra_data") String str6, @InterfaceC1501070pAH("libra_function_flag") long j2, @InterfaceC1501070pAH("ab_extra_vids") String str7, @InterfaceC1485405rg ABTestRequestBody aBTestRequestBody, @InterfaceC2174908fb int i3);
}
