package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSpot implements Serializable {
    public static final int $stable = 8;

    @C09CT("ala_src")
    public final String alaSrc;

    @C09CT("hotspot_items")
    public List<? extends Aweme> awemeCards;

    @C09CT("doc_id")
    public String docId;

    @C09CT("is_hotspot_degradation")
    public final boolean isHotspotDegradation;

    @C09CT("hotspot")
    public final SearchSpotInfo searchSpotInfo;

    public int hashCode() {
        SearchSpotInfo searchSpotInfo = this.searchSpotInfo;
        if (searchSpotInfo != null) {
            return searchSpotInfo.hashCode();
        }
        return 0;
    }

    public final String getAlaSrc() {
        return this.alaSrc;
    }

    public final List<Aweme> getAwemeCards() {
        return this.awemeCards;
    }

    public final String getDocId() {
        return this.docId;
    }

    public final SearchSpotInfo getSearchSpotInfo() {
        return this.searchSpotInfo;
    }

    public final boolean isHotspotDegradation() {
        return this.isHotspotDegradation;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(SearchSpot.class, cls)) {
            return false;
        }
        return Intrinsics.LJFF(this.searchSpotInfo, ((SearchSpot) obj).searchSpotInfo);
    }

    public final void setAwemeCards(List<? extends Aweme> list) {
        this.awemeCards = list;
    }

    public final void setDocId(String str) {
        this.docId = str;
    }
}
