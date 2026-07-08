package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class MGetTranslationRequest {

    @C09CT("anchor_id")
    public long anchorId;

    @C09CT("room_id")
    public long roomId;

    @C09CT("sec_anchor_id")
    public String secAnchorId = "";

    @C09CT("texts")
    public List<Text> texts = C13BV.INSTANCE;

    public static final class Text {

        @C09CT("msg_id")
        public long msgId;

        @C09CT("room_message_heat_level")
        public long roomMessageHeatLevel;

        @C09CT("text_source")
        public int textSource;

        @C09CT("text")
        public String text = "";

        @C09CT("at_username")
        public String atUsername = "";

        @C09CT("at_nickname")
        public String atNickname = "";

        @C09CT("emotes_index")
        public String emotesIndex = "";
    }
}
