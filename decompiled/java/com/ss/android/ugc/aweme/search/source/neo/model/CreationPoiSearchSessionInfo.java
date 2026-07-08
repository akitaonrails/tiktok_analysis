package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import defpackage.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class CreationPoiSearchSessionInfo {

    @C09CT("search_id_info")
    public final q0<CreationPoiSearchIdInfo> searchIdInfo;

    @C09CT("search_session_id")
    public final String searchSessionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationPoiSearchSessionInfo)) {
            return false;
        }
        CreationPoiSearchSessionInfo creationPoiSearchSessionInfo = (CreationPoiSearchSessionInfo) obj;
        return Intrinsics.LJFF(this.searchSessionId, creationPoiSearchSessionInfo.searchSessionId) && Intrinsics.LJFF(this.searchIdInfo, creationPoiSearchSessionInfo.searchIdInfo);
    }

    public CreationPoiSearchSessionInfo(String str, q0<CreationPoiSearchIdInfo> q0Var) {
        this.searchSessionId = str;
        this.searchIdInfo = q0Var;
    }
}
