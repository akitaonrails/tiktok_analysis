package com.ss.android.ugc.aweme.im.strategy.commonresource;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class LightInteractionGiphyMessage {

    @C09CT("a_src")
    public final String aSrc;

    @C09CT("awe_type")
    public final Integer aweType;

    @C09CT("display_name")
    public final String displayName;

    @C09CT("height")
    public final Integer height;

    @C09CT("image_id")
    public final String imageId;

    @C09CT("image_type")
    public final String imageType;

    @C09CT("package_id")
    public final String packageId;

    @C09CT("static_url")
    public final String staticUrl;

    @C09CT("sticker_id")
    public final String stickerId;

    @C09CT("url")
    public final String url;

    @C09CT("version")
    public final String version;

    @C09CT("width")
    public final Integer width;

    public LightInteractionGiphyMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final int hashCode() {
        Integer num = this.width;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.height;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.url;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.staticUrl;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.aweType;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.imageType;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayName;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.stickerId;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.packageId;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.version;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.aSrc;
        return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
    }

    public LightInteractionGiphyMessage(Integer num, Integer num2, String str, String str2, Integer num3, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.width = num;
        this.height = num2;
        this.url = str;
        this.staticUrl = str2;
        this.aweType = num3;
        this.imageType = str3;
        this.displayName = str4;
        this.imageId = str5;
        this.stickerId = str6;
        this.packageId = str7;
        this.version = str8;
        this.aSrc = str9;
    }
}
