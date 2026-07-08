package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C098200Yq;
import X.C09CT;
import X.C0P8T;
import X.C189200o6;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C682520Qpu;
import X.C682540Qpw;
import X.C7740030o;
import X.InterfaceC1618170sD9;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class CreationSearchSignalState implements InterfaceC1618170sD9<CreationSearchSignalState> {

    @C09CT("creation_feed_scene_info")
    public final q0<FeedSceneInfo> creationFeedSceneInfo;

    @C09CT("creation_poi_feed_scene_info")
    public final q0<FeedSceneInfo> creationPoiFeedSceneInfo;

    @C09CT("creation_poi_recommend_scene_info")
    public final q0<CreationPoiClickInfo> creationPoiRecommendSceneInfo;

    @C09CT("creation_poi_search_scene_info")
    public final q0<CreationPoiSearchSessionInfo> creationPoiSearchSceneInfo;

    @C09CT("feed_total_play_time_temp_info")
    public final ConcurrentHashMap<String, Long> feedTotalPlayTimeTempInfo;

    @C09CT("query_list")
    public List<LastSearch> queryList;

    @C09CT("search_effect_scene_info")
    public final q0<SearchSessionData> searchEffectSceneInfo;

    @C09CT("search_music_scene_info")
    public q0<SearchSceneInfo> searchMusicSceneInfo;

    public CreationSearchSignalState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @Override // X.InterfaceC1282004zy
    public final boolean checkExtraParamKey() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationSearchSignalState)) {
            return false;
        }
        CreationSearchSignalState creationSearchSignalState = (CreationSearchSignalState) obj;
        return Intrinsics.LJFF(this.queryList, creationSearchSignalState.queryList) && Intrinsics.LJFF(this.searchMusicSceneInfo, creationSearchSignalState.searchMusicSceneInfo) && Intrinsics.LJFF(this.searchEffectSceneInfo, creationSearchSignalState.searchEffectSceneInfo) && Intrinsics.LJFF(this.creationFeedSceneInfo, creationSearchSignalState.creationFeedSceneInfo) && Intrinsics.LJFF(this.creationPoiRecommendSceneInfo, creationSearchSignalState.creationPoiRecommendSceneInfo) && Intrinsics.LJFF(this.creationPoiFeedSceneInfo, creationSearchSignalState.creationPoiFeedSceneInfo) && Intrinsics.LJFF(this.feedTotalPlayTimeTempInfo, creationSearchSignalState.feedTotalPlayTimeTempInfo) && Intrinsics.LJFF(this.creationPoiSearchSceneInfo, creationSearchSignalState.creationPoiSearchSceneInfo);
    }

    public final int hashCode() {
        return (((((((((((((this.queryList.hashCode() * 31) + this.searchMusicSceneInfo.hashCode()) * 31) + this.searchEffectSceneInfo.hashCode()) * 31) + this.creationFeedSceneInfo.hashCode()) * 31) + this.creationPoiRecommendSceneInfo.hashCode()) * 31) + this.creationPoiFeedSceneInfo.hashCode()) * 31) + this.feedTotalPlayTimeTempInfo.hashCode()) * 31) + this.creationPoiSearchSceneInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationSearchSignalState(queryList=");
        sbLIZ.append(this.queryList);
        sbLIZ.append(", searchMusicSceneInfo=");
        sbLIZ.append(this.searchMusicSceneInfo);
        sbLIZ.append(", searchEffectSceneInfo=");
        sbLIZ.append(this.searchEffectSceneInfo);
        sbLIZ.append(", creationFeedSceneInfo=");
        sbLIZ.append(this.creationFeedSceneInfo);
        sbLIZ.append(", creationPoiRecommendSceneInfo=");
        sbLIZ.append(this.creationPoiRecommendSceneInfo);
        sbLIZ.append(", creationPoiFeedSceneInfo=");
        sbLIZ.append(this.creationPoiFeedSceneInfo);
        sbLIZ.append(", feedTotalPlayTimeTempInfo=");
        sbLIZ.append(this.feedTotalPlayTimeTempInfo);
        sbLIZ.append(", creationPoiSearchSceneInfo=");
        sbLIZ.append(this.creationPoiSearchSceneInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new EffectJsonData(this.searchEffectSceneInfo, this.creationFeedSceneInfo));
    }

    public final String LIZJ() {
        return GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), new MusicJsonData(this.queryList, this.searchMusicSceneInfo, this.creationFeedSceneInfo));
    }

    public final String LJ() {
        Object c098200Yq;
        try {
            c098200Yq = C7740030o.LIZ().getGson().LJIILL(new PoiJsonData(this.creationPoiRecommendSceneInfo, this.creationPoiFeedSceneInfo, this.creationPoiSearchSceneInfo));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
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

    public static CreationSearchSignalState LIZ(CreationSearchSignalState creationSearchSignalState, q0 q0Var, q0 q0Var2, ConcurrentHashMap concurrentHashMap, q0 q0Var3, int i) {
        List<LastSearch> list;
        q0<SearchSceneInfo> q0Var4;
        q0<SearchSessionData> q0Var5;
        q0 q0Var6 = q0Var3;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        q0 q0Var7 = q0Var2;
        q0 q0Var8 = q0Var;
        q0<FeedSceneInfo> q0Var9 = null;
        if ((i & 1) != 0) {
            list = creationSearchSignalState.queryList;
        } else {
            list = null;
        }
        if ((i & 2) != 0) {
            q0Var4 = creationSearchSignalState.searchMusicSceneInfo;
        } else {
            q0Var4 = null;
        }
        if ((i & 4) != 0) {
            q0Var5 = creationSearchSignalState.searchEffectSceneInfo;
        } else {
            q0Var5 = null;
        }
        if ((i & 8) != 0) {
            q0Var9 = creationSearchSignalState.creationFeedSceneInfo;
        }
        if ((i & 16) != 0) {
            q0Var8 = creationSearchSignalState.creationPoiRecommendSceneInfo;
        }
        if ((i & 32) != 0) {
            q0Var7 = creationSearchSignalState.creationPoiFeedSceneInfo;
        }
        if ((i & 64) != 0) {
            concurrentHashMap2 = creationSearchSignalState.feedTotalPlayTimeTempInfo;
        }
        if ((i & 128) != 0) {
            q0Var6 = creationSearchSignalState.creationPoiSearchSceneInfo;
        }
        creationSearchSignalState.getClass();
        return new CreationSearchSignalState(list, q0Var4, q0Var5, q0Var9, q0Var8, q0Var7, concurrentHashMap2, q0Var6);
    }

    public CreationSearchSignalState(List<LastSearch> list, q0<SearchSceneInfo> q0Var, q0<SearchSessionData> q0Var2, q0<FeedSceneInfo> q0Var3, q0<CreationPoiClickInfo> q0Var4, q0<FeedSceneInfo> q0Var5, ConcurrentHashMap<String, Long> concurrentHashMap, q0<CreationPoiSearchSessionInfo> q0Var6) {
        this.queryList = list;
        this.searchMusicSceneInfo = q0Var;
        this.searchEffectSceneInfo = q0Var2;
        this.creationFeedSceneInfo = q0Var3;
        this.creationPoiRecommendSceneInfo = q0Var4;
        this.creationPoiFeedSceneInfo = q0Var5;
        this.feedTotalPlayTimeTempInfo = concurrentHashMap;
        this.creationPoiSearchSceneInfo = q0Var6;
        C0P8T.LIZ();
    }

    public CreationSearchSignalState(List list, q0 q0Var, q0 q0Var2, q0 q0Var3, q0 q0Var4, q0 q0Var5, ConcurrentHashMap concurrentHashMap, q0 q0Var6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var = new q0(C682520Qpu.LIZIZ().musicSceneNum);
        }
        if ((i & 4) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var2 = new q0(C682520Qpu.LIZIZ().effectSceneNum);
        }
        if ((i & 8) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var3 = new q0(C682520Qpu.LIZ());
        }
        if ((i & 16) != 0) {
            C682540Qpw.LIZ.getClass();
            q0Var4 = new q0(C682540Qpw.LIZ().poiRecommendSceneNum);
        }
        if ((i & 32) != 0) {
            C682540Qpw.LIZ.getClass();
            q0Var5 = new q0(C682540Qpw.LIZ().poiFeedSceneNum);
        }
        concurrentHashMap = (i & 64) != 0 ? new ConcurrentHashMap() : concurrentHashMap;
        if ((i & 128) != 0) {
            C682540Qpw.LIZ.getClass();
            q0Var6 = new q0(C682540Qpw.LIZ().poiSearchSceneSessionNum);
        }
        this(list, q0Var, q0Var2, q0Var3, q0Var4, q0Var5, concurrentHashMap, q0Var6);
    }
}
