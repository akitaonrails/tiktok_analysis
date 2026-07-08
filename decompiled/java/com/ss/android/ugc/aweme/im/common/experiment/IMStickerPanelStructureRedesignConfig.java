package com.ss.android.ugc.aweme.im.common.experiment;

import X.C01GW;
import X.C09CT;
import X.C1697810uHb;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class IMStickerPanelStructureRedesignConfig {
    public static final Config LIZ = new Config(C1697810uHb.LJIIJJI(new Category("😂", "😂"), new Category("❤️", "❤️"), new Category("🥺", "🥺"), new Category("😡", "😡")), 3, 3);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(498));

    public static final class Category {

        @C09CT("query")
        public final String query;

        @C09CT("title")
        public final String title;

        public Category() {
            this("", "");
        }

        public Category(String str, String str2) {
            this.title = str;
            this.query = str2;
        }
    }

    public static final class Config {

        @C09CT("creation_guidance_banner_max_display_count")
        public final int bannerShowCount;

        @C09CT("creation_guidance_banner_min_days")
        public final int minDaysBetweenBanners;

        @C09CT("sticker_search_categories")
        public final List<Category> stickerSearchCategories;

        public Config() {
            this(C1697810uHb.LJIIJJI(new Category("😂", "😂"), new Category("❤️", "❤️"), new Category("🥺", "🥺"), new Category("😡", "😡")), 3, 3);
        }

        public Config(List<Category> list, int i, int i2) {
            this.stickerSearchCategories = list;
            this.bannerShowCount = i;
            this.minDaysBetweenBanners = i2;
        }
    }
}
