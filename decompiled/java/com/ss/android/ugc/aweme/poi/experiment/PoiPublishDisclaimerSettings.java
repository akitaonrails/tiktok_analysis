package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C20642515q3;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiPublishDisclaimerSettings {
    public static final PoiPublishDisclaimerSettings LIZ = new PoiPublishDisclaimerSettings();
    public static final DisclaimerData LIZIZ = new DisclaimerData(null, C20642515q3.LJI(2131837258), null);

    public static final class HighLightWord {

        @C09CT("name")
        public final String name;

        @C09CT("url")
        public final String url;

        public HighLightWord() {
            this(null, null);
        }

        public HighLightWord(String str, String str2) {
            this.name = str;
            this.url = str2;
        }
    }

    public static final class Icon {

        /* JADX INFO: renamed from: android, reason: collision with root package name */
        @C09CT("android")
        public final String f391android;

        @C09CT("ios")
        public final String ios;

        public Icon() {
            this(null, null);
        }

        public Icon(String str, String str2) {
            this.f391android = str;
            this.ios = str2;
        }
    }

    public static final class DisclaimerData {

        @C09CT("confirm_btn_title")
        public final String confirmBtnTitle;

        @C09CT("sections")
        public final List<Section> contentList;

        @C09CT("title")
        public final String title;

        public DisclaimerData() {
            this(null, C20642515q3.LJI(2131837258), null);
        }

        public DisclaimerData(String str, String str2, List<Section> list) {
            this.title = str;
            this.confirmBtnTitle = str2;
            this.contentList = list;
        }
    }

    public static final class Section {

        @C09CT("content_format")
        public final String contentFormat;

        @C09CT("high_light_words")
        public final List<HighLightWord> highLightWords;

        @C09CT("icon")
        public final Icon icon;

        @C09CT("is_gne_policy")
        public final boolean isGnePolicy;

        @C09CT("section_title")
        public final String sectionTitle;

        public Section() {
            this(null, null, null, null, false);
        }

        public Section(Icon icon, String str, String str2, List<HighLightWord> list, boolean z) {
            this.icon = icon;
            this.sectionTitle = str;
            this.contentFormat = str2;
            this.highLightWords = list;
            this.isGnePolicy = z;
        }
    }
}
