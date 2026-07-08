package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class GuidePicUrlSettings {
    public static final GuidePicUrlsBean LIZ = new GuidePicUrlsBean("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zlthqeh7bfnuhpq/visit_profile_guide.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zlthqeh7bfnuhpq/visit_profile_guide_darkmode.png");

    public static final class GuidePicUrlsBean {

        @C09CT("my_music_leave_visit_profile_guide")
        public final String profileGuideUrl;

        @C09CT("my_music_leave_visit_profile_guide_darkmode")
        public final String profileGuideUrlDark;

        public GuidePicUrlsBean() {
            this("https://sf16-sg.tiktokcdn.com/obj/eden-sg/zlthqeh7bfnuhpq/visit_profile_guide.png", "https://sf16-sg.tiktokcdn.com/obj/eden-sg/zlthqeh7bfnuhpq/visit_profile_guide_darkmode.png");
        }

        public GuidePicUrlsBean(String str, String str2) {
            this.profileGuideUrl = str;
            this.profileGuideUrlDark = str2;
        }
    }
}
