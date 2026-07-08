package com.ss.android.ugc.aweme.search.common.signal;

import X.C01GW;
import X.C09CT;
import X.C13LQ;
import X.C2188811AlT;
import X.C452501pT;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.search.source.neo.model.FeedSceneInfo;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSugContextBuilder {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(171));
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"normal_search", "search_sug", "search_history", "voice_input"});

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState r18) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.common.signal.SearchSugContextBuilder.LIZ(com.ss.android.ugc.aweme.search.source.neo.model.SearchBehaviorSignalState):java.lang.String");
    }

    public static final class SearchSugContextPayload {

        @C09CT("feed_scene_info")
        public final List<FeedSceneInfo> feedSceneInfo;

        @C09CT("query_list")
        public final List<LastSearch> queryList;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchSugContextPayload)) {
                return false;
            }
            SearchSugContextPayload searchSugContextPayload = (SearchSugContextPayload) obj;
            return Intrinsics.LJFF(this.queryList, searchSugContextPayload.queryList) && Intrinsics.LJFF(this.feedSceneInfo, searchSugContextPayload.feedSceneInfo);
        }

        public final int hashCode() {
            return (this.queryList.hashCode() * 31) + this.feedSceneInfo.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SearchSugContextPayload(queryList=");
            sbLIZ.append(this.queryList);
            sbLIZ.append(", feedSceneInfo=");
            sbLIZ.append(this.feedSceneInfo);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SearchSugContextPayload(List<LastSearch> list, List<FeedSceneInfo> list2) {
            this.queryList = list;
            this.feedSceneInfo = list2;
        }
    }
}
