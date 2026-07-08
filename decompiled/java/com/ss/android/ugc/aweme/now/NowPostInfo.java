package com.ss.android.ugc.aweme.now;

import X.C09CT;
import X.C587802Qy;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class NowPostInfo implements Serializable {
    public static final C587802Qy Companion = new Object() { // from class: X.02Qy
    };

    @C09CT("attributes")
    public NowPostAttributes attributes;
    public transient Bitmap backBitmap;

    @C09CT("back_image")
    public UrlModel backImage;

    @C09CT("back_image_thumbnail")
    public UrlModel backImageThumbnail;

    @C09CT("background_music")
    public Music backgroundMusic;

    @C09CT("composite_image_ltr")
    public UrlModel compositeImageLTR;

    @C09CT("composite_image_ltr_without_watermark")
    public UrlModel compositeImageLtrWithoutWatermark;

    @C09CT("composite_image_rtl")
    public UrlModel compositeImageRTL;

    @C09CT("composite_image_rtl_without_watermark")
    public UrlModel compositeImageRtlWithoutWatermark;

    @C09CT("create_time_in_author_timezone")
    public String createTimeInAuthorTimeZone;
    public transient Bitmap frontBitmap;

    @C09CT("front_image")
    public UrlModel frontImage;

    @C09CT("front_image_thumbnail")
    public UrlModel frontImageThumbnail;

    @C09CT("fuzzy_front_image_thumbnail")
    public UrlModel fuzzyFrontImageThumbnail;

    @C09CT("fuzzy_front_image_thumbnail_with_logo")
    public UrlModel fuzzyFrontImageThumbnailWithLogo;

    @C09CT("fuzzy_image")
    public UrlModel fuzzyImage;

    @C09CT("fuzzy_image_rtl_with_watermark")
    public UrlModel fuzzyImageRtlWithWatermark;

    @C09CT("fuzzy_image_with_watermark")
    public UrlModel fuzzyImageWithWatermark;

    @C09CT("has_now_collection")
    public boolean hasNowCollection;

    @C09CT("image_for_dm_share_ltr")
    public UrlModel imageForDmShareLtr;

    @C09CT("image_for_dm_share_rtl")
    public UrlModel imageForDmShareRtl;

    @C09CT("incompatibility_info")
    public NowIncompatibilityInfo incompatibilityInfo;

    @C09CT("last_pushed_at_sec")
    public Long lastPushedAtSec;

    @C09CT("now_interaction_control")
    public NowInteractionControl nowInteractionControl;

    @C09CT("now_media_type")
    public String nowMediaType;

    @C09CT("consumption_info")
    public NowPostConsumptionInfo nowPostConsumptionInfo;

    @C09CT("now_post_source")
    public int nowPostSource;

    @C09CT("now_status")
    public Integer nowStatus;

    @C09CT("view_state")
    public int nowViewState;

    @C09CT("watermark_image_ltr")
    public UrlModel watermarkImageLTR;

    @C09CT("watermark_image_rtl")
    public UrlModel watermarkImageRTL;

    public NowPostInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, false, null, null, null, null);
    }

    public final int getPrivateStatus() {
        Integer num = this.nowStatus;
        return (num == null || num.intValue() != 0) ? 0 : 2;
    }

    public NowPostInfo(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, UrlModel urlModel8, UrlModel urlModel9, UrlModel urlModel10, UrlModel urlModel11, UrlModel urlModel12, UrlModel urlModel13, UrlModel urlModel14, UrlModel urlModel15, UrlModel urlModel16, UrlModel urlModel17, Long l, NowIncompatibilityInfo nowIncompatibilityInfo, String str, Integer num, String str2, NowInteractionControl nowInteractionControl, int i, int i2, Music music, boolean z, NowPostConsumptionInfo nowPostConsumptionInfo, NowPostAttributes nowPostAttributes, Bitmap bitmap, Bitmap bitmap2) {
        this.backImage = urlModel;
        this.backImageThumbnail = urlModel2;
        this.frontImage = urlModel3;
        this.frontImageThumbnail = urlModel4;
        this.fuzzyFrontImageThumbnail = urlModel5;
        this.fuzzyFrontImageThumbnailWithLogo = urlModel6;
        this.fuzzyImageWithWatermark = urlModel7;
        this.fuzzyImageRtlWithWatermark = urlModel8;
        this.imageForDmShareLtr = urlModel9;
        this.imageForDmShareRtl = urlModel10;
        this.watermarkImageLTR = urlModel11;
        this.watermarkImageRTL = urlModel12;
        this.compositeImageLtrWithoutWatermark = urlModel13;
        this.compositeImageRtlWithoutWatermark = urlModel14;
        this.fuzzyImage = urlModel15;
        this.compositeImageLTR = urlModel16;
        this.compositeImageRTL = urlModel17;
        this.lastPushedAtSec = l;
        this.incompatibilityInfo = nowIncompatibilityInfo;
        this.nowMediaType = str;
        this.nowStatus = num;
        this.createTimeInAuthorTimeZone = str2;
        this.nowInteractionControl = nowInteractionControl;
        this.nowPostSource = i;
        this.nowViewState = i2;
        this.backgroundMusic = music;
        this.hasNowCollection = z;
        this.nowPostConsumptionInfo = nowPostConsumptionInfo;
        this.attributes = nowPostAttributes;
        this.frontBitmap = bitmap;
        this.backBitmap = bitmap2;
    }
}
