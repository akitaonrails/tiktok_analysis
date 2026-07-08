package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictDTO implements Serializable {

    @C09CT("district")
    public final Region district;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public DistrictDTO(Region region, String str) {
        this.district = region;
        this.status = str;
    }
}
