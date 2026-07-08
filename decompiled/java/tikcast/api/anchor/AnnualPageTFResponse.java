package tikcast.api.anchor;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class AnnualPageTFResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("anchor_info")
        public LiveRecapUserInfo anchorInfo;

        @C09CT("can_live_page")
        public CanLivePageData canLivePage;

        @C09CT("full_page")
        public FullPageData fullPage;

        @C09CT("is_self")
        public boolean isSelf;

        @C09CT("limited_page")
        public LimitedPageData limitedPage;

        @C09CT("no_permission_page")
        public NoPermissionPageData noPermissionPage;

        @C09CT("oft")
        public boolean oft;

        @C09CT("page_type")
        public int pageType;

        @C09CT("recap_active")
        public boolean recapActive;

        @C09CT("sk")
        public String sk = "";
    }
}
