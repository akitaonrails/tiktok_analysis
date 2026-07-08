package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameDetailHeaderInfo {

    @C09CT("activity_end_time")
    public long activityEndTime;

    @C09CT("activity_start_time")
    public long activityStartTime;

    @C09CT("activity_type")
    public int activityType;

    @C09CT("display_priority")
    public int displayPriority;

    @C09CT("game_detail_header_cta")
    public GameDetailHeaderCTA gameDetailHeaderCta;

    @C09CT("header_image_type")
    public int headerImageType;

    @C09CT("header_id")
    public String headerId = "";

    @C09CT("header_image_url")
    public String headerImageUrl = "";

    @C09CT("header_image_theme_color")
    public String headerImageThemeColor = "";

    @C09CT("activity_title")
    public String activityTitle = "";

    @C09CT("props_list")
    public List<GameDetailHeaderProps> propsList = new ArrayList();

    @C09CT("biz_id")
    public String bizId = "";
}
