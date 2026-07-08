package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcSeaPdpPreloadSceneModel {

    @C09CT("delay")
    public final Long delay;

    @C09CT("tasks")
    public final List<ECSeaPdpPreloadCardModel> tasks;

    public EcSeaPdpPreloadSceneModel() {
        this(null, null);
    }

    public EcSeaPdpPreloadSceneModel(Long l, List<ECSeaPdpPreloadCardModel> list) {
        this.delay = l;
        this.tasks = list;
    }
}
