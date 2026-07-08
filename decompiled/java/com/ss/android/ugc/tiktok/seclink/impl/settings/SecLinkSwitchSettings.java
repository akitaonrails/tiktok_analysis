package com.ss.android.ugc.tiktok.seclink.impl.settings;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SecLinkSwitchSettings {
    public static final SeclinkSwitch LIZ = new SeclinkSwitch(false, 1000, new ArrayList());

    public static SeclinkSwitch LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SeclinkSwitch seclinkSwitch = LIZ;
            SeclinkSwitch seclinkSwitch2 = (SeclinkSwitch) settingsManagerLIZLLL.LJIIIIZZ("force_seclink_sync_firstjump", SeclinkSwitch.class, seclinkSwitch);
            return seclinkSwitch2 != null ? seclinkSwitch2 : seclinkSwitch;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }

    public static final class SeclinkSwitch {

        @C09CT("sync_firstjump_switch")
        public final boolean enable;

        @C09CT("sync_timeout")
        public final long timeout;

        @C09CT("sync_white_list")
        public final List<String> white_list;

        public SeclinkSwitch() {
            this(false, 1000L, new ArrayList());
        }

        public SeclinkSwitch(boolean z, long j, List<String> list) {
            this.enable = z;
            this.timeout = j;
            this.white_list = list;
        }
    }
}
