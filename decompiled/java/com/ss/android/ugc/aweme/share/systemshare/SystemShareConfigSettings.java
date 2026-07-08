package com.ss.android.ugc.aweme.share.systemshare;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class SystemShareConfigSettings {
    public static final SystemShareConfigModel LIZ = new SystemShareConfigModel("https://connect.tiktok-minis.com/assets/share/dm_share_video.png", "https://connect.tiktok-minis.com/assets/share/dm_share_photo.png", "https://connect.tiktok-minis.com/assets/share/dm_share_message.png");

    public static final SystemShareConfigModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            SystemShareConfigModel systemShareConfigModel = LIZ;
            SystemShareConfigModel systemShareConfigModel2 = (SystemShareConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ttop_system_share_to_dm_panel_new_ui", SystemShareConfigModel.class, systemShareConfigModel);
            return systemShareConfigModel2 != null ? systemShareConfigModel2 : systemShareConfigModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ;
        }
    }

    public static final class SystemShareConfigModel {

        @C09CT("dm_share_message")
        public final String messageBgImageUrl;

        @C09CT("dm_share_photo")
        public final String photoFgImageUrl;

        @C09CT("dm_share_video")
        public final String videoFgImageUrl;

        public SystemShareConfigModel(String str, String str2, String str3) {
            this.videoFgImageUrl = str;
            this.photoFgImageUrl = str2;
            this.messageBgImageUrl = str3;
        }
    }
}
