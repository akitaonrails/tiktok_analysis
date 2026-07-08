package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerRivalsResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("viewer_rivals_panel_banner")
        public ViewerRivalsPanelBanner viewerRivalsPanelBanner;

        @C09CT("following_list")
        public List<Room> followingList = new ArrayList();

        @C09CT("top_suggested_list")
        public List<Room> topSuggestedList = new ArrayList();

        @C09CT("rival_extra_infos")
        public Map<String, RivalExtraInfo> rivalExtraInfos = new LinkedHashMap();

        @C09CT("user_voted_list")
        public List<String> userVotedList = new ArrayList();
    }
}
