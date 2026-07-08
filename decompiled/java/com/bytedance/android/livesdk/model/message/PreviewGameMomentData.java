package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewGameMomentData {

    @C09CT("content")
    public Text content;

    @C09CT("event_time")
    public long eventTime;

    @C09CT("game_moment_message_type")
    public int gameMomentMessageType;

    @C09CT("game_tag_id")
    public long gameTagId;

    @C09CT("game_tag_name")
    public Text gameTagName;

    @C09CT("max_time")
    public long maxTime;

    @C09CT("moment_unique_id")
    public String momentUniqueId = "";

    @C09CT("preview_game_info_type")
    public int previewGameInfoType;
}
