package com.bytedance.android.livesdk.sei;

import X.C09CT;
import com.bytedance.android.livesdkapi.message.LiveChatMessageSEI;
import com.bytedance.android.livesdkapi.message.LiveChatMsgSequenceSEI;
import com.bytedance.android.livesdkapi.message.LiveMessageSEI;
import com.google.gson.k;

/* JADX INFO: loaded from: classes16.dex */
public final class LiveSeiStruct {
    public SeiAppData LIZ;
    public VoiceChatSeiAppData LIZIZ;
    public LinkMicSei LIZJ;

    @C09CT("close_preview")
    public String closePreview;

    @C09CT("cohost_subtitle")
    public k coHostSubtitle;

    @C09CT("live_boards_sei")
    public LiveBoardsSeiData liveBoardsSeiData;

    @C09CT("live_chat_message_delay")
    public LiveChatMessageSEI liveChatMessageSEI;

    @C09CT("chat_msg_cons")
    public LiveChatMsgSequenceSEI liveChatMsgSequenceSEI;

    @C09CT("ktv_sei")
    public LiveKaraokeSeiData liveKaraokeSeiData;

    @C09CT("lets_dance_sei")
    public LiveLetsDanceSeiData liveLetsDanceSeiData;

    @C09CT("live_message_sei")
    public LiveMessageSEI liveMessageSEI;

    @C09CT("live_sei_mute_mic")
    public LiveSeiMuteMic liveSeiMuteMic;

    @C09CT("magic_gesture_activity_sei")
    public MagicGestureActivitySei magicGestureActivitySei;

    @C09CT("live_catch_bean_final_score")
    public MatchGameSeiInfo matchGameFinalScore;

    @C09CT("live_catch_bean_update_score")
    public MatchGameSeiInfo matchGameUpdateInfo;

    @C09CT("plb")
    public SeiPlaybookExtra playbookSeiData;

    @C09CT("sub_only_live")
    public String subOnlyLive;

    @C09CT("mg_t")
    public TicketInfoExtra ticketSeiData;

    @C09CT("ts")
    public Long ts;

    @C09CT("ttls_live_scene")
    public String ttlsLiveScene;
}
