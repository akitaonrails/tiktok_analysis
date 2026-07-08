package com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model;

import X.C01GW;
import X.C09CT;
import X.C2189331AmJ;
import X.C2245311CuP;
import X.C452501pT;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model.CorrespondPostRollAdData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* JADX INFO: loaded from: classes34.dex */
public final class RankData implements Serializable {
    public static final C2189331AmJ Companion = new C2189331AmJ();
    public static final C01GW<Boolean> prunePitayaInputOptimization$delegate = C452501pT.LIZIZ(new C2245311CuP());
    public final transient Aweme LL;
    public final transient boolean LLILLJJLI;

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("commerce_rerank_info")
    public final CommerceRerankInfo commerceRerankInfo;

    @C09CT("is_ecom")
    public Boolean isEcom;

    @C09CT("music_begin_time_in_ms")
    public final Integer musicBeginTimeInMs;

    @C09CT("music_end_time_in_ms")
    public final Integer musicEndTimeInMs;

    @C09CT("raw_ad_data")
    public final RawAdData rawAd;

    @C09CT("roll_ad_data")
    public CorrespondPostRollAdData rollAdData;

    @C09CT("roll_type")
    public int rollType;

    public static final RankData transAwemeToRankData(Aweme aweme) {
        Companion.getClass();
        return C2189331AmJ.LIZIZ(aweme);
    }

    public final String getAid() {
        return this.aid;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final CommerceRerankInfo getCommerceRerankInfo() {
        return this.commerceRerankInfo;
    }

    public final Integer getMusicBeginTimeInMs() {
        return this.musicBeginTimeInMs;
    }

    public final Integer getMusicEndTimeInMs() {
        return this.musicEndTimeInMs;
    }

    public final Aweme getOriginItem() {
        return this.LL;
    }

    public final RawAdData getRawAd() {
        return this.rawAd;
    }

    public final CorrespondPostRollAdData getRollAdData() {
        return this.rollAdData;
    }

    public final int getRollType() {
        return this.rollType;
    }

    public final boolean isAd() {
        return this.LLILLJJLI;
    }

    public final Boolean isEcom() {
        return this.isEcom;
    }

    public final void setEcom(Boolean bool) {
        this.isEcom = bool;
    }

    public final void setRollAdData(CorrespondPostRollAdData correspondPostRollAdData) {
        this.rollAdData = correspondPostRollAdData;
    }

    public final void setRollType(int i) {
        this.rollType = i;
    }

    public RankData(String str, int i, Integer num, Integer num2, CommerceRerankInfo commerceRerankInfo, Aweme aweme, RawAdData rawAdData, int i2, CorrespondPostRollAdData correspondPostRollAdData, Boolean bool) {
        this.aid = str;
        this.awemeType = i;
        this.musicBeginTimeInMs = num;
        this.musicEndTimeInMs = num2;
        this.commerceRerankInfo = commerceRerankInfo;
        this.LL = aweme;
        this.rawAd = rawAdData;
        this.rollType = i2;
        this.rollAdData = correspondPostRollAdData;
        this.isEcom = bool;
        this.LLILLJJLI = aweme.isAd();
    }
}
