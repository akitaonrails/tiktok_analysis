package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class Badge {

    @C09CT("badge_abbr")
    public String badgeAbbr = "";

    @C09CT("badge_desc")
    public String badgeDesc = "";

    @C09CT("badge_emoji")
    public String badgeEmoji = "";

    @C09CT("badge_emojis")
    public List<BadgeLevelEmoji> badgeEmojis = new ArrayList();

    @C09CT("badge_icon")
    public ImageModel badgeIcon;

    @C09CT("badge_id")
    public long badgeId;

    @C09CT("badge_type")
    public int badgeType;
}
