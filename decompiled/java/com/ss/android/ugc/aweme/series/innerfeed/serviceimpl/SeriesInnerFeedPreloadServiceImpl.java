package com.ss.android.ugc.aweme.series.innerfeed.serviceimpl;

import X.AbstractC1387200mCc;
import X.C1906580ziK;
import X.C19EG;
import android.app.Activity;
import com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity;
import com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService;

/* JADX INFO: loaded from: classes12.dex */
public final class SeriesInnerFeedPreloadServiceImpl implements ISeriesInnerFeedPreloadService {
    @Override // com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService
    public final boolean LIZ() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            return false;
        }
        return activityLIZIZ instanceof SeriesInnerFeedActivity;
    }

    @Override // com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService
    public final boolean LIZJ(C19EG c19eg) {
        return c19eg instanceof SeriesInnerFeedActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LIZIZ(android.content.Context r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, boolean r6) {
        /*
            r3 = this;
            r2 = 0
            if (r6 == 0) goto L3e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.commercialize.model.AdPaidContent r0 = r0.getAdPaidContent()
            if (r0 == 0) goto L4f
            java.lang.String r1 = r0.getCollectionId()
        L13:
            if (r1 == 0) goto L4f
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity> r0 = com.ss.android.ugc.aweme.series.innerfeed.activity.SeriesInnerFeedActivity.class
            r2.<init>(r4, r0)
            java.lang.String r0 = "collection_id"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "video_from"
            java.lang.String r0 = "from_paid_content_detail_video_list_entrance"
            r2.putExtra(r1, r0)
            java.lang.String r1 = r5.getAid()
            java.lang.String r0 = "id"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "is_ads"
            r2.putExtra(r0, r6)
            java.lang.String r1 = "is_intro_or_preview"
            boolean r0 = r5.isPaidContent
            r2.putExtra(r1, r0)
            return r2
        L3e:
            com.ss.android.ugc.aweme.feed.model.PaidContentInfo r0 = r5.mPaidContentInfo
            if (r0 == 0) goto L4f
            long r0 = r0.getPaidCollectionId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r0.toString()
            goto L13
        L4f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.innerfeed.serviceimpl.SeriesInnerFeedPreloadServiceImpl.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, boolean):android.content.Intent");
    }
}
