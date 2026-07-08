package com.ss.android.ugc.aweme.tako.botpage.components.csi;

import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class InspirationParams {

    @C09CT("bot_id")
    public final long botId;

    @C09CT("bot_type")
    public final String botType;

    @C09CT("card_type")
    public final String cardType;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_method")
    public final String enterMethod;

    @C09CT("has_tracker_shoot_event")
    public final boolean hasTrackerShootEvent;

    @C09CT("inspiration_result_id")
    public final String inspirationResultId;

    @C09CT("inspiration_session_id")
    public final String inspirationSessionId;

    @C09CT("inspiration_type")
    public final String inspirationType;

    @C09CT("is_inspiration_scene")
    public final String isInspirationScene;

    @C09CT("message_id")
    public final String messageId;

    @C09CT("process_id")
    public final String processId;

    @C09CT("shoot_way")
    public final String shootWay;

    @C09CT("source")
    public final String source;

    @C09CT("tag_id")
    public final String tagId;

    public InspirationParams() {
        this("", "", "", "[\"search\"]", "", "creator_search_insight", "challenge", "1", false, "", "", 0L, "", "csi", "create_button");
    }

    public InspirationParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, long j, String str11, String str12, String str13) {
        this.inspirationResultId = str;
        this.enterFrom = str2;
        this.enterMethod = str3;
        this.inspirationType = str4;
        this.tagId = str5;
        this.source = str6;
        this.shootWay = str7;
        this.isInspirationScene = str8;
        this.hasTrackerShootEvent = z;
        this.inspirationSessionId = str9;
        this.processId = str10;
        this.botId = j;
        this.messageId = str11;
        this.botType = str12;
        this.cardType = str13;
    }
}
