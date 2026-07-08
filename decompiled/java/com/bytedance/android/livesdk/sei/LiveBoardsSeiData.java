package com.bytedance.android.livesdk.sei;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LiveBoardsSeiData {

    @C09CT("ai_summary_board_content")
    public final String aiSummaryContent;

    @C09CT("live_boards_anchor_id")
    public final String anchorId;

    @C09CT("live_boards_type")
    public final String bizType;

    @C09CT("live_boards_id")
    public final String boardId;

    @C09CT("board_items")
    public final List<BoardItemSeiData> boardItems;

    @C09CT("live_events_board_source")
    public final String boardSource;

    @C09CT("live_events_board_type")
    public final String boardType;

    @C09CT("generate_version")
    public final String generateVersion;

    @C09CT("queue_user_type")
    public final String queueUserType;

    @C09CT("queue_viewers_cnt")
    public final String queueViewersCnt;

    @C09CT("live_boards_rec_template_id")
    public final String recTemplateId;

    @C09CT("live_boards_room_id")
    public final String roomId;

    @C09CT("stream_h")
    public final Integer streamHeight;

    @C09CT("stream_w")
    public final Integer streamWidth;

    @C09CT("live_boards_apply_timestamp")
    public final String timestamp;

    public LiveBoardsSeiData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public LiveBoardsSeiData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, Integer num2, List<BoardItemSeiData> list) {
        this.boardId = str;
        this.roomId = str2;
        this.anchorId = str3;
        this.boardType = str4;
        this.boardSource = str5;
        this.timestamp = str6;
        this.bizType = str7;
        this.queueUserType = str8;
        this.queueViewersCnt = str9;
        this.aiSummaryContent = str10;
        this.recTemplateId = str11;
        this.generateVersion = str12;
        this.streamWidth = num;
        this.streamHeight = num2;
        this.boardItems = list;
    }
}
