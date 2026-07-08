package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ArticleModeIntroBottomSheetModel {

    @C09CT("dark_mode")
    public final String darkModeUrl;

    @C09CT("light_mode")
    public final String lightModeUrl;

    public ArticleModeIntroBottomSheetModel() {
        this("https://p16.tiktokcdn.com/obj/tiktok-obj/article_mode_1_light.webp", "https://p16.tiktokcdn.com/obj/tiktok-obj/article_mode_1_dark.webp");
    }

    public ArticleModeIntroBottomSheetModel(String str, String str2) {
        this.lightModeUrl = str;
        this.darkModeUrl = str2;
    }
}
