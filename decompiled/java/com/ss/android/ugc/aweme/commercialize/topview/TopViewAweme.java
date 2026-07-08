package com.ss.android.ugc.aweme.commercialize.topview;

import X.C09CT;
import X.InterfaceC1018210cbT;
import com.ss.android.ugc.aweme.feed.model.Video;

/* JADX INFO: loaded from: classes14.dex */
public final class TopViewAweme implements InterfaceC1018210cbT {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("raw_ad_data")
    public final TopViewAwemeRawAd awemeRawAd;

    @C09CT("aweme_type")
    public final int awemeType;

    @C09CT("is_ads")
    public final boolean isAd;

    @C09CT("video")
    public final Video video;

    @Override // X.InterfaceC1018210cbT
    public final Video LIZ() {
        return this.video;
    }

    @Override // X.InterfaceC1018210cbT
    public final TopViewAwemeRawAd LIZIZ() {
        return this.awemeRawAd;
    }

    @Override // X.InterfaceC1018210cbT
    public final boolean LLZZZIL() {
        return this.isAd;
    }

    @Override // X.InterfaceC1018210cbT
    public final String getAid() {
        return this.aid;
    }

    @Override // X.InterfaceC1018210cbT
    public final int getAwemeType() {
        return this.awemeType;
    }

    public TopViewAweme(String str, boolean z, TopViewAwemeRawAd topViewAwemeRawAd, Video video, int i) {
        this.aid = str;
        this.isAd = z;
        this.awemeRawAd = topViewAwemeRawAd;
        this.video = video;
        this.awemeType = i;
    }
}
