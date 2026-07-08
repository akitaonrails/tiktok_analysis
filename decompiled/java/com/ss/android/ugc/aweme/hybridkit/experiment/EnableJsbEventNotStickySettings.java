package com.ss.android.ugc.aweme.hybridkit.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes24.dex */
public final class EnableJsbEventNotStickySettings {
    public static final EnableJsbEventNotStickyModel LIZ = new EnableJsbEventNotStickyModel(false, 300000);

    public static final EnableJsbEventNotStickyModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EnableJsbEventNotStickyModel enableJsbEventNotStickyModel = LIZ;
        EnableJsbEventNotStickyModel enableJsbEventNotStickyModel2 = (EnableJsbEventNotStickyModel) settingsManagerLIZLLL.LJIIIIZZ("enable_jsb_event_not_sticky", EnableJsbEventNotStickyModel.class, enableJsbEventNotStickyModel);
        return enableJsbEventNotStickyModel2 != null ? enableJsbEventNotStickyModel2 : enableJsbEventNotStickyModel;
    }

    public static final class EnableJsbEventNotStickyModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("eventEffectiveDuration")
        public final long eventEffectiveDuration;

        public EnableJsbEventNotStickyModel() {
            this(false, 300000L);
        }

        public EnableJsbEventNotStickyModel(boolean z, long j) {
            this.enable = z;
            this.eventEffectiveDuration = j;
        }
    }
}
