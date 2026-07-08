package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public final class MDPRelatedBanner implements Serializable {

    @C09CT("cover")
    public final UrlModel cover;

    @C09CT("first_hashtag")
    public final TrendingHashtag firstHashtag;

    @C09CT("hashtag_ids")
    public final String hashtagIds;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("mdp_banner_type")
    public final Integer mdpBannerType;

    @C09CT("mdp_template_pin_reason")
    public final MDPTemplatePinReason mdpTemplatePinReason;

    @C09CT("schema_url")
    public final String schemaUrl;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("title")
    public final String title;

    @C09CT("total_hashtag_views")
    public final Long totalHashtagViews;

    public final MDPRelatedBannerType getBannerType() {
        MDPRelatedBannerType next;
        Iterator<MDPRelatedBannerType> it2 = MDPRelatedBannerType.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            int value = next.getValue();
            Integer num = this.mdpBannerType;
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return next;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final TrendingHashtag getFirstHashtag() {
        return this.firstHashtag;
    }

    public final String getHashtagIds() {
        return this.hashtagIds;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final Integer getMdpBannerType() {
        return this.mdpBannerType;
    }

    public final MDPTemplatePinReason getMdpTemplatePinReason() {
        return this.mdpTemplatePinReason;
    }

    public final String getSchemaUrl() {
        return this.schemaUrl;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getTotalHashtagViews() {
        return this.totalHashtagViews;
    }
}
