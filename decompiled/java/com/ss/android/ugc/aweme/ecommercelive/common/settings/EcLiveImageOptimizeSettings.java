package com.ss.android.ugc.aweme.ecommercelive.common.settings;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import com.bytedance.scene.Scene;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class EcLiveImageOptimizeSettings {
    public static final EcLiveImageOptimizeSettingsConfig LIZ = new EcLiveImageOptimizeSettingsConfig(C13BV.INSTANCE);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(153));

    public static final class EcLiveImageOptimizeSettingsConfig {

        @C09CT(Scene.SCENE_SERVICE)
        public List<String> sceneList;

        public EcLiveImageOptimizeSettingsConfig() {
            this(null, 1, null);
        }

        public EcLiveImageOptimizeSettingsConfig(List<String> list) {
            this.sceneList = list;
        }

        public EcLiveImageOptimizeSettingsConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
