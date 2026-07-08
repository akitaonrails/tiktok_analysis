package com.ss.android.ugc.aweme.api.series;

import X.C2097608Jq;
import com.ss.android.ugc.aweme.commercialize.model.AdPaidContent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CommerceFeedSeriesServiceImpl implements ICommerceFeedSeriesService {
    public String LL;
    public Aweme LLILLJJLI;
    public Map<String, ? extends Object> LLILLL;

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC1010530cP5
    public final Object Mh() {
        return new Object() { // from class: X.05rz
        };
    }

    @Override // com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService
    public final Map<String, Object> K90(String str) {
        if (str == null || !Intrinsics.LJFF(str, this.LL)) {
            return null;
        }
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService
    public final String Op2(String str) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdPaidContent adPaidContent;
        if (str == null || !Intrinsics.LJFF(str, this.LL) || (aweme = this.LLILLJJLI) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adPaidContent = awemeRawAd.getAdPaidContent()) == null) {
            return null;
        }
        return adPaidContent.getCollectionName();
    }

    @Override // com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService
    public final void Q00(Aweme aweme) {
        String string;
        if (aweme.isPaidContent) {
            PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
            if (paidContentInfo != null) {
                string = Long.valueOf(paidContentInfo.getPaidCollectionId()).toString();
            } else {
                string = null;
            }
            this.LL = string;
        }
    }

    @Override // com.ss.android.ugc.aweme.api.series.ICommerceFeedSeriesService
    public final void fA(Aweme aweme) {
        String collectionId;
        Long creativeId;
        AdPaidContent adPaidContent;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String logExtra = null;
        if (awemeRawAd != null && (adPaidContent = awemeRawAd.getAdPaidContent()) != null) {
            collectionId = adPaidContent.getCollectionId();
        } else {
            collectionId = null;
        }
        this.LL = collectionId;
        Pair[] pairArr = new Pair[2];
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            creativeId = awemeRawAd2.getCreativeId();
        } else {
            creativeId = null;
        }
        pairArr[0] = new Pair("creative_id", creativeId);
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            logExtra = awemeRawAd3.getLogExtra();
        }
        pairArr[1] = new Pair("log_extra", logExtra);
        this.LLILLL = C2097608Jq.LJIIIIZZ(pairArr);
        this.LLILLJJLI = aweme;
    }
}
