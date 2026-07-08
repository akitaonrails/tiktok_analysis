package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class BannerCommonStruct implements Serializable {

    @C09CT("key")
    public BannerCommonKey bannerKey;

    @C09CT("standard_ui")
    public BannerCommonUIStruct bannerUIStruct;

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("tracer_info")
    public BannerTracerInfoStruct tracerInfo;

    public BannerCommonStruct() {
        this(new BannerCommonKey("", ""), new BannerCommonUIStruct(null, null, null), "", new BannerTracerInfoStruct(null));
    }

    public final BannerCommonStruct copy(BannerCommonKey bannerCommonKey, BannerCommonUIStruct bannerCommonUIStruct, String str, BannerTracerInfoStruct bannerTracerInfoStruct) {
        return new BannerCommonStruct(bannerCommonKey, bannerCommonUIStruct, str, bannerTracerInfoStruct);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerCommonStruct)) {
            return false;
        }
        BannerCommonStruct bannerCommonStruct = (BannerCommonStruct) obj;
        return Intrinsics.LJFF(this.bannerKey, bannerCommonStruct.bannerKey) && Intrinsics.LJFF(this.bannerUIStruct, bannerCommonStruct.bannerUIStruct) && Intrinsics.LJFF(this.customizedInfo, bannerCommonStruct.customizedInfo) && Intrinsics.LJFF(this.tracerInfo, bannerCommonStruct.tracerInfo);
    }

    public final void setBannerUIStruct(BannerCommonUIStruct bannerCommonUIStruct) {
        this.bannerUIStruct = bannerCommonUIStruct;
    }

    public BannerCommonStruct(BannerCommonKey bannerCommonKey, BannerCommonUIStruct bannerCommonUIStruct, String str, BannerTracerInfoStruct bannerTracerInfoStruct) {
        this.bannerKey = bannerCommonKey;
        this.bannerUIStruct = bannerCommonUIStruct;
        this.customizedInfo = str;
        this.tracerInfo = bannerTracerInfoStruct;
    }
}
