package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyRetainConfig {
    public static RetainConfig LIZ() {
        return (RetainConfig) C0C64.LJIILLIIL().LJJII(RetainConfig.class, null, "ls_product_retention_popup", true);
    }

    public static final class Frequency {

        @C09CT("day")
        public final int frequencyDay;

        @C09CT("times")
        public final int frequencyTimes;

        public Frequency(int i, int i2) {
            this.frequencyDay = i;
            this.frequencyTimes = i2;
        }
    }

    public static final class RetainConfig {

        @C09CT("button_word_click")
        public final String clickBtnWord;

        @C09CT("frequency")
        public final Frequency frequency;

        @C09CT("button_word_jump")
        public final String jumpBtnWord;

        @C09CT("logo_key")
        public final String logoKey;

        @C09CT("sub_title")
        public final String subTitle;

        @C09CT("title")
        public final String title;

        @C09CT("use_logo")
        public final Boolean useLogo;

        public RetainConfig() {
            this(Boolean.TRUE, null, null, null, null, null, null);
        }

        public RetainConfig(Boolean bool, String str, String str2, String str3, String str4, String str5, Frequency frequency) {
            this.useLogo = bool;
            this.logoKey = str;
            this.title = str2;
            this.subTitle = str3;
            this.clickBtnWord = str4;
            this.jumpBtnWord = str5;
            this.frequency = frequency;
        }
    }
}
