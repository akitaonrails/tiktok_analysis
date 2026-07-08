package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes24.dex */
public final class CreatorCenterURLSetting {
    public static final CreatorCenterInfoStructJsonModel LIZ = new CreatorCenterInfoStructJsonModel("sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_lynx%2Ffundamental%2Fpages%2Flive-center%2Fmain%2Ftemplate.js&hide_nav_bar=1&hide_status_bar=0&hide_loading=1&should_full_screen=1&enter_from=creator_center", "aweme://roma_redirect/?spark_page=tiktok_creator_studio_inapp", "aweme://roma_redirect/?spark_page=tiktok_creator_studio_inapp_settings");

    public static final CreatorCenterInfoStructJsonModel LIZ() {
        return (CreatorCenterInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("creator_center_inapp_url", CreatorCenterInfoStructJsonModel.class, LIZ);
    }

    public static final class CreatorCenterInfoStructJsonModel {

        @C09CT("creator_center_tool_settings_url")
        public final String creatorCenterSettingsURL;

        @C09CT("creator_center_live_entrance_url")
        public final String liveEntryURL;

        @C09CT("creator_center_tool_entrance_url")
        public final String toolsEntryURL;

        public CreatorCenterInfoStructJsonModel(String str, String str2, String str3) {
            this.liveEntryURL = str;
            this.toolsEntryURL = str2;
            this.creatorCenterSettingsURL = str3;
        }
    }
}
