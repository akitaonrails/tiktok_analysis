package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class EOY2025Experiment {
    public static final EOY2025Config LIZ = new EOY2025Config(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(291));

    public static final class EOY2025Config {

        @C09CT("create_preview_type")
        public final int createPreviewType;

        @C09CT("enable_celebration")
        public final int enableCelebration;

        @C09CT("enable_create_anchor_entrance")
        public final int enableCreateAnchorEntrance;

        @C09CT("enable_create_tab_entrance")
        public final int enableCreateTabEntrance;

        @C09CT("enable_post_card_entrance")
        public final int enablePostCardEntrance;

        @C09CT("enable_profile_entrance")
        public final int enableProfileEntrance;

        @C09CT("max_material_duration")
        public final int maxMaterialDuration;

        @C09CT("max_materials_num")
        public final int maxMaterialsNum;

        @C09CT("template_group_id")
        public final int templateGroupId;

        public EOY2025Config() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0);
        }

        public EOY2025Config(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.enableCelebration = i;
            this.createPreviewType = i2;
            this.enableCreateTabEntrance = i3;
            this.enableProfileEntrance = i4;
            this.enablePostCardEntrance = i5;
            this.enableCreateAnchorEntrance = i6;
            this.maxMaterialsNum = i7;
            this.maxMaterialDuration = i8;
            this.templateGroupId = i9;
        }
    }
}
