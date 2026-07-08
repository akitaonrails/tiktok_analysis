package com.ss.android.ugc.aweme.search.source.neo.model;

import X.C09CT;
import X.C682520Qpu;
import defpackage.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EffectJsonData {

    @C09CT("creation_feed_scene_info")
    public final q0<FeedSceneInfo> creationFeedSceneInfo;

    @C09CT("search_effect_scene_info")
    public final q0<SearchSessionData> searchEffectSceneInfo;

    public EffectJsonData() {
        this(null, null, 3, null);
    }

    public EffectJsonData(q0<SearchSessionData> q0Var, q0<FeedSceneInfo> q0Var2) {
        this.searchEffectSceneInfo = q0Var;
        this.creationFeedSceneInfo = q0Var2;
    }

    public EffectJsonData(q0 q0Var, q0 q0Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var = new q0(C682520Qpu.LIZIZ().effectSceneNum);
        }
        if ((i & 2) != 0) {
            C682520Qpu.LIZ.getClass();
            q0Var2 = new q0(C682520Qpu.LIZ());
        }
        this(q0Var, q0Var2);
    }
}
