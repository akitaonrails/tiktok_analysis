package com.bytedance.android.livesdk.chatroom;

import X.C0163003d;
import X.C11NZ;
import X.C470590Icr;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatEmojiListData;
import com.bytedance.android.livesdk.chatroom.model.ChatExtra;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public interface CommentApi {
    @InterfaceC1501160pAQ("/webcast/room/chat_emoji_list/")
    C11NZ<C470590Icr<ChatEmojiListData>> queryChatEmojiList(@InterfaceC1501070pAH("emoji_count") long j);

    @InterfaceC1501160pAQ("/webcast/room/quick_chat_list/")
    C11NZ<C470590Icr<C0163003d>> queryQuickComments(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("is_subscribing") boolean z, @InterfaceC1501070pAH("scenes_list") String str, @InterfaceC1501070pAH("extra") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/screen_chat/")
    C11NZ<C470590Icr<Barrage>> sendBarrage(@InterfaceC1501150pAP HashMap<String, String> map);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/chat/event/")
    C11NZ<C470590Icr<Void>> sendChatEvent(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("event") int i);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/emote_chat/")
    C11NZ<C470590Icr<EmoteChatResult>> sendEmote(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("emote_id_list") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/room/chat/")
    C11NZ<BaseResponse<ChatResult, ChatExtra>> sendTextMessage(@InterfaceC1501150pAP HashMap<String, String> map);
}
