package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C0P8T;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C682520Qpu;
import X.InterfaceC1618170sD9;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBehaviorSignalState implements InterfaceC1618170sD9<SearchBehaviorSignalState> {

    @C09CT("feed_scene_info")
    public final q0<FeedSceneInfo> feedSceneInfo;

    @C09CT("query_list")
    public List<LastSearch> queryList;

    @C09CT("search_scene_info")
    public final q0<SearchSceneInfo> searchSceneInfo;

    public SearchBehaviorSignalState() {
        this(null, null, null, 7, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBehaviorSignalState)) {
            return false;
        }
        SearchBehaviorSignalState searchBehaviorSignalState = (SearchBehaviorSignalState) obj;
        return Intrinsics.LJFF(this.queryList, searchBehaviorSignalState.queryList) && Intrinsics.LJFF(this.searchSceneInfo, searchBehaviorSignalState.searchSceneInfo) && Intrinsics.LJFF(this.feedSceneInfo, searchBehaviorSignalState.feedSceneInfo);
    }

    public final int hashCode() {
        return (((this.queryList.hashCode() * 31) + this.searchSceneInfo.hashCode()) * 31) + this.feedSceneInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchBehaviorSignalState(queryList=");
        sbLIZ.append(this.queryList);
        sbLIZ.append(", searchSceneInfo=");
        sbLIZ.append(this.searchSceneInfo);
        sbLIZ.append(", feedSceneInfo=");
        sbLIZ.append(this.feedSceneInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> filteredParams() {
        return keyParams();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> getExtraParam() {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC1282004zy
    public final Map<String, Object> keyParams() {
        return C2097608Jq.LJ();
    }

    public SearchBehaviorSignalState(List<LastSearch> list, q0<SearchSceneInfo> q0Var, q0<FeedSceneInfo> q0Var2) {
        this.queryList = list;
        this.searchSceneInfo = q0Var;
        this.feedSceneInfo = q0Var2;
        C0P8T.LIZ();
    }

    public SearchBehaviorSignalState(List list, q0 q0Var, q0 q0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var = new q0(C682520Qpu.LIZIZ().searchSceneNum);
        }
        if ((i & 4) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var2 = new q0(C682520Qpu.LIZ());
        }
        this(list, q0Var, q0Var2);
    }
}
