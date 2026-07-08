package webcast.api.sub;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ExclusiveContent {

    @C09CT("creator_chat_room_num")
    public long creatorChatRoomNum;

    @C09CT("should_show_creator_chat_room")
    public boolean shouldShowCreatorChatRoom;

    @C09CT("should_show_sub_only_live")
    public boolean shouldShowSubOnlyLive;

    @C09CT("should_show_sub_only_live_chat")
    public boolean shouldShowSubOnlyLiveChat;

    @C09CT("sub_only_chat_cnt")
    public long subOnlyChatCnt;

    @C09CT("sub_only_live_cnt")
    public long subOnlyLiveCnt;

    @C09CT("sub_only_live_desc_content")
    public String subOnlyLiveDescContent = "";

    @C09CT("sub_only_chat_desc_content")
    public String subOnlyChatDescContent = "";

    @C09CT("exclusive_content_icons")
    public Map<String, ExclusiveContentIconInfos> exclusiveContentIcons = new LinkedHashMap();
}
