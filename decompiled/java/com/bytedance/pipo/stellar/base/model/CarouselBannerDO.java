package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselBannerDO extends BaseWidgetDO {

    @C09CT("auto_play")
    public final String autoPlay;

    @C09CT("dot_color")
    public final ColorDO dotColor;

    @C09CT("dot_padding")
    public final Integer dotPadding;

    @C09CT("dot_position")
    public final String dotPosition;

    @C09CT("dot_size")
    public final Integer dotSize;

    @C09CT("card_list")
    public final List<CardDO> items;

    @C09CT("repeatable")
    public final String repeatable;

    @C09CT("select_dot_color")
    public final ColorDO selectDotColor;

    @C09CT("show_dot")
    public final Integer showDot;

    @C09CT("stay_duration")
    public final String stayDuration;

    public CarouselBannerDO() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public final CarouselBannerDO copy(Integer num, String str, Integer num2, Integer num3, ColorDO colorDO, ColorDO colorDO2, String str2, String str3, String str4, List<CardDO> list) {
        return new CarouselBannerDO(num, str, num2, num3, colorDO, colorDO2, str2, str3, str4, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselBannerDO)) {
            return false;
        }
        CarouselBannerDO carouselBannerDO = (CarouselBannerDO) obj;
        return Intrinsics.LJFF(this.showDot, carouselBannerDO.showDot) && Intrinsics.LJFF(this.dotPosition, carouselBannerDO.dotPosition) && Intrinsics.LJFF(this.dotSize, carouselBannerDO.dotSize) && Intrinsics.LJFF(this.dotPadding, carouselBannerDO.dotPadding) && Intrinsics.LJFF(this.dotColor, carouselBannerDO.dotColor) && Intrinsics.LJFF(this.selectDotColor, carouselBannerDO.selectDotColor) && Intrinsics.LJFF(this.autoPlay, carouselBannerDO.autoPlay) && Intrinsics.LJFF(this.repeatable, carouselBannerDO.repeatable) && Intrinsics.LJFF(this.stayDuration, carouselBannerDO.stayDuration) && Intrinsics.LJFF(this.items, carouselBannerDO.items);
    }

    public int hashCode() {
        Integer num = this.showDot;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.dotPosition;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.dotSize;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.dotPadding;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ColorDO colorDO = this.dotColor;
        int iHashCode5 = (iHashCode4 + (colorDO == null ? 0 : colorDO.hashCode())) * 31;
        ColorDO colorDO2 = this.selectDotColor;
        int iHashCode6 = (iHashCode5 + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        String str2 = this.autoPlay;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.repeatable;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stayDuration;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<CardDO> list = this.items;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselBannerDO(showDot=");
        sbLIZ.append(this.showDot);
        sbLIZ.append(", dotPosition=");
        sbLIZ.append(this.dotPosition);
        sbLIZ.append(", dotSize=");
        sbLIZ.append(this.dotSize);
        sbLIZ.append(", dotPadding=");
        sbLIZ.append(this.dotPadding);
        sbLIZ.append(", dotColor=");
        sbLIZ.append(this.dotColor);
        sbLIZ.append(", selectDotColor=");
        sbLIZ.append(this.selectDotColor);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(this.autoPlay);
        sbLIZ.append(", repeatable=");
        sbLIZ.append(this.repeatable);
        sbLIZ.append(", stayDuration=");
        sbLIZ.append(this.stayDuration);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getAutoPlay() {
        return this.autoPlay;
    }

    public final ColorDO getDotColor() {
        return this.dotColor;
    }

    public final Integer getDotPadding() {
        return this.dotPadding;
    }

    public final String getDotPosition() {
        return this.dotPosition;
    }

    public final Integer getDotSize() {
        return this.dotSize;
    }

    public final List<CardDO> getItems() {
        return this.items;
    }

    public final String getRepeatable() {
        return this.repeatable;
    }

    public final ColorDO getSelectDotColor() {
        return this.selectDotColor;
    }

    public final Integer getShowDot() {
        return this.showDot;
    }

    public final String getStayDuration() {
        return this.stayDuration;
    }

    public CarouselBannerDO(Integer num, String str, Integer num2, Integer num3, ColorDO colorDO, ColorDO colorDO2, String str2, String str3, String str4, List<CardDO> list) {
        super(null, null, 1, null, null);
        this.showDot = num;
        this.dotPosition = str;
        this.dotSize = num2;
        this.dotPadding = num3;
        this.dotColor = colorDO;
        this.selectDotColor = colorDO2;
        this.autoPlay = str2;
        this.repeatable = str3;
        this.stayDuration = str4;
        this.items = list;
    }
}
