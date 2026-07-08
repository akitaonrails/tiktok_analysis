package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C682520Qpu;
import defpackage.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchSessionData {

    @C09CT("search_id_info")
    public final q0<SearchSceneInfo> searchIdInfo;

    @C09CT("search_session_id")
    public final String searchSessionId;

    public SearchSessionData() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSessionData)) {
            return false;
        }
        SearchSessionData searchSessionData = (SearchSessionData) obj;
        return Intrinsics.LJFF(this.searchSessionId, searchSessionData.searchSessionId) && Intrinsics.LJFF(this.searchIdInfo, searchSessionData.searchIdInfo);
    }

    public SearchSessionData(String str, q0<SearchSceneInfo> q0Var) {
        this.searchSessionId = str;
        this.searchIdInfo = q0Var;
    }

    public SearchSessionData(String str, q0 q0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var = new q0(C682520Qpu.LIZIZ().effectSceneSearchIdNum);
        }
        this(str, q0Var);
    }
}
