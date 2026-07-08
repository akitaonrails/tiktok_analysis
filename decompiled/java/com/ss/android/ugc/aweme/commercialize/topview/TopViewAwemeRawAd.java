package com.ss.android.ugc.aweme.commercialize.topview;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo;

/* JADX INFO: loaded from: classes17.dex */
public final class TopViewAwemeRawAd extends CommonAdData {
    public Integer LL;

    @C09CT("ad_id")
    public final Long adId;

    @C09CT("style_action")
    public final AdStyleActionModel adStyleActionModel;

    @C09CT("style_template")
    public final AnoleModel anoleModel;

    @C09CT("brand_safety")
    public final Integer brandSafety;

    @C09CT("vast")
    public final OmVast omVast;

    @C09CT("splash_info")
    public final AwemeSplashInfo splashInfo;

    @Override // com.bytedance.ies.ugc.aweme.rich.model.CommonAdData
    public int getChargeType() {
        Integer num = this.LL;
        return num != null ? num.intValue() : super.getChargeType();
    }

    public final Long getAdId() {
        return this.adId;
    }

    public final AdStyleActionModel getAdStyleActionModel() {
        return this.adStyleActionModel;
    }

    public final AnoleModel getAnoleModel() {
        return this.anoleModel;
    }

    public final Integer getBrandSafety() {
        return this.brandSafety;
    }

    public final OmVast getOmVast() {
        return this.omVast;
    }

    public final AwemeSplashInfo getSplashInfo() {
        return this.splashInfo;
    }

    public TopViewAwemeRawAd(AwemeRawAd awemeRawAd) {
        this(awemeRawAd.getAdId(), awemeRawAd.getSplashInfo(), awemeRawAd.getOmVast(), awemeRawAd.getAnoleModel(), null, null);
        setCreativeId(awemeRawAd.getCreativeId());
        setLogExtra(awemeRawAd.getLogExtra());
        setGroupId(awemeRawAd.getGroupId());
        setSystemOrigin(awemeRawAd.getSystemOrigin());
        this.LL = Integer.valueOf(awemeRawAd.getChargeType());
    }

    public TopViewAwemeRawAd(Long l, AwemeSplashInfo awemeSplashInfo, OmVast omVast, AnoleModel anoleModel, Integer num, AdStyleActionModel adStyleActionModel) {
        this.adId = l;
        this.splashInfo = awemeSplashInfo;
        this.omVast = omVast;
        this.anoleModel = anoleModel;
        this.brandSafety = num;
        this.adStyleActionModel = adStyleActionModel;
    }
}
