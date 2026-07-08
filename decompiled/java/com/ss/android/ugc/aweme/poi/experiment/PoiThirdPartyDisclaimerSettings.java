package com.ss.android.ugc.aweme.poi.experiment;

import X.C09CT;
import X.C0C64;
import X.C20642515q3;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PoiThirdPartyDisclaimerSettings {
    public static final PoiThirdPartyDisclaimerSettings LIZ = new PoiThirdPartyDisclaimerSettings();
    public static final DisclaimerData LIZIZ = new DisclaimerData(null, null, null, null, null, null, null, null, 255, null);

    public static DisclaimerData LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        DisclaimerData disclaimerData = LIZIZ;
        DisclaimerData disclaimerData2 = (DisclaimerData) c0c64LJIILLIIL.LJJII(DisclaimerData.class, disclaimerData, "product_3rd_disclaimer", false);
        return disclaimerData2 != null ? disclaimerData2 : disclaimerData;
    }

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

    public static final class Content {

        @C09CT("content_format")
        public final String contentFormat;

        @C09CT("has_dot")
        public final boolean hasDot;

        @C09CT("high_light_words")
        public final List<HighLightWord> highLightWords;

        public Content() {
            this(null, false, null);
        }

        public Content(String str, boolean z, List<HighLightWord> list) {
            this.contentFormat = str;
            this.hasDot = z;
            this.highLightWords = list;
        }
    }

    public static final class DisclaimerData {

        @C09CT("button_word_click")
        public final String clickBtnWord;

        @C09CT("content_list")
        public final List<Content> contentList;

        @C09CT("button_word_jump")
        public final String jumpBtnWord;

        @C09CT("life_disclaimer_show_time")
        public final Integer lifeShowTime;

        @C09CT("logo_key")
        public final String logoKey;

        @C09CT("sub_title")
        public final String subTitle;

        @C09CT("title")
        public final String title;

        @C09CT("use_logo")
        public final Boolean useLogo;

        public DisclaimerData() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public DisclaimerData(Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, List<Content> list) {
            this.lifeShowTime = num;
            this.useLogo = bool;
            this.logoKey = str;
            this.title = str2;
            this.subTitle = str3;
            this.clickBtnWord = str4;
            this.jumpBtnWord = str5;
            this.contentList = list;
        }

        public DisclaimerData(Integer num, Boolean bool, String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            List list2 = list;
            num = (i & 1) != 0 ? 0 : num;
            bool = (i & 2) != 0 ? Boolean.TRUE : bool;
            str = (i & 4) != 0 ? null : str;
            str2 = (i & 8) != 0 ? C20642515q3.LJI(2131835622) : str2;
            str3 = (i & 16) != 0 ? null : str3;
            str4 = (i & 32) != 0 ? C20642515q3.LJI(2131835614) : str4;
            str5 = (i & 64) != 0 ? C20642515q3.LJI(2131835615) : str5;
            if ((i & 128) != 0) {
                PoiThirdPartyDisclaimerSettings.LIZ.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Content(C20642515q3.LJI(2131835616), true, null));
                arrayList.add(new Content(C20642515q3.LJI(2131835617), true, null));
                arrayList.add(new Content(C20642515q3.LJI(2131835618), true, null));
                arrayList.add(new Content(C20642515q3.LJI(2131835619), true, null));
                String strLJI = C20642515q3.LJI(2131835620);
                String strLJI2 = C20642515q3.LJI(2131835621);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://www.tiktok.com/privacy/overview/");
                sbLIZ.append(((ITranslationService) ServiceManager.get().getService(ITranslationService.class)).LLIIZ());
                arrayList.add(new Content(strLJI, true, Collections.singletonList(new HighLightWord(strLJI2, C2188811AlT.LIZIZ(sbLIZ)))));
                list2 = arrayList;
            }
            this(num, bool, str, str2, str3, str4, str5, list2);
        }
    }
}
