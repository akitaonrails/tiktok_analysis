package com.ss.android.ugc.aweme.notice.api.ab;

import X.C09CT;
import X.C0C64;

/* JADX INFO: loaded from: classes14.dex */
public final class MultiAccountPopupPanelExp {
    public static final Meta LIZ;
    public static Meta LIZIZ;

    static {
        Meta meta = new Meta(0, false, 0, 0);
        LIZ = meta;
        LIZIZ = (Meta) C0C64.LJIILLIIL().LJJII(Meta.class, meta, "multi_account_push_guide_config", false);
    }

    /* JADX INFO: loaded from: classes29.dex */
    public static final class Meta {

        @C09CT("default_open_setting")
        public final boolean defaultSettingsOn;

        @C09CT("exp_value")
        public final int expValue;

        @C09CT("frequency_control_type")
        public final int frequencyControlType;

        @C09CT("trigger_type")
        public final int triggerType;

        public Meta() {
            this(0, false, 0, 0);
        }

        public Meta(int i, boolean z, int i2, int i3) {
            this.expValue = i;
            this.defaultSettingsOn = z;
            this.triggerType = i2;
            this.frequencyControlType = i3;
        }
    }
}
