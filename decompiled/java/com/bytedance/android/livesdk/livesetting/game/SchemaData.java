package com.bytedance.android.livesdk.livesetting.game;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class SchemaData {
    public static final TypeAdapter ADAPTER;

    @C09CT("guessing_faq")
    public String guessingFaq = "";

    @C09CT("creator_guide")
    public String creatorGuide = "";

    @C09CT("creator_guide_pin")
    public String creatorGuidePin = "";

    @C09CT("creator_guessing_create")
    public String creatorGuessingCreate = "";

    @C09CT("creator_guessing_records")
    public String creatorGuessingRecords = "";

    @C09CT("creator_ranking")
    public String creatorRanking = "";

    @C09CT("user_guide")
    public String userGuide = "";

    @C09CT("user_points_claim")
    public String userPointsClaim = "";

    @C09CT("user_points_using")
    public String userPointsUsing = "";

    @C09CT("user_points_detail")
    public String userPointsDetail = "";

    @C09CT("user_guessing_records")
    public String userGuessingRecords = "";

    @C09CT("user_guessing_join")
    public String userGuessingJoin = "";

    @C09CT("user_guessing")
    public String userGuessing = "";

    @C09CT("user_guessing_room_records")
    public String userGuessingRoomRecords = "";

    @C09CT("guessing_short_touch")
    public String guessingShortTouch = "";

    @C09CT("guessing_indicator")
    public String guessingIndicator = "";

    @C09CT("user_guessing_pin")
    public String guessingPinCard = "";

    static {
        NormalGson.singleton();
        ADAPTER = new SchemaData_OptTypeAdapter();
    }
}
