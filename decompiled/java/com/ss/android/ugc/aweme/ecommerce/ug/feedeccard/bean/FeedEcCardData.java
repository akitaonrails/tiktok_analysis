package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.ug.btm.BcmStandardTrackData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class FeedEcCardData {
    public FeedEcCardConfig LIZ;
    public FeedEcCardStyle LIZIZ;

    @C09CT("bcm_standard_track")
    public final BcmStandardTrackData bcmStandardTrack;

    @C09CT("clip_id")
    public final String cardBgmClipId;

    @C09CT("card_bgm_url")
    public final String cardBgmUrl;

    @C09CT("card_config")
    public final String cardConfigJson;

    @C09CT("card_style")
    public final String cardStyleJson;

    @C09CT("feed_ecom_search_card")
    public final String feedEcomSearchCardJson;

    @C09CT("pack_extra")
    public final String packExtra;

    public FeedEcCardData() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedEcCardData)) {
            return false;
        }
        FeedEcCardData feedEcCardData = (FeedEcCardData) obj;
        return Intrinsics.LJFF(this.cardConfigJson, feedEcCardData.cardConfigJson) && Intrinsics.LJFF(this.cardStyleJson, feedEcCardData.cardStyleJson) && Intrinsics.LJFF(this.cardBgmUrl, feedEcCardData.cardBgmUrl) && Intrinsics.LJFF(this.cardBgmClipId, feedEcCardData.cardBgmClipId) && Intrinsics.LJFF(this.packExtra, feedEcCardData.packExtra) && Intrinsics.LJFF(this.feedEcomSearchCardJson, feedEcCardData.feedEcomSearchCardJson) && Intrinsics.LJFF(this.bcmStandardTrack, feedEcCardData.bcmStandardTrack);
    }

    public FeedEcCardData(String str, String str2, String str3, String str4, String str5, String str6, BcmStandardTrackData bcmStandardTrackData) {
        this.cardConfigJson = str;
        this.cardStyleJson = str2;
        this.cardBgmUrl = str3;
        this.cardBgmClipId = str4;
        this.packExtra = str5;
        this.feedEcomSearchCardJson = str6;
        this.bcmStandardTrack = bcmStandardTrackData;
    }
}
