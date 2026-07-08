package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselV2DO extends BaseWidgetDO {

    @C09CT("auto_play")
    public final String autoPlay;

    @C09CT("progress_bar_background")
    public final ColorDO barBackgroundColor;

    @C09CT("progress_bar_foreground")
    public final ColorDO barForegroundColor;

    @C09CT("carousel_items")
    public final List<CardDO> items;

    @C09CT("progress_card_id_list")
    public final List<String> progressCardIdList;

    @C09CT("selected_title_color")
    public final ColorDO selectedTitleColor;

    @C09CT("selected_title_font")
    public final String selectedTitleFont;

    @C09CT("show_progress_bar")
    public final Integer showProgressBar;

    @C09CT("stay_durations")
    public final List<String> stayDurations;

    @C09CT("title_color")
    public final ColorDO titleColor;

    @C09CT("title_font")
    public final String titleFont;

    @C09CT("titles")
    public final List<String> titles;

    public CarouselV2DO() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final CarouselV2DO copy(ColorDO colorDO, ColorDO colorDO2, Integer num, List<String> list, String str, String str2, ColorDO colorDO3, ColorDO colorDO4, String str3, List<CardDO> list2, List<String> list3, List<String> list4) {
        return new CarouselV2DO(colorDO, colorDO2, num, list, str, str2, colorDO3, colorDO4, str3, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselV2DO)) {
            return false;
        }
        CarouselV2DO carouselV2DO = (CarouselV2DO) obj;
        return Intrinsics.LJFF(this.barBackgroundColor, carouselV2DO.barBackgroundColor) && Intrinsics.LJFF(this.barForegroundColor, carouselV2DO.barForegroundColor) && Intrinsics.LJFF(this.showProgressBar, carouselV2DO.showProgressBar) && Intrinsics.LJFF(this.titles, carouselV2DO.titles) && Intrinsics.LJFF(this.titleFont, carouselV2DO.titleFont) && Intrinsics.LJFF(this.selectedTitleFont, carouselV2DO.selectedTitleFont) && Intrinsics.LJFF(this.titleColor, carouselV2DO.titleColor) && Intrinsics.LJFF(this.selectedTitleColor, carouselV2DO.selectedTitleColor) && Intrinsics.LJFF(this.autoPlay, carouselV2DO.autoPlay) && Intrinsics.LJFF(this.items, carouselV2DO.items) && Intrinsics.LJFF(this.stayDurations, carouselV2DO.stayDurations) && Intrinsics.LJFF(this.progressCardIdList, carouselV2DO.progressCardIdList);
    }

    public int hashCode() {
        ColorDO colorDO = this.barBackgroundColor;
        int iHashCode = (colorDO == null ? 0 : colorDO.hashCode()) * 31;
        ColorDO colorDO2 = this.barForegroundColor;
        int iHashCode2 = (iHashCode + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        Integer num = this.showProgressBar;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.titles;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.titleFont;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedTitleFont;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ColorDO colorDO3 = this.titleColor;
        int iHashCode7 = (iHashCode6 + (colorDO3 == null ? 0 : colorDO3.hashCode())) * 31;
        ColorDO colorDO4 = this.selectedTitleColor;
        int iHashCode8 = (iHashCode7 + (colorDO4 == null ? 0 : colorDO4.hashCode())) * 31;
        String str3 = this.autoPlay;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CardDO> list2 = this.items;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.stayDurations;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.progressCardIdList;
        return iHashCode11 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        return "CarouselV2DO(barBackgroundColor=" + this.barBackgroundColor + ", barForegroundColor=" + this.barForegroundColor + ", showProgressBar=" + this.showProgressBar + ", titles=" + this.titles + ", titleFont=" + this.titleFont + ", selectedTitleFont=" + this.selectedTitleFont + ", titleColor=" + this.titleColor + ", selectedTitleColor=" + this.selectedTitleColor + ", autoPlay=" + this.autoPlay + ", items=" + this.items + ", stayDurations=" + this.stayDurations + ", progressCardIdList=" + this.progressCardIdList + ')';
    }

    public final String getAutoPlay() {
        return this.autoPlay;
    }

    public final ColorDO getBarBackgroundColor() {
        return this.barBackgroundColor;
    }

    public final ColorDO getBarForegroundColor() {
        return this.barForegroundColor;
    }

    public final List<CardDO> getItems() {
        return this.items;
    }

    public final List<String> getProgressCardIdList() {
        return this.progressCardIdList;
    }

    public final ColorDO getSelectedTitleColor() {
        return this.selectedTitleColor;
    }

    public final String getSelectedTitleFont() {
        return this.selectedTitleFont;
    }

    public final Integer getShowProgressBar() {
        return this.showProgressBar;
    }

    public final List<String> getStayDurations() {
        return this.stayDurations;
    }

    public final ColorDO getTitleColor() {
        return this.titleColor;
    }

    public final String getTitleFont() {
        return this.titleFont;
    }

    public final List<String> getTitles() {
        return this.titles;
    }

    public CarouselV2DO(ColorDO colorDO, ColorDO colorDO2, Integer num, List<String> list, String str, String str2, ColorDO colorDO3, ColorDO colorDO4, String str3, List<CardDO> list2, List<String> list3, List<String> list4) {
        super(null, null, 1, null, null);
        this.barBackgroundColor = colorDO;
        this.barForegroundColor = colorDO2;
        this.showProgressBar = num;
        this.titles = list;
        this.titleFont = str;
        this.selectedTitleFont = str2;
        this.titleColor = colorDO3;
        this.selectedTitleColor = colorDO4;
        this.autoPlay = str3;
        this.items = list2;
        this.stayDurations = list3;
        this.progressCardIdList = list4;
    }
}
