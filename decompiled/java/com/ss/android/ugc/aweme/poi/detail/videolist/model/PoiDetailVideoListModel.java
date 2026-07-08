package com.ss.android.ugc.aweme.poi.detail.videolist.model;

import X.C09CT;
import X.C1186760gzK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailVideoListModel {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("aweme_cursor")
    public final Long awemeCursor;

    @C09CT("collect_info")
    public final String collectInfo;

    @C09CT("poi_posts_data")
    public final List<C1186760gzK> dataList;

    @C09CT("has_more_aweme")
    public final Integer hasMoreAweme;

    @C09CT("has_more_review")
    public final Integer hasMoreReview;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("post_bottom_bar_style")
    public final int postBottomBarStyle;

    @C09CT("review_cursor")
    public final Long reviewCursor;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailVideoListModel)) {
            return false;
        }
        PoiDetailVideoListModel poiDetailVideoListModel = (PoiDetailVideoListModel) obj;
        return Intrinsics.LJFF(this.dataList, poiDetailVideoListModel.dataList) && Intrinsics.LJFF(this.awemeCursor, poiDetailVideoListModel.awemeCursor) && Intrinsics.LJFF(this.hasMoreAweme, poiDetailVideoListModel.hasMoreAweme) && Intrinsics.LJFF(this.reviewCursor, poiDetailVideoListModel.reviewCursor) && Intrinsics.LJFF(this.hasMoreReview, poiDetailVideoListModel.hasMoreReview) && Intrinsics.LJFF(this.logPb, poiDetailVideoListModel.logPb) && Intrinsics.LJFF(this.collectInfo, poiDetailVideoListModel.collectInfo) && this.postBottomBarStyle == poiDetailVideoListModel.postBottomBarStyle;
    }

    public final List<Aweme> LIZ() {
        List<C1186760gzK> list = this.dataList;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1186760gzK c1186760gzK : list) {
            if (c1186760gzK.LIZ != null) {
                arrayList.add(c1186760gzK);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Aweme aweme = ((C1186760gzK) it2.next()).LIZ;
            if (aweme != null) {
                arrayList2.add(aweme);
            }
        }
        return arrayList2;
    }

    public PoiDetailVideoListModel(List<C1186760gzK> list, Long l, Integer num, Long l2, Integer num2, LogPbBean logPbBean, String str, int i) {
        this.dataList = list;
        this.awemeCursor = l;
        this.hasMoreAweme = num;
        this.reviewCursor = l2;
        this.hasMoreReview = num2;
        this.logPb = logPbBean;
        this.collectInfo = str;
        this.postBottomBarStyle = i;
    }
}
