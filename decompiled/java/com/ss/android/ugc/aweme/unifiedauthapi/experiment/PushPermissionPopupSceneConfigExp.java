package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C01GW;
import X.C09CT;
import X.C1869560ykc;
import X.C1869570ykd;
import X.C1869580yke;
import X.C1869590ykf;
import X.C2188811AlT;
import X.C452501pT;

/* JADX INFO: loaded from: classes29.dex */
public final class PushPermissionPopupSceneConfigExp {
    public static final PushPermissionPopupSceneConfigExp INSTANCE = new PushPermissionPopupSceneConfigExp();
    public static final SceneConfig DEFAULT = new SceneConfig(5, -1, false);
    public static final C01GW expValue$delegate = C452501pT.LIZIZ(new C1869580yke());
    public static final C01GW feedVVThreshold$delegate = C452501pT.LIZIZ(new C1869560ykc());
    public static final C01GW lowCvrtSceneLimit$delegate = C452501pT.LIZIZ(new C1869590ykf());
    public static final C01GW lowCvrtScene1stLaunchCtrl$delegate = C452501pT.LIZIZ(new C1869570ykd());

    public final SceneConfig getExpValue() {
        return (SceneConfig) expValue$delegate.getValue();
    }

    public final int getFeedVVThreshold() {
        return ((Number) feedVVThreshold$delegate.getValue()).intValue();
    }

    public final boolean getLowCvrtScene1stLaunchCtrl() {
        return ((Boolean) lowCvrtScene1stLaunchCtrl$delegate.getValue()).booleanValue();
    }

    public final int getLowCvrtSceneLimit() {
        return ((Number) lowCvrtSceneLimit$delegate.getValue()).intValue();
    }

    public final SceneConfig getDEFAULT() {
        return DEFAULT;
    }

    public static final class SceneConfig {

        @C09CT("scene_feed_vv_count")
        public final int feedVVCount;

        @C09CT("low_cvrt_rate_scene_1_launch_ctrl")
        public final boolean lowCvrtScene1stLaunchCtrl;

        @C09CT("low_cvrt_rate_scene_limits")
        public final int lowCvrtSceneLimit;

        public SceneConfig() {
            this(5, -1, false);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SceneConfig(feedVVCount=");
            sbLIZ.append(this.feedVVCount);
            sbLIZ.append(", lowCvrtSceneLimit=");
            sbLIZ.append(this.lowCvrtSceneLimit);
            sbLIZ.append(", lowCvrtScene1stLaunchCtrl=");
            sbLIZ.append(this.lowCvrtScene1stLaunchCtrl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SceneConfig(int i, int i2, boolean z) {
            this.feedVVCount = i;
            this.lowCvrtSceneLimit = i2;
            this.lowCvrtScene1stLaunchCtrl = z;
        }
    }
}
