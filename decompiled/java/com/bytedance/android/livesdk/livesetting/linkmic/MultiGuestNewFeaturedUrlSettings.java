package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_multi_featured_container_schema")
public final class MultiGuestNewFeaturedUrlSettings {
    public static final MultiGuestNewFeaturedUrlSettings INSTANCE = new MultiGuestNewFeaturedUrlSettings();
    public static final MultiGuestNewFeaturedUrlBean DEFAULT = new MultiGuestNewFeaturedUrlBean("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container%2Ftemplate.js&height=70%25", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container-faq%2Ftemplate.js&height=70%25");

    public static final class MultiGuestNewFeaturedUrlBean {
        public static final TypeAdapter ADAPTER;

        @C09CT("featured-container-faq")
        public String featuredFAQUrl;

        @C09CT("featured-container")
        public String featuredUrl;

        static {
            NormalGson.singleton();
            ADAPTER = new MultiGuestNewFeaturedUrlSettings_MultiGuestNewFeaturedUrlBean_OptTypeAdapter();
        }

        public MultiGuestNewFeaturedUrlBean() {
            this("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container%2Ftemplate.js&height=70%25", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_interaction_multi_guest%2Fpages%2Ffeatured-container-faq%2Ftemplate.js&height=70%25");
        }

        public MultiGuestNewFeaturedUrlBean(String str, String str2) {
            this.featuredUrl = str;
            this.featuredFAQUrl = str2;
        }
    }

    private final MultiGuestNewFeaturedUrlBean getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MultiGuestNewFeaturedUrlBean multiGuestNewFeaturedUrlBean = DEFAULT;
        MultiGuestNewFeaturedUrlBean multiGuestNewFeaturedUrlBean2 = (MultiGuestNewFeaturedUrlBean) settingsManager.getValueSafely("ttlive_multi_featured_container_schema", multiGuestNewFeaturedUrlBean);
        return multiGuestNewFeaturedUrlBean2 != null ? multiGuestNewFeaturedUrlBean2 : multiGuestNewFeaturedUrlBean;
    }

    public final String getFeaturedUrl() {
        return getValue().featuredUrl;
    }
}
