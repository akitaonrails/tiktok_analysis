package com.ss.android.ugc.aweme.resource;

import X.C11NZ;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes23.dex */
public interface TemplateApi {
    @InterfaceC1501160pAQ("/material_cloud/api/v1/public/api/get_template_detail")
    C11NZ<MergedTemplateListResponseWrapper> requestMergedTemplateDetail(@InterfaceC1501070pAH("template_id") String str, @InterfaceC1501070pAH("template_type") int i, @InterfaceC1501070pAH("effect_sdk_version") String str2, @InterfaceC1501070pAH("nle_sdk_version") String str3, @InterfaceC1501070pAH("protocol_version") String str4, @InterfaceC1501070pAH("feature_codes") String str5, @InterfaceC1501070pAH("operating_system") String str6, @InterfaceC1501070pAH("app_version") String str7, @InterfaceC1501070pAH("effect_platform_sdk_version") String str8, @InterfaceC1501130pAN HashMap<String, String> map);

    @InterfaceC1501160pAQ("/material_cloud/api/v1/public/api/get_template_list")
    C11NZ<MergedTemplateListResponseWrapper> requestMergedTemplateList(@InterfaceC1501070pAH("effect_sdk_version") String str, @InterfaceC1501070pAH("nle_sdk_version") String str2, @InterfaceC1501070pAH("protocol_version") String str3, @InterfaceC1501070pAH("feature_codes") String str4, @InterfaceC1501070pAH("perpage") int i, @InterfaceC1501070pAH("operating_system") String str5, @InterfaceC1501070pAH("app_version") String str6, @InterfaceC1501070pAH("effect_platform_sdk_version") String str7, @InterfaceC1501070pAH("content_filter") int i2, @InterfaceC1501130pAN HashMap<String, String> map);

    @InterfaceC1501160pAQ("templates/item")
    C11NZ<CategoryResp> requestTemplateDetail(@InterfaceC1501070pAH("template_id") String str, @InterfaceC1501070pAH("feature_list") String str2, @InterfaceC1501070pAH("feature_codes") String str3, @InterfaceC1501070pAH("protocol_version") String str4, @InterfaceC1501070pAH("type") int i, @InterfaceC1501070pAH("access_key") String str5, @InterfaceC1501070pAH("aid") String str6, @InterfaceC1501070pAH("app_version") String str7, @InterfaceC1501070pAH("sdk_version") String str8, @InterfaceC1501070pAH("os_version") String str9, @InterfaceC1501070pAH("region_key") String str10, @InterfaceC1501070pAH("device_id") String str11, @InterfaceC1501070pAH("device_platform") String str12, @InterfaceC1501070pAH("device_type") String str13, @InterfaceC1501070pAH("filter_type") String str14, @InterfaceC1501130pAN HashMap<String, String> map, @InterfaceC1501070pAH("req_from") String str15);
}
