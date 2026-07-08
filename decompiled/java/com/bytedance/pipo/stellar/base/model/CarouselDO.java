package com.bytedance.pipo.stellar.base.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class CarouselDO extends BaseWidgetDO {

    @C09CT("auto_play")
    public final String autoPlay;

    @C09CT("progress_bar_background")
    public final ColorDO barBackgroundColor;

    @C09CT("progress_bar_foreground")
    public final ColorDO barForegroundColor;

    @C09CT("carousel_items")
    public final List<CarouselItem> items;

    @C09CT("repeatable")
    public final String repeatable;

    @C09CT("stay_duration")
    public final String stayDuration;

    @C09CT("stay_durations")
    public final List<String> stayDurations;

    public CarouselDO() {
        this(null, null, null, null, null, null, null);
    }

    public final CarouselDO copy(ColorDO colorDO, ColorDO colorDO2, String str, String str2, String str3, List<CarouselItem> list, List<String> list2) {
        return new CarouselDO(colorDO, colorDO2, str, str2, str3, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselDO)) {
            return false;
        }
        CarouselDO carouselDO = (CarouselDO) obj;
        return Intrinsics.LJFF(this.barBackgroundColor, carouselDO.barBackgroundColor) && Intrinsics.LJFF(this.barForegroundColor, carouselDO.barForegroundColor) && Intrinsics.LJFF(this.autoPlay, carouselDO.autoPlay) && Intrinsics.LJFF(this.repeatable, carouselDO.repeatable) && Intrinsics.LJFF(this.stayDuration, carouselDO.stayDuration) && Intrinsics.LJFF(this.items, carouselDO.items) && Intrinsics.LJFF(this.stayDurations, carouselDO.stayDurations);
    }

    public int hashCode() {
        ColorDO colorDO = this.barBackgroundColor;
        int iHashCode = (colorDO == null ? 0 : colorDO.hashCode()) * 31;
        ColorDO colorDO2 = this.barForegroundColor;
        int iHashCode2 = (iHashCode + (colorDO2 == null ? 0 : colorDO2.hashCode())) * 31;
        String str = this.autoPlay;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.repeatable;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.stayDuration;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<CarouselItem> list = this.items;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.stayDurations;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CarouselDO(barBackgroundColor=");
        sbLIZ.append(this.barBackgroundColor);
        sbLIZ.append(", barForegroundColor=");
        sbLIZ.append(this.barForegroundColor);
        sbLIZ.append(", autoPlay=");
        sbLIZ.append(this.autoPlay);
        sbLIZ.append(", repeatable=");
        sbLIZ.append(this.repeatable);
        sbLIZ.append(", stayDuration=");
        sbLIZ.append(this.stayDuration);
        sbLIZ.append(", items=");
        sbLIZ.append(this.items);
        sbLIZ.append(", stayDurations=");
        sbLIZ.append(this.stayDurations);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public final List<CarouselItem> getItems() {
        return this.items;
    }

    public final String getRepeatable() {
        return this.repeatable;
    }

    public final String getStayDuration() {
        return this.stayDuration;
    }

    public final List<String> getStayDurations() {
        return this.stayDurations;
    }

    public CarouselDO(ColorDO colorDO, ColorDO colorDO2, String str, String str2, String str3, List<CarouselItem> list, List<String> list2) {
        super(null, null, 1, null, null);
        this.barBackgroundColor = colorDO;
        this.barForegroundColor = colorDO2;
        this.autoPlay = str;
        this.repeatable = str2;
        this.stayDuration = str3;
        this.items = list;
        this.stayDurations = list2;
    }
}
