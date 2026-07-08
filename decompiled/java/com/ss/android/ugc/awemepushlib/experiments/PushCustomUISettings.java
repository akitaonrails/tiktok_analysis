package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PushCustomUISettings {
    public static final MetaData LIZ = new MetaData(true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(184));

    public static final class MetaData {

        @C09CT("can_add_video_play_icon")
        public final boolean canAddVideoPlayIcon;

        @C09CT("can_custom_group_msg")
        public final boolean canCustomGroup;

        public MetaData() {
            this(true, true);
        }

        public MetaData(boolean z, boolean z2) {
            this.canAddVideoPlayIcon = z;
            this.canCustomGroup = z2;
        }
    }
}
