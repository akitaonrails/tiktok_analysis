package com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.api;

import X.C0X52;
import X.C2284708xJ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.ug.outofapp.seo.bean.EcUgRedirectSchemaResponse;

/* JADX INFO: loaded from: classes4.dex */
public interface RedirectSchemaApi {
    public static final C2284708xJ LIZ = C2284708xJ.LIZ;

    @InterfaceC1501160pAQ("/api/v1/seo/redirect_schema")
    Object redirectSchema(@InterfaceC1501070pAH("url") String str, @InterfaceC1501070pAH("mall_position") Integer num, @InterfaceC1501070pAH("url_type") Integer num2, InterfaceC1364105Vn<? super C0X52<Response<EcUgRedirectSchemaResponse>>> interfaceC1364105Vn);
}
