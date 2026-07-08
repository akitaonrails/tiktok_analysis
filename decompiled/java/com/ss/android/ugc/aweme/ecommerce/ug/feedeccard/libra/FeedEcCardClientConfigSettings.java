package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedEcCardClientConfigSettings {
    public static final FeedEcCardClientConfigModel LIZ = new FeedEcCardClientConfigModel(false, true, 1440, 3, true, false, false, false);

    public static final class FeedEcCardClientConfigModel {

        @C09CT("disable_card_animation")
        public final boolean disableCardAnimation;

        @C09CT("enable_content_anim")
        public final boolean enableContentAnim;

        @C09CT("enable_insert_card")
        public final boolean enableInsertCard;

        @C09CT("hide_buy_btn")
        public final boolean hideBuyBtn;

        @C09CT("no_interest_count_never_show")
        public final int noInterestCountNeverShow;

        @C09CT("no_interest_frequency_control")
        public final boolean noInterestFrequencyControl;

        @C09CT("no_interest_interval_not_show")
        public final int noInterestIntervalNotShow;

        @C09CT("use_native_frequency_control")
        public final boolean useNativeFrequencyControl;

        public FeedEcCardClientConfigModel() {
            this(false, true, 1440, 3, true, false, false, false);
        }

        public FeedEcCardClientConfigModel(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.enableInsertCard = z;
            this.noInterestFrequencyControl = z2;
            this.noInterestIntervalNotShow = i;
            this.noInterestCountNeverShow = i2;
            this.enableContentAnim = z3;
            this.hideBuyBtn = z4;
            this.useNativeFrequencyControl = z5;
            this.disableCardAnimation = z6;
        }
    }
}
