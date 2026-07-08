package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.module.desc;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DescDetailV3;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class SeaDescRawData {

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

    public SeaDescRawData(String str, Video video, List<AdditionInfo> list, DescDetailV2 descDetailV2, DescDetailV3 descDetailV3) {
        this.details = str;
        this.video = video;
        this.additionInfo = list;
        this.descDetailv2 = descDetailV2;
        this.descDetailv3 = descDetailV3;
    }
}
