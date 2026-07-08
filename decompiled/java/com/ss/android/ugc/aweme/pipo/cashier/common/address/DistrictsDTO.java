package com.ss.android.ugc.aweme.pipo.cashier.common.address;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class DistrictsDTO {

    @C09CT("district")
    public final List<Region> districts;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final String status;

    public DistrictsDTO(List<Region> list, String str) {
        this.districts = list;
        this.status = str;
    }
}
