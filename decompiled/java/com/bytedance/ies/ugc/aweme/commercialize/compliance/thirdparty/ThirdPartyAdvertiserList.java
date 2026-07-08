package com.bytedance.ies.ugc.aweme.commercialize.compliance.thirdparty;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.AdvertiserModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class ThirdPartyAdvertiserList extends BaseResponse implements Serializable {
    public static final int $stable = 8;

    @C09CT("adv_list")
    public final List<AdvertiserModel> advList;

    @C09CT("has_more")
    public boolean hasMore;

    @C09CT("learn_more_link")
    public String learnMoreLink;

    public ThirdPartyAdvertiserList() {
        this(new ArrayList(), false, "");
    }

    public final List<AdvertiserModel> getAdvList() {
        return this.advList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getLearnMoreLink() {
        return this.learnMoreLink;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLearnMoreLink(String str) {
        this.learnMoreLink = str;
    }

    public ThirdPartyAdvertiserList(List<AdvertiserModel> list, boolean z, String str) {
        this.advList = list;
        this.hasMore = z;
        this.learnMoreLink = str;
    }
}
