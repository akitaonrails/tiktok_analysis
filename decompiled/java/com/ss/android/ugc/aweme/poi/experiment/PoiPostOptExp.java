package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPostOptExp {
    public static final PoiPostOptExp LIZ = new PoiPostOptExp();

    public static final class Config {

        @C09CT("poi_post_multi_tabs_config")
        public final List<PoiPostMultiTabsConfig> poiPostMultiTabsConfig;

        public Config() {
            this(null);
        }

        public Config(List<PoiPostMultiTabsConfig> list) {
            this.poiPostMultiTabsConfig = list;
        }
    }

    public static PoiPostMultiTabsConfig LIZ(String str) {
        Config config;
        List<PoiPostMultiTabsConfig> list;
        PoiPostMultiTabsConfig poiPostMultiTabsConfig = null;
        if (str == null || (config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "poi_regional_post_multi_tabs", true)) == null || (list = config.poiPostMultiTabsConfig) == null) {
            return null;
        }
        Iterator<PoiPostMultiTabsConfig> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            PoiPostMultiTabsConfig next = it2.next();
            if (Intrinsics.LJFF(String.valueOf(next.typeLevel), str)) {
                poiPostMultiTabsConfig = next;
                break;
            }
        }
        return poiPostMultiTabsConfig;
    }

    public static boolean LIZIZ(String str) {
        PoiPostMultiTabsConfig poiPostMultiTabsConfigLIZ = LIZ(str);
        if (poiPostMultiTabsConfigLIZ != null && poiPostMultiTabsConfigLIZ.isWaterFall == 1) {
            return true;
        }
        return false;
    }

    public static final class PoiPostMultiTabsConfig {

        @C09CT("is_allow_click_digg")
        public final int isAllowClickDigg;

        @C09CT("is_show_anchor_in_post")
        public final int isShowAnchor;

        @C09CT("is_waterfall_in_post")
        public final int isWaterFall;

        @C09CT("poi_page_multi_post_tabs")
        public final int multiTabNums;

        @C09CT("type_level")
        public final int typeLevel;

        public PoiPostMultiTabsConfig() {
            this(0, 0, 0, 0, 0);
        }

        public PoiPostMultiTabsConfig(int i, int i2, int i3, int i4, int i5) {
            this.multiTabNums = i;
            this.isShowAnchor = i2;
            this.isWaterFall = i3;
            this.isAllowClickDigg = i4;
            this.typeLevel = i5;
        }
    }
}
