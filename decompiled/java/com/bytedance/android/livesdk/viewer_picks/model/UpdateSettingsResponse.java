package com.bytedance.android.livesdk.viewer_picks.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class UpdateSettingsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("auto_start")
        public boolean autoStart;

        @C09CT("display_mode")
        public int displayMode;

        @C09CT("enable_auto_restart")
        public boolean enableAutoRestart;

        @C09CT("extra")
        public ProfileExtra extra;

        @C09CT("has_duration")
        public boolean hasDuration;

        @C09CT("has_score")
        public boolean hasScore;

        @C09CT("imported_template_id")
        public long importedTemplateId;

        @C09CT("round_duration_sec")
        public long roundDurationSec;

        @C09CT("gift_pick_list")
        public List<GiftPickWithStatus> giftPickList = new ArrayList();

        @C09CT("imported_template_name")
        public String importedTemplateName = "";
    }
}
