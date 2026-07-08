package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class AboutMeResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("about_me")
        public AboutMe aboutMe;

        @C09CT("benefits_info")
        public BenefitsInfo benefitsInfo;

        @C09CT("conflict_info")
        public IntroConflictInfo conflictInfo;

        @C09CT("merge_type")
        public int mergeType;

        @C09CT("old_version")
        public boolean oldVersion;
    }
}
