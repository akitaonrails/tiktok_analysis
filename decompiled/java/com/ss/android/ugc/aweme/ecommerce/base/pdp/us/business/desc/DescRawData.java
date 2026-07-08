package com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.desc;

import X.C09CT;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class DescRawData {

    @C09CT("additional_info")
    public final List<AdditionInfo> additionInfo;

    @C09CT("desc_detail_v_2")
    public final DescDetailV2 descDetailv2;

    @C09CT("desc_detail_v_3")
    public final DescDetailV3 descDetailv3;

    @C09CT("desc_detail")
    public final String details;

    @C09CT("desc_video")
    public final Video video;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescRawData)) {
            return false;
        }
        DescRawData descRawData = (DescRawData) obj;
        return Intrinsics.LJFF(this.details, descRawData.details) && Intrinsics.LJFF(this.video, descRawData.video) && Intrinsics.LJFF(this.additionInfo, descRawData.additionInfo) && Intrinsics.LJFF(this.descDetailv2, descRawData.descDetailv2) && Intrinsics.LJFF(this.descDetailv3, descRawData.descDetailv3);
    }

    public final int hashCode() {
        String str = this.details;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Video video = this.video;
        int iHashCode2 = (iHashCode + (video == null ? 0 : video.hashCode())) * 31;
        List<AdditionInfo> list = this.additionInfo;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        DescDetailV2 descDetailV2 = this.descDetailv2;
        int iHashCode4 = (iHashCode3 + (descDetailV2 == null ? 0 : descDetailV2.hashCode())) * 31;
        DescDetailV3 descDetailV3 = this.descDetailv3;
        return iHashCode4 + (descDetailV3 != null ? descDetailV3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescRawData(details=");
        sbLIZ.append(this.details);
        sbLIZ.append(", video=");
        sbLIZ.append(this.video);
        sbLIZ.append(", additionInfo=");
        sbLIZ.append(this.additionInfo);
        sbLIZ.append(", descDetailv2=");
        sbLIZ.append(this.descDetailv2);
        sbLIZ.append(", descDetailv3=");
        sbLIZ.append(this.descDetailv3);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DescRawData(String str, Video video, List<AdditionInfo> list, DescDetailV2 descDetailV2, DescDetailV3 descDetailV3) {
        this.details = str;
        this.video = video;
        this.additionInfo = list;
        this.descDetailv2 = descDetailV2;
        this.descDetailv3 = descDetailV3;
    }
}
