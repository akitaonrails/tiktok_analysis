package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C0QO2;
import com.ss.android.ugc.aweme.search.source.utils.RecommendInfoConfig;
import defpackage.q0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchResult {
    public final transient String LIZ;
    public final transient String LIZIZ;

    @C09CT("gid_list")
    public final List<String> gidList;

    @C09CT("query")
    public final String query;

    @C09CT("source")
    public final String source;

    public SearchResult() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj;
        return Intrinsics.LJFF(this.query, searchResult.query) && Intrinsics.LJFF(this.source, searchResult.source) && Intrinsics.LJFF(this.LIZ, searchResult.LIZ) && Intrinsics.LJFF(this.LIZIZ, searchResult.LIZIZ) && Intrinsics.LJFF(this.gidList, searchResult.gidList);
    }

    public SearchResult(String str, String str2, String str3, String str4, List<String> list) {
        this.query = str;
        this.source = str2;
        this.LIZ = str3;
        this.LIZIZ = str4;
        this.gidList = list;
    }

    public SearchResult(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        List q0Var = list;
        String str5 = str3;
        String str6 = str2;
        String str7 = (i & 1) != 0 ? "" : str;
        str6 = (i & 2) != 0 ? "" : str6;
        str5 = (i & 4) != 0 ? "" : str5;
        String str8 = (i & 8) == 0 ? str4 : "";
        if ((i & 16) != 0) {
            C0QO2.LIZ.getClass();
            q0Var = new q0(((RecommendInfoConfig) C0QO2.LIZJ.getValue()).maxGidCount);
        }
        this(str7, str6, str5, str8, q0Var);
    }
}
