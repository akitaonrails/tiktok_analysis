package com.ss.android.ugc.aweme.ecommerce.base.delivery.event;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ZipcodeLocateAddress {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("error")
    public final String error;

    @C09CT("isCheck")
    public final Boolean isCheck;

    @C09CT("location")
    public final ChangeLocationData location;

    @C09CT("regions")
    public final List<Region> regions;

    @C09CT("type")
    public final Integer type;

    @C09CT("zipCode")
    public final String zipcode;

    public ZipcodeLocateAddress() {
        this(-1, null, null, null, null, null);
    }

    public ZipcodeLocateAddress(Integer num, String str, ChangeLocationData changeLocationData, List<Region> list, String str2, Boolean bool) {
        this.type = num;
        this.error = str;
        this.location = changeLocationData;
        this.regions = list;
        this.zipcode = str2;
        this.isCheck = bool;
    }
}
