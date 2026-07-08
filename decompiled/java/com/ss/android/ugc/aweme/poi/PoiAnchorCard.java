package com.ss.android.ugc.aweme.poi;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiAnchorCard implements Serializable {

    @C09CT("animation_duration")
    public final Integer animationDuration;

    @C09CT("animation_type")
    public final Integer animationType;

    @C09CT("background_color")
    public final String backgroundColor;

    @C09CT("button")
    public final PoiAnchorCardButton button;

    @C09CT("city_or_district_name")
    public final String cityOrDistrictName;

    @C09CT("discount")
    public final String discount;

    @C09CT("distance")
    public final String distance;

    @C09CT("extra")
    public final String extra;

    @C09CT("lynx_schema")
    public final String lynxSchema;

    @C09CT("offer_price")
    public final String offerPrice;

    @C09CT("poi_img_url")
    public final String poiImageUrl;

    @C09CT("poi_name")
    public final String poiName;

    @C09CT("second_line")
    public final PoiAnchorCardSecondLine secondLine;

    @C09CT("second_line_carousel")
    public final List<PoiAnchorCardSecondLineCarousel> secondLineCarousel;

    public PoiAnchorCard() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        String str = this.lynxSchema;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.poiImageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.poiName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.distance;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PoiAnchorCardSecondLine poiAnchorCardSecondLine = this.secondLine;
        int iHashCode5 = (iHashCode4 + (poiAnchorCardSecondLine == null ? 0 : poiAnchorCardSecondLine.hashCode())) * 31;
        String str5 = this.offerPrice;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.discount;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.extra;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<PoiAnchorCardSecondLineCarousel> list = this.secondLineCarousel;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        PoiAnchorCardButton poiAnchorCardButton = this.button;
        int iHashCode10 = (iHashCode9 + (poiAnchorCardButton == null ? 0 : poiAnchorCardButton.hashCode())) * 31;
        String str8 = this.backgroundColor;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.animationType;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.animationDuration;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str9 = this.cityOrDistrictName;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public PoiAnchorCard(String str, String str2, String str3, String str4, PoiAnchorCardSecondLine poiAnchorCardSecondLine, String str5, String str6, String str7, List<PoiAnchorCardSecondLineCarousel> list, PoiAnchorCardButton poiAnchorCardButton, String str8, Integer num, Integer num2, String str9) {
        this.lynxSchema = str;
        this.poiImageUrl = str2;
        this.poiName = str3;
        this.distance = str4;
        this.secondLine = poiAnchorCardSecondLine;
        this.offerPrice = str5;
        this.discount = str6;
        this.extra = str7;
        this.secondLineCarousel = list;
        this.button = poiAnchorCardButton;
        this.backgroundColor = str8;
        this.animationType = num;
        this.animationDuration = num2;
        this.cityOrDistrictName = str9;
    }
}
