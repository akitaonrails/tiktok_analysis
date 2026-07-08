package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class BannerData implements Serializable {

    @C09CT("banner_frame_list")
    public final List<BannerFrame> bannerFrameList;

    @C09CT("interval_millis")
    public final Integer intervalMillis;

    public BannerData() {
        this(null, 0);
    }

    public BannerData(List<BannerFrame> list, Integer num) {
        this.bannerFrameList = list;
        this.intervalMillis = num;
    }
}
