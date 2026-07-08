package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoInfoModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("im_gpt_bot_id")
    public final String botId;

    @C09CT("im_gpt_bot_name")
    public final String botName;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("im_enable_tikbot_disclaimer_dialog")
    public final Boolean enableDisclaimer;

    @C09CT("feed_enable_show_tikbot_entrance")
    public final Boolean enableFeedEntrance;

    @C09CT("feed_sug_preload_time_threshold")
    public final Integer feedSugPreloadTimeThreshold;

    @C09CT("tako_help_page_url")
    public final String helpPageUrl;

    public TakoInfoModel() {
        this(Boolean.FALSE, Boolean.FALSE, null, null, Boolean.TRUE, null, 72);
    }

    public TakoInfoModel(Boolean bool, Boolean bool2, String str, String str2, Boolean bool3, String str3, Integer num) {
        this.enable = bool;
        this.enableFeedEntrance = bool2;
        this.botId = str;
        this.botName = str2;
        this.enableDisclaimer = bool3;
        this.helpPageUrl = str3;
        this.feedSugPreloadTimeThreshold = num;
    }
}
