package com.ss.android.ugc.aweme.bean;

import X.C09CT;
import X.EnumC1596540reG;
import com.bytedance.scene.Scene;
import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class MixRankSkylightSceneResponse implements Serializable {

    @C09CT("skylight_scene_business_control")
    public final MixRankSkylightBusinessControl businessControl;

    @C09CT("skylight_scene_page_control")
    public final MixRankSkylightPageControl pageControl;

    @C09CT(Scene.SCENE_SERVICE)
    public final long scene;

    public MixRankSkylightSceneResponse() {
        this(EnumC1596540reG.UNDEFINED.getValue(), null, null);
    }

    public final MixRankSkylightSceneResponse copy(long j, MixRankSkylightPageControl mixRankSkylightPageControl, MixRankSkylightBusinessControl mixRankSkylightBusinessControl) {
        return new MixRankSkylightSceneResponse(j, mixRankSkylightPageControl, mixRankSkylightBusinessControl);
    }

    public MixRankSkylightSceneResponse(long j, MixRankSkylightPageControl mixRankSkylightPageControl, MixRankSkylightBusinessControl mixRankSkylightBusinessControl) {
        this.scene = j;
        this.pageControl = mixRankSkylightPageControl;
        this.businessControl = mixRankSkylightBusinessControl;
    }
}
