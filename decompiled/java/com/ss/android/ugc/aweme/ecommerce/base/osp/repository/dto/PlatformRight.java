package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PlatformRight {

    @C09CT("carousel_show_period")
    public Integer carouselShowPeriod;

    @C09CT("carousel_stay_time")
    public Integer carouselStayTime;

    @C09CT("first_carousel_show_period")
    public Integer firstCarouselShowPeriod;

    @C09CT("right_details")
    public List<UserRightDetail> rightDetails;

    public PlatformRight() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformRight)) {
            return false;
        }
        PlatformRight platformRight = (PlatformRight) obj;
        return Intrinsics.LJFF(this.rightDetails, platformRight.rightDetails) && Intrinsics.LJFF(this.carouselShowPeriod, platformRight.carouselShowPeriod) && Intrinsics.LJFF(this.firstCarouselShowPeriod, platformRight.firstCarouselShowPeriod) && Intrinsics.LJFF(this.carouselStayTime, platformRight.carouselStayTime);
    }

    public PlatformRight(List<UserRightDetail> list, Integer num, Integer num2, Integer num3) {
        this.rightDetails = list;
        this.carouselShowPeriod = num;
        this.firstCarouselShowPeriod = num2;
        this.carouselStayTime = num3;
    }
}
