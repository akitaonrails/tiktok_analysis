package com.ss.android.ugc.aweme.setting.model;

import X.C01GW;
import X.C09CT;
import X.C1373430lqP;
import X.C452501pT;
import X.EnumC1373410lqN;
import com.bytedance.scene.Scene;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class ShareConfig {
    public static final C01GW<Map<String, EnumC1373410lqN>> LIZ = C452501pT.LIZIZ(new C1373430lqP());

    @C09CT(Scene.SCENE_SERVICE)
    public int scene;

    @C09CT("share_desc_enable_mode")
    public List<Integer> shareDescEnableModes;

    @C09CT("share_mode")
    public int shareMode = -1;
}
