package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class PlayTogetherPinCardView {

    @C09CT("duration")
    public long duration;

    @C09CT("min_duration_time")
    public long minDurationTime;

    @C09CT("pin_card_content")
    public Text pinCardContent;

    @C09CT("pin_card_type")
    public int pinCardType;

    @C09CT("end_timestamp_str")
    public String endTimestampStr = "";

    @C09CT("version_code_str")
    public String versionCodeStr = "";
}
