package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class BannerFrame implements Serializable {

    @C09CT("banner_type")
    public final Integer bannerType;

    @C09CT("dark_image")
    public final Image darkImage;

    @C09CT("extra")
    public final String extra;

    @C09CT("image")
    public final Image image;

    @C09CT("schema")
    public final String schema;

    public BannerFrame(Image image, Image image2, String str, String str2, Integer num) {
        this.image = image;
        this.darkImage = image2;
        this.schema = str;
        this.extra = str2;
        this.bannerType = num;
    }
}
