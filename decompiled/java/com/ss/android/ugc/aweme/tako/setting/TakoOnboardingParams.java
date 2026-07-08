package com.ss.android.ugc.aweme.tako.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoOnboardingParams {

    @C09CT("logo_anim_non_en_replace_text_1")
    public final String replaceText1;

    @C09CT("logo_anim_non_en_replace_text_2")
    public final String replaceText2;

    @C09CT("logo_anim_non_en_replace_text_3")
    public final String replaceText3;

    @C09CT("logo_anim_non_en_replace_text_4")
    public final String replaceText4;

    @C09CT("logo_anim_non_en_replace_text_5")
    public final String replaceText5;

    @C09CT("type")
    public final int type;

    public TakoOnboardingParams() {
        this(0, "", "", "", "", "");
    }

    public TakoOnboardingParams(int i, String str, String str2, String str3, String str4, String str5) {
        this.type = i;
        this.replaceText1 = str;
        this.replaceText2 = str2;
        this.replaceText3 = str3;
        this.replaceText4 = str4;
        this.replaceText5 = str5;
    }
}
