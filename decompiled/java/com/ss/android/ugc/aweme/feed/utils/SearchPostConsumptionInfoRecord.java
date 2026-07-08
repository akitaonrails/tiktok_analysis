package com.ss.android.ugc.aweme.feed.utils;

import X.C09CT;
import X.C1517310paT;
import X.C1517340paW;
import X.C21141917oP;
import X.C2252061DCq;
import X.C2252091DCt;
import android.util.LruCache;
import com.ss.android.ugc.aweme.experiment.SearchPostRealTimeConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes36.dex */
public final class SearchPostConsumptionInfoRecord implements Serializable {
    public static final int $stable = 8;
    public final transient LruCache<String, C2252091DCt> consumptionActionInfoCache;

    @C09CT("search_id")
    public final String searchId;

    @C09CT("search_query")
    public final String searchKeyword;

    @C09CT("search_type")
    public final String searchSource;

    @C09CT("search_time")
    public final long searchTime;

    @C09CT("search_source")
    public final String searchType;

    public SearchPostConsumptionInfoRecord() {
        this("", "", -1L, null, null);
    }

    public final List<C1517340paW> getConsumptionList() {
        Map<String, C2252091DCt> mapSnapshot = this.consumptionActionInfoCache.snapshot();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C2252091DCt> entry : mapSnapshot.entrySet()) {
            String key = entry.getKey();
            C2252091DCt value = entry.getValue();
            ArrayList arrayList2 = null;
            Long lValueOf = ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLLL(key) != null ? Long.valueOf(r0.intValue()) : null;
            if (value != null) {
                arrayList2 = new ArrayList();
                if (value.bigScreenPlay) {
                    arrayList2.add(new C1517310paT("strict_click", value.bigScreenPlayTimeStamp));
                }
                if (value.playFinish) {
                    arrayList2.add(new C1517310paT("video_play_finish", value.playFinishTimeStamp));
                }
                if (value.postComment) {
                    arrayList2.add(new C1517310paT("post_comment", value.postCommentTimeStamp));
                }
                if (value.digg) {
                    arrayList2.add(new C1517310paT("like", value.diggTimeStamp));
                }
                if (value.share) {
                    arrayList2.add(new C1517310paT("share_video", value.shareTimeStamp));
                }
                if (value.favorite) {
                    arrayList2.add(new C1517310paT("favourite_video", value.favoriteTimeStamp));
                }
                if (value.clickComment) {
                    arrayList2.add(new C1517310paT("click_comment_button", value.clickCommentTimeStamp));
                }
                if (value.follow) {
                    arrayList2.add(new C1517310paT("follow", value.followTimeStamp));
                }
                if (value.enterUser) {
                    arrayList2.add(new C1517310paT("enter_personal_detail", value.enterUserTimeStamp));
                }
                if (value.download) {
                    arrayList2.add(new C1517310paT("download", value.downloadTimeStamp));
                }
            }
            arrayList.add(new C1517340paW(key, lValueOf, arrayList2));
        }
        return arrayList;
    }

    public final void updateConsumeDataCache(String str, C2252061DCq c2252061DCq) {
        boolean z;
        if (c2252061DCq == null) {
            return;
        }
        C2252091DCt c2252091DCt = this.consumptionActionInfoCache.get(str);
        if (c2252091DCt == null) {
            c2252091DCt = new C2252091DCt(false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null, false, null);
        }
        Boolean bool = c2252061DCq.LJIJJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            c2252091DCt.setClickComment(Intrinsics.LJFF(c2252061DCq.LJIJJ, bool2));
            c2252091DCt.setClickCommentTimeStamp(c2252061DCq.LJJJIL);
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJIJ, bool2)) {
            c2252091DCt.setDigg(Intrinsics.LJFF(c2252061DCq.LJIJ, bool2));
            c2252091DCt.setDiggTimeStamp(c2252061DCq.LJJJJ);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJIJIIJIL, bool2)) {
            c2252091DCt.setPlayFinish(Intrinsics.LJFF(c2252061DCq.LJJIJIIJIL, bool2));
            c2252091DCt.setPlayFinishTimeStamp(c2252061DCq.LJJJJI);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJIL, bool2)) {
            c2252091DCt.setShare(Intrinsics.LJFF(c2252061DCq.LJIL, bool2));
            c2252091DCt.setShareTimeStamp(c2252061DCq.LJJJJIZL);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJIII, bool2)) {
            c2252091DCt.setEnterUser(Intrinsics.LJFF(c2252061DCq.LJJIII, bool2));
            c2252091DCt.setEnterUserTimeStamp(c2252061DCq.LJJJJJ);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJIFFI, bool2)) {
            c2252091DCt.setFavorite(Intrinsics.LJFF(c2252061DCq.LJJIFFI, bool2));
            c2252091DCt.setFavoriteTimeStamp(c2252061DCq.LJJJJJL);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJIIJZLJL, bool2)) {
            c2252091DCt.setBigScreenPlay(Intrinsics.LJFF(c2252061DCq.LJJIIJZLJL, bool2));
            c2252091DCt.setBigScreenPlayTimeStamp(c2252061DCq.LJJJJL);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJI, bool2)) {
            c2252091DCt.setFollow(Intrinsics.LJFF(c2252061DCq.LJJI, bool2));
            c2252091DCt.setFollowTimeStamp(c2252061DCq.LJJJJLI);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJIJJLI, bool2)) {
            c2252091DCt.setPostComment(Intrinsics.LJFF(c2252061DCq.LJIJJLI, bool2));
            c2252091DCt.setPostCommentTimeStamp(c2252061DCq.LJJJJLL);
            z = true;
        }
        if (Intrinsics.LJFF(c2252061DCq.LJJ, bool2)) {
            c2252091DCt.setDownload(Intrinsics.LJFF(c2252061DCq.LJJ, bool2));
            c2252091DCt.setDownloadTimeStamp(c2252061DCq.LJJJJZ);
        } else if (!z) {
            return;
        }
        this.consumptionActionInfoCache.put(str, c2252091DCt);
    }

    public SearchPostConsumptionInfoRecord(String str, String str2, long j, String str3, String str4) {
        this.searchId = str;
        this.searchKeyword = str2;
        this.searchTime = j;
        this.searchSource = str3;
        this.searchType = str4;
        this.consumptionActionInfoCache = new LruCache<>(((SearchPostRealTimeConfig) C21141917oP.LIZIZ.getValue()).maxGidLimitPreQuery);
    }
}
