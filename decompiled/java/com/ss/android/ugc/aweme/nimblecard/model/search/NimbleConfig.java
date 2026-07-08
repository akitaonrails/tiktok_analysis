package com.ss.android.ugc.aweme.nimblecard.model.search;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class NimbleConfig {

    @C09CT("aggregatable")
    public final Boolean aggregatable;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("disable_photo_detail")
    public final Boolean disablePhotoDetail;

    @C09CT("font_class_name")
    public final String fontClassName;

    @C09CT("font_weight_name")
    public final String fontWeightName;

    @C09CT("height_limit")
    public final Float heightLimit;

    @C09CT("line_limit")
    public final Integer lineLimit;

    @C09CT("markdown_truncation_token")
    public final String markdownTruncationToken;

    @C09CT("max_photo_column")
    public final Integer maxPhotoColumn;

    @C09CT("max_photo_row")
    public final Integer maxPhotoRow;

    @C09CT("photo_size_ratio")
    public final Float photoSizeRatio;

    @C09CT("pressable")
    public final Boolean pressable;

    @C09CT("radius")
    public final List<Float> radius;

    @C09CT("text_color")
    public final String textColor;

    @C09CT("video_desc")
    public final String videoDesc;

    @C09CT("video_play_icon")
    public final Boolean videoPlayIcon;

    @C09CT("video_size_ratio")
    public final Float videoSizeRatio;

    @C09CT("video_tag")
    public final NimbleVideoTag videoTag;

    public NimbleConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        List<Float> list = this.radius;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.pressable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.heightLimit;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.textColor;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.lineLimit;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.fontClassName;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fontWeightName;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.markdownTruncationToken;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        NimbleVideoTag nimbleVideoTag = this.videoTag;
        int iHashCode10 = (iHashCode9 + (nimbleVideoTag == null ? 0 : nimbleVideoTag.hashCode())) * 31;
        String str6 = this.videoDesc;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f2 = this.videoSizeRatio;
        int iHashCode12 = (iHashCode11 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Boolean bool2 = this.videoPlayIcon;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.maxPhotoRow;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxPhotoColumn;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f3 = this.photoSizeRatio;
        int iHashCode16 = (iHashCode15 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Boolean bool3 = this.disablePhotoDetail;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.aggregatable;
        return iHashCode17 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final String toString() {
        return "NimbleConfig(radius=" + this.radius + ", backgroundColor=" + this.backgroundColor + ", pressable=" + this.pressable + ", heightLimit=" + this.heightLimit + ", textColor=" + this.textColor + ", lineLimit=" + this.lineLimit + ", fontClassName=" + this.fontClassName + ", fontWeightName=" + this.fontWeightName + ", markdownTruncationToken=" + this.markdownTruncationToken + ", videoTag=" + this.videoTag + ", videoDesc=" + this.videoDesc + ", videoSizeRatio=" + this.videoSizeRatio + ", videoPlayIcon=" + this.videoPlayIcon + ", maxPhotoRow=" + this.maxPhotoRow + ", maxPhotoColumn=" + this.maxPhotoColumn + ", photoSizeRatio=" + this.photoSizeRatio + ", disablePhotoDetail=" + this.disablePhotoDetail + ", aggregatable=" + this.aggregatable + ')';
    }

    public NimbleConfig(List<Float> list, String str, Boolean bool, Float f, String str2, Integer num, String str3, String str4, String str5, NimbleVideoTag nimbleVideoTag, String str6, Float f2, Boolean bool2, Integer num2, Integer num3, Float f3, Boolean bool3, Boolean bool4) {
        this.radius = list;
        this.backgroundColor = str;
        this.pressable = bool;
        this.heightLimit = f;
        this.textColor = str2;
        this.lineLimit = num;
        this.fontClassName = str3;
        this.fontWeightName = str4;
        this.markdownTruncationToken = str5;
        this.videoTag = nimbleVideoTag;
        this.videoDesc = str6;
        this.videoSizeRatio = f2;
        this.videoPlayIcon = bool2;
        this.maxPhotoRow = num2;
        this.maxPhotoColumn = num3;
        this.photoSizeRatio = f3;
        this.disablePhotoDetail = bool3;
        this.aggregatable = bool4;
    }
}
