package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleProductModel implements Serializable {

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("description")
    public final String description;

    @C09CT("dynamic_cover")
    public final String dynamicCover;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("jump_data")
    public final AnoleJumpModel jumpData;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_title")
    public final String productTitle;

    @C09CT("video_data")
    public final AnoleVideoDataModel videoData;

    public final Integer getButtonType() {
        return this.buttonType;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDynamicCover() {
        return this.dynamicCover;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final AnoleJumpModel getJumpData() {
        return this.jumpData;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final AnoleVideoDataModel getVideoData() {
        return this.videoData;
    }

    public AnoleProductModel(String str, String str2, AnoleJumpModel anoleJumpModel, String str3, String str4, String str5, String str6, AnoleVideoDataModel anoleVideoDataModel, Integer num) {
        this.imageUrl = str;
        this.description = str2;
        this.jumpData = anoleJumpModel;
        this.productId = str3;
        this.productTitle = str4;
        this.dynamicCover = str5;
        this.itemId = str6;
        this.videoData = anoleVideoDataModel;
        this.buttonType = num;
    }
}
