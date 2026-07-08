package webcast.api.ranklist;

import X.C09CT;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightCertificationInfo;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightGuideBar;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightPageBanner;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightRankItem;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightRequirement;
import com.bytedance.android.livesdk.content_spotlight.model.ContentSpotlightRuleInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ContentSpotlightPageResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("anchor_certification_info")
        public ContentSpotlightCertificationInfo anchorCertificationInfo;

        @C09CT("guide_bar")
        public ContentSpotlightGuideBar guideBar;

        @C09CT("owner_rank")
        public ContentSpotlightRankItem ownerRank;

        @C09CT("rule_info")
        public ContentSpotlightRuleInfo ruleInfo;

        @C09CT("viewer_certification_info")
        public ContentSpotlightCertificationInfo viewerCertificationInfo;

        @C09CT("viewer_has_live_permission")
        public boolean viewerHasLivePermission;

        @C09CT("online_rank")
        public List<ContentSpotlightRankItem> onlineRank = new ArrayList();

        @C09CT("offline_rank")
        public List<ContentSpotlightRankItem> offlineRank = new ArrayList();

        @C09CT("requirements")
        public List<ContentSpotlightRequirement> requirements = new ArrayList();

        @C09CT("anchor_banners")
        public List<ContentSpotlightPageBanner> anchorBanners = new ArrayList();

        @C09CT("viewer_banners")
        public List<ContentSpotlightPageBanner> viewerBanners = new ArrayList();
    }
}
