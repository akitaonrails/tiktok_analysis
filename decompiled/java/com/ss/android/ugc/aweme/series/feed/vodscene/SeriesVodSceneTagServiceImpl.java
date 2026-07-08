package com.ss.android.ugc.aweme.series.feed.vodscene;

import X.AbstractC848400XPy;
import X.C0XQ7;
import X.C13LP;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SeriesVodSceneTagServiceImpl implements ISeriesVodSceneTagService {
    @Override // com.ss.android.ugc.aweme.series.feed.vodscene.ISeriesVodSceneTagService
    public final String LIZ(Aweme aweme) {
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        if (aweme == null) {
            return null;
        }
        if (aweme.isPaidContent && (paidContentInfo2 = aweme.mPaidContentInfo) != null && paidContentInfo2.getCategory() == 1) {
            return "pgc_drama";
        }
        if (!aweme.isPaidContent || (paidContentInfo = aweme.mPaidContentInfo) == null || paidContentInfo.getCategory() != 0) {
            return null;
        }
        return "pgc_series";
    }

    @Override // com.ss.android.ugc.aweme.series.feed.vodscene.ISeriesVodSceneTagService
    public final String LIZIZ(Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String mixId;
        if (aweme == null) {
            return null;
        }
        HashMap<String, String> mobParams = aweme.getMobParams();
        if (mobParams != null) {
            str = mobParams.get("enter_from");
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "homepage_series")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        HashMap<String, String> mobParams2 = aweme.getMobParams();
        if (mobParams2 != null) {
            str2 = mobParams2.get("is_series_continuation_play");
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, "1")) {
            arrayList.add("pgc_homepage_series_continue");
        }
        PlayListInfo playListInfo = aweme.playlist_info;
        if (playListInfo != null && (mixId = playListInfo.getMixId()) != null && mixId.length() != 0) {
            arrayList.add("pgc_homepage_series_playlist");
        }
        HashMap<String, String> mobParams3 = aweme.getMobParams();
        if (mobParams3 != null) {
            str3 = mobParams3.get("pgc_first_video");
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "1")) {
            arrayList.add("pgc_first_video");
        }
        HashMap<String, String> mobParams4 = aweme.getMobParams();
        if (mobParams4 != null) {
            str4 = mobParams4.get("pgc_preload");
        } else {
            str4 = null;
        }
        if (Intrinsics.LJFF(str4, "1")) {
            arrayList.add("pgc_preload");
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str5 = "user_logined";
        } else {
            str5 = "user_unlogined";
        }
        arrayList.add(str5);
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62);
    }
}
