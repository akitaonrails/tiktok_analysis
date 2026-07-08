package com.ss.android.ugc.aweme.ad.feed.model;

import X.C09CT;

/* JADX INFO: loaded from: classes34.dex */
public final class AppAdsDetectAppModel {

    @C09CT("detect_status_bitmap_part1")
    public final Long detectStatusPart1;

    @C09CT("detect_status_bitmap_part2")
    public final Long detectStatusPart2;

    @C09CT("install_status_bitmap_part1")
    public final Long installStatusPart1;

    @C09CT("install_status_bitmap_part2")
    public final Long installStatusPart2;

    @C09CT("time_stamp")
    public final Long timeStamp;

    @C09CT("version")
    public final Long version;

    public AppAdsDetectAppModel(Long l, Long l2, Long l3, Long l4, Long l5, Long l6) {
        this.version = l;
        this.installStatusPart1 = l2;
        this.installStatusPart2 = l3;
        this.detectStatusPart1 = l4;
        this.detectStatusPart2 = l5;
        this.timeStamp = l6;
    }
}
