package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC19483511Kn;
import X.C040I;
import X.C040J;
import X.C0X52;
import X.C11NZ;
import X.C1515820pY4;
import X.C311580CJg;
import X.InterfaceC1294060jmO;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC2174908fb;
import com.google.gson.k;

/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1294060jmO
public interface SettingApi {
    @InterfaceC1501200pAU("/common")
    AbstractC19483511Kn<C0X52<k>> queryABTestCommon(@InterfaceC1501120pAM("aid") String str, @InterfaceC1501120pAM("device_id") String str2, @InterfaceC1501120pAM("client_version") long j, @InterfaceC1501120pAM("new_cluster") int i, @InterfaceC1501120pAM("cpu_model") String str3, @InterfaceC1501120pAM("oid") int i2, @InterfaceC1501120pAM("meta_version") String str4, @InterfaceC1501120pAM("cdid") String str5, @InterfaceC1501120pAM("ab_extra_data") String str6, @InterfaceC1501120pAM("libra_function_flag") long j2, @InterfaceC1501120pAM("ab_extra_vids") String str7, @InterfaceC2174908fb int i3);

    @C040J
    @InterfaceC1501170pAR("/common_chunk")
    C11NZ<C1515820pY4<C311580CJg>> queryABTestCommonByChunk(@InterfaceC1501120pAM("aid") String str, @InterfaceC1501120pAM("device_id") String str2, @InterfaceC1501120pAM("client_version") long j, @InterfaceC1501120pAM("new_cluster") int i, @InterfaceC1501120pAM("cpu_model") String str3, @InterfaceC1501120pAM("oid") int i2, @InterfaceC1501120pAM("meta_version") String str4, @InterfaceC1501120pAM("cdid") String str5, @InterfaceC1501120pAM("ab_extra_data") String str6, @InterfaceC1501120pAM("libra_function_flag") long j2, @InterfaceC1501120pAM("ab_extra_vids") String str7, @C040I ABTestRequestBody aBTestRequestBody, @InterfaceC2174908fb int i3);

    @InterfaceC1501170pAR("/common")
    AbstractC19483511Kn<C0X52<k>> queryABTestCommonByGroup(@InterfaceC1501120pAM("aid") String str, @InterfaceC1501120pAM("device_id") String str2, @InterfaceC1501120pAM("client_version") long j, @InterfaceC1501120pAM("new_cluster") int i, @InterfaceC1501120pAM("cpu_model") String str3, @InterfaceC1501120pAM("oid") int i2, @InterfaceC1501120pAM("meta_version") String str4, @InterfaceC1501120pAM("cdid") String str5, @InterfaceC1501120pAM("ab_extra_data") String str6, @InterfaceC1501120pAM("libra_function_flag") long j2, @InterfaceC1501120pAM("ab_extra_vids") String str7, @C040I ABTestRequestBody aBTestRequestBody, @InterfaceC2174908fb int i3);
}
