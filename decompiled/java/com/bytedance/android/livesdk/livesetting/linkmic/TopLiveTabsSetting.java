package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "gbl_top_live_tabs")
public final class TopLiveTabsSetting {
    public static final TopLiveTabsSetting INSTANCE = new TopLiveTabsSetting();
    public static final List<TopLiveTab> DEFAULT = C1697810uHb.LJIIJJI(new TopLiveTab("discover", "ttlive_mutliTopLIVE_tabName_discover"), new TopLiveTab("hangout", "ttlive_mutliTopLIVE_tabName_hangout"));

    public static final class TopLiveTab {
        public static final TypeAdapter ADAPTER;

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public String id;

        @C09CT("title")
        public String title;

        static {
            NormalGson.singleton();
            ADAPTER = new TopLiveTabsSetting_TopLiveTab_OptTypeAdapter();
        }

        public TopLiveTab() {
            this("", "");
        }

        public TopLiveTab(String str, String str2) {
            this.id = str;
            this.title = str2;
        }
    }

    public static final List<TopLiveTab> getTopLiveTabs() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<TopLiveTab> list = DEFAULT;
        List<TopLiveTab> list2 = (List) settingsManager.getValueSafely("gbl_top_live_tabs", list);
        return list2 != null ? list2 : list;
    }
}
