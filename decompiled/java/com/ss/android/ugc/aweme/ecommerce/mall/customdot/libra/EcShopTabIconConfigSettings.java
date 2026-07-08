package com.ss.android.ugc.aweme.ecommerce.mall.customdot.libra;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class EcShopTabIconConfigSettings {
    public static final EcShopTabIconConfigModel LIZ = new EcShopTabIconConfigModel(null, null);

    public static final class EcShopTabIconConfigModel {

        @C09CT("bottom_tab_effective_time_range_list")
        public final List<TimeRangeModel> bottomEffectiveTimeRangeList;

        @C09CT("top_tab_effective_time_range_list")
        public final List<TimeRangeModel> topEffectiveTimeRangeList;

        public EcShopTabIconConfigModel() {
            this(null, null);
        }

        public EcShopTabIconConfigModel(List<TimeRangeModel> list, List<TimeRangeModel> list2) {
            this.topEffectiveTimeRangeList = list;
            this.bottomEffectiveTimeRangeList = list2;
        }
    }

    public static final class IconSizeModel {

        @C09CT("height")
        public final Integer height;

        @C09CT("width")
        public final Integer width;

        public IconSizeModel() {
            this(null, null);
        }

        public IconSizeModel(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }
    }

    public static final class IconUrlModel {

        @C09CT("dark_mode_icon_url")
        public final String darkModeIconUrl;

        @C09CT("light_mode_icon_url")
        public final String lightModeIconUrl;

        public IconUrlModel() {
            this(null, null);
        }

        public IconUrlModel(String str, String str2) {
            this.darkModeIconUrl = str;
            this.lightModeIconUrl = str2;
        }
    }

    public static final class IconLocalModel {

        @C09CT("dark_selected_path")
        public final String darkSelectedPath;

        @C09CT("dark_unselected_path")
        public final String darkUnselectedPath;

        @C09CT("icon_size")
        public final IconSizeModel iconSize;

        @C09CT("light_selected_path")
        public final String lightSelectedPath;

        @C09CT("light_unselected_path")
        public final String lightUnselectedPath;

        public IconLocalModel() {
            this(null, null, null, null, null);
        }

        public IconLocalModel(String str, String str2, String str3, String str4, IconSizeModel iconSizeModel) {
            this.lightUnselectedPath = str;
            this.lightSelectedPath = str2;
            this.darkUnselectedPath = str3;
            this.darkSelectedPath = str4;
            this.iconSize = iconSizeModel;
        }
    }

    public static final class TimeRangeModel {

        @C09CT("end_time")
        public final Long endTime;

        @C09CT("icon_local")
        public final IconLocalModel iconLocal;

        @C09CT("icon_url")
        public final IconUrlModel iconUrl;

        @C09CT("is_icon_forced_to_disappear")
        public final Boolean isIconForcedToDisappear;

        @C09CT("start_time")
        public final Long startTime;

        public TimeRangeModel() {
            this(null, null, null, null, null);
        }

        public TimeRangeModel(Long l, Long l2, IconUrlModel iconUrlModel, IconLocalModel iconLocalModel, Boolean bool) {
            this.startTime = l;
            this.endTime = l2;
            this.iconUrl = iconUrlModel;
            this.iconLocal = iconLocalModel;
            this.isIconForcedToDisappear = bool;
        }
    }
}
