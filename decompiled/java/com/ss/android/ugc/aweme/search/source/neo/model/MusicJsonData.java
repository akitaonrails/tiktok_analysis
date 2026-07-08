package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C682520Qpu;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicJsonData {

    @C09CT("creation_feed_scene_info")
    public final q0<FeedSceneInfo> creationFeedSceneInfo;

    @C09CT("query_list")
    public List<LastSearch> queryList;

    @C09CT("search_music_scene_info")
    public q0<SearchSceneInfo> searchMusicSceneInfo;

    public MusicJsonData() {
        this(null, null, null, 7, null);
    }

    public MusicJsonData(List<LastSearch> list, q0<SearchSceneInfo> q0Var, q0<FeedSceneInfo> q0Var2) {
        this.queryList = list;
        this.searchMusicSceneInfo = q0Var;
        this.creationFeedSceneInfo = q0Var2;
    }

    public MusicJsonData(List list, q0 q0Var, q0 q0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        if ((i & 2) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var = new q0(C682520Qpu.LIZIZ().musicSceneNum);
        }
        if ((i & 4) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var2 = new q0(C682520Qpu.LIZ());
        }
        this(list, q0Var, q0Var2);
    }
}
