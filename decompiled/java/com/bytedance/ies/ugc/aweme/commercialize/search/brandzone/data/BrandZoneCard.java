package com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data;

import X.C09CS;
import X.C09CT;
import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.OfficialAccount;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class BrandZoneCard implements Serializable {

    @C09CT("dynamic_aweme_list")
    public LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps;

    @C09CT("main_videos")
    public List<? extends Aweme> mainVideos;

    @C09CT("official_account")
    public OfficialAccount officialAccount;

    @C09CT("raw_ad_data")
    @C09CS(StringJsonAdapterFactory.class)
    public AwemeRawAd rawAdData;

    public final LinkedHashMap<String, List<Aweme>> getDynamicAwemeMaps() {
        return this.dynamicAwemeMaps;
    }

    public final List<Aweme> getMainVideos() {
        return this.mainVideos;
    }

    public final OfficialAccount getOfficialAccount() {
        return this.officialAccount;
    }

    public final AwemeRawAd getRawAdData() {
        return this.rawAdData;
    }

    public final void setDynamicAwemeMaps(LinkedHashMap<String, List<Aweme>> linkedHashMap) {
        this.dynamicAwemeMaps = linkedHashMap;
    }

    public final void setMainVideos(List<? extends Aweme> list) {
        this.mainVideos = list;
    }

    public final void setOfficialAccount(OfficialAccount officialAccount) {
        this.officialAccount = officialAccount;
    }

    public final void setRawAdData(AwemeRawAd awemeRawAd) {
        this.rawAdData = awemeRawAd;
    }
}
