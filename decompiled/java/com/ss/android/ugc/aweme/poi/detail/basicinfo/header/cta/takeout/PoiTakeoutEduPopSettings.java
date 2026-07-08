package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.takeout;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiTakeoutEduPopSettings {
    public static final PoiTakeoutEduPopSettings LIZ = new PoiTakeoutEduPopSettings();
    public static final EduPopConfig LIZIZ = new EduPopConfig(1, Boolean.TRUE, null, null, null, null, null, null, null);

    public static EduPopConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EduPopConfig eduPopConfig = LIZIZ;
        EduPopConfig eduPopConfig2 = (EduPopConfig) settingsManagerLIZLLL.LJIIIIZZ("takeout_edu_pop", EduPopConfig.class, eduPopConfig);
        return eduPopConfig2 != null ? eduPopConfig2 : eduPopConfig;
    }

    public static final class ImgUrl {

        @C09CT("UrlList")
        public final List<String> urlList;

        public ImgUrl() {
            this(null);
        }

        public ImgUrl(List<String> list) {
            this.urlList = list;
        }
    }

    public static final class CtaBtn {

        @C09CT("cta")
        public final String cta;

        @C09CT("url")
        public final String url;

        public CtaBtn() {
            this(null, null);
        }

        public CtaBtn(String str, String str2) {
            this.cta = str;
            this.url = str2;
        }
    }

    public static final class HighlightWord {

        @C09CT("name")
        public final String name;

        @C09CT("url")
        public final String url;

        public HighlightWord() {
            this(null, null);
        }

        public HighlightWord(String str, String str2) {
            this.name = str;
            this.url = str2;
        }
    }

    public static final class EduPopConfig {

        @C09CT("button_left")
        public final CtaBtn btnLeft;

        @C09CT("button_right")
        public final CtaBtn btnRight;

        @C09CT("dark_mode_logo")
        public final ImgUrl darkModeLogo;

        @C09CT("high_light_word_of_sub_title")
        public final HighlightWord highlightWord;

        @C09CT("life_edu_pop_show_time")
        public final Integer lifeShowTime;

        @C09CT("light_mode_logo")
        public final ImgUrl lightModeLogo;

        @C09CT("sub_title")
        public final String subTitle;

        @C09CT("title")
        public final String title;

        @C09CT("use_logo")
        public final Boolean useLogo;

        public EduPopConfig() {
            this(1, Boolean.TRUE, null, null, null, null, null, null, null);
        }

        public EduPopConfig(Integer num, Boolean bool, String str, String str2, HighlightWord highlightWord, ImgUrl imgUrl, ImgUrl imgUrl2, CtaBtn ctaBtn, CtaBtn ctaBtn2) {
            this.lifeShowTime = num;
            this.useLogo = bool;
            this.title = str;
            this.subTitle = str2;
            this.highlightWord = highlightWord;
            this.lightModeLogo = imgUrl;
            this.darkModeLogo = imgUrl2;
            this.btnLeft = ctaBtn;
            this.btnRight = ctaBtn2;
        }
    }
}
