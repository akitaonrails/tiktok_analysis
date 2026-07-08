package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SelectRegionDTO {

    @C09CT("districts")
    public final List<Region> districts;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    public SelectRegionDTO(List<Region> list, String str, Integer num) {
        this.districts = list;
        this.enterMethod = str;
        this.status = num;
    }
}
