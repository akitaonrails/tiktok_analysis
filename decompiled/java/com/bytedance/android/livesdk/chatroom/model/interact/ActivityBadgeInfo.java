package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityBadgeInfo {

    @C09CT("badge_text")
    public LinkmicDisplayText badgeText;

    @C09CT("badge_text_dark")
    public LinkmicDisplayText badgeTextDark;

    @C09CT("background_color")
    public String backgroundColor = "";

    @C09CT("background_color_dark")
    public String backgroundColorDark = "";

    @C09CT("event_trace")
    public Map<String, String> eventTrace = new LinkedHashMap();
}
