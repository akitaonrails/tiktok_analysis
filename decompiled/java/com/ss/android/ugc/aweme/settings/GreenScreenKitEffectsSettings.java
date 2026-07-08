package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class GreenScreenKitEffectsSettings {
    public static final /* synthetic */ int LIZ = 0;

    public static final class GreenScreenEffect {

        @C09CT("effect_name")
        public final String effectName;

        @C09CT("resource_id")
        public final String resourceID;

        public GreenScreenEffect(String str, String str2) {
            this.effectName = str;
            this.resourceID = str2;
        }
    }

    public static final class GreenScreenKitEffectsModel {

        @C09CT("green_screen_image_effects")
        public final List<GreenScreenEffect> greenScreenImageEffects;

        @C09CT("green_screen_video_effects")
        public final List<GreenScreenEffect> greenScreenVideoEffects;

        public GreenScreenKitEffectsModel(List<GreenScreenEffect> list, List<GreenScreenEffect> list2) {
            this.greenScreenVideoEffects = list;
            this.greenScreenImageEffects = list2;
        }
    }
}
