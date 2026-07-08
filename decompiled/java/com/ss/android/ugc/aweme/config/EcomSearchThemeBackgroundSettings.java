package com.ss.android.ugc.aweme.config;

import X.C09CT;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class EcomSearchThemeBackgroundSettings {
    public static final EcomSearchThemeBackgroundModel LIZ = new EcomSearchThemeBackgroundModel(Collections.singletonList("https://sf16-sg.tiktokcdn.com/obj/eden-sg/1230eh7pldvhpenuhog/searchbg.png"));

    public static final class EcomSearchThemeBackgroundModel {

        @C09CT("ecom_search_default_background")
        public final List<String> ecomSearchDefaultBackground;

        public EcomSearchThemeBackgroundModel(List<String> list) {
            this.ecomSearchDefaultBackground = list;
        }
    }
}
