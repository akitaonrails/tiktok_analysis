package com.ss.android.ugc.aweme.profile.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes20.dex */
public final class TikTokSellerSvcConfigSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class EcomTtsSvcConfig {

        @C09CT("short_video_center_profile")
        public final String shortVideoCenterProfileLink;

        @C09CT("short_video_center_settings")
        public final String shortVideoCenterSettinsLink;

        public EcomTtsSvcConfig() {
            this("", "");
        }

        public EcomTtsSvcConfig(String str, String str2) {
            this.shortVideoCenterProfileLink = str;
            this.shortVideoCenterSettinsLink = str2;
        }
    }
}
