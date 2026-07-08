package com.ss.android.ugc.aweme.ecommerce.performance;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class EcPerfCollectConfigModel {

    @C09CT("allow_scene_list")
    public final List<EcPerfSceneConfig> allowSceneList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("rate")
    public final float rate;

    public EcPerfCollectConfigModel() {
        this(false, null, 0.0f, 7, null);
    }

    public EcPerfCollectConfigModel(boolean z, List<EcPerfSceneConfig> list, float f) {
        this.enable = z;
        this.allowSceneList = list;
        this.rate = f;
    }

    public EcPerfCollectConfigModel(boolean z, List list, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list, (i & 4) != 0 ? 0.0f : f);
    }
}
