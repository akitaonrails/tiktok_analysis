package com.ss.android.ugc.aweme.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class FacebookSocialPromptV2flagsSettings {
    public static final FacebookSocialPromptV2flagsModel LIZ = new FacebookSocialPromptV2flagsModel("", "", "");

    public static final class FacebookSocialPromptV2flagsModel {

        @C09CT("helpcenter")
        public final String helpCenterLinkText;

        @C09CT("learnmore")
        public final String learnMoreText;

        @C09CT("body")
        public final String promptExcludeTitle;

        public FacebookSocialPromptV2flagsModel(String str, String str2, String str3) {
            this.promptExcludeTitle = str;
            this.learnMoreText = str2;
            this.helpCenterLinkText = str3;
        }
    }
}
