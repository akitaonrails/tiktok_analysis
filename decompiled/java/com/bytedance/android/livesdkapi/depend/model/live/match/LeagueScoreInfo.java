package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class LeagueScoreInfo {

    @C09CT("class_opt_out")
    public boolean classOptOut;

    @C09CT("content_text")
    public Text contentText;

    @C09CT("content_text_open")
    public Text contentTextOpen;

    @C09CT("estimated_score")
    public long estimatedScore;

    @C09CT("is_activity_period")
    public boolean isActivityPeriod;

    @C09CT("is_opt_out")
    public boolean isOptOut;

    @C09CT("left_icon")
    public ImageModel leftIcon;

    @C09CT("match_theme")
    public int matchTheme;

    @C09CT("right_icon")
    public ImageModel rightIcon;

    @C09CT("right_schema_jump_link")
    public String rightSchemaJumpLink = "";
}
